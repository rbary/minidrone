/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Obeo - initial API and implementation
 * 
 */

package fr.obeo.dsl.minidrone.ui.wizard;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Maps;

import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.ui.MinidroneUiActivator;

public class MinidroneDesignerWizard extends Wizard implements INewWizard {

	protected MainPage mainPage;

	public MinidroneDesignerWizard() {
		super();
	}

	@Override
	public void addPages() {
		mainPage = new MainPage();
		addPage(mainPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.init(workbench, selection);
		setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {
		final IProgressMonitor monitor = new NullProgressMonitor();
		
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				// closing opened representations/projects
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeAllEditors(true);
				IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
				try {
					for (IProject project : projects) {
						project.delete(false, true, monitor);
					}
				} catch (CoreException e) {
					MinidroneUiActivator.log(Status.ERROR, "Project deletion failed", e);
				}
			}
		});

		try {
			final IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(mainPage.getProjectName().getText(), true,
					monitor);

			Option<ModelingProject> modelingProjectOption = ModelingProject.asModelingProject(project);

			if (modelingProjectOption.some()) {
				ModelingProject modelingProject = modelingProjectOption.get();
				final Session session = modelingProject.getSession();
				session.getTransactionalEditingDomain().getCommandStack()
						.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

							@Override
							protected void doExecute() {

								// semantic step
								String semanticModelPath = project.getProject().getFullPath().toString()
										+ IPath.SEPARATOR + mainPage.getProjectName().getText() + ".minidrone";
								final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
								Resource res = new ResourceSetImpl().createResource(semanticModelURI);

								// Add the model root object
								final MiniDroneProgram rootModelObject = MiniDroneFactory.eINSTANCE
										.createMiniDroneProgram();
								
								// set a name for the root model object (todo)
								rootModelObject.setMinidroneName(mainPage.getProjectName().getText());
								

								if (rootModelObject != null) {
									res.getContents().add(rootModelObject);
								}
								try {
									res.save(Maps.newHashMap());
								} catch (IOException e) {
									MinidroneUiActivator.log(Status.ERROR, "Modeling project initialization failed", e);
								}
								
								// add a semantic resource to the graphic editor 
								session.addSemanticResource(semanticModelURI, monitor);

								enableViewpoints(monitor, session, "Design");
							   
	                           session.save(monitor);
							   
							   Collection<DRepresentation> representations = DialectManager.INSTANCE
										.getAllRepresentations(session);
							   for (DRepresentation representation : representations) {
									if (representation.getName().equals("MiniDrone Program Diagram")) {
										representation.setName(mainPage.getProjectName().getText());
										DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
										return;
									}
							   }
							   
							}
						}

				);

			}

		} catch (CoreException e) {
			MinidroneUiActivator.log(Status.ERROR, "Project creation failed", e);
		}
		return true;
	}
	
	/**
	 * enable all the available viewpoints
	 * @param monitor
	 * @param session
	 * @param viewpointsToActivate
	 */
	private static void enableViewpoints(final IProgressMonitor monitor, final Session session,
			final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack().execute(
					new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback vpsCallback = new ViewpointSelectionCallback();
							
							for(Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()){
								for (String viewpoint : viewpointsToActivate) {
									if(viewpoint.equals(vp.getName()))
										vpsCallback.selectViewpoint(vp, session, monitor);
								}
							}
						}
					});
		}
	}
}

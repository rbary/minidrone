/**
 *  Copyright (c) 2016 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */

package fr.obeo.dsl.minidrone.ui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.gen.main.Generate;
import fr.obeo.dsl.minidrone.ui.MinidroneUiActivator;

/**
 * Services about minidrone program code generation, and other
 * 
 * @author rbary
 */
public class MinidroneServices {

	/***
	 * Called to generate a code to be compiled for piloting minidrone
	 * 
	 * @param minidroneProgram
	 * @return File
	 *
	 */
	public File generateCode(MiniDroneProgram minidroneProgram) {

		// retrieve the minidrone model file
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(minidroneProgram.eResource().getURI().toPlatformString(true)));

		// create a new folder where we'll generate the code
		IFolder folder = file.getProject().getFolder("gencode");
		File genOutputFolder = folder.getRawLocation().makeAbsolute().toFile();

		try {
			// perform a acceleo C generation in the output folder
			Generate generator = new Generate(minidroneProgram.eResource().getURI(), genOutputFolder,
					new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			MinidroneUiActivator.log(Status.ERROR, "Code generation failed", e);
		}

		return genOutputFolder;
	}

	/**
	 * Called to get MinidroneDrone program instance from the current session
	 * 
	 * @return
	 */
	public MiniDroneProgram getMinidroneProgram() {
		
		// retrieve the graphic editor current session
		Session session = getSession();

		if (session != null) {
			// get all the semantic resources relating to the session
			Collection<Resource> resources = session.getSemanticResources();
			
			// get the MinidroneProgram semantic resource (Assumed to be the first element of the collection)
			if (resources.size() != 0) {
				Resource resource = (Resource) resources.toArray()[0];
				List<EObject> contents = resource.getContents();

				if (contents != null && contents.size() != 0) {
					return (MiniDroneProgram) contents.get(0);
				}
			}
		}
		return null;
	}

	/**
	 * Called to synchronize the minidrone program generated with the minidrone
	 * (upload program)
	 * 
	 * @param minidroneProgram
	 */
	public void sync(MiniDroneProgram minidroneProgram) {
		
		// code generation
		File genOutputFolder = generateCode(minidroneProgram);
		
		String compilePath = genOutputFolder.toString();	
		String make_clean_command = "make clean -C " + compilePath;
		String make_command = "make -C " + compilePath;
		String make_run_command = "make run -C " + compilePath;
		
		// perform a make clean command on the C program folder
		executeCommand(make_clean_command);
		
		// perform a make command on the C program folder
		executeCommand(make_command);
		
		// perform a make run command on the C program folder
		executeCommand(make_run_command);
	}

	/**
	 * Called to execute a unix system command
	 * @param command
	 * @return String
	 */
	public String executeCommand(String command) {
		
		StringBuffer output = new StringBuffer();
		Process p;
		
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";

			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			MinidroneUiActivator.log(Status.ERROR, "Command execution failed", e);
		}
		return output.toString();
	}

	/**
	 * Called to retrieve the current session of the graphic editor
	 * @return Session
	 */
	public Session getSession() {
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		if (sessions.size() > 0) {
			return (Session) sessions.toArray()[0];
		}
		return null;
	}
}
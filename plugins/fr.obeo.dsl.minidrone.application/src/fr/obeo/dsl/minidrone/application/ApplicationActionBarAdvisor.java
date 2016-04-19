package fr.obeo.dsl.minidrone.application;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private static final String[] actionSetId = new String[] { "org.eclipse.ui.WorkingSetActionSet",
			"org.eclipse.ui.externaltools",
			"org.eclipse.core.externaltools",
			"org.eclipse.ui.externaltools.ExternalToolMenuDelegateToolbar",
			"org.eclipse.ui.externaltools.ExternalToolsSet",
			"org.eclipse.ui.edit.text.actionSet.navigation",
			"org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo", 
			"org.eclipse.ui.actionSet.openFiles",
			"org.eclipse.ui.edit.text.actionSet.annotationNavigation", 
			"org.eclipse.ui.NavigationActionSet",
			"org.eclipse.search.searchActionSet" };

	private void removeUnWantedActions() {
		ActionSetRegistry actionSetRegistry = WorkbenchPlugin.getDefault().getActionSetRegistry();
		IActionSetDescriptor[] actionSets = actionSetRegistry.getActionSets();

		IExtension extension = null;
		for (IActionSetDescriptor actionSet : actionSets) {
			for (String element : actionSetId) {
				System.out.println(element);

				if (element.equals(actionSet.getId())) {
					extension = actionSet.getConfigurationElement().getDeclaringExtension();
					actionSetRegistry.removeExtension(extension, new Object[] { actionSet });
				}
			}
		}
	}

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
		removeUnWantedActions();
	}

	protected void makeActions(IWorkbenchWindow window) {
	}

	protected void fillMenuBar(IMenuManager menuBar) {
	}
}

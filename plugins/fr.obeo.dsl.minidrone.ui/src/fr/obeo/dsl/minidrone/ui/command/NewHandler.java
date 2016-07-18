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

package fr.obeo.dsl.minidrone.ui.command;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import fr.obeo.dsl.minidrone.ui.wizard.MinidroneDesignerWizard;


public class NewHandler extends AbstractHandler {
	//private String ProjectName;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("New Handler");
		
		// call the wizard to retrieve some data about the project creation
		WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().
				getActiveWorkbenchWindow().getShell(), new MinidroneDesignerWizard());
		if (wizardDialog.open() == Window.OK) {
			System.out.println("MinidroneDesignerWizard opened");
		} else {
			System.out.println("MinidroneDesignerWizard opening failed");
		}
		return null;
	}
}

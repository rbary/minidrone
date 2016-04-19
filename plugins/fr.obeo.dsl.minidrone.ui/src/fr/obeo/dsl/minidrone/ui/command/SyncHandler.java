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

import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.ui.utils.MinidroneServices;

public class SyncHandler extends AbstractHandler {
	
	MinidroneServices minidroneService = new MinidroneServices();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Sync handler");
		
		MiniDroneProgram minidroneProgram = minidroneService.getMinidroneProgram();
		
		if(minidroneProgram != null){
			minidroneService.sync(minidroneProgram);
		}		
		return null;
	}
}

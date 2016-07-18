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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;

public class MainPage extends WizardPage {
	private Composite container;
	private Text projectName;
	private Label projectNameLabel;
	
	public MainPage() {
		super("Create a new minidrone program design project");
		setTitle("Minidrone project");
		setDescription("Create a new minidrone program design project");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		
		// set the label
		projectNameLabel = new Label(container, INFORMATION);
		projectNameLabel.setText("Project name : ");
		
		// set the Text in the container
		projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectName.setText("");
		projectName.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (!projectName.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		projectName.setLayoutData(gridData);
		
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);
	}

	public Text getProjectName() {
		return projectName;
	}

	public void setProjectName(Text projectName) {
		this.projectName = projectName;
	}
}

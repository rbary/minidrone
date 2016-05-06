/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package fr.obeo.dsl.minidrone.design.tests;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.ecore.extender.tool.api.ModelUtils;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.sirius.viewpoint.description.Group;
import org.junit.Before;
import org.junit.Test;


/**
 * 
 * Check the VSM validation
 *
 */
public class VsmValidationTests {
	private Group minidroneModeler;

	/**
	 * Retrieve the VSM before testing
	 * 
	 * @throws Exception
	 */
	@Before
	public void setup() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		minidroneModeler = (Group) ModelUtils.load(
				URI.createPlatformPluginURI("/fr.obeo.dsl.minidrone.design/description/minidrone.odesign", true),
				resourceSet);

	}

	/**
	 * Validation test on the VSM to check whether there is no error when
	 * validate VSM.
	 */
	@Test
	public void isValid() {
		Diagnostician diagnostican = new Diagnostician();
		Diagnostic diagnostic = diagnostican.validate(minidroneModeler);
		switch (diagnostic.getSeverity()) {
		case Diagnostic.ERROR:
			fail("The VSM is not valid due to theses errors : " + diagnostic);
		case Diagnostic.WARNING:
			fail("The VSM is not valid due to theses warnings : " + diagnostic);
			break;
		}
	}
}

/*******************************************************************************
 * Copyright (c) 201 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package fr.obeo.dsl.minidrone.design.tests;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;

@RunWith(value = Parameterized.class)
public class InterpretedExpressionTests {

	private InterpretedExpression underTest;

	public InterpretedExpressionTests(InterpretedExpression expression) {
		this.underTest = expression;
	}

	@Parameters
	public static Collection<Object[]> data() {
		List<Object[]> parameters = Lists.newArrayList();
		SortedMultiset<String> allExpressions = TreeMultiset.create();
		collectExpressionFromMinidroneDesignerViewpoints(parameters, allExpressions, "Design");
		for (String expr : allExpressions.elementSet()) {
			System.out.println(allExpressions.count(expr) + " : " + expr);
		}
		return parameters;
	}

	private static void collectExpressionFromMinidroneDesignerViewpoints(List<Object[]> parameters,
			SortedMultiset<String> allExpressions, String vpName) {
		Viewpoint structural = ViewpointRegistry.getInstance()
				.getViewpoint(URI.createURI("viewpoint:/fr.obeo.dsl.minidrone.design/" + vpName));
		collectExpressionsFromViewpoint(parameters, structural, allExpressions);
	}

	private static void collectExpressionsFromViewpoint(List<Object[]> parameters, Viewpoint structural,
			SortedMultiset<String> allExpressions) {
		Iterator<EObject> it = structural.eAllContents();
		while (it.hasNext()) {
			EObject underTest = it.next();
			for (EAttribute attr : underTest.eClass().getEAllAttributes()) {
				if (attr.getEType() == DescriptionPackage.eINSTANCE.getInterpretedExpression()) {
					Object expr = underTest.eGet(attr);
					if (expr instanceof String && ((String) expr).length() > 0) {
						parameters.add(new Object[] { new InterpretedExpression((String) expr, underTest, attr) });
						allExpressions.add((String) expr);
					}
				}
			}
		}
	}
	
	@Test
	public void isNotAcceleo2() {
		if (underTest.getExpression().indexOf("<%") > -1) {
			fail("Expression : " + underTest.getExpression() + " is Acceleo2, on attribute :"
					+ underTest.getFeature().getName() + " of object " + EcoreUtil.getURI(underTest.getDeclaration()));
		}
	}

	@Test
	public void isNotMTL() {
		if (underTest.getExpression().indexOf("[") > -1) {
			fail("Expression : " + underTest.getExpression() + " is MTL, on attribute :"
					+ underTest.getFeature().getName() + " of object " + EcoreUtil.getURI(underTest.getDeclaration()));
		}
	}
	
	@Test
	public void isAQLorSpecificInterpreterExpressionCall(){
		ServicesTestsUtils.isAQLServiceCall(underTest.getExpression());
		ServicesTestsUtils.isSpecificInterpretedExpressionCall(underTest.getExpression());
	}
	
}

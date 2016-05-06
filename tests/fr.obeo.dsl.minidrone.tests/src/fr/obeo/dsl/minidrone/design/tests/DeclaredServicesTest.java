package fr.obeo.dsl.minidrone.design.tests;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

/**
 * Check whether declared service in a java extension is referenced from a VSM
 * interpreted expression
 */

@RunWith(value = Parameterized.class)
public class DeclaredServicesTest {

	private Method underTest;

	// get all services called from the vsm
	private static Set<String> allServiceCalls = new HashSet<String>();

	public DeclaredServicesTest(Method method) {
		this.underTest = method;
	}

	@Parameters
	public static Collection<Object[]> data() {
		List<Object[]> parameters = Lists.newArrayList();

		// retrieve all declared services
		Set<Method> allDeclaredServices = new HashSet<Method>();
		ServicesTestsUtils.collectDeclaredServicesFromMinidroneDesignerViewpoints(allDeclaredServices);

		// Get all services called from interpreted expression (yellow fields in
		// the design)
		Set<InterpretedExpression> allServiceExpressions = new HashSet<InterpretedExpression>();
		ServicesTestsUtils.collectServiceExpressionFromMinidroneDesignerViewpoints(allServiceExpressions);
		for (InterpretedExpression serviceExpression : allServiceExpressions) {
			allServiceCalls.add(ServicesTestsUtils.getServiceCall(serviceExpression.getExpression()));
		}

		allServiceCalls.addAll(ServicesTestsUtils.siriusWhiteList);
		allServiceCalls.addAll(ServicesTestsUtils.acceleoWhiteList);

		for (Method method : allDeclaredServices) {
			parameters.add(new Object[] { method });
		}
		return parameters;
	}

	@Test
	public void isUnusedDeclaredService() {
		if (!allServiceCalls.contains(underTest.getName())) {
			fail("Declared service " + underTest + "is not referenced by the odesign");
		}

	}

}

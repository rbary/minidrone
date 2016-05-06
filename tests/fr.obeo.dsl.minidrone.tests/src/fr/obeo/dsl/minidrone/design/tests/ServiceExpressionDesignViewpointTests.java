package fr.obeo.dsl.minidrone.design.tests;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;


/**
 * 
 * Check if a service called from a interpreted expression exists.
 *
 */
@RunWith(value = Parameterized.class)
public class ServiceExpressionDesignViewpointTests {
	private InterpretedExpression underTest;

	private static Set<String> allServices = new HashSet<String>();

	public ServiceExpressionDesignViewpointTests(InterpretedExpression expression) {
		super();
		this.underTest = expression;
	}

	private final static String VP_NAME = "Design";

	@Parameters
	public static Collection<Object[]> data() {

		List<Object[]> parameters = Lists.newArrayList();

		// Getting all declared services
		Set<Method> allDeclaredMethods = new HashSet<Method>();
		ServicesTestsUtils.collectDeclaredServicesFromMinidroneDesignerViewpoint(allDeclaredMethods, VP_NAME);
		for (Method method : allDeclaredMethods) {
			allServices.add(method.getName());
		}

		// Getting all services called from interpreted expressions
		Set<InterpretedExpression> allServiceExpressions = new HashSet<InterpretedExpression>();
		ServicesTestsUtils.collectServiceExpressionFromMinidroneDesignerViewpoint(allServiceExpressions, VP_NAME);
		for (InterpretedExpression interpretedExpression : allServiceExpressions) {
			parameters.add(new Object[] { interpretedExpression });
		}
		return parameters;

	}

	@Test
	public void isValidService() {
		String expression = underTest.getExpression();
		String service = ServicesTestsUtils.getServiceCall(expression);

		if (service != null && !allServices.contains(service)) {
			fail("The following expression :" + underTest.getExpression()
					+ "refers to an invalid service :" + service + " See :"
					+ underTest.getFeature().getName() + " of object "
					+ EcoreUtil.getURI(underTest.getDeclaration()));
		}
	}

}

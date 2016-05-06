package fr.obeo.dsl.minidrone.design.tests;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.JavaExtension;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import com.google.common.collect.Sets;

public class ServicesTestsUtils {

	private static final String VP_DESIGN = "Design";

	private static final String MINIDRONE_VP_URI = "viewpoint:/fr.obeo.dsl.minidrone.design/";

	public static Set<String> acceleoWhiteList = Sets.newHashSet("->", "eContainer", "toLowerFirst", "toUpperFirst",
			"not", "eClass", "eAllContents", "eContents", "equalsIgnoreCase");

	public static Set<String> siriusWhiteList = Sets.newHashSet("getTarget", "getHierarchicalContainerView");

	// Utilities for declared services
	public static void collectDeclaredServicesFromMinidroneDesignerViewpoints(Set<Method> allDeclaredServices) {
		collectDeclaredServicesFromDesignerViewpoints(allDeclaredServices, MINIDRONE_VP_URI, VP_DESIGN);
	}

	public static void collectDeclaredServicesFromDesignerViewpoints(Set<Method> allDeclaredServices, String vpUri,
			String vpName) {
		Set<JavaExtension> allExtensions = new HashSet<JavaExtension>();
		collectJavaExtensionsFromDesignerViewpoints(vpUri, vpName, allExtensions);
		for (JavaExtension extension : allExtensions) {
			try {
				@SuppressWarnings("rawtypes")
				Class clazz = Class.forName(extension.getQualifiedClassName());
				for (Method method : clazz.getDeclaredMethods()) {
					if (method.getModifiers() == Modifier.PUBLIC) {
						allDeclaredServices.add(method);
					}

				}
			} catch (ClassNotFoundException e) {
				// Nothing to do, this is checked by the {@link
				// JavaExtensionTests}
			}
		}
	}

	public static void collectDeclaredServicesFromMinidroneDesignerViewpoint(Set<Method> allDeclaredServices,
			String viewpointName) {
		Set<JavaExtension> allExtensions = new HashSet<JavaExtension>();
		collectJavaExtensionsFromMinidroneDesignerViewpoint(allExtensions, viewpointName);
		for (JavaExtension extension : allExtensions) {
			try {
				@SuppressWarnings("rawtypes")
				Class clazz = Class.forName(extension.getQualifiedClassName());
				for (Method method : clazz.getDeclaredMethods()) {
					if (method.getModifiers() == Modifier.PUBLIC) {
						allDeclaredServices.add(method);
					}
				}
			} catch (ClassNotFoundException e) {
				// Nothing to do, this is checked by the {@link
				// JavaExtensionTests}
			}
		}
	}

	public static void collectServicesFromDesignerViewpoint(Set<Method> allServices, String vpName, String vpUri) {
		Set<JavaExtension> allExtensions = new HashSet<JavaExtension>();
		collectJavaExtensionsFromDesignerViewpoints(vpUri, vpName, allExtensions);
		for (JavaExtension extension : allExtensions) {
			try {
				@SuppressWarnings("rawtypes")
				Class clazz = Class.forName(extension.getQualifiedClassName());
				for (Method method : clazz.getMethods()) {
					if (method.getModifiers() == Modifier.PUBLIC) {
						allServices.add(method);
					}
				}
			} catch (ClassNotFoundException e) {
				// Nothing to do, this is checked by the {@link
				// JavaExtensionTests}
			}
		}
	}
	
	public static void collectServicesFromMinidroneDesignerViewpoint(Set<Method> allServices,
			String viewpointName) {
		collectServicesFromDesignerViewpoint(allServices, viewpointName, MINIDRONE_VP_URI);
	}
	
	// Utilities for service expression
	/**
	 * 
	 * @param allExpressions
	 * @param vpUri
	 * @param vpName
	 */
	protected static void collectServiceExpressionFromDesignerViewpoints(Set<InterpretedExpression> allExpressions,
			String vpUri, String vpName) {
		Viewpoint structural = ViewpointRegistry.getInstance().getViewpoint(URI.createURI(vpUri + vpName));
		collectServiceExpressionsFromViewpoint(structural, allExpressions);
	}

	/**
	 * 
	 * @param allExpressions
	 * @param vpName
	 */
	private static void collectServiceExpressionFromMinidroneDesignerViewpoints(
			Set<InterpretedExpression> allExpressions, String vpName) {
		collectServiceExpressionFromDesignerViewpoints(allExpressions, MINIDRONE_VP_URI, vpName);
	}

	/**
	 * 
	 * @param allServiceExpressions
	 */
	public static void collectServiceExpressionFromMinidroneDesignerViewpoints(
			Set<InterpretedExpression> allServiceExpressions) {
		collectServiceExpressionFromMinidroneDesignerViewpoints(allServiceExpressions, VP_DESIGN);
	}

	/**
	 * 
	 * @param structural
	 * @param allExpressions
	 */
	private static void collectServiceExpressionsFromViewpoint(Viewpoint structural,
			Set<InterpretedExpression> allExpressions) {
		Iterator<EObject> it = structural.eAllContents();
		while (it.hasNext()) {
			EObject underTest = it.next();
			for (EAttribute attr : underTest.eClass().getEAllAttributes()) {
				if (attr.getEType() == DescriptionPackage.eINSTANCE.getInterpretedExpression()) {
					Object expr = underTest.eGet(attr);

					if (expr instanceof String && ((String) expr).length() > 0) {
						System.out.println(expr + " : " + isService(((String) expr)));
						if (isService(((String) expr)))
							allExpressions.add(new InterpretedExpression((String) expr, underTest, attr));
					}
				}
			}
		}
	}
	
	// Relating to JavaExtensions
	public static void collectJavaExtensionsFromMinidroneDesignerViewpoints(Set<JavaExtension> allExtensions) {
		collectJavaExtensionsFromMinidroneDesignerViewpoints(VP_DESIGN, allExtensions);

	}

	public static void collectJavaExtensionsFromMinidroneDesignerViewpoint(Set<JavaExtension> allExtensions,
			String viewpointName) {
		collectJavaExtensionsFromMinidroneDesignerViewpoints(viewpointName, allExtensions);
	}

	private static void collectJavaExtensionsFromMinidroneDesignerViewpoints(String vpName,
			Set<JavaExtension> allExtensions) {
		collectJavaExtensionsFromDesignerViewpoints(MINIDRONE_VP_URI, vpName, allExtensions);
	}

	protected static void collectJavaExtensionsFromDesignerViewpoints(String vpUri, String vpName,
			Set<JavaExtension> allExtensions) {
		Viewpoint structural = ViewpointRegistry.getInstance().getViewpoint(URI.createURI(vpUri + vpName));
		collectJavaExtensionsFromViewpoint(structural, allExtensions);
	}

	private static void collectJavaExtensionsFromViewpoint(Viewpoint structural, Set<JavaExtension> allExtensions) {
		allExtensions.addAll(structural.getOwnedJavaExtensions());
	}

	///////////////////////////////////////
	/**
	 * 
	 * @param expr
	 * @return
	 */
	private static boolean isService(String expr) {
		if (isAQLServiceCall(expr)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param expr
	 * @return
	 */
	public static boolean isAQLServiceCall(String expr) {
		return getAQLServiceCall(expr) != null;
	}
	
	/**
	 * 
	 * @param expr
	 * @return
	 */
	public static boolean isSpecificInterpretedExpressionCall(String expr) {
		return getSpecificInterpretedExpressionCall(expr) != null;
	}

	/**
	 * 
	 * @param expression
	 * @return
	 */
	private static String getAQLServiceCall(String expression) {
		if (expression.startsWith("aql:")) {
			String[] splitExpr = expression.split("\\.");
			for (String exprPart : splitExpr) {
				if (exprPart.matches("\\w+ *\\(.*") && !exprPart.startsWith("ocl") && !containsAcceleoKeywords(exprPart)
						&& !containsSiriusOperations(getServiceName(exprPart))) {
					return getServiceName(exprPart);
				}
			}
		}
		return null;
	}
	
	private static String getSpecificInterpretedExpressionCall(String expression) {
		if (expression.startsWith("feature:") || expression.startsWith("service:") || expression.startsWith("var:")) {
			return getServiceName(expression);
		}
		return null;
	}
	
	

	/**
	 * 
	 * @param expression
	 * @return
	 */
	private static boolean containsAcceleoKeywords(String expression) {
		for (String keywords : acceleoWhiteList) {
			if (expression.contains(keywords))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param expr
	 * @return
	 */
	private static String getServiceName(String expr) {
		if (expr.contains("(")) {
			return expr.substring(0, expr.indexOf("("));
		}
		return expr;
	}

	/**
	 * 
	 * @param expression
	 * @return
	 */
	private static boolean containsSiriusOperations(String expression) {
		for (String keywords : siriusWhiteList) {
			if (expression.equals(keywords))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param expression
	 * @return
	 */
	public static String getServiceCall(String expression) {
		if (isAQLServiceCall(expression)) {
			return getAQLServiceCall(expression);
		}
		return null;
	}

	/**
	 * 
	 * @param allServiceExpressions
	 * @param viewpointName
	 */
	public static void collectServiceExpressionFromMinidroneDesignerViewpoint(
			Set<InterpretedExpression> allServiceExpressions, String viewpointName) {
		collectServiceExpressionFromMinidroneDesignerViewpoints(allServiceExpressions, viewpointName);
	}
}

package fr.obeo.dsl.minidrone.design.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.sirius.viewpoint.description.JavaExtension;
import org.junit.Test;

/**
 * Check if a java extension referenced from the viewpoint specification exists.
 */
public class JavaExtensionTests {

	@Test
	public void existsOnlyValidJavaExtensions() {
		Set<JavaExtension> allExtensions = new HashSet<JavaExtension>();

		List<String> invalidJavaExtensions = new ArrayList<String>();
		ServicesTestsUtils.collectJavaExtensionsFromMinidroneDesignerViewpoints(allExtensions);
		for (JavaExtension extension : allExtensions) {
			try {
				Class.forName(extension.getQualifiedClassName());
			} catch (ClassNotFoundException e) {
				invalidJavaExtensions.add(e.getMessage());
			}
		}

		if (!invalidJavaExtensions.isEmpty()) {
			String message = "";
			for (String invalidJavaExtension : invalidJavaExtensions) {
				message += invalidJavaExtension + "\n";
			}
			fail("Java extensions not found : \n" + message);
		}
	}
}
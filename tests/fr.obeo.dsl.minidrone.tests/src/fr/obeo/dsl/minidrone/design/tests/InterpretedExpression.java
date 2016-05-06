package fr.obeo.dsl.minidrone.design.tests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class InterpretedExpression {
	private String expression;
	private EObject declaration;
	private EAttribute feature;
	
	public InterpretedExpression(String expression, EObject declaration, EAttribute feature){
		super();
		this.expression = expression;
		this.declaration = declaration;
		this.feature = feature;
	}


	public EObject getDeclaration() {
		return declaration;
	}
	
	public String getExpression(){
		return expression;
	}
	
	public EAttribute getFeature() {
		return feature;
	}	
}

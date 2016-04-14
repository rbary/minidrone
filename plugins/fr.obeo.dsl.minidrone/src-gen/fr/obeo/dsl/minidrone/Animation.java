/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package fr.obeo.dsl.minidrone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Animation#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends Instruction {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.AnimationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.AnimationMode
	 * @see #setMode(AnimationMode)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getAnimation_Mode()
	 * @model
	 * @generated
	 */
	AnimationMode getMode();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.Animation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.AnimationMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(AnimationMode value);

} // Animation

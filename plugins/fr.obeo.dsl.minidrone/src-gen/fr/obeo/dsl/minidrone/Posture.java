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
 * A representation of the model object '<em><b>Posture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Posture#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getPosture()
 * @model
 * @generated
 */
public interface Posture extends Instruction {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.PostureMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @see #setMode(PostureMode)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getPosture_Mode()
	 * @model
	 * @generated
	 */
	PostureMode getMode();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.Posture#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PostureMode value);

} // Posture

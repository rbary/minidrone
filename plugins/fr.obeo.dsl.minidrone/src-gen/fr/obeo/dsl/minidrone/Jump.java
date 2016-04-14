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
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A program instruction which send a jump command to the minidrone. This command is specific to the Jumping Sumo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Jump#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends Instruction {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.JumpMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The height of the jump.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.JumpMode
	 * @see #setMode(JumpMode)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getJump_Mode()
	 * @model
	 * @generated
	 */
	JumpMode getMode();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.Jump#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.JumpMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(JumpMode value);

} // Jump

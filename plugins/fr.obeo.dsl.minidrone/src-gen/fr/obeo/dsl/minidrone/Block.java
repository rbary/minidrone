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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.Block#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends AbstractInstruction {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.minidrone.AbstractInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getBlock_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInstruction> getInstructions();

} // Block

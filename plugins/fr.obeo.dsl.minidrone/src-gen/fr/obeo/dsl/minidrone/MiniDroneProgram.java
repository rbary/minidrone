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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a program allowing to pilot a minidrone (Jumping Sumo or Rolling Spider).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getMinidroneName <em>Minidrone Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getSpeedPercentage <em>Speed Percentage</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getVolumePercentage <em>Volume Percentage</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getAudioMode <em>Audio Mode</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getPostureMode <em>Posture Mode</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram()
 * @model
 * @generated
 */
public interface MiniDroneProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.minidrone.AbstractInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced instructions contained in a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInstruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Minidrone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minidrone Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minidrone Name</em>' attribute.
	 * @see #setMinidroneName(String)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_MinidroneName()
	 * @model
	 * @generated
	 */
	String getMinidroneName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getMinidroneName <em>Minidrone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minidrone Name</em>' attribute.
	 * @see #getMinidroneName()
	 * @generated
	 */
	void setMinidroneName(String value);

	/**
	 * Returns the value of the '<em><b>Speed Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Percentage</em>' attribute.
	 * @see #setSpeedPercentage(int)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_SpeedPercentage()
	 * @model id="true"
	 * @generated
	 */
	int getSpeedPercentage();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getSpeedPercentage <em>Speed Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Percentage</em>' attribute.
	 * @see #getSpeedPercentage()
	 * @generated
	 */
	void setSpeedPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Volume Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Percentage</em>' attribute.
	 * @see #setVolumePercentage(int)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_VolumePercentage()
	 * @model
	 * @generated
	 */
	int getVolumePercentage();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getVolumePercentage <em>Volume Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Percentage</em>' attribute.
	 * @see #getVolumePercentage()
	 * @generated
	 */
	void setVolumePercentage(int value);

	/**
	 * Returns the value of the '<em><b>Audio Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.AudioMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.AudioMode
	 * @see #setAudioMode(AudioMode)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_AudioMode()
	 * @model
	 * @generated
	 */
	AudioMode getAudioMode();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getAudioMode <em>Audio Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.AudioMode
	 * @see #getAudioMode()
	 * @generated
	 */
	void setAudioMode(AudioMode value);

	/**
	 * Returns the value of the '<em><b>Posture Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.minidrone.PostureMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posture Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posture Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @see #setPostureMode(PostureMode)
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getMiniDroneProgram_PostureMode()
	 * @model
	 * @generated
	 */
	PostureMode getPostureMode();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getPostureMode <em>Posture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posture Mode</em>' attribute.
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @see #getPostureMode()
	 * @generated
	 */
	void setPostureMode(PostureMode value);

} // MiniDroneProgram

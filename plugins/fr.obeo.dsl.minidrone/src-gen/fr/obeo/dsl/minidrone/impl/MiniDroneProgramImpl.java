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
package fr.obeo.dsl.minidrone.impl;

import fr.obeo.dsl.minidrone.AbstractInstruction;
import fr.obeo.dsl.minidrone.AudioMode;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.PostureMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getMinidroneName <em>Minidrone Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getSpeedPercentage <em>Speed Percentage</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getVolumePercentage <em>Volume Percentage</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getAudioMode <em>Audio Mode</em>}</li>
 *   <li>{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl#getPostureMode <em>Posture Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniDroneProgramImpl extends MinimalEObjectImpl.Container implements MiniDroneProgram {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInstruction> instructions;

	/**
	 * The default value of the '{@link #getMinidroneName() <em>Minidrone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinidroneName()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIDRONE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinidroneName() <em>Minidrone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinidroneName()
	 * @generated
	 * @ordered
	 */
	protected String minidroneName = MINIDRONE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedPercentage() <em>Speed Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeedPercentage() <em>Speed Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedPercentage()
	 * @generated
	 * @ordered
	 */
	protected int speedPercentage = SPEED_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumePercentage() <em>Volume Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumePercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolumePercentage() <em>Volume Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumePercentage()
	 * @generated
	 * @ordered
	 */
	protected int volumePercentage = VOLUME_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioMode() <em>Audio Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioMode()
	 * @generated
	 * @ordered
	 */
	protected static final AudioMode AUDIO_MODE_EDEFAULT = AudioMode.MONSTER;

	/**
	 * The cached value of the '{@link #getAudioMode() <em>Audio Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioMode()
	 * @generated
	 * @ordered
	 */
	protected AudioMode audioMode = AUDIO_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostureMode() <em>Posture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostureMode()
	 * @generated
	 * @ordered
	 */
	protected static final PostureMode POSTURE_MODE_EDEFAULT = PostureMode.JUMPER;

	/**
	 * The cached value of the '{@link #getPostureMode() <em>Posture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostureMode()
	 * @generated
	 * @ordered
	 */
	protected PostureMode postureMode = POSTURE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniDroneProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniDronePackage.Literals.MINI_DRONE_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInstruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<AbstractInstruction>(AbstractInstruction.class, this, MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinidroneName() {
		return minidroneName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinidroneName(String newMinidroneName) {
		String oldMinidroneName = minidroneName;
		minidroneName = newMinidroneName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME, oldMinidroneName, minidroneName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeedPercentage() {
		return speedPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedPercentage(int newSpeedPercentage) {
		int oldSpeedPercentage = speedPercentage;
		speedPercentage = newSpeedPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE, oldSpeedPercentage, speedPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolumePercentage() {
		return volumePercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumePercentage(int newVolumePercentage) {
		int oldVolumePercentage = volumePercentage;
		volumePercentage = newVolumePercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE, oldVolumePercentage, volumePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioMode getAudioMode() {
		return audioMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioMode(AudioMode newAudioMode) {
		AudioMode oldAudioMode = audioMode;
		audioMode = newAudioMode == null ? AUDIO_MODE_EDEFAULT : newAudioMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE, oldAudioMode, audioMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostureMode getPostureMode() {
		return postureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostureMode(PostureMode newPostureMode) {
		PostureMode oldPostureMode = postureMode;
		postureMode = newPostureMode == null ? POSTURE_MODE_EDEFAULT : newPostureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE, oldPostureMode, postureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
				return getInstructions();
			case MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME:
				return getMinidroneName();
			case MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE:
				return getSpeedPercentage();
			case MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE:
				return getVolumePercentage();
			case MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE:
				return getAudioMode();
			case MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE:
				return getPostureMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends AbstractInstruction>)newValue);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME:
				setMinidroneName((String)newValue);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE:
				setSpeedPercentage((Integer)newValue);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE:
				setVolumePercentage((Integer)newValue);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE:
				setAudioMode((AudioMode)newValue);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE:
				setPostureMode((PostureMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME:
				setMinidroneName(MINIDRONE_NAME_EDEFAULT);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE:
				setSpeedPercentage(SPEED_PERCENTAGE_EDEFAULT);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE:
				setVolumePercentage(VOLUME_PERCENTAGE_EDEFAULT);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE:
				setAudioMode(AUDIO_MODE_EDEFAULT);
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE:
				setPostureMode(POSTURE_MODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME:
				return MINIDRONE_NAME_EDEFAULT == null ? minidroneName != null : !MINIDRONE_NAME_EDEFAULT.equals(minidroneName);
			case MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE:
				return speedPercentage != SPEED_PERCENTAGE_EDEFAULT;
			case MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE:
				return volumePercentage != VOLUME_PERCENTAGE_EDEFAULT;
			case MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE:
				return audioMode != AUDIO_MODE_EDEFAULT;
			case MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE:
				return postureMode != POSTURE_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minidroneName: ");
		result.append(minidroneName);
		result.append(", speedPercentage: ");
		result.append(speedPercentage);
		result.append(", volumePercentage: ");
		result.append(volumePercentage);
		result.append(", audioMode: ");
		result.append(audioMode);
		result.append(", postureMode: ");
		result.append(postureMode);
		result.append(')');
		return result.toString();
	}

} //MiniDroneProgramImpl

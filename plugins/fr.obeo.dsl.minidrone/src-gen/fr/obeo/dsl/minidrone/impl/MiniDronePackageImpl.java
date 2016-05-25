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
import fr.obeo.dsl.minidrone.Animation;
import fr.obeo.dsl.minidrone.AnimationMode;
import fr.obeo.dsl.minidrone.Audio;
import fr.obeo.dsl.minidrone.AudioMode;
import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.BooleanExpression;
import fr.obeo.dsl.minidrone.Instruction;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.JumpMode;
import fr.obeo.dsl.minidrone.Loop;
import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.Posture;
import fr.obeo.dsl.minidrone.PostureMode;
import fr.obeo.dsl.minidrone.RecordVideo;
import fr.obeo.dsl.minidrone.Speed;
import fr.obeo.dsl.minidrone.Straight;
import fr.obeo.dsl.minidrone.TakePicture;
import fr.obeo.dsl.minidrone.Timer;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.Volume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniDronePackageImpl extends EPackageImpl implements MiniDronePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniDroneProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass straightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass takePictureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jumpModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postureModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum audioModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum animationModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.minidrone.MiniDronePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiniDronePackageImpl() {
		super(eNS_URI, MiniDroneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MiniDronePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiniDronePackage init() {
		if (isInited) return (MiniDronePackage)EPackage.Registry.INSTANCE.getEPackage(MiniDronePackage.eNS_URI);

		// Obtain or create and register package
		MiniDronePackageImpl theMiniDronePackage = (MiniDronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniDronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniDronePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMiniDronePackage.createPackageContents();

		// Initialize created meta-data
		theMiniDronePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiniDronePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiniDronePackage.eNS_URI, theMiniDronePackage);
		return theMiniDronePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiniDroneProgram() {
		return miniDroneProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiniDroneProgram_Instructions() {
		return (EReference)miniDroneProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniDroneProgram_MinidroneName() {
		return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniDroneProgram_SpeedPercentage() {
		return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniDroneProgram_VolumePercentage() {
		return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniDroneProgram_AudioMode() {
		return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniDroneProgram_PostureMode() {
		return (EAttribute)miniDroneProgramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStraight() {
		return straightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStraight_Distance() {
		return (EAttribute)straightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Angle() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJump() {
		return jumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJump_Mode() {
		return (EAttribute)jumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTakePicture() {
		return takePictureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordVideo() {
		return recordVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordVideo_Enable() {
		return (EAttribute)recordVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeed() {
		return speedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeed_Percentage() {
		return (EAttribute)speedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosture() {
		return postureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosture_Mode() {
		return (EAttribute)postureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Percentage() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_Duration() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Instructions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Name() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInstruction() {
		return abstractInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimation() {
		return animationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Mode() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Condition() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Expression() {
		return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Mode() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJumpMode() {
		return jumpModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPostureMode() {
		return postureModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAudioMode() {
		return audioModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimationMode() {
		return animationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniDroneFactory getMiniDroneFactory() {
		return (MiniDroneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		miniDroneProgramEClass = createEClass(MINI_DRONE_PROGRAM);
		createEReference(miniDroneProgramEClass, MINI_DRONE_PROGRAM__INSTRUCTIONS);
		createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__MINIDRONE_NAME);
		createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__SPEED_PERCENTAGE);
		createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE);
		createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__AUDIO_MODE);
		createEAttribute(miniDroneProgramEClass, MINI_DRONE_PROGRAM__POSTURE_MODE);

		instructionEClass = createEClass(INSTRUCTION);

		straightEClass = createEClass(STRAIGHT);
		createEAttribute(straightEClass, STRAIGHT__DISTANCE);

		turnEClass = createEClass(TURN);
		createEAttribute(turnEClass, TURN__ANGLE);

		jumpEClass = createEClass(JUMP);
		createEAttribute(jumpEClass, JUMP__MODE);

		takePictureEClass = createEClass(TAKE_PICTURE);

		recordVideoEClass = createEClass(RECORD_VIDEO);
		createEAttribute(recordVideoEClass, RECORD_VIDEO__ENABLE);

		speedEClass = createEClass(SPEED);
		createEAttribute(speedEClass, SPEED__PERCENTAGE);

		postureEClass = createEClass(POSTURE);
		createEAttribute(postureEClass, POSTURE__MODE);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__PERCENTAGE);

		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__DURATION);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INSTRUCTIONS);
		createEAttribute(blockEClass, BLOCK__NAME);

		abstractInstructionEClass = createEClass(ABSTRACT_INSTRUCTION);

		animationEClass = createEClass(ANIMATION);
		createEAttribute(animationEClass, ANIMATION__MODE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__CONDITION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__EXPRESSION);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__MODE);

		// Create enums
		jumpModeEEnum = createEEnum(JUMP_MODE);
		postureModeEEnum = createEEnum(POSTURE_MODE);
		audioModeEEnum = createEEnum(AUDIO_MODE);
		animationModeEEnum = createEEnum(ANIMATION_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionEClass.getESuperTypes().add(this.getAbstractInstruction());
		straightEClass.getESuperTypes().add(this.getInstruction());
		turnEClass.getESuperTypes().add(this.getInstruction());
		jumpEClass.getESuperTypes().add(this.getInstruction());
		takePictureEClass.getESuperTypes().add(this.getInstruction());
		recordVideoEClass.getESuperTypes().add(this.getInstruction());
		speedEClass.getESuperTypes().add(this.getInstruction());
		postureEClass.getESuperTypes().add(this.getInstruction());
		volumeEClass.getESuperTypes().add(this.getInstruction());
		timerEClass.getESuperTypes().add(this.getInstruction());
		blockEClass.getESuperTypes().add(this.getAbstractInstruction());
		animationEClass.getESuperTypes().add(this.getInstruction());
		loopEClass.getESuperTypes().add(this.getBlock());
		audioEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(miniDroneProgramEClass, MiniDroneProgram.class, "MiniDroneProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiniDroneProgram_Instructions(), this.getAbstractInstruction(), null, "instructions", null, 0, -1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniDroneProgram_MinidroneName(), ecorePackage.getEString(), "minidroneName", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniDroneProgram_SpeedPercentage(), ecorePackage.getEInt(), "speedPercentage", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniDroneProgram_VolumePercentage(), ecorePackage.getEInt(), "volumePercentage", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniDroneProgram_AudioMode(), this.getAudioMode(), "audioMode", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniDroneProgram_PostureMode(), this.getPostureMode(), "postureMode", null, 0, 1, MiniDroneProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(straightEClass, Straight.class, "Straight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStraight_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurn_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jumpEClass, Jump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJump_Mode(), this.getJumpMode(), "mode", null, 0, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(takePictureEClass, TakePicture.class, "TakePicture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordVideoEClass, RecordVideo.class, "RecordVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordVideo_Enable(), ecorePackage.getEBoolean(), "enable", null, 0, 1, RecordVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedEClass, Speed.class, "Speed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeed_Percentage(), ecorePackage.getEInt(), "percentage", null, 0, 1, Speed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postureEClass, Posture.class, "Posture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosture_Mode(), this.getPostureMode(), "mode", null, 0, 1, Posture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Percentage(), ecorePackage.getEInt(), "percentage", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Instructions(), this.getAbstractInstruction(), null, "instructions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInstructionEClass, AbstractInstruction.class, "AbstractInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animationEClass, Animation.class, "Animation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimation_Mode(), this.getAnimationMode(), "mode", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Mode(), this.getAudioMode(), "mode", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jumpModeEEnum, JumpMode.class, "JumpMode");
		addEEnumLiteral(jumpModeEEnum, JumpMode.LONG);
		addEEnumLiteral(jumpModeEEnum, JumpMode.HIGH);

		initEEnum(postureModeEEnum, PostureMode.class, "PostureMode");
		addEEnumLiteral(postureModeEEnum, PostureMode.JUMPER);
		addEEnumLiteral(postureModeEEnum, PostureMode.KICKER);
		addEEnumLiteral(postureModeEEnum, PostureMode.AUTOBALANCE);

		initEEnum(audioModeEEnum, AudioMode.class, "AudioMode");
		addEEnumLiteral(audioModeEEnum, AudioMode.MONSTER);
		addEEnumLiteral(audioModeEEnum, AudioMode.INSECT);
		addEEnumLiteral(audioModeEEnum, AudioMode.ROBOT);

		initEEnum(animationModeEEnum, AnimationMode.class, "AnimationMode");
		addEEnumLiteral(animationModeEEnum, AnimationMode.SPIN);
		addEEnumLiteral(animationModeEEnum, AnimationMode.TOUCH);
		addEEnumLiteral(animationModeEEnum, AnimationMode.SHAKE);
		addEEnumLiteral(animationModeEEnum, AnimationMode.METRONOME);
		addEEnumLiteral(animationModeEEnum, AnimationMode.WAVE);
		addEEnumLiteral(animationModeEEnum, AnimationMode.SPINJUMP);
		addEEnumLiteral(animationModeEEnum, AnimationMode.SLALOM);
		addEEnumLiteral(animationModeEEnum, AnimationMode.SPINPOSTURE);
		addEEnumLiteral(animationModeEEnum, AnimationMode.SPIRAL);

		// Create resource
		createResource(eNS_URI);
	}

} //MiniDronePackageImpl

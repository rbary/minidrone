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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDroneFactory
 * @model kind="package"
 * @generated
 */
public interface MiniDronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minidrone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/minidrone/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minidrone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniDronePackage eINSTANCE = fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getMiniDroneProgram()
	 * @generated
	 */
	int MINI_DRONE_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__INSTRUCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Minidrone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__MINIDRONE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Speed Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__SPEED_PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Volume Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Audio Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__AUDIO_MODE = 4;

	/**
	 * The feature id for the '<em><b>Posture Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM__POSTURE_MODE = 5;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_DRONE_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.AbstractInstructionImpl <em>Abstract Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.AbstractInstructionImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAbstractInstruction()
	 * @generated
	 */
	int ABSTRACT_INSTRUCTION = 12;

	/**
	 * The number of structural features of the '<em>Abstract Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.Instruction <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.Instruction
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = ABSTRACT_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.StraightImpl <em>Straight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.StraightImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getStraight()
	 * @generated
	 */
	int STRAIGHT = 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT__DISTANCE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Straight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.TurnImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 3;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.JumpImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__MODE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.TakePictureImpl <em>Take Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.TakePictureImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTakePicture()
	 * @generated
	 */
	int TAKE_PICTURE = 5;

	/**
	 * The number of structural features of the '<em>Take Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Take Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.RecordVideoImpl <em>Record Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.RecordVideoImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getRecordVideo()
	 * @generated
	 */
	int RECORD_VIDEO = 6;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VIDEO__ENABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VIDEO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VIDEO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.SpeedImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 7;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__PERCENTAGE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.PostureImpl <em>Posture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.PostureImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getPosture()
	 * @generated
	 */
	int POSTURE = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE__MODE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Posture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Posture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTURE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.VolumeImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 9;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PERCENTAGE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.TimerImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__DURATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.BlockImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTIONS = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = ABSTRACT_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.AnimationImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 13;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__MODE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.LoopImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 14;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INSTRUCTIONS = BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.BooleanExpressionImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.impl.AudioImpl
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 16;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__MODE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.JumpMode <em>Jump Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.JumpMode
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJumpMode()
	 * @generated
	 */
	int JUMP_MODE = 17;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.PostureMode <em>Posture Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getPostureMode()
	 * @generated
	 */
	int POSTURE_MODE = 18;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.AudioMode <em>Audio Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.AudioMode
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAudioMode()
	 * @generated
	 */
	int AUDIO_MODE = 19;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.minidrone.AnimationMode <em>Animation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.minidrone.AnimationMode
	 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAnimationMode()
	 * @generated
	 */
	int ANIMATION_MODE = 20;


	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.MiniDroneProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram
	 * @generated
	 */
	EClass getMiniDroneProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getInstructions()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EReference getMiniDroneProgram_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getMinidroneName <em>Minidrone Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minidrone Name</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getMinidroneName()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EAttribute getMiniDroneProgram_MinidroneName();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getSpeedPercentage <em>Speed Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Percentage</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getSpeedPercentage()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EAttribute getMiniDroneProgram_SpeedPercentage();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getVolumePercentage <em>Volume Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Percentage</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getVolumePercentage()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EAttribute getMiniDroneProgram_VolumePercentage();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getAudioMode <em>Audio Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getAudioMode()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EAttribute getMiniDroneProgram_AudioMode();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.MiniDroneProgram#getPostureMode <em>Posture Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posture Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.MiniDroneProgram#getPostureMode()
	 * @see #getMiniDroneProgram()
	 * @generated
	 */
	EAttribute getMiniDroneProgram_PostureMode();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.obeo.dsl.minidrone.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Straight <em>Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Straight</em>'.
	 * @see fr.obeo.dsl.minidrone.Straight
	 * @generated
	 */
	EClass getStraight();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Straight#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.obeo.dsl.minidrone.Straight#getDistance()
	 * @see #getStraight()
	 * @generated
	 */
	EAttribute getStraight_Distance();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see fr.obeo.dsl.minidrone.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Turn#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.obeo.dsl.minidrone.Turn#getAngle()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Angle();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see fr.obeo.dsl.minidrone.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Jump#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.Jump#getMode()
	 * @see #getJump()
	 * @generated
	 */
	EAttribute getJump_Mode();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.TakePicture <em>Take Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Take Picture</em>'.
	 * @see fr.obeo.dsl.minidrone.TakePicture
	 * @generated
	 */
	EClass getTakePicture();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.RecordVideo <em>Record Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Video</em>'.
	 * @see fr.obeo.dsl.minidrone.RecordVideo
	 * @generated
	 */
	EClass getRecordVideo();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.RecordVideo#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see fr.obeo.dsl.minidrone.RecordVideo#isEnable()
	 * @see #getRecordVideo()
	 * @generated
	 */
	EAttribute getRecordVideo_Enable();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed</em>'.
	 * @see fr.obeo.dsl.minidrone.Speed
	 * @generated
	 */
	EClass getSpeed();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Speed#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see fr.obeo.dsl.minidrone.Speed#getPercentage()
	 * @see #getSpeed()
	 * @generated
	 */
	EAttribute getSpeed_Percentage();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Posture <em>Posture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posture</em>'.
	 * @see fr.obeo.dsl.minidrone.Posture
	 * @generated
	 */
	EClass getPosture();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Posture#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.Posture#getMode()
	 * @see #getPosture()
	 * @generated
	 */
	EAttribute getPosture_Mode();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see fr.obeo.dsl.minidrone.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Volume#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see fr.obeo.dsl.minidrone.Volume#getPercentage()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Percentage();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see fr.obeo.dsl.minidrone.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Timer#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.obeo.dsl.minidrone.Timer#getDuration()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_Duration();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.obeo.dsl.minidrone.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.minidrone.Block#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.obeo.dsl.minidrone.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.minidrone.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.AbstractInstruction <em>Abstract Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Instruction</em>'.
	 * @see fr.obeo.dsl.minidrone.AbstractInstruction
	 * @generated
	 */
	EClass getAbstractInstruction();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see fr.obeo.dsl.minidrone.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Animation#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.Animation#getMode()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Mode();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see fr.obeo.dsl.minidrone.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.minidrone.Loop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.obeo.dsl.minidrone.Loop#getCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Condition();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see fr.obeo.dsl.minidrone.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.BooleanExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fr.obeo.dsl.minidrone.BooleanExpression#getExpression()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Expression();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.minidrone.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see fr.obeo.dsl.minidrone.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.minidrone.Audio#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.Audio#getMode()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Mode();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.minidrone.JumpMode <em>Jump Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jump Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.JumpMode
	 * @generated
	 */
	EEnum getJumpMode();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.minidrone.PostureMode <em>Posture Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Posture Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.PostureMode
	 * @generated
	 */
	EEnum getPostureMode();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.minidrone.AudioMode <em>Audio Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audio Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.AudioMode
	 * @generated
	 */
	EEnum getAudioMode();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.minidrone.AnimationMode <em>Animation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animation Mode</em>'.
	 * @see fr.obeo.dsl.minidrone.AnimationMode
	 * @generated
	 */
	EEnum getAnimationMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiniDroneFactory getMiniDroneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.MiniDroneProgramImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getMiniDroneProgram()
		 * @generated
		 */
		EClass MINI_DRONE_PROGRAM = eINSTANCE.getMiniDroneProgram();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_DRONE_PROGRAM__INSTRUCTIONS = eINSTANCE.getMiniDroneProgram_Instructions();

		/**
		 * The meta object literal for the '<em><b>Minidrone Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_DRONE_PROGRAM__MINIDRONE_NAME = eINSTANCE.getMiniDroneProgram_MinidroneName();

		/**
		 * The meta object literal for the '<em><b>Speed Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_DRONE_PROGRAM__SPEED_PERCENTAGE = eINSTANCE.getMiniDroneProgram_SpeedPercentage();

		/**
		 * The meta object literal for the '<em><b>Volume Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE = eINSTANCE.getMiniDroneProgram_VolumePercentage();

		/**
		 * The meta object literal for the '<em><b>Audio Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_DRONE_PROGRAM__AUDIO_MODE = eINSTANCE.getMiniDroneProgram_AudioMode();

		/**
		 * The meta object literal for the '<em><b>Posture Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINI_DRONE_PROGRAM__POSTURE_MODE = eINSTANCE.getMiniDroneProgram_PostureMode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.Instruction <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.Instruction
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.StraightImpl <em>Straight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.StraightImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getStraight()
		 * @generated
		 */
		EClass STRAIGHT = eINSTANCE.getStraight();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRAIGHT__DISTANCE = eINSTANCE.getStraight_Distance();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.TurnImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ANGLE = eINSTANCE.getTurn_Angle();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.JumpImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP__MODE = eINSTANCE.getJump_Mode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.TakePictureImpl <em>Take Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.TakePictureImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTakePicture()
		 * @generated
		 */
		EClass TAKE_PICTURE = eINSTANCE.getTakePicture();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.RecordVideoImpl <em>Record Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.RecordVideoImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getRecordVideo()
		 * @generated
		 */
		EClass RECORD_VIDEO = eINSTANCE.getRecordVideo();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_VIDEO__ENABLE = eINSTANCE.getRecordVideo_Enable();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.SpeedImpl <em>Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.SpeedImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getSpeed()
		 * @generated
		 */
		EClass SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED__PERCENTAGE = eINSTANCE.getSpeed_Percentage();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.PostureImpl <em>Posture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.PostureImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getPosture()
		 * @generated
		 */
		EClass POSTURE = eINSTANCE.getPosture();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTURE__MODE = eINSTANCE.getPosture_Mode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.VolumeImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__PERCENTAGE = eINSTANCE.getVolume_Percentage();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.TimerImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__DURATION = eINSTANCE.getTimer_Duration();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.BlockImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.AbstractInstructionImpl <em>Abstract Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.AbstractInstructionImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAbstractInstruction()
		 * @generated
		 */
		EClass ABSTRACT_INSTRUCTION = eINSTANCE.getAbstractInstruction();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.AnimationImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__MODE = eINSTANCE.getAnimation_Mode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.LoopImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__CONDITION = eINSTANCE.getLoop_Condition();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.BooleanExpressionImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__EXPRESSION = eINSTANCE.getBooleanExpression_Expression();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.impl.AudioImpl
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__MODE = eINSTANCE.getAudio_Mode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.JumpMode <em>Jump Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.JumpMode
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getJumpMode()
		 * @generated
		 */
		EEnum JUMP_MODE = eINSTANCE.getJumpMode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.PostureMode <em>Posture Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.PostureMode
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getPostureMode()
		 * @generated
		 */
		EEnum POSTURE_MODE = eINSTANCE.getPostureMode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.AudioMode <em>Audio Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.AudioMode
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAudioMode()
		 * @generated
		 */
		EEnum AUDIO_MODE = eINSTANCE.getAudioMode();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.minidrone.AnimationMode <em>Animation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.minidrone.AnimationMode
		 * @see fr.obeo.dsl.minidrone.impl.MiniDronePackageImpl#getAnimationMode()
		 * @generated
		 */
		EEnum ANIMATION_MODE = eINSTANCE.getAnimationMode();

	}

} //MiniDronePackage

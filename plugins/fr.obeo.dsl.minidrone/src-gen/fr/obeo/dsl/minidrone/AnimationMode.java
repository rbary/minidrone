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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Animation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getAnimationMode()
 * @model
 * @generated
 */
public enum AnimationMode implements Enumerator {
	/**
	 * The '<em><b>SPIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIN_VALUE
	 * @generated
	 * @ordered
	 */
	SPIN(0, "SPIN", "SPIN"),

	/**
	 * The '<em><b>TOUCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH(1, "TOUCH", "TOUCH"),

	/**
	 * The '<em><b>SHAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHAKE_VALUE
	 * @generated
	 * @ordered
	 */
	SHAKE(2, "SHAKE", "SHAKE"),

	/**
	 * The '<em><b>METRONOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRONOME_VALUE
	 * @generated
	 * @ordered
	 */
	METRONOME(3, "METRONOME", "METRONOME"),

	/**
	 * The '<em><b>WAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE(4, "WAVE", "WAVE"),

	/**
	 * The '<em><b>SPINJUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPINJUMP_VALUE
	 * @generated
	 * @ordered
	 */
	SPINJUMP(5, "SPINJUMP", "SPINJUMP"),

	/**
	 * The '<em><b>SLALOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLALOM_VALUE
	 * @generated
	 * @ordered
	 */
	SLALOM(6, "SLALOM", "SLALOM"),

	/**
	 * The '<em><b>SPINPOSTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPINPOSTURE_VALUE
	 * @generated
	 * @ordered
	 */
	SPINPOSTURE(7, "SPINPOSTURE", "SPINPOSTURE"),

	/**
	 * The '<em><b>SPIRAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL(8, "SPIRAL", "SPIRAL");

	/**
	 * The '<em><b>SPIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIN_VALUE = 0;

	/**
	 * The '<em><b>TOUCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_VALUE = 1;

	/**
	 * The '<em><b>SHAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHAKE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHAKE_VALUE = 2;

	/**
	 * The '<em><b>METRONOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METRONOME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METRONOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METRONOME_VALUE = 3;

	/**
	 * The '<em><b>WAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_VALUE = 4;

	/**
	 * The '<em><b>SPINJUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPINJUMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPINJUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPINJUMP_VALUE = 5;

	/**
	 * The '<em><b>SLALOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLALOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLALOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLALOM_VALUE = 6;

	/**
	 * The '<em><b>SPINPOSTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPINPOSTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPINPOSTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPINPOSTURE_VALUE = 7;

	/**
	 * The '<em><b>SPIRAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPIRAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Animation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnimationMode[] VALUES_ARRAY =
		new AnimationMode[] {
			SPIN,
			TOUCH,
			SHAKE,
			METRONOME,
			WAVE,
			SPINJUMP,
			SLALOM,
			SPINPOSTURE,
			SPIRAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Animation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AnimationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Animation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnimationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnimationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Animation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnimationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnimationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Animation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnimationMode get(int value) {
		switch (value) {
			case SPIN_VALUE: return SPIN;
			case TOUCH_VALUE: return TOUCH;
			case SHAKE_VALUE: return SHAKE;
			case METRONOME_VALUE: return METRONOME;
			case WAVE_VALUE: return WAVE;
			case SPINJUMP_VALUE: return SPINJUMP;
			case SLALOM_VALUE: return SLALOM;
			case SPINPOSTURE_VALUE: return SPINPOSTURE;
			case SPIRAL_VALUE: return SPIRAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AnimationMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AnimationMode

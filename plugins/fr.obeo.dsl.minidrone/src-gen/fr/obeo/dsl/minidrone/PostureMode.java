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
 * A representation of the literals of the enumeration '<em><b>Posture Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.minidrone.MiniDronePackage#getPostureMode()
 * @model
 * @generated
 */
public enum PostureMode implements Enumerator {
	/**
	 * The '<em><b>JUMPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMPER_VALUE
	 * @generated
	 * @ordered
	 */
	JUMPER(0, "JUMPER", "JUMPER"),

	/**
	 * The '<em><b>KICKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KICKER_VALUE
	 * @generated
	 * @ordered
	 */
	KICKER(1, "KICKER", "KICKER"),

	/**
	 * The '<em><b>AUTOBALANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOBALANCE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOBALANCE(2, "AUTOBALANCE", "AUTOBALANCE");

	/**
	 * The '<em><b>JUMPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JUMPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUMPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER_VALUE = 0;

	/**
	 * The '<em><b>KICKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KICKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KICKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KICKER_VALUE = 1;

	/**
	 * The '<em><b>AUTOBALANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTOBALANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOBALANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOBALANCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Posture Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PostureMode[] VALUES_ARRAY =
		new PostureMode[] {
			JUMPER,
			KICKER,
			AUTOBALANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Posture Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PostureMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Posture Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostureMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostureMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Posture Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostureMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostureMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Posture Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostureMode get(int value) {
		switch (value) {
			case JUMPER_VALUE: return JUMPER;
			case KICKER_VALUE: return KICKER;
			case AUTOBALANCE_VALUE: return AUTOBALANCE;
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
	private PostureMode(int value, String name, String literal) {
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
	
} //PostureMode
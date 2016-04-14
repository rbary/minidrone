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
package fr.obeo.dsl.minidrone.provider;


import fr.obeo.dsl.minidrone.Block;
import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDronePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.dsl.minidrone.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider extends AbstractInstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Block_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Block.class)) {
			case MiniDronePackage.BLOCK__INSTRUCTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createStraight()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createJump()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTakePicture()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createRecordVideo()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createPosture()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createVolume()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createAnimation()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.BLOCK__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createAudio()));
	}

}

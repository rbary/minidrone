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


import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDronePackage;
import fr.obeo.dsl.minidrone.MiniDroneProgram;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.dsl.minidrone.MiniDroneProgram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniDroneProgramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniDroneProgramItemProvider(AdapterFactory adapterFactory) {
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

			addMinidroneNamePropertyDescriptor(object);
			addSpeedPercentagePropertyDescriptor(object);
			addVolumePercentagePropertyDescriptor(object);
			addAudioModePropertyDescriptor(object);
			addPostureModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Minidrone Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinidroneNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniDroneProgram_minidroneName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniDroneProgram_minidroneName_feature", "_UI_MiniDroneProgram_type"),
				 MiniDronePackage.Literals.MINI_DRONE_PROGRAM__MINIDRONE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed Percentage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPercentagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniDroneProgram_speedPercentage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniDroneProgram_speedPercentage_feature", "_UI_MiniDroneProgram_type"),
				 MiniDronePackage.Literals.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume Percentage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePercentagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniDroneProgram_volumePercentage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniDroneProgram_volumePercentage_feature", "_UI_MiniDroneProgram_type"),
				 MiniDronePackage.Literals.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Audio Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAudioModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniDroneProgram_audioMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniDroneProgram_audioMode_feature", "_UI_MiniDroneProgram_type"),
				 MiniDronePackage.Literals.MINI_DRONE_PROGRAM__AUDIO_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Posture Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostureModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniDroneProgram_postureMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniDroneProgram_postureMode_feature", "_UI_MiniDroneProgram_type"),
				 MiniDronePackage.Literals.MINI_DRONE_PROGRAM__POSTURE_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS);
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
	 * This returns MiniDroneProgram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MiniDroneProgram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MiniDroneProgram)object).getMinidroneName();
		return label == null || label.length() == 0 ?
			getString("_UI_MiniDroneProgram_type") :
			getString("_UI_MiniDroneProgram_type") + " " + label;
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

		switch (notification.getFeatureID(MiniDroneProgram.class)) {
			case MiniDronePackage.MINI_DRONE_PROGRAM__MINIDRONE_NAME:
			case MiniDronePackage.MINI_DRONE_PROGRAM__SPEED_PERCENTAGE:
			case MiniDronePackage.MINI_DRONE_PROGRAM__VOLUME_PERCENTAGE:
			case MiniDronePackage.MINI_DRONE_PROGRAM__AUDIO_MODE:
			case MiniDronePackage.MINI_DRONE_PROGRAM__POSTURE_MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MiniDronePackage.MINI_DRONE_PROGRAM__INSTRUCTIONS:
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
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createStraight()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createJump()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTakePicture()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createRecordVideo()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createSpeed()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createPosture()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createVolume()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createAnimation()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(MiniDronePackage.Literals.MINI_DRONE_PROGRAM__INSTRUCTIONS,
				 MiniDroneFactory.eINSTANCE.createAudio()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MiniDroneEditPlugin.INSTANCE;
	}

}

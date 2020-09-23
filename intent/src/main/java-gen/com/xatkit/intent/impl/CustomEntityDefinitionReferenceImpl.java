/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.CustomEntityDefinition;
import com.xatkit.intent.CustomEntityDefinitionReference;
import com.xatkit.intent.EntityDefinition;
import com.xatkit.intent.IntentPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Entity Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.CustomEntityDefinitionReferenceImpl#getCustomEntity <em>Custom Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomEntityDefinitionReferenceImpl extends EntityDefinitionReferenceImpl implements CustomEntityDefinitionReference {
	/**
	 * The cached value of the '{@link #getCustomEntity() <em>Custom Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEntity()
	 * @generated
	 * @ordered
	 */
	protected CustomEntityDefinition customEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomEntityDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.CUSTOM_ENTITY_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEntityDefinition getCustomEntity() {
		if (customEntity != null && customEntity.eIsProxy()) {
			InternalEObject oldCustomEntity = (InternalEObject)customEntity;
			customEntity = (CustomEntityDefinition)eResolveProxy(oldCustomEntity);
			if (customEntity != oldCustomEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY, oldCustomEntity, customEntity));
			}
		}
		return customEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntityDefinition basicGetCustomEntity() {
		return customEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomEntity(CustomEntityDefinition newCustomEntity) {
		CustomEntityDefinition oldCustomEntity = customEntity;
		customEntity = newCustomEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY, oldCustomEntity, customEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	@Override
	public EntityDefinition getReferredEntity() {
		return this.getCustomEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY:
				if (resolve) return getCustomEntity();
				return basicGetCustomEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY:
				setCustomEntity((CustomEntityDefinition)newValue);
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
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY:
				setCustomEntity((CustomEntityDefinition)null);
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
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY:
				return customEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomEntityDefinitionReferenceImpl

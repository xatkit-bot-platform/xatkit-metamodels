/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.BaseEntityDefinition;
import com.xatkit.intent.BaseEntityDefinitionReference;
import com.xatkit.intent.EntityDefinition;
import com.xatkit.intent.IntentPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Entity Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.BaseEntityDefinitionReferenceImpl#getBaseEntity <em>Base Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseEntityDefinitionReferenceImpl extends EntityDefinitionReferenceImpl implements BaseEntityDefinitionReference {
	/**
	 * The cached value of the '{@link #getBaseEntity() <em>Base Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseEntity()
	 * @generated
	 * @ordered
	 */
	protected BaseEntityDefinition baseEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseEntityDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.BASE_ENTITY_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseEntityDefinition getBaseEntity() {
		return baseEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseEntity(BaseEntityDefinition newBaseEntity, NotificationChain msgs) {
		BaseEntityDefinition oldBaseEntity = baseEntity;
		baseEntity = newBaseEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY, oldBaseEntity, newBaseEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseEntity(BaseEntityDefinition newBaseEntity) {
		if (newBaseEntity != baseEntity) {
			NotificationChain msgs = null;
			if (baseEntity != null)
				msgs = ((InternalEObject)baseEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY, null, msgs);
			if (newBaseEntity != null)
				msgs = ((InternalEObject)newBaseEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY, null, msgs);
			msgs = basicSetBaseEntity(newBaseEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY, newBaseEntity, newBaseEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	@Override
	public EntityDefinition getReferredEntity() {
		return this.getBaseEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY:
				return basicSetBaseEntity(null, msgs);
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
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY:
				return getBaseEntity();
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
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY:
				setBaseEntity((BaseEntityDefinition)newValue);
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
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY:
				setBaseEntity((BaseEntityDefinition)null);
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
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY:
				return baseEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseEntityDefinitionReferenceImpl

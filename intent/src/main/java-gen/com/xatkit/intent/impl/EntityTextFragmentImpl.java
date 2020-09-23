/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.EntityDefinitionReference;
import com.xatkit.intent.EntityTextFragment;
import com.xatkit.intent.IntentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Text Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.EntityTextFragmentImpl#getEntityReference <em>Entity Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTextFragmentImpl extends TextFragmentImpl implements EntityTextFragment {
	/**
	 * The cached value of the '{@link #getEntityReference() <em>Entity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityReference()
	 * @generated
	 * @ordered
	 */
	protected EntityDefinitionReference entityReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTextFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.ENTITY_TEXT_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityDefinitionReference getEntityReference() {
		return entityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityReference(EntityDefinitionReference newEntityReference, NotificationChain msgs) {
		EntityDefinitionReference oldEntityReference = entityReference;
		entityReference = newEntityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE, oldEntityReference, newEntityReference);
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
	public void setEntityReference(EntityDefinitionReference newEntityReference) {
		if (newEntityReference != entityReference) {
			NotificationChain msgs = null;
			if (entityReference != null)
				msgs = ((InternalEObject)entityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE, null, msgs);
			if (newEntityReference != null)
				msgs = ((InternalEObject)newEntityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE, null, msgs);
			msgs = basicSetEntityReference(newEntityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE, newEntityReference, newEntityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE:
				return basicSetEntityReference(null, msgs);
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
			case IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE:
				return getEntityReference();
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
			case IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE:
				setEntityReference((EntityDefinitionReference)newValue);
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
			case IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE:
				setEntityReference((EntityDefinitionReference)null);
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
			case IntentPackage.ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE:
				return entityReference != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityTextFragmentImpl

/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.CustomEntityDefinition;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.IntentPackage;
import com.xatkit.intent.Library;

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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.LibraryImpl#getCustomEntities <em>Custom Entities</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.LibraryImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomEntities() <em>Custom Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomEntityDefinition> customEntities;

	/**
	 * The cached value of the '{@link #getEventDefinitions() <em>Event Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> eventDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomEntityDefinition> getCustomEntities() {
		if (customEntities == null) {
			customEntities = new EObjectContainmentEList<CustomEntityDefinition>(CustomEntityDefinition.class, this, IntentPackage.LIBRARY__CUSTOM_ENTITIES);
		}
		return customEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDefinition> getEventDefinitions() {
		if (eventDefinitions == null) {
			eventDefinitions = new EObjectContainmentEList<EventDefinition>(EventDefinition.class, this, IntentPackage.LIBRARY__EVENT_DEFINITIONS);
		}
		return eventDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.LIBRARY__CUSTOM_ENTITIES:
				return ((InternalEList<?>)getCustomEntities()).basicRemove(otherEnd, msgs);
			case IntentPackage.LIBRARY__EVENT_DEFINITIONS:
				return ((InternalEList<?>)getEventDefinitions()).basicRemove(otherEnd, msgs);
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
			case IntentPackage.LIBRARY__NAME:
				return getName();
			case IntentPackage.LIBRARY__CUSTOM_ENTITIES:
				return getCustomEntities();
			case IntentPackage.LIBRARY__EVENT_DEFINITIONS:
				return getEventDefinitions();
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
			case IntentPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case IntentPackage.LIBRARY__CUSTOM_ENTITIES:
				getCustomEntities().clear();
				getCustomEntities().addAll((Collection<? extends CustomEntityDefinition>)newValue);
				return;
			case IntentPackage.LIBRARY__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
				getEventDefinitions().addAll((Collection<? extends EventDefinition>)newValue);
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
			case IntentPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntentPackage.LIBRARY__CUSTOM_ENTITIES:
				getCustomEntities().clear();
				return;
			case IntentPackage.LIBRARY__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
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
			case IntentPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntentPackage.LIBRARY__CUSTOM_ENTITIES:
				return customEntities != null && !customEntities.isEmpty();
			case IntentPackage.LIBRARY__EVENT_DEFINITIONS:
				return eventDefinitions != null && !eventDefinitions.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl

/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.ContextParameterValue;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.EventInstance;
import com.xatkit.intent.IntentPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
 * An implementation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.EventInstanceImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.EventInstanceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.EventInstanceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.EventInstanceImpl#getPlatformData <em>Platform Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventInstanceImpl extends MinimalEObjectImpl.Container implements EventInstance {
	/**
	 * The default value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGERED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected String triggeredBy = TRIGGERED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition definition;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextParameterValue> values;

	/**
	 * The cached value of the '{@link #getPlatformData() <em>Platform Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformData()
	 * @NotGenerated
	 * @ordered
	 */
	protected Map<String, Object> platformData = new HashMap<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.EVENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTriggeredBy() {
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggeredBy(String newTriggeredBy) {
		String oldTriggeredBy = triggeredBy;
		triggeredBy = newTriggeredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.EVENT_INSTANCE__TRIGGERED_BY, oldTriggeredBy, triggeredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (EventDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntentPackage.EVENT_INSTANCE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(EventDefinition newDefinition) {
		EventDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.EVENT_INSTANCE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextParameterValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ContextParameterValue>(ContextParameterValue.class, this, IntentPackage.EVENT_INSTANCE__VALUES);
		}
		return values;
	}
	
	/**
	 * {@inheritDoc}
	 * @NotGenerated
	 */
	@Override
	public Object getValue(String parameterName) {
		return this.getValues().stream()
				.filter(parameter -> parameter.getContextParameter().getName().equals(parameterName))
				.map(parameterValue -> parameterValue.getValue())
				.findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<String, Object> getPlatformData() {
		return platformData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformData(Map<String, Object> newPlatformData) {
		Map<String, Object> oldPlatformData = platformData;
		platformData = newPlatformData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.EVENT_INSTANCE__PLATFORM_DATA, oldPlatformData, platformData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.EVENT_INSTANCE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case IntentPackage.EVENT_INSTANCE__TRIGGERED_BY:
				return getTriggeredBy();
			case IntentPackage.EVENT_INSTANCE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case IntentPackage.EVENT_INSTANCE__VALUES:
				return getValues();
			case IntentPackage.EVENT_INSTANCE__PLATFORM_DATA:
				return getPlatformData();
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
			case IntentPackage.EVENT_INSTANCE__TRIGGERED_BY:
				setTriggeredBy((String)newValue);
				return;
			case IntentPackage.EVENT_INSTANCE__DEFINITION:
				setDefinition((EventDefinition)newValue);
				return;
			case IntentPackage.EVENT_INSTANCE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ContextParameterValue>)newValue);
				return;
			case IntentPackage.EVENT_INSTANCE__PLATFORM_DATA:
				setPlatformData((Map<String, Object>)newValue);
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
			case IntentPackage.EVENT_INSTANCE__TRIGGERED_BY:
				setTriggeredBy(TRIGGERED_BY_EDEFAULT);
				return;
			case IntentPackage.EVENT_INSTANCE__DEFINITION:
				setDefinition((EventDefinition)null);
				return;
			case IntentPackage.EVENT_INSTANCE__VALUES:
				getValues().clear();
				return;
			case IntentPackage.EVENT_INSTANCE__PLATFORM_DATA:
				setPlatformData((Map<String, Object>)null);
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
			case IntentPackage.EVENT_INSTANCE__TRIGGERED_BY:
				return TRIGGERED_BY_EDEFAULT == null ? triggeredBy != null : !TRIGGERED_BY_EDEFAULT.equals(triggeredBy);
			case IntentPackage.EVENT_INSTANCE__DEFINITION:
				return definition != null;
			case IntentPackage.EVENT_INSTANCE__VALUES:
				return values != null && !values.isEmpty();
			case IntentPackage.EVENT_INSTANCE__PLATFORM_DATA:
				return platformData != null;
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
		result.append(" (triggeredBy: ");
		result.append(triggeredBy);
		result.append(", platformData: ");
		result.append(platformData);
		result.append(')');
		return result.toString();
	}

} //EventInstanceImpl

/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.IntentPackage;
import com.xatkit.intent.MappingEntityDefinitionEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Entity Definition Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl#getReferenceValue <em>Reference Value</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl#getSynonyms <em>Synonyms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingEntityDefinitionEntryImpl extends MinimalEObjectImpl.Container implements MappingEntityDefinitionEntry {
	/**
	 * The default value of the '{@link #getReferenceValue() <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceValue() <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected String referenceValue = REFERENCE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> synonyms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingEntityDefinitionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.MAPPING_ENTITY_DEFINITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceValue() {
		return referenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceValue(String newReferenceValue) {
		String oldReferenceValue = referenceValue;
		referenceValue = newReferenceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE, oldReferenceValue, referenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSynonyms() {
		if (synonyms == null) {
			synonyms = new EDataTypeEList<String>(String.class, this, IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS);
		}
		return synonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE:
				return getReferenceValue();
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS:
				return getSynonyms();
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
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE:
				setReferenceValue((String)newValue);
				return;
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS:
				getSynonyms().clear();
				getSynonyms().addAll((Collection<? extends String>)newValue);
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
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE:
				setReferenceValue(REFERENCE_VALUE_EDEFAULT);
				return;
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS:
				getSynonyms().clear();
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
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE:
				return REFERENCE_VALUE_EDEFAULT == null ? referenceValue != null : !REFERENCE_VALUE_EDEFAULT.equals(referenceValue);
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS:
				return synonyms != null && !synonyms.isEmpty();
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
		result.append(" (referenceValue: ");
		result.append(referenceValue);
		result.append(", synonyms: ");
		result.append(synonyms);
		result.append(')');
		return result.toString();
	}

} //MappingEntityDefinitionEntryImpl

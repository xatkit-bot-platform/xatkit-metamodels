/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.IntentDefinition;
import com.xatkit.intent.IntentPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.IntentDefinitionImpl#getTrainingSentences <em>Training Sentences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentDefinitionImpl extends EventDefinitionImpl implements IntentDefinition {
	/**
	 * The cached value of the '{@link #getTrainingSentences() <em>Training Sentences</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingSentences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> trainingSentences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.INTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTrainingSentences() {
		if (trainingSentences == null) {
			trainingSentences = new EDataTypeEList<String>(String.class, this, IntentPackage.INTENT_DEFINITION__TRAINING_SENTENCES);
		}
		return trainingSentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.INTENT_DEFINITION__TRAINING_SENTENCES:
				return getTrainingSentences();
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
			case IntentPackage.INTENT_DEFINITION__TRAINING_SENTENCES:
				getTrainingSentences().clear();
				getTrainingSentences().addAll((Collection<? extends String>)newValue);
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
			case IntentPackage.INTENT_DEFINITION__TRAINING_SENTENCES:
				getTrainingSentences().clear();
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
			case IntentPackage.INTENT_DEFINITION__TRAINING_SENTENCES:
				return trainingSentences != null && !trainingSentences.isEmpty();
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
		result.append(" (trainingSentences: ");
		result.append(trainingSentences);
		result.append(')');
		return result.toString();
	}

} //IntentDefinitionImpl

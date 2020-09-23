/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.IntentPackage;
import com.xatkit.intent.RecognizedIntent;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recognized Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.RecognizedIntentImpl#getMatchedInput <em>Matched Input</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.RecognizedIntentImpl#getRecognitionConfidence <em>Recognition Confidence</em>}</li>
 *   <li>{@link com.xatkit.intent.impl.RecognizedIntentImpl#getNlpData <em>Nlp Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecognizedIntentImpl extends EventInstanceImpl implements RecognizedIntent {
	/**
	 * The default value of the '{@link #getMatchedInput() <em>Matched Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedInput()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHED_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchedInput() <em>Matched Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedInput()
	 * @generated
	 * @ordered
	 */
	protected String matchedInput = MATCHED_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecognitionConfidence() <em>Recognition Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognitionConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final float RECOGNITION_CONFIDENCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRecognitionConfidence() <em>Recognition Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognitionConfidence()
	 * @generated
	 * @ordered
	 */
	protected float recognitionConfidence = RECOGNITION_CONFIDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNlpData() <em>Nlp Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNlpData()
	 * @NotGenerated
	 * @ordered
	 */
	protected Map<String, Object> nlpData = new HashMap<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecognizedIntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.RECOGNIZED_INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchedInput() {
		return matchedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchedInput(String newMatchedInput) {
		String oldMatchedInput = matchedInput;
		matchedInput = newMatchedInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.RECOGNIZED_INTENT__MATCHED_INPUT, oldMatchedInput, matchedInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRecognitionConfidence() {
		return recognitionConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecognitionConfidence(float newRecognitionConfidence) {
		float oldRecognitionConfidence = recognitionConfidence;
		recognitionConfidence = newRecognitionConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE, oldRecognitionConfidence, recognitionConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<String, Object> getNlpData() {
		return nlpData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNlpData(Map<String, Object> newNlpData) {
		Map<String, Object> oldNlpData = nlpData;
		nlpData = newNlpData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.RECOGNIZED_INTENT__NLP_DATA, oldNlpData, nlpData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.RECOGNIZED_INTENT__MATCHED_INPUT:
				return getMatchedInput();
			case IntentPackage.RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE:
				return getRecognitionConfidence();
			case IntentPackage.RECOGNIZED_INTENT__NLP_DATA:
				return getNlpData();
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
			case IntentPackage.RECOGNIZED_INTENT__MATCHED_INPUT:
				setMatchedInput((String)newValue);
				return;
			case IntentPackage.RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE:
				setRecognitionConfidence((Float)newValue);
				return;
			case IntentPackage.RECOGNIZED_INTENT__NLP_DATA:
				setNlpData((Map<String, Object>)newValue);
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
			case IntentPackage.RECOGNIZED_INTENT__MATCHED_INPUT:
				setMatchedInput(MATCHED_INPUT_EDEFAULT);
				return;
			case IntentPackage.RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE:
				setRecognitionConfidence(RECOGNITION_CONFIDENCE_EDEFAULT);
				return;
			case IntentPackage.RECOGNIZED_INTENT__NLP_DATA:
				setNlpData((Map<String, Object>)null);
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
			case IntentPackage.RECOGNIZED_INTENT__MATCHED_INPUT:
				return MATCHED_INPUT_EDEFAULT == null ? matchedInput != null : !MATCHED_INPUT_EDEFAULT.equals(matchedInput);
			case IntentPackage.RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE:
				return recognitionConfidence != RECOGNITION_CONFIDENCE_EDEFAULT;
			case IntentPackage.RECOGNIZED_INTENT__NLP_DATA:
				return nlpData != null;
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
		result.append(" (matchedInput: ");
		result.append(matchedInput);
		result.append(", recognitionConfidence: ");
		result.append(recognitionConfidence);
		result.append(", nlpData: ");
		result.append(nlpData);
		result.append(')');
		return result.toString();
	}

} //RecognizedIntentImpl

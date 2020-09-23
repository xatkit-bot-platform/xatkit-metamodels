/**
 */
package com.xatkit.intent;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recognized Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.RecognizedIntent#getMatchedInput <em>Matched Input</em>}</li>
 *   <li>{@link com.xatkit.intent.RecognizedIntent#getRecognitionConfidence <em>Recognition Confidence</em>}</li>
 *   <li>{@link com.xatkit.intent.RecognizedIntent#getNlpData <em>Nlp Data</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getRecognizedIntent()
 * @model
 * @generated
 */
public interface RecognizedIntent extends EventInstance {
	/**
	 * Returns the value of the '<em><b>Matched Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Input</em>' attribute.
	 * @see #setMatchedInput(String)
	 * @see com.xatkit.intent.IntentPackage#getRecognizedIntent_MatchedInput()
	 * @model unique="false"
	 * @generated
	 */
	String getMatchedInput();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.RecognizedIntent#getMatchedInput <em>Matched Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matched Input</em>' attribute.
	 * @see #getMatchedInput()
	 * @generated
	 */
	void setMatchedInput(String value);

	/**
	 * Returns the value of the '<em><b>Recognition Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognition Confidence</em>' attribute.
	 * @see #setRecognitionConfidence(float)
	 * @see com.xatkit.intent.IntentPackage#getRecognizedIntent_RecognitionConfidence()
	 * @model unique="false"
	 * @generated
	 */
	float getRecognitionConfidence();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.RecognizedIntent#getRecognitionConfidence <em>Recognition Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognition Confidence</em>' attribute.
	 * @see #getRecognitionConfidence()
	 * @generated
	 */
	void setRecognitionConfidence(float value);

	/**
	 * Returns the value of the '<em><b>Nlp Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nlp Data</em>' attribute.
	 * @see #setNlpData(Map)
	 * @see com.xatkit.intent.IntentPackage#getRecognizedIntent_NlpData()
	 * @model unique="false" dataType="com.xatkit.intent.NlpDataMap"
	 * @generated
	 */
	Map<String, Object> getNlpData();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.RecognizedIntent#getNlpData <em>Nlp Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nlp Data</em>' attribute.
	 * @see #getNlpData()
	 * @generated
	 */
	void setNlpData(Map<String, Object> value);

} // RecognizedIntent

/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.IntentDefinition#getTrainingSentences <em>Training Sentences</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getIntentDefinition()
 * @model
 * @generated
 */
public interface IntentDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Training Sentences</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Sentences</em>' attribute list.
	 * @see com.xatkit.intent.IntentPackage#getIntentDefinition_TrainingSentences()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTrainingSentences();

} // IntentDefinition

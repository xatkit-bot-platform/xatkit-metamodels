/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Entity Definition Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.MappingEntityDefinitionEntry#getReferenceValue <em>Reference Value</em>}</li>
 *   <li>{@link com.xatkit.intent.MappingEntityDefinitionEntry#getSynonyms <em>Synonyms</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getMappingEntityDefinitionEntry()
 * @model
 * @generated
 */
public interface MappingEntityDefinitionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Value</em>' attribute.
	 * @see #setReferenceValue(String)
	 * @see com.xatkit.intent.IntentPackage#getMappingEntityDefinitionEntry_ReferenceValue()
	 * @model unique="false"
	 * @generated
	 */
	String getReferenceValue();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.MappingEntityDefinitionEntry#getReferenceValue <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Value</em>' attribute.
	 * @see #getReferenceValue()
	 * @generated
	 */
	void setReferenceValue(String value);

	/**
	 * Returns the value of the '<em><b>Synonyms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonyms</em>' attribute list.
	 * @see com.xatkit.intent.IntentPackage#getMappingEntityDefinitionEntry_Synonyms()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSynonyms();

} // MappingEntityDefinitionEntry

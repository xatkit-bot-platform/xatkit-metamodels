/**
 */
package com.xatkit.intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Text Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.EntityTextFragment#getEntityReference <em>Entity Reference</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getEntityTextFragment()
 * @model
 * @generated
 */
public interface EntityTextFragment extends TextFragment {
	/**
	 * Returns the value of the '<em><b>Entity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Reference</em>' containment reference.
	 * @see #setEntityReference(EntityDefinitionReference)
	 * @see com.xatkit.intent.IntentPackage#getEntityTextFragment_EntityReference()
	 * @model containment="true"
	 * @generated
	 */
	EntityDefinitionReference getEntityReference();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.EntityTextFragment#getEntityReference <em>Entity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Reference</em>' containment reference.
	 * @see #getEntityReference()
	 * @generated
	 */
	void setEntityReference(EntityDefinitionReference value);

} // EntityTextFragment

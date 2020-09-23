/**
 */
package com.xatkit.intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Entity Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.CustomEntityDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getCustomEntityDefinition()
 * @model abstract="true"
 * @generated
 */
public interface CustomEntityDefinition extends EntityDefinition {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xatkit.intent.IntentPackage#getCustomEntityDefinition_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.CustomEntityDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CustomEntityDefinition

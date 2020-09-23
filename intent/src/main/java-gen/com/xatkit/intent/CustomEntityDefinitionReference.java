/**
 */
package com.xatkit.intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Entity Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.CustomEntityDefinitionReference#getCustomEntity <em>Custom Entity</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getCustomEntityDefinitionReference()
 * @model
 * @generated
 */
public interface CustomEntityDefinitionReference extends EntityDefinitionReference {
	/**
	 * Returns the value of the '<em><b>Custom Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entity</em>' reference.
	 * @see #setCustomEntity(CustomEntityDefinition)
	 * @see com.xatkit.intent.IntentPackage#getCustomEntityDefinitionReference_CustomEntity()
	 * @model
	 * @generated
	 */
	CustomEntityDefinition getCustomEntity();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.CustomEntityDefinitionReference#getCustomEntity <em>Custom Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Entity</em>' reference.
	 * @see #getCustomEntity()
	 * @generated
	 */
	void setCustomEntity(CustomEntityDefinition value);

} // CustomEntityDefinitionReference

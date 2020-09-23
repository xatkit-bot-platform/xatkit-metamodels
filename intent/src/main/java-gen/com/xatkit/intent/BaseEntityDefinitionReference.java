/**
 */
package com.xatkit.intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Entity Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.BaseEntityDefinitionReference#getBaseEntity <em>Base Entity</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getBaseEntityDefinitionReference()
 * @model
 * @generated
 */
public interface BaseEntityDefinitionReference extends EntityDefinitionReference {
	/**
	 * Returns the value of the '<em><b>Base Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Entity</em>' containment reference.
	 * @see #setBaseEntity(BaseEntityDefinition)
	 * @see com.xatkit.intent.IntentPackage#getBaseEntityDefinitionReference_BaseEntity()
	 * @model containment="true"
	 * @generated
	 */
	BaseEntityDefinition getBaseEntity();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.BaseEntityDefinitionReference#getBaseEntity <em>Base Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Entity</em>' containment reference.
	 * @see #getBaseEntity()
	 * @generated
	 */
	void setBaseEntity(BaseEntityDefinition value);

} // BaseEntityDefinitionReference

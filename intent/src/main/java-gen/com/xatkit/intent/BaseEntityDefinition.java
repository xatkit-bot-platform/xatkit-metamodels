/**
 */
package com.xatkit.intent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Entity Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.BaseEntityDefinition#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getBaseEntityDefinition()
 * @model
 * @generated
 */
public interface BaseEntityDefinition extends EntityDefinition {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.xatkit.intent.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see com.xatkit.intent.EntityType
	 * @see #setEntityType(EntityType)
	 * @see com.xatkit.intent.IntentPackage#getBaseEntityDefinition_EntityType()
	 * @model unique="false"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.BaseEntityDefinition#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see com.xatkit.intent.EntityType
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

} // BaseEntityDefinition

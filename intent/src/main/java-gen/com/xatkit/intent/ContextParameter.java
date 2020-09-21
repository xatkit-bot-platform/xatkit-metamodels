/**
 */
package com.xatkit.intent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.ContextParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.intent.ContextParameter#getTextFragment <em>Text Fragment</em>}</li>
 *   <li>{@link com.xatkit.intent.ContextParameter#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getContextParameter()
 * @model
 * @generated
 */
public interface ContextParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xatkit.intent.IntentPackage#getContextParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.ContextParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Fragment</em>' attribute.
	 * @see #setTextFragment(String)
	 * @see com.xatkit.intent.IntentPackage#getContextParameter_TextFragment()
	 * @model unique="false"
	 * @generated
	 */
	String getTextFragment();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.ContextParameter#getTextFragment <em>Text Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Fragment</em>' attribute.
	 * @see #getTextFragment()
	 * @generated
	 */
	void setTextFragment(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityDefinitionReference)
	 * @see com.xatkit.intent.IntentPackage#getContextParameter_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EntityDefinitionReference getEntity();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.ContextParameter#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityDefinitionReference value);

} // ContextParameter

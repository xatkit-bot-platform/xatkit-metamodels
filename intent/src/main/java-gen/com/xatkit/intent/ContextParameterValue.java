/**
 */
package com.xatkit.intent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.ContextParameterValue#getContextParameter <em>Context Parameter</em>}</li>
 *   <li>{@link com.xatkit.intent.ContextParameterValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getContextParameterValue()
 * @model
 * @generated
 */
public interface ContextParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameter</em>' reference.
	 * @see #setContextParameter(ContextParameter)
	 * @see com.xatkit.intent.IntentPackage#getContextParameterValue_ContextParameter()
	 * @model
	 * @generated
	 */
	ContextParameter getContextParameter();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.ContextParameterValue#getContextParameter <em>Context Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Parameter</em>' reference.
	 * @see #getContextParameter()
	 * @generated
	 */
	void setContextParameter(ContextParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see com.xatkit.intent.IntentPackage#getContextParameterValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.ContextParameterValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // ContextParameterValue

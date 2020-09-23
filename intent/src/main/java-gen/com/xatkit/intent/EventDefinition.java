/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.EventDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.intent.EventDefinition#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getEventDefinition()
 * @model
 * @generated
 */
public interface EventDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xatkit.intent.IntentPackage#getEventDefinition_Name()
	 * @model unique="false"
	 * @NotGenerated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.EventDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @NotGenerated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.ContextParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getEventDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextParameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" parameterNameUnique="false"
	 * @NotGenerated
	 */
	ContextParameter getParameter(String parameterName);

} // EventDefinition

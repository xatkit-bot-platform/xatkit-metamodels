/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.Library#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.intent.Library#getCustomEntities <em>Custom Entities</em>}</li>
 *   <li>{@link com.xatkit.intent.Library#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xatkit.intent.IntentPackage#getLibrary_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Custom Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.CustomEntityDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entities</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getLibrary_CustomEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomEntityDefinition> getCustomEntities();

	/**
	 * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definitions</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getLibrary_EventDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitions();

} // Library

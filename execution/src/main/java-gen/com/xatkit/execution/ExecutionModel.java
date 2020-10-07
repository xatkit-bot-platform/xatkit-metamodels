/**
 */
package com.xatkit.execution;

import com.xatkit.intent.EventDefinition;

import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getUsedEvents <em>Used Events</em>}</li>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getUsedPlatforms <em>Used Platforms</em>}</li>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getUsedProviders <em>Used Providers</em>}</li>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getStates <em>States</em>}</li>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getInitState <em>Init State</em>}</li>
 *   <li>{@link com.xatkit.execution.ExecutionModel#getDefaultFallbackState <em>Default Fallback State</em>}</li>
 * </ul>
 *
 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel()
 * @model
 * @generated
 */
public interface ExecutionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Used Events</b></em>' reference list.
	 * The list contents are of type {@link com.xatkit.intent.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Events</em>' reference list.
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_UsedEvents()
	 * @model
	 * @generated
	 */
	EList<EventDefinition> getUsedEvents();

	/**
	 * Returns the value of the '<em><b>Used Platforms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Platforms</em>' attribute list.
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_UsedPlatforms()
	 * @model unique="false" dataType="com.xatkit.execution.Platform"
	 * @generated
	 */
	EList<Object> getUsedPlatforms();

	/**
	 * Returns the value of the '<em><b>Used Providers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Providers</em>' attribute list.
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_UsedProviders()
	 * @model unique="false" dataType="com.xatkit.execution.Provider"
	 * @generated
	 */
	EList<Object> getUsedProviders();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.execution.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init State</em>' reference.
	 * @see #setInitState(State)
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_InitState()
	 * @model
	 * @generated
	 */
	State getInitState();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.ExecutionModel#getInitState <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init State</em>' reference.
	 * @see #getInitState()
	 * @generated
	 */
	void setInitState(State value);

	/**
	 * Returns the value of the '<em><b>Default Fallback State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Fallback State</em>' reference.
	 * @see #setDefaultFallbackState(State)
	 * @see com.xatkit.execution.ExecutionPackage#getExecutionModel_DefaultFallbackState()
	 * @model
	 * @generated
	 */
	State getDefaultFallbackState();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.ExecutionModel#getDefaultFallbackState <em>Default Fallback State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Fallback State</em>' reference.
	 * @see #getDefaultFallbackState()
	 * @generated
	 */
	void setDefaultFallbackState(State value);

	/**
	 * @NotGenerated
	 */
	void consolidate();

	/**
	 * @NotGenerated
	 * @return
	 */
	Set<EventDefinition> getAllAccessedEvents();

} // ExecutionModel

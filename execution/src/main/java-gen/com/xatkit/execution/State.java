/**
 */
package com.xatkit.execution;

import java.util.Collection;
import java.util.function.Consumer;

import com.xatkit.intent.EventDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.xatkit.intent.IntentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.State#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.execution.State#getBody <em>Body</em>}</li>
 *   <li>{@link com.xatkit.execution.State#getFallback <em>Fallback</em>}</li>
 *   <li>{@link com.xatkit.execution.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see com.xatkit.execution.ExecutionPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xatkit.execution.ExecutionPackage#getState_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(Consumer)
	 * @see com.xatkit.execution.ExecutionPackage#getState_Body()
	 * @model unique="false" dataType="com.xatkit.execution.Consumer"
	 * @generated
	 */
	Consumer<StateContext> getBody();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.State#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Consumer<StateContext> value);

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' attribute.
	 * @see #setFallback(Consumer)
	 * @see com.xatkit.execution.ExecutionPackage#getState_Fallback()
	 * @model unique="false" dataType="com.xatkit.execution.Consumer"
	 * @generated
	 */
	Consumer<StateContext> getFallback();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.State#getFallback <em>Fallback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback</em>' attribute.
	 * @see #getFallback()
	 * @generated
	 */
	void setFallback(Consumer<StateContext> value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.execution.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see com.xatkit.execution.ExecutionPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * @NotGenerated
	 */
	Collection<IntentDefinition> getAllAccessedIntents();

	/**
	 * @NotGenerated
	 */
	Collection<EventDefinition> getAllAccessedEvents();

	/**
	 * @NotGenerated
	 * @return
	 */
	State getStateReachableWithWildcard();

	/**
	 * @NotGenerated
	 */
	void useUnsafeTransitions(boolean flag);

	/**
	 * @NotGenerated
	 */
	boolean useUnsafeTransitions();

} // State

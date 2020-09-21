/**
 */
package com.xatkit.execution;

import com.xatkit.intent.EventInstance;
import com.xatkit.intent.RecognizedIntent;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.StateContext#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link com.xatkit.execution.StateContext#getSession <em>Session</em>}</li>
 *   <li>{@link com.xatkit.execution.StateContext#getEventInstance <em>Event Instance</em>}</li>
 *   <li>{@link com.xatkit.execution.StateContext#getContextId <em>Context Id</em>}</li>
 *   <li>{@link com.xatkit.execution.StateContext#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.xatkit.execution.StateContext#getState <em>State</em>}</li>
 * </ul>
 *
 * @see com.xatkit.execution.ExecutionPackage#getStateContext()
 * @model
 * @generated
 */
public interface StateContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(Map)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_Configuration()
	 * @model unique="false" dataType="com.xatkit.execution.ConfigurationMap"
	 * @generated
	 */
	Map<Object, Object> getConfiguration();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Map<Object, Object> value);

	/**
	 * Returns the value of the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' attribute.
	 * @see #setSession(Map)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_Session()
	 * @model unique="false" dataType="com.xatkit.execution.SessionMap"
	 * @generated
	 */
	Map<Object, Object> getSession();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getSession <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' attribute.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(Map<Object, Object> value);

	/**
	 * Returns the value of the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Instance</em>' reference.
	 * @see #setEventInstance(EventInstance)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_EventInstance()
	 * @model
	 * @generated
	 */
	EventInstance getEventInstance();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getEventInstance <em>Event Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Instance</em>' reference.
	 * @see #getEventInstance()
	 * @generated
	 */
	void setEventInstance(EventInstance value);

	/**
	 * Returns the value of the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Id</em>' attribute.
	 * @see #setContextId(String)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_ContextId()
	 * @model unique="false"
	 * @generated
	 */
	String getContextId();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getContextId <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Id</em>' attribute.
	 * @see #getContextId()
	 * @generated
	 */
	void setContextId(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_Origin()
	 * @model unique="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see com.xatkit.execution.ExecutionPackage#getStateContext_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.StateContext#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @NotGenerated
	 */
	RecognizedIntent getIntent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherUnique="false"
	 * @NotGenerated
	 */
	void merge(StateContext other);

} // StateContext

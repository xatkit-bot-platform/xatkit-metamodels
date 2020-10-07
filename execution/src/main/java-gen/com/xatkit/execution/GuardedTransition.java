/**
 */
package com.xatkit.execution;

import java.util.Collection;
import java.util.function.Predicate;

import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.IntentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.GuardedTransition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.xatkit.execution.ExecutionPackage#getGuardedTransition()
 * @model
 * @generated
 */
public interface GuardedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Predicate)
	 * @see com.xatkit.execution.ExecutionPackage#getGuardedTransition_Condition()
	 * @model unique="false" dataType="com.xatkit.execution.Predicate"
	 * @generated
	 */
	Predicate<StateContext> getCondition();

	/**
	 * Sets the value of the '{@link com.xatkit.execution.GuardedTransition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Predicate<StateContext> value);

	/**
	 * @NotGenerated
	 */
	Collection<EventDefinition> getAccessedEvents();
	
	/**
	 * @NotGenerated
	 */
	Collection<IntentDefinition> getAccessedIntents();
	
} // GuardedTransition

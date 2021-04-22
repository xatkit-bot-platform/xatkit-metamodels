/**
 *
 */
package com.xatkit.execution.impl;

import com.xatkit.execution.ExecutionPackage;
import com.xatkit.execution.GuardedTransition;
import com.xatkit.execution.StateContext;
import com.xatkit.execution.predicate.ComposedPredicate;
import com.xatkit.execution.predicate.IsEventDefinitionPredicate;
import com.xatkit.execution.predicate.IsIntentDefinitionPredicate;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.IntentDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guarded Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.impl.GuardedTransitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardedTransitionImpl extends TransitionImpl implements GuardedTransition {
    /**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
    protected Predicate<StateContext> condition;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GuardedTransitionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ExecutionPackage.Literals.GUARDED_TRANSITION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Predicate<StateContext> getCondition() {
		return condition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setCondition(Predicate<StateContext> newCondition) {
		Predicate<StateContext> oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.GUARDED_TRANSITION__CONDITION, oldCondition, condition));
	}

    /**
     * @NotGenerated
     * @return
     */
    @Override
    public Collection<IntentDefinition> getAccessedIntents() {
        return this.getAccessedEvents().stream().filter(e -> e instanceof IntentDefinition).map(e -> (IntentDefinition) e).collect(Collectors.toList());
    }

    /**
     * @NotGenerated
     */
    @Override
    public Collection<EventDefinition> getAccessedEvents() {
        return this.getAccessedEvents(this.getCondition(), new HashSet<>());
    }

    /**
     * @NotGenerated
     * @param predicate
     * @param result
     * @return
     */
    private Collection<EventDefinition> getAccessedEvents(Predicate<? super StateContext> predicate,
                                                          Set<EventDefinition> result) {
        if (predicate instanceof IsEventDefinitionPredicate) {
            result.add(((IsEventDefinitionPredicate) predicate).getEventDefinition());
        } else if (predicate instanceof IsIntentDefinitionPredicate) {
			result.add(((IsIntentDefinitionPredicate) predicate).getIntentDefinition());
        } else if (predicate instanceof ComposedPredicate) {
            ComposedPredicate<? super StateContext> composedPredicate =
                    (ComposedPredicate<? super StateContext>) predicate;
            getAccessedEvents(composedPredicate.getP1(), result);
            getAccessedEvents(composedPredicate.getP2(), result);
        }
        return result;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.GUARDED_TRANSITION__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.GUARDED_TRANSITION__CONDITION:
				setCondition((Predicate<StateContext>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionPackage.GUARDED_TRANSITION__CONDITION:
				setCondition((Predicate<StateContext>)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionPackage.GUARDED_TRANSITION__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //GuardedTransitionImpl

/**
 */
package com.xatkit.execution.impl;

import com.xatkit.execution.AutoTransition;
import com.xatkit.execution.ExecutionPackage;
import com.xatkit.execution.GuardedTransition;
import com.xatkit.execution.State;
import com.xatkit.execution.StateContext;
import com.xatkit.execution.Transition;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.IntentDefinition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import static java.util.Objects.nonNull;

import java.text.MessageFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Consumer<StateContext> body;

	/**
	 * The cached value of the '{@link #getFallback() <em>Fallback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallback()
	 * @generated
	 * @ordered
	 */
	protected Consumer<StateContext> fallback;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	private boolean useUnsafeTransitions = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer<StateContext> getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Consumer<StateContext> newBody) {
		Consumer<StateContext> oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer<StateContext> getFallback() {
		return fallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFallback(Consumer<StateContext> newFallback) {
		Consumer<StateContext> oldFallback = fallback;
		fallback = newFallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__FALLBACK, oldFallback, fallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, ExecutionPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * @NotGenerated
	 */
	@Override
	public Collection<IntentDefinition> getAllAccessedIntents() {
		List<IntentDefinition> result = new ArrayList<>();
		for(Transition t : this.getTransitions()) {
			if(t instanceof GuardedTransition) {
				GuardedTransition guardedTransition = (GuardedTransition) t;
				result.addAll(guardedTransition.getAccessedIntents());
			}
		}
		return result;
	}

	@Override
	public Collection<EventDefinition> getAllAccessedEvents() {
		List<EventDefinition> result = new ArrayList<>();
		for(Transition t : this.getTransitions()) {
			if(t instanceof GuardedTransition) {
				GuardedTransition guardedTransition = (GuardedTransition) t;
				result.addAll(guardedTransition.getAccessedEvents());
			}
		}
		return result;
	}

	/**
	 * @NotGenerated
	 */
	@Override
	public State getStateReachableWithWildcard() {
		State result = null;
		if(this.getTransitions().stream().anyMatch(t -> t instanceof AutoTransition)) {
			if(this.getTransitions().size() > 1) {
				throw new IllegalArgumentException(MessageFormat.format("The provided state {0} contains more than 1 " +
                        "transition and at least one is a wildcard", this.getName()));
			} else {
				result = this.getTransitions().get(0).getState();
			}
		}
		return result;
	}

	@Override
	public void useUnsafeTransitions(boolean flag) {
		this.useUnsafeTransitions = flag;
	}

	@Override
	public boolean useUnsafeTransitions() {
		return this.useUnsafeTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.STATE__NAME:
				return getName();
			case ExecutionPackage.STATE__BODY:
				return getBody();
			case ExecutionPackage.STATE__FALLBACK:
				return getFallback();
			case ExecutionPackage.STATE__TRANSITIONS:
				return getTransitions();
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
			case ExecutionPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case ExecutionPackage.STATE__BODY:
				setBody((Consumer<StateContext>)newValue);
				return;
			case ExecutionPackage.STATE__FALLBACK:
				setFallback((Consumer<StateContext>)newValue);
				return;
			case ExecutionPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case ExecutionPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutionPackage.STATE__BODY:
				setBody((Consumer<StateContext>)null);
				return;
			case ExecutionPackage.STATE__FALLBACK:
				setFallback((Consumer<StateContext>)null);
				return;
			case ExecutionPackage.STATE__TRANSITIONS:
				getTransitions().clear();
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
			case ExecutionPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutionPackage.STATE__BODY:
				return body != null;
			case ExecutionPackage.STATE__FALLBACK:
				return fallback != null;
			case ExecutionPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", body: ");
		result.append(body);
		result.append(", fallback: ");
		result.append(fallback);
		result.append(')');
		return result.toString();
	}

} //StateImpl

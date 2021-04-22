/**
 */
package com.xatkit.execution.impl;

import com.xatkit.execution.ExecutionModel;
import com.xatkit.execution.ExecutionPackage;
import com.xatkit.execution.GuardedTransition;
import com.xatkit.execution.State;

import com.xatkit.execution.Transition;
import com.xatkit.intent.EventDefinition;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import static java.util.Objects.nonNull;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getUsedEvents <em>Used Events</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getUsedPlatforms <em>Used Platforms</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getUsedProviders <em>Used Providers</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getInitState <em>Init State</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.ExecutionModelImpl#getDefaultFallbackState <em>Default Fallback State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionModelImpl extends MinimalEObjectImpl.Container implements ExecutionModel {
	/**
	 * The cached value of the '{@link #getUsedEvents() <em>Used Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> usedEvents;

	/**
	 * The cached value of the '{@link #getUsedPlatforms() <em>Used Platforms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> usedPlatforms;

	/**
	 * The cached value of the '{@link #getUsedProviders() <em>Used Providers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> usedProviders;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitState() <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected State initState;

	/**
	 * The cached value of the '{@link #getDefaultFallbackState() <em>Default Fallback State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFallbackState()
	 * @generated
	 * @ordered
	 */
	protected State defaultFallbackState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.EXECUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDefinition> getUsedEvents() {
		if (usedEvents == null) {
			usedEvents = new EObjectResolvingEList<EventDefinition>(EventDefinition.class, this, ExecutionPackage.EXECUTION_MODEL__USED_EVENTS);
		}
		return usedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getUsedPlatforms() {
		if (usedPlatforms == null) {
			usedPlatforms = new EDataTypeEList<Object>(Object.class, this, ExecutionPackage.EXECUTION_MODEL__USED_PLATFORMS);
		}
		return usedPlatforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getUsedProviders() {
		if (usedProviders == null) {
			usedProviders = new EDataTypeEList<Object>(Object.class, this, ExecutionPackage.EXECUTION_MODEL__USED_PROVIDERS);
		}
		return usedProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ExecutionPackage.EXECUTION_MODEL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getInitState() {
		if (initState != null && initState.eIsProxy()) {
			InternalEObject oldInitState = (InternalEObject)initState;
			initState = (State)eResolveProxy(oldInitState);
			if (initState != oldInitState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.EXECUTION_MODEL__INIT_STATE, oldInitState, initState));
			}
		}
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitState() {
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitState(State newInitState) {
		State oldInitState = initState;
		initState = newInitState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.EXECUTION_MODEL__INIT_STATE, oldInitState, initState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getDefaultFallbackState() {
		if (defaultFallbackState != null && defaultFallbackState.eIsProxy()) {
			InternalEObject oldDefaultFallbackState = (InternalEObject)defaultFallbackState;
			defaultFallbackState = (State)eResolveProxy(oldDefaultFallbackState);
			if (defaultFallbackState != oldDefaultFallbackState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE, oldDefaultFallbackState, defaultFallbackState));
			}
		}
		return defaultFallbackState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDefaultFallbackState() {
		return defaultFallbackState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFallbackState(State newDefaultFallbackState) {
		State oldDefaultFallbackState = defaultFallbackState;
		defaultFallbackState = newDefaultFallbackState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE, oldDefaultFallbackState, defaultFallbackState));
	}

	/**
	 * @NotGenerated
	 */
	public void consolidate() {
		if(nonNull(this.getInitState())) {
			Collection<State> allAccessibleStates = getAllAccessibleStates(this.getInitState(), new HashSet<>());
			this.getStates().addAll(allAccessibleStates);
			for(State s : this.getStates()) {
				this.getUsedEvents().addAll(s.getAllAccessedEvents());
			}
		}
	}

	/**
	 * @NotGenerated
	 * @param fromState
	 * @param result
	 * @return
	 */
	private Collection<State> getAllAccessibleStates(State fromState, Set<State> result) {
		boolean added = result.add(fromState);
		if(added) {
			for(Transition t : fromState.getTransitions()) {
				getAllAccessibleStates(t.getState(), result);
			}
		}
		return result;
	}

	/**
	 * @NotGenerated
	 */
	@Override
	public Set<EventDefinition> getAllAccessedEvents() {
		Set<EventDefinition> result = new HashSet<>();
		StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.eAllContents(), Spliterator.ORDERED), false)
			.filter(e -> e instanceof GuardedTransition)
			.forEach(t -> {
				result.addAll(((GuardedTransition) t).getAccessedEvents());
			});
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.EXECUTION_MODEL__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case ExecutionPackage.EXECUTION_MODEL__USED_EVENTS:
				return getUsedEvents();
			case ExecutionPackage.EXECUTION_MODEL__USED_PLATFORMS:
				return getUsedPlatforms();
			case ExecutionPackage.EXECUTION_MODEL__USED_PROVIDERS:
				return getUsedProviders();
			case ExecutionPackage.EXECUTION_MODEL__STATES:
				return getStates();
			case ExecutionPackage.EXECUTION_MODEL__INIT_STATE:
				if (resolve) return getInitState();
				return basicGetInitState();
			case ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE:
				if (resolve) return getDefaultFallbackState();
				return basicGetDefaultFallbackState();
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
			case ExecutionPackage.EXECUTION_MODEL__USED_EVENTS:
				getUsedEvents().clear();
				getUsedEvents().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case ExecutionPackage.EXECUTION_MODEL__USED_PLATFORMS:
				getUsedPlatforms().clear();
				getUsedPlatforms().addAll((Collection<? extends Object>)newValue);
				return;
			case ExecutionPackage.EXECUTION_MODEL__USED_PROVIDERS:
				getUsedProviders().clear();
				getUsedProviders().addAll((Collection<? extends Object>)newValue);
				return;
			case ExecutionPackage.EXECUTION_MODEL__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ExecutionPackage.EXECUTION_MODEL__INIT_STATE:
				setInitState((State)newValue);
				return;
			case ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE:
				setDefaultFallbackState((State)newValue);
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
			case ExecutionPackage.EXECUTION_MODEL__USED_EVENTS:
				getUsedEvents().clear();
				return;
			case ExecutionPackage.EXECUTION_MODEL__USED_PLATFORMS:
				getUsedPlatforms().clear();
				return;
			case ExecutionPackage.EXECUTION_MODEL__USED_PROVIDERS:
				getUsedProviders().clear();
				return;
			case ExecutionPackage.EXECUTION_MODEL__STATES:
				getStates().clear();
				return;
			case ExecutionPackage.EXECUTION_MODEL__INIT_STATE:
				setInitState((State)null);
				return;
			case ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE:
				setDefaultFallbackState((State)null);
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
			case ExecutionPackage.EXECUTION_MODEL__USED_EVENTS:
				return usedEvents != null && !usedEvents.isEmpty();
			case ExecutionPackage.EXECUTION_MODEL__USED_PLATFORMS:
				return usedPlatforms != null && !usedPlatforms.isEmpty();
			case ExecutionPackage.EXECUTION_MODEL__USED_PROVIDERS:
				return usedProviders != null && !usedProviders.isEmpty();
			case ExecutionPackage.EXECUTION_MODEL__STATES:
				return states != null && !states.isEmpty();
			case ExecutionPackage.EXECUTION_MODEL__INIT_STATE:
				return initState != null;
			case ExecutionPackage.EXECUTION_MODEL__DEFAULT_FALLBACK_STATE:
				return defaultFallbackState != null;
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
		result.append(" (usedPlatforms: ");
		result.append(usedPlatforms);
		result.append(", usedProviders: ");
		result.append(usedProviders);
		result.append(')');
		return result.toString();
	}

} //ExecutionModelImpl

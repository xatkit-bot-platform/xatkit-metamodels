/**
 */
package com.xatkit.execution.impl;

import com.xatkit.execution.ExecutionPackage;
import com.xatkit.execution.State;
import com.xatkit.execution.StateContext;

import com.xatkit.intent.EventInstance;
import com.xatkit.intent.RecognizedIntent;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getSession <em>Session</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getEventInstance <em>Event Instance</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getContextId <em>Context Id</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.xatkit.execution.impl.StateContextImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateContextImpl extends MinimalEObjectImpl.Container implements StateContext {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Map<Object, Object> configuration;

	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected Map<Object, Object> session;

	/**
	 * The cached value of the '{@link #getEventInstance() <em>Event Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventInstance()
	 * @generated
	 * @ordered
	 */
	protected EventInstance eventInstance;

	/**
	 * The default value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected String contextId = CONTEXT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	protected StateContextImpl() {
		super();
		this.configuration = new HashMap<>();
		this.session = new HashMap<>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.STATE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<Object, Object> getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(Map<Object, Object> newConfiguration) {
		Map<Object, Object> oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<Object, Object> getSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSession(Map<Object, Object> newSession) {
		Map<Object, Object> oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__SESSION, oldSession, session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventInstance getEventInstance() {
		if (eventInstance != null && eventInstance.eIsProxy()) {
			InternalEObject oldEventInstance = (InternalEObject)eventInstance;
			eventInstance = (EventInstance)eResolveProxy(oldEventInstance);
			if (eventInstance != oldEventInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE, oldEventInstance, eventInstance));
			}
		}
		return eventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInstance basicGetEventInstance() {
		return eventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventInstance(EventInstance newEventInstance) {
		EventInstance oldEventInstance = eventInstance;
		eventInstance = newEventInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE, oldEventInstance, eventInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextId() {
		return contextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextId(String newContextId) {
		String oldContextId = contextId;
		contextId = newContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__CONTEXT_ID, oldContextId, contextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.STATE_CONTEXT__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE_CONTEXT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	@Override
	public RecognizedIntent getIntent() {
		if(this.getEventInstance() instanceof RecognizedIntent) {
			return (RecognizedIntent) this.getEventInstance();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	@Override
	public void merge(final StateContext other) {
		// TODO implement this if needed
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.STATE_CONTEXT__CONFIGURATION:
				return getConfiguration();
			case ExecutionPackage.STATE_CONTEXT__SESSION:
				return getSession();
			case ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE:
				if (resolve) return getEventInstance();
				return basicGetEventInstance();
			case ExecutionPackage.STATE_CONTEXT__CONTEXT_ID:
				return getContextId();
			case ExecutionPackage.STATE_CONTEXT__ORIGIN:
				return getOrigin();
			case ExecutionPackage.STATE_CONTEXT__STATE:
				if (resolve) return getState();
				return basicGetState();
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
			case ExecutionPackage.STATE_CONTEXT__CONFIGURATION:
				setConfiguration((Map<Object, Object>)newValue);
				return;
			case ExecutionPackage.STATE_CONTEXT__SESSION:
				setSession((Map<Object, Object>)newValue);
				return;
			case ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE:
				setEventInstance((EventInstance)newValue);
				return;
			case ExecutionPackage.STATE_CONTEXT__CONTEXT_ID:
				setContextId((String)newValue);
				return;
			case ExecutionPackage.STATE_CONTEXT__ORIGIN:
				setOrigin((String)newValue);
				return;
			case ExecutionPackage.STATE_CONTEXT__STATE:
				setState((State)newValue);
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
			case ExecutionPackage.STATE_CONTEXT__CONFIGURATION:
				setConfiguration((Map<Object, Object>)null);
				return;
			case ExecutionPackage.STATE_CONTEXT__SESSION:
				setSession((Map<Object, Object>)null);
				return;
			case ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE:
				setEventInstance((EventInstance)null);
				return;
			case ExecutionPackage.STATE_CONTEXT__CONTEXT_ID:
				setContextId(CONTEXT_ID_EDEFAULT);
				return;
			case ExecutionPackage.STATE_CONTEXT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case ExecutionPackage.STATE_CONTEXT__STATE:
				setState((State)null);
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
			case ExecutionPackage.STATE_CONTEXT__CONFIGURATION:
				return configuration != null;
			case ExecutionPackage.STATE_CONTEXT__SESSION:
				return session != null;
			case ExecutionPackage.STATE_CONTEXT__EVENT_INSTANCE:
				return eventInstance != null;
			case ExecutionPackage.STATE_CONTEXT__CONTEXT_ID:
				return CONTEXT_ID_EDEFAULT == null ? contextId != null : !CONTEXT_ID_EDEFAULT.equals(contextId);
			case ExecutionPackage.STATE_CONTEXT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case ExecutionPackage.STATE_CONTEXT__STATE:
				return state != null;
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
		result.append(" (configuration: ");
		result.append(configuration);
		result.append(", session: ");
		result.append(session);
		result.append(", contextId: ");
		result.append(contextId);
		result.append(", origin: ");
		result.append(origin);
		result.append(')');
		return result.toString();
	}

} //StateContextImpl

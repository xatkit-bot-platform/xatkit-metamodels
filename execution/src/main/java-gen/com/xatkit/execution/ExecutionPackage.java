/**
 */
package com.xatkit.execution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.xatkit.execution.ExecutionFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.xatkit.execution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "execution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = com.xatkit.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.ExecutionModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.ExecutionModelImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getExecutionModel()
	 * @generated
	 */
	int EXECUTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Used Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__USED_EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Used Platforms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__USED_PLATFORMS = 1;

	/**
	 * The feature id for the '<em><b>Used Providers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__USED_PROVIDERS = 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__STATES = 3;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__INIT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Default Fallback State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__DEFAULT_FALLBACK_STATE = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.StateImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BODY = 1;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FALLBACK = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.TransitionImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE = 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.GuardedTransitionImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getGuardedTransition()
	 * @generated
	 */
	int GUARDED_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__STATE = TRANSITION__STATE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__CONDITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.AutoTransitionImpl <em>Auto Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.AutoTransitionImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getAutoTransition()
	 * @generated
	 */
	int AUTO_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_TRANSITION__STATE = TRANSITION__STATE;

	/**
	 * The number of structural features of the '<em>Auto Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.execution.impl.StateContextImpl <em>State Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.execution.impl.StateContextImpl
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getStateContext()
	 * @generated
	 */
	int STATE_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__SESSION = 1;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__EVENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__CONTEXT_ID = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT__STATE = 5;

	/**
	 * The number of structural features of the '<em>State Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>Configuration Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getConfigurationMap()
	 * @generated
	 */
	int CONFIGURATION_MAP = 6;

	/**
	 * The meta object id for the '<em>Nlp Context Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getNlpContextMap()
	 * @generated
	 */
	int NLP_CONTEXT_MAP = 7;

	/**
	 * The meta object id for the '<em>Session Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getSessionMap()
	 * @generated
	 */
	int SESSION_MAP = 8;

	/**
	 * The meta object id for the '<em>Consumer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Consumer
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 9;

	/**
	 * The meta object id for the '<em>Predicate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Predicate
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 10;

	/**
	 * The meta object id for the '<em>Platform</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 11;

	/**
	 * The meta object id for the '<em>Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 12;


	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.ExecutionModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.xatkit.execution.ExecutionModel
	 * @generated
	 */
	EClass getExecutionModel();

	/**
	 * Returns the meta object for the reference list '{@link com.xatkit.execution.ExecutionModel#getUsedEvents <em>Used Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Events</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getUsedEvents()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_UsedEvents();

	/**
	 * Returns the meta object for the attribute list '{@link com.xatkit.execution.ExecutionModel#getUsedPlatforms <em>Used Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Platforms</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getUsedPlatforms()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EAttribute getExecutionModel_UsedPlatforms();

	/**
	 * Returns the meta object for the attribute list '{@link com.xatkit.execution.ExecutionModel#getUsedProviders <em>Used Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Providers</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getUsedProviders()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EAttribute getExecutionModel_UsedProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.execution.ExecutionModel#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getStates()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_States();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.execution.ExecutionModel#getInitState <em>Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init State</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getInitState()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_InitState();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.execution.ExecutionModel#getDefaultFallbackState <em>Default Fallback State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Fallback State</em>'.
	 * @see com.xatkit.execution.ExecutionModel#getDefaultFallbackState()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_DefaultFallbackState();

	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.xatkit.execution.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xatkit.execution.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.State#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.xatkit.execution.State#getBody()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Body();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.State#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallback</em>'.
	 * @see com.xatkit.execution.State#getFallback()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.execution.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see com.xatkit.execution.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.xatkit.execution.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.execution.Transition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see com.xatkit.execution.Transition#getState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_State();

	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.GuardedTransition <em>Guarded Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Transition</em>'.
	 * @see com.xatkit.execution.GuardedTransition
	 * @generated
	 */
	EClass getGuardedTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.GuardedTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.xatkit.execution.GuardedTransition#getCondition()
	 * @see #getGuardedTransition()
	 * @generated
	 */
	EAttribute getGuardedTransition_Condition();

	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.AutoTransition <em>Auto Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Transition</em>'.
	 * @see com.xatkit.execution.AutoTransition
	 * @generated
	 */
	EClass getAutoTransition();

	/**
	 * Returns the meta object for class '{@link com.xatkit.execution.StateContext <em>State Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Context</em>'.
	 * @see com.xatkit.execution.StateContext
	 * @generated
	 */
	EClass getStateContext();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.StateContext#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see com.xatkit.execution.StateContext#getConfiguration()
	 * @see #getStateContext()
	 * @generated
	 */
	EAttribute getStateContext_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.StateContext#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session</em>'.
	 * @see com.xatkit.execution.StateContext#getSession()
	 * @see #getStateContext()
	 * @generated
	 */
	EAttribute getStateContext_Session();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.execution.StateContext#getEventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Instance</em>'.
	 * @see com.xatkit.execution.StateContext#getEventInstance()
	 * @see #getStateContext()
	 * @generated
	 */
	EReference getStateContext_EventInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.StateContext#getContextId <em>Context Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Id</em>'.
	 * @see com.xatkit.execution.StateContext#getContextId()
	 * @see #getStateContext()
	 * @generated
	 */
	EAttribute getStateContext_ContextId();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.execution.StateContext#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see com.xatkit.execution.StateContext#getOrigin()
	 * @see #getStateContext()
	 * @generated
	 */
	EAttribute getStateContext_Origin();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.execution.StateContext#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see com.xatkit.execution.StateContext#getState()
	 * @see #getStateContext()
	 * @generated
	 */
	EReference getStateContext_State();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Configuration Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Configuration Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.Object, java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getConfigurationMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Nlp Context Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nlp Context Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.String, java.util.Map&lt;java.lang.String, java.lang.Object&gt;&gt;"
	 * @generated
	 */
	EDataType getNlpContextMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Session Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Session Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.Object, java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getSessionMap();

	/**
	 * Returns the meta object for data type '{@link java.util.function.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consumer</em>'.
	 * @see java.util.function.Consumer
	 * @model instanceClass="java.util.function.Consumer&lt;com.xatkit.execution.StateContext&gt;"
	 * @generated
	 */
	EDataType getConsumer();

	/**
	 * Returns the meta object for data type '{@link java.util.function.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Predicate</em>'.
	 * @see java.util.function.Predicate
	 * @model instanceClass="java.util.function.Predicate&lt;com.xatkit.execution.StateContext&gt;"
	 * @generated
	 */
	EDataType getPredicate();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Platform</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getPlatform();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Provider</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.ExecutionModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.ExecutionModelImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getExecutionModel()
		 * @generated
		 */
		EClass EXECUTION_MODEL = eINSTANCE.getExecutionModel();

		/**
		 * The meta object literal for the '<em><b>Used Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__USED_EVENTS = eINSTANCE.getExecutionModel_UsedEvents();

		/**
		 * The meta object literal for the '<em><b>Used Platforms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_MODEL__USED_PLATFORMS = eINSTANCE.getExecutionModel_UsedPlatforms();

		/**
		 * The meta object literal for the '<em><b>Used Providers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_MODEL__USED_PROVIDERS = eINSTANCE.getExecutionModel_UsedProviders();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__STATES = eINSTANCE.getExecutionModel_States();

		/**
		 * The meta object literal for the '<em><b>Init State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__INIT_STATE = eINSTANCE.getExecutionModel_InitState();

		/**
		 * The meta object literal for the '<em><b>Default Fallback State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__DEFAULT_FALLBACK_STATE = eINSTANCE.getExecutionModel_DefaultFallbackState();

		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.StateImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__BODY = eINSTANCE.getState_Body();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__FALLBACK = eINSTANCE.getState_Fallback();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.TransitionImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.GuardedTransitionImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getGuardedTransition()
		 * @generated
		 */
		EClass GUARDED_TRANSITION = eINSTANCE.getGuardedTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARDED_TRANSITION__CONDITION = eINSTANCE.getGuardedTransition_Condition();

		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.AutoTransitionImpl <em>Auto Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.AutoTransitionImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getAutoTransition()
		 * @generated
		 */
		EClass AUTO_TRANSITION = eINSTANCE.getAutoTransition();

		/**
		 * The meta object literal for the '{@link com.xatkit.execution.impl.StateContextImpl <em>State Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.execution.impl.StateContextImpl
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getStateContext()
		 * @generated
		 */
		EClass STATE_CONTEXT = eINSTANCE.getStateContext();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTEXT__CONFIGURATION = eINSTANCE.getStateContext_Configuration();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTEXT__SESSION = eINSTANCE.getStateContext_Session();

		/**
		 * The meta object literal for the '<em><b>Event Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTEXT__EVENT_INSTANCE = eINSTANCE.getStateContext_EventInstance();

		/**
		 * The meta object literal for the '<em><b>Context Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTEXT__CONTEXT_ID = eINSTANCE.getStateContext_ContextId();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTEXT__ORIGIN = eINSTANCE.getStateContext_Origin();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTEXT__STATE = eINSTANCE.getStateContext_State();

		/**
		 * The meta object literal for the '<em>Configuration Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getConfigurationMap()
		 * @generated
		 */
		EDataType CONFIGURATION_MAP = eINSTANCE.getConfigurationMap();

		/**
		 * The meta object literal for the '<em>Nlp Context Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getNlpContextMap()
		 * @generated
		 */
		EDataType NLP_CONTEXT_MAP = eINSTANCE.getNlpContextMap();

		/**
		 * The meta object literal for the '<em>Session Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getSessionMap()
		 * @generated
		 */
		EDataType SESSION_MAP = eINSTANCE.getSessionMap();

		/**
		 * The meta object literal for the '<em>Consumer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Consumer
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getConsumer()
		 * @generated
		 */
		EDataType CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em>Predicate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Predicate
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getPredicate()
		 * @generated
		 */
		EDataType PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em>Platform</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getPlatform()
		 * @generated
		 */
		EDataType PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em>Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.xatkit.execution.impl.ExecutionPackageImpl#getProvider()
		 * @generated
		 */
		EDataType PROVIDER = eINSTANCE.getProvider();

	}

} //ExecutionPackage

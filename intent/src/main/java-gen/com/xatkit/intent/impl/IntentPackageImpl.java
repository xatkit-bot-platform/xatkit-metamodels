/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.BaseEntityDefinition;
import com.xatkit.intent.BaseEntityDefinitionReference;
import com.xatkit.intent.CompositeEntityDefinition;
import com.xatkit.intent.CompositeEntityDefinitionEntry;
import com.xatkit.intent.ContextParameter;
import com.xatkit.intent.ContextParameterValue;
import com.xatkit.intent.CustomEntityDefinition;
import com.xatkit.intent.CustomEntityDefinitionReference;
import com.xatkit.intent.EntityDefinition;
import com.xatkit.intent.EntityDefinitionReference;
import com.xatkit.intent.EntityTextFragment;
import com.xatkit.intent.EntityType;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.EventInstance;
import com.xatkit.intent.IntentDefinition;
import com.xatkit.intent.IntentFactory;
import com.xatkit.intent.IntentPackage;
import com.xatkit.intent.Library;
import com.xatkit.intent.LiteralTextFragment;
import com.xatkit.intent.MappingEntityDefinition;
import com.xatkit.intent.MappingEntityDefinitionEntry;
import com.xatkit.intent.RecognizedIntent;
import com.xatkit.intent.TextFragment;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentPackageImpl extends EPackageImpl implements IntentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEntityDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEntityDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEntityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEntityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntityDefinitionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEntityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEntityDefinitionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTextFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTextFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nlpDataMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType platformDataMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.xatkit.intent.IntentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntentPackageImpl() {
		super(eNS_URI, IntentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IntentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntentPackage init() {
		if (isInited) return (IntentPackage)EPackage.Registry.INSTANCE.getEPackage(IntentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIntentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IntentPackageImpl theIntentPackage = registeredIntentPackage instanceof IntentPackageImpl ? (IntentPackageImpl)registeredIntentPackage : new IntentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntentPackage.createPackageContents();

		// Initialize created meta-data
		theIntentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntentPackage.eNS_URI, theIntentPackage);
		return theIntentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_CustomEntities() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_EventDefinitions() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDefinition() {
		return eventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventDefinition_Name() {
		return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventDefinition_Parameters() {
		return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntentDefinition() {
		return intentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntentDefinition_TrainingSentences() {
		return (EAttribute)intentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextParameter() {
		return contextParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextParameter_Name() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextParameter_TextFragments() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextParameter_Entity() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventInstance() {
		return eventInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventInstance_TriggeredBy() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventInstance_Definition() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventInstance_Values() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventInstance_PlatformData() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecognizedIntent() {
		return recognizedIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecognizedIntent_MatchedInput() {
		return (EAttribute)recognizedIntentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecognizedIntent_RecognitionConfidence() {
		return (EAttribute)recognizedIntentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecognizedIntent_NlpData() {
		return (EAttribute)recognizedIntentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextParameterValue() {
		return contextParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextParameterValue_ContextParameter() {
		return (EReference)contextParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextParameterValue_Value() {
		return (EAttribute)contextParameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityDefinitionReference() {
		return entityDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityDefinitionReference__GetReferredEntity() {
		return entityDefinitionReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseEntityDefinitionReference() {
		return baseEntityDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseEntityDefinitionReference_BaseEntity() {
		return (EReference)baseEntityDefinitionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEntityDefinitionReference() {
		return customEntityDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomEntityDefinitionReference_CustomEntity() {
		return (EReference)customEntityDefinitionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityDefinition() {
		return entityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityDefinition__GetName() {
		return entityDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseEntityDefinition() {
		return baseEntityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseEntityDefinition_EntityType() {
		return (EAttribute)baseEntityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEntityDefinition() {
		return customEntityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomEntityDefinition_Name() {
		return (EAttribute)customEntityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingEntityDefinition() {
		return mappingEntityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingEntityDefinition_Entries() {
		return (EReference)mappingEntityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingEntityDefinitionEntry() {
		return mappingEntityDefinitionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingEntityDefinitionEntry_ReferenceValue() {
		return (EAttribute)mappingEntityDefinitionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingEntityDefinitionEntry_Synonyms() {
		return (EAttribute)mappingEntityDefinitionEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeEntityDefinition() {
		return compositeEntityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeEntityDefinition_Entries() {
		return (EReference)compositeEntityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeEntityDefinitionEntry() {
		return compositeEntityDefinitionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeEntityDefinitionEntry_Fragments() {
		return (EReference)compositeEntityDefinitionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextFragment() {
		return textFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityTextFragment() {
		return entityTextFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityTextFragment_EntityReference() {
		return (EReference)entityTextFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralTextFragment() {
		return literalTextFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralTextFragment_Value() {
		return (EAttribute)literalTextFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntityType() {
		return entityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNlpDataMap() {
		return nlpDataMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlatformDataMap() {
		return platformDataMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentFactory getIntentFactory() {
		return (IntentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__NAME);
		createEReference(libraryEClass, LIBRARY__CUSTOM_ENTITIES);
		createEReference(libraryEClass, LIBRARY__EVENT_DEFINITIONS);

		eventDefinitionEClass = createEClass(EVENT_DEFINITION);
		createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__NAME);
		createEReference(eventDefinitionEClass, EVENT_DEFINITION__PARAMETERS);

		intentDefinitionEClass = createEClass(INTENT_DEFINITION);
		createEAttribute(intentDefinitionEClass, INTENT_DEFINITION__TRAINING_SENTENCES);

		contextParameterEClass = createEClass(CONTEXT_PARAMETER);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__NAME);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__TEXT_FRAGMENTS);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__ENTITY);

		eventInstanceEClass = createEClass(EVENT_INSTANCE);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__TRIGGERED_BY);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__DEFINITION);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__VALUES);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__PLATFORM_DATA);

		recognizedIntentEClass = createEClass(RECOGNIZED_INTENT);
		createEAttribute(recognizedIntentEClass, RECOGNIZED_INTENT__MATCHED_INPUT);
		createEAttribute(recognizedIntentEClass, RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE);
		createEAttribute(recognizedIntentEClass, RECOGNIZED_INTENT__NLP_DATA);

		contextParameterValueEClass = createEClass(CONTEXT_PARAMETER_VALUE);
		createEReference(contextParameterValueEClass, CONTEXT_PARAMETER_VALUE__CONTEXT_PARAMETER);
		createEAttribute(contextParameterValueEClass, CONTEXT_PARAMETER_VALUE__VALUE);

		entityDefinitionReferenceEClass = createEClass(ENTITY_DEFINITION_REFERENCE);
		createEOperation(entityDefinitionReferenceEClass, ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY);

		baseEntityDefinitionReferenceEClass = createEClass(BASE_ENTITY_DEFINITION_REFERENCE);
		createEReference(baseEntityDefinitionReferenceEClass, BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY);

		customEntityDefinitionReferenceEClass = createEClass(CUSTOM_ENTITY_DEFINITION_REFERENCE);
		createEReference(customEntityDefinitionReferenceEClass, CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY);

		entityDefinitionEClass = createEClass(ENTITY_DEFINITION);
		createEOperation(entityDefinitionEClass, ENTITY_DEFINITION___GET_NAME);

		baseEntityDefinitionEClass = createEClass(BASE_ENTITY_DEFINITION);
		createEAttribute(baseEntityDefinitionEClass, BASE_ENTITY_DEFINITION__ENTITY_TYPE);

		customEntityDefinitionEClass = createEClass(CUSTOM_ENTITY_DEFINITION);
		createEAttribute(customEntityDefinitionEClass, CUSTOM_ENTITY_DEFINITION__NAME);

		mappingEntityDefinitionEClass = createEClass(MAPPING_ENTITY_DEFINITION);
		createEReference(mappingEntityDefinitionEClass, MAPPING_ENTITY_DEFINITION__ENTRIES);

		mappingEntityDefinitionEntryEClass = createEClass(MAPPING_ENTITY_DEFINITION_ENTRY);
		createEAttribute(mappingEntityDefinitionEntryEClass, MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE);
		createEAttribute(mappingEntityDefinitionEntryEClass, MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS);

		compositeEntityDefinitionEClass = createEClass(COMPOSITE_ENTITY_DEFINITION);
		createEReference(compositeEntityDefinitionEClass, COMPOSITE_ENTITY_DEFINITION__ENTRIES);

		compositeEntityDefinitionEntryEClass = createEClass(COMPOSITE_ENTITY_DEFINITION_ENTRY);
		createEReference(compositeEntityDefinitionEntryEClass, COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS);

		textFragmentEClass = createEClass(TEXT_FRAGMENT);

		entityTextFragmentEClass = createEClass(ENTITY_TEXT_FRAGMENT);
		createEReference(entityTextFragmentEClass, ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE);

		literalTextFragmentEClass = createEClass(LITERAL_TEXT_FRAGMENT);
		createEAttribute(literalTextFragmentEClass, LITERAL_TEXT_FRAGMENT__VALUE);

		// Create enums
		entityTypeEEnum = createEEnum(ENTITY_TYPE);

		// Create data types
		nlpDataMapEDataType = createEDataType(NLP_DATA_MAP);
		platformDataMapEDataType = createEDataType(PLATFORM_DATA_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intentDefinitionEClass.getESuperTypes().add(this.getEventDefinition());
		recognizedIntentEClass.getESuperTypes().add(this.getEventInstance());
		baseEntityDefinitionReferenceEClass.getESuperTypes().add(this.getEntityDefinitionReference());
		customEntityDefinitionReferenceEClass.getESuperTypes().add(this.getEntityDefinitionReference());
		baseEntityDefinitionEClass.getESuperTypes().add(this.getEntityDefinition());
		customEntityDefinitionEClass.getESuperTypes().add(this.getEntityDefinition());
		mappingEntityDefinitionEClass.getESuperTypes().add(this.getCustomEntityDefinition());
		compositeEntityDefinitionEClass.getESuperTypes().add(this.getCustomEntityDefinition());
		entityTextFragmentEClass.getESuperTypes().add(this.getTextFragment());
		literalTextFragmentEClass.getESuperTypes().add(this.getTextFragment());

		// Initialize classes, features, and operations; add parameters
		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_CustomEntities(), this.getCustomEntityDefinition(), null, "customEntities", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_EventDefinitions(), this.getEventDefinition(), null, "eventDefinitions", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventDefinition_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventDefinition_Parameters(), this.getContextParameter(), null, "parameters", null, 0, -1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentDefinitionEClass, IntentDefinition.class, "IntentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentDefinition_TrainingSentences(), theEcorePackage.getEString(), "trainingSentences", null, 0, -1, IntentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextParameterEClass, ContextParameter.class, "ContextParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_TextFragments(), theEcorePackage.getEString(), "textFragments", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextParameter_Entity(), this.getEntityDefinitionReference(), null, "entity", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventInstanceEClass, EventInstance.class, "EventInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventInstance_TriggeredBy(), theEcorePackage.getEString(), "triggeredBy", null, 0, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventInstance_Definition(), this.getEventDefinition(), null, "definition", null, 0, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventInstance_Values(), this.getContextParameterValue(), null, "values", null, 0, -1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventInstance_PlatformData(), this.getPlatformDataMap(), "platformData", null, 0, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recognizedIntentEClass, RecognizedIntent.class, "RecognizedIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecognizedIntent_MatchedInput(), theEcorePackage.getEString(), "matchedInput", null, 0, 1, RecognizedIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecognizedIntent_RecognitionConfidence(), theEcorePackage.getEFloat(), "recognitionConfidence", null, 0, 1, RecognizedIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecognizedIntent_NlpData(), this.getNlpDataMap(), "nlpData", null, 0, 1, RecognizedIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextParameterValueEClass, ContextParameterValue.class, "ContextParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextParameterValue_ContextParameter(), this.getContextParameter(), null, "contextParameter", null, 0, 1, ContextParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameterValue_Value(), theEcorePackage.getEJavaObject(), "value", null, 0, 1, ContextParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDefinitionReferenceEClass, EntityDefinitionReference.class, "EntityDefinitionReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEntityDefinitionReference__GetReferredEntity(), this.getEntityDefinition(), "getReferredEntity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(baseEntityDefinitionReferenceEClass, BaseEntityDefinitionReference.class, "BaseEntityDefinitionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseEntityDefinitionReference_BaseEntity(), this.getBaseEntityDefinition(), null, "baseEntity", null, 0, 1, BaseEntityDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEntityDefinitionReferenceEClass, CustomEntityDefinitionReference.class, "CustomEntityDefinitionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomEntityDefinitionReference_CustomEntity(), this.getCustomEntityDefinition(), null, "customEntity", null, 0, 1, CustomEntityDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDefinitionEClass, EntityDefinition.class, "EntityDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEntityDefinition__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(baseEntityDefinitionEClass, BaseEntityDefinition.class, "BaseEntityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseEntityDefinition_EntityType(), this.getEntityType(), "entityType", null, 0, 1, BaseEntityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEntityDefinitionEClass, CustomEntityDefinition.class, "CustomEntityDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEntityDefinition_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CustomEntityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEntityDefinitionEClass, MappingEntityDefinition.class, "MappingEntityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingEntityDefinition_Entries(), this.getMappingEntityDefinitionEntry(), null, "entries", null, 0, -1, MappingEntityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEntityDefinitionEntryEClass, MappingEntityDefinitionEntry.class, "MappingEntityDefinitionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingEntityDefinitionEntry_ReferenceValue(), theEcorePackage.getEString(), "referenceValue", null, 0, 1, MappingEntityDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingEntityDefinitionEntry_Synonyms(), theEcorePackage.getEString(), "synonyms", null, 0, -1, MappingEntityDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEntityDefinitionEClass, CompositeEntityDefinition.class, "CompositeEntityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeEntityDefinition_Entries(), this.getCompositeEntityDefinitionEntry(), null, "entries", null, 0, -1, CompositeEntityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEntityDefinitionEntryEClass, CompositeEntityDefinitionEntry.class, "CompositeEntityDefinitionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeEntityDefinitionEntry_Fragments(), this.getTextFragment(), null, "fragments", null, 0, -1, CompositeEntityDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFragmentEClass, TextFragment.class, "TextFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityTextFragmentEClass, EntityTextFragment.class, "EntityTextFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityTextFragment_EntityReference(), this.getEntityDefinitionReference(), null, "entityReference", null, 0, 1, EntityTextFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalTextFragmentEClass, LiteralTextFragment.class, "LiteralTextFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralTextFragment_Value(), theEcorePackage.getEString(), "value", null, 0, 1, LiteralTextFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
		addEEnumLiteral(entityTypeEEnum, EntityType.ANY);
		addEEnumLiteral(entityTypeEEnum, EntityType.DATE_TIME);
		addEEnumLiteral(entityTypeEEnum, EntityType.DATE);
		addEEnumLiteral(entityTypeEEnum, EntityType.DATE_PERIOD);
		addEEnumLiteral(entityTypeEEnum, EntityType.TIME);
		addEEnumLiteral(entityTypeEEnum, EntityType.TIME_PERIOD);
		addEEnumLiteral(entityTypeEEnum, EntityType.NUMBER);
		addEEnumLiteral(entityTypeEEnum, EntityType.CARDINAL);
		addEEnumLiteral(entityTypeEEnum, EntityType.ORDINAL);
		addEEnumLiteral(entityTypeEEnum, EntityType.INTEGER);
		addEEnumLiteral(entityTypeEEnum, EntityType.NUMBER_SEQUENCE);
		addEEnumLiteral(entityTypeEEnum, EntityType.FLIGHT_NUMBER);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_AREA);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_CURRENCY);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_LENGTH);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_SPEED);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_VOLUME);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_WEIGHT);
		addEEnumLiteral(entityTypeEEnum, EntityType.UNIT_INFORMATION);
		addEEnumLiteral(entityTypeEEnum, EntityType.PERCENTAGE);
		addEEnumLiteral(entityTypeEEnum, EntityType.TEMPERATURE);
		addEEnumLiteral(entityTypeEEnum, EntityType.DURATION);
		addEEnumLiteral(entityTypeEEnum, EntityType.AGE);
		addEEnumLiteral(entityTypeEEnum, EntityType.ADDRESS);
		addEEnumLiteral(entityTypeEEnum, EntityType.STREET_ADDRESS);
		addEEnumLiteral(entityTypeEEnum, EntityType.ZIP_CODE);
		addEEnumLiteral(entityTypeEEnum, EntityType.CAPITAL);
		addEEnumLiteral(entityTypeEEnum, EntityType.COUNTRY);
		addEEnumLiteral(entityTypeEEnum, EntityType.COUNTRY_CODE);
		addEEnumLiteral(entityTypeEEnum, EntityType.CITY);
		addEEnumLiteral(entityTypeEEnum, EntityType.STATE);
		addEEnumLiteral(entityTypeEEnum, EntityType.CITY_US);
		addEEnumLiteral(entityTypeEEnum, EntityType.STATE_US);
		addEEnumLiteral(entityTypeEEnum, EntityType.COUNTY_US);
		addEEnumLiteral(entityTypeEEnum, EntityType.CITY_GB);
		addEEnumLiteral(entityTypeEEnum, EntityType.STATE_GB);
		addEEnumLiteral(entityTypeEEnum, EntityType.COUNTY_GB);
		addEEnumLiteral(entityTypeEEnum, EntityType.PLACE_ATTRACTION_US);
		addEEnumLiteral(entityTypeEEnum, EntityType.PLACE_ATTRACTION_GB);
		addEEnumLiteral(entityTypeEEnum, EntityType.PLACE_ATTRACTION);
		addEEnumLiteral(entityTypeEEnum, EntityType.AIRPORT);
		addEEnumLiteral(entityTypeEEnum, EntityType.LOCATION);
		addEEnumLiteral(entityTypeEEnum, EntityType.EMAIL);
		addEEnumLiteral(entityTypeEEnum, EntityType.PHONE_NUMBER);
		addEEnumLiteral(entityTypeEEnum, EntityType.GIVEN_NAME);
		addEEnumLiteral(entityTypeEEnum, EntityType.LAST_NAME);
		addEEnumLiteral(entityTypeEEnum, EntityType.MUSIC_ARTIST);
		addEEnumLiteral(entityTypeEEnum, EntityType.MUSIC_GENRE);
		addEEnumLiteral(entityTypeEEnum, EntityType.COLOR);
		addEEnumLiteral(entityTypeEEnum, EntityType.LANGUAGE);
		addEEnumLiteral(entityTypeEEnum, EntityType.URL);

		// Initialize data types
		initEDataType(nlpDataMapEDataType, Map.class, "NlpDataMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, java.lang.Object>");
		initEDataType(platformDataMapEDataType, Map.class, "PlatformDataMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, java.lang.Object>");

		// Create resource
		createResource(eNS_URI);
	}

} //IntentPackageImpl

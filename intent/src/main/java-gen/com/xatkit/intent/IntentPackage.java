/**
 */
package com.xatkit.intent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.xatkit.intent.IntentFactory
 * @model kind="package"
 * @generated
 */
public interface IntentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.xatkit.intent";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentPackage eINSTANCE = com.xatkit.intent.impl.IntentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.LibraryImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Custom Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CUSTOM_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__EVENT_DEFINITIONS = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.EventDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.IntentDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.IntentDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getIntentDefinition()
	 * @generated
	 */
	int INTENT_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DEFINITION__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DEFINITION__PARAMETERS = EVENT_DEFINITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Training Sentences</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DEFINITION__TRAINING_SENTENCES = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_DEFINITION_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.ContextParameterImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getContextParameter()
	 * @generated
	 */
	int CONTEXT_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text Fragments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__TEXT_FRAGMENTS = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Context Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.EventInstanceImpl <em>Event Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.EventInstanceImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEventInstance()
	 * @generated
	 */
	int EVENT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__TRIGGERED_BY = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Platform Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__PLATFORM_DATA = 3;

	/**
	 * The number of structural features of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.RecognizedIntentImpl <em>Recognized Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.RecognizedIntentImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getRecognizedIntent()
	 * @generated
	 */
	int RECOGNIZED_INTENT = 5;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__TRIGGERED_BY = EVENT_INSTANCE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__DEFINITION = EVENT_INSTANCE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__VALUES = EVENT_INSTANCE__VALUES;

	/**
	 * The feature id for the '<em><b>Platform Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__PLATFORM_DATA = EVENT_INSTANCE__PLATFORM_DATA;

	/**
	 * The feature id for the '<em><b>Matched Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__MATCHED_INPUT = EVENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recognition Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE = EVENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nlp Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT__NLP_DATA = EVENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recognized Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT_FEATURE_COUNT = EVENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Recognized Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNIZED_INTENT_OPERATION_COUNT = EVENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.ContextParameterValueImpl <em>Context Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.ContextParameterValueImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getContextParameterValue()
	 * @generated
	 */
	int CONTEXT_PARAMETER_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Context Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_VALUE__CONTEXT_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Context Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.EntityDefinitionReferenceImpl <em>Entity Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.EntityDefinitionReferenceImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityDefinitionReference()
	 * @generated
	 */
	int ENTITY_DEFINITION_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Referred Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY = 0;

	/**
	 * The number of operations of the '<em>Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION_REFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.BaseEntityDefinitionReferenceImpl <em>Base Entity Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.BaseEntityDefinitionReferenceImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getBaseEntityDefinitionReference()
	 * @generated
	 */
	int BASE_ENTITY_DEFINITION_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Base Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY = ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT = ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referred Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY = ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY;

	/**
	 * The number of operations of the '<em>Base Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_REFERENCE_OPERATION_COUNT = ENTITY_DEFINITION_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.CustomEntityDefinitionReferenceImpl <em>Custom Entity Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.CustomEntityDefinitionReferenceImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getCustomEntityDefinitionReference()
	 * @generated
	 */
	int CUSTOM_ENTITY_DEFINITION_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Custom Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY = ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT = ENTITY_DEFINITION_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Referred Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY = ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY;

	/**
	 * The number of operations of the '<em>Custom Entity Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_REFERENCE_OPERATION_COUNT = ENTITY_DEFINITION_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.EntityDefinitionImpl <em>Entity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.EntityDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityDefinition()
	 * @generated
	 */
	int ENTITY_DEFINITION = 10;

	/**
	 * The number of structural features of the '<em>Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION___GET_NAME = 0;

	/**
	 * The number of operations of the '<em>Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.BaseEntityDefinitionImpl <em>Base Entity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.BaseEntityDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getBaseEntityDefinition()
	 * @generated
	 */
	int BASE_ENTITY_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION__ENTITY_TYPE = ENTITY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_FEATURE_COUNT = ENTITY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION___GET_NAME = ENTITY_DEFINITION___GET_NAME;

	/**
	 * The number of operations of the '<em>Base Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_DEFINITION_OPERATION_COUNT = ENTITY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.CustomEntityDefinitionImpl <em>Custom Entity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.CustomEntityDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getCustomEntityDefinition()
	 * @generated
	 */
	int CUSTOM_ENTITY_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION__NAME = ENTITY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_FEATURE_COUNT = ENTITY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION___GET_NAME = ENTITY_DEFINITION___GET_NAME;

	/**
	 * The number of operations of the '<em>Custom Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_DEFINITION_OPERATION_COUNT = ENTITY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.MappingEntityDefinitionImpl <em>Mapping Entity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.MappingEntityDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getMappingEntityDefinition()
	 * @generated
	 */
	int MAPPING_ENTITY_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION__NAME = CUSTOM_ENTITY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION__ENTRIES = CUSTOM_ENTITY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_FEATURE_COUNT = CUSTOM_ENTITY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION___GET_NAME = CUSTOM_ENTITY_DEFINITION___GET_NAME;

	/**
	 * The number of operations of the '<em>Mapping Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_OPERATION_COUNT = CUSTOM_ENTITY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl <em>Mapping Entity Definition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getMappingEntityDefinitionEntry()
	 * @generated
	 */
	int MAPPING_ENTITY_DEFINITION_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Reference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS = 1;

	/**
	 * The number of structural features of the '<em>Mapping Entity Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Entity Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTITY_DEFINITION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.CompositeEntityDefinitionImpl <em>Composite Entity Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.CompositeEntityDefinitionImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getCompositeEntityDefinition()
	 * @generated
	 */
	int COMPOSITE_ENTITY_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION__NAME = CUSTOM_ENTITY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION__ENTRIES = CUSTOM_ENTITY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION_FEATURE_COUNT = CUSTOM_ENTITY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION___GET_NAME = CUSTOM_ENTITY_DEFINITION___GET_NAME;

	/**
	 * The number of operations of the '<em>Composite Entity Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION_OPERATION_COUNT = CUSTOM_ENTITY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.CompositeEntityDefinitionEntryImpl <em>Composite Entity Definition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.CompositeEntityDefinitionEntryImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getCompositeEntityDefinitionEntry()
	 * @generated
	 */
	int COMPOSITE_ENTITY_DEFINITION_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS = 0;

	/**
	 * The number of structural features of the '<em>Composite Entity Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite Entity Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ENTITY_DEFINITION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.TextFragmentImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getTextFragment()
	 * @generated
	 */
	int TEXT_FRAGMENT = 17;

	/**
	 * The number of structural features of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.EntityTextFragmentImpl <em>Entity Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.EntityTextFragmentImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityTextFragment()
	 * @generated
	 */
	int ENTITY_TEXT_FRAGMENT = 18;

	/**
	 * The feature id for the '<em><b>Entity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE = TEXT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TEXT_FRAGMENT_FEATURE_COUNT = TEXT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TEXT_FRAGMENT_OPERATION_COUNT = TEXT_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.impl.LiteralTextFragmentImpl <em>Literal Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.impl.LiteralTextFragmentImpl
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getLiteralTextFragment()
	 * @generated
	 */
	int LITERAL_TEXT_FRAGMENT = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TEXT_FRAGMENT__VALUE = TEXT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TEXT_FRAGMENT_FEATURE_COUNT = TEXT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TEXT_FRAGMENT_OPERATION_COUNT = TEXT_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.xatkit.intent.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xatkit.intent.EntityType
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 20;

	/**
	 * The meta object id for the '<em>Nlp Data Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getNlpDataMap()
	 * @generated
	 */
	int NLP_DATA_MAP = 21;

	/**
	 * The meta object id for the '<em>Platform Data Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see com.xatkit.intent.impl.IntentPackageImpl#getPlatformDataMap()
	 * @generated
	 */
	int PLATFORM_DATA_MAP = 22;


	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see com.xatkit.intent.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xatkit.intent.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.Library#getCustomEntities <em>Custom Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Entities</em>'.
	 * @see com.xatkit.intent.Library#getCustomEntities()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_CustomEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.Library#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see com.xatkit.intent.Library#getEventDefinitions()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_EventDefinitions();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see com.xatkit.intent.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.EventDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xatkit.intent.EventDefinition#getName()
	 * @see #getEventDefinition()
	 * @generated
	 */
	EAttribute getEventDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.EventDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.xatkit.intent.EventDefinition#getParameters()
	 * @see #getEventDefinition()
	 * @generated
	 */
	EReference getEventDefinition_Parameters();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.IntentDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see com.xatkit.intent.IntentDefinition
	 * @generated
	 */
	EClass getIntentDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link com.xatkit.intent.IntentDefinition#getTrainingSentences <em>Training Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Training Sentences</em>'.
	 * @see com.xatkit.intent.IntentDefinition#getTrainingSentences()
	 * @see #getIntentDefinition()
	 * @generated
	 */
	EAttribute getIntentDefinition_TrainingSentences();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Parameter</em>'.
	 * @see com.xatkit.intent.ContextParameter
	 * @generated
	 */
	EClass getContextParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.ContextParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xatkit.intent.ContextParameter#getName()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.xatkit.intent.ContextParameter#getTextFragments <em>Text Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Fragments</em>'.
	 * @see com.xatkit.intent.ContextParameter#getTextFragments()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_TextFragments();

	/**
	 * Returns the meta object for the containment reference '{@link com.xatkit.intent.ContextParameter#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see com.xatkit.intent.ContextParameter#getEntity()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_Entity();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Instance</em>'.
	 * @see com.xatkit.intent.EventInstance
	 * @generated
	 */
	EClass getEventInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.EventInstance#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered By</em>'.
	 * @see com.xatkit.intent.EventInstance#getTriggeredBy()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_TriggeredBy();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.intent.EventInstance#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see com.xatkit.intent.EventInstance#getDefinition()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.EventInstance#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see com.xatkit.intent.EventInstance#getValues()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_Values();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.EventInstance#getPlatformData <em>Platform Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Data</em>'.
	 * @see com.xatkit.intent.EventInstance#getPlatformData()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_PlatformData();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.RecognizedIntent <em>Recognized Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recognized Intent</em>'.
	 * @see com.xatkit.intent.RecognizedIntent
	 * @generated
	 */
	EClass getRecognizedIntent();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.RecognizedIntent#getMatchedInput <em>Matched Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matched Input</em>'.
	 * @see com.xatkit.intent.RecognizedIntent#getMatchedInput()
	 * @see #getRecognizedIntent()
	 * @generated
	 */
	EAttribute getRecognizedIntent_MatchedInput();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.RecognizedIntent#getRecognitionConfidence <em>Recognition Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recognition Confidence</em>'.
	 * @see com.xatkit.intent.RecognizedIntent#getRecognitionConfidence()
	 * @see #getRecognizedIntent()
	 * @generated
	 */
	EAttribute getRecognizedIntent_RecognitionConfidence();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.RecognizedIntent#getNlpData <em>Nlp Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nlp Data</em>'.
	 * @see com.xatkit.intent.RecognizedIntent#getNlpData()
	 * @see #getRecognizedIntent()
	 * @generated
	 */
	EAttribute getRecognizedIntent_NlpData();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.ContextParameterValue <em>Context Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Parameter Value</em>'.
	 * @see com.xatkit.intent.ContextParameterValue
	 * @generated
	 */
	EClass getContextParameterValue();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.intent.ContextParameterValue#getContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Parameter</em>'.
	 * @see com.xatkit.intent.ContextParameterValue#getContextParameter()
	 * @see #getContextParameterValue()
	 * @generated
	 */
	EReference getContextParameterValue_ContextParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.ContextParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.xatkit.intent.ContextParameterValue#getValue()
	 * @see #getContextParameterValue()
	 * @generated
	 */
	EAttribute getContextParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.EntityDefinitionReference <em>Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Definition Reference</em>'.
	 * @see com.xatkit.intent.EntityDefinitionReference
	 * @generated
	 */
	EClass getEntityDefinitionReference();

	/**
	 * Returns the meta object for the '{@link com.xatkit.intent.EntityDefinitionReference#getReferredEntity() <em>Get Referred Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referred Entity</em>' operation.
	 * @see com.xatkit.intent.EntityDefinitionReference#getReferredEntity()
	 * @generated
	 */
	EOperation getEntityDefinitionReference__GetReferredEntity();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.BaseEntityDefinitionReference <em>Base Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Entity Definition Reference</em>'.
	 * @see com.xatkit.intent.BaseEntityDefinitionReference
	 * @generated
	 */
	EClass getBaseEntityDefinitionReference();

	/**
	 * Returns the meta object for the containment reference '{@link com.xatkit.intent.BaseEntityDefinitionReference#getBaseEntity <em>Base Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Entity</em>'.
	 * @see com.xatkit.intent.BaseEntityDefinitionReference#getBaseEntity()
	 * @see #getBaseEntityDefinitionReference()
	 * @generated
	 */
	EReference getBaseEntityDefinitionReference_BaseEntity();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.CustomEntityDefinitionReference <em>Custom Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entity Definition Reference</em>'.
	 * @see com.xatkit.intent.CustomEntityDefinitionReference
	 * @generated
	 */
	EClass getCustomEntityDefinitionReference();

	/**
	 * Returns the meta object for the reference '{@link com.xatkit.intent.CustomEntityDefinitionReference#getCustomEntity <em>Custom Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Entity</em>'.
	 * @see com.xatkit.intent.CustomEntityDefinitionReference#getCustomEntity()
	 * @see #getCustomEntityDefinitionReference()
	 * @generated
	 */
	EReference getCustomEntityDefinitionReference_CustomEntity();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.EntityDefinition <em>Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Definition</em>'.
	 * @see com.xatkit.intent.EntityDefinition
	 * @generated
	 */
	EClass getEntityDefinition();

	/**
	 * Returns the meta object for the '{@link com.xatkit.intent.EntityDefinition#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see com.xatkit.intent.EntityDefinition#getName()
	 * @generated
	 */
	EOperation getEntityDefinition__GetName();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.BaseEntityDefinition <em>Base Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Entity Definition</em>'.
	 * @see com.xatkit.intent.BaseEntityDefinition
	 * @generated
	 */
	EClass getBaseEntityDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.BaseEntityDefinition#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see com.xatkit.intent.BaseEntityDefinition#getEntityType()
	 * @see #getBaseEntityDefinition()
	 * @generated
	 */
	EAttribute getBaseEntityDefinition_EntityType();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.CustomEntityDefinition <em>Custom Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entity Definition</em>'.
	 * @see com.xatkit.intent.CustomEntityDefinition
	 * @generated
	 */
	EClass getCustomEntityDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.CustomEntityDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xatkit.intent.CustomEntityDefinition#getName()
	 * @see #getCustomEntityDefinition()
	 * @generated
	 */
	EAttribute getCustomEntityDefinition_Name();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.MappingEntityDefinition <em>Mapping Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entity Definition</em>'.
	 * @see com.xatkit.intent.MappingEntityDefinition
	 * @generated
	 */
	EClass getMappingEntityDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.MappingEntityDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.xatkit.intent.MappingEntityDefinition#getEntries()
	 * @see #getMappingEntityDefinition()
	 * @generated
	 */
	EReference getMappingEntityDefinition_Entries();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.MappingEntityDefinitionEntry <em>Mapping Entity Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entity Definition Entry</em>'.
	 * @see com.xatkit.intent.MappingEntityDefinitionEntry
	 * @generated
	 */
	EClass getMappingEntityDefinitionEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.MappingEntityDefinitionEntry#getReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Value</em>'.
	 * @see com.xatkit.intent.MappingEntityDefinitionEntry#getReferenceValue()
	 * @see #getMappingEntityDefinitionEntry()
	 * @generated
	 */
	EAttribute getMappingEntityDefinitionEntry_ReferenceValue();

	/**
	 * Returns the meta object for the attribute list '{@link com.xatkit.intent.MappingEntityDefinitionEntry#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see com.xatkit.intent.MappingEntityDefinitionEntry#getSynonyms()
	 * @see #getMappingEntityDefinitionEntry()
	 * @generated
	 */
	EAttribute getMappingEntityDefinitionEntry_Synonyms();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.CompositeEntityDefinition <em>Composite Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Entity Definition</em>'.
	 * @see com.xatkit.intent.CompositeEntityDefinition
	 * @generated
	 */
	EClass getCompositeEntityDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.CompositeEntityDefinition#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.xatkit.intent.CompositeEntityDefinition#getEntries()
	 * @see #getCompositeEntityDefinition()
	 * @generated
	 */
	EReference getCompositeEntityDefinition_Entries();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.CompositeEntityDefinitionEntry <em>Composite Entity Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Entity Definition Entry</em>'.
	 * @see com.xatkit.intent.CompositeEntityDefinitionEntry
	 * @generated
	 */
	EClass getCompositeEntityDefinitionEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xatkit.intent.CompositeEntityDefinitionEntry#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see com.xatkit.intent.CompositeEntityDefinitionEntry#getFragments()
	 * @see #getCompositeEntityDefinitionEntry()
	 * @generated
	 */
	EReference getCompositeEntityDefinitionEntry_Fragments();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Fragment</em>'.
	 * @see com.xatkit.intent.TextFragment
	 * @generated
	 */
	EClass getTextFragment();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.EntityTextFragment <em>Entity Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Text Fragment</em>'.
	 * @see com.xatkit.intent.EntityTextFragment
	 * @generated
	 */
	EClass getEntityTextFragment();

	/**
	 * Returns the meta object for the containment reference '{@link com.xatkit.intent.EntityTextFragment#getEntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Reference</em>'.
	 * @see com.xatkit.intent.EntityTextFragment#getEntityReference()
	 * @see #getEntityTextFragment()
	 * @generated
	 */
	EReference getEntityTextFragment_EntityReference();

	/**
	 * Returns the meta object for class '{@link com.xatkit.intent.LiteralTextFragment <em>Literal Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Text Fragment</em>'.
	 * @see com.xatkit.intent.LiteralTextFragment
	 * @generated
	 */
	EClass getLiteralTextFragment();

	/**
	 * Returns the meta object for the attribute '{@link com.xatkit.intent.LiteralTextFragment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.xatkit.intent.LiteralTextFragment#getValue()
	 * @see #getLiteralTextFragment()
	 * @generated
	 */
	EAttribute getLiteralTextFragment_Value();

	/**
	 * Returns the meta object for enum '{@link com.xatkit.intent.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see com.xatkit.intent.EntityType
	 * @generated
	 */
	EEnum getEntityType();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Nlp Data Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nlp Data Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.String, java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getNlpDataMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Platform Data Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Platform Data Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;java.lang.String, java.lang.Object&gt;"
	 * @generated
	 */
	EDataType getPlatformDataMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntentFactory getIntentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.LibraryImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Custom Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__CUSTOM_ENTITIES = eINSTANCE.getLibrary_CustomEntities();

		/**
		 * The meta object literal for the '<em><b>Event Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__EVENT_DEFINITIONS = eINSTANCE.getLibrary_EventDefinitions();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.EventDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_DEFINITION__NAME = eINSTANCE.getEventDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DEFINITION__PARAMETERS = eINSTANCE.getEventDefinition_Parameters();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.IntentDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.IntentDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getIntentDefinition()
		 * @generated
		 */
		EClass INTENT_DEFINITION = eINSTANCE.getIntentDefinition();

		/**
		 * The meta object literal for the '<em><b>Training Sentences</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_DEFINITION__TRAINING_SENTENCES = eINSTANCE.getIntentDefinition_TrainingSentences();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.ContextParameterImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getContextParameter()
		 * @generated
		 */
		EClass CONTEXT_PARAMETER = eINSTANCE.getContextParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__NAME = eINSTANCE.getContextParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Text Fragments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__TEXT_FRAGMENTS = eINSTANCE.getContextParameter_TextFragments();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__ENTITY = eINSTANCE.getContextParameter_Entity();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.EventInstanceImpl <em>Event Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.EventInstanceImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEventInstance()
		 * @generated
		 */
		EClass EVENT_INSTANCE = eINSTANCE.getEventInstance();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__TRIGGERED_BY = eINSTANCE.getEventInstance_TriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__DEFINITION = eINSTANCE.getEventInstance_Definition();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__VALUES = eINSTANCE.getEventInstance_Values();

		/**
		 * The meta object literal for the '<em><b>Platform Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__PLATFORM_DATA = eINSTANCE.getEventInstance_PlatformData();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.RecognizedIntentImpl <em>Recognized Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.RecognizedIntentImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getRecognizedIntent()
		 * @generated
		 */
		EClass RECOGNIZED_INTENT = eINSTANCE.getRecognizedIntent();

		/**
		 * The meta object literal for the '<em><b>Matched Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOGNIZED_INTENT__MATCHED_INPUT = eINSTANCE.getRecognizedIntent_MatchedInput();

		/**
		 * The meta object literal for the '<em><b>Recognition Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOGNIZED_INTENT__RECOGNITION_CONFIDENCE = eINSTANCE.getRecognizedIntent_RecognitionConfidence();

		/**
		 * The meta object literal for the '<em><b>Nlp Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOGNIZED_INTENT__NLP_DATA = eINSTANCE.getRecognizedIntent_NlpData();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.ContextParameterValueImpl <em>Context Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.ContextParameterValueImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getContextParameterValue()
		 * @generated
		 */
		EClass CONTEXT_PARAMETER_VALUE = eINSTANCE.getContextParameterValue();

		/**
		 * The meta object literal for the '<em><b>Context Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER_VALUE__CONTEXT_PARAMETER = eINSTANCE.getContextParameterValue_ContextParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER_VALUE__VALUE = eINSTANCE.getContextParameterValue_Value();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.EntityDefinitionReferenceImpl <em>Entity Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.EntityDefinitionReferenceImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityDefinitionReference()
		 * @generated
		 */
		EClass ENTITY_DEFINITION_REFERENCE = eINSTANCE.getEntityDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Get Referred Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY = eINSTANCE.getEntityDefinitionReference__GetReferredEntity();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.BaseEntityDefinitionReferenceImpl <em>Base Entity Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.BaseEntityDefinitionReferenceImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getBaseEntityDefinitionReference()
		 * @generated
		 */
		EClass BASE_ENTITY_DEFINITION_REFERENCE = eINSTANCE.getBaseEntityDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Base Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ENTITY_DEFINITION_REFERENCE__BASE_ENTITY = eINSTANCE.getBaseEntityDefinitionReference_BaseEntity();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.CustomEntityDefinitionReferenceImpl <em>Custom Entity Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.CustomEntityDefinitionReferenceImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getCustomEntityDefinitionReference()
		 * @generated
		 */
		EClass CUSTOM_ENTITY_DEFINITION_REFERENCE = eINSTANCE.getCustomEntityDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Custom Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_ENTITY_DEFINITION_REFERENCE__CUSTOM_ENTITY = eINSTANCE.getCustomEntityDefinitionReference_CustomEntity();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.EntityDefinitionImpl <em>Entity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.EntityDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityDefinition()
		 * @generated
		 */
		EClass ENTITY_DEFINITION = eINSTANCE.getEntityDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_DEFINITION___GET_NAME = eINSTANCE.getEntityDefinition__GetName();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.BaseEntityDefinitionImpl <em>Base Entity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.BaseEntityDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getBaseEntityDefinition()
		 * @generated
		 */
		EClass BASE_ENTITY_DEFINITION = eINSTANCE.getBaseEntityDefinition();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ENTITY_DEFINITION__ENTITY_TYPE = eINSTANCE.getBaseEntityDefinition_EntityType();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.CustomEntityDefinitionImpl <em>Custom Entity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.CustomEntityDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getCustomEntityDefinition()
		 * @generated
		 */
		EClass CUSTOM_ENTITY_DEFINITION = eINSTANCE.getCustomEntityDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ENTITY_DEFINITION__NAME = eINSTANCE.getCustomEntityDefinition_Name();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.MappingEntityDefinitionImpl <em>Mapping Entity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.MappingEntityDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getMappingEntityDefinition()
		 * @generated
		 */
		EClass MAPPING_ENTITY_DEFINITION = eINSTANCE.getMappingEntityDefinition();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ENTITY_DEFINITION__ENTRIES = eINSTANCE.getMappingEntityDefinition_Entries();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl <em>Mapping Entity Definition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.MappingEntityDefinitionEntryImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getMappingEntityDefinitionEntry()
		 * @generated
		 */
		EClass MAPPING_ENTITY_DEFINITION_ENTRY = eINSTANCE.getMappingEntityDefinitionEntry();

		/**
		 * The meta object literal for the '<em><b>Reference Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTITY_DEFINITION_ENTRY__REFERENCE_VALUE = eINSTANCE.getMappingEntityDefinitionEntry_ReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTITY_DEFINITION_ENTRY__SYNONYMS = eINSTANCE.getMappingEntityDefinitionEntry_Synonyms();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.CompositeEntityDefinitionImpl <em>Composite Entity Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.CompositeEntityDefinitionImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getCompositeEntityDefinition()
		 * @generated
		 */
		EClass COMPOSITE_ENTITY_DEFINITION = eINSTANCE.getCompositeEntityDefinition();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ENTITY_DEFINITION__ENTRIES = eINSTANCE.getCompositeEntityDefinition_Entries();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.CompositeEntityDefinitionEntryImpl <em>Composite Entity Definition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.CompositeEntityDefinitionEntryImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getCompositeEntityDefinitionEntry()
		 * @generated
		 */
		EClass COMPOSITE_ENTITY_DEFINITION_ENTRY = eINSTANCE.getCompositeEntityDefinitionEntry();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS = eINSTANCE.getCompositeEntityDefinitionEntry_Fragments();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.TextFragmentImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getTextFragment()
		 * @generated
		 */
		EClass TEXT_FRAGMENT = eINSTANCE.getTextFragment();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.EntityTextFragmentImpl <em>Entity Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.EntityTextFragmentImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityTextFragment()
		 * @generated
		 */
		EClass ENTITY_TEXT_FRAGMENT = eINSTANCE.getEntityTextFragment();

		/**
		 * The meta object literal for the '<em><b>Entity Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TEXT_FRAGMENT__ENTITY_REFERENCE = eINSTANCE.getEntityTextFragment_EntityReference();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.impl.LiteralTextFragmentImpl <em>Literal Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.impl.LiteralTextFragmentImpl
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getLiteralTextFragment()
		 * @generated
		 */
		EClass LITERAL_TEXT_FRAGMENT = eINSTANCE.getLiteralTextFragment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TEXT_FRAGMENT__VALUE = eINSTANCE.getLiteralTextFragment_Value();

		/**
		 * The meta object literal for the '{@link com.xatkit.intent.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xatkit.intent.EntityType
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em>Nlp Data Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getNlpDataMap()
		 * @generated
		 */
		EDataType NLP_DATA_MAP = eINSTANCE.getNlpDataMap();

		/**
		 * The meta object literal for the '<em>Platform Data Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see com.xatkit.intent.impl.IntentPackageImpl#getPlatformDataMap()
		 * @generated
		 */
		EDataType PLATFORM_DATA_MAP = eINSTANCE.getPlatformDataMap();

	}

} //IntentPackage

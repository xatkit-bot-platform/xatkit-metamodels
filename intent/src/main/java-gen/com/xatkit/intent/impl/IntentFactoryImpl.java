/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentFactoryImpl extends EFactoryImpl implements IntentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentFactory init() {
		try {
			IntentFactory theIntentFactory = (IntentFactory)EPackage.Registry.INSTANCE.getEFactory(IntentPackage.eNS_URI);
			if (theIntentFactory != null) {
				return theIntentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IntentPackage.LIBRARY: return createLibrary();
			case IntentPackage.EVENT_DEFINITION: return createEventDefinition();
			case IntentPackage.INTENT_DEFINITION: return createIntentDefinition();
			case IntentPackage.CONTEXT_PARAMETER: return createContextParameter();
			case IntentPackage.EVENT_INSTANCE: return createEventInstance();
			case IntentPackage.RECOGNIZED_INTENT: return createRecognizedIntent();
			case IntentPackage.CONTEXT_PARAMETER_VALUE: return createContextParameterValue();
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE: return createBaseEntityDefinitionReference();
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE: return createCustomEntityDefinitionReference();
			case IntentPackage.BASE_ENTITY_DEFINITION: return createBaseEntityDefinition();
			case IntentPackage.MAPPING_ENTITY_DEFINITION: return createMappingEntityDefinition();
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY: return createMappingEntityDefinitionEntry();
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION: return createCompositeEntityDefinition();
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY: return createCompositeEntityDefinitionEntry();
			case IntentPackage.ENTITY_TEXT_FRAGMENT: return createEntityTextFragment();
			case IntentPackage.LITERAL_TEXT_FRAGMENT: return createLiteralTextFragment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IntentPackage.ENTITY_TYPE:
				return createEntityTypeFromString(eDataType, initialValue);
			case IntentPackage.NLP_DATA_MAP:
				return createNlpDataMapFromString(eDataType, initialValue);
			case IntentPackage.PLATFORM_DATA_MAP:
				return createPlatformDataMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IntentPackage.ENTITY_TYPE:
				return convertEntityTypeToString(eDataType, instanceValue);
			case IntentPackage.NLP_DATA_MAP:
				return convertNlpDataMapToString(eDataType, instanceValue);
			case IntentPackage.PLATFORM_DATA_MAP:
				return convertPlatformDataMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinition createEventDefinition() {
		EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentDefinition createIntentDefinition() {
		IntentDefinitionImpl intentDefinition = new IntentDefinitionImpl();
		return intentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameter createContextParameter() {
		ContextParameterImpl contextParameter = new ContextParameterImpl();
		return contextParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventInstance createEventInstance() {
		EventInstanceImpl eventInstance = new EventInstanceImpl();
		return eventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecognizedIntent createRecognizedIntent() {
		RecognizedIntentImpl recognizedIntent = new RecognizedIntentImpl();
		return recognizedIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextParameterValue createContextParameterValue() {
		ContextParameterValueImpl contextParameterValue = new ContextParameterValueImpl();
		return contextParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseEntityDefinitionReference createBaseEntityDefinitionReference() {
		BaseEntityDefinitionReferenceImpl baseEntityDefinitionReference = new BaseEntityDefinitionReferenceImpl();
		return baseEntityDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEntityDefinitionReference createCustomEntityDefinitionReference() {
		CustomEntityDefinitionReferenceImpl customEntityDefinitionReference = new CustomEntityDefinitionReferenceImpl();
		return customEntityDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseEntityDefinition createBaseEntityDefinition() {
		BaseEntityDefinitionImpl baseEntityDefinition = new BaseEntityDefinitionImpl();
		return baseEntityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingEntityDefinition createMappingEntityDefinition() {
		MappingEntityDefinitionImpl mappingEntityDefinition = new MappingEntityDefinitionImpl();
		return mappingEntityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingEntityDefinitionEntry createMappingEntityDefinitionEntry() {
		MappingEntityDefinitionEntryImpl mappingEntityDefinitionEntry = new MappingEntityDefinitionEntryImpl();
		return mappingEntityDefinitionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeEntityDefinition createCompositeEntityDefinition() {
		CompositeEntityDefinitionImpl compositeEntityDefinition = new CompositeEntityDefinitionImpl();
		return compositeEntityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeEntityDefinitionEntry createCompositeEntityDefinitionEntry() {
		CompositeEntityDefinitionEntryImpl compositeEntityDefinitionEntry = new CompositeEntityDefinitionEntryImpl();
		return compositeEntityDefinitionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityTextFragment createEntityTextFragment() {
		EntityTextFragmentImpl entityTextFragment = new EntityTextFragmentImpl();
		return entityTextFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralTextFragment createLiteralTextFragment() {
		LiteralTextFragmentImpl literalTextFragment = new LiteralTextFragmentImpl();
		return literalTextFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityTypeFromString(EDataType eDataType, String initialValue) {
		EntityType result = EntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> createNlpDataMapFromString(EDataType eDataType, String initialValue) {
		return (Map<String, Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNlpDataMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> createPlatformDataMapFromString(EDataType eDataType, String initialValue) {
		return (Map<String, Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformDataMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntentPackage getIntentPackage() {
		return (IntentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntentPackage getPackage() {
		return IntentPackage.eINSTANCE;
	}

} //IntentFactoryImpl

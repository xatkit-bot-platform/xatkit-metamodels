/**
 */
package com.xatkit.intent.util;

import com.xatkit.intent.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.xatkit.intent.IntentPackage
 * @generated
 */
public class IntentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSwitch() {
		if (modelPackage == null) {
			modelPackage = IntentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntentPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.EVENT_DEFINITION: {
				EventDefinition eventDefinition = (EventDefinition)theEObject;
				T result = caseEventDefinition(eventDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.INTENT_DEFINITION: {
				IntentDefinition intentDefinition = (IntentDefinition)theEObject;
				T result = caseIntentDefinition(intentDefinition);
				if (result == null) result = caseEventDefinition(intentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CONTEXT_PARAMETER: {
				ContextParameter contextParameter = (ContextParameter)theEObject;
				T result = caseContextParameter(contextParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.EVENT_INSTANCE: {
				EventInstance eventInstance = (EventInstance)theEObject;
				T result = caseEventInstance(eventInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.RECOGNIZED_INTENT: {
				RecognizedIntent recognizedIntent = (RecognizedIntent)theEObject;
				T result = caseRecognizedIntent(recognizedIntent);
				if (result == null) result = caseEventInstance(recognizedIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CONTEXT_PARAMETER_VALUE: {
				ContextParameterValue contextParameterValue = (ContextParameterValue)theEObject;
				T result = caseContextParameterValue(contextParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.ENTITY_DEFINITION_REFERENCE: {
				EntityDefinitionReference entityDefinitionReference = (EntityDefinitionReference)theEObject;
				T result = caseEntityDefinitionReference(entityDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BASE_ENTITY_DEFINITION_REFERENCE: {
				BaseEntityDefinitionReference baseEntityDefinitionReference = (BaseEntityDefinitionReference)theEObject;
				T result = caseBaseEntityDefinitionReference(baseEntityDefinitionReference);
				if (result == null) result = caseEntityDefinitionReference(baseEntityDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CUSTOM_ENTITY_DEFINITION_REFERENCE: {
				CustomEntityDefinitionReference customEntityDefinitionReference = (CustomEntityDefinitionReference)theEObject;
				T result = caseCustomEntityDefinitionReference(customEntityDefinitionReference);
				if (result == null) result = caseEntityDefinitionReference(customEntityDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.ENTITY_DEFINITION: {
				EntityDefinition entityDefinition = (EntityDefinition)theEObject;
				T result = caseEntityDefinition(entityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.BASE_ENTITY_DEFINITION: {
				BaseEntityDefinition baseEntityDefinition = (BaseEntityDefinition)theEObject;
				T result = caseBaseEntityDefinition(baseEntityDefinition);
				if (result == null) result = caseEntityDefinition(baseEntityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.CUSTOM_ENTITY_DEFINITION: {
				CustomEntityDefinition customEntityDefinition = (CustomEntityDefinition)theEObject;
				T result = caseCustomEntityDefinition(customEntityDefinition);
				if (result == null) result = caseEntityDefinition(customEntityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.MAPPING_ENTITY_DEFINITION: {
				MappingEntityDefinition mappingEntityDefinition = (MappingEntityDefinition)theEObject;
				T result = caseMappingEntityDefinition(mappingEntityDefinition);
				if (result == null) result = caseCustomEntityDefinition(mappingEntityDefinition);
				if (result == null) result = caseEntityDefinition(mappingEntityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.MAPPING_ENTITY_DEFINITION_ENTRY: {
				MappingEntityDefinitionEntry mappingEntityDefinitionEntry = (MappingEntityDefinitionEntry)theEObject;
				T result = caseMappingEntityDefinitionEntry(mappingEntityDefinitionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION: {
				CompositeEntityDefinition compositeEntityDefinition = (CompositeEntityDefinition)theEObject;
				T result = caseCompositeEntityDefinition(compositeEntityDefinition);
				if (result == null) result = caseCustomEntityDefinition(compositeEntityDefinition);
				if (result == null) result = caseEntityDefinition(compositeEntityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY: {
				CompositeEntityDefinitionEntry compositeEntityDefinitionEntry = (CompositeEntityDefinitionEntry)theEObject;
				T result = caseCompositeEntityDefinitionEntry(compositeEntityDefinitionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.TEXT_FRAGMENT: {
				TextFragment textFragment = (TextFragment)theEObject;
				T result = caseTextFragment(textFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.ENTITY_TEXT_FRAGMENT: {
				EntityTextFragment entityTextFragment = (EntityTextFragment)theEObject;
				T result = caseEntityTextFragment(entityTextFragment);
				if (result == null) result = caseTextFragment(entityTextFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntentPackage.LITERAL_TEXT_FRAGMENT: {
				LiteralTextFragment literalTextFragment = (LiteralTextFragment)theEObject;
				T result = caseLiteralTextFragment(literalTextFragment);
				if (result == null) result = caseTextFragment(literalTextFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinition(EventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentDefinition(IntentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParameter(ContextParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventInstance(EventInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedIntent(RecognizedIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParameterValue(ContextParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDefinitionReference(EntityDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Entity Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Entity Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseEntityDefinitionReference(BaseEntityDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entity Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entity Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEntityDefinitionReference(CustomEntityDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDefinition(EntityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Entity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseEntityDefinition(BaseEntityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEntityDefinition(CustomEntityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingEntityDefinition(MappingEntityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entity Definition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entity Definition Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingEntityDefinitionEntry(MappingEntityDefinitionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Entity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeEntityDefinition(CompositeEntityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Entity Definition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Entity Definition Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeEntityDefinitionEntry(CompositeEntityDefinitionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextFragment(TextFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Text Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTextFragment(EntityTextFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Text Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralTextFragment(LiteralTextFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IntentSwitch

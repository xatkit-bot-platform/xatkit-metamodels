/**
 */
package com.xatkit.intent.util;

import com.xatkit.intent.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.xatkit.intent.IntentPackage
 * @generated
 */
public class IntentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSwitch<Adapter> modelSwitch =
		new IntentSwitch<Adapter>() {
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseIntentDefinition(IntentDefinition object) {
				return createIntentDefinitionAdapter();
			}
			@Override
			public Adapter caseContextParameter(ContextParameter object) {
				return createContextParameterAdapter();
			}
			@Override
			public Adapter caseEventInstance(EventInstance object) {
				return createEventInstanceAdapter();
			}
			@Override
			public Adapter caseRecognizedIntent(RecognizedIntent object) {
				return createRecognizedIntentAdapter();
			}
			@Override
			public Adapter caseContextParameterValue(ContextParameterValue object) {
				return createContextParameterValueAdapter();
			}
			@Override
			public Adapter caseEntityDefinitionReference(EntityDefinitionReference object) {
				return createEntityDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseBaseEntityDefinitionReference(BaseEntityDefinitionReference object) {
				return createBaseEntityDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseCustomEntityDefinitionReference(CustomEntityDefinitionReference object) {
				return createCustomEntityDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseEntityDefinition(EntityDefinition object) {
				return createEntityDefinitionAdapter();
			}
			@Override
			public Adapter caseBaseEntityDefinition(BaseEntityDefinition object) {
				return createBaseEntityDefinitionAdapter();
			}
			@Override
			public Adapter caseCustomEntityDefinition(CustomEntityDefinition object) {
				return createCustomEntityDefinitionAdapter();
			}
			@Override
			public Adapter caseMappingEntityDefinition(MappingEntityDefinition object) {
				return createMappingEntityDefinitionAdapter();
			}
			@Override
			public Adapter caseMappingEntityDefinitionEntry(MappingEntityDefinitionEntry object) {
				return createMappingEntityDefinitionEntryAdapter();
			}
			@Override
			public Adapter caseCompositeEntityDefinition(CompositeEntityDefinition object) {
				return createCompositeEntityDefinitionAdapter();
			}
			@Override
			public Adapter caseCompositeEntityDefinitionEntry(CompositeEntityDefinitionEntry object) {
				return createCompositeEntityDefinitionEntryAdapter();
			}
			@Override
			public Adapter caseTextFragment(TextFragment object) {
				return createTextFragmentAdapter();
			}
			@Override
			public Adapter caseEntityTextFragment(EntityTextFragment object) {
				return createEntityTextFragmentAdapter();
			}
			@Override
			public Adapter caseLiteralTextFragment(LiteralTextFragment object) {
				return createLiteralTextFragmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.IntentDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.IntentDefinition
	 * @generated
	 */
	public Adapter createIntentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.ContextParameter
	 * @generated
	 */
	public Adapter createContextParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.EventInstance
	 * @generated
	 */
	public Adapter createEventInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.RecognizedIntent <em>Recognized Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.RecognizedIntent
	 * @generated
	 */
	public Adapter createRecognizedIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.ContextParameterValue <em>Context Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.ContextParameterValue
	 * @generated
	 */
	public Adapter createContextParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.EntityDefinitionReference <em>Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.EntityDefinitionReference
	 * @generated
	 */
	public Adapter createEntityDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.BaseEntityDefinitionReference <em>Base Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.BaseEntityDefinitionReference
	 * @generated
	 */
	public Adapter createBaseEntityDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.CustomEntityDefinitionReference <em>Custom Entity Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.CustomEntityDefinitionReference
	 * @generated
	 */
	public Adapter createCustomEntityDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.EntityDefinition <em>Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.EntityDefinition
	 * @generated
	 */
	public Adapter createEntityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.BaseEntityDefinition <em>Base Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.BaseEntityDefinition
	 * @generated
	 */
	public Adapter createBaseEntityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.CustomEntityDefinition <em>Custom Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.CustomEntityDefinition
	 * @generated
	 */
	public Adapter createCustomEntityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.MappingEntityDefinition <em>Mapping Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.MappingEntityDefinition
	 * @generated
	 */
	public Adapter createMappingEntityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.MappingEntityDefinitionEntry <em>Mapping Entity Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.MappingEntityDefinitionEntry
	 * @generated
	 */
	public Adapter createMappingEntityDefinitionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.CompositeEntityDefinition <em>Composite Entity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.CompositeEntityDefinition
	 * @generated
	 */
	public Adapter createCompositeEntityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.CompositeEntityDefinitionEntry <em>Composite Entity Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.CompositeEntityDefinitionEntry
	 * @generated
	 */
	public Adapter createCompositeEntityDefinitionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.TextFragment
	 * @generated
	 */
	public Adapter createTextFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.EntityTextFragment <em>Entity Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.EntityTextFragment
	 * @generated
	 */
	public Adapter createEntityTextFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.xatkit.intent.LiteralTextFragment <em>Literal Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.xatkit.intent.LiteralTextFragment
	 * @generated
	 */
	public Adapter createLiteralTextFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntentAdapterFactory

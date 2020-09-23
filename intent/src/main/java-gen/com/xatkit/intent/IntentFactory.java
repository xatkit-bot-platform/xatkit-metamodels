/**
 */
package com.xatkit.intent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.xatkit.intent.IntentPackage
 * @generated
 */
public interface IntentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntentFactory eINSTANCE = com.xatkit.intent.impl.IntentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Definition</em>'.
	 * @generated
	 */
	EventDefinition createEventDefinition();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	IntentDefinition createIntentDefinition();

	/**
	 * Returns a new object of class '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameter</em>'.
	 * @generated
	 */
	ContextParameter createContextParameter();

	/**
	 * Returns a new object of class '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Instance</em>'.
	 * @generated
	 */
	EventInstance createEventInstance();

	/**
	 * Returns a new object of class '<em>Recognized Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recognized Intent</em>'.
	 * @generated
	 */
	RecognizedIntent createRecognizedIntent();

	/**
	 * Returns a new object of class '<em>Context Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameter Value</em>'.
	 * @generated
	 */
	ContextParameterValue createContextParameterValue();

	/**
	 * Returns a new object of class '<em>Base Entity Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Entity Definition Reference</em>'.
	 * @generated
	 */
	BaseEntityDefinitionReference createBaseEntityDefinitionReference();

	/**
	 * Returns a new object of class '<em>Custom Entity Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Entity Definition Reference</em>'.
	 * @generated
	 */
	CustomEntityDefinitionReference createCustomEntityDefinitionReference();

	/**
	 * Returns a new object of class '<em>Base Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Entity Definition</em>'.
	 * @generated
	 */
	BaseEntityDefinition createBaseEntityDefinition();

	/**
	 * Returns a new object of class '<em>Mapping Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Entity Definition</em>'.
	 * @generated
	 */
	MappingEntityDefinition createMappingEntityDefinition();

	/**
	 * Returns a new object of class '<em>Mapping Entity Definition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Entity Definition Entry</em>'.
	 * @generated
	 */
	MappingEntityDefinitionEntry createMappingEntityDefinitionEntry();

	/**
	 * Returns a new object of class '<em>Composite Entity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Entity Definition</em>'.
	 * @generated
	 */
	CompositeEntityDefinition createCompositeEntityDefinition();

	/**
	 * Returns a new object of class '<em>Composite Entity Definition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Entity Definition Entry</em>'.
	 * @generated
	 */
	CompositeEntityDefinitionEntry createCompositeEntityDefinitionEntry();

	/**
	 * Returns a new object of class '<em>Entity Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Text Fragment</em>'.
	 * @generated
	 */
	EntityTextFragment createEntityTextFragment();

	/**
	 * Returns a new object of class '<em>Literal Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Text Fragment</em>'.
	 * @generated
	 */
	LiteralTextFragment createLiteralTextFragment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntentPackage getIntentPackage();

} //IntentFactory

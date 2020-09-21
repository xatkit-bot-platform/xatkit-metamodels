/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Entity Definition Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.CompositeEntityDefinitionEntry#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getCompositeEntityDefinitionEntry()
 * @model
 * @generated
 */
public interface CompositeEntityDefinitionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.TextFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getCompositeEntityDefinitionEntry_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextFragment> getFragments();
	
	/**
	 * @NotGenerated
	 * @return
	 */
	EList<EntityDefinition> getEntities();

} // CompositeEntityDefinitionEntry

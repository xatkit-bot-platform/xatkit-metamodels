/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Entity Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.CompositeEntityDefinition#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getCompositeEntityDefinition()
 * @model
 * @generated
 */
public interface CompositeEntityDefinition extends CustomEntityDefinition {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.CompositeEntityDefinitionEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getCompositeEntityDefinition_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeEntityDefinitionEntry> getEntries();

} // CompositeEntityDefinition

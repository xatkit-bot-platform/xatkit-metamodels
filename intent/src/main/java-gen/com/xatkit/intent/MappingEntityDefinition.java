/**
 */
package com.xatkit.intent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Entity Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.MappingEntityDefinition#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getMappingEntityDefinition()
 * @model
 * @generated
 */
public interface MappingEntityDefinition extends CustomEntityDefinition {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.MappingEntityDefinitionEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getMappingEntityDefinition_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingEntityDefinitionEntry> getEntries();
	
	/**
	 * @NotGenerated
	 * @return
	 */
	EList<String> getEntryValues();

} // MappingEntityDefinition

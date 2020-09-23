/**
 */
package com.xatkit.intent;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.EventInstance#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link com.xatkit.intent.EventInstance#getDefinition <em>Definition</em>}</li>
 *   <li>{@link com.xatkit.intent.EventInstance#getValues <em>Values</em>}</li>
 *   <li>{@link com.xatkit.intent.EventInstance#getPlatformData <em>Platform Data</em>}</li>
 * </ul>
 *
 * @see com.xatkit.intent.IntentPackage#getEventInstance()
 * @model
 * @generated
 */
public interface EventInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' attribute.
	 * @see #setTriggeredBy(String)
	 * @see com.xatkit.intent.IntentPackage#getEventInstance_TriggeredBy()
	 * @model unique="false"
	 * @generated
	 */
	String getTriggeredBy();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.EventInstance#getTriggeredBy <em>Triggered By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By</em>' attribute.
	 * @see #getTriggeredBy()
	 * @generated
	 */
	void setTriggeredBy(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(EventDefinition)
	 * @see com.xatkit.intent.IntentPackage#getEventInstance_Definition()
	 * @model
	 * @generated
	 */
	EventDefinition getDefinition();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.EventInstance#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link com.xatkit.intent.ContextParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see com.xatkit.intent.IntentPackage#getEventInstance_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextParameterValue> getValues();
	
	/**
	 * @NotGenerated
	 * @return the value of the {@code parameterName} parameter, or {@code null} if it doesn't exist.
	 */
	Object getValue(String parameterName);

	/**
	 * Returns the value of the '<em><b>Platform Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Data</em>' attribute.
	 * @see #setPlatformData(Map)
	 * @see com.xatkit.intent.IntentPackage#getEventInstance_PlatformData()
	 * @model unique="false" dataType="com.xatkit.intent.PlatformDataMap"
	 * @generated
	 */
	Map<String, Object> getPlatformData();

	/**
	 * Sets the value of the '{@link com.xatkit.intent.EventInstance#getPlatformData <em>Platform Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Data</em>' attribute.
	 * @see #getPlatformData()
	 * @generated
	 */
	void setPlatformData(Map<String, Object> value);

} // EventInstance

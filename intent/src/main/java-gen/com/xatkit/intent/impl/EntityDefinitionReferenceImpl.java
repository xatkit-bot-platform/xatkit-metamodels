/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.EntityDefinition;
import com.xatkit.intent.EntityDefinitionReference;
import com.xatkit.intent.IntentPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityDefinitionReferenceImpl extends MinimalEObjectImpl.Container implements EntityDefinitionReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.ENTITY_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityDefinition getReferredEntity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IntentPackage.ENTITY_DEFINITION_REFERENCE___GET_REFERRED_ENTITY:
				return getReferredEntity();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityDefinitionReferenceImpl

/**
 */
package com.xatkit.intent.impl;

import com.xatkit.intent.CompositeEntityDefinitionEntry;
import com.xatkit.intent.EntityDefinition;
import com.xatkit.intent.EntityTextFragment;
import com.xatkit.intent.IntentPackage;
import com.xatkit.intent.TextFragment;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Entity Definition Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xatkit.intent.impl.CompositeEntityDefinitionEntryImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeEntityDefinitionEntryImpl extends MinimalEObjectImpl.Container implements CompositeEntityDefinitionEntry {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<TextFragment> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeEntityDefinitionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentPackage.Literals.COMPOSITE_ENTITY_DEFINITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<TextFragment>(TextFragment.class, this, IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NotGenerated
	 */
	@Override
	public EList<EntityDefinition> getEntities() {
		EList<EntityDefinition> result = new BasicEList<>();
		this.getFragments().stream().filter(f -> (f instanceof EntityTextFragment))
				.map(f -> {
					return ((EntityTextFragment)f).getEntityReference().getReferredEntity();
				}).forEach(result::add);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS:
				return getFragments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends TextFragment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS:
				getFragments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntentPackage.COMPOSITE_ENTITY_DEFINITION_ENTRY__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeEntityDefinitionEntryImpl

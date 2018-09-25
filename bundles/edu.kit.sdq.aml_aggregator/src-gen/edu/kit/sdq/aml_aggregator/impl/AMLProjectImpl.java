/**
 */
package edu.kit.sdq.aml_aggregator.impl;

import edu.kit.sdq.aml_aggregator.AMLProject;
import edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage;
import edu.kit.sdq.aml_aggregator.CAEXContainer;
import edu.kit.sdq.aml_aggregator.ColladaContainer;
import edu.kit.sdq.aml_aggregator.PLCopenContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AML Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl#getCaexcontainer <em>Caexcontainer</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl#getPlcopencontainer <em>Plcopencontainer</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl#getColladacontainer <em>Colladacontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMLProjectImpl extends MinimalEObjectImpl.Container implements AMLProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaexcontainer() <em>Caexcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaexcontainer()
	 * @generated
	 * @ordered
	 */
	protected CAEXContainer caexcontainer;

	/**
	 * The cached value of the '{@link #getPlcopencontainer() <em>Plcopencontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlcopencontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<PLCopenContainer> plcopencontainer;

	/**
	 * The cached value of the '{@link #getColladacontainer() <em>Colladacontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColladacontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ColladaContainer> colladacontainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMLProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aml_aggregatorPackage.Literals.AML_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aml_aggregatorPackage.AML_PROJECT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXContainer getCaexcontainer() {
		return caexcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaexcontainer(CAEXContainer newCaexcontainer, NotificationChain msgs) {
		CAEXContainer oldCaexcontainer = caexcontainer;
		caexcontainer = newCaexcontainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER, oldCaexcontainer, newCaexcontainer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaexcontainer(CAEXContainer newCaexcontainer) {
		if (newCaexcontainer != caexcontainer) {
			NotificationChain msgs = null;
			if (caexcontainer != null)
				msgs = ((InternalEObject) caexcontainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER, null, msgs);
			if (newCaexcontainer != null)
				msgs = ((InternalEObject) newCaexcontainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER, null, msgs);
			msgs = basicSetCaexcontainer(newCaexcontainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER,
					newCaexcontainer, newCaexcontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PLCopenContainer> getPlcopencontainer() {
		if (plcopencontainer == null) {
			plcopencontainer = new EObjectContainmentEList<PLCopenContainer>(PLCopenContainer.class, this,
					Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER);
		}
		return plcopencontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColladaContainer> getColladacontainer() {
		if (colladacontainer == null) {
			colladacontainer = new EObjectContainmentEList<ColladaContainer>(ColladaContainer.class, this,
					Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER);
		}
		return colladacontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER:
			return basicSetCaexcontainer(null, msgs);
		case Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER:
			return ((InternalEList<?>) getPlcopencontainer()).basicRemove(otherEnd, msgs);
		case Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER:
			return ((InternalEList<?>) getColladacontainer()).basicRemove(otherEnd, msgs);
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
		case Aml_aggregatorPackage.AML_PROJECT__NAME:
			return getName();
		case Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER:
			return getCaexcontainer();
		case Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER:
			return getPlcopencontainer();
		case Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER:
			return getColladacontainer();
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
		case Aml_aggregatorPackage.AML_PROJECT__NAME:
			setName((String) newValue);
			return;
		case Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER:
			setCaexcontainer((CAEXContainer) newValue);
			return;
		case Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER:
			getPlcopencontainer().clear();
			getPlcopencontainer().addAll((Collection<? extends PLCopenContainer>) newValue);
			return;
		case Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER:
			getColladacontainer().clear();
			getColladacontainer().addAll((Collection<? extends ColladaContainer>) newValue);
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
		case Aml_aggregatorPackage.AML_PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER:
			setCaexcontainer((CAEXContainer) null);
			return;
		case Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER:
			getPlcopencontainer().clear();
			return;
		case Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER:
			getColladacontainer().clear();
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
		case Aml_aggregatorPackage.AML_PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Aml_aggregatorPackage.AML_PROJECT__CAEXCONTAINER:
			return caexcontainer != null;
		case Aml_aggregatorPackage.AML_PROJECT__PLCOPENCONTAINER:
			return plcopencontainer != null && !plcopencontainer.isEmpty();
		case Aml_aggregatorPackage.AML_PROJECT__COLLADACONTAINER:
			return colladacontainer != null && !colladacontainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AMLProjectImpl

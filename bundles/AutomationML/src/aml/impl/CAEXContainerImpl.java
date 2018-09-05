/**
 */
package aml.impl;

import aml.AmlPackage;
import aml.CAEXContainer;

import org.automationml.caex.caex.CAEXFile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aml.impl.CAEXContainerImpl#getCaexModel <em>Caex Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXContainerImpl extends ModelContainerImpl implements CAEXContainer {
	/**
	 * The cached value of the '{@link #getCaexModel() <em>Caex Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaexModel()
	 * @generated
	 * @ordered
	 */
	protected CAEXFile caexModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.CAEX_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile getCaexModel() {
		if (caexModel != null && caexModel.eIsProxy()) {
			InternalEObject oldCaexModel = (InternalEObject)caexModel;
			caexModel = (CAEXFile)eResolveProxy(oldCaexModel);
			if (caexModel != oldCaexModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmlPackage.CAEX_CONTAINER__CAEX_MODEL, oldCaexModel, caexModel));
			}
		}
		return caexModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile basicGetCaexModel() {
		return caexModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaexModel(CAEXFile newCaexModel) {
		CAEXFile oldCaexModel = caexModel;
		caexModel = newCaexModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CAEX_CONTAINER__CAEX_MODEL, oldCaexModel, caexModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.CAEX_CONTAINER__CAEX_MODEL:
				if (resolve) return getCaexModel();
				return basicGetCaexModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmlPackage.CAEX_CONTAINER__CAEX_MODEL:
				setCaexModel((CAEXFile)newValue);
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
			case AmlPackage.CAEX_CONTAINER__CAEX_MODEL:
				setCaexModel((CAEXFile)null);
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
			case AmlPackage.CAEX_CONTAINER__CAEX_MODEL:
				return caexModel != null;
		}
		return super.eIsSet(featureID);
	}

} //CAEXContainerImpl

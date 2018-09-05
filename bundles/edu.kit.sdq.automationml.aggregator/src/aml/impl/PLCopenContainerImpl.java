/**
 */
package aml.impl;

import aml.AmlPackage;
import aml.PLCopenContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.plcopen.xml.tc60201.ProjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PL Copen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aml.impl.PLCopenContainerImpl#getPlcopenModel <em>Plcopen Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLCopenContainerImpl extends ModelContainerImpl implements PLCopenContainer {
	/**
	 * The cached value of the '{@link #getPlcopenModel() <em>Plcopen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlcopenModel()
	 * @generated
	 * @ordered
	 */
	protected ProjectType plcopenModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLCopenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.PL_COPEN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType getPlcopenModel() {
		if (plcopenModel != null && plcopenModel.eIsProxy()) {
			InternalEObject oldPlcopenModel = (InternalEObject)plcopenModel;
			plcopenModel = (ProjectType)eResolveProxy(oldPlcopenModel);
			if (plcopenModel != oldPlcopenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL, oldPlcopenModel, plcopenModel));
			}
		}
		return plcopenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType basicGetPlcopenModel() {
		return plcopenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlcopenModel(ProjectType newPlcopenModel) {
		ProjectType oldPlcopenModel = plcopenModel;
		plcopenModel = newPlcopenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL, oldPlcopenModel, plcopenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL:
				if (resolve) return getPlcopenModel();
				return basicGetPlcopenModel();
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
			case AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL:
				setPlcopenModel((ProjectType)newValue);
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
			case AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL:
				setPlcopenModel((ProjectType)null);
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
			case AmlPackage.PL_COPEN_CONTAINER__PLCOPEN_MODEL:
				return plcopenModel != null;
		}
		return super.eIsSet(featureID);
	}

} //PLCopenContainerImpl

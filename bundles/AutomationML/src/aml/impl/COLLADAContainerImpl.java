/**
 */
package aml.impl;

import aml.AmlPackage;
import aml.COLLADAContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.khronos.collada.COLLADAType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COLLADA Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aml.impl.COLLADAContainerImpl#getColladaModel <em>Collada Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COLLADAContainerImpl extends ModelContainerImpl implements COLLADAContainer {
	/**
	 * The cached value of the '{@link #getColladaModel() <em>Collada Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColladaModel()
	 * @generated
	 * @ordered
	 */
	protected COLLADAType colladaModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COLLADAContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.COLLADA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COLLADAType getColladaModel() {
		if (colladaModel != null && colladaModel.eIsProxy()) {
			InternalEObject oldColladaModel = (InternalEObject)colladaModel;
			colladaModel = (COLLADAType)eResolveProxy(oldColladaModel);
			if (colladaModel != oldColladaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL, oldColladaModel, colladaModel));
			}
		}
		return colladaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COLLADAType basicGetColladaModel() {
		return colladaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColladaModel(COLLADAType newColladaModel) {
		COLLADAType oldColladaModel = colladaModel;
		colladaModel = newColladaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL, oldColladaModel, colladaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL:
				if (resolve) return getColladaModel();
				return basicGetColladaModel();
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
			case AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL:
				setColladaModel((COLLADAType)newValue);
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
			case AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL:
				setColladaModel((COLLADAType)null);
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
			case AmlPackage.COLLADA_CONTAINER__COLLADA_MODEL:
				return colladaModel != null;
		}
		return super.eIsSet(featureID);
	}

} //COLLADAContainerImpl

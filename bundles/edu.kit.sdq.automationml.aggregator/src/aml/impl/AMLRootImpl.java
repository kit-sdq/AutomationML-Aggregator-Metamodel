/**
 */
package aml.impl;

import aml.AMLRoot;
import aml.AmlPackage;
import aml.CAEXContainer;
import aml.COLLADAContainer;
import aml.PLCopenContainer;

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
 * An implementation of the model object '<em><b>AML Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aml.impl.AMLRootImpl#getColladacontainer <em>Colladacontainer</em>}</li>
 *   <li>{@link aml.impl.AMLRootImpl#getPlcopencontainer <em>Plcopencontainer</em>}</li>
 *   <li>{@link aml.impl.AMLRootImpl#getCaexcontainer <em>Caexcontainer</em>}</li>
 *   <li>{@link aml.impl.AMLRootImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMLRootImpl extends MinimalEObjectImpl.Container implements AMLRoot {
	/**
	 * The cached value of the '{@link #getColladacontainer() <em>Colladacontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColladacontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<COLLADAContainer> colladacontainer;

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
	 * The cached value of the '{@link #getCaexcontainer() <em>Caexcontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaexcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CAEXContainer> caexcontainer;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMLRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.AML_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<COLLADAContainer> getColladacontainer() {
		if (colladacontainer == null) {
			colladacontainer = new EObjectContainmentEList<COLLADAContainer>(COLLADAContainer.class, this, AmlPackage.AML_ROOT__COLLADACONTAINER);
		}
		return colladacontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PLCopenContainer> getPlcopencontainer() {
		if (plcopencontainer == null) {
			plcopencontainer = new EObjectContainmentEList<PLCopenContainer>(PLCopenContainer.class, this, AmlPackage.AML_ROOT__PLCOPENCONTAINER);
		}
		return plcopencontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CAEXContainer> getCaexcontainer() {
		if (caexcontainer == null) {
			caexcontainer = new EObjectContainmentEList<CAEXContainer>(CAEXContainer.class, this, AmlPackage.AML_ROOT__CAEXCONTAINER);
		}
		return caexcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.AML_ROOT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.AML_ROOT__COLLADACONTAINER:
				return ((InternalEList<?>)getColladacontainer()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_ROOT__PLCOPENCONTAINER:
				return ((InternalEList<?>)getPlcopencontainer()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_ROOT__CAEXCONTAINER:
				return ((InternalEList<?>)getCaexcontainer()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.AML_ROOT__COLLADACONTAINER:
				return getColladacontainer();
			case AmlPackage.AML_ROOT__PLCOPENCONTAINER:
				return getPlcopencontainer();
			case AmlPackage.AML_ROOT__CAEXCONTAINER:
				return getCaexcontainer();
			case AmlPackage.AML_ROOT__PROJECT_NAME:
				return getProjectName();
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
			case AmlPackage.AML_ROOT__COLLADACONTAINER:
				getColladacontainer().clear();
				getColladacontainer().addAll((Collection<? extends COLLADAContainer>)newValue);
				return;
			case AmlPackage.AML_ROOT__PLCOPENCONTAINER:
				getPlcopencontainer().clear();
				getPlcopencontainer().addAll((Collection<? extends PLCopenContainer>)newValue);
				return;
			case AmlPackage.AML_ROOT__CAEXCONTAINER:
				getCaexcontainer().clear();
				getCaexcontainer().addAll((Collection<? extends CAEXContainer>)newValue);
				return;
			case AmlPackage.AML_ROOT__PROJECT_NAME:
				setProjectName((String)newValue);
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
			case AmlPackage.AML_ROOT__COLLADACONTAINER:
				getColladacontainer().clear();
				return;
			case AmlPackage.AML_ROOT__PLCOPENCONTAINER:
				getPlcopencontainer().clear();
				return;
			case AmlPackage.AML_ROOT__CAEXCONTAINER:
				getCaexcontainer().clear();
				return;
			case AmlPackage.AML_ROOT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
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
			case AmlPackage.AML_ROOT__COLLADACONTAINER:
				return colladacontainer != null && !colladacontainer.isEmpty();
			case AmlPackage.AML_ROOT__PLCOPENCONTAINER:
				return plcopencontainer != null && !plcopencontainer.isEmpty();
			case AmlPackage.AML_ROOT__CAEXCONTAINER:
				return caexcontainer != null && !caexcontainer.isEmpty();
			case AmlPackage.AML_ROOT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //AMLRootImpl

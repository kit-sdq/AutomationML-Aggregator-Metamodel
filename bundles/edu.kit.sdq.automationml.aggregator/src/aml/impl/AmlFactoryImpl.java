/**
 */
package aml.impl;

import aml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmlFactoryImpl extends EFactoryImpl implements AmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmlFactory init() {
		try {
			AmlFactory theAmlFactory = (AmlFactory)EPackage.Registry.INSTANCE.getEFactory(AmlPackage.eNS_URI);
			if (theAmlFactory != null) {
				return theAmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmlPackage.AML_ROOT: return createAMLRoot();
			case AmlPackage.CAEX_CONTAINER: return createCAEXContainer();
			case AmlPackage.COLLADA_CONTAINER: return createCOLLADAContainer();
			case AmlPackage.PL_COPEN_CONTAINER: return createPLCopenContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMLRoot createAMLRoot() {
		AMLRootImpl amlRoot = new AMLRootImpl();
		return amlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXContainer createCAEXContainer() {
		CAEXContainerImpl caexContainer = new CAEXContainerImpl();
		return caexContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COLLADAContainer createCOLLADAContainer() {
		COLLADAContainerImpl colladaContainer = new COLLADAContainerImpl();
		return colladaContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLCopenContainer createPLCopenContainer() {
		PLCopenContainerImpl plCopenContainer = new PLCopenContainerImpl();
		return plCopenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlPackage getAmlPackage() {
		return (AmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmlPackage getPackage() {
		return AmlPackage.eINSTANCE;
	}

} //AmlFactoryImpl

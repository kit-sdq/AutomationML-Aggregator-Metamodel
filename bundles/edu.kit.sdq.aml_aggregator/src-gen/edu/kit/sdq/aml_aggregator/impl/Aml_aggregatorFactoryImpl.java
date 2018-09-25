/**
 */
package edu.kit.sdq.aml_aggregator.impl;

import edu.kit.sdq.aml_aggregator.*;

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
public class Aml_aggregatorFactoryImpl extends EFactoryImpl implements Aml_aggregatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aml_aggregatorFactory init() {
		try {
			Aml_aggregatorFactory theAml_aggregatorFactory = (Aml_aggregatorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Aml_aggregatorPackage.eNS_URI);
			if (theAml_aggregatorFactory != null) {
				return theAml_aggregatorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Aml_aggregatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aml_aggregatorFactoryImpl() {
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
		case Aml_aggregatorPackage.AML_PROJECT:
			return createAMLProject();
		case Aml_aggregatorPackage.CAEX_CONTAINER:
			return createCAEXContainer();
		case Aml_aggregatorPackage.PL_COPEN_CONTAINER:
			return createPLCopenContainer();
		case Aml_aggregatorPackage.COLLADA_CONTAINER:
			return createColladaContainer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMLProject createAMLProject() {
		AMLProjectImpl amlProject = new AMLProjectImpl();
		return amlProject;
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
	public PLCopenContainer createPLCopenContainer() {
		PLCopenContainerImpl plCopenContainer = new PLCopenContainerImpl();
		return plCopenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColladaContainer createColladaContainer() {
		ColladaContainerImpl colladaContainer = new ColladaContainerImpl();
		return colladaContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aml_aggregatorPackage getAml_aggregatorPackage() {
		return (Aml_aggregatorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Aml_aggregatorPackage getPackage() {
		return Aml_aggregatorPackage.eINSTANCE;
	}

} //Aml_aggregatorFactoryImpl

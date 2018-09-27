/**
 */
package edu.kit.sdq.aml_aggregator.impl;

import edu.kit.sdq.aml_aggregator.AMLProject;
import edu.kit.sdq.aml_aggregator.Aml_aggregatorFactory;
import edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage;
import edu.kit.sdq.aml_aggregator.CAEXContainer;
import edu.kit.sdq.aml_aggregator.ColladaContainer;
import edu.kit.sdq.aml_aggregator.ModelContainer;
import edu.kit.sdq.aml_aggregator.PLCopenContainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aml_aggregatorPackageImpl extends EPackageImpl implements Aml_aggregatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amlProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plCopenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colladaContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelContainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aml_aggregatorPackageImpl() {
		super(eNS_URI, Aml_aggregatorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Aml_aggregatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aml_aggregatorPackage init() {
		if (isInited)
			return (Aml_aggregatorPackage) EPackage.Registry.INSTANCE.getEPackage(Aml_aggregatorPackage.eNS_URI);

		// Obtain or create and register package
		Aml_aggregatorPackageImpl theAml_aggregatorPackage = (Aml_aggregatorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Aml_aggregatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Aml_aggregatorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAml_aggregatorPackage.createPackageContents();

		// Initialize created meta-data
		theAml_aggregatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAml_aggregatorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aml_aggregatorPackage.eNS_URI, theAml_aggregatorPackage);
		return theAml_aggregatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMLProject() {
		return amlProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAMLProject_Name() {
		return (EAttribute) amlProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLProject_Caexcontainer() {
		return (EReference) amlProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLProject_Plcopencontainer() {
		return (EReference) amlProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLProject_Colladacontainer() {
		return (EReference) amlProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXContainer() {
		return caexContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLCopenContainer() {
		return plCopenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColladaContainer() {
		return colladaContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelContainer() {
		return modelContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelContainer_Path() {
		return (EAttribute) modelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aml_aggregatorFactory getAml_aggregatorFactory() {
		return (Aml_aggregatorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		amlProjectEClass = createEClass(AML_PROJECT);
		createEAttribute(amlProjectEClass, AML_PROJECT__NAME);
		createEReference(amlProjectEClass, AML_PROJECT__CAEXCONTAINER);
		createEReference(amlProjectEClass, AML_PROJECT__PLCOPENCONTAINER);
		createEReference(amlProjectEClass, AML_PROJECT__COLLADACONTAINER);

		caexContainerEClass = createEClass(CAEX_CONTAINER);

		plCopenContainerEClass = createEClass(PL_COPEN_CONTAINER);

		colladaContainerEClass = createEClass(COLLADA_CONTAINER);

		modelContainerEClass = createEClass(MODEL_CONTAINER);
		createEAttribute(modelContainerEClass, MODEL_CONTAINER__PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		caexContainerEClass.getESuperTypes().add(this.getModelContainer());
		plCopenContainerEClass.getESuperTypes().add(this.getModelContainer());
		colladaContainerEClass.getESuperTypes().add(this.getModelContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(amlProjectEClass, AMLProject.class, "AMLProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAMLProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, AMLProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMLProject_Caexcontainer(), this.getCAEXContainer(), null, "caexcontainer", null, 1, 1,
				AMLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMLProject_Plcopencontainer(), this.getPLCopenContainer(), null, "plcopencontainer", null, 0,
				-1, AMLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMLProject_Colladacontainer(), this.getColladaContainer(), null, "colladacontainer", null, 0,
				-1, AMLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexContainerEClass, CAEXContainer.class, "CAEXContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(plCopenContainerEClass, PLCopenContainer.class, "PLCopenContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colladaContainerEClass, ColladaContainer.class, "ColladaContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelContainerEClass, ModelContainer.class, "ModelContainer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelContainer_Path(), ecorePackage.getEString(), "path", null, 1, 1, ModelContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Aml_aggregatorPackageImpl

/**
 */
package aml.impl;

import aml.AMLRoot;
import aml.AmlFactory;
import aml.AmlPackage;
import aml.CAEXContainer;
import aml.COLLADAContainer;
import aml.ModelContainer;
import aml.PLCopenContainer;

import caex.anytype.AnytypePackage;

import org.automationml.caex.caex.CaexPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.khronos.collada.ColladaPackage;

import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmlPackageImpl extends EPackageImpl implements AmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amlRootEClass = null;

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
	private EClass colladaContainerEClass = null;

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
	 * @see aml.AmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AmlPackageImpl() {
		super(eNS_URI, AmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AmlPackage init() {
		if (isInited) return (AmlPackage)EPackage.Registry.INSTANCE.getEPackage(AmlPackage.eNS_URI);

		// Obtain or create and register package
		AmlPackageImpl theAmlPackage = (AmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CaexPackage.eINSTANCE.eClass();
		ColladaPackage.eINSTANCE.eClass();
		AnytypePackage.eINSTANCE.eClass();
		Tc60201Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAmlPackage.createPackageContents();

		// Initialize created meta-data
		theAmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AmlPackage.eNS_URI, theAmlPackage);
		return theAmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMLRoot() {
		return amlRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLRoot_Colladacontainer() {
		return (EReference)amlRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLRoot_Plcopencontainer() {
		return (EReference)amlRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMLRoot_Caexcontainer() {
		return (EReference)amlRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAMLRoot_ProjectName() {
		return (EAttribute)amlRootEClass.getEStructuralFeatures().get(3);
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
	public EReference getCAEXContainer_CaexModel() {
		return (EReference)caexContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOLLADAContainer() {
		return colladaContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOLLADAContainer_ColladaModel() {
		return (EReference)colladaContainerEClass.getEStructuralFeatures().get(0);
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
	public EReference getPLCopenContainer_PlcopenModel() {
		return (EReference)plCopenContainerEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)modelContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlFactory getAmlFactory() {
		return (AmlFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		amlRootEClass = createEClass(AML_ROOT);
		createEReference(amlRootEClass, AML_ROOT__COLLADACONTAINER);
		createEReference(amlRootEClass, AML_ROOT__PLCOPENCONTAINER);
		createEReference(amlRootEClass, AML_ROOT__CAEXCONTAINER);
		createEAttribute(amlRootEClass, AML_ROOT__PROJECT_NAME);

		caexContainerEClass = createEClass(CAEX_CONTAINER);
		createEReference(caexContainerEClass, CAEX_CONTAINER__CAEX_MODEL);

		colladaContainerEClass = createEClass(COLLADA_CONTAINER);
		createEReference(colladaContainerEClass, COLLADA_CONTAINER__COLLADA_MODEL);

		plCopenContainerEClass = createEClass(PL_COPEN_CONTAINER);
		createEReference(plCopenContainerEClass, PL_COPEN_CONTAINER__PLCOPEN_MODEL);

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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ColladaPackage theColladaPackage = (ColladaPackage)EPackage.Registry.INSTANCE.getEPackage(ColladaPackage.eNS_URI);
		CaexPackage theCaexPackage = (CaexPackage)EPackage.Registry.INSTANCE.getEPackage(CaexPackage.eNS_URI);
		Tc60201Package theTc60201Package = (Tc60201Package)EPackage.Registry.INSTANCE.getEPackage(Tc60201Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		caexContainerEClass.getESuperTypes().add(this.getModelContainer());
		colladaContainerEClass.getESuperTypes().add(this.getModelContainer());
		plCopenContainerEClass.getESuperTypes().add(this.getModelContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(amlRootEClass, AMLRoot.class, "AMLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAMLRoot_Colladacontainer(), this.getCOLLADAContainer(), null, "colladacontainer", null, 0, -1, AMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMLRoot_Plcopencontainer(), this.getPLCopenContainer(), null, "plcopencontainer", null, 0, -1, AMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMLRoot_Caexcontainer(), this.getCAEXContainer(), null, "caexcontainer", null, 1, -1, AMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAMLRoot_ProjectName(), theColladaPackage.getString(), "projectName", null, 1, 1, AMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexContainerEClass, CAEXContainer.class, "CAEXContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCAEXContainer_CaexModel(), theCaexPackage.getCAEXFile(), null, "caexModel", null, 1, 1, CAEXContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colladaContainerEClass, COLLADAContainer.class, "COLLADAContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOLLADAContainer_ColladaModel(), theColladaPackage.getCOLLADAType(), null, "colladaModel", null, 1, 1, COLLADAContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plCopenContainerEClass, PLCopenContainer.class, "PLCopenContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPLCopenContainer_PlcopenModel(), theTc60201Package.getProjectType(), null, "plcopenModel", null, 1, 1, PLCopenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelContainerEClass, ModelContainer.class, "ModelContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelContainer_Path(), ecorePackage.getEString(), "path", null, 1, 1, ModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AmlPackageImpl

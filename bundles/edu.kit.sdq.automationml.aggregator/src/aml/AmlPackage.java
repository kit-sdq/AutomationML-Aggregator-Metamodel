/**
 */
package aml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aml.AmlFactory
 * @model kind="package"
 * @generated
 */
public interface AmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.ipd.sdq.aml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmlPackage eINSTANCE = aml.impl.AmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link aml.impl.AMLRootImpl <em>AML Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aml.impl.AMLRootImpl
	 * @see aml.impl.AmlPackageImpl#getAMLRoot()
	 * @generated
	 */
	int AML_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Colladacontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT__COLLADACONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Plcopencontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT__PLCOPENCONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Caexcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT__CAEXCONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT__PROJECT_NAME = 3;

	/**
	 * The number of structural features of the '<em>AML Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>AML Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aml.impl.ModelContainerImpl <em>Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aml.impl.ModelContainerImpl
	 * @see aml.impl.AmlPackageImpl#getModelContainer()
	 * @generated
	 */
	int MODEL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONTAINER__PATH = 0;

	/**
	 * The number of structural features of the '<em>Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aml.impl.CAEXContainerImpl <em>CAEX Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aml.impl.CAEXContainerImpl
	 * @see aml.impl.AmlPackageImpl#getCAEXContainer()
	 * @generated
	 */
	int CAEX_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER__PATH = MODEL_CONTAINER__PATH;

	/**
	 * The feature id for the '<em><b>Caex Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER__CAEX_MODEL = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CAEX Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CAEX Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aml.impl.COLLADAContainerImpl <em>COLLADA Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aml.impl.COLLADAContainerImpl
	 * @see aml.impl.AmlPackageImpl#getCOLLADAContainer()
	 * @generated
	 */
	int COLLADA_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER__PATH = MODEL_CONTAINER__PATH;

	/**
	 * The feature id for the '<em><b>Collada Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER__COLLADA_MODEL = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>COLLADA Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>COLLADA Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aml.impl.PLCopenContainerImpl <em>PL Copen Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aml.impl.PLCopenContainerImpl
	 * @see aml.impl.AmlPackageImpl#getPLCopenContainer()
	 * @generated
	 */
	int PL_COPEN_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER__PATH = MODEL_CONTAINER__PATH;

	/**
	 * The feature id for the '<em><b>Plcopen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER__PLCOPEN_MODEL = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PL Copen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PL Copen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aml.AMLRoot <em>AML Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AML Root</em>'.
	 * @see aml.AMLRoot
	 * @generated
	 */
	EClass getAMLRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link aml.AMLRoot#getColladacontainer <em>Colladacontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colladacontainer</em>'.
	 * @see aml.AMLRoot#getColladacontainer()
	 * @see #getAMLRoot()
	 * @generated
	 */
	EReference getAMLRoot_Colladacontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link aml.AMLRoot#getPlcopencontainer <em>Plcopencontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plcopencontainer</em>'.
	 * @see aml.AMLRoot#getPlcopencontainer()
	 * @see #getAMLRoot()
	 * @generated
	 */
	EReference getAMLRoot_Plcopencontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link aml.AMLRoot#getCaexcontainer <em>Caexcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caexcontainer</em>'.
	 * @see aml.AMLRoot#getCaexcontainer()
	 * @see #getAMLRoot()
	 * @generated
	 */
	EReference getAMLRoot_Caexcontainer();

	/**
	 * Returns the meta object for the attribute '{@link aml.AMLRoot#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see aml.AMLRoot#getProjectName()
	 * @see #getAMLRoot()
	 * @generated
	 */
	EAttribute getAMLRoot_ProjectName();

	/**
	 * Returns the meta object for class '{@link aml.CAEXContainer <em>CAEX Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Container</em>'.
	 * @see aml.CAEXContainer
	 * @generated
	 */
	EClass getCAEXContainer();

	/**
	 * Returns the meta object for the reference '{@link aml.CAEXContainer#getCaexModel <em>Caex Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caex Model</em>'.
	 * @see aml.CAEXContainer#getCaexModel()
	 * @see #getCAEXContainer()
	 * @generated
	 */
	EReference getCAEXContainer_CaexModel();

	/**
	 * Returns the meta object for class '{@link aml.COLLADAContainer <em>COLLADA Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COLLADA Container</em>'.
	 * @see aml.COLLADAContainer
	 * @generated
	 */
	EClass getCOLLADAContainer();

	/**
	 * Returns the meta object for the reference '{@link aml.COLLADAContainer#getColladaModel <em>Collada Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collada Model</em>'.
	 * @see aml.COLLADAContainer#getColladaModel()
	 * @see #getCOLLADAContainer()
	 * @generated
	 */
	EReference getCOLLADAContainer_ColladaModel();

	/**
	 * Returns the meta object for class '{@link aml.PLCopenContainer <em>PL Copen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PL Copen Container</em>'.
	 * @see aml.PLCopenContainer
	 * @generated
	 */
	EClass getPLCopenContainer();

	/**
	 * Returns the meta object for the reference '{@link aml.PLCopenContainer#getPlcopenModel <em>Plcopen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plcopen Model</em>'.
	 * @see aml.PLCopenContainer#getPlcopenModel()
	 * @see #getPLCopenContainer()
	 * @generated
	 */
	EReference getPLCopenContainer_PlcopenModel();

	/**
	 * Returns the meta object for class '{@link aml.ModelContainer <em>Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Container</em>'.
	 * @see aml.ModelContainer
	 * @generated
	 */
	EClass getModelContainer();

	/**
	 * Returns the meta object for the attribute '{@link aml.ModelContainer#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see aml.ModelContainer#getPath()
	 * @see #getModelContainer()
	 * @generated
	 */
	EAttribute getModelContainer_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmlFactory getAmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aml.impl.AMLRootImpl <em>AML Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aml.impl.AMLRootImpl
		 * @see aml.impl.AmlPackageImpl#getAMLRoot()
		 * @generated
		 */
		EClass AML_ROOT = eINSTANCE.getAMLRoot();

		/**
		 * The meta object literal for the '<em><b>Colladacontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_ROOT__COLLADACONTAINER = eINSTANCE.getAMLRoot_Colladacontainer();

		/**
		 * The meta object literal for the '<em><b>Plcopencontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_ROOT__PLCOPENCONTAINER = eINSTANCE.getAMLRoot_Plcopencontainer();

		/**
		 * The meta object literal for the '<em><b>Caexcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_ROOT__CAEXCONTAINER = eINSTANCE.getAMLRoot_Caexcontainer();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AML_ROOT__PROJECT_NAME = eINSTANCE.getAMLRoot_ProjectName();

		/**
		 * The meta object literal for the '{@link aml.impl.CAEXContainerImpl <em>CAEX Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aml.impl.CAEXContainerImpl
		 * @see aml.impl.AmlPackageImpl#getCAEXContainer()
		 * @generated
		 */
		EClass CAEX_CONTAINER = eINSTANCE.getCAEXContainer();

		/**
		 * The meta object literal for the '<em><b>Caex Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_CONTAINER__CAEX_MODEL = eINSTANCE.getCAEXContainer_CaexModel();

		/**
		 * The meta object literal for the '{@link aml.impl.COLLADAContainerImpl <em>COLLADA Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aml.impl.COLLADAContainerImpl
		 * @see aml.impl.AmlPackageImpl#getCOLLADAContainer()
		 * @generated
		 */
		EClass COLLADA_CONTAINER = eINSTANCE.getCOLLADAContainer();

		/**
		 * The meta object literal for the '<em><b>Collada Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLADA_CONTAINER__COLLADA_MODEL = eINSTANCE.getCOLLADAContainer_ColladaModel();

		/**
		 * The meta object literal for the '{@link aml.impl.PLCopenContainerImpl <em>PL Copen Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aml.impl.PLCopenContainerImpl
		 * @see aml.impl.AmlPackageImpl#getPLCopenContainer()
		 * @generated
		 */
		EClass PL_COPEN_CONTAINER = eINSTANCE.getPLCopenContainer();

		/**
		 * The meta object literal for the '<em><b>Plcopen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PL_COPEN_CONTAINER__PLCOPEN_MODEL = eINSTANCE.getPLCopenContainer_PlcopenModel();

		/**
		 * The meta object literal for the '{@link aml.impl.ModelContainerImpl <em>Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aml.impl.ModelContainerImpl
		 * @see aml.impl.AmlPackageImpl#getModelContainer()
		 * @generated
		 */
		EClass MODEL_CONTAINER = eINSTANCE.getModelContainer();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_CONTAINER__PATH = eINSTANCE.getModelContainer_Path();

	}

} //AmlPackage

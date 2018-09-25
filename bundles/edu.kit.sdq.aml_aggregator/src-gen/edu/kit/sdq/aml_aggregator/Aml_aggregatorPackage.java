/**
 */
package edu.kit.sdq.aml_aggregator;

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
 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorFactory
 * @model kind="package"
 * @generated
 */
public interface Aml_aggregatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aml_aggregator";

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
	Aml_aggregatorPackage eINSTANCE = edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl <em>AML Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl
	 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getAMLProject()
	 * @generated
	 */
	int AML_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Caexcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT__CAEXCONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Plcopencontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT__PLCOPENCONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Colladacontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT__COLLADACONTAINER = 3;

	/**
	 * The number of structural features of the '<em>AML Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>AML Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.aml_aggregator.impl.ModelContainerImpl <em>Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.aml_aggregator.impl.ModelContainerImpl
	 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getModelContainer()
	 * @generated
	 */
	int MODEL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONTAINER__NAME = 0;

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
	 * The meta object id for the '{@link edu.kit.sdq.aml_aggregator.impl.CAEXContainerImpl <em>CAEX Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.aml_aggregator.impl.CAEXContainerImpl
	 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getCAEXContainer()
	 * @generated
	 */
	int CAEX_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER__NAME = MODEL_CONTAINER__NAME;

	/**
	 * The number of structural features of the '<em>CAEX Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAEX Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.aml_aggregator.impl.PLCopenContainerImpl <em>PL Copen Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.aml_aggregator.impl.PLCopenContainerImpl
	 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getPLCopenContainer()
	 * @generated
	 */
	int PL_COPEN_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER__NAME = MODEL_CONTAINER__NAME;

	/**
	 * The number of structural features of the '<em>PL Copen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PL Copen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_COPEN_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.aml_aggregator.impl.ColladaContainerImpl <em>Collada Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.aml_aggregator.impl.ColladaContainerImpl
	 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getColladaContainer()
	 * @generated
	 */
	int COLLADA_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER__NAME = MODEL_CONTAINER__NAME;

	/**
	 * The number of structural features of the '<em>Collada Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER_FEATURE_COUNT = MODEL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collada Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLADA_CONTAINER_OPERATION_COUNT = MODEL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.aml_aggregator.AMLProject <em>AML Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AML Project</em>'.
	 * @see edu.kit.sdq.aml_aggregator.AMLProject
	 * @generated
	 */
	EClass getAMLProject();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.aml_aggregator.AMLProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.sdq.aml_aggregator.AMLProject#getName()
	 * @see #getAMLProject()
	 * @generated
	 */
	EAttribute getAMLProject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.sdq.aml_aggregator.AMLProject#getCaexcontainer <em>Caexcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caexcontainer</em>'.
	 * @see edu.kit.sdq.aml_aggregator.AMLProject#getCaexcontainer()
	 * @see #getAMLProject()
	 * @generated
	 */
	EReference getAMLProject_Caexcontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.aml_aggregator.AMLProject#getPlcopencontainer <em>Plcopencontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plcopencontainer</em>'.
	 * @see edu.kit.sdq.aml_aggregator.AMLProject#getPlcopencontainer()
	 * @see #getAMLProject()
	 * @generated
	 */
	EReference getAMLProject_Plcopencontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.aml_aggregator.AMLProject#getColladacontainer <em>Colladacontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colladacontainer</em>'.
	 * @see edu.kit.sdq.aml_aggregator.AMLProject#getColladacontainer()
	 * @see #getAMLProject()
	 * @generated
	 */
	EReference getAMLProject_Colladacontainer();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.aml_aggregator.CAEXContainer <em>CAEX Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Container</em>'.
	 * @see edu.kit.sdq.aml_aggregator.CAEXContainer
	 * @generated
	 */
	EClass getCAEXContainer();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.aml_aggregator.PLCopenContainer <em>PL Copen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PL Copen Container</em>'.
	 * @see edu.kit.sdq.aml_aggregator.PLCopenContainer
	 * @generated
	 */
	EClass getPLCopenContainer();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.aml_aggregator.ColladaContainer <em>Collada Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collada Container</em>'.
	 * @see edu.kit.sdq.aml_aggregator.ColladaContainer
	 * @generated
	 */
	EClass getColladaContainer();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.aml_aggregator.ModelContainer <em>Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Container</em>'.
	 * @see edu.kit.sdq.aml_aggregator.ModelContainer
	 * @generated
	 */
	EClass getModelContainer();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.aml_aggregator.ModelContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.sdq.aml_aggregator.ModelContainer#getName()
	 * @see #getModelContainer()
	 * @generated
	 */
	EAttribute getModelContainer_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Aml_aggregatorFactory getAml_aggregatorFactory();

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
		 * The meta object literal for the '{@link edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl <em>AML Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.aml_aggregator.impl.AMLProjectImpl
		 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getAMLProject()
		 * @generated
		 */
		EClass AML_PROJECT = eINSTANCE.getAMLProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AML_PROJECT__NAME = eINSTANCE.getAMLProject_Name();

		/**
		 * The meta object literal for the '<em><b>Caexcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_PROJECT__CAEXCONTAINER = eINSTANCE.getAMLProject_Caexcontainer();

		/**
		 * The meta object literal for the '<em><b>Plcopencontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_PROJECT__PLCOPENCONTAINER = eINSTANCE.getAMLProject_Plcopencontainer();

		/**
		 * The meta object literal for the '<em><b>Colladacontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_PROJECT__COLLADACONTAINER = eINSTANCE.getAMLProject_Colladacontainer();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.aml_aggregator.impl.CAEXContainerImpl <em>CAEX Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.aml_aggregator.impl.CAEXContainerImpl
		 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getCAEXContainer()
		 * @generated
		 */
		EClass CAEX_CONTAINER = eINSTANCE.getCAEXContainer();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.aml_aggregator.impl.PLCopenContainerImpl <em>PL Copen Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.aml_aggregator.impl.PLCopenContainerImpl
		 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getPLCopenContainer()
		 * @generated
		 */
		EClass PL_COPEN_CONTAINER = eINSTANCE.getPLCopenContainer();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.aml_aggregator.impl.ColladaContainerImpl <em>Collada Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.aml_aggregator.impl.ColladaContainerImpl
		 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getColladaContainer()
		 * @generated
		 */
		EClass COLLADA_CONTAINER = eINSTANCE.getColladaContainer();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.aml_aggregator.impl.ModelContainerImpl <em>Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.aml_aggregator.impl.ModelContainerImpl
		 * @see edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorPackageImpl#getModelContainer()
		 * @generated
		 */
		EClass MODEL_CONTAINER = eINSTANCE.getModelContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_CONTAINER__NAME = eINSTANCE.getModelContainer_Name();

	}

} //Aml_aggregatorPackage

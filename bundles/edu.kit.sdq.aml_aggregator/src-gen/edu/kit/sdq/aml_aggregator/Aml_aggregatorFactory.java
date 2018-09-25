/**
 */
package edu.kit.sdq.aml_aggregator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage
 * @generated
 */
public interface Aml_aggregatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aml_aggregatorFactory eINSTANCE = edu.kit.sdq.aml_aggregator.impl.Aml_aggregatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AML Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AML Project</em>'.
	 * @generated
	 */
	AMLProject createAMLProject();

	/**
	 * Returns a new object of class '<em>CAEX Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Container</em>'.
	 * @generated
	 */
	CAEXContainer createCAEXContainer();

	/**
	 * Returns a new object of class '<em>PL Copen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PL Copen Container</em>'.
	 * @generated
	 */
	PLCopenContainer createPLCopenContainer();

	/**
	 * Returns a new object of class '<em>Collada Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collada Container</em>'.
	 * @generated
	 */
	ColladaContainer createColladaContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Aml_aggregatorPackage getAml_aggregatorPackage();

} //Aml_aggregatorFactory

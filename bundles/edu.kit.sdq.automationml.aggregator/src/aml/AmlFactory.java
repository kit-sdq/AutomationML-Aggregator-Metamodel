/**
 */
package aml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aml.AmlPackage
 * @generated
 */
public interface AmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmlFactory eINSTANCE = aml.impl.AmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AML Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AML Root</em>'.
	 * @generated
	 */
	AMLRoot createAMLRoot();

	/**
	 * Returns a new object of class '<em>CAEX Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAEX Container</em>'.
	 * @generated
	 */
	CAEXContainer createCAEXContainer();

	/**
	 * Returns a new object of class '<em>COLLADA Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COLLADA Container</em>'.
	 * @generated
	 */
	COLLADAContainer createCOLLADAContainer();

	/**
	 * Returns a new object of class '<em>PL Copen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PL Copen Container</em>'.
	 * @generated
	 */
	PLCopenContainer createPLCopenContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AmlPackage getAmlPackage();

} //AmlFactory

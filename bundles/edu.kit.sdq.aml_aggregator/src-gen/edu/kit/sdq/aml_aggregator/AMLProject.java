/**
 */
package edu.kit.sdq.aml_aggregator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AML Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.aml_aggregator.AMLProject#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.AMLProject#getCaexcontainer <em>Caexcontainer</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.AMLProject#getPlcopencontainer <em>Plcopencontainer</em>}</li>
 *   <li>{@link edu.kit.sdq.aml_aggregator.AMLProject#getColladacontainer <em>Colladacontainer</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#getAMLProject()
 * @model
 * @generated
 */
public interface AMLProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#getAMLProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.aml_aggregator.AMLProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Caexcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caexcontainer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caexcontainer</em>' containment reference.
	 * @see #setCaexcontainer(CAEXContainer)
	 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#getAMLProject_Caexcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CAEXContainer getCaexcontainer();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.aml_aggregator.AMLProject#getCaexcontainer <em>Caexcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caexcontainer</em>' containment reference.
	 * @see #getCaexcontainer()
	 * @generated
	 */
	void setCaexcontainer(CAEXContainer value);

	/**
	 * Returns the value of the '<em><b>Plcopencontainer</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.aml_aggregator.PLCopenContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plcopencontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plcopencontainer</em>' containment reference list.
	 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#getAMLProject_Plcopencontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<PLCopenContainer> getPlcopencontainer();

	/**
	 * Returns the value of the '<em><b>Colladacontainer</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.aml_aggregator.ColladaContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colladacontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colladacontainer</em>' containment reference list.
	 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage#getAMLProject_Colladacontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColladaContainer> getColladacontainer();

} // AMLProject

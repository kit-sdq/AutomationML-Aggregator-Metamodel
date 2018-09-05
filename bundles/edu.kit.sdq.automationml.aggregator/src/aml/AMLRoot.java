/**
 */
package aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AML Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aml.AMLRoot#getColladacontainer <em>Colladacontainer</em>}</li>
 *   <li>{@link aml.AMLRoot#getPlcopencontainer <em>Plcopencontainer</em>}</li>
 *   <li>{@link aml.AMLRoot#getCaexcontainer <em>Caexcontainer</em>}</li>
 *   <li>{@link aml.AMLRoot#getProjectName <em>Project Name</em>}</li>
 * </ul>
 *
 * @see aml.AmlPackage#getAMLRoot()
 * @model
 * @generated
 */
public interface AMLRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Colladacontainer</b></em>' containment reference list.
	 * The list contents are of type {@link aml.COLLADAContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colladacontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colladacontainer</em>' containment reference list.
	 * @see aml.AmlPackage#getAMLRoot_Colladacontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<COLLADAContainer> getColladacontainer();

	/**
	 * Returns the value of the '<em><b>Plcopencontainer</b></em>' containment reference list.
	 * The list contents are of type {@link aml.PLCopenContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plcopencontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plcopencontainer</em>' containment reference list.
	 * @see aml.AmlPackage#getAMLRoot_Plcopencontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<PLCopenContainer> getPlcopencontainer();

	/**
	 * Returns the value of the '<em><b>Caexcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link aml.CAEXContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caexcontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caexcontainer</em>' containment reference list.
	 * @see aml.AmlPackage#getAMLRoot_Caexcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CAEXContainer> getCaexcontainer();

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see aml.AmlPackage#getAMLRoot_ProjectName()
	 * @model dataType="org.khronos.collada.String" required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link aml.AMLRoot#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

} // AMLRoot

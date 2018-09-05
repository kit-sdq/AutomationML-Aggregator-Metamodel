/**
 */
package aml;

import org.plcopen.xml.tc60201.ProjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PL Copen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aml.PLCopenContainer#getPlcopenModel <em>Plcopen Model</em>}</li>
 * </ul>
 *
 * @see aml.AmlPackage#getPLCopenContainer()
 * @model
 * @generated
 */
public interface PLCopenContainer extends ModelContainer {
	/**
	 * Returns the value of the '<em><b>Plcopen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plcopen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plcopen Model</em>' reference.
	 * @see #setPlcopenModel(ProjectType)
	 * @see aml.AmlPackage#getPLCopenContainer_PlcopenModel()
	 * @model required="true"
	 * @generated
	 */
	ProjectType getPlcopenModel();

	/**
	 * Sets the value of the '{@link aml.PLCopenContainer#getPlcopenModel <em>Plcopen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plcopen Model</em>' reference.
	 * @see #getPlcopenModel()
	 * @generated
	 */
	void setPlcopenModel(ProjectType value);

} // PLCopenContainer

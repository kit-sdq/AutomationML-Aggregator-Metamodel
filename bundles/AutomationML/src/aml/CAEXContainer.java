/**
 */
package aml;

import org.automationml.caex.caex.CAEXFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aml.CAEXContainer#getCaexModel <em>Caex Model</em>}</li>
 * </ul>
 *
 * @see aml.AmlPackage#getCAEXContainer()
 * @model
 * @generated
 */
public interface CAEXContainer extends ModelContainer {
	/**
	 * Returns the value of the '<em><b>Caex Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caex Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caex Model</em>' reference.
	 * @see #setCaexModel(CAEXFile)
	 * @see aml.AmlPackage#getCAEXContainer_CaexModel()
	 * @model required="true"
	 * @generated
	 */
	CAEXFile getCaexModel();

	/**
	 * Sets the value of the '{@link aml.CAEXContainer#getCaexModel <em>Caex Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caex Model</em>' reference.
	 * @see #getCaexModel()
	 * @generated
	 */
	void setCaexModel(CAEXFile value);

} // CAEXContainer

/**
 */
package aml;

import org.khronos.collada.COLLADAType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COLLADA Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aml.COLLADAContainer#getColladaModel <em>Collada Model</em>}</li>
 * </ul>
 *
 * @see aml.AmlPackage#getCOLLADAContainer()
 * @model
 * @generated
 */
public interface COLLADAContainer extends ModelContainer {
	/**
	 * Returns the value of the '<em><b>Collada Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collada Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collada Model</em>' reference.
	 * @see #setColladaModel(COLLADAType)
	 * @see aml.AmlPackage#getCOLLADAContainer_ColladaModel()
	 * @model required="true"
	 * @generated
	 */
	COLLADAType getColladaModel();

	/**
	 * Sets the value of the '{@link aml.COLLADAContainer#getColladaModel <em>Collada Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collada Model</em>' reference.
	 * @see #getColladaModel()
	 * @generated
	 */
	void setColladaModel(COLLADAType value);

} // COLLADAContainer

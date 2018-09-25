/**
 */
package edu.kit.sdq.aml_aggregator.util;

import edu.kit.sdq.aml_aggregator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.sdq.aml_aggregator.Aml_aggregatorPackage
 * @generated
 */
public class Aml_aggregatorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Aml_aggregatorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aml_aggregatorSwitch() {
		if (modelPackage == null) {
			modelPackage = Aml_aggregatorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Aml_aggregatorPackage.AML_PROJECT: {
			AMLProject amlProject = (AMLProject) theEObject;
			T result = caseAMLProject(amlProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aml_aggregatorPackage.CAEX_CONTAINER: {
			CAEXContainer caexContainer = (CAEXContainer) theEObject;
			T result = caseCAEXContainer(caexContainer);
			if (result == null)
				result = caseModelContainer(caexContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aml_aggregatorPackage.PL_COPEN_CONTAINER: {
			PLCopenContainer plCopenContainer = (PLCopenContainer) theEObject;
			T result = casePLCopenContainer(plCopenContainer);
			if (result == null)
				result = caseModelContainer(plCopenContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aml_aggregatorPackage.COLLADA_CONTAINER: {
			ColladaContainer colladaContainer = (ColladaContainer) theEObject;
			T result = caseColladaContainer(colladaContainer);
			if (result == null)
				result = caseModelContainer(colladaContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Aml_aggregatorPackage.MODEL_CONTAINER: {
			ModelContainer modelContainer = (ModelContainer) theEObject;
			T result = caseModelContainer(modelContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AML Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AML Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMLProject(AMLProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXContainer(CAEXContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PL Copen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PL Copen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLCopenContainer(PLCopenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collada Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collada Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColladaContainer(ColladaContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelContainer(ModelContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Aml_aggregatorSwitch

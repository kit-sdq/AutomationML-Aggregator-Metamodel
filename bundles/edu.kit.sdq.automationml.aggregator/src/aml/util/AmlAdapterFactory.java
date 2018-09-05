/**
 */
package aml.util;

import aml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aml.AmlPackage
 * @generated
 */
public class AmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmlSwitch<Adapter> modelSwitch =
		new AmlSwitch<Adapter>() {
			@Override
			public Adapter caseAMLRoot(AMLRoot object) {
				return createAMLRootAdapter();
			}
			@Override
			public Adapter caseCAEXContainer(CAEXContainer object) {
				return createCAEXContainerAdapter();
			}
			@Override
			public Adapter caseCOLLADAContainer(COLLADAContainer object) {
				return createCOLLADAContainerAdapter();
			}
			@Override
			public Adapter casePLCopenContainer(PLCopenContainer object) {
				return createPLCopenContainerAdapter();
			}
			@Override
			public Adapter caseModelContainer(ModelContainer object) {
				return createModelContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aml.AMLRoot <em>AML Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aml.AMLRoot
	 * @generated
	 */
	public Adapter createAMLRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aml.CAEXContainer <em>CAEX Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aml.CAEXContainer
	 * @generated
	 */
	public Adapter createCAEXContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aml.COLLADAContainer <em>COLLADA Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aml.COLLADAContainer
	 * @generated
	 */
	public Adapter createCOLLADAContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aml.PLCopenContainer <em>PL Copen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aml.PLCopenContainer
	 * @generated
	 */
	public Adapter createPLCopenContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aml.ModelContainer <em>Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aml.ModelContainer
	 * @generated
	 */
	public Adapter createModelContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AmlAdapterFactory

/**
 */
package fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>eAction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.eAction#getExitLabel <em>Exit Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#geteAction()
 * @model
 * @generated
 */
public interface eAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Exit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Label</em>' attribute.
	 * @see #setExitLabel(String)
	 * @see fsm.FsmPackage#geteAction_ExitLabel()
	 * @model
	 * @generated
	 */
	String getExitLabel();

	/**
	 * Sets the value of the '{@link fsm.eAction#getExitLabel <em>Exit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Label</em>' attribute.
	 * @see #getExitLabel()
	 * @generated
	 */
	void setExitLabel(String value);

} // eAction

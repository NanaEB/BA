/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.FSM#getState <em>State</em>}</li>
 *   <li>{@link fsm.FSM#getIntialState <em>Intial State</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see fsm.FsmPackage#getFSM_State()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Intial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intial State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intial State</em>' containment reference.
	 * @see #setIntialState(InitialState)
	 * @see fsm.FsmPackage#getFSM_IntialState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialState getIntialState();

	/**
	 * Sets the value of the '{@link fsm.FSM#getIntialState <em>Intial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intial State</em>' containment reference.
	 * @see #getIntialState()
	 * @generated
	 */
	void setIntialState(InitialState value);

} // FSM

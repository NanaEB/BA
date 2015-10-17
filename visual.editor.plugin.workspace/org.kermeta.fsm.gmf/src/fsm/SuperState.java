/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm.SuperState#getOutTrans <em>Out Trans</em>}</li>
 * </ul>
 *
 * @see fsm.FsmPackage#getSuperState()
 * @model
 * @generated
 */
public interface SuperState extends EObject {
	/**
	 * Returns the value of the '<em><b>Out Trans</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fsm.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Trans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Trans</em>' containment reference list.
	 * @see fsm.FsmPackage#getSuperState_OutTrans()
	 * @see fsm.Transition#getSrc
	 * @model opposite="src" containment="true"
	 * @generated
	 */
	EList<Transition> getOutTrans();

} // SuperState

/**
 */
package fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm.Action#getEntryLabel <em>Entry Label</em>}</li>
 * </ul>
 *
 * @see fsm.FsmPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Label</em>' attribute.
	 * @see #setEntryLabel(String)
	 * @see fsm.FsmPackage#getAction_EntryLabel()
	 * @model
	 * @generated
	 */
	String getEntryLabel();

	/**
	 * Sets the value of the '{@link fsm.Action#getEntryLabel <em>Entry Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Label</em>' attribute.
	 * @see #getEntryLabel()
	 * @generated
	 */
	void setEntryLabel(String value);

} // Action

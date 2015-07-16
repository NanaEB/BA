/**
 */
package fsm.impl;

import fsm.FsmPackage;
import fsm.State;
import fsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getOutTrans <em>Out Trans</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getOutgoingTrans <em>Outgoing Trans</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getIncomingTrans <em>Incoming Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutTrans() <em>Out Trans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutTrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outTrans;

	/**
	 * The cached value of the '{@link #getOutgoingTrans() <em>Outgoing Trans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTrans;

	/**
	 * The cached value of the '{@link #getIncomingTrans() <em>Incoming Trans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTrans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutTrans() {
		if (outTrans == null) {
			outTrans = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, FsmPackage.STATE__OUT_TRANS, FsmPackage.TRANSITION__SRC);
		}
		return outTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTrans() {
		if (outgoingTrans == null) {
			outgoingTrans = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmPackage.STATE__OUTGOING_TRANS, FsmPackage.TRANSITION__SOURCE);
		}
		return outgoingTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTrans() {
		if (incomingTrans == null) {
			incomingTrans = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmPackage.STATE__INCOMING_TRANS, FsmPackage.TRANSITION__TARGET);
		}
		return incomingTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.STATE__OUT_TRANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutTrans()).basicAdd(otherEnd, msgs);
			case FsmPackage.STATE__OUTGOING_TRANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTrans()).basicAdd(otherEnd, msgs);
			case FsmPackage.STATE__INCOMING_TRANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTrans()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.STATE__OUT_TRANS:
				return ((InternalEList<?>)getOutTrans()).basicRemove(otherEnd, msgs);
			case FsmPackage.STATE__OUTGOING_TRANS:
				return ((InternalEList<?>)getOutgoingTrans()).basicRemove(otherEnd, msgs);
			case FsmPackage.STATE__INCOMING_TRANS:
				return ((InternalEList<?>)getIncomingTrans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.STATE__NAME:
				return getName();
			case FsmPackage.STATE__OUT_TRANS:
				return getOutTrans();
			case FsmPackage.STATE__OUTGOING_TRANS:
				return getOutgoingTrans();
			case FsmPackage.STATE__INCOMING_TRANS:
				return getIncomingTrans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case FsmPackage.STATE__OUT_TRANS:
				getOutTrans().clear();
				getOutTrans().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmPackage.STATE__OUTGOING_TRANS:
				getOutgoingTrans().clear();
				getOutgoingTrans().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmPackage.STATE__INCOMING_TRANS:
				getIncomingTrans().clear();
				getIncomingTrans().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FsmPackage.STATE__OUT_TRANS:
				getOutTrans().clear();
				return;
			case FsmPackage.STATE__OUTGOING_TRANS:
				getOutgoingTrans().clear();
				return;
			case FsmPackage.STATE__INCOMING_TRANS:
				getIncomingTrans().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FsmPackage.STATE__OUT_TRANS:
				return outTrans != null && !outTrans.isEmpty();
			case FsmPackage.STATE__OUTGOING_TRANS:
				return outgoingTrans != null && !outgoingTrans.isEmpty();
			case FsmPackage.STATE__INCOMING_TRANS:
				return incomingTrans != null && !incomingTrans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
/**
 */
package fsm.impl;

import fsm.FSM;
import fsm.FsmPackage;
import fsm.InitialState;
import fsm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsm.impl.FSMImpl#getState <em>State</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getIntialState <em>Intial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getIntialState() <em>Intial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntialState()
	 * @generated
	 * @ordered
	 */
	protected InitialState intialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, FsmPackage.FSM__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getIntialState() {
		return intialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntialState(InitialState newIntialState, NotificationChain msgs) {
		InitialState oldIntialState = intialState;
		intialState = newIntialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__INTIAL_STATE, oldIntialState, newIntialState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntialState(InitialState newIntialState) {
		if (newIntialState != intialState) {
			NotificationChain msgs = null;
			if (intialState != null)
				msgs = ((InternalEObject)intialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.FSM__INTIAL_STATE, null, msgs);
			if (newIntialState != null)
				msgs = ((InternalEObject)newIntialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.FSM__INTIAL_STATE, null, msgs);
			msgs = basicSetIntialState(newIntialState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__INTIAL_STATE, newIntialState, newIntialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.FSM__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case FsmPackage.FSM__INTIAL_STATE:
				return basicSetIntialState(null, msgs);
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
			case FsmPackage.FSM__STATE:
				return getState();
			case FsmPackage.FSM__INTIAL_STATE:
				return getIntialState();
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
			case FsmPackage.FSM__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case FsmPackage.FSM__INTIAL_STATE:
				setIntialState((InitialState)newValue);
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
			case FsmPackage.FSM__STATE:
				getState().clear();
				return;
			case FsmPackage.FSM__INTIAL_STATE:
				setIntialState((InitialState)null);
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
			case FsmPackage.FSM__STATE:
				return state != null && !state.isEmpty();
			case FsmPackage.FSM__INTIAL_STATE:
				return intialState != null;
		}
		return super.eIsSet(featureID);
	}

} //FSMImpl

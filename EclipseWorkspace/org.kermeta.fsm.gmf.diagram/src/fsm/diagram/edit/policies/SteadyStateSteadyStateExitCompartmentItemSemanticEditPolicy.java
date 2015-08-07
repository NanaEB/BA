package fsm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fsm.diagram.edit.commands.EActionCreateCommand;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class SteadyStateSteadyStateExitCompartmentItemSemanticEditPolicy extends
		FsmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SteadyStateSteadyStateExitCompartmentItemSemanticEditPolicy() {
		super(FsmElementTypes.SteadyState_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FsmElementTypes.EAction_3003 == req.getElementType()) {
			return getGEFWrapper(new EActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

package fsm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fsm.diagram.edit.commands.ActionCreateCommand;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class SteadyStateSteadyStateEntryCompartmentItemSemanticEditPolicy
		extends FsmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SteadyStateSteadyStateEntryCompartmentItemSemanticEditPolicy() {
		super(FsmElementTypes.SteadyState_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FsmElementTypes.Action_3001 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

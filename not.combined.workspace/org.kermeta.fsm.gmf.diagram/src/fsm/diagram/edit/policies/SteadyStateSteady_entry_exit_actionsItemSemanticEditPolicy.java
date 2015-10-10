package fsm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fsm.diagram.edit.commands.ActionCreateCommand;
import fsm.diagram.edit.commands.EActionCreateCommand;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class SteadyStateSteady_entry_exit_actionsItemSemanticEditPolicy extends
		FsmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SteadyStateSteady_entry_exit_actionsItemSemanticEditPolicy() {
		super(FsmElementTypes.SteadyState_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FsmElementTypes.Action_3001 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		if (FsmElementTypes.EAction_3003 == req.getElementType()) {
			return getGEFWrapper(new EActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

package fsm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fsm.diagram.edit.commands.Action2CreateCommand;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class TransientStateTransientStateEntryCompartmentItemSemanticEditPolicy
		extends FsmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransientStateTransientStateEntryCompartmentItemSemanticEditPolicy() {
		super(FsmElementTypes.TransientState_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FsmElementTypes.Action_3002 == req.getElementType()) {
			return getGEFWrapper(new Action2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

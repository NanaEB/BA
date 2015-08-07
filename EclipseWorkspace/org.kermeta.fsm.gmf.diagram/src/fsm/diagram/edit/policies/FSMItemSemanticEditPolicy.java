package fsm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import fsm.diagram.edit.commands.InitialStateCreateCommand;
import fsm.diagram.edit.commands.SteadyStateCreateCommand;
import fsm.diagram.edit.commands.TransientStateCreateCommand;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class FSMItemSemanticEditPolicy extends FsmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FSMItemSemanticEditPolicy() {
		super(FsmElementTypes.FSM_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FsmElementTypes.SteadyState_2005 == req.getElementType()) {
			return getGEFWrapper(new SteadyStateCreateCommand(req));
		}
		if (FsmElementTypes.TransientState_2006 == req.getElementType()) {
			return getGEFWrapper(new TransientStateCreateCommand(req));
		}
		if (FsmElementTypes.InitialState_2007 == req.getElementType()) {
			return getGEFWrapper(new InitialStateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

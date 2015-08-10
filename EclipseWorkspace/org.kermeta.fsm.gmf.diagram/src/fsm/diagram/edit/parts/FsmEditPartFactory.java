package fsm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FsmVisualIDRegistry.getVisualID(view)) {

			case FSMEditPart.VISUAL_ID:
				return new FSMEditPart(view);

			case SteadyStateEditPart.VISUAL_ID:
				return new SteadyStateEditPart(view);

			case SteadyStateNameEditPart.VISUAL_ID:
				return new SteadyStateNameEditPart(view);

			case TransientStateEditPart.VISUAL_ID:
				return new TransientStateEditPart(view);

			case TransientStateNameEditPart.VISUAL_ID:
				return new TransientStateNameEditPart(view);

			case InitialStateEditPart.VISUAL_ID:
				return new InitialStateEditPart(view);

			case ActionEditPart.VISUAL_ID:
				return new ActionEditPart(view);

			case ActionEntryLabelEditPart.VISUAL_ID:
				return new ActionEntryLabelEditPart(view);

			case EActionEditPart.VISUAL_ID:
				return new EActionEditPart(view);

			case EActionExitLabelEditPart.VISUAL_ID:
				return new EActionExitLabelEditPart(view);

			case Action2EditPart.VISUAL_ID:
				return new Action2EditPart(view);

			case ActionEntryLabel2EditPart.VISUAL_ID:
				return new ActionEntryLabel2EditPart(view);

			case EAction2EditPart.VISUAL_ID:
				return new EAction2EditPart(view);

			case EActionExitLabel2EditPart.VISUAL_ID:
				return new EActionExitLabel2EditPart(view);

			case SteadyStateSteady_entry_exit_actionsEditPart.VISUAL_ID:
				return new SteadyStateSteady_entry_exit_actionsEditPart(view);

			case TransientStateTransient_entry_exit_actionsEditPart.VISUAL_ID:
				return new TransientStateTransient_entry_exit_actionsEditPart(
						view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionInputEditPart.VISUAL_ID:
				return new TransitionInputEditPart(view);

			case TransitionOutputEditPart.VISUAL_ID:
				return new TransitionOutputEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

package fsm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.FsmEditPartFactory;
import fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FsmEditPartProvider() {
		super(new FsmEditPartFactory(), FsmVisualIDRegistry.TYPED_INSTANCE,
				FSMEditPart.MODEL_ID);
	}

}

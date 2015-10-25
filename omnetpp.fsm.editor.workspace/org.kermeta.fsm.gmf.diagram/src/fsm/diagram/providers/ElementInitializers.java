package fsm.diagram.providers;

import fsm.diagram.part.FsmDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = FsmDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			FsmDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

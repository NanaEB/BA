package fsm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import fsm.FsmPackage;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.SteadyStateNameEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.edit.parts.TransientStateNameEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;
import fsm.diagram.edit.parts.TransitionInputEditPart;
import fsm.diagram.edit.parts.TransitionOutputEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FsmVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.kermeta.fsm.gmf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FSMEditPart.MODEL_ID.equals(view.getType())) {
				return FSMEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return fsm.diagram.part.FsmVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FsmDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FsmPackage.eINSTANCE.getFSM().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((fsm.FSM) domainElement)) {
			return FSMEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = fsm.diagram.part.FsmVisualIDRegistry
				.getModelID(containerView);
		if (!FSMEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FSMEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fsm.diagram.part.FsmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FSMEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FSMEditPart.VISUAL_ID:
			if (FsmPackage.eINSTANCE.getSteadyState().isSuperTypeOf(
					domainElement.eClass())) {
				return SteadyStateEditPart.VISUAL_ID;
			}
			if (FsmPackage.eINSTANCE.getTransientState().isSuperTypeOf(
					domainElement.eClass())) {
				return TransientStateEditPart.VISUAL_ID;
			}
			if (FsmPackage.eINSTANCE.getInitialState().isSuperTypeOf(
					domainElement.eClass())) {
				return InitialStateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = fsm.diagram.part.FsmVisualIDRegistry
				.getModelID(containerView);
		if (!FSMEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FSMEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fsm.diagram.part.FsmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FSMEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FSMEditPart.VISUAL_ID:
			if (SteadyStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransientStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SteadyStateEditPart.VISUAL_ID:
			if (SteadyStateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransientStateEditPart.VISUAL_ID:
			if (TransientStateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FsmPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(fsm.FSM element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FSMEditPart.VISUAL_ID:
			return false;
		case TransientStateEditPart.VISUAL_ID:
		case InitialStateEditPart.VISUAL_ID:
		case SteadyStateEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return fsm.diagram.part.FsmVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return fsm.diagram.part.FsmVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return fsm.diagram.part.FsmVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return fsm.diagram.part.FsmVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return fsm.diagram.part.FsmVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return fsm.diagram.part.FsmVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}

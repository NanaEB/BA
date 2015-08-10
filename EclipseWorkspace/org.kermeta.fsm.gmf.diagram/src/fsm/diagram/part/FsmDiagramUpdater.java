package fsm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import fsm.Action;
import fsm.FsmPackage;
import fsm.InitialState;
import fsm.State;
import fsm.SteadyState;
import fsm.SuperState;
import fsm.TransientState;
import fsm.Transition;
import fsm.diagram.edit.parts.Action2EditPart;
import fsm.diagram.edit.parts.ActionEditPart;
import fsm.diagram.edit.parts.EAction2EditPart;
import fsm.diagram.edit.parts.EActionEditPart;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.SteadyStateSteady_entry_exit_actionsEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.edit.parts.TransientStateTransient_entry_exit_actionsEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;
import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class FsmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<FsmNodeDescriptor> getSemanticChildren(View view) {
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case FSMEditPart.VISUAL_ID:
			return getFSM_1000SemanticChildren(view);
		case SteadyStateSteady_entry_exit_actionsEditPart.VISUAL_ID:
			return getSteadyStateSteady_entry_exit_actions_7001SemanticChildren(view);
		case TransientStateTransient_entry_exit_actionsEditPart.VISUAL_ID:
			return getTransientStateTransient_entry_exit_actions_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmNodeDescriptor> getFSM_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		fsm.FSM modelElement = (fsm.FSM) view.getElement();
		LinkedList<FsmNodeDescriptor> result = new LinkedList<FsmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SteadyStateEditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransientStateEditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InitialState childElement = modelElement.getIntialState();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InitialStateEditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmNodeDescriptor> getSteadyStateSteady_entry_exit_actions_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SteadyState modelElement = (SteadyState) containerView.getElement();
		LinkedList<FsmNodeDescriptor> result = new LinkedList<FsmNodeDescriptor>();
		{
			Action childElement = modelElement.getEntry();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionEditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
			}
		}
		{
			fsm.eAction childElement = modelElement.getExit();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EActionEditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmNodeDescriptor> getTransientStateTransient_entry_exit_actions_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TransientState modelElement = (TransientState) containerView
				.getElement();
		LinkedList<FsmNodeDescriptor> result = new LinkedList<FsmNodeDescriptor>();
		{
			Action childElement = modelElement.getEntry();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Action2EditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
			}
		}
		{
			fsm.eAction childElement = modelElement.getExit();
			int visualID = FsmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EAction2EditPart.VISUAL_ID) {
				result.add(new FsmNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getContainedLinks(View view) {
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case FSMEditPart.VISUAL_ID:
			return getFSM_1000ContainedLinks(view);
		case SteadyStateEditPart.VISUAL_ID:
			return getSteadyState_2005ContainedLinks(view);
		case TransientStateEditPart.VISUAL_ID:
			return getTransientState_2006ContainedLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2007ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3001ContainedLinks(view);
		case EActionEditPart.VISUAL_ID:
			return getEAction_3003ContainedLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3002ContainedLinks(view);
		case EAction2EditPart.VISUAL_ID:
			return getEAction_3004ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getIncomingLinks(View view) {
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case SteadyStateEditPart.VISUAL_ID:
			return getSteadyState_2005IncomingLinks(view);
		case TransientStateEditPart.VISUAL_ID:
			return getTransientState_2006IncomingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2007IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3001IncomingLinks(view);
		case EActionEditPart.VISUAL_ID:
			return getEAction_3003IncomingLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3002IncomingLinks(view);
		case EAction2EditPart.VISUAL_ID:
			return getEAction_3004IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getOutgoingLinks(View view) {
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case SteadyStateEditPart.VISUAL_ID:
			return getSteadyState_2005OutgoingLinks(view);
		case TransientStateEditPart.VISUAL_ID:
			return getTransientState_2006OutgoingLinks(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2007OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3001OutgoingLinks(view);
		case EActionEditPart.VISUAL_ID:
			return getEAction_3003OutgoingLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3002OutgoingLinks(view);
		case EAction2EditPart.VISUAL_ID:
			return getEAction_3004OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getFSM_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getSteadyState_2005ContainedLinks(
			View view) {
		SteadyState modelElement = (SteadyState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransientState_2006ContainedLinks(
			View view) {
		TransientState modelElement = (TransientState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getInitialState_2007ContainedLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getSteadyState_2005IncomingLinks(
			View view) {
		SteadyState modelElement = (SteadyState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransientState_2006IncomingLinks(
			View view) {
		TransientState modelElement = (TransientState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getInitialState_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getSteadyState_2005OutgoingLinks(
			View view) {
		SteadyState modelElement = (SteadyState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransientState_2006OutgoingLinks(
			View view) {
		TransientState modelElement = (TransientState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getInitialState_2007OutgoingLinks(
			View view) {
		InitialState modelElement = (InitialState) view.getElement();
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getAction_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getEAction_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FsmLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FsmLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			SuperState container) {
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		for (Iterator<?> links = container.getOutTrans().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != FsmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State dst = link.getTarget();
			SuperState src = link.getSrc();
			result.add(new FsmLinkDescriptor(src, dst, link,
					FsmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FsmLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			State target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != FsmPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != FsmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SuperState src = link.getSrc();
			result.add(new FsmLinkDescriptor(src, target, link,
					FsmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FsmLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			SuperState source) {
		SuperState container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SuperState) {
				container = (SuperState) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<FsmLinkDescriptor> result = new LinkedList<FsmLinkDescriptor>();
		for (Iterator<?> links = container.getOutTrans().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != FsmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State dst = link.getTarget();
			SuperState src = link.getSrc();
			if (src != source) {
				continue;
			}
			result.add(new FsmLinkDescriptor(src, dst, link,
					FsmElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FsmNodeDescriptor> getSemanticChildren(View view) {
			return FsmDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FsmLinkDescriptor> getContainedLinks(View view) {
			return FsmDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FsmLinkDescriptor> getIncomingLinks(View view) {
			return FsmDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FsmLinkDescriptor> getOutgoingLinks(View view) {
			return FsmDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

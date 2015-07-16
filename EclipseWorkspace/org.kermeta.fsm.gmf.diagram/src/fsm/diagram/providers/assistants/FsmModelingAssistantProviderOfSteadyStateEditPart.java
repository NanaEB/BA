package fsm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.providers.FsmElementTypes;
import fsm.diagram.providers.FsmModelingAssistantProvider;

/**
 * @generated
 */
public class FsmModelingAssistantProviderOfSteadyStateEditPart extends
		FsmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SteadyStateEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(SteadyStateEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FsmElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(SteadyStateEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			SteadyStateEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SteadyStateEditPart) {
			types.add(FsmElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof TransientStateEditPart) {
			types.add(FsmElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InitialStateEditPart) {
			types.add(FsmElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SteadyStateEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(SteadyStateEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FsmElementTypes.Transition_4001) {
			types.add(FsmElementTypes.SteadyState_2004);
			types.add(FsmElementTypes.TransientState_2002);
			types.add(FsmElementTypes.InitialState_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SteadyStateEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(SteadyStateEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FsmElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SteadyStateEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(SteadyStateEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FsmElementTypes.Transition_4001) {
			types.add(FsmElementTypes.SteadyState_2004);
			types.add(FsmElementTypes.TransientState_2002);
			types.add(FsmElementTypes.InitialState_2003);
		}
		return types;
	}

}

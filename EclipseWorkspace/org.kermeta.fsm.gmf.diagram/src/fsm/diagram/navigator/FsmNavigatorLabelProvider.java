package fsm.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import fsm.diagram.edit.parts.Action2EditPart;
import fsm.diagram.edit.parts.ActionEditPart;
import fsm.diagram.edit.parts.ActionEntryLabel2EditPart;
import fsm.diagram.edit.parts.ActionEntryLabelEditPart;
import fsm.diagram.edit.parts.EAction2EditPart;
import fsm.diagram.edit.parts.EActionEditPart;
import fsm.diagram.edit.parts.EActionExitLabel2EditPart;
import fsm.diagram.edit.parts.EActionExitLabelEditPart;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.SteadyStateNameEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.edit.parts.TransientStateNameEditPart;
import fsm.diagram.edit.parts.TransitionActionGuardEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;
import fsm.diagram.part.FsmDiagramEditorPlugin;
import fsm.diagram.part.FsmVisualIDRegistry;
import fsm.diagram.providers.FsmElementTypes;
import fsm.diagram.providers.FsmParserProvider;

/**
 * @generated
 */
public class FsmNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FsmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FsmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FsmNavigatorItem
				&& !isOwnView(((FsmNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FsmNavigatorGroup) {
			FsmNavigatorGroup group = (FsmNavigatorGroup) element;
			return FsmDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FsmNavigatorItem) {
			FsmNavigatorItem navigatorItem = (FsmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case FSMEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kermeta.org/fsm?FSM", FsmElementTypes.FSM_1000); //$NON-NLS-1$
		case SteadyStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?SteadyState", FsmElementTypes.SteadyState_2005); //$NON-NLS-1$
		case TransientStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?TransientState", FsmElementTypes.TransientState_2006); //$NON-NLS-1$
		case InitialStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?InitialState", FsmElementTypes.InitialState_2007); //$NON-NLS-1$
		case ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.kermeta.org/fsm?Action", FsmElementTypes.Action_3001); //$NON-NLS-1$
		case Action2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.kermeta.org/fsm?Action", FsmElementTypes.Action_3002); //$NON-NLS-1$
		case EActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.kermeta.org/fsm?eAction", FsmElementTypes.EAction_3003); //$NON-NLS-1$
		case EAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.kermeta.org/fsm?eAction", FsmElementTypes.EAction_3004); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kermeta.org/fsm?Transition", FsmElementTypes.Transition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FsmDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FsmElementTypes.isKnownElementType(elementType)) {
			image = FsmElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FsmNavigatorGroup) {
			FsmNavigatorGroup group = (FsmNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FsmNavigatorItem) {
			FsmNavigatorItem navigatorItem = (FsmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FsmVisualIDRegistry.getVisualID(view)) {
		case FSMEditPart.VISUAL_ID:
			return getFSM_1000Text(view);
		case SteadyStateEditPart.VISUAL_ID:
			return getSteadyState_2005Text(view);
		case TransientStateEditPart.VISUAL_ID:
			return getTransientState_2006Text(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2007Text(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3001Text(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3002Text(view);
		case EActionEditPart.VISUAL_ID:
			return getEAction_3003Text(view);
		case EAction2EditPart.VISUAL_ID:
			return getEAction_3004Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFSM_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSteadyState_2005Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.SteadyState_2005,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry.getType(SteadyStateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransientState_2006Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.TransientState_2006,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry
						.getType(TransientStateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialState_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_3001Text(View view) {
		IParser parser = FsmParserProvider
				.getParser(FsmElementTypes.Action_3001,
						view.getElement() != null ? view.getElement() : view,
						FsmVisualIDRegistry
								.getType(ActionEntryLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_3002Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.Action_3002,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry
						.getType(ActionEntryLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEAction_3003Text(View view) {
		IParser parser = FsmParserProvider
				.getParser(FsmElementTypes.EAction_3003,
						view.getElement() != null ? view.getElement() : view,
						FsmVisualIDRegistry
								.getType(EActionExitLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEAction_3004Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.EAction_3004,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry
						.getType(EActionExitLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry
						.getType(TransitionActionGuardEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FSMEditPart.MODEL_ID
				.equals(FsmVisualIDRegistry.getModelID(view));
	}

}

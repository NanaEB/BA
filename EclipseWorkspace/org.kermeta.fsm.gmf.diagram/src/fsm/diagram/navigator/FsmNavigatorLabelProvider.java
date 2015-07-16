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

import fsm.InitialState;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.SteadyStateNameEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.edit.parts.TransientStateNameEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;
import fsm.diagram.edit.parts.TransitionInputEditPart;
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
		case TransientStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?TransientState", FsmElementTypes.TransientState_2001); //$NON-NLS-1$
		case InitialStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?InitialState", FsmElementTypes.InitialState_2002); //$NON-NLS-1$
		case SteadyStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/fsm?SteadyState", FsmElementTypes.SteadyState_2003); //$NON-NLS-1$
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
		case TransientStateEditPart.VISUAL_ID:
			return getTransientState_2001Text(view);
		case InitialStateEditPart.VISUAL_ID:
			return getInitialState_2002Text(view);
		case SteadyStateEditPart.VISUAL_ID:
			return getSteadyState_2003Text(view);
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
	private String getTransientState_2001Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.TransientState_2001,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry
						.getType(TransientStateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialState_2002Text(View view) {
		InitialState domainModelElement = (InitialState) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSteadyState_2003Text(View view) {
		IParser parser = FsmParserProvider.getParser(
				FsmElementTypes.SteadyState_2003,
				view.getElement() != null ? view.getElement() : view,
				FsmVisualIDRegistry.getType(SteadyStateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FsmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
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
				FsmVisualIDRegistry.getType(TransitionInputEditPart.VISUAL_ID));
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

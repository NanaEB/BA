package fsm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fsm.FsmPackage;
import fsm.diagram.edit.parts.FSMEditPart;
import fsm.diagram.edit.parts.InitialStateEditPart;
import fsm.diagram.edit.parts.SteadyStateEditPart;
import fsm.diagram.edit.parts.TransientStateEditPart;
import fsm.diagram.edit.parts.TransitionEditPart;
import fsm.diagram.part.FsmDiagramEditorPlugin;

/**
 * @generated
 */
public class FsmElementTypes {

	/**
	 * @generated
	 */
	private FsmElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FsmDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType FSM_1000 = getElementType("org.kermeta.fsm.gmf.diagram.FSM_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SteadyState_2004 = getElementType("org.kermeta.fsm.gmf.diagram.SteadyState_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransientState_2002 = getElementType("org.kermeta.fsm.gmf.diagram.TransientState_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InitialState_2003 = getElementType("org.kermeta.fsm.gmf.diagram.InitialState_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("org.kermeta.fsm.gmf.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FSM_1000, FsmPackage.eINSTANCE.getFSM());

			elements.put(SteadyState_2004,
					FsmPackage.eINSTANCE.getSteadyState());

			elements.put(TransientState_2002,
					FsmPackage.eINSTANCE.getTransientState());

			elements.put(InitialState_2003,
					FsmPackage.eINSTANCE.getInitialState());

			elements.put(Transition_4001, FsmPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FSM_1000);
			KNOWN_ELEMENT_TYPES.add(SteadyState_2004);
			KNOWN_ELEMENT_TYPES.add(TransientState_2002);
			KNOWN_ELEMENT_TYPES.add(InitialState_2003);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FSMEditPart.VISUAL_ID:
			return FSM_1000;
		case SteadyStateEditPart.VISUAL_ID:
			return SteadyState_2004;
		case TransientStateEditPart.VISUAL_ID:
			return TransientState_2002;
		case InitialStateEditPart.VISUAL_ID:
			return InitialState_2003;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return fsm.diagram.providers.FsmElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return fsm.diagram.providers.FsmElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return fsm.diagram.providers.FsmElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}

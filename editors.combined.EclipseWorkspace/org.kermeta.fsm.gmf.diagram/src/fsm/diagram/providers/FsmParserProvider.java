package fsm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import fsm.FsmPackage;
import fsm.diagram.edit.parts.ActionEntryLabel2EditPart;
import fsm.diagram.edit.parts.ActionEntryLabelEditPart;
import fsm.diagram.edit.parts.EActionExitLabel2EditPart;
import fsm.diagram.edit.parts.EActionExitLabelEditPart;
import fsm.diagram.edit.parts.SteadyStateNameEditPart;
import fsm.diagram.edit.parts.TransientStateNameEditPart;
import fsm.diagram.edit.parts.TransitionEffectGuardEditPart;
import fsm.diagram.parsers.MessageFormatParser;
import fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser steadyStateName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSteadyStateName_5004Parser() {
		if (steadyStateName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			steadyStateName_5004Parser = parser;
		}
		return steadyStateName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser transientStateName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTransientStateName_5005Parser() {
		if (transientStateName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transientStateName_5005Parser = parser;
		}
		return transientStateName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEntryLabel_5006Parser;

	/**
	 * @generated
	 */
	private IParser getActionEntryLabel_5006Parser() {
		if (actionEntryLabel_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getAction_EntryLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("entry/{0}"); //$NON-NLS-1$
			parser.setEditorPattern("entry/{0}"); //$NON-NLS-1$
			parser.setEditPattern("entry/{0}"); //$NON-NLS-1$
			actionEntryLabel_5006Parser = parser;
		}
		return actionEntryLabel_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser eActionExitLabel_5008Parser;

	/**
	 * @generated
	 */
	private IParser getEActionExitLabel_5008Parser() {
		if (eActionExitLabel_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.geteAction_ExitLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("exit/{0}"); //$NON-NLS-1$
			parser.setEditorPattern("exit/{0}"); //$NON-NLS-1$
			parser.setEditPattern("exit/{0}"); //$NON-NLS-1$
			eActionExitLabel_5008Parser = parser;
		}
		return eActionExitLabel_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionEntryLabel_5007Parser;

	/**
	 * @generated
	 */
	private IParser getActionEntryLabel_5007Parser() {
		if (actionEntryLabel_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getAction_EntryLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("entry/{0}"); //$NON-NLS-1$
			parser.setEditorPattern("entry/{0}"); //$NON-NLS-1$
			parser.setEditPattern("entry/{0}"); //$NON-NLS-1$
			actionEntryLabel_5007Parser = parser;
		}
		return actionEntryLabel_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser eActionExitLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getEActionExitLabel_5009Parser() {
		if (eActionExitLabel_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.geteAction_ExitLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("exit/{0}"); //$NON-NLS-1$
			parser.setEditorPattern("exit/{0}"); //$NON-NLS-1$
			parser.setEditPattern("exit/{0}"); //$NON-NLS-1$
			eActionExitLabel_5009Parser = parser;
		}
		return eActionExitLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionEffectGuard_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionEffectGuard_6001Parser() {
		if (transitionEffectGuard_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FsmPackage.eINSTANCE.getTransition_Effect(),
					FsmPackage.eINSTANCE.getTransition_Guard() };
			EAttribute[] editableFeatures = new EAttribute[] {
					FsmPackage.eINSTANCE.getTransition_Effect(),
					FsmPackage.eINSTANCE.getTransition_Guard() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("[{1}] /{0}"); //$NON-NLS-1$
			parser.setEditorPattern("[{1}] /{0}"); //$NON-NLS-1$
			parser.setEditPattern("[{1}] /{0}"); //$NON-NLS-1$
			transitionEffectGuard_6001Parser = parser;
		}
		return transitionEffectGuard_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SteadyStateNameEditPart.VISUAL_ID:
			return getSteadyStateName_5004Parser();
		case TransientStateNameEditPart.VISUAL_ID:
			return getTransientStateName_5005Parser();
		case ActionEntryLabelEditPart.VISUAL_ID:
			return getActionEntryLabel_5006Parser();
		case EActionExitLabelEditPart.VISUAL_ID:
			return getEActionExitLabel_5008Parser();
		case ActionEntryLabel2EditPart.VISUAL_ID:
			return getActionEntryLabel_5007Parser();
		case EActionExitLabel2EditPart.VISUAL_ID:
			return getEActionExitLabel_5009Parser();
		case TransitionEffectGuardEditPart.VISUAL_ID:
			return getTransitionEffectGuard_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FsmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FsmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FsmElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

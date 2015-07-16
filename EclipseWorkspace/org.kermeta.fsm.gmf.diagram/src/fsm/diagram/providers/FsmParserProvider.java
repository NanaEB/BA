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
import fsm.diagram.edit.parts.WrappingLabel2EditPart;
import fsm.diagram.edit.parts.WrappingLabel4EditPart;
import fsm.diagram.edit.parts.WrappingLabel5EditPart;
import fsm.diagram.edit.parts.WrappingLabelEditPart;
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
	private IParser steadyStateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSteadyStateName_5001Parser() {
		if (steadyStateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			steadyStateName_5001Parser = parser;
		}
		return steadyStateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transientStateName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTransientStateName_5002Parser() {
		if (transientStateName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transientStateName_5002Parser = parser;
		}
		return transientStateName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionInput_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionInput_6001Parser() {
		if (transitionInput_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getTransition_Input() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmPackage.eINSTANCE
					.getTransition_Input() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transitionInput_6001Parser = parser;
		}
		return transitionInput_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionOutput_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionOutput_6002Parser() {
		if (transitionOutput_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmPackage.eINSTANCE
					.getTransition_Output() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmPackage.eINSTANCE
					.getTransition_Output() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transitionOutput_6002Parser = parser;
		}
		return transitionOutput_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getSteadyStateName_5001Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getTransientStateName_5002Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getTransitionInput_6001Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getTransitionOutput_6002Parser();
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

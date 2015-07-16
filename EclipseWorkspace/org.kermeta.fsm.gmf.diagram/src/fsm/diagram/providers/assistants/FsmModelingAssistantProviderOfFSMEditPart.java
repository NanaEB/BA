package fsm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fsm.diagram.providers.FsmElementTypes;
import fsm.diagram.providers.FsmModelingAssistantProvider;

/**
 * @generated
 */
public class FsmModelingAssistantProviderOfFSMEditPart extends
		FsmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FsmElementTypes.SteadyState_2004);
		types.add(FsmElementTypes.TransientState_2002);
		types.add(FsmElementTypes.InitialState_2003);
		return types;
	}

}

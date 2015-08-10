package fsm.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import fsm.diagram.providers.FsmElementTypes;

/**
 * @generated
 */
public class FsmPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createStates1Group());
		paletteRoot.add(createActions2Group());
		paletteRoot.add(createConnections3Group());
	}

	/**
	 * Creates "States" palette tool group
	 * @generated
	 */
	private PaletteContainer createStates1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.States1Group_title);
		paletteContainer.setId("createStates1Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialState1CreationTool());
		paletteContainer.add(createSteadyState2CreationTool());
		paletteContainer.add(createTransientState3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Actions2Group_title);
		paletteContainer.setId("createActions2Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createAction2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections3Group_title);
		paletteContainer.setId("createConnections3Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InitialState1CreationTool_title,
				Messages.InitialState1CreationTool_desc,
				Collections.singletonList(FsmElementTypes.InitialState_2007));
		entry.setId("createInitialState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.InitialState_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSteadyState2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SteadyState2CreationTool_title,
				Messages.SteadyState2CreationTool_desc,
				Collections.singletonList(FsmElementTypes.SteadyState_2005));
		entry.setId("createSteadyState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.SteadyState_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransientState3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TransientState3CreationTool_title,
				Messages.TransientState3CreationTool_desc,
				Collections.singletonList(FsmElementTypes.TransientState_2006));
		entry.setId("createTransientState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.TransientState_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FsmElementTypes.Action_3001);
		types.add(FsmElementTypes.Action_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Action1CreationTool_title,
				Messages.Action1CreationTool_desc, types);
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.Action_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FsmElementTypes.EAction_3003);
		types.add(FsmElementTypes.EAction_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Action2CreationTool_title,
				Messages.Action2CreationTool_desc, types);
		entry.setId("createAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.EAction_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc,
				Collections.singletonList(FsmElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

package fsm.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteRoot.add(createFsm1Group());
	}

	/**
	 * Creates "fsm" palette tool group
	 * @generated
	 */
	private PaletteContainer createFsm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Fsm1Group_title);
		paletteContainer.setId("createFsm1Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialState1CreationTool());
		paletteContainer.add(createSteadyState2CreationTool());
		paletteContainer.add(createTransientState3CreationTool());
		paletteContainer.add(createTransition4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InitialState1CreationTool_title,
				Messages.InitialState1CreationTool_desc,
				Collections.singletonList(FsmElementTypes.InitialState_2002));
		entry.setId("createInitialState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.InitialState_2002));
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
				Collections.singletonList(FsmElementTypes.SteadyState_2003));
		entry.setId("createSteadyState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.SteadyState_2003));
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
				Collections.singletonList(FsmElementTypes.TransientState_2001));
		entry.setId("createTransientState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.TransientState_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Transition4CreationTool_title,
				Messages.Transition4CreationTool_desc,
				Collections.singletonList(FsmElementTypes.Transition_4001));
		entry.setId("createTransition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

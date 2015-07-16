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
		paletteContainer.add(createTransition1CreationTool());
		paletteContainer.add(createInitialState2CreationTool());
		paletteContainer.add(createSteadyState3CreationTool());
		paletteContainer.add(createTransientState4CreationTool());
		return paletteContainer;
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

	/**
	 * @generated
	 */
	private ToolEntry createInitialState2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InitialState2CreationTool_title,
				Messages.InitialState2CreationTool_desc,
				Collections.singletonList(FsmElementTypes.InitialState_2003));
		entry.setId("createInitialState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.InitialState_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSteadyState3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SteadyState3CreationTool_title,
				Messages.SteadyState3CreationTool_desc,
				Collections.singletonList(FsmElementTypes.SteadyState_2004));
		entry.setId("createSteadyState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.SteadyState_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransientState4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TransientState4CreationTool_title,
				Messages.TransientState4CreationTool_desc,
				Collections.singletonList(FsmElementTypes.TransientState_2002));
		entry.setId("createTransientState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FsmElementTypes
				.getImageDescriptor(FsmElementTypes.TransientState_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

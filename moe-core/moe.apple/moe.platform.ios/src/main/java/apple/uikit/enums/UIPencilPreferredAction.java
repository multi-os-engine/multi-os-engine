package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Preferred actions available to the user in Settings.
 * 
 * API-Since: 12.1
 */
@Generated
public final class UIPencilPreferredAction {
    @Generated
    private UIPencilPreferredAction() {
    }

    /**
     * No action, or the user has disabled pencil interactions in Accessibility settings
     * 
     * API-Since: 12.1
     */
    @Generated @NInt public static final long Ignore = 0x0000000000000000L;
    /**
     * Switch between the current tool and eraser
     * 
     * API-Since: 12.1
     */
    @Generated @NInt public static final long SwitchEraser = 0x0000000000000001L;
    /**
     * Switch between the current tool and the previously used tool
     * 
     * API-Since: 12.1
     */
    @Generated @NInt public static final long SwitchPrevious = 0x0000000000000002L;
    /**
     * Show and hide the color palette
     * 
     * API-Since: 12.1
     */
    @Generated @NInt public static final long ShowColorPalette = 0x0000000000000003L;
    /**
     * Show the ink attributes palette
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ShowInkAttributes = 0x0000000000000004L;
    /**
     * Show a contextual palette of markup tools, or undo/redo options if tools are not available
     * 
     * API-Since: 17.5
     */
    @Generated @NInt public static final long ShowContextualPalette = 0x0000000000000005L;
    /**
     * The user has selected a system shortcut to run
     * 
     * API-Since: 17.5
     */
    @Generated @NInt public static final long RunSystemShortcut = 0x0000000000000006L;
}
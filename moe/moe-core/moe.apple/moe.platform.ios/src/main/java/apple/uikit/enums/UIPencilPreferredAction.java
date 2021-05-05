package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Preferred actions available to the user in Settings.
 */
@Generated
public final class UIPencilPreferredAction {
    @Generated
    private UIPencilPreferredAction() {
    }

    /**
     * No action, or the user has disabled pencil interactions in Accessibility settings
     */
    @Generated @NInt public static final long Ignore = 0x0000000000000000L;
    /**
     * Switch between the current tool and eraser
     */
    @Generated @NInt public static final long SwitchEraser = 0x0000000000000001L;
    /**
     * Switch between the current tool and the previously used tool
     */
    @Generated @NInt public static final long SwitchPrevious = 0x0000000000000002L;
    /**
     * Show and hide the color palette
     */
    @Generated @NInt public static final long ShowColorPalette = 0x0000000000000003L;
}
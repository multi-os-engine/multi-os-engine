package apple.pencilkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The visibility state of a tool picker.
 */
@Generated
public final class PKToolPickerVisibility {
    @Generated
    private PKToolPickerVisibility() {
    }

    /**
     * Inherit the tool picker visibility from the next responder.
     */
    @Generated @NInt public static final long Inherited = 0x0000000000000000L;
    /**
     * No active tool picker.
     */
    @Generated @NInt public static final long Inactive = 0x0000000000000001L;
    /**
     * Tool picker is active but offscreen, and can appear temporarily in response to user actions.
     */
    @Generated @NInt public static final long Hidden = 0x0000000000000002L;
    /**
     * Tool picker is active and onscreen.
     */
    @Generated @NInt public static final long Visible = 0x0000000000000003L;
}
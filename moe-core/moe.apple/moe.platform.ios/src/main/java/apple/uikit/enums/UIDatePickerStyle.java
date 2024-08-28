package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.4
 */
@Generated
public final class UIDatePickerStyle {
    @Generated
    private UIDatePickerStyle() {
    }

    /**
     * Automatically pick the best style available for the current platform & mode.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Use the wheels (UIPickerView) style. Editing occurs inline.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Wheels = 0x0000000000000001L;
    /**
     * Use a compact style for the date picker. Editing occurs in an overlay.
     * 
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Compact = 0x0000000000000002L;
    /**
     * Use a style for the date picker that allows editing in place.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Inline = 0x0000000000000003L;
}
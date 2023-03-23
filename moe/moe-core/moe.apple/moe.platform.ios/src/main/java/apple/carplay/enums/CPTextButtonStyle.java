package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class CPTextButtonStyle {
    @Generated
    private CPTextButtonStyle() {
    }

    /**
     * A style that indicates a default action.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000000L;
    /**
     * A style that indicates the action will cancel and leave data unchanged.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Cancel = 0x0000000000000001L;
    /**
     * A style that indicates the button will confirm an action.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Confirm = 0x0000000000000002L;
}
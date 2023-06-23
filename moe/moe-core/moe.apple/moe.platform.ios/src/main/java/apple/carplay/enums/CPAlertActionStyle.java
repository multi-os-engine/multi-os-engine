package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class CPAlertActionStyle {
    @Generated
    private CPAlertActionStyle() {
    }

    /**
     * A style that indicates a default action.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * A style that indicates the action will cancel and leave data unchanged.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Cancel = 0x0000000000000001L;
    /**
     * A style that indicates the button might change or delete data.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Destructive = 0x0000000000000002L;
}
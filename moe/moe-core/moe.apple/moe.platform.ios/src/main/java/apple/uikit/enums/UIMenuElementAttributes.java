package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class UIMenuElementAttributes {
    @Generated
    private UIMenuElementAttributes() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Disabled = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Destructive = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Hidden = 0x0000000000000004L;
    /**
     * Indicates that the menu should remain presented after firing
     * the element's action rather than dismissing as it normally does.
     * This attribute has no effect on Mac Catalyst.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long KeepsMenuPresented = 0x0000000000000008L;
}
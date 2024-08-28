package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes the screen's reference display mode ability
 * 
 * API-Since: 16.0
 */
@Generated
public final class UIScreenReferenceDisplayModeStatus {
    @Generated
    private UIScreenReferenceDisplayModeStatus() {
    }

    /**
     * Reference display modes are not supported on this display
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotSupported = 0x0000000000000000L;
    /**
     * Reference display modes are supported on this display but have not been enabled by the user
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotEnabled = 0x0000000000000001L;
    /**
     * A reference display mode is enabled, but temporarily can not be achieved. This may be due to thermal or power
     * constraints.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Limited = 0x0000000000000002L;
    /**
     * A reference display mode is enabled and being displayed accurately
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000003L;
}
package apple.iosurface.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class IOSurfacePurgeabilityState {
    @Generated
    private IOSurfacePurgeabilityState() {
    }

    /**
     * Mark the IOSurface as non-volatile
     */
    @Generated public static final int NonVolatile = 0x00000000;
    /**
     * Mark the IOSurface as volatile (contents may be thrown away)
     */
    @Generated public static final int Volatile = 0x00000001;
    /**
     * Throw away the contents of the IOSurface immediately
     */
    @Generated public static final int Empty = 0x00000002;
    /**
     * Keep the current setting (useful for returning current status info)
     */
    @Generated public static final int KeepCurrent = 0x00000003;
}
package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The resolution at which the matte is to be generated.
 * 
 * The matte generated per frame can be full resolution of the captured camera image or half resolution. The caller
 * chooses one of the options from ARMatteResolution during initialization.
 */
@Generated
public final class ARMatteResolution {
    @Generated
    private ARMatteResolution() {
    }

    /**
     * Matte generated at camera image resolution.
     */
    @Generated @NInt public static final long Full = 0x0000000000000000L;
    /**
     * Matte generated at half the camera image resolution.
     */
    @Generated @NInt public static final long Half = 0x0000000000000001L;
}

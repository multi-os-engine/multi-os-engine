package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSDeviceOptions {
    @Generated
    private MPSDeviceOptions() {
    }

    /**
     * Use default options
     * 
     * API-Since: 12.2
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Prefer a low power device
     * 
     * API-Since: 12.2
     */
    @Generated @NUInt public static final long LowPower = 0x0000000000000001L;
    /**
     * Skip removable devices
     * 
     * API-Since: 12.2
     */
    @Generated @NUInt public static final long SkipRemovable = 0x0000000000000002L;
}
package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSNDArrayQuantizationScheme {
    @Generated
    private MPSNDArrayQuantizationScheme() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Affine = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long LUT = 0x0000000000000002L;
}
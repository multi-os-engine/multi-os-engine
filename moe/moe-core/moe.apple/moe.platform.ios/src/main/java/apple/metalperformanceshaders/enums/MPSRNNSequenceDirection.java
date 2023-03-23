package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSRNNSequenceDirection {
    @Generated
    private MPSRNNSequenceDirection() {
    }

    /**
     * The input sequence is processed from index zero to array length minus one
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Forward = 0x0000000000000000L;
    /**
     * The input sequence is processed from index array length minus one to zero
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Backward = 0x0000000000000001L;
}
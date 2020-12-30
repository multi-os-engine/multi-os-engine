package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSRNNBidirectionalCombineMode {
    @Generated
    private MPSRNNBidirectionalCombineMode() {
    }

    /**
     * The two sequences are kept separate
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * The two sequences are summed together to form a single output
     */
    @Generated @NUInt public static final long Add = 0x0000000000000001L;
    /**
     * The two sequences are concatenated together along the feature channels to form a single output
     */
    @Generated @NUInt public static final long Concatenate = 0x0000000000000002L;
}
package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSRNNBidirectionalCombineMode {
    @Generated
    private MPSRNNBidirectionalCombineMode() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Add = 0x0000000000000001L;
    @Generated @NUInt public static final long Concatenate = 0x0000000000000002L;
}
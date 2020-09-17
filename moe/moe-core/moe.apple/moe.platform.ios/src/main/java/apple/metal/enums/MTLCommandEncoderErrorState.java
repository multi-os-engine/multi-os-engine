package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MTLCommandEncoderErrorState {
    @Generated
    private MTLCommandEncoderErrorState() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Completed = 0x0000000000000001L;
    @Generated @NInt public static final long Affected = 0x0000000000000002L;
    @Generated @NInt public static final long Pending = 0x0000000000000003L;
    @Generated @NInt public static final long Faulted = 0x0000000000000004L;
}
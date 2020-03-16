package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLTaskState {
    @Generated
    private MLTaskState() {
    }

    @Generated @NInt public static final long Suspended = 0x0000000000000001L;
    @Generated @NInt public static final long Running = 0x0000000000000002L;
    @Generated @NInt public static final long Cancelling = 0x0000000000000003L;
    @Generated @NInt public static final long Completed = 0x0000000000000004L;
    @Generated @NInt public static final long Failed = 0x0000000000000005L;
}
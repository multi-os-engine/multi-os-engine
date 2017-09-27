package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVContentKeyRequestStatus {
    @Generated
    private AVContentKeyRequestStatus() {
    }

    @Generated @NInt public static final long RequestingResponse = 0x0000000000000000L;
    @Generated @NInt public static final long ReceivedResponse = 0x0000000000000001L;
    @Generated @NInt public static final long Renewed = 0x0000000000000002L;
    @Generated @NInt public static final long Retried = 0x0000000000000003L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;
    @Generated @NInt public static final long Failed = 0x0000000000000005L;
}
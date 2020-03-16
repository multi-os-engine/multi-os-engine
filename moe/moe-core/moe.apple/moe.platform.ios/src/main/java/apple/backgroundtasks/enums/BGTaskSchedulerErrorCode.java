package apple.backgroundtasks.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class BGTaskSchedulerErrorCode {
    @Generated
    private BGTaskSchedulerErrorCode() {
    }

    @Generated @NInt public static final long Unavailable = 0x0000000000000001L;
    @Generated @NInt public static final long TooManyPendingTaskRequests = 0x0000000000000002L;
    @Generated @NInt public static final long NotPermitted = 0x0000000000000003L;
}
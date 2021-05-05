package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class INTemporalEventTriggerTypeOptions {
    @Generated
    private INTemporalEventTriggerTypeOptions() {
    }

    @Generated @NUInt public static final long NotScheduled = 0x0000000000000001L;
    @Generated @NUInt public static final long ScheduledNonRecurring = 0x0000000000000002L;
    @Generated @NUInt public static final long ScheduledRecurring = 0x0000000000000004L;
}
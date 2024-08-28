package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Enum representing the current state of the condition.
 */
@Generated
public final class CLMonitoringState {
    @Generated
    private CLMonitoringState() {
    }

    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NUInt public static final long Satisfied = 0x0000000000000001L;
    @Generated @NUInt public static final long Unsatisfied = 0x0000000000000002L;
    /**
     * API-Since: 17.2
     */
    @Generated @NUInt public static final long Unmonitored = 0x0000000000000003L;
}
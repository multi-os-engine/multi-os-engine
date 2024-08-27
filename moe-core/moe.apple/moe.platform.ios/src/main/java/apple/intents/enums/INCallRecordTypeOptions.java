package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class INCallRecordTypeOptions {
    @Generated
    private INCallRecordTypeOptions() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Outgoing = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Missed = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Received = 0x0000000000000004L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Latest = 0x0000000000000008L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Voicemail = 0x0000000000000010L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Ringing = 0x0000000000000020L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long InProgress = 0x0000000000000040L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long OnHold = 0x0000000000000080L;
}

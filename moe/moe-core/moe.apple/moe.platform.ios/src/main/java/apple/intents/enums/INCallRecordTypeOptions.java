package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class INCallRecordTypeOptions {
    @Generated
    private INCallRecordTypeOptions() {
    }

    @Generated @NUInt public static final long Outgoing = 0x0000000000000001L;
    @Generated @NUInt public static final long Missed = 0x0000000000000002L;
    @Generated @NUInt public static final long Received = 0x0000000000000004L;
    @Generated @NUInt public static final long Latest = 0x0000000000000008L;
    @Generated @NUInt public static final long Voicemail = 0x0000000000000010L;
    @Generated @NUInt public static final long Ringing = 0x0000000000000020L;
    @Generated @NUInt public static final long InProgress = 0x0000000000000040L;
    @Generated @NUInt public static final long OnHold = 0x0000000000000080L;
}

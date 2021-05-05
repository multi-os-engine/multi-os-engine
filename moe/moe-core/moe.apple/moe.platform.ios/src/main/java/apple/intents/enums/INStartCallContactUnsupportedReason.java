package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INStartCallContactUnsupportedReason {
    @Generated
    private INStartCallContactUnsupportedReason() {
    }

    @Generated @NInt public static final long NoContactFound = 0x0000000000000001L;
    @Generated @NInt public static final long MultipleContactsUnsupported = 0x0000000000000002L;
    @Generated @NInt public static final long NoHandleForLabel = 0x0000000000000003L;
    @Generated @NInt public static final long InvalidHandle = 0x0000000000000004L;
    @Generated @NInt public static final long UnsupportedMmiUssd = 0x0000000000000005L;
    @Generated @NInt public static final long NoCallHistoryForRedial = 0x0000000000000006L;
    @Generated @NInt public static final long NoUsableHandleForRedial = 0x0000000000000007L;
}
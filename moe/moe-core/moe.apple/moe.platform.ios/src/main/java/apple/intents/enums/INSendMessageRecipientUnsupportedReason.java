package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INSendMessageRecipientUnsupportedReason {
    @Generated
    private INSendMessageRecipientUnsupportedReason() {
    }

    @Generated @NInt public static final long NoAccount = 0x0000000000000001L;
    @Generated @NInt public static final long Offline = 0x0000000000000002L;
    @Generated @NInt public static final long MessagingServiceNotEnabledForRecipient = 0x0000000000000003L;
    @Generated @NInt public static final long NoValidHandle = 0x0000000000000004L;
    @Generated @NInt public static final long RequestedHandleInvalid = 0x0000000000000005L;
    @Generated @NInt public static final long NoHandleForLabel = 0x0000000000000006L;
}
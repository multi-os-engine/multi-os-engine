package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class INSendMessageRecipientUnsupportedReason {
    @Generated
    private INSendMessageRecipientUnsupportedReason() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NoAccount = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Offline = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MessagingServiceNotEnabledForRecipient = 0x0000000000000003L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long NoValidHandle = 0x0000000000000004L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long RequestedHandleInvalid = 0x0000000000000005L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long NoHandleForLabel = 0x0000000000000006L;
}
package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDICIPropertyExchangeMessageType
 * 
 * MIDI-CI Property Exchange Message sub-ID values.
 */
@Generated
public final class MIDICIPropertyExchangeMessageType {
    @Generated
    private MIDICIPropertyExchangeMessageType() {
    }

    @Generated public static final byte InquiryPropertyExchangeCapabilities = 48;
    @Generated public static final byte ReplyToPropertyExchangeCapabilities = 49;
    @Generated public static final byte InquiryHasPropertyData_Reserved = 50;
    @Generated public static final byte InquiryReplyToHasPropertyData_Reserved = 51;
    @Generated public static final byte InquiryGetPropertyData = 52;
    @Generated public static final byte ReplyToGetProperty = 53;
    @Generated public static final byte InquirySetPropertyData = 54;
    @Generated public static final byte ReplyToSetPropertyData = 55;
    @Generated public static final byte Subscription = 56;
    @Generated public static final byte ReplyToSubscription = 57;
    @Generated public static final byte Notify = 63;
}
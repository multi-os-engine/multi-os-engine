package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDICIProcessInquiryMessageType
 * 
 * MIDI-CI Process Inquiry sub-ID values.
 */
@Generated
public final class MIDICIProcessInquiryMessageType {
    @Generated
    private MIDICIProcessInquiryMessageType() {
    }

    @Generated public static final byte InquiryProcessInquiryCapabilities = 64;
    @Generated public static final byte ReplyToProcessInquiryCapabilities = 65;
    @Generated public static final byte InquiryMIDIMessageReport = 66;
    @Generated public static final byte ReplyToMIDIMessageReport = 67;
    @Generated public static final byte EndOfMIDIMessageReport = 68;
}
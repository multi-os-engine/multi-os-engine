package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDICIManagementMessageType
 * 
 * MIDI-CI Management sub-ID values.
 */
@Generated
public final class MIDICIManagementMessageType {
    @Generated
    private MIDICIManagementMessageType() {
    }

    @Generated public static final byte Discovery = 112;
    @Generated public static final byte ReplyToDiscovery = 113;
    @Generated public static final byte InquiryEndpointInformation = 114;
    @Generated public static final byte ReplyToEndpointInformation = 115;
    @Generated public static final byte MIDICIACK = 125;
    @Generated public static final byte InvalidateMUID = 126;
    @Generated public static final byte MIDICINAK = 127;
}
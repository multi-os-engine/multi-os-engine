package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDICIProfileMessageType
 * 
 * MIDI-CI Profile message sub-ID values.
 */
@Generated
public final class MIDICIProfileMessageType {
    @Generated
    private MIDICIProfileMessageType() {
    }

    @Generated public static final byte ProfileInquiry = 32;
    @Generated public static final byte ReplyToProfileInquiry = 33;
    @Generated public static final byte SetProfileOn = 34;
    @Generated public static final byte SetProfileOff = 35;
    @Generated public static final byte ProfileEnabledReport = 36;
    @Generated public static final byte ProfileDisabledReport = 37;
    @Generated public static final byte ProfileAdded = 38;
    @Generated public static final byte ProfileRemoved = 39;
    @Generated public static final byte DetailsInquiry = 40;
    @Generated public static final byte ReplyToDetailsInquiry = 41;
    @Generated public static final byte ProfileSpecificData = 47;
}
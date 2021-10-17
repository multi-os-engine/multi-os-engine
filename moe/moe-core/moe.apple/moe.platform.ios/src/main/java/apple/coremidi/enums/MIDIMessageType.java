package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * MIDI Universal Packet message type nibbles.
 */
@Generated
public final class MIDIMessageType {
    @Generated
    private MIDIMessageType() {
    }

    /**
     * 1 word
     */
    @Generated public static final int Utility = 0x00000000;
    /**
     * 1 word
     */
    @Generated public static final int System = 0x00000001;
    /**
     * 1 word - MIDI 1.0
     */
    @Generated public static final int ChannelVoice1 = 0x00000002;
    /**
     * 2 words (Data, but primarily SysEx)
     */
    @Generated public static final int SysEx = 0x00000003;
    /**
     * 2 words - MIDI 2.0
     */
    @Generated public static final int ChannelVoice2 = 0x00000004;
    /**
     * 4 words
     */
    @Generated public static final int Data128 = 0x00000005;
    @Generated public static final int UnknownF = 0x0000000F;
}

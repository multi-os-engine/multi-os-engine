package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kMIDIMessageTypeSysEx / kMIDIMessageTypeData128 status nibbles.
 */
@Generated
public final class MIDISysExStatus {
    @Generated
    private MIDISysExStatus() {
    }

    @Generated public static final int Complete = 0x00000000;
    @Generated public static final int Start = 0x00000001;
    @Generated public static final int Continue = 0x00000002;
    @Generated public static final int End = 0x00000003;
    /**
     * MIDI 2.0
     */
    @Generated public static final int MixedDataSetHeader = 0x00000008;
    /**
     * MIDI 2.0
     */
    @Generated public static final int MixedDataSetPayload = 0x00000009;
}

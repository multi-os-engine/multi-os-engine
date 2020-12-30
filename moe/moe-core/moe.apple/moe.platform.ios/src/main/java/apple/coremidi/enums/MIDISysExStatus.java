package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kMIDIMessageTypeSysEx / Data (MT=3) message status nibbles.
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
}
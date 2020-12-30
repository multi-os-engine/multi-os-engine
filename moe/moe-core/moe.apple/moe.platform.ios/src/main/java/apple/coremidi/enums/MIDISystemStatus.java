package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kMIDIMessageTypeSystem status bytes.
 */
@Generated
public final class MIDISystemStatus {
    @Generated
    private MIDISystemStatus() {
    }

    /**
     * MIDI 1.0 only
     */
    @Generated public static final int StartOfExclusive = 0x000000F0;
    /**
     * MIDI 1.0 only
     */
    @Generated public static final int EndOfExclusive = 0x000000F7;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int MTC = 0x000000F1;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int SongPosPointer = 0x000000F2;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int SongSelect = 0x000000F3;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int TuneRequest = 0x000000F6;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int TimingClock = 0x000000F8;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int Start = 0x000000FA;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int Continue = 0x000000FB;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int Stop = 0x000000FC;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int ActiveSending = 0x000000FE;
    /**
     * MIDI 1.0 and 2.0
     */
    @Generated public static final int SystemReset = 0x000000FF;
}
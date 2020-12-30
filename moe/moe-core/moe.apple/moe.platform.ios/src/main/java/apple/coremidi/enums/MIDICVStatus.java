package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kMIDIMessageTypeChannelVoice1 / kMIDIMessageTypeChannelVoice2 status nibbles.
 */
@Generated
public final class MIDICVStatus {
    @Generated
    private MIDICVStatus() {
    }

    /**
     * MIDI 1.0
     */
    @Generated public static final int NoteOff = 0x00000008;
    /**
     * MIDI 1.0
     */
    @Generated public static final int NoteOn = 0x00000009;
    /**
     * MIDI 1.0
     */
    @Generated public static final int PolyPressure = 0x0000000A;
    /**
     * MIDI 1.0
     */
    @Generated public static final int ControlChange = 0x0000000B;
    /**
     * MIDI 1.0
     */
    @Generated public static final int ProgramChange = 0x0000000C;
    /**
     * MIDI 1.0
     */
    @Generated public static final int ChannelPressure = 0x0000000D;
    /**
     * MIDI 1.0
     */
    @Generated public static final int PitchBend = 0x0000000E;
    /**
     * Per-Note Controller
     */
    @Generated public static final int RegisteredPNC = 0x00000000;
    @Generated public static final int AssignablePNC = 0x00000001;
    /**
     * Registered Parameter Number (RPN)
     */
    @Generated public static final int RegisteredControl = 0x00000002;
    /**
     * Non-Registered Parameter Number (NRPN)
     */
    @Generated public static final int AssignableControl = 0x00000003;
    /**
     * Relative
     */
    @Generated public static final int RelRegisteredControl = 0x00000004;
    /**
     * Relative
     */
    @Generated public static final int RelAssignableControl = 0x00000005;
    @Generated public static final int PerNotePitchBend = 0x00000006;
    @Generated public static final int PerNoteMgmt = 0x0000000F;
}
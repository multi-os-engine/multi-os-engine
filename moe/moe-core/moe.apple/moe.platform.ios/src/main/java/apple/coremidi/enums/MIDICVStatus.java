package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MIDICVStatus {
    @Generated
    private MIDICVStatus() {
    }

    @Generated public static final int NoteOff = 0x00000008;
    @Generated public static final int NoteOn = 0x00000009;
    @Generated public static final int PolyPressure = 0x0000000A;
    @Generated public static final int ControlChange = 0x0000000B;
    @Generated public static final int ProgramChange = 0x0000000C;
    @Generated public static final int ChannelPressure = 0x0000000D;
    @Generated public static final int PitchBend = 0x0000000E;
    @Generated public static final int RegisteredPNC = 0x00000000;
    @Generated public static final int AssignablePNC = 0x00000001;
    @Generated public static final int RegisteredControl = 0x00000002;
    @Generated public static final int AssignableControl = 0x00000003;
    @Generated public static final int RelRegisteredControl = 0x00000004;
    @Generated public static final int RelAssignableControl = 0x00000005;
    @Generated public static final int PerNotePitchBend = 0x00000006;
    @Generated public static final int PerNoteMgmt = 0x0000000F;
}
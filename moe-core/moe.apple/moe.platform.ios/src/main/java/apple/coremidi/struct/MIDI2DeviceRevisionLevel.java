package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDI2DeviceRevisionLevel extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MIDI2DeviceRevisionLevel() {
        super(MIDI2DeviceRevisionLevel.class);
    }

    @Generated
    protected MIDI2DeviceRevisionLevel(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 4)
    public native byte revisionLevel(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 4)
    public native void setRevisionLevel(byte value, int field_idx);
}
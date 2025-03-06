package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDI2DeviceManufacturer extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MIDI2DeviceManufacturer() {
        super(MIDI2DeviceManufacturer.class);
    }

    @Generated
    protected MIDI2DeviceManufacturer(Pointer peer) {
        super(peer);
    }

    /**
     * 1-byte SysEx IDs are padded with trailing zeroes
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 3)
    public native byte sysExIDByte(int field_idx);

    /**
     * 1-byte SysEx IDs are padded with trailing zeroes
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 3)
    public native void setSysExIDByte(byte value, int field_idx);
}
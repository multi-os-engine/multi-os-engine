package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDICIDeviceIdentification extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MIDICIDeviceIdentification() {
        super(MIDICIDeviceIdentification.class);
    }

    @Generated
    protected MIDICIDeviceIdentification(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 3)
    public native byte manufacturer(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 3)
    public native void setManufacturer(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 2)
    public native byte family(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 2)
    public native void setFamily(byte value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 2)
    public native byte modelNumber(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 2)
    public native void setModelNumber(byte value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 4)
    public native byte revisionLevel(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 4)
    public native void setRevisionLevel(byte value, int field_idx);

    /**
     * always zero
     */
    @Generated
    @StructureField(order = 4, isGetter = true, count = 5)
    public native byte reserved(int field_idx);

    /**
     * always zero
     */
    @Generated
    @StructureField(order = 4, isGetter = false, count = 5)
    public native void setReserved(byte value, int field_idx);
}
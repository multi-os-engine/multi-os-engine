package apple.coremidi.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MIDICIProfileIDManufacturerSpecific extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MIDICIProfileIDManufacturerSpecific() {
        super(MIDICIProfileIDManufacturerSpecific.class);
    }

    @Generated
    protected MIDICIProfileIDManufacturerSpecific(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte sysExID1();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSysExID1(byte value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native byte sysExID2();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSysExID2(byte value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte sysExID3();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSysExID3(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte info1();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setInfo1(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte info2();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setInfo2(byte value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_memory_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_memory_info() {
        super(mach_memory_info.class);
    }

    @Generated
    protected mach_memory_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long site();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSite(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long size();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSize(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long free();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFree(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long largest();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLargest(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long collectable_bytes();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCollectable_bytes(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long mapped();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMapped(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long peak();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setPeak(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native char tag();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setTag(char value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native char zone();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setZone(char value);

    @Generated
    @StructureField(order = 10, isGetter = true, count = 2)
    public native char _resvA(int field_idx);

    @Generated
    @StructureField(order = 10, isGetter = false, count = 2)
    public native void set_resvA(char value, int field_idx);

    @Generated
    @StructureField(order = 11, isGetter = true, count = 3)
    public native long _resv(int field_idx);

    @Generated
    @StructureField(order = 11, isGetter = false, count = 3)
    public native void set_resv(long value, int field_idx);

    @Generated
    @StructureField(order = 12, isGetter = true, count = 80)
    public native byte name(int field_idx);

    @Generated
    @StructureField(order = 12, isGetter = false, count = 80)
    public native void setName(byte value, int field_idx);
}
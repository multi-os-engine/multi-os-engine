package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class kmod_info_32_v1 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public kmod_info_32_v1() {
        super(kmod_info_32_v1.class);
    }

    @Generated
    protected kmod_info_32_v1(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int next_addr();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNext_addr(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int info_version();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInfo_version(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int id();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setId(int value);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 64)
    public native byte name(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 64)
    public native void setName(byte value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 64)
    public native byte version(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 64)
    public native void setVersion(byte value, int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int reference_count();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReference_count(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int reference_list_addr();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReference_list_addr(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int address();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setAddress(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int size();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setSize(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int hdr_size();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setHdr_size(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int start_addr();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setStart_addr(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int stop_addr();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setStop_addr(int value);
}
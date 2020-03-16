package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class section_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public section_64() {
        super(section_64.class);
    }

    @Generated
    protected section_64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte sectname(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setSectname(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 16)
    public native byte segname(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 16)
    public native void setSegname(byte value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long addr();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddr(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSize(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int offset();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setOffset(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int align();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setAlign(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int reloff();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReloff(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int nreloc();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNreloc(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFlags(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int reserved1();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setReserved1(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int reserved2();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setReserved2(int value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int reserved3();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setReserved3(int value);
}
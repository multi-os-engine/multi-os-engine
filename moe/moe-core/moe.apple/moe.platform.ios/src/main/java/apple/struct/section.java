package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class section extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public section() {
        super(section.class);
    }

    @Generated
    protected section(Pointer peer) {
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
    public native int addr();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddr(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSize(int value);

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
}
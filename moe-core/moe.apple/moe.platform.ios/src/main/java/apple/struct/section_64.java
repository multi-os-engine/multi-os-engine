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

    /**
     * name of this section
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte sectname(int field_idx);

    /**
     * name of this section
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setSectname(byte value, int field_idx);

    /**
     * segment this section goes in
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 16)
    public native byte segname(int field_idx);

    /**
     * segment this section goes in
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 16)
    public native void setSegname(byte value, int field_idx);

    /**
     * memory address of this section
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long addr();

    /**
     * memory address of this section
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddr(long value);

    /**
     * size in bytes of this section
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long size();

    /**
     * size in bytes of this section
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSize(long value);

    /**
     * file offset of this section
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int offset();

    /**
     * file offset of this section
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setOffset(int value);

    /**
     * section alignment (power of 2)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int align();

    /**
     * section alignment (power of 2)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setAlign(int value);

    /**
     * file offset of relocation entries
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int reloff();

    /**
     * file offset of relocation entries
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReloff(int value);

    /**
     * number of relocation entries
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int nreloc();

    /**
     * number of relocation entries
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNreloc(int value);

    /**
     * flags (section type and attributes)
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int flags();

    /**
     * flags (section type and attributes)
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFlags(int value);

    /**
     * reserved (for offset or index)
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int reserved1();

    /**
     * reserved (for offset or index)
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setReserved1(int value);

    /**
     * reserved (for count or sizeof)
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int reserved2();

    /**
     * reserved (for count or sizeof)
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setReserved2(int value);

    /**
     * reserved
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int reserved3();

    /**
     * reserved
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setReserved3(int value);
}
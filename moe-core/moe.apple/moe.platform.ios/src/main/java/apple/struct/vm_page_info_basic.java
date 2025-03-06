package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_page_info_basic extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_page_info_basic() {
        super(vm_page_info_basic.class);
    }

    @Generated
    protected vm_page_info_basic(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int disposition();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDisposition(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ref_count();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRef_count(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long object_id();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setObject_id(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long offset();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setOffset(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int depth();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDepth(int value);

    /**
     * pad to 64-bit boundary
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int __pad();

    /**
     * pad to 64-bit boundary
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void set__pad(int value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure(alignment = 1)
public final class mach_voucher_attr_recipe_data extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_voucher_attr_recipe_data() {
        super(mach_voucher_attr_recipe_data.class);
    }

    @Generated
    protected mach_voucher_attr_recipe_data(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int key();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKey(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int command();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCommand(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int previous_voucher();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPrevious_voucher(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int content_size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setContent_size(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native BytePtr content();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setContent(BytePtr value);
}
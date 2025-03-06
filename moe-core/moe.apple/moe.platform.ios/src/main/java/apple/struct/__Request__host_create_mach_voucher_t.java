package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __Request__host_create_mach_voucher_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__host_create_mach_voucher_t() {
        super(__Request__host_create_mach_voucher_t.class);
    }

    @Generated
    protected __Request__host_create_mach_voucher_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_msg_header_t Head();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHead(@ByValue mach_msg_header_t value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native NDR_record_t NDR();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNDR(@ByValue NDR_record_t value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int recipesCnt();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRecipesCnt(int value);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 5120)
    public native byte recipes(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 5120)
    public native void setRecipes(byte value, int field_idx);
}
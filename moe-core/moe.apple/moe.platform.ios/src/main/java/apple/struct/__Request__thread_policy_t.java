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
public final class __Request__thread_policy_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__thread_policy_t() {
        super(__Request__thread_policy_t.class);
    }

    @Generated
    protected __Request__thread_policy_t(Pointer peer) {
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
    public native int policy();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPolicy(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int baseCnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBaseCnt(int value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 5)
    public native int base(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 5)
    public native void setBase(int value, int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int set_limit();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setSet_limit(int value);
}
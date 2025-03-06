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
public final class __Request__thread_convert_thread_state_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__thread_convert_thread_state_t() {
        super(__Request__thread_convert_thread_state_t.class);
    }

    @Generated
    protected __Request__thread_convert_thread_state_t(Pointer peer) {
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
    public native int direction();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDirection(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int flavor();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFlavor(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int in_stateCnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIn_stateCnt(int value);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 1296)
    public native int in_state(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 1296)
    public native void setIn_state(int value, int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int out_stateCnt();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setOut_stateCnt(int value);
}
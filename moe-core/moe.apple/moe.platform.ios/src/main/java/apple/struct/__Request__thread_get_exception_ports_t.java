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
public final class __Request__thread_get_exception_ports_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__thread_get_exception_ports_t() {
        super(__Request__thread_get_exception_ports_t.class);
    }

    @Generated
    protected __Request__thread_get_exception_ports_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public __Request__thread_get_exception_ports_t(@ByValue mach_msg_header_t Head, @ByValue NDR_record_t NDR,
            int exception_mask) {
        super(__Request__thread_get_exception_ports_t.class);
        setHead(Head);
        setNDR(NDR);
        setException_mask(exception_mask);
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
    public native int exception_mask();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setException_mask(int value);
}
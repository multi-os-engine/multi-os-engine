package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class __Request__mach_port_set_context_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__mach_port_set_context_t() {
        super(__Request__mach_port_set_context_t.class);
    }

    @Generated
    protected __Request__mach_port_set_context_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public __Request__mach_port_set_context_t(@ByValue mach_msg_header_t Head, @ByValue NDR_record_t NDR, int name,
            @NUInt long context) {
        super(__Request__mach_port_set_context_t.class);
        setHead(Head);
        setNDR(NDR);
        setName(name);
        setContext(context);
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
    public native int name();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setName(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long context();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setContext(@NUInt long value);
}
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
public final class __Request__task_get_exc_guard_behavior_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__task_get_exc_guard_behavior_t() {
        super(__Request__task_get_exc_guard_behavior_t.class);
    }

    @Generated
    protected __Request__task_get_exc_guard_behavior_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public __Request__task_get_exc_guard_behavior_t(@ByValue mach_msg_header_t Head) {
        super(__Request__task_get_exc_guard_behavior_t.class);
        setHead(Head);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_msg_header_t Head();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHead(@ByValue mach_msg_header_t value);
}
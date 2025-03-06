package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class policy_fifo_base extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_fifo_base() {
        super(policy_fifo_base.class);
    }

    @Generated
    protected policy_fifo_base(Pointer peer) {
        super(peer);
    }

    @Generated
    public policy_fifo_base(int base_priority) {
        super(policy_fifo_base.class);
        setBase_priority(base_priority);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int base_priority();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setBase_priority(int value);
}
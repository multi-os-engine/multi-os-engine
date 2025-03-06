package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class policy_rr_limit extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_rr_limit() {
        super(policy_rr_limit.class);
    }

    @Generated
    protected policy_rr_limit(Pointer peer) {
        super(peer);
    }

    @Generated
    public policy_rr_limit(int max_priority) {
        super(policy_rr_limit.class);
        setMax_priority(max_priority);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int max_priority();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMax_priority(int value);
}
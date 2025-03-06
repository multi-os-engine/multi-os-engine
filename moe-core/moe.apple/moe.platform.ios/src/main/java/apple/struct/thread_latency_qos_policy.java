package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_latency_qos_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_latency_qos_policy() {
        super(thread_latency_qos_policy.class);
    }

    @Generated
    protected thread_latency_qos_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_latency_qos_policy(int thread_latency_qos_tier) {
        super(thread_latency_qos_policy.class);
        setThread_latency_qos_tier(thread_latency_qos_tier);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int thread_latency_qos_tier();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setThread_latency_qos_tier(int value);
}
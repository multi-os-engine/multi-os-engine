package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_throughput_qos_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_throughput_qos_policy() {
        super(thread_throughput_qos_policy.class);
    }

    @Generated
    protected thread_throughput_qos_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_throughput_qos_policy(int thread_throughput_qos_tier) {
        super(thread_throughput_qos_policy.class);
        setThread_throughput_qos_tier(thread_throughput_qos_tier);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int thread_throughput_qos_tier();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setThread_throughput_qos_tier(int value);
}
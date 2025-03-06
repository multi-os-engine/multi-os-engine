package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_qos_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_qos_policy() {
        super(task_qos_policy.class);
    }

    @Generated
    protected task_qos_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_qos_policy(int task_latency_qos_tier, int task_throughput_qos_tier) {
        super(task_qos_policy.class);
        setTask_latency_qos_tier(task_latency_qos_tier);
        setTask_throughput_qos_tier(task_throughput_qos_tier);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int task_latency_qos_tier();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTask_latency_qos_tier(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int task_throughput_qos_tier();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTask_throughput_qos_tier(int value);
}
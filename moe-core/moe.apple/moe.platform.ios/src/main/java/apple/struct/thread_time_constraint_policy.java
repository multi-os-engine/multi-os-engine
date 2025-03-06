package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_time_constraint_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_time_constraint_policy() {
        super(thread_time_constraint_policy.class);
    }

    @Generated
    protected thread_time_constraint_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_time_constraint_policy(int period, int computation, int constraint, int preemptible) {
        super(thread_time_constraint_policy.class);
        setPeriod(period);
        setComputation(computation);
        setConstraint(constraint);
        setPreemptible(preemptible);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int period();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPeriod(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int computation();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setComputation(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int constraint();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setConstraint(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int preemptible();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPreemptible(int value);
}
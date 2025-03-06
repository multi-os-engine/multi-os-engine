package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class host_sched_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_sched_info() {
        super(host_sched_info.class);
    }

    @Generated
    protected host_sched_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public host_sched_info(int min_timeout, int min_quantum) {
        super(host_sched_info.class);
        setMin_timeout(min_timeout);
        setMin_quantum(min_quantum);
    }

    /**
     * minimum timeout in milliseconds
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int min_timeout();

    /**
     * minimum timeout in milliseconds
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMin_timeout(int value);

    /**
     * minimum quantum in milliseconds
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int min_quantum();

    /**
     * minimum quantum in milliseconds
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMin_quantum(int value);
}
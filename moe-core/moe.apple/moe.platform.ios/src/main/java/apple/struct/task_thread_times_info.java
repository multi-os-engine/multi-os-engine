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
public final class task_thread_times_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_thread_times_info() {
        super(task_thread_times_info.class);
    }

    @Generated
    protected task_thread_times_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_thread_times_info(@ByValue time_value user_time, @ByValue time_value system_time) {
        super(task_thread_times_info.class);
        setUser_time(user_time);
        setSystem_time(system_time);
    }

    /**
     * total user run time for
     * live threads
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native time_value user_time();

    /**
     * total user run time for
     * live threads
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUser_time(@ByValue time_value value);

    /**
     * total system run time for
     * live threads
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native time_value system_time();

    /**
     * total system run time for
     * live threads
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSystem_time(@ByValue time_value value);
}
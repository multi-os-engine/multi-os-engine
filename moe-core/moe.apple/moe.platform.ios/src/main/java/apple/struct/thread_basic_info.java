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
public final class thread_basic_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_basic_info() {
        super(thread_basic_info.class);
    }

    @Generated
    protected thread_basic_info(Pointer peer) {
        super(peer);
    }

    /**
     * user run time
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native time_value user_time();

    /**
     * user run time
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUser_time(@ByValue time_value value);

    /**
     * system run time
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native time_value system_time();

    /**
     * system run time
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSystem_time(@ByValue time_value value);

    /**
     * scaled cpu usage percentage
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int cpu_usage();

    /**
     * scaled cpu usage percentage
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCpu_usage(int value);

    /**
     * scheduling policy in effect
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int policy();

    /**
     * scheduling policy in effect
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPolicy(int value);

    /**
     * run state (see below)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int run_state();

    /**
     * run state (see below)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRun_state(int value);

    /**
     * various flags (see below)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int flags();

    /**
     * various flags (see below)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setFlags(int value);

    /**
     * suspend count for thread
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int suspend_count();

    /**
     * suspend count for thread
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setSuspend_count(int value);

    /**
     * number of seconds that thread
     * has been sleeping
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int sleep_time();

    /**
     * number of seconds that thread
     * has been sleeping
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setSleep_time(int value);
}
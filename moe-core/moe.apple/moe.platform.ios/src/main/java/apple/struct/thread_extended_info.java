package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_extended_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_extended_info() {
        super(thread_extended_info.class);
    }

    @Generated
    protected thread_extended_info(Pointer peer) {
        super(peer);
    }

    /**
     * user run time
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long pth_user_time();

    /**
     * user run time
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPth_user_time(long value);

    /**
     * system run time
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long pth_system_time();

    /**
     * system run time
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPth_system_time(long value);

    /**
     * scaled cpu usage percentage
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int pth_cpu_usage();

    /**
     * scaled cpu usage percentage
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPth_cpu_usage(int value);

    /**
     * scheduling policy in effect
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int pth_policy();

    /**
     * scheduling policy in effect
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPth_policy(int value);

    /**
     * run state (see below)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int pth_run_state();

    /**
     * run state (see below)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPth_run_state(int value);

    /**
     * various flags (see below)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int pth_flags();

    /**
     * various flags (see below)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setPth_flags(int value);

    /**
     * number of seconds that thread
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int pth_sleep_time();

    /**
     * number of seconds that thread
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setPth_sleep_time(int value);

    /**
     * cur priority
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int pth_curpri();

    /**
     * cur priority
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setPth_curpri(int value);

    /**
     * priority
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int pth_priority();

    /**
     * priority
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setPth_priority(int value);

    /**
     * max priority
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int pth_maxpriority();

    /**
     * max priority
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setPth_maxpriority(int value);

    /**
     * thread name, if any
     */
    @Generated
    @StructureField(order = 10, isGetter = true, count = 64)
    public native byte pth_name(int field_idx);

    /**
     * thread name, if any
     */
    @Generated
    @StructureField(order = 10, isGetter = false, count = 64)
    public native void setPth_name(byte value, int field_idx);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class task_power_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_power_info() {
        super(task_power_info.class);
    }

    @Generated
    protected task_power_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long total_user();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTotal_user(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long total_system();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTotal_system(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long task_interrupt_wakeups();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTask_interrupt_wakeups(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long task_platform_idle_wakeups();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTask_platform_idle_wakeups(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long task_timer_wakeups_bin_1();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTask_timer_wakeups_bin_1(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long task_timer_wakeups_bin_2();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTask_timer_wakeups_bin_2(long value);
}
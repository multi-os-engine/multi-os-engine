package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class rusage_info_v5 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public rusage_info_v5() {
        super(rusage_info_v5.class);
    }

    @Generated
    protected rusage_info_v5(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte ri_uuid(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setRi_uuid(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long ri_user_time();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRi_user_time(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long ri_system_time();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRi_system_time(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long ri_pkg_idle_wkups();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRi_pkg_idle_wkups(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long ri_interrupt_wkups();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRi_interrupt_wkups(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long ri_pageins();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRi_pageins(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long ri_wired_size();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRi_wired_size(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long ri_resident_size();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRi_resident_size(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long ri_phys_footprint();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setRi_phys_footprint(long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long ri_proc_start_abstime();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setRi_proc_start_abstime(long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long ri_proc_exit_abstime();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setRi_proc_exit_abstime(long value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native long ri_child_user_time();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setRi_child_user_time(long value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native long ri_child_system_time();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setRi_child_system_time(long value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native long ri_child_pkg_idle_wkups();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setRi_child_pkg_idle_wkups(long value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native long ri_child_interrupt_wkups();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setRi_child_interrupt_wkups(long value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native long ri_child_pageins();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setRi_child_pageins(long value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native long ri_child_elapsed_abstime();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setRi_child_elapsed_abstime(long value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native long ri_diskio_bytesread();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setRi_diskio_bytesread(long value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native long ri_diskio_byteswritten();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setRi_diskio_byteswritten(long value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native long ri_cpu_time_qos_default();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setRi_cpu_time_qos_default(long value);

    @Generated
    @StructureField(order = 20, isGetter = true)
    public native long ri_cpu_time_qos_maintenance();

    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setRi_cpu_time_qos_maintenance(long value);

    @Generated
    @StructureField(order = 21, isGetter = true)
    public native long ri_cpu_time_qos_background();

    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setRi_cpu_time_qos_background(long value);

    @Generated
    @StructureField(order = 22, isGetter = true)
    public native long ri_cpu_time_qos_utility();

    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setRi_cpu_time_qos_utility(long value);

    @Generated
    @StructureField(order = 23, isGetter = true)
    public native long ri_cpu_time_qos_legacy();

    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setRi_cpu_time_qos_legacy(long value);

    @Generated
    @StructureField(order = 24, isGetter = true)
    public native long ri_cpu_time_qos_user_initiated();

    @Generated
    @StructureField(order = 24, isGetter = false)
    public native void setRi_cpu_time_qos_user_initiated(long value);

    @Generated
    @StructureField(order = 25, isGetter = true)
    public native long ri_cpu_time_qos_user_interactive();

    @Generated
    @StructureField(order = 25, isGetter = false)
    public native void setRi_cpu_time_qos_user_interactive(long value);

    @Generated
    @StructureField(order = 26, isGetter = true)
    public native long ri_billed_system_time();

    @Generated
    @StructureField(order = 26, isGetter = false)
    public native void setRi_billed_system_time(long value);

    @Generated
    @StructureField(order = 27, isGetter = true)
    public native long ri_serviced_system_time();

    @Generated
    @StructureField(order = 27, isGetter = false)
    public native void setRi_serviced_system_time(long value);

    @Generated
    @StructureField(order = 28, isGetter = true)
    public native long ri_logical_writes();

    @Generated
    @StructureField(order = 28, isGetter = false)
    public native void setRi_logical_writes(long value);

    @Generated
    @StructureField(order = 29, isGetter = true)
    public native long ri_lifetime_max_phys_footprint();

    @Generated
    @StructureField(order = 29, isGetter = false)
    public native void setRi_lifetime_max_phys_footprint(long value);

    @Generated
    @StructureField(order = 30, isGetter = true)
    public native long ri_instructions();

    @Generated
    @StructureField(order = 30, isGetter = false)
    public native void setRi_instructions(long value);

    @Generated
    @StructureField(order = 31, isGetter = true)
    public native long ri_cycles();

    @Generated
    @StructureField(order = 31, isGetter = false)
    public native void setRi_cycles(long value);

    @Generated
    @StructureField(order = 32, isGetter = true)
    public native long ri_billed_energy();

    @Generated
    @StructureField(order = 32, isGetter = false)
    public native void setRi_billed_energy(long value);

    @Generated
    @StructureField(order = 33, isGetter = true)
    public native long ri_serviced_energy();

    @Generated
    @StructureField(order = 33, isGetter = false)
    public native void setRi_serviced_energy(long value);

    @Generated
    @StructureField(order = 34, isGetter = true)
    public native long ri_interval_max_phys_footprint();

    @Generated
    @StructureField(order = 34, isGetter = false)
    public native void setRi_interval_max_phys_footprint(long value);

    @Generated
    @StructureField(order = 35, isGetter = true)
    public native long ri_runnable_time();

    @Generated
    @StructureField(order = 35, isGetter = false)
    public native void setRi_runnable_time(long value);

    @Generated
    @StructureField(order = 36, isGetter = true)
    public native long ri_flags();

    @Generated
    @StructureField(order = 36, isGetter = false)
    public native void setRi_flags(long value);
}
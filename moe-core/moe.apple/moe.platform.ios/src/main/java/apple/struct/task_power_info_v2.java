package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class task_power_info_v2 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_power_info_v2() {
        super(task_power_info_v2.class);
    }

    @Generated
    protected task_power_info_v2(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native task_power_info cpu_energy();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCpu_energy(@ByValue task_power_info value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native gpu_energy_data gpu_energy();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGpu_energy(@ByValue gpu_energy_data value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long task_energy();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTask_energy(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long task_ptime();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTask_ptime(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long task_pset_switches();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTask_pset_switches(long value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class gpu_energy_data extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public gpu_energy_data() {
        super(gpu_energy_data.class);
    }

    @Generated
    protected gpu_energy_data(Pointer peer) {
        super(peer);
    }

    @Generated
    public gpu_energy_data(long task_gpu_utilisation, long task_gpu_stat_reserved0, long task_gpu_stat_reserved1,
            long task_gpu_stat_reserved2) {
        super(gpu_energy_data.class);
        setTask_gpu_utilisation(task_gpu_utilisation);
        setTask_gpu_stat_reserved0(task_gpu_stat_reserved0);
        setTask_gpu_stat_reserved1(task_gpu_stat_reserved1);
        setTask_gpu_stat_reserved2(task_gpu_stat_reserved2);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long task_gpu_utilisation();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTask_gpu_utilisation(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long task_gpu_stat_reserved0();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTask_gpu_stat_reserved0(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long task_gpu_stat_reserved1();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTask_gpu_stat_reserved1(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long task_gpu_stat_reserved2();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTask_gpu_stat_reserved2(long value);
}
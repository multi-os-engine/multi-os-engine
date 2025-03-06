package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class host_basic_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_basic_info() {
        super(host_basic_info.class);
    }

    @Generated
    protected host_basic_info(Pointer peer) {
        super(peer);
    }

    /**
     * max number of CPUs possible
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int max_cpus();

    /**
     * max number of CPUs possible
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMax_cpus(int value);

    /**
     * number of CPUs now available
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int avail_cpus();

    /**
     * number of CPUs now available
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAvail_cpus(int value);

    /**
     * size of memory in bytes, capped at 2 GB
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int memory_size();

    /**
     * size of memory in bytes, capped at 2 GB
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMemory_size(int value);

    /**
     * cpu type
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int cpu_type();

    /**
     * cpu type
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setCpu_type(int value);

    /**
     * cpu subtype
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int cpu_subtype();

    /**
     * cpu subtype
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCpu_subtype(int value);

    /**
     * cpu threadtype
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int cpu_threadtype();

    /**
     * cpu threadtype
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCpu_threadtype(int value);

    /**
     * number of physical CPUs now available
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int physical_cpu();

    /**
     * number of physical CPUs now available
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setPhysical_cpu(int value);

    /**
     * max number of physical CPUs possible
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int physical_cpu_max();

    /**
     * max number of physical CPUs possible
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setPhysical_cpu_max(int value);

    /**
     * number of logical cpu now available
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int logical_cpu();

    /**
     * number of logical cpu now available
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setLogical_cpu(int value);

    /**
     * max number of physical CPUs possible
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int logical_cpu_max();

    /**
     * max number of physical CPUs possible
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setLogical_cpu_max(int value);

    /**
     * actual size of physical memory
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long max_mem();

    /**
     * actual size of physical memory
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setMax_mem(long value);
}
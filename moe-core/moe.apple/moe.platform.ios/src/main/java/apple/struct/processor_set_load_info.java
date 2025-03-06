package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class processor_set_load_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_set_load_info() {
        super(processor_set_load_info.class);
    }

    @Generated
    protected processor_set_load_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public processor_set_load_info(int task_count, int thread_count, int load_average, int mach_factor) {
        super(processor_set_load_info.class);
        setTask_count(task_count);
        setThread_count(thread_count);
        setLoad_average(load_average);
        setMach_factor(mach_factor);
    }

    /**
     * How many tasks
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int task_count();

    /**
     * How many tasks
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTask_count(int value);

    /**
     * How many threads
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int thread_count();

    /**
     * How many threads
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setThread_count(int value);

    /**
     * Scaled
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int load_average();

    /**
     * Scaled
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLoad_average(int value);

    /**
     * Scaled
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mach_factor();

    /**
     * Scaled
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMach_factor(int value);
}
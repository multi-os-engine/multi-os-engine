package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_extmod_statistics extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_extmod_statistics() {
        super(vm_extmod_statistics.class);
    }

    @Generated
    protected vm_extmod_statistics(Pointer peer) {
        super(peer);
    }

    /**
     * # of times task port was looked up
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long task_for_pid_count();

    /**
     * # of times task port was looked up
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTask_for_pid_count(long value);

    /**
     * # of times this task called task_for_pid
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long task_for_pid_caller_count();

    /**
     * # of times this task called task_for_pid
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTask_for_pid_caller_count(long value);

    /**
     * # of threads created in task
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long thread_creation_count();

    /**
     * # of threads created in task
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setThread_creation_count(long value);

    /**
     * # of threads created by task
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long thread_creation_caller_count();

    /**
     * # of threads created by task
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setThread_creation_caller_count(long value);

    /**
     * # of register state sets in task
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long thread_set_state_count();

    /**
     * # of register state sets in task
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setThread_set_state_count(long value);

    /**
     * # of register state sets by task
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long thread_set_state_caller_count();

    /**
     * # of register state sets by task
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setThread_set_state_caller_count(long value);
}
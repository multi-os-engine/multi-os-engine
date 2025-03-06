package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class task_basic_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_basic_info() {
        super(task_basic_info.class);
    }

    @Generated
    protected task_basic_info(Pointer peer) {
        super(peer);
    }

    /**
     * suspend count for task
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int suspend_count();

    /**
     * suspend count for task
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSuspend_count(int value);

    /**
     * virtual memory size (bytes)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long virtual_size();

    /**
     * virtual memory size (bytes)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVirtual_size(@NUInt long value);

    /**
     * resident memory size (bytes)
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long resident_size();

    /**
     * resident memory size (bytes)
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setResident_size(@NUInt long value);

    /**
     * total user run time for
     * terminated threads
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native time_value user_time();

    /**
     * total user run time for
     * terminated threads
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUser_time(@ByValue time_value value);

    /**
     * total system run time for
     * terminated threads
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native time_value system_time();

    /**
     * total system run time for
     * terminated threads
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSystem_time(@ByValue time_value value);

    /**
     * default policy for new threads
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int policy();

    /**
     * default policy for new threads
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setPolicy(int value);
}
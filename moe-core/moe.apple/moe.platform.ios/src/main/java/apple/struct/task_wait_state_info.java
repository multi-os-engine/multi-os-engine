package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class task_wait_state_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_wait_state_info() {
        super(task_wait_state_info.class);
    }

    @Generated
    protected task_wait_state_info(Pointer peer) {
        super(peer);
    }

    /**
     * Time that all threads past and present have been in a wait state
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long total_wait_state_time();

    /**
     * Time that all threads past and present have been in a wait state
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTotal_wait_state_time(long value);

    /**
     * Time that threads have been in SFI wait (should be a subset of total wait state time
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long total_wait_sfi_state_time();

    /**
     * Time that threads have been in SFI wait (should be a subset of total wait state time
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTotal_wait_sfi_state_time(long value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 4)
    public native int _reserved(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 4)
    public native void set_reserved(int value, int field_idx);
}
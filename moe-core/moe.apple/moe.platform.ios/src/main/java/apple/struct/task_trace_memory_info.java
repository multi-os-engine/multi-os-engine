package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class task_trace_memory_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_trace_memory_info() {
        super(task_trace_memory_info.class);
    }

    @Generated
    protected task_trace_memory_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_trace_memory_info(long user_memory_address, long buffer_size, long mailbox_array_size) {
        super(task_trace_memory_info.class);
        setUser_memory_address(user_memory_address);
        setBuffer_size(buffer_size);
        setMailbox_array_size(mailbox_array_size);
    }

    /**
     * address of start of trace memory buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long user_memory_address();

    /**
     * address of start of trace memory buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUser_memory_address(long value);

    /**
     * size of buffer in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long buffer_size();

    /**
     * size of buffer in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBuffer_size(long value);

    /**
     * size of mailbox area in bytes
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long mailbox_array_size();

    /**
     * size of mailbox area in bytes
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMailbox_array_size(long value);
}
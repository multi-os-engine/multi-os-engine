package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_identifier_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_identifier_info() {
        super(thread_identifier_info.class);
    }

    @Generated
    protected thread_identifier_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_identifier_info(long thread_id, long thread_handle, long dispatch_qaddr) {
        super(thread_identifier_info.class);
        setThread_id(thread_id);
        setThread_handle(thread_handle);
        setDispatch_qaddr(dispatch_qaddr);
    }

    /**
     * system-wide unique 64-bit thread id
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long thread_id();

    /**
     * system-wide unique 64-bit thread id
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setThread_id(long value);

    /**
     * handle to be used by libproc
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long thread_handle();

    /**
     * handle to be used by libproc
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setThread_handle(long value);

    /**
     * libdispatch queue address
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long dispatch_qaddr();

    /**
     * libdispatch queue address
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDispatch_qaddr(long value);
}
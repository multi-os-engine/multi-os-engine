package apple.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class rpc_routine_descriptor extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public rpc_routine_descriptor() {
        super(rpc_routine_descriptor.class);
    }

    @Generated
    protected rpc_routine_descriptor(Pointer peer) {
        super(peer);
    }

    /**
     * Server work func pointer
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_impl_routine")
    public native Function_impl_routine impl_routine();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_impl_routine {
        @Generated
        int call_impl_routine();
    }

    /**
     * Server work func pointer
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setImpl_routine(@FunctionPtr(name = "call_impl_routine") Function_impl_routine value);

    /**
     * Unmarshalling func pointer
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_stub_routine")
    public native Function_stub_routine stub_routine();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_stub_routine {
        @Generated
        void call_stub_routine(
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t arg1);
    }

    /**
     * Unmarshalling func pointer
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setStub_routine(@FunctionPtr(name = "call_stub_routine") Function_stub_routine value);

    /**
     * Number of argument words
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int argc();

    /**
     * Number of argument words
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setArgc(int value);

    /**
     * Number of complex argument
     * descriptors
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int descr_count();

    /**
     * Number of complex argument
     * descriptors
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDescr_count(int value);

    /**
     * Pointer to beginning of
     * the arg_descr array
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native rpc_routine_arg_descriptor arg_descr();

    /**
     * Pointer to beginning of
     * the arg_descr array
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setArg_descr(
            @UncertainArgument("Options: reference, array Fallback: reference") rpc_routine_arg_descriptor value);

    /**
     * Max size for reply msg
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int max_reply_msg();

    /**
     * Max size for reply msg
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMax_reply_msg(int value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class rpc_subsystem extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public rpc_subsystem() {
        super(rpc_subsystem.class);
    }

    @Generated
    protected rpc_subsystem(Pointer peer) {
        super(peer);
    }

    /**
     * Reserved for system use
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr reserved();

    /**
     * Reserved for system use
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setReserved(VoidPtr value);

    /**
     * Min routine number
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int start();

    /**
     * Min routine number
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setStart(int value);

    /**
     * Max routine number + 1
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int end();

    /**
     * Max routine number + 1
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEnd(int value);

    /**
     * Max mach_msg size
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int maxsize();

    /**
     * Max mach_msg size
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMaxsize(int value);

    /**
     * Address of this struct in user
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long base_addr();

    /**
     * Address of this struct in user
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBase_addr(@NUInt long value);

    /**
     * Actually, (start-end+1)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native rpc_routine_descriptor routine();

    /**
     * Actually, (start-end+1)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRoutine(@ByValue rpc_routine_descriptor value);

    /**
     * Actually, the sum of the descr_
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    @ByValue
    public native rpc_routine_arg_descriptor arg_descriptor();

    /**
     * Actually, the sum of the descr_
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setArg_descriptor(@ByValue rpc_routine_arg_descriptor value);
}
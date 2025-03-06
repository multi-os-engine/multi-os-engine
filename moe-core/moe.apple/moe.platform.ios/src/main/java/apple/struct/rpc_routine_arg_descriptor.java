package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class rpc_routine_arg_descriptor extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public rpc_routine_arg_descriptor() {
        super(rpc_routine_arg_descriptor.class);
    }

    @Generated
    protected rpc_routine_arg_descriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    public rpc_routine_arg_descriptor(int type, int size, int count, int offset) {
        super(rpc_routine_arg_descriptor.class);
        setType(type);
        setSize(size);
        setCount(count);
        setOffset(offset);
    }

    /**
     * Port, Array, etc.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    /**
     * Port, Array, etc.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    /**
     * element size in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int size();

    /**
     * element size in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(int value);

    /**
     * number of elements
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int count();

    /**
     * number of elements
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCount(int value);

    /**
     * Offset in list of routine args
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int offset();

    /**
     * Offset in list of routine args
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setOffset(int value);
}
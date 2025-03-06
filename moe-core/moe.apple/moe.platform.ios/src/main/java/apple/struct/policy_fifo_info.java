package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class policy_fifo_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_fifo_info() {
        super(policy_fifo_info.class);
    }

    @Generated
    protected policy_fifo_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public policy_fifo_info(int max_priority, int base_priority, int depressed, int depress_priority) {
        super(policy_fifo_info.class);
        setMax_priority(max_priority);
        setBase_priority(base_priority);
        setDepressed(depressed);
        setDepress_priority(depress_priority);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int max_priority();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMax_priority(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int base_priority();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBase_priority(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int depressed();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDepressed(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int depress_priority();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDepress_priority(int value);
}
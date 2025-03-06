package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class policy_rr_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_rr_info() {
        super(policy_rr_info.class);
    }

    @Generated
    protected policy_rr_info(Pointer peer) {
        super(peer);
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
    public native int quantum();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setQuantum(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int depressed();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDepressed(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int depress_priority();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDepress_priority(int value);
}
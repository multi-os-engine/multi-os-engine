package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class arm_state_hdr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public arm_state_hdr() {
        super(arm_state_hdr.class);
    }

    @Generated
    protected arm_state_hdr(Pointer peer) {
        super(peer);
    }

    @Generated
    public arm_state_hdr(int flavor, int count) {
        super(arm_state_hdr.class);
        setFlavor(flavor);
        setCount(count);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int flavor();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlavor(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int count();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCount(int value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class __darwin_arm_sme2_state extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __darwin_arm_sme2_state() {
        super(__darwin_arm_sme2_state.class);
    }

    @Generated
    protected __darwin_arm_sme2_state(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 64)
    public native byte __zt0(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 64)
    public native void set__zt0(byte value, int field_idx);
}
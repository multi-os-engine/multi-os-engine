package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class __darwin_arm_sve_p_state extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __darwin_arm_sve_p_state() {
        super(__darwin_arm_sve_p_state.class);
    }

    @Generated
    protected __darwin_arm_sve_p_state(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 512)
    public native byte __p(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 512)
    public native void set__p(byte value, int field_idx);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 64)
public final class __darwin_arm_amx_state_v1 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public __darwin_arm_amx_state_v1() {
        super(__darwin_arm_amx_state_v1.class);
    }

    @Generated
    protected __darwin_arm_amx_state_v1(Pointer peer) {
        super(peer);
    }

    /**
     * 8 64-byte registers
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 512)
    public native byte __x(int field_idx);

    /**
     * 8 64-byte registers
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 512)
    public native void set__x(byte value, int field_idx);

    /**
     * 8 64-byte registers
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 512)
    public native byte __y(int field_idx);

    /**
     * 8 64-byte registers
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 512)
    public native void set__y(byte value, int field_idx);

    /**
     * 64 64-byte registers in an M-by-N matrix
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 4096)
    public native byte __z(int field_idx);

    /**
     * 64 64-byte registers in an M-by-N matrix
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 4096)
    public native void set__z(byte value, int field_idx);

    /**
     * AMX_STATE_T_EL1 value
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long __amx_state_t_el1();

    /**
     * AMX_STATE_T_EL1 value
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set__amx_state_t_el1(long value);
}
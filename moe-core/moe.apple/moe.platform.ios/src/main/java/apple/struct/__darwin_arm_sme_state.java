package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_sme_state extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __darwin_arm_sme_state() {
        super(__darwin_arm_sme_state.class);
    }

    @Generated
    protected __darwin_arm_sme_state(Pointer peer) {
        super(peer);
    }

    @Generated
    public __darwin_arm_sme_state(long __svcr, long __tpidr2_el0, char __svl_b) {
        super(__darwin_arm_sme_state.class);
        set__svcr(__svcr);
        set__tpidr2_el0(__tpidr2_el0);
        set__svl_b(__svl_b);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long __svcr();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__svcr(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long __tpidr2_el0();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__tpidr2_el0(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char __svl_b();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set__svl_b(char value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_exception_state64_v2 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __darwin_arm_exception_state64_v2() {
        super(__darwin_arm_exception_state64_v2.class);
    }

    @Generated
    protected __darwin_arm_exception_state64_v2(Pointer peer) {
        super(peer);
    }

    @Generated
    public __darwin_arm_exception_state64_v2(long __far, long __esr) {
        super(__darwin_arm_exception_state64_v2.class);
        set__far(__far);
        set__esr(__esr);
    }

    /**
     * Virtual Fault Address
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long __far();

    /**
     * Virtual Fault Address
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__far(long value);

    /**
     * Exception syndrome
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long __esr();

    /**
     * Exception syndrome
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__esr(long value);
}
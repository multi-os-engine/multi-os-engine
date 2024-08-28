package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_cpmu_state64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public __darwin_arm_cpmu_state64() {
        super(__darwin_arm_cpmu_state64.class);
    }

    @Generated
    protected __darwin_arm_cpmu_state64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native long __ctrs(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void set__ctrs(long value, int field_idx);
}
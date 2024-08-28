package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class os_activity_scope_state_s extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public os_activity_scope_state_s() {
        super(os_activity_scope_state_s.class);
    }

    @Generated
    protected os_activity_scope_state_s(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 2)
    public native long opaque(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 2)
    public native void setOpaque(long value, int field_idx);
}

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class os_workgroup_interval_data_opaque_s extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public os_workgroup_interval_data_opaque_s() {
        super(os_workgroup_interval_data_opaque_s.class);
    }

    @Generated
    protected os_workgroup_interval_data_opaque_s(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int sig();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSig(int value);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 56)
    public native byte opaque(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 56)
    public native void setOpaque(byte value, int field_idx);
}
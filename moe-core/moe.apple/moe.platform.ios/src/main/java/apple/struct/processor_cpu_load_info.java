package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class processor_cpu_load_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_cpu_load_info() {
        super(processor_cpu_load_info.class);
    }

    @Generated
    protected processor_cpu_load_info(Pointer peer) {
        super(peer);
    }

    /**
     * ... in the given mode
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 4)
    public native int cpu_ticks(int field_idx);

    /**
     * ... in the given mode
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 4)
    public native void setCpu_ticks(int value, int field_idx);
}
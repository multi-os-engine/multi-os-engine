package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_flags_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_flags_info() {
        super(task_flags_info.class);
    }

    @Generated
    protected task_flags_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_flags_info(int flags) {
        super(task_flags_info.class);
        setFlags(flags);
    }

    /**
     * task flags
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int flags();

    /**
     * task flags
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(int value);
}
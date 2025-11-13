package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_ipc_space_policy_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_ipc_space_policy_info() {
        super(task_ipc_space_policy_info.class);
    }

    @Generated
    protected task_ipc_space_policy_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_ipc_space_policy_info(int space_policy) {
        super(task_ipc_space_policy_info.class);
        setSpace_policy(space_policy);
    }

    /**
     * Configuration bitmask
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int space_policy();

    /**
     * Configuration bitmask
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSpace_policy(int value);
}
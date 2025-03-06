package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_category_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_category_policy() {
        super(task_category_policy.class);
    }

    @Generated
    protected task_category_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_category_policy(int role) {
        super(task_category_policy.class);
        setRole(role);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int role();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRole(int value);
}
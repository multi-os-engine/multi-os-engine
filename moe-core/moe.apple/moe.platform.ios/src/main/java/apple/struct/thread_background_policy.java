package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_background_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_background_policy() {
        super(thread_background_policy.class);
    }

    @Generated
    protected thread_background_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_background_policy(int priority) {
        super(thread_background_policy.class);
        setPriority(priority);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int priority();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPriority(int value);
}
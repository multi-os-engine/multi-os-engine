package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_affinity_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_affinity_policy() {
        super(thread_affinity_policy.class);
    }

    @Generated
    protected thread_affinity_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_affinity_policy(int affinity_tag) {
        super(thread_affinity_policy.class);
        setAffinity_tag(affinity_tag);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int affinity_tag();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAffinity_tag(int value);
}
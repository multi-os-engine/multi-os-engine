package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_precedence_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_precedence_policy() {
        super(thread_precedence_policy.class);
    }

    @Generated
    protected thread_precedence_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_precedence_policy(int importance) {
        super(thread_precedence_policy.class);
        setImportance(importance);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int importance();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setImportance(int value);
}
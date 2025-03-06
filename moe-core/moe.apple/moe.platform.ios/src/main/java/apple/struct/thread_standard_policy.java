package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_standard_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_standard_policy() {
        super(thread_standard_policy.class);
    }

    @Generated
    protected thread_standard_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_standard_policy(int no_data) {
        super(thread_standard_policy.class);
        setNo_data(no_data);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int no_data();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNo_data(int value);
}
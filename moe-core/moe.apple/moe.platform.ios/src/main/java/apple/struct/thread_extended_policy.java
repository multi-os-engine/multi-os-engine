package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_extended_policy extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public thread_extended_policy() {
        super(thread_extended_policy.class);
    }

    @Generated
    protected thread_extended_policy(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_extended_policy(int timeshare) {
        super(thread_extended_policy.class);
        setTimeshare(timeshare);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int timeshare();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTimeshare(int value);
}
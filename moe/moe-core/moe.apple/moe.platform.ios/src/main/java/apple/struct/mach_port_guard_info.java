package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_port_guard_info extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public mach_port_guard_info() {
        super(mach_port_guard_info.class);
    }

    @Generated
    protected mach_port_guard_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public mach_port_guard_info(long mpgi_guard) {
        super(mach_port_guard_info.class);
        setMpgi_guard(mpgi_guard);
    }

    /**
     * guard value
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mpgi_guard();

    /**
     * guard value
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMpgi_guard(long value);
}

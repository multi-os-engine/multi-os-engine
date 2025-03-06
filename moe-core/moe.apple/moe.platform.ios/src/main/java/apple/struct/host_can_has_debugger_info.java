package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class host_can_has_debugger_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_can_has_debugger_info() {
        super(host_can_has_debugger_info.class);
    }

    @Generated
    protected host_can_has_debugger_info(Pointer peer) {
        super(peer);
    }

    @Generated
    public host_can_has_debugger_info(int can_has_debugger) {
        super(host_can_has_debugger_info.class);
        setCan_has_debugger(can_has_debugger);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int can_has_debugger();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCan_has_debugger(int value);
}
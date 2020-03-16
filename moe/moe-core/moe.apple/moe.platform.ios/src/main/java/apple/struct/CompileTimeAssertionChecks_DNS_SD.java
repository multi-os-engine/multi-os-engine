package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CompileTimeAssertionChecks_DNS_SD extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CompileTimeAssertionChecks_DNS_SD() {
        super(CompileTimeAssertionChecks_DNS_SD.class);
    }

    @Generated
    protected CompileTimeAssertionChecks_DNS_SD(Pointer peer) {
        super(peer);
    }

    @Generated
    public CompileTimeAssertionChecks_DNS_SD(byte assert0) {
        super(CompileTimeAssertionChecks_DNS_SD.class);
        setAssert0(assert0);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native byte assert0();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAssert0(byte value);
}
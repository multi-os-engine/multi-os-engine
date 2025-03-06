package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class policy_bases extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_bases() {
        super(policy_bases.class);
    }

    @Generated
    protected policy_bases(Pointer peer) {
        super(peer);
    }

    @Generated
    public policy_bases(@ByValue policy_timeshare_base ts, @ByValue policy_rr_base rr, @ByValue policy_fifo_base fifo) {
        super(policy_bases.class);
        setTs(ts);
        setRr(rr);
        setFifo(fifo);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native policy_timeshare_base ts();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTs(@ByValue policy_timeshare_base value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native policy_rr_base rr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRr(@ByValue policy_rr_base value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native policy_fifo_base fifo();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFifo(@ByValue policy_fifo_base value);
}
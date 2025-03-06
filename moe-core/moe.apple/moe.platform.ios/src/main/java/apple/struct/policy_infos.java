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
public final class policy_infos extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public policy_infos() {
        super(policy_infos.class);
    }

    @Generated
    protected policy_infos(Pointer peer) {
        super(peer);
    }

    @Generated
    public policy_infos(@ByValue policy_timeshare_info ts, @ByValue policy_rr_info rr, @ByValue policy_fifo_info fifo) {
        super(policy_infos.class);
        setTs(ts);
        setRr(rr);
        setFifo(fifo);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native policy_timeshare_info ts();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTs(@ByValue policy_timeshare_info value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native policy_rr_info rr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRr(@ByValue policy_rr_info value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native policy_fifo_info fifo();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFifo(@ByValue policy_fifo_info value);
}
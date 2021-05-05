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
public final class itimerval extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public itimerval() {
        super(itimerval.class);
    }

    @Generated
    protected itimerval(Pointer peer) {
        super(peer);
    }

    @Generated
    public itimerval(@ByValue timeval it_interval, @ByValue timeval it_value) {
        super(itimerval.class);
        setIt_interval(it_interval);
        setIt_value(it_value);
    }

    /**
     * timer interval
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native timeval it_interval();

    /**
     * timer interval
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIt_interval(@ByValue timeval value);

    /**
     * current value
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native timeval it_value();

    /**
     * current value
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIt_value(@ByValue timeval value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class timeval64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public timeval64() {
        super(timeval64.class);
    }

    @Generated
    protected timeval64(Pointer peer) {
        super(peer);
    }

    @Generated
    public timeval64(long tv_sec, long tv_usec) {
        super(timeval64.class);
        setTv_sec(tv_sec);
        setTv_usec(tv_usec);
    }

    /**
     * seconds
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long tv_sec();

    /**
     * seconds
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTv_sec(long value);

    /**
     * and microseconds
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long tv_usec();

    /**
     * and microseconds
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTv_usec(long value);
}
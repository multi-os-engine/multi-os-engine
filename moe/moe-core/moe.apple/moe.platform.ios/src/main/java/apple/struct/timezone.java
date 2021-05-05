package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class timezone extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public timezone() {
        super(timezone.class);
    }

    @Generated
    protected timezone(Pointer peer) {
        super(peer);
    }

    @Generated
    public timezone(int tz_minuteswest, int tz_dsttime) {
        super(timezone.class);
        setTz_minuteswest(tz_minuteswest);
        setTz_dsttime(tz_dsttime);
    }

    /**
     * minutes west of Greenwich
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int tz_minuteswest();

    /**
     * minutes west of Greenwich
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTz_minuteswest(int value);

    /**
     * type of dst correction
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int tz_dsttime();

    /**
     * type of dst correction
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTz_dsttime(int value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_qctrl extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_qctrl() {
        super(au_qctrl.class);
    }

    @Generated
    protected au_qctrl(Pointer peer) {
        super(peer);
    }

    /**
     * Max # of audit recs in queue when
     * threads with new ARs get blocked.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int aq_hiwater();

    /**
     * Max # of audit recs in queue when
     * threads with new ARs get blocked.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAq_hiwater(int value);

    /**
     * # of audit recs in queue when
     * blocked threads get unblocked.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int aq_lowater();

    /**
     * # of audit recs in queue when
     * blocked threads get unblocked.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAq_lowater(int value);

    /**
     * Max size of audit record for audit(2).
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int aq_bufsz();

    /**
     * Max size of audit record for audit(2).
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAq_bufsz(int value);

    /**
     * Queue delay (not used).
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int aq_delay();

    /**
     * Queue delay (not used).
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAq_delay(int value);

    /**
     * Minimum filesystem percent free space.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int aq_minfree();

    /**
     * Minimum filesystem percent free space.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAq_minfree(int value);
}
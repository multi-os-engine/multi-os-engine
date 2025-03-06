package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_statistics extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_statistics() {
        super(vm_statistics.class);
    }

    @Generated
    protected vm_statistics(Pointer peer) {
        super(peer);
    }

    /**
     * # of pages free
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int free_count();

    /**
     * # of pages free
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFree_count(int value);

    /**
     * # of pages active
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int active_count();

    /**
     * # of pages active
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setActive_count(int value);

    /**
     * # of pages inactive
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int inactive_count();

    /**
     * # of pages inactive
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInactive_count(int value);

    /**
     * # of pages wired down
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int wire_count();

    /**
     * # of pages wired down
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setWire_count(int value);

    /**
     * # of zero fill pages
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int zero_fill_count();

    /**
     * # of zero fill pages
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setZero_fill_count(int value);

    /**
     * # of pages reactivated
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int reactivations();

    /**
     * # of pages reactivated
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReactivations(int value);

    /**
     * # of pageins
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int pageins();

    /**
     * # of pageins
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setPageins(int value);

    /**
     * # of pageouts
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int pageouts();

    /**
     * # of pageouts
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setPageouts(int value);

    /**
     * # of faults
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int faults();

    /**
     * # of faults
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFaults(int value);

    /**
     * # of copy-on-writes
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int cow_faults();

    /**
     * # of copy-on-writes
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setCow_faults(int value);

    /**
     * object cache lookups
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int lookups();

    /**
     * object cache lookups
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setLookups(int value);

    /**
     * object cache hits
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int hits();

    /**
     * object cache hits
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setHits(int value);

    /**
     * # of pages purgeable
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int purgeable_count();

    /**
     * # of pages purgeable
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setPurgeable_count(int value);

    /**
     * # of pages purged
     */
    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int purges();

    /**
     * # of pages purged
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setPurges(int value);

    /**
     * # of pages speculative
     */
    @Generated
    @StructureField(order = 14, isGetter = true)
    public native int speculative_count();

    /**
     * # of pages speculative
     */
    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setSpeculative_count(int value);
}
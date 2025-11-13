package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_statistics64 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_statistics64() {
        super(vm_statistics64.class);
    }

    @Generated
    protected vm_statistics64(Pointer peer) {
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
    public native long zero_fill_count();

    /**
     * # of zero fill pages
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setZero_fill_count(long value);

    /**
     * # of pages reactivated
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long reactivations();

    /**
     * # of pages reactivated
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReactivations(long value);

    /**
     * # of pageins (lifetime)
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long pageins();

    /**
     * # of pageins (lifetime)
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setPageins(long value);

    /**
     * # of pageouts
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long pageouts();

    /**
     * # of pageouts
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setPageouts(long value);

    /**
     * # of faults
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long faults();

    /**
     * # of faults
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setFaults(long value);

    /**
     * # of copy-on-writes
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long cow_faults();

    /**
     * # of copy-on-writes
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setCow_faults(long value);

    /**
     * object cache lookups
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long lookups();

    /**
     * object cache lookups
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setLookups(long value);

    /**
     * object cache hits
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native long hits();

    /**
     * object cache hits
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setHits(long value);

    /**
     * # of pages purged
     */
    @Generated
    @StructureField(order = 12, isGetter = true)
    public native long purges();

    /**
     * # of pages purged
     */
    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setPurges(long value);

    /**
     * # of pages purgeable
     */
    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int purgeable_count();

    /**
     * # of pages purgeable
     */
    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setPurgeable_count(int value);

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

    /**
     * # of pages decompressed (lifetime)
     */
    @Generated
    @StructureField(order = 15, isGetter = true)
    public native long decompressions();

    /**
     * # of pages decompressed (lifetime)
     */
    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setDecompressions(long value);

    /**
     * # of pages compressed (lifetime)
     */
    @Generated
    @StructureField(order = 16, isGetter = true)
    public native long compressions();

    /**
     * # of pages compressed (lifetime)
     */
    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setCompressions(long value);

    /**
     * # of pages swapped in via compressor segments (lifetime)
     */
    @Generated
    @StructureField(order = 17, isGetter = true)
    public native long swapins();

    /**
     * # of pages swapped in via compressor segments (lifetime)
     */
    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setSwapins(long value);

    /**
     * # of pages swapped out via compressor segments (lifetime)
     */
    @Generated
    @StructureField(order = 18, isGetter = true)
    public native long swapouts();

    /**
     * # of pages swapped out via compressor segments (lifetime)
     */
    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setSwapouts(long value);

    /**
     * # of pages used by the compressed pager to hold all the compressed data
     */
    @Generated
    @StructureField(order = 19, isGetter = true)
    public native int compressor_page_count();

    /**
     * # of pages used by the compressed pager to hold all the compressed data
     */
    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setCompressor_page_count(int value);

    /**
     * # of pages throttled
     */
    @Generated
    @StructureField(order = 20, isGetter = true)
    public native int throttled_count();

    /**
     * # of pages throttled
     */
    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setThrottled_count(int value);

    /**
     * # of pages that are file-backed (non-swap)
     */
    @Generated
    @StructureField(order = 21, isGetter = true)
    public native int external_page_count();

    /**
     * # of pages that are file-backed (non-swap)
     */
    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setExternal_page_count(int value);

    /**
     * # of pages that are anonymous
     */
    @Generated
    @StructureField(order = 22, isGetter = true)
    public native int internal_page_count();

    /**
     * # of pages that are anonymous
     */
    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setInternal_page_count(int value);

    /**
     * # of pages (uncompressed) held within the compressor.
     */
    @Generated
    @StructureField(order = 23, isGetter = true)
    public native long total_uncompressed_pages_in_compressor();

    /**
     * # of pages (uncompressed) held within the compressor.
     */
    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setTotal_uncompressed_pages_in_compressor(long value);

    /**
     * # of compressor-stored pages currently stored in swap
     */
    @Generated
    @StructureField(order = 24, isGetter = true)
    public native long swapped_count();

    /**
     * # of compressor-stored pages currently stored in swap
     */
    @Generated
    @StructureField(order = 24, isGetter = false)
    public native void setSwapped_count(long value);
}
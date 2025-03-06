package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class task_vm_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_vm_info() {
        super(task_vm_info.class);
    }

    @Generated
    protected task_vm_info(Pointer peer) {
        super(peer);
    }

    /**
     * virtual memory size (bytes)
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long virtual_size();

    /**
     * virtual memory size (bytes)
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVirtual_size(@NUInt long value);

    /**
     * number of memory regions
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int region_count();

    /**
     * number of memory regions
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRegion_count(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int page_size();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPage_size(int value);

    /**
     * resident memory size (bytes)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long resident_size();

    /**
     * resident memory size (bytes)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setResident_size(@NUInt long value);

    /**
     * peak resident size (bytes)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long resident_size_peak();

    /**
     * peak resident size (bytes)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setResident_size_peak(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long device();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setDevice(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NUInt
    public native long device_peak();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setDevice_peak(@NUInt long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NUInt
    public native long internal();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setInternal(@NUInt long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @NUInt
    public native long internal_peak();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInternal_peak(@NUInt long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @NUInt
    public native long external();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setExternal(@NUInt long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @NUInt
    public native long external_peak();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setExternal_peak(@NUInt long value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @NUInt
    public native long reusable();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setReusable(@NUInt long value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    @NUInt
    public native long reusable_peak();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setReusable_peak(@NUInt long value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    @NUInt
    public native long purgeable_volatile_pmap();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setPurgeable_volatile_pmap(@NUInt long value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    @NUInt
    public native long purgeable_volatile_resident();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setPurgeable_volatile_resident(@NUInt long value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    @NUInt
    public native long purgeable_volatile_virtual();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setPurgeable_volatile_virtual(@NUInt long value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    @NUInt
    public native long compressed();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setCompressed(@NUInt long value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    @NUInt
    public native long compressed_peak();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setCompressed_peak(@NUInt long value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    @NUInt
    public native long compressed_lifetime();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setCompressed_lifetime(@NUInt long value);

    /**
     * added for rev1
     */
    @Generated
    @StructureField(order = 19, isGetter = true)
    @NUInt
    public native long phys_footprint();

    /**
     * added for rev1
     */
    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setPhys_footprint(@NUInt long value);

    /**
     * added for rev2
     */
    @Generated
    @StructureField(order = 20, isGetter = true)
    @NUInt
    public native long min_address();

    /**
     * added for rev2
     */
    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setMin_address(@NUInt long value);

    @Generated
    @StructureField(order = 21, isGetter = true)
    @NUInt
    public native long max_address();

    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setMax_address(@NUInt long value);

    /**
     * added for rev3
     */
    @Generated
    @StructureField(order = 22, isGetter = true)
    public native long ledger_phys_footprint_peak();

    /**
     * added for rev3
     */
    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setLedger_phys_footprint_peak(long value);

    @Generated
    @StructureField(order = 23, isGetter = true)
    public native long ledger_purgeable_nonvolatile();

    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setLedger_purgeable_nonvolatile(long value);

    @Generated
    @StructureField(order = 24, isGetter = true)
    public native long ledger_purgeable_novolatile_compressed();

    @Generated
    @StructureField(order = 24, isGetter = false)
    public native void setLedger_purgeable_novolatile_compressed(long value);

    @Generated
    @StructureField(order = 25, isGetter = true)
    public native long ledger_purgeable_volatile();

    @Generated
    @StructureField(order = 25, isGetter = false)
    public native void setLedger_purgeable_volatile(long value);

    @Generated
    @StructureField(order = 26, isGetter = true)
    public native long ledger_purgeable_volatile_compressed();

    @Generated
    @StructureField(order = 26, isGetter = false)
    public native void setLedger_purgeable_volatile_compressed(long value);

    @Generated
    @StructureField(order = 27, isGetter = true)
    public native long ledger_tag_network_nonvolatile();

    @Generated
    @StructureField(order = 27, isGetter = false)
    public native void setLedger_tag_network_nonvolatile(long value);

    @Generated
    @StructureField(order = 28, isGetter = true)
    public native long ledger_tag_network_nonvolatile_compressed();

    @Generated
    @StructureField(order = 28, isGetter = false)
    public native void setLedger_tag_network_nonvolatile_compressed(long value);

    @Generated
    @StructureField(order = 29, isGetter = true)
    public native long ledger_tag_network_volatile();

    @Generated
    @StructureField(order = 29, isGetter = false)
    public native void setLedger_tag_network_volatile(long value);

    @Generated
    @StructureField(order = 30, isGetter = true)
    public native long ledger_tag_network_volatile_compressed();

    @Generated
    @StructureField(order = 30, isGetter = false)
    public native void setLedger_tag_network_volatile_compressed(long value);

    @Generated
    @StructureField(order = 31, isGetter = true)
    public native long ledger_tag_media_footprint();

    @Generated
    @StructureField(order = 31, isGetter = false)
    public native void setLedger_tag_media_footprint(long value);

    @Generated
    @StructureField(order = 32, isGetter = true)
    public native long ledger_tag_media_footprint_compressed();

    @Generated
    @StructureField(order = 32, isGetter = false)
    public native void setLedger_tag_media_footprint_compressed(long value);

    @Generated
    @StructureField(order = 33, isGetter = true)
    public native long ledger_tag_media_nofootprint();

    @Generated
    @StructureField(order = 33, isGetter = false)
    public native void setLedger_tag_media_nofootprint(long value);

    @Generated
    @StructureField(order = 34, isGetter = true)
    public native long ledger_tag_media_nofootprint_compressed();

    @Generated
    @StructureField(order = 34, isGetter = false)
    public native void setLedger_tag_media_nofootprint_compressed(long value);

    @Generated
    @StructureField(order = 35, isGetter = true)
    public native long ledger_tag_graphics_footprint();

    @Generated
    @StructureField(order = 35, isGetter = false)
    public native void setLedger_tag_graphics_footprint(long value);

    @Generated
    @StructureField(order = 36, isGetter = true)
    public native long ledger_tag_graphics_footprint_compressed();

    @Generated
    @StructureField(order = 36, isGetter = false)
    public native void setLedger_tag_graphics_footprint_compressed(long value);

    @Generated
    @StructureField(order = 37, isGetter = true)
    public native long ledger_tag_graphics_nofootprint();

    @Generated
    @StructureField(order = 37, isGetter = false)
    public native void setLedger_tag_graphics_nofootprint(long value);

    @Generated
    @StructureField(order = 38, isGetter = true)
    public native long ledger_tag_graphics_nofootprint_compressed();

    @Generated
    @StructureField(order = 38, isGetter = false)
    public native void setLedger_tag_graphics_nofootprint_compressed(long value);

    @Generated
    @StructureField(order = 39, isGetter = true)
    public native long ledger_tag_neural_footprint();

    @Generated
    @StructureField(order = 39, isGetter = false)
    public native void setLedger_tag_neural_footprint(long value);

    @Generated
    @StructureField(order = 40, isGetter = true)
    public native long ledger_tag_neural_footprint_compressed();

    @Generated
    @StructureField(order = 40, isGetter = false)
    public native void setLedger_tag_neural_footprint_compressed(long value);

    @Generated
    @StructureField(order = 41, isGetter = true)
    public native long ledger_tag_neural_nofootprint();

    @Generated
    @StructureField(order = 41, isGetter = false)
    public native void setLedger_tag_neural_nofootprint(long value);

    @Generated
    @StructureField(order = 42, isGetter = true)
    public native long ledger_tag_neural_nofootprint_compressed();

    @Generated
    @StructureField(order = 42, isGetter = false)
    public native void setLedger_tag_neural_nofootprint_compressed(long value);

    /**
     * added for rev4
     */
    @Generated
    @StructureField(order = 43, isGetter = true)
    public native long limit_bytes_remaining();

    /**
     * added for rev4
     */
    @Generated
    @StructureField(order = 43, isGetter = false)
    public native void setLimit_bytes_remaining(long value);

    /**
     * added for rev5
     */
    @Generated
    @StructureField(order = 44, isGetter = true)
    public native int decompressions();

    /**
     * added for rev5
     */
    @Generated
    @StructureField(order = 44, isGetter = false)
    public native void setDecompressions(int value);

    /**
     * added for rev6
     */
    @Generated
    @StructureField(order = 45, isGetter = true)
    public native long ledger_swapins();

    /**
     * added for rev6
     */
    @Generated
    @StructureField(order = 45, isGetter = false)
    public native void setLedger_swapins(long value);

    /**
     * added for rev7
     */
    @Generated
    @StructureField(order = 46, isGetter = true)
    public native long ledger_tag_neural_nofootprint_total();

    /**
     * added for rev7
     */
    @Generated
    @StructureField(order = 46, isGetter = false)
    public native void setLedger_tag_neural_nofootprint_total(long value);

    @Generated
    @StructureField(order = 47, isGetter = true)
    public native long ledger_tag_neural_nofootprint_peak();

    @Generated
    @StructureField(order = 47, isGetter = false)
    public native void setLedger_tag_neural_nofootprint_peak(long value);
}
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
public final class io_stat_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public io_stat_info() {
        super(io_stat_info.class);
    }

    @Generated
    protected io_stat_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native io_stat_entry disk_reads();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDisk_reads(@ByValue io_stat_entry value);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 4)
    @ByValue
    public native io_stat_entry io_priority(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 4)
    public native void setIo_priority(@ByValue io_stat_entry value, int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native io_stat_entry paging();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPaging(@ByValue io_stat_entry value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native io_stat_entry metadata();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMetadata(@ByValue io_stat_entry value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native io_stat_entry total_io();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTotal_io(@ByValue io_stat_entry value);
}
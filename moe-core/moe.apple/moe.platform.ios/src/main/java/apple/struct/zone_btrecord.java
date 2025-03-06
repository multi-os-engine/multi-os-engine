package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class zone_btrecord extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public zone_btrecord() {
        super(zone_btrecord.class);
    }

    @Generated
    protected zone_btrecord(Pointer peer) {
        super(peer);
    }

    /**
     * no. of active references on the record
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int ref_count();

    /**
     * no. of active references on the record
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRef_count(int value);

    /**
     * operation type (alloc/free)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int operation_type();

    /**
     * operation type (alloc/free)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOperation_type(int value);

    /**
     * backtrace
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 15)
    public native long bt(int field_idx);

    /**
     * backtrace
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 15)
    public native void setBt(long value, int field_idx);
}
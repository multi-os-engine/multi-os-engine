package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class BNNSNDArrayDescriptor extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSNDArrayDescriptor() {
        super(BNNSNDArrayDescriptor.class);
    }

    @Generated
    protected BNNSNDArrayDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int layout();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLayout(int value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 8)
    public native long size(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 8)
    public native void setSize(long value, int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 8)
    public native long stride(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 8)
    public native void setStride(long value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native VoidPtr data();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setData(VoidPtr value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int data_type();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setData_type(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native VoidPtr table_data();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setTable_data(VoidPtr value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int table_data_type();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setTable_data_type(int value);

    /**
     * 0.0f value will be set to 1.0f during computation
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native float data_scale();

    /**
     * 0.0f value will be set to 1.0f during computation
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setData_scale(float value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native float data_bias();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setData_bias(float value);
}
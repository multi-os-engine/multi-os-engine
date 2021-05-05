package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class BNNSLayerParametersConvolution extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersConvolution() {
        super(BNNSLayerParametersConvolution.class);
    }

    @Generated
    protected BNNSLayerParametersConvolution(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor w_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setW_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor bias();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBias(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long x_stride();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setX_stride(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NUInt
    public native long y_stride();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setY_stride(@NUInt long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NUInt
    public native long x_dilation_stride();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setX_dilation_stride(@NUInt long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @NUInt
    public native long y_dilation_stride();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setY_dilation_stride(@NUInt long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @NUInt
    public native long x_padding();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setX_padding(@NUInt long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @NUInt
    public native long y_padding();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setY_padding(@NUInt long value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    @NUInt
    public native long groups();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setGroups(@NUInt long value);

    @Generated
    @StructureField(order = 12, isGetter = true, count = 4)
    public native long pad(int field_idx);

    @Generated
    @StructureField(order = 12, isGetter = false, count = 4)
    public native void setPad(long value, int field_idx);
}
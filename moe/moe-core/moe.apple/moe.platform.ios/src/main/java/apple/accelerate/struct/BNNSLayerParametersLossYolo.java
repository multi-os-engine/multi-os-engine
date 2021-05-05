package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.FloatPtr;

@Generated
@Structure()
public final class BNNSLayerParametersLossYolo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersLossYolo() {
        super(BNNSLayerParametersLossYolo.class);
    }

    @Generated
    protected BNNSLayerParametersLossYolo(Pointer peer) {
        super(peer);
    }

    /**
     * Fields layout compatible with BNNSLayerParametersLoseBase
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int function();

    /**
     * Fields layout compatible with BNNSLayerParametersLoseBase
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFunction(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int reduction();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReduction(int value);

    /**
     * Fields specific to YoLo Loss
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float huber_delta();

    /**
     * Fields specific to YoLo Loss
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setHuber_delta(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long number_of_grid_columns();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setNumber_of_grid_columns(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NUInt
    public native long number_of_grid_rows();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setNumber_of_grid_rows(@NUInt long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NUInt
    public native long number_of_anchor_boxes();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNumber_of_anchor_boxes(@NUInt long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @NUInt
    public native long anchor_box_size();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setAnchor_box_size(@NUInt long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native boolean rescore();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setRescore(boolean value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float scale_xy();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setScale_xy(float value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native float scale_wh();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setScale_wh(float value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native float scale_object();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setScale_object(float value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native float scale_no_object();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setScale_no_object(float value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native float scale_classification();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setScale_classification(float value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native float object_minimum_iou();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setObject_minimum_iou(float value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native float no_object_maximum_iou();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setNo_object_maximum_iou(float value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native FloatPtr anchors_data();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setAnchors_data(FloatPtr value);
}
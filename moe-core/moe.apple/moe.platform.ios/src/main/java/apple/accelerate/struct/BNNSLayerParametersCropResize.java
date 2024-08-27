package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSLayerParametersCropResize extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public BNNSLayerParametersCropResize() {
        super(BNNSLayerParametersCropResize.class);
    }

    @Generated
    protected BNNSLayerParametersCropResize(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native boolean normalized_coordinates();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNormalized_coordinates(boolean value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float spatial_scale();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSpatial_scale(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float extrapolation_value();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setExtrapolation_value(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int sampling_mode();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSampling_mode(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int box_coordinate_mode();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBox_coordinate_mode(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int method();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMethod(int value);
}
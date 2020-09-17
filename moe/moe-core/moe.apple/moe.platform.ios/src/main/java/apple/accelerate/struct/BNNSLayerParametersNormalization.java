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
public final class BNNSLayerParametersNormalization extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersNormalization() {
        super(BNNSLayerParametersNormalization.class);
    }

    @Generated
    protected BNNSLayerParametersNormalization(Pointer peer) {
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
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor beta_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBeta_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor gamma_desc();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setGamma_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor moving_mean_desc();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMoving_mean_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor moving_variance_desc();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMoving_variance_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float momentum();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMomentum(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native float epsilon();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setEpsilon(float value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @NUInt
    public native long num_groups();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setNum_groups(@NUInt long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @NUInt
    public native long normalization_axis();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setNormalization_axis(@NUInt long value);
}
package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSOptimizerSGDMomentumFields extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSOptimizerSGDMomentumFields() {
        super(BNNSOptimizerSGDMomentumFields.class);
    }

    @Generated
    protected BNNSOptimizerSGDMomentumFields(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float learning_rate();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLearning_rate(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float momentum();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMomentum(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float gradient_scale();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGradient_scale(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float regularization_scale();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRegularization_scale(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native boolean clip_gradients();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setClip_gradients(boolean value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float clip_gradients_min();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setClip_gradients_min(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float clip_gradients_max();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setClip_gradients_max(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native boolean nesterov();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNesterov(boolean value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int regularization_func();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setRegularization_func(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int sgd_momentum_variant();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setSgd_momentum_variant(int value);
}
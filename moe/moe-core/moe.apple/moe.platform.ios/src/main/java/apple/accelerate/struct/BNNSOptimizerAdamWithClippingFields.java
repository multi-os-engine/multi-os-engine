package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSOptimizerAdamWithClippingFields extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSOptimizerAdamWithClippingFields() {
        super(BNNSOptimizerAdamWithClippingFields.class);
    }

    @Generated
    protected BNNSOptimizerAdamWithClippingFields(Pointer peer) {
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
    public native float beta1();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBeta1(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float beta2();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBeta2(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float time_step();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTime_step(float value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float epsilon();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setEpsilon(float value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native float gradient_scale();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setGradient_scale(float value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float regularization_scale();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRegularization_scale(float value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int regularization_func();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setRegularization_func(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int clipping_func();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setClipping_func(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native float clip_gradients_min();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setClip_gradients_min(float value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float clip_gradients_max();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setClip_gradients_max(float value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native float clip_gradients_max_norm();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setClip_gradients_max_norm(float value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native float clip_gradients_use_norm();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setClip_gradients_use_norm(float value);
}

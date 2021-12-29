package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSRNNDescriptor
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSRNNDescriptor specifies a Recursive neural network block/layer descriptor.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRNNDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSRNNDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNDescriptor init();

    /**
     * [@property]   inputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the input image or number of rows in the input matrix.
     */
    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]   layerSequenceDirection
     * <p>
     * When the layer specified with this descriptor is used to process a sequence of inputs
     * by calling @see encodeBidirectionalSequenceToCommandBuffer then this parameter defines
     * in which direction the sequence is processed. The operation of the layer is:
     * (yt, ht, ct) = f(xt,ht-1,ct-1) for MPSRNNSequenceDirectionForward
     * and
     * (yt, ht, ct) = f(xt,ht+1,ct+1) for MPSRNNSequenceDirectionBackward, where
     * xt is the output of the previous layer that encodes in the same direction as this layer,
     * (or the input image or matrix if this is the first layer in stack with this direction).
     *
     * @see MPSRNNImageInferenceLayer and @see MPSRNNMatrixInferenceLayer.
     */
    @Generated
    @Selector("layerSequenceDirection")
    @NUInt
    public native long layerSequenceDirection();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSRNNDescriptor new_objc();

    /**
     * [@property]   outputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the destination image or number of rows in the destination matrix.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   inputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the input image or number of rows in the input matrix.
     */
    @Generated
    @Selector("setInputFeatureChannels:")
    public native void setInputFeatureChannels(@NUInt long value);

    /**
     * [@property]   layerSequenceDirection
     * <p>
     * When the layer specified with this descriptor is used to process a sequence of inputs
     * by calling @see encodeBidirectionalSequenceToCommandBuffer then this parameter defines
     * in which direction the sequence is processed. The operation of the layer is:
     * (yt, ht, ct) = f(xt,ht-1,ct-1) for MPSRNNSequenceDirectionForward
     * and
     * (yt, ht, ct) = f(xt,ht+1,ct+1) for MPSRNNSequenceDirectionBackward, where
     * xt is the output of the previous layer that encodes in the same direction as this layer,
     * (or the input image or matrix if this is the first layer in stack with this direction).
     *
     * @see MPSRNNImageInferenceLayer and @see MPSRNNMatrixInferenceLayer.
     */
    @Generated
    @Selector("setLayerSequenceDirection:")
    public native void setLayerSequenceDirection(@NUInt long value);

    /**
     * [@property]   outputFeatureChannels
     * <p>
     * The number of feature channels per pixel in the destination image or number of rows in the destination matrix.
     */
    @Generated
    @Selector("setOutputFeatureChannels:")
    public native void setOutputFeatureChannels(@NUInt long value);

    /**
     * [@property]   useFloat32Weights
     * <p>
     * If YES, then @ref MPSRNNMatrixInferenceLayer uses 32-bit floating point numbers internally for weights when
     * computing matrix transformations. If NO, then 16-bit, half precision floating point numbers are used.
     * Currently @ref MPSRNNImageInferenceLayer ignores this property and the convolution operations always
     * convert FP32 weights into FP16 for better performance.
     * Defaults to NO.
     */
    @Generated
    @Selector("setUseFloat32Weights:")
    public native void setUseFloat32Weights(boolean value);

    /**
     * [@property]   useLayerInputUnitTransformMode
     * <p>
     * if YES then use identity transformation for all weights (W, Wr, Wi, Wf, Wo, Wc) affecting input x_j in this layer,
     * even if said weights are specified as nil.
     * For example 'W_ij * x_j' is replaced by 'x_j' in formulae defined in @ref MPSRNNSingleGateDescriptor. Defaults to NO.
     */
    @Generated
    @Selector("setUseLayerInputUnitTransformMode:")
    public native void setUseLayerInputUnitTransformMode(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]   useFloat32Weights
     * <p>
     * If YES, then @ref MPSRNNMatrixInferenceLayer uses 32-bit floating point numbers internally for weights when
     * computing matrix transformations. If NO, then 16-bit, half precision floating point numbers are used.
     * Currently @ref MPSRNNImageInferenceLayer ignores this property and the convolution operations always
     * convert FP32 weights into FP16 for better performance.
     * Defaults to NO.
     */
    @Generated
    @Selector("useFloat32Weights")
    public native boolean useFloat32Weights();

    /**
     * [@property]   useLayerInputUnitTransformMode
     * <p>
     * if YES then use identity transformation for all weights (W, Wr, Wi, Wf, Wo, Wc) affecting input x_j in this layer,
     * even if said weights are specified as nil.
     * For example 'W_ij * x_j' is replaced by 'x_j' in formulae defined in @ref MPSRNNSingleGateDescriptor. Defaults to NO.
     */
    @Generated
    @Selector("useLayerInputUnitTransformMode")
    public native boolean useLayerInputUnitTransformMode();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

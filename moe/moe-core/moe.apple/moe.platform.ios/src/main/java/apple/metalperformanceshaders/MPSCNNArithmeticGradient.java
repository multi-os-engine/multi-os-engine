package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNArithmeticGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNArithmeticGradient filter is the backward filter for the MPSCNNArithmetic
 * forward filter.
 * <p>
 * The forward filter takes two inputs, primary and secondary source images, and produces
 * a single output image. Thus, going backwards requires two separate filters (one for
 * the primary source image and one for the secondary source image) that take multiple
 * inputs and produce a single output. The secondarySourceFilter property is used to
 * indicate whether the filter is operating on the primary or secondary source image from
 * the forward pass.
 * <p>
 * All the arithmetic gradient filters require the following inputs: gradient image from
 * the previous layer (going backwards) and all the applicable input source images from
 * the forward pass.
 * <p>
 * The forward filter takes the following additional parameters:
 * - primaryStrideInPixelsX, primaryStrideInPixelsY, primaryStrideInFeatureChannels
 * - secondaryStrideInPixelsX, secondaryStrideInPixelsY, secondaryStrideInFeatureChannels
 * These parameters can be used in the forward filter to control broadcasting for the data
 * stored in the primary and secondary source images. For example, setting all strides for
 * the primary source image to 0 will result in the primarySource image being treated as a
 * single pixel. The only supported values are 0 or 1. The default value of these parameters
 * is 1.
 * <p>
 * The first input to the backward filter is the gradient image from the previous layer
 * (going backwards), so there are no broadcasting parameters for this input. For the
 * backward filter, the broadcasting parameters for the second input must match the
 * broadcasting parameters set for the same image in the forward filter.
 * <p>
 * In the backward pass, broadcasting results in a reduction operation (sum) across all of the
 * applicable broadcasting dimensions (rows, columns, feature channels, or any combination
 * thereof) to produce the destination image of the size that matches the primary/secondary
 * input images used in the forward pass.
 * <p>
 * In the case of no broadcasting, the following arithmetic gradient operations are copy
 * operations (that can be optimized away by the graph interface):
 * - Add (primarySource, secondarySource)
 * - Subtract (primarySource)
 * <p>
 * Similarly to the forward filter, this backward filter takes additional parameters:
 * primaryScale, secondaryScale, and bias. The default value for primaryScale and secondaryScale
 * is 1.0f. The default value for bias is 0.0f. This filter applies primaryScale to the primary
 * source image, applies the secondaryScale to the secondary source image, where appropriate,
 * and applies bias to the result, i.e.:
 * result = ((primaryScale * x) [insert operation] (secondaryScale * y)) + bias.
 * <p>
 * The subtraction gradient filter for the secondary source image requires that the primaryScale
 * property is set to -1.0f (for x - y, d/dy(x - y) = -1).
 * <p>
 * In the forward filter, there is support for clamping the result of the available operations,
 * where result = clamp(result, minimumValue, maximumValue). The clamp backward operation is
 * not supported in the arithmetic gradient filters. If you require this functionality, it can
 * be implemented by performing a clamp backward operation before calling the arithmetic gradient
 * filters. You would need to apply the following function on the incomping gradient input image:
 * f(x) = ((minimumValue < x) && (x < maximumValue)) ? 1 : 0, where x is the original result
 * (before clamping) of the forward arithmetic filter.
 * <p>
 * The number of output feature channels remains the same as the number of input feature
 * channels.
 * <p>
 * You must use one of the sub-classes of MPSImageArithmeticGradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNArithmeticGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNArithmeticGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNArithmeticGradient alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNArithmeticGradient allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * bias is ignored in the backward pass
     */
    @Generated
    @Selector("bias")
    public native float bias();

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
    public native MPSCNNArithmeticGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNArithmeticGradient initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNArithmeticGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNArithmeticGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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

    /**
     * [@property]   isSecondarySourceFilter
     * <p>
     * The isSecondarySourceFilter property is used to indicate whether the arithmetic gradient
     * filter is operating on the primary or secondary source image from the forward pass.
     */
    @Generated
    @Selector("isSecondarySourceFilter")
    public native boolean isSecondarySourceFilter();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]   maximumValue
     * <p>
     * maximumValue is used to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("maximumValue")
    public native float maximumValue();

    /**
     * [@property]   minimumValue
     * <p>
     * minimumValue is to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of minimumValue is -FLT_MAX.
     */
    @Generated
    @Selector("minimumValue")
    public native float minimumValue();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNArithmeticGradient new_objc();

    @Generated
    @Selector("primaryScale")
    public native float primaryScale();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondaryScale")
    public native float secondaryScale();

    /**
     * [@property]   secondaryStrideInPixels
     * <p>
     * The secondarySource stride in the feature channel dimension. The only supported values are 0 or 1.
     * The default value for each dimension is 1.
     */
    @Generated
    @Selector("secondaryStrideInFeatureChannels")
    @NUInt
    public native long secondaryStrideInFeatureChannels();

    /**
     * bias is ignored in the backward pass
     */
    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    /**
     * [@property]   maximumValue
     * <p>
     * maximumValue is used to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("setMaximumValue:")
    public native void setMaximumValue(float value);

    /**
     * [@property]   minimumValue
     * <p>
     * minimumValue is to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of minimumValue is -FLT_MAX.
     */
    @Generated
    @Selector("setMinimumValue:")
    public native void setMinimumValue(float value);

    @Generated
    @Selector("setPrimaryScale:")
    public native void setPrimaryScale(float value);

    @Generated
    @Selector("setSecondaryScale:")
    public native void setSecondaryScale(float value);

    /**
     * [@property]   secondaryStrideInPixels
     * <p>
     * The secondarySource stride in the feature channel dimension. The only supported values are 0 or 1.
     * The default value for each dimension is 1.
     */
    @Generated
    @Selector("setSecondaryStrideInFeatureChannels:")
    public native void setSecondaryStrideInFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNArithmetic
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSCNNArithmetic filter takes two source images, a primary source image and a
 * secondary source image, and outputs a single destination image. It applies an
 * element-wise arithmetic operator to each pixel in a primary source image and a
 * corresponding pixel in a secondary source image over a specified region.
 * 
 * The supported arithmetic operators are the following:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 * - Comparison
 * 
 * This filter takes additional parameters: primaryScale, secondaryScale, and bias. The default
 * value for primaryScale and secondaryScale is 1.0f. The default value for bias is 0.0f. This
 * filter applies primaryScale, secondaryScale, and bias to the primary source pixel (x) and
 * secondary source pixel (y) in the following way:
 * - Addition: result = ((primaryScale * x) + (secondaryScale * y)) + bias
 * - Subtraction: result = ((primaryScale * x) - (secondaryScale * y)) + bias
 * - Multiplicaton: result = ((primaryScale * x) * (secondaryScale * y)) + bias
 * - Division: result = ((primaryScale * x) / (secondaryScale * y)) + bias
 * - Comparison: Unused.
 * 
 * To clamp the result of an arithmetic operation, where
 * result = clamp(result, minimumValue, maximumValue),
 * set the minimumValue and maximumValue appropriately. The default value of minimumValue
 * is -FLT_MAX. The default value of maximumValue is FLT_MAX.
 * 
 * This filter also takes the following additional parameters:
 * - primaryStrideInPixelsX, primaryStrideInPixelsY, primaryStrideInFeatureChannels
 * - secondaryStrideInPixelsX, secondaryStrideInPixelsY, secondaryStrideInFeatureChannels
 * These parameters can be used to control broadcasting for the data stored in the primary and
 * secondary source images. For example, setting all strides for the primary source image to 0
 * will result in the primarySource image being treated as a scalar value. The only supported
 * values are 0 or 1. The default value of these parameters is 1.
 * 
 * The number of output feature channels remains the same as the number of input feature
 * channels.
 * 
 * You must use one of the sub-classes of MPSImageArithmetic.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNArithmetic extends MPSCNNBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNArithmetic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNArithmetic alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNArithmetic allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("bias")
    public native float bias();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode call that operates on a state for later consumption by a gradient kernel in training
     * 
     * This is the older style of encode which reads the offset, doesn't change it,
     * and ignores the padding method.
     * 
     * @param commandBuffer    The command buffer
     * @param primaryImage     A MPSImage to use as the source images for the filter.
     * @param secondaryImage   A MPSImage to use as the source images for the filter.
     * @param destinationState MPSCNNArithmeticGradientState to be consumed by the gradient layer
     * @param destinationImage A valid MPSImage to be overwritten by result image. destinationImage
     *                         may not alias primarySourceImage or secondarySourceImage.
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:destinationState:destinationImage:")
    public native void encodeToCommandBufferPrimaryImageSecondaryImageDestinationStateDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage primaryImage,
            @NotNull MPSImage secondaryImage, @NotNull MPSCNNArithmeticGradientState destinationState,
            @NotNull MPSImage destinationImage);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNArithmetic init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNArithmetic initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNArithmetic initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNArithmetic initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] maximumValue
     * 
     * maximumValue is used to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("maximumValue")
    public native float maximumValue();

    /**
     * [@property] minimumValue
     * 
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
    public static native MPSCNNArithmetic new_objc();

    @Generated
    @Selector("primaryScale")
    public native float primaryScale();

    /**
     * [@property] primaryStrideInPixels
     * 
     * The primarySource stride in the feature channel dimension. The only supported values are 0 or 1.
     * The default value for each dimension is 1.
     */
    @Generated
    @Selector("primaryStrideInFeatureChannels")
    @NUInt
    public native long primaryStrideInFeatureChannels();

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
     * [@property] secondaryStrideInPixels
     * 
     * The secondarySource stride in the feature channel dimension. The only supported values are 0 or 1.
     * The default value for each dimension is 1.
     */
    @Generated
    @Selector("secondaryStrideInFeatureChannels")
    @NUInt
    public native long secondaryStrideInFeatureChannels();

    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    /**
     * [@property] maximumValue
     * 
     * maximumValue is used to clamp the result of an arithmetic operation:
     * result = clamp(result, minimumValue, maximumValue).
     * The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("setMaximumValue:")
    public native void setMaximumValue(float value);

    /**
     * [@property] minimumValue
     * 
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

    /**
     * [@property] primaryStrideInPixels
     * 
     * The primarySource stride in the feature channel dimension. The only supported values are 0 or 1.
     * The default value for each dimension is 1.
     */
    @Generated
    @Selector("setPrimaryStrideInFeatureChannels:")
    public native void setPrimaryStrideInFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setSecondaryScale:")
    public native void setSecondaryScale(float value);

    /**
     * [@property] secondaryStrideInPixels
     * 
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

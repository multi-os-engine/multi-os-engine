package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class defines parameters for a 3d depthwise convolution operation.
 * 
 * A `MPSGraphDepthwiseConvolution3DOpDescriptor` defines constant parameters for 3d depthwise convolutions.
 * Use this class with ``MPSGraph/depthwiseConvolution3DWithSourceTensor:weightsTensor:descriptor:name:``,
 * ``MPSGraph/depthwiseConvolution3DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:descriptor:name:``
 * and
 * ``MPSGraph/depthwiseConvolution3DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:descriptor:name:``
 * methods.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphDepthwiseConvolution3DOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphDepthwiseConvolution3DOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * The axis that contains the channels in the input and the weights, within
     * the 4d tile of the last dimensions.
     * 
     * For example the value of `-1` corresponds to `NDHWC`, `NHWC` layouts. This allows the placement
     * of the channel index anywhere within the last 4 dimensions of the tensor. In case your
     * weights are in a different layout you can bring them to the same layout
     * as inputs using transposes or permutations.
     * Default value: `-4`, corresponds to `NCDHW` and `CDHW` layouts.
     */
    @Generated
    @Selector("channelDimensionIndex")
    @NInt
    public native long channelDimensionIndex();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a 3d depthwise convolution descriptor with default values.
     * 
     * - Parameters:
     * - paddingStyle: See `paddingStyle` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithPaddingStyle:")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor descriptorWithPaddingStyle(
            @NUInt long paddingStyle);

    /**
     * Creates a 3d depthwise convolution descriptor with given values.
     * 
     * - Parameters:
     * - strides: See `strides` property.
     * - dilationRates: See `dilationRates` property.
     * - paddingValues: See `paddingValues` property.
     * - paddingStyle: See `paddingStyle` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithStrides:dilationRates:paddingValues:paddingStyle:")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor descriptorWithStridesDilationRatesPaddingValuesPaddingStyle(
            @NotNull NSArray<? extends NSNumber> strides, @NotNull NSArray<? extends NSNumber> dilationRates,
            @NotNull NSArray<? extends NSNumber> paddingValues, @NUInt long paddingStyle);

    /**
     * The dilation rates for spatial dimensions.
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: `@[ @1, @1, @1 ]`
     */
    @NotNull
    @Generated
    @Selector("dilationRates")
    public native NSArray<? extends NSNumber> dilationRates();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphDepthwiseConvolution3DOpDescriptor init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor new_objc();

    /**
     * The padding style for the operation. Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * The padding values for spatial dimensions.
     * 
     * Must be six numbers, two for each spatial dimension.
     * For example `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Use only with `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: `@[ @0, @0, @0, @0, @0, @0 ]`
     */
    @NotNull
    @Generated
    @Selector("paddingValues")
    public native NSArray<? extends NSNumber> paddingValues();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The axis that contains the channels in the input and the weights, within
     * the 4d tile of the last dimensions.
     * 
     * For example the value of `-1` corresponds to `NDHWC`, `NHWC` layouts. This allows the placement
     * of the channel index anywhere within the last 4 dimensions of the tensor. In case your
     * weights are in a different layout you can bring them to the same layout
     * as inputs using transposes or permutations.
     * Default value: `-4`, corresponds to `NCDHW` and `CDHW` layouts.
     */
    @Generated
    @Selector("setChannelDimensionIndex:")
    public native void setChannelDimensionIndex(@NInt long value);

    /**
     * The dilation rates for spatial dimensions.
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: `@[ @1, @1, @1 ]`
     */
    @Generated
    @Selector("setDilationRates:")
    public native void setDilationRates(@NotNull NSArray<? extends NSNumber> value);

    /**
     * The padding style for the operation. Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * The padding values for spatial dimensions.
     * 
     * Must be six numbers, two for each spatial dimension.
     * For example `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Use only with `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: `@[ @0, @0, @0, @0, @0, @0 ]`
     */
    @Generated
    @Selector("setPaddingValues:")
    public native void setPaddingValues(@NotNull NSArray<? extends NSNumber> value);

    /**
     * The strides for spatial dimensions.
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: `@[ @1, @1, @1 ]`
     */
    @Generated
    @Selector("setStrides:")
    public native void setStrides(@NotNull NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The strides for spatial dimensions.
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: `@[ @1, @1, @1 ]`
     */
    @NotNull
    @Generated
    @Selector("strides")
    public native NSArray<? extends NSNumber> strides();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

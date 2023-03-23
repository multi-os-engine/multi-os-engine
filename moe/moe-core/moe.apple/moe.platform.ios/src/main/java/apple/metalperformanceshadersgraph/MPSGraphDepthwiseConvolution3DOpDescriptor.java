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

/**
 * MPSGraphDepthwiseConvolution3DOpDescriptor
 * 
 * Defines a 3d depthwise convolution operation
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphDepthwiseConvolution3DOpDescriptor extends NSObject implements NSCopying {
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * [@property] channelDimensionIndex
     * 
     * Defines which axis contains the channels in the input and the weights, within
     * the 4d tile of the last dimensions. For example the value of @code -1 @endcode
     * corresponds to @code NDHWC, NHWC @endcode layouts. This allows the placement
     * of the channel index anywhere within the last 4 dimensions of the tensor. In case the
     * weights are in a different layout it is recommended to bring them to the same layout
     * as inputs using transposes or permutations.
     * Default value: @code -4 @endcode, corresponds to @code NCDHW @endcode
     * and @code CDHW @endcode layouts.
     */
    @Generated
    @Selector("channelDimensionIndex")
    @NInt
    public native long channelDimensionIndex();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a 3d depthwise convolution descriptor with default values.
     * 
     * @param paddingStyle See corresponding property above.
     * @return The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithPaddingStyle:")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor descriptorWithPaddingStyle(
            @NUInt long paddingStyle);

    /**
     * Creates a 3d depthwise convolution descriptor with given values.
     * 
     * @param strides       See corresponding property above.
     * @param dilationRates See corresponding property above.
     * @param paddingValues See corresponding property above.
     * @param paddingStyle  See corresponding property above.
     * @return The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithStrides:dilationRates:paddingValues:paddingStyle:")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor descriptorWithStridesDilationRatesPaddingValuesPaddingStyle(
            NSArray<? extends NSNumber> strides, NSArray<? extends NSNumber> dilationRates,
            NSArray<? extends NSNumber> paddingValues, @NUInt long paddingStyle);

    /**
     * [@property] dilationRates
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1 ] @endcode
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphDepthwiseConvolution3DOpDescriptor new_objc();

    /**
     * [@property] paddingStyle
     * 
     * Defines what kind of padding to apply to operation.
     * Default value: @code MPSGraphPaddingStyleExplicit @endcode
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * [@property] paddingValues
     * 
     * Must be six numbers, two for each spatial dimension. `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: @code @[ @0, @0, @0, @0, @0, @0 ] @endcode
     */
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
     * [@property] channelDimensionIndex
     * 
     * Defines which axis contains the channels in the input and the weights, within
     * the 4d tile of the last dimensions. For example the value of @code -1 @endcode
     * corresponds to @code NDHWC, NHWC @endcode layouts. This allows the placement
     * of the channel index anywhere within the last 4 dimensions of the tensor. In case the
     * weights are in a different layout it is recommended to bring them to the same layout
     * as inputs using transposes or permutations.
     * Default value: @code -4 @endcode, corresponds to @code NCDHW @endcode
     * and @code CDHW @endcode layouts.
     */
    @Generated
    @Selector("setChannelDimensionIndex:")
    public native void setChannelDimensionIndex(@NInt long value);

    /**
     * [@property] dilationRates
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1 ] @endcode
     */
    @Generated
    @Selector("setDilationRates:")
    public native void setDilationRates(NSArray<? extends NSNumber> value);

    /**
     * [@property] paddingStyle
     * 
     * Defines what kind of padding to apply to operation.
     * Default value: @code MPSGraphPaddingStyleExplicit @endcode
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * [@property] paddingValues
     * 
     * Must be six numbers, two for each spatial dimension. `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: @code @[ @0, @0, @0, @0, @0, @0 ] @endcode
     */
    @Generated
    @Selector("setPaddingValues:")
    public native void setPaddingValues(NSArray<? extends NSNumber> value);

    /**
     * [@property] strides
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1 ] @endcode
     */
    @Generated
    @Selector("setStrides:")
    public native void setStrides(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] strides
     * 
     * Must be three numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1 ] @endcode
     */
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
}

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
 * MPSGraphPooling4DOpDescriptor
 * <p>
 * Defines a 4d pooling operation
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphPooling4DOpDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphPooling4DOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphPooling4DOpDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphPooling4DOpDescriptor allocWithZone(VoidPtr zone);

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
     * [@property]   ceilMode
     * <p>
     * If set then the output size is computed by rounding up instead of down when
     * dividing by stride.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("ceilMode")
    public native boolean ceilMode();

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
     * Creates a 4d pooling descriptor with default values.
     *
     * @param kernelSizes  See corresponding property above.
     * @param paddingStyle See corresponding property above.
     * @return The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:paddingStyle:")
    public static native MPSGraphPooling4DOpDescriptor descriptorWithKernelSizesPaddingStyle(
            NSArray<? extends NSNumber> kernelSizes, @NUInt long paddingStyle);

    /**
     * Creates a 4d pooling descriptor with given values.
     *
     * @param kernelSizes   See corresponding property above.
     * @param strides       See corresponding property above.
     * @param dilationRates See corresponding property above.
     * @param paddingValues See corresponding property above.
     * @param paddingStyle  See corresponding property above.
     * @return The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:strides:dilationRates:paddingValues:paddingStyle:")
    public static native MPSGraphPooling4DOpDescriptor descriptorWithKernelSizesStridesDilationRatesPaddingValuesPaddingStyle(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides,
            NSArray<? extends NSNumber> dilationRates, NSArray<? extends NSNumber> paddingValues,
            @NUInt long paddingStyle);

    /**
     * [@property]   dilationRates
     * <p>
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1, @1 ] @endcode
     */
    @Generated
    @Selector("dilationRates")
    public native NSArray<? extends NSNumber> dilationRates();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property]   includeZeroPadToAverage
     * <p>
     * For average pooling use a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("includeZeroPadToAverage")
    public native boolean includeZeroPadToAverage();

    @Generated
    @Selector("init")
    public native MPSGraphPooling4DOpDescriptor init();

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

    /**
     * [@property]   kernelSizes
     * <p>
     * Defines the pooling window size.
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     */
    @Generated
    @Selector("kernelSizes")
    public native NSArray<? extends NSNumber> kernelSizes();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphPooling4DOpDescriptor new_objc();

    /**
     * [@property]   paddingStyle
     * <p>
     * Defines what kind of padding to apply to operation.
     * Default value: @code MPSGraphPaddingStyleExplicit @endcode
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * [@property]   paddingValues
     * <p>
     * Must be eight numbers, two for each spatial dimension. `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: @code @[ @0, @0, @0, @0, @0, @0, @0, @0 ] @endcode
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
     * [@property]   ceilMode
     * <p>
     * If set then the output size is computed by rounding up instead of down when
     * dividing by stride.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setCeilMode:")
    public native void setCeilMode(boolean value);

    /**
     * [@property]   dilationRates
     * <p>
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1, @1 ] @endcode
     */
    @Generated
    @Selector("setDilationRates:")
    public native void setDilationRates(NSArray<? extends NSNumber> value);

    /**
     * [@property]   includeZeroPadToAverage
     * <p>
     * For average pooling use a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: @code NO @endcode
     */
    @Generated
    @Selector("setIncludeZeroPadToAverage:")
    public native void setIncludeZeroPadToAverage(boolean value);

    /**
     * [@property]   kernelSizes
     * <p>
     * Defines the pooling window size.
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     */
    @Generated
    @Selector("setKernelSizes:")
    public native void setKernelSizes(NSArray<? extends NSNumber> value);

    /**
     * [@property]   paddingStyle
     * <p>
     * Defines what kind of padding to apply to operation.
     * Default value: @code MPSGraphPaddingStyleExplicit @endcode
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * [@property]   paddingValues
     * <p>
     * Must be eight numbers, two for each spatial dimension. `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: @code @[ @0, @0, @0, @0, @0, @0, @0, @0 ] @endcode
     */
    @Generated
    @Selector("setPaddingValues:")
    public native void setPaddingValues(NSArray<? extends NSNumber> value);

    /**
     * [@property]   strides
     * <p>
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1, @1 ] @endcode
     */
    @Generated
    @Selector("setStrides:")
    public native void setStrides(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   strides
     * <p>
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     * Default value: @code @[ @1, @1, @1, @1 ] @endcode
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

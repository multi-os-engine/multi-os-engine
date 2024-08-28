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
 * This class defines parameters for a 4d pooling operation.
 * 
 * Use this descriptor with the following methods:
 * ``MPSGraph/maxPooling4DWithSourceTensor:descriptor:name:``,
 * ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:``,
 * ``MPSGraph/maxPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:``,
 * ``MPSGraph/maxPooling4DGradientWithGradientTensor:indicesTensor:outputShape:descriptor:name:``,
 * ``MPSGraph/maxPooling4DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:``,
 * ``MPSGraph/avgPooling4DWithSourceTensor:descriptor:name:``,
 * ``MPSGraph/avgPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:``,
 * ``MPSGraph/L2NormPooling4DWithSourceTensor:descriptor:name:`` and
 * ``MPSGraph/L2NormPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:``.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphPooling4DOpDescriptor extends MPSGraphObject implements NSCopying {
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
     * Affects how MPSGraph computes the output size: if set to `YES` then output size is
     * computed by rounding up instead of down when dividing input size by stride.
     * Default value: `NO`.
     */
    @Generated
    @Selector("ceilMode")
    public native boolean ceilMode();

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
     * Creates a 4d pooling descriptor with default values.
     * 
     * - Parameters:
     * - kernelSizes: See `kernelSizes` property.
     * - paddingStyle: See `paddingStyle` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:paddingStyle:")
    public static native MPSGraphPooling4DOpDescriptor descriptorWithKernelSizesPaddingStyle(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long paddingStyle);

    /**
     * Creates a 4d pooling descriptor with given values.
     * 
     * - Parameters:
     * - kernelSizes: See `kernelSizes` property.
     * - strides: See `strides` property.
     * - dilationRates: See `dilationRates` property.
     * - paddingValues: See `paddingValues` property.
     * - paddingStyle: See `paddingStyle` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:strides:dilationRates:paddingValues:paddingStyle:")
    public static native MPSGraphPooling4DOpDescriptor descriptorWithKernelSizesStridesDilationRatesPaddingValuesPaddingStyle(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NotNull NSArray<? extends NSNumber> strides,
            @NotNull NSArray<? extends NSNumber> dilationRates, @NotNull NSArray<? extends NSNumber> paddingValues,
            @NUInt long paddingStyle);

    /**
     * Defines dilation rates for spatial dimensions. Must be four numbers, one for each spatial dimension, fastest
     * running index last.
     * Default value: `@[ @1, @1, @1, @1 ]`
     */
    @NotNull
    @Generated
    @Selector("dilationRates")
    public native NSArray<? extends NSNumber> dilationRates();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Defines for average pooling a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: `NO`.
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
     * Defines the pooling window size.
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     */
    @NotNull
    @Generated
    @Selector("kernelSizes")
    public native NSArray<? extends NSNumber> kernelSizes();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphPooling4DOpDescriptor new_objc();

    /**
     * Defines what kind of padding MPSGraph applies to the operation.
     * Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * Defines padding values for spatial dimensions. Must be eight numbers, two for each spatial dimension.
     * For example `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: `@[ @0, @0, @0, @0, @0, @0, @0, @0 ]`
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
     * Affects how MPSGraph computes the output size: if set to `YES` then output size is
     * computed by rounding up instead of down when dividing input size by stride.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setCeilMode:")
    public native void setCeilMode(boolean value);

    /**
     * Defines dilation rates for spatial dimensions. Must be four numbers, one for each spatial dimension, fastest
     * running index last.
     * Default value: `@[ @1, @1, @1, @1 ]`
     */
    @Generated
    @Selector("setDilationRates:")
    public native void setDilationRates(@NotNull NSArray<? extends NSNumber> value);

    /**
     * Defines for average pooling a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: `NO`.
     */
    @Generated
    @Selector("setIncludeZeroPadToAverage:")
    public native void setIncludeZeroPadToAverage(boolean value);

    /**
     * Defines the pooling window size.
     * Must be four numbers, one for each spatial dimension, fastest running index last.
     */
    @Generated
    @Selector("setKernelSizes:")
    public native void setKernelSizes(@NotNull NSArray<? extends NSNumber> value);

    /**
     * Defines what kind of padding MPSGraph applies to the operation.
     * Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * Defines padding values for spatial dimensions. Must be eight numbers, two for each spatial dimension.
     * For example `paddingValues[0]` defines the explicit padding
     * amount before the first spatial dimension (slowest running index of spatial dimensions),
     * `paddingValues[1]` defines the padding amount after the first spatial dimension etc.
     * Used only when `paddingStyle = MPSGraphPaddingStyleExplicit`.
     * Default value: `@[ @0, @0, @0, @0, @0, @0, @0, @0 ]`
     */
    @Generated
    @Selector("setPaddingValues:")
    public native void setPaddingValues(@NotNull NSArray<? extends NSNumber> value);

    /**
     * Defines strides for spatial dimensions. Must be four numbers, one for each spatial dimension, fastest running
     * index last.
     * Default value: `@[ @1, @1, @1, @1 ]`
     */
    @Generated
    @Selector("setStrides:")
    public native void setStrides(@NotNull NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Defines strides for spatial dimensions. Must be four numbers, one for each spatial dimension, fastest running
     * index last.
     * Default value: `@[ @1, @1, @1, @1 ]`
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

    /**
     * Defines the data type for returned indices.
     * Use this in conjunction with ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * Currently MPSGraph supports the following datatypes: `MPSDataTypeInt32`.
     * Default value: `MPSDataTypeInt32`.
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("returnIndicesDataType")
    public native int returnIndicesDataType();

    /**
     * Defines the mode for returned indices of maximum values within each pooling window.
     * Use this in conjunction with ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns from ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:``
     * will be valid and using the second result will assert.
     * Default value: `MPSGraphPoolingReturnIndicesNone`.
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("returnIndicesMode")
    @NUInt
    public native long returnIndicesMode();

    /**
     * Defines the data type for returned indices.
     * Use this in conjunction with ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * Currently MPSGraph supports the following datatypes: `MPSDataTypeInt32`.
     * Default value: `MPSDataTypeInt32`.
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("setReturnIndicesDataType:")
    public native void setReturnIndicesDataType(int value);

    /**
     * Defines the mode for returned indices of maximum values within each pooling window.
     * Use this in conjunction with ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns from ``MPSGraph/maxPooling4DReturnIndicesWithSourceTensor:descriptor:name:``
     * will be valid and using the second result will assert.
     * Default value: `MPSGraphPoolingReturnIndicesNone`.
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("setReturnIndicesMode:")
    public native void setReturnIndicesMode(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

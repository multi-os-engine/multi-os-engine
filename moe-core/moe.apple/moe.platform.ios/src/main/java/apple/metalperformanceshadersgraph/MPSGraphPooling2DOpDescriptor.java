package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * The class that defines the parameters for a 2D pooling operation.
 * 
 * Use this descriptor with the following methods:
 * - ``MPSGraph/maxPooling2DWithSourceTensor:descriptor:name:``
 * - ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:``
 * - ``MPSGraph/maxPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:``
 * - ``MPSGraph/maxPooling2DGradientWithGradientTensor:indicesTensor:outputShape:descriptor:name:``
 * - ``MPSGraph/maxPooling2DGradientWithGradientTensor:indicesTensor:outputShapeTensor:descriptor:name:``
 * - ``MPSGraph/avgPooling2DWithSourceTensor:descriptor:name:``
 * - ``MPSGraph/avgPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:``
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphPooling2DOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphPooling2DOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphPooling2DOpDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphPooling2DOpDescriptor allocWithZone(VoidPtr zone);

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
     * Affects how the graph computes the output size.
     * 
     * if set to `YES` then output size is computed by rounding up instead of down when dividing input size by stride.
     * Default value: `NO`.
     * 
     * API-Since: 15.0
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

    /**
     * Defines the data layout of the input data in the forward pass. See: ``MPSGraphTensorNamedDataLayout``.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("dataLayout")
    @NUInt
    public native long dataLayout();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a 2D pooling descriptor with given values.
     * 
     * - Parameters:
     * - kernelWidth: See `kernelWidth` property.
     * - kernelHeight: See `kernelHeight` property.
     * - strideInX: See `strideInX` property.
     * - strideInY: See `strideInY` property.
     * - dilationRateInX: See `dilationRateInX` property.
     * - dilationRateInY: See `dilationRateInY` property.
     * - paddingLeft: See `paddingLeft` property.
     * - paddingRight: See `paddingRight` property.
     * - paddingTop: See `paddingTop` property.
     * - paddingBottom: See `paddingBottom` property.
     * - paddingStyle: See `paddingStyle` property.
     * - dataLayout: See `dataLayout` property.
     * - Returns: The descriptor on autoreleasepool.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingStyle:dataLayout:")
    public static native MPSGraphPooling2DOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYDilationRateInXDilationRateInYPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingStyleDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long dilationRateInX, @NUInt long dilationRateInY, @NUInt long paddingLeft, @NUInt long paddingRight,
            @NUInt long paddingTop, @NUInt long paddingBottom, @NUInt long paddingStyle, @NUInt long dataLayout);

    /**
     * Creates a 2D pooling descriptor with given values.
     * 
     * - Parameters:
     * - kernelWidth: See `kernelWidth` property.
     * - kernelHeight: See `kernelHeight`` property.
     * - strideInX: See `strideInX` property.
     * - strideInY: See `strideInY` property.
     * - paddingStyle: See `paddingStyle` property.
     * - dataLayout: See `dataLayout` property.
     * - Returns: The descriptor on autoreleasepool.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:paddingStyle:dataLayout:")
    public static native MPSGraphPooling2DOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYPaddingStyleDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long paddingStyle, @NUInt long dataLayout);

    /**
     * Defines the dilation rate for the width dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * Defines the dilation rate for the height dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Defines a mode for average pooling, where samples outside the input tensor count as zeroes in the average
     * computation.
     * 
     * Otherwise the result is sum over samples divided by number of samples that didn't come from padding.
     * Default value: `NO`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("includeZeroPadToAverage")
    public native boolean includeZeroPadToAverage();

    @Generated
    @Selector("init")
    public native MPSGraphPooling2DOpDescriptor init();

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
     * Defines the pooling window size for the height dimension.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * Defines the pooling window size for the width dimension.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphPooling2DOpDescriptor new_objc();

    /**
     * Defines the explicit padding value for the height dimension to add after the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * Defines the explicit padding value for the width dimension to add before the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * Defines the explicit padding value for the width dimension to add after the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * Defines what kind of padding graph applies to the operation.
     * 
     * Default value: `MPSGraphPaddingStyleExplicit`.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * Defines the explicit padding value for the height dimension to add before the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("paddingTop")
    @NUInt
    public native long paddingTop();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Affects how the graph computes the output size.
     * 
     * if set to `YES` then output size is computed by rounding up instead of down when dividing input size by stride.
     * Default value: `NO`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCeilMode:")
    public native void setCeilMode(boolean value);

    /**
     * Defines the data layout of the input data in the forward pass. See: ``MPSGraphTensorNamedDataLayout``.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    /**
     * Defines the dilation rate for the width dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    /**
     * Defines the dilation rate for the height dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    /**
     * Sets the explicit padding values and sets padding style to explicit.
     * 
     * - Parameters:
     * - paddingLeft: See `paddingLeft` property.
     * - paddingRight: See `paddingRight` property.
     * - paddingTop: See `paddingTop` property.
     * - paddingBottom: See `paddingBottom` property.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:")
    public native void setExplicitPaddingWithPaddingLeftPaddingRightPaddingTopPaddingBottom(@NUInt long paddingLeft,
            @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom);

    /**
     * Defines a mode for average pooling, where samples outside the input tensor count as zeroes in the average
     * computation.
     * 
     * Otherwise the result is sum over samples divided by number of samples that didn't come from padding.
     * Default value: `NO`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setIncludeZeroPadToAverage:")
    public native void setIncludeZeroPadToAverage(boolean value);

    /**
     * Defines the pooling window size for the height dimension.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    /**
     * Defines the pooling window size for the width dimension.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    /**
     * Defines the explicit padding value for the height dimension to add after the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    /**
     * Defines the explicit padding value for the width dimension to add before the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    /**
     * Defines the explicit padding value for the width dimension to add after the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    /**
     * Defines what kind of padding graph applies to the operation.
     * 
     * Default value: `MPSGraphPaddingStyleExplicit`.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * Defines the explicit padding value for the height dimension to add before the data.
     * 
     * Default value: 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    /**
     * Defines the stride for the width dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * Defines the stride for the height dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Defines the stride for the width dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * Defines the stride for the height dimension.
     * 
     * Default value: 1.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Defines the data type for returned indices.
     * Use this in conjunction with ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:`` API.
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
     * Use this in conjunction with ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns from ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:``
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
     * Use this in conjunction with ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:`` API.
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
     * Use this in conjunction with ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:`` API.
     * If `returnIndicesMode = MPSGraphPoolingReturnIndicesNone` then only the first result
     * MPSGraph returns from ``MPSGraph/maxPooling2DReturnIndicesWithSourceTensor:descriptor:name:``
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

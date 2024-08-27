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
 * This is a class that defines parameters for a 2d depthwise convolution operation.
 * 
 * A `MPSGraphDepthwiseConvolution2DOpDescriptor` defines constant parameters for 2d depthwise convolutions.
 * Use this class with ``MPSGraph/depthwiseConvolution2DWithSourceTensor:weightsTensor:descriptor:name:``,
 * ``MPSGraph/depthwiseConvolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:descriptor:name:``
 * and
 * ``MPSGraph/depthwiseConvolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:descriptor:name:``
 * methods.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphDepthwiseConvolution2DOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphDepthwiseConvolution2DOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor allocWithZone(VoidPtr zone);

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
     * The data layout of the input data (in forward pass).
     * 
     * See: ``MPSGraphTensorNamedDataLayout``.
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
     * Creates a 2d depthwise convolution descriptor with given properties and default values.
     * 
     * - Parameters:
     * - dataLayout: See `dataLayout` property.
     * - weightsLayout: See `weightsLayout` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithDataLayout:weightsLayout:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor descriptorWithDataLayoutWeightsLayout(
            @NUInt long dataLayout, @NUInt long weightsLayout);

    /**
     * Creates a 2d depthwise convolution descriptor with given values.
     * 
     * - Parameters:
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
     * - weightsLayout: See `weightsLayout` property.
     * - Returns: The descriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithStrideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingStyle:dataLayout:weightsLayout:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor descriptorWithStrideInXStrideInYDilationRateInXDilationRateInYPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingStyleDataLayoutWeightsLayout(
            @NUInt long strideInX, @NUInt long strideInY, @NUInt long dilationRateInX, @NUInt long dilationRateInY,
            @NUInt long paddingLeft, @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom,
            @NUInt long paddingStyle, @NUInt long dataLayout, @NUInt long weightsLayout);

    /**
     * The dilation rate for X (Width) dimension. Default value: 1.
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * The dilation rate for Y (Height) dimension. Default value: 1.
     */
    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphDepthwiseConvolution2DOpDescriptor init();

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
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor new_objc();

    /**
     * The explicit padding value for Y (Height) dimension operation adds after the data. Default value: 0.
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * The explicit padding value for X (Width) dimension the operation adds before the data. Default value: 0.
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * The explicit padding value for X (Width) dimension operation adds after the data. Default value: 0.
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * The padding style for the operation. Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * The explicit padding value for Y (Height) dimension operation adds before the data. Default value: 0.
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
     * The data layout of the input data (in forward pass).
     * 
     * See: ``MPSGraphTensorNamedDataLayout``.
     */
    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    /**
     * The dilation rate for X (Width) dimension. Default value: 1.
     */
    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    /**
     * The dilation rate for Y (Height) dimension. Default value: 1.
     */
    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    /**
     * Sets the explicit padding values.
     * 
     * Note: this method also sets `paddingStyle` to `MPSGraphPaddingStyleExplicit` (see ``MPSGraphPaddingStyle``).
     * 
     * - Parameters:
     * - paddingLeft: See `paddingLeft` property.
     * - paddingRight: See `paddingRight` property.
     * - paddingTop: See `paddingTop` property.
     * - paddingBottom: See `paddingBottom` property.
     */
    @Generated
    @Selector("setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:")
    public native void setExplicitPaddingWithPaddingLeftPaddingRightPaddingTopPaddingBottom(@NUInt long paddingLeft,
            @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom);

    /**
     * The explicit padding value for Y (Height) dimension operation adds after the data. Default value: 0.
     */
    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    /**
     * The explicit padding value for X (Width) dimension the operation adds before the data. Default value: 0.
     */
    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    /**
     * The explicit padding value for X (Width) dimension operation adds after the data. Default value: 0.
     */
    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    /**
     * The padding style for the operation. Default value: `MPSGraphPaddingStyleExplicit`.
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * The explicit padding value for Y (Height) dimension operation adds before the data. Default value: 0.
     */
    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    /**
     * The stride for X (Width) dimension. Default value: 1.
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * The stride for Y (Height) dimension. Default value: 1.
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The data layout of the weights.
     * 
     * NOTE: 'O' index is channel multiplier index. See: ``MPSGraphTensorNamedDataLayout``.
     */
    @Generated
    @Selector("setWeightsLayout:")
    public native void setWeightsLayout(@NUInt long value);

    /**
     * The stride for X (Width) dimension. Default value: 1.
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * The stride for Y (Height) dimension. Default value: 1.
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
     * The data layout of the weights.
     * 
     * NOTE: 'O' index is channel multiplier index. See: ``MPSGraphTensorNamedDataLayout``.
     */
    @Generated
    @Selector("weightsLayout")
    @NUInt
    public native long weightsLayout();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

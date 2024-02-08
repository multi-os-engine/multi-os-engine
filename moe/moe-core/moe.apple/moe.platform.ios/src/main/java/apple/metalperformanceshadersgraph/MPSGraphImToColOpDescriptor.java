package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * This class defines parameters for an imToCol or colToIm operation.
 * Use this descriptor with the following ``MPSGraph`` methods:
 * - ``MPSGraph/imToColWithSourceTensor:descriptor:name:``.
 * - ``MPSGraph/colToImWithSourceTensor:outputShape:descriptor:name:``.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphImToColOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphImToColOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphImToColOpDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphImToColOpDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The property defines the layout of source or output tensor.
     * e.g. `batch x channels x width x height` for `NCHW` layout
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
     * Creates imToCol descriptor with given values for parameters.
     * - Parameters:
     * - kernelWidth: See `kernelWidth` property.
     * - kernelHeight: See `kernelHeight` property.
     * - strideInX: See `strideInX` property.
     * - strideInY: See `strideInY` property.
     * - dilationRateInX: See `dilationRateInX` property.
     * - dilationRateInY: See `dilationRateInY` property.
     * - dataLayout: See `dataLayout` property.
     * - Returns: A valid MPSGraphImToColOpDescriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:dilationRateInX:dilationRateInY:dataLayout:")
    public static native MPSGraphImToColOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYDilationRateInXDilationRateInYDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long dilationRateInX, @NUInt long dilationRateInY, @NUInt long dataLayout);

    /**
     * Creates an imToCol descriptor with given values for parameters.
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
     * - dataLayout: See `dataLayout` property.
     * - Returns: A valid MPSGraphImToColOpDescriptor on autoreleasepool.
     */
    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:dataLayout:")
    public static native MPSGraphImToColOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYDilationRateInXDilationRateInYPaddingLeftPaddingRightPaddingTopPaddingBottomDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long dilationRateInX, @NUInt long dilationRateInY, @NUInt long paddingLeft, @NUInt long paddingRight,
            @NUInt long paddingTop, @NUInt long paddingBottom, @NUInt long dataLayout);

    /**
     * The property defines the dilation in `x` or width dimension.
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * The property defines the dilation in `y` or height dimension.
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
    public native MPSGraphImToColOpDescriptor init();

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
     * The property defines the kernel size in `y` or height dimension.
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * The property defines the kernel size in `x` or width dimension.
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphImToColOpDescriptor new_objc();

    /**
     * The property defines the padding in `y` or height dimension at bottom.
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * The property defines the padding in `x` or width dimension on left side.
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * The property defines the padding in `x` or width dimension on right side.
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * The property defines the padding in `y` or height dimension at top.
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
     * The property defines the layout of source or output tensor.
     * e.g. `batch x channels x width x height` for `NCHW` layout
     */
    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    /**
     * The property defines the dilation in `x` or width dimension.
     */
    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    /**
     * The property defines the dilation in `y` or height dimension.
     */
    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    /**
     * Sets the descriptor's padding to the given values.
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
     * The property defines the kernel size in `y` or height dimension.
     */
    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    /**
     * The property defines the kernel size in `x` or width dimension.
     */
    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    /**
     * The property defines the padding in `y` or height dimension at bottom.
     */
    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    /**
     * The property defines the padding in `x` or width dimension on left side.
     */
    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    /**
     * The property defines the padding in `x` or width dimension on right side.
     */
    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    /**
     * The property defines the padding in `y` or height dimension at top.
     */
    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    /**
     * The property defines the stride in `x` or width dimension.
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * The property defines the stride in `y` or height dimension.
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The property defines the stride in `x` or width dimension.
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * The property defines the stride in `y` or height dimension.
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
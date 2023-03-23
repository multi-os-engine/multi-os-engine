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

/**
 * API-Since: 14.0
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphPooling2DOpDescriptor extends NSObject implements NSCopying {
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
     * [@property] ceilMode
     * 
     * If set then the output size is computed by rounding up instead of down when
     * dividing by stride.
     * Default value: @code NO @endcode
     * 
     * API-Since: 15.0
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
    @Selector("dataLayout")
    @NUInt
    public native long dataLayout();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingStyle:dataLayout:")
    public static native MPSGraphPooling2DOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYDilationRateInXDilationRateInYPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingStyleDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long dilationRateInX, @NUInt long dilationRateInY, @NUInt long paddingLeft, @NUInt long paddingRight,
            @NUInt long paddingTop, @NUInt long paddingBottom, @NUInt long paddingStyle, @NUInt long dataLayout);

    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:paddingStyle:dataLayout:")
    public static native MPSGraphPooling2DOpDescriptor descriptorWithKernelWidthKernelHeightStrideInXStrideInYPaddingStyleDataLayout(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInX, @NUInt long strideInY,
            @NUInt long paddingStyle, @NUInt long dataLayout);

    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] includeZeroPadToAverage
     * 
     * For average pooling use a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: @code NO @endcode
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

    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] groups
     * 
     * groups of the operation
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphPooling2DOpDescriptor new_objc();

    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

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
     * [@property] ceilMode
     * 
     * If set then the output size is computed by rounding up instead of down when
     * dividing by stride.
     * Default value: @code NO @endcode
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCeilMode:")
    public native void setCeilMode(boolean value);

    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    @Generated
    @Selector("setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:")
    public native void setExplicitPaddingWithPaddingLeftPaddingRightPaddingTopPaddingBottom(@NUInt long paddingLeft,
            @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom);

    /**
     * [@property] includeZeroPadToAverage
     * 
     * For average pooling use a mode where samples outside the input tensor count as
     * zeroes in the average computation. Otherwise the result is sum over samples divided by
     * number of samples that didn't come from padding.
     * Default value: @code NO @endcode
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setIncludeZeroPadToAverage:")
    public native void setIncludeZeroPadToAverage(boolean value);

    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    /**
     * [@property] groups
     * 
     * groups of the operation
     */
    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

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
     * [@property] returnIndicesDataType
     * 
     * Used in conjunction with maxPooling4DAndReturnIndicesWithSourceTensor API.
     * If MPSGraphPoolingReturnIndicesNone, this property is not used.
     * Currently supports MPSDataTypeInt32
     * Default value: @code MPSDataTypeInt32 @endcode
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("returnIndicesDataType")
    public native int returnIndicesDataType();

    /**
     * [@property] returnIndicesMode
     * 
     * Used in conjunction with maxPooling2DAndReturnIndicesWithSourceTensor API.
     * If MPSGraphPoolingReturnIndicesNone, returns a nil tensor for indices.
     * Default value: @code MPSGraphPoolingReturnIndicesNone @endcode
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("returnIndicesMode")
    @NUInt
    public native long returnIndicesMode();

    /**
     * [@property] returnIndicesDataType
     * 
     * Used in conjunction with maxPooling4DAndReturnIndicesWithSourceTensor API.
     * If MPSGraphPoolingReturnIndicesNone, this property is not used.
     * Currently supports MPSDataTypeInt32
     * Default value: @code MPSDataTypeInt32 @endcode
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("setReturnIndicesDataType:")
    public native void setReturnIndicesDataType(int value);

    /**
     * [@property] returnIndicesMode
     * 
     * Used in conjunction with maxPooling2DAndReturnIndicesWithSourceTensor API.
     * If MPSGraphPoolingReturnIndicesNone, returns a nil tensor for indices.
     * Default value: @code MPSGraphPoolingReturnIndicesNone @endcode
     * 
     * API-Since: 15.3
     */
    @Generated
    @Selector("setReturnIndicesMode:")
    public native void setReturnIndicesMode(@NUInt long value);
}

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

@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphDepthwiseConvolution2DOpDescriptor extends NSObject implements NSCopying {
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

    @Generated
    @Selector("allocWithZone:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("descriptorWithDataLayout:weightsLayout:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor descriptorWithDataLayoutWeightsLayout(
            @NUInt long dataLayout, @NUInt long weightsLayout);

    @Generated
    @Selector("descriptorWithStrideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingStyle:dataLayout:weightsLayout:")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor descriptorWithStrideInXStrideInYDilationRateInXDilationRateInYPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingStyleDataLayoutWeightsLayout(
            @NUInt long strideInX, @NUInt long strideInY, @NUInt long dilationRateInX, @NUInt long dilationRateInY,
            @NUInt long paddingLeft, @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom,
            @NUInt long paddingStyle, @NUInt long dataLayout, @NUInt long weightsLayout);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * !< Default = 1
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphDepthwiseConvolution2DOpDescriptor new_objc();

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * !< Default = MPSGraphPaddingStyleExplicit
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
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

    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    @Generated
    @Selector("setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:")
    public native void setExplicitPaddingWithPaddingLeftPaddingRightPaddingTopPaddingBottom(@NUInt long paddingLeft,
            @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom);

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    /**
     * !< Default = MPSGraphPaddingStyleExplicit
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * !< Default = 0 - ignored if paddingStyle != explicit
     */
    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * !< NOTE: 'O' index is channel multiplier index
     */
    @Generated
    @Selector("setWeightsLayout:")
    public native void setWeightsLayout(@NUInt long value);

    /**
     * !< Default = 1
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * !< Default = 1
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
     * !< NOTE: 'O' index is channel multiplier index
     */
    @Generated
    @Selector("weightsLayout")
    @NUInt
    public native long weightsLayout();
}

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class      MPSImageArithmetic
 * @dependency This depends on Metal.framework.
 * @discussion This filter takes two source images, a primary source image and a secondary source image,
 *             and outputs a single destination image. It applies an element-wise arithmetic operator to
 *             each pixel in a primary source image and a corresponding pixel in a secondary source image
 *             over a specified region.
 * 
 *             The supported arithmetic operators are the following:
 *             - Addition
 *             - Subtraction
 *             - Multiplication
 *             - Division
 * 
 *             This filter takes additional parameters: primaryScale, secondaryScale, and bias. The default
 *             value for primaryScale and secondaryScale is 1.0f. The default value for bias is 0.0f. This
 *             filter applies primaryScale, secondaryScale, and bias to the primary source pixel (x) and
 *             secondary source pixel (y) in the following way:
 *             - Addition:         result = ((primaryScale * x) + (secondaryScale * y)) + bias
 *             - Subtraction:      result = ((primaryScale * x) - (secondaryScale * y)) + bias
 *             - Multiplicaton:    result = ((primaryScale * x) * (secondaryScale * y)) + bias
 *             - Division:         result = ((primaryScale * x) / (secondaryScale * y)) + bias
 * 
 *             To clamp the result of an arithmetic operation, where
 *             result = clamp(result, minimumValue, maximumValue),
 *             set the minimumValue and maximumValue appropriately. The default value of minimumValue
 *             is -FLT_MAX. The default value of maximumValue is FLT_MAX.
 * 
 *             This filter also takes the following additional parameters:
 *             - primaryStrideInPixels
 *             - secondaryStrideInPixels
 *             These parameters can be used to control broadcasting for the data stored in the primary and
 *             secondary source images. For example, setting all strides for the primary source image to 0
 *             will result in the primarySource image being treated as a scalar value. The only supported
 *             values are 0 or 1. The default value of these parameters is 1.
 * 
 *             This filter accepts uint and int data in addition to unorm and floating-point data.
 * 
 *             You must use one of the sub-classes of MPSImageArithmetic.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageArithmetic extends MPSBinaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageArithmetic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageArithmetic alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bias")
    public native float bias();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageArithmetic init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageArithmetic initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageArithmetic initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageArithmetic initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("primaryScale")
    public native float primaryScale();

    /**
     * @property   primaryStrideInPixels
     * @abstract   The secondarySource stride in the x, y, and z dimensions. The only supported values are 0 or 1.
     *             The default value for each dimension is 1.
     */
    @Generated
    @Selector("primaryStrideInPixels")
    @ByValue
    public native MTLSize primaryStrideInPixels();

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
     * @property   secondaryStrideInPixels
     * @abstract   The secondarySource stride in the x, y, and z dimensions. The only supported values are 0 or 1.
     *             The default value for each dimension is 1.
     */
    @Generated
    @Selector("secondaryStrideInPixels")
    @ByValue
    public native MTLSize secondaryStrideInPixels();

    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    @Generated
    @Selector("setPrimaryScale:")
    public native void setPrimaryScale(float value);

    /**
     * @property   primaryStrideInPixels
     * @abstract   The secondarySource stride in the x, y, and z dimensions. The only supported values are 0 or 1.
     *             The default value for each dimension is 1.
     */
    @Generated
    @Selector("setPrimaryStrideInPixels:")
    public native void setPrimaryStrideInPixels(@ByValue MTLSize value);

    @Generated
    @Selector("setSecondaryScale:")
    public native void setSecondaryScale(float value);

    /**
     * @property   secondaryStrideInPixels
     * @abstract   The secondarySource stride in the x, y, and z dimensions. The only supported values are 0 or 1.
     *             The default value for each dimension is 1.
     */
    @Generated
    @Selector("setSecondaryStrideInPixels:")
    public native void setSecondaryStrideInPixels(@ByValue MTLSize value);

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

    /**
     * @property   maximumValue
     * @abstract   maximumValue is used to clamp the result of an arithmetic operation:
     *             result = clamp(result, minimumValue, maximumValue).
     *             The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("maximumValue")
    public native float maximumValue();

    /**
     * @property   minimumValue
     * @abstract   minimumValue is to clamp the result of an arithmetic operation:
     *             result = clamp(result, minimumValue, maximumValue).
     *             The default value of minimumValue is -FLT_MAX.
     */
    @Generated
    @Selector("minimumValue")
    public native float minimumValue();

    /**
     * @property   maximumValue
     * @abstract   maximumValue is used to clamp the result of an arithmetic operation:
     *             result = clamp(result, minimumValue, maximumValue).
     *             The default value of maximumValue is FLT_MAX.
     */
    @Generated
    @Selector("setMaximumValue:")
    public native void setMaximumValue(float value);

    /**
     * @property   minimumValue
     * @abstract   minimumValue is to clamp the result of an arithmetic operation:
     *             result = clamp(result, minimumValue, maximumValue).
     *             The default value of minimumValue is -FLT_MAX.
     */
    @Generated
    @Selector("setMinimumValue:")
    public native void setMinimumValue(float value);
}
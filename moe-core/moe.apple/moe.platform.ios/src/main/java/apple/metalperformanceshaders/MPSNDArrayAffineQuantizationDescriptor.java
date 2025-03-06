package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * MPSNDArrayAffineQuantizationDescriptor
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * Describes an affine quantization scheme
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayAffineQuantizationDescriptor extends MPSNDArrayQuantizationDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayAffineQuantizationDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayAffineQuantizationDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSNDArrayAffineQuantizationDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] hasMinValue
     * 
     * If yes then offset is used. See MPSNDArrayQuantizationScheme.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasMinValue")
    public native boolean hasMinValue();

    /**
     * [@property] hasZeroPoint
     * 
     * If yes then asymmetric quantization is used. See MPSNDArrayQuantizationScheme.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasZeroPoint")
    public native boolean hasZeroPoint();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] implicitZeroPoint
     * 
     * If true and quantized values are signed, these are assumed to be stored with an
     * implicit offset or zero-point of 2^(quantizationBitWidth-1) added to bring signed values into unsigned range.
     * e.g. Int4 values are in range [-8,7]. If we add 8 to it values are in range
     * [0,15] and can be encoded/stored as UInt4.
     * Default is false. Its only currently applicable to Int4.
     * Implementation will generate error for any other data type;
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("implicitZeroPoint")
    public native boolean implicitZeroPoint();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("init")
    public native MPSNDArrayAffineQuantizationDescriptor init();

    /**
     * Initializes an affine quantization descriptor.
     * 
     * @param quantizationDataType Which quantized datatype is used.
     * @param hasZeroPoint         A flag indicating that a zero-point input is expected.
     * @param hasMinValue          A flag indicating that a minimum value input is expected.
     * @return A new quantization descriptor.
     * 
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithDataType:hasZeroPoint:hasMinValue:")
    public native MPSNDArrayAffineQuantizationDescriptor initWithDataTypeHasZeroPointHasMinValue(
            int quantizationDataType, boolean hasZeroPoint, boolean hasMinValue);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNDArrayAffineQuantizationDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] hasMinValue
     * 
     * If yes then offset is used. See MPSNDArrayQuantizationScheme.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHasMinValue:")
    public native void setHasMinValue(boolean value);

    /**
     * [@property] hasZeroPoint
     * 
     * If yes then asymmetric quantization is used. See MPSNDArrayQuantizationScheme.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHasZeroPoint:")
    public native void setHasZeroPoint(boolean value);

    /**
     * [@property] implicitZeroPoint
     * 
     * If true and quantized values are signed, these are assumed to be stored with an
     * implicit offset or zero-point of 2^(quantizationBitWidth-1) added to bring signed values into unsigned range.
     * e.g. Int4 values are in range [-8,7]. If we add 8 to it values are in range
     * [0,15] and can be encoded/stored as UInt4.
     * Default is false. Its only currently applicable to Int4.
     * Implementation will generate error for any other data type;
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setImplicitZeroPoint:")
    public native void setImplicitZeroPoint(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
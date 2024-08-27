package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCUpsampleLayer
 * 
 * An upsample layer
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCUpsampleLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCUpsampleLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] alignsCorners
     * 
     * A boolean that specifies whether the corner pixels of the source and result tensors are aligned.
     * 
     * If True, the corner pixels of the source and result tensors are aligned, and thus preserving the values at those
     * pixels.
     * This only has effect when mode is 'bilinear'. Default is NO.
     */
    @Generated
    @Selector("alignsCorners")
    public native boolean alignsCorners();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCUpsampleLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCUpsampleLayer allocWithZone(VoidPtr zone);

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
    public native MLCUpsampleLayer init();

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

    /**
     * Create an upsample layer
     * 
     * @param shape A NSArray<NSNumber *> representing the dimensions of the result tensor
     * @return A new upsample layer.
     */
    @Generated
    @Selector("layerWithShape:")
    public static native MLCUpsampleLayer layerWithShape(@NotNull NSArray<? extends NSNumber> shape);

    /**
     * Create an upsample layer
     * 
     * @param shape         A NSArray<NSNumber *> representing the dimensions of the result tensor
     * @param sampleMode    The upsampling algorithm to use. Default is nearest.
     * @param alignsCorners Whether the corner pixels of the input and output tensors are aligned or not.
     * @return A new upsample layer.
     */
    @Generated
    @Selector("layerWithShape:sampleMode:alignsCorners:")
    public static native MLCUpsampleLayer layerWithShapeSampleModeAlignsCorners(
            @NotNull NSArray<? extends NSNumber> shape, int sampleMode, boolean alignsCorners);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCUpsampleLayer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleMode
     * 
     * The sampling mode to use when performing the upsample.
     */
    @Generated
    @Selector("sampleMode")
    public native int sampleMode();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] shape
     * 
     * A NSArray<NSNumber *> representing just the width if number of entries in shape array is 1 or
     * the height followed by width of result tensor if the number of entries in shape array is 2.
     */
    @NotNull
    @Generated
    @Selector("shape")
    public native NSArray<? extends NSNumber> shape();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, @NotNull MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

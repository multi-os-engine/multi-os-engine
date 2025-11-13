package apple.videotoolbox;

import apple.NSObject;
import apple.corevideo.opaque.CVBufferRef;
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
 * Helper class to wrap optical flow.
 * 
 * Instances retain the backing pixel buffers that you provide.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTFrameProcessorOpticalFlow extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VTFrameProcessorOpticalFlow(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTFrameProcessorOpticalFlow alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTFrameProcessorOpticalFlow allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Returns the backward optical flow `CVPixelBuffer` that you provided when you initialized the object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("backwardFlow")
    @NotNull
    public native CVBufferRef backwardFlow();

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
     * Returns the forward optical flow `CVPixelBuffer` that you provided when you initialized the object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("forwardFlow")
    @NotNull
    public native CVBufferRef forwardFlow();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTFrameProcessorOpticalFlow init();

    /**
     * Creates a new instance of forward and backward optical flow with pixel buffers.
     * 
     * Create a new instance with forward and backward optical flow ``CVPixelBuffer``s. Instances retain the pixel
     * buffers
     * you provide to this method. Returns `nil` if either `CVPixelBuffer` is NULL or the `CVPixelBuffer`s are not
     * `IOSurface` backed.
     * 
     * - Parameters:
     * - forwardFlow: `CVPixelBuffer` that contains forward optical flow; it must not be `nil` and must be `IOSurface`
     * backed.
     * - backwardFlow: `CVPixelBuffer` that contains backward optical flow; it must not be `nil` and must be `IOSurface`
     * backed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithForwardFlow:backwardFlow:")
    public native VTFrameProcessorOpticalFlow initWithForwardFlowBackwardFlow(@NotNull CVBufferRef forwardFlow,
            @NotNull CVBufferRef backwardFlow);

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
    public static native VTFrameProcessorOpticalFlow new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
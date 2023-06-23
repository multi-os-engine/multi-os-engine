package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCaptureScope;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 11.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLCaptureManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLCaptureManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLCaptureManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLCaptureManager allocWithZone(VoidPtr zone);

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

    /**
     * Default scope to be captured when a capture is initiated from Xcode’s capture button. When nil, it’ll fall back
     * to presentDrawable:, presentDrawable:atTime:, presentDrawable:afterMinimumDuration: in MTLCommandBuffer or
     * present:, present:atTime:, present:afterMinimumDuration: in MTLDrawable.
     */
    @Nullable
    @Generated
    @Selector("defaultCaptureScope")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCaptureScope defaultCaptureScope();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLCaptureManager init();

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

    /**
     * Query if a capture is currently in progress
     */
    @Generated
    @Selector("isCapturing")
    public native boolean isCapturing();

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
    public static native MTLCaptureManager new_objc();

    /**
     * Creates a new capture scope for the given command queue
     */
    @NotNull
    @Generated
    @Selector("newCaptureScopeWithCommandQueue:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCaptureScope newCaptureScopeWithCommandQueue(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    /**
     * Creates a new capture scope for the given capture device
     */
    @NotNull
    @Generated
    @Selector("newCaptureScopeWithDevice:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCaptureScope newCaptureScopeWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Default scope to be captured when a capture is initiated from Xcode’s capture button. When nil, it’ll fall back
     * to presentDrawable:, presentDrawable:atTime:, presentDrawable:afterMinimumDuration: in MTLCommandBuffer or
     * present:, present:atTime:, present:afterMinimumDuration: in MTLDrawable.
     */
    @Generated
    @Selector("setDefaultCaptureScope:")
    public native void setDefaultCaptureScope(@Nullable @Mapped(ObjCObjectMapper.class) MTLCaptureScope value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Retrieves the shared capture manager for this process. There is only one capture manager per process.
     * The capture manager allows the user to create capture scopes and trigger captures from code.
     * When a capture has been completed, it will be displayed in Xcode and the application will be paused.
     * [@remarks] only MTLCommandBuffers created after starting a capture and committed before stopping it are captured.
     */
    @NotNull
    @Generated
    @Selector("sharedCaptureManager")
    public static native MTLCaptureManager sharedCaptureManager();

    /**
     * Starts capturing, for the given command queue, command buffers that are created after invoking this method and
     * committed before invoking -[stopCapture] or clicking Xcode’s stop capture button.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use startCaptureWithDescriptor:error: instead
     */
    @Deprecated
    @Generated
    @Selector("startCaptureWithCommandQueue:")
    public native void startCaptureWithCommandQueue(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    /**
     * Starts capturing, for all queues of the given device, new MTLCommandBuffer's until -[stopCapture] or Xcode’s stop
     * capture button is pressed
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use startCaptureWithDescriptor:error: instead
     */
    @Deprecated
    @Generated
    @Selector("startCaptureWithDevice:")
    public native void startCaptureWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * Start a capture with the given scope: from the scope's begin until its end, restricting the capture to the
     * scope's device(s) and, if selected, the scope's command queue
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use startCaptureWithDescriptor:error: instead
     */
    @Deprecated
    @Generated
    @Selector("startCaptureWithScope:")
    public native void startCaptureWithScope(@NotNull @Mapped(ObjCObjectMapper.class) MTLCaptureScope captureScope);

    /**
     * Stops a capture started from startCaptureWithDevice:/startCaptureWithCommandQueue:/startCaptureWithScope: or from
     * Xcode’s capture button
     */
    @Generated
    @Selector("stopCapture")
    public native void stopCapture();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Start capturing until stopCapture is called.
     * [@remarks] Only MTLCommandBuffer​s created after starting and committed before stopping it are captured.
     * 
     * API-Since: 13.0
     * 
     * @param descriptor MTLCaptureDescriptor specifies the parameters.
     * @param error      Optional error output to check why a capture could not be started.
     * @return true if the capture was successfully started, otherwise false.
     */
    @Generated
    @Selector("startCaptureWithDescriptor:error:")
    public native boolean startCaptureWithDescriptorError(@NotNull MTLCaptureDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Checks if a given capture destination is supported.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsDestination:")
    public native boolean supportsDestination(@NInt long destination);
}

package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCapturePhotoOutputReadinessCoordinatorDelegate;
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
 * AVCapturePhotoOutputReadinessCoordinator
 * 
 * AVCapturePhotoOutputReadinessCoordinator notifies its delegate of changes in an AVCapturePhotoOutput's
 * captureReadiness property and can be used to coordinate UI updates on the main queue with use of AVCapturePhotoOutput
 * on a background queue.
 * 
 * AVCapturePhotoOutputReadinessCoordinator tracks its output's captureReadiness and incorporates additional requests
 * registered via -startTrackingCaptureRequestUsingPhotoSettings:. This allows clients to synchronously update shutter
 * button availability and appearance and on the main thread while calling -[AVCapturePhotoOutput
 * capturePhotoWithSettings:delegate:] asynchronously on a background queue.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCapturePhotoOutputReadinessCoordinator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCapturePhotoOutputReadinessCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCapturePhotoOutputReadinessCoordinator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCapturePhotoOutputReadinessCoordinator allocWithZone(VoidPtr zone);

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

    /**
     * [@property] captureReadiness
     * 
     * A value specifying whether the coordinator's photo output is ready to respond to new capture requests in a timely
     * manner.
     * 
     * The value incorporates the photo output's captureReadiness and any requests registered using
     * -startTrackingCaptureRequestUsingPhotoSettings:. The value is updated before calling the
     * -readinessCoordinator:captureReadinessDidChange: callback. See AVCapturePhotoOutput's captureReadiness
     * documentation for a discussion of how to update shutter availability and appearance based on the captureReadiness
     * value. This property is key-value observable and all change notifications are delivered on the main queue,
     * allowing UI updates to be done directly in the callback.
     */
    @Generated
    @Selector("captureReadiness")
    @NInt
    public native long captureReadiness();

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

    /**
     * [@property] delegate
     * 
     * The receiver's delegate, called on the main queue.
     * 
     * The value of this property is an object conforming to the AVCapturePhotoOutputReadinessCoordinatorDelegate
     * protocol that will receive a callback when the captureReadiness property changes. Callbacks are delivered on the
     * main queue, allowing UI updates to be done directly in the callback. A callback with the initial value of
     * captureReadiness is delivered when delegate is set.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVCapturePhotoOutputReadinessCoordinatorDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCapturePhotoOutputReadinessCoordinator init();

    @Generated
    @Selector("initWithPhotoOutput:")
    public native AVCapturePhotoOutputReadinessCoordinator initWithPhotoOutput(
            @NotNull AVCapturePhotoOutput photoOutput);

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
    public static native AVCapturePhotoOutputReadinessCoordinator new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate, called on the main queue.
     * 
     * The value of this property is an object conforming to the AVCapturePhotoOutputReadinessCoordinatorDelegate
     * protocol that will receive a callback when the captureReadiness property changes. Callbacks are delivered on the
     * main queue, allowing UI updates to be done directly in the callback. A callback with the initial value of
     * captureReadiness is delivered when delegate is set.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable AVCapturePhotoOutputReadinessCoordinatorDelegate value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate, called on the main queue.
     * 
     * The value of this property is an object conforming to the AVCapturePhotoOutputReadinessCoordinatorDelegate
     * protocol that will receive a callback when the captureReadiness property changes. Callbacks are delivered on the
     * main queue, allowing UI updates to be done directly in the callback. A callback with the initial value of
     * captureReadiness is delivered when delegate is set.
     */
    @Generated
    public void setDelegate(
            @Mapped(ObjCObjectMapper.class) @Nullable AVCapturePhotoOutputReadinessCoordinatorDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startTrackingCaptureRequestUsingPhotoSettings:
     * 
     * Track the capture request represented by the specified photo settings until it is enqueued to the photo output
     * and update captureReadiness to include this request.
     * 
     * The captureReadiness property is updated to include the tracked request until the the photo output receives a
     * settings object with the same or a newer uniqueID. It is recommended that the same photo settings be passed to
     * -[AVCapturePhotoOutput capturePhotoWithSettings:delegate] to ensure the captureReadiness value is consistent once
     * the capture begins. When called on the main queue the delegate callback is invoked synchronously before returning
     * to ensure shutter availability is updated immediately and prevent queued touch events from initiating unwanted
     * captures. The -startTrackingCaptureRequestUsingPhotoSettings: method can be called while in the SessionNotRunning
     * state to allow the shutter button to be interactive while the session is being started on a background queue. An
     * NSInvalidArgumentException is thrown if the photo settings are invalid.
     * 
     * @param settings
     *                 The AVCapturePhotoSettings which will be passed to -[AVCapturePhotoOutput
     *                 capturePhotoWithSettings:delegate] for this capture request.
     */
    @Generated
    @Selector("startTrackingCaptureRequestUsingPhotoSettings:")
    public native void startTrackingCaptureRequestUsingPhotoSettings(@NotNull AVCapturePhotoSettings settings);

    /**
     * stopTrackingCaptureRequestUsingPhotoSettingsUniqueID:
     * 
     * Stop tracking the capture request represented by the specified photo settings uniqueID and update
     * captureReadiness to no longer include this request.
     * 
     * Tracking automatically stops when -[AVCapturePhotoOutput capturePhotoWithSettings:delegate] is called with a
     * photo settings objects with the same or a newer uniqueID, but in cases where an error or other condition prevents
     * calling -capturePhotoWithSettings:delegate tracking should be explictly stopped to ensure the captureReadiness
     * value is up to date. When called on the main queue the delegate callback is invoked synchronously before
     * returning to ensure shutter availability is updated immediately.
     * 
     * @param settingsUniqueID
     *                         The AVCapturePhotoSettings.uniqueID of the settings passed to
     *                         -startTrackingCaptureRequestUsingPhotoSettings:.
     */
    @Generated
    @Selector("stopTrackingCaptureRequestUsingPhotoSettingsUniqueID:")
    public native void stopTrackingCaptureRequestUsingPhotoSettingsUniqueID(long settingsUniqueID);

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
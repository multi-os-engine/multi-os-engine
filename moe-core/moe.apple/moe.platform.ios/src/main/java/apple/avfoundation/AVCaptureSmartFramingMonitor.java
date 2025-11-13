package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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

/**
 * An object associated with a capture device that monitors the scene and suggests an optimal framing.
 * 
 * A smart framing monitor observes its associated device for objects of interest entering and exiting the camera's
 * field of view and recommends an optimal framing for good photographic composition. This framing recommendation
 * consists of an aspect ratio and zoom factor. You may respond to the device's framing recommendation by calling
 * ``AVCaptureDevice/setDynamicAspectRatio:completionHandler:`` and setting ``AVCaptureDevice/videoZoomFactor`` on the
 * associated device in whatever order best matches your animation between old and new framings.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureSmartFramingMonitor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureSmartFramingMonitor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureSmartFramingMonitor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureSmartFramingMonitor allocWithZone(VoidPtr zone);

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
     * An array of framings that the monitor is allowed to suggest.
     * 
     * The monitor is capable of recommending any of the framings in the ``supportedFramings`` array. This property
     * contains the subset of ``supportedFramings`` you would like to have recommended to you. You may set this property
     * at any time while running your ``AVCaptureSession``. This property's default value is the empty array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("enabledFramings")
    @NotNull
    public native NSArray<? extends AVCaptureFraming> enabledFramings();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureSmartFramingMonitor init();

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
     * Yes when the receiver is actively monitoring.
     * 
     * See ``startMonitoringWithError:`` and ``stopMonitoring``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isMonitoring")
    public native boolean isMonitoring();

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
    public static native AVCaptureSmartFramingMonitor new_objc();

    /**
     * The latest recommended framing from the monitor.
     * 
     * While your ``AVCaptureSession`` is running, the monitor continuously observes its device's scene to recommend the
     * best framing. This recommended framing is always one of the values in ``enabledFramings``. This property may
     * return `nil` if smart framing isn't supported for the device in its current configuration. Its default value is
     * `nil`. This property is key-value observable, and when you observe a change, you may respond to the new
     * recommendation by calling ``AVCaptureDevice/setDynamicAspectRatio:completionHandler:`` and setting
     * ``AVCaptureDevice/videoZoomFactor`` on the associated device in whatever order best matches your animation
     * between old and new framings.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("recommendedFraming")
    @Nullable
    public native AVCaptureFraming recommendedFraming();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An array of framings that the monitor is allowed to suggest.
     * 
     * The monitor is capable of recommending any of the framings in the ``supportedFramings`` array. This property
     * contains the subset of ``supportedFramings`` you would like to have recommended to you. You may set this property
     * at any time while running your ``AVCaptureSession``. This property's default value is the empty array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setEnabledFramings:")
    public native void setEnabledFramings(@NotNull NSArray<? extends AVCaptureFraming> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Begins monitoring the device's active scene and making framing recommendations.
     * 
     * - Parameter outError: A pointer to an ``NSError`` indicating why ``startMonitoringWithError:`` failed, or to a
     * `nil` ``NSError`` on success.
     * - Returns: `true` if successful, `false` if monitoring could not be started.
     * 
     * The monitor's ``recommendedFraming`` is `nil` when it is not actively running. Call this method to start
     * monitoring. You may start monitoring before or after calling ``AVCaptureSession/startRunning``, and you may stop
     * active monitoring without stopping the capture session by calling ``stopMonitoring`` at any time, but you must
     * set ``enabledFramings`` before running your capture session so that the monitor is prepared for your desired
     * framing recommendations. While the monitor is running, you may set ``enabledFramings`` at any time to change the
     * framing choices the monitor should consider in its recommendations.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startMonitoringWithError:")
    public native boolean startMonitoringWithError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> outError);

    /**
     * Stops monitoring the device's active scene and making framing recommendations.
     * 
     * The monitor's ``recommendedFraming`` is `nil` when it is not actively running. Call this method to stop actively
     * monitoring the scene and making framing recommendations. You may start monitoring before or after calling
     * ``AVCaptureSession/startRunning``, and may stop active monitoring without stopping the capture session by calling
     * ``stopMonitoring`` at any time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("stopMonitoring")
    public native void stopMonitoring();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An array of framings supported by the monitor in its current configuration.
     * 
     * The monitor is capable of recommending any of the framings in this array. This property is key-value observable
     * and may change as the target capture device's ``AVCaptureDevice/activeFormat`` property changes. This array
     * contains the full set of framings supported by the monitor in the device's current configuration. You must tell
     * the monitor which smart framings you are interested in having recommended to you by setting the
     * ``enabledFramings`` property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportedFramings")
    @NotNull
    public native NSArray<? extends AVCaptureFraming> supportedFramings();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
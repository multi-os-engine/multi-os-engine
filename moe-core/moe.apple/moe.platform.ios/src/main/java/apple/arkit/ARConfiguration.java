package apple.arkit;

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
import apple.avfoundation.AVCaptureDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object to describe and configure the Augmented Reality techniques to be used in an ARSession.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected ARConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARConfiguration allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native ARConfiguration init();

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
     * Enable or disable light estimation.
     * 
     * Enabled by default.
     */
    @Generated
    @Selector("isLightEstimationEnabled")
    public native boolean isLightEstimationEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Determines whether this device supports the ARConfiguration.
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARConfiguration new_objc();

    /**
     * Determines whether to capture and provide audio data.
     * 
     * Disabled by default.
     */
    @Generated
    @Selector("providesAudioData")
    public native boolean providesAudioData();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Enable or disable light estimation.
     * 
     * Enabled by default.
     */
    @Generated
    @Selector("setLightEstimationEnabled:")
    public native void setLightEstimationEnabled(boolean value);

    /**
     * Determines whether to capture and provide audio data.
     * 
     * Disabled by default.
     */
    @Generated
    @Selector("setProvidesAudioData:")
    public native void setProvidesAudioData(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Determines how the coordinate system should be aligned with the world.
     * 
     * The default is ARWorldAlignmentGravity.
     */
    @Generated
    @Selector("setWorldAlignment:")
    public native void setWorldAlignment(@NInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines how the coordinate system should be aligned with the world.
     * 
     * The default is ARWorldAlignmentGravity.
     */
    @Generated
    @Selector("worldAlignment")
    @NInt
    public native long worldAlignment();

    /**
     * The type of semantic understanding to provide with each frame.
     * 
     * Use the `supportsFrameSemantics` class method to check if the configuration type you intend to run supports the
     * set of frame semantics. For example, when running a session with
     * a configuration of type ARWorldTrackingConfiguration one would need to use `+[ ARWorldTrackingConfiguration
     * supportsFrameSemantics:]` to perform said check.
     * An exception is thrown if the option
     * is not supported. Defaults to ARFrameSemanticNone.
     * 
     * @see ARFrameSemantics
     * @see +[ARConfiguration supportsFrameSemantics:]
     * 
     *      API-Since: 13.0
     */
    @Generated
    @Selector("frameSemantics")
    @NUInt
    public native long frameSemantics();

    /**
     * The type of semantic understanding to provide with each frame.
     * 
     * Use the `supportsFrameSemantics` class method to check if the configuration type you intend to run supports the
     * set of frame semantics. For example, when running a session with
     * a configuration of type ARWorldTrackingConfiguration one would need to use `+[ ARWorldTrackingConfiguration
     * supportsFrameSemantics:]` to perform said check.
     * An exception is thrown if the option
     * is not supported. Defaults to ARFrameSemanticNone.
     * 
     * @see ARFrameSemantics
     * @see +[ARConfiguration supportsFrameSemantics:]
     * 
     *      API-Since: 13.0
     */
    @Generated
    @Selector("setFrameSemantics:")
    public native void setFrameSemantics(@NUInt long value);

    /**
     * Video format of the session output.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setVideoFormat:")
    public native void setVideoFormat(@NotNull ARVideoFormat value);

    /**
     * A list of supported video formats for this configuration and device.
     * 
     * The first element in the list is the default format for session output.
     * 
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    /**
     * Determines whether the type of frame semantics is supported by the device and ARConfiguration class.
     * 
     * Semantic frame understanding is not supported on all devices. Use the `supportsFrameSemantics` class method to
     * check if the configuration type you intend to run supports the
     * set of frame semantics. For example, when running a session with a configuration of type
     * ARWorldTrackingConfiguration one would need to use
     * `+[ ARWorldTrackingConfiguration supportsFrameSemantics:]` to perform said check.
     * 
     * @see ARFrameSemantics
     * 
     *      API-Since: 13.0
     */
    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    /**
     * Video format of the session output.
     * 
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @Selector("videoFormat")
    public native ARVideoFormat videoFormat();

    /**
     * Returns a pointer to the capture device of the camera that's used for rendering, so developers can adjust capture
     * settings.
     * 
     * May return nil if it is not recommended to modify capture settings, for example if the primary camera is used for
     * tracking.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("configurableCaptureDeviceForPrimaryCamera")
    public static native AVCaptureDevice configurableCaptureDeviceForPrimaryCamera();

    /**
     * Returns a video format using a 4K resolution from the list of supported video formats.
     * 
     * May return nil if 4K is not supported for this configuration or device.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("recommendedVideoFormatFor4KResolution")
    public static native ARVideoFormat recommendedVideoFormatFor4KResolution();

    /**
     * Returns a recommended video format that supports capturing high resolution frames with a significantly higher
     * resolution than the streaming camera resolution.
     * 
     * Using this format may consume more power. Other video formats may support capturing high resolution frames as
     * well, albeit at a lower quality or resolution.
     * 
     * @see [ARSession captureHighResolutionFrameWithCompletion:]
     * 
     *      API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("recommendedVideoFormatForHighResolutionFrameCapturing")
    public static native ARVideoFormat recommendedVideoFormatForHighResolutionFrameCapturing();

    /**
     * Whether HDR capturing is allowed if the current video format supports it. Defaults to @c NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setVideoHDRAllowed:")
    public native void setVideoHDRAllowed(boolean value);

    /**
     * Whether HDR capturing is allowed if the current video format supports it. Defaults to @c NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("videoHDRAllowed")
    public native boolean videoHDRAllowed();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

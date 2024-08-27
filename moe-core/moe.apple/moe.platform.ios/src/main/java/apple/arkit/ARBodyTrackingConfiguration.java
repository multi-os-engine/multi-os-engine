package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
import apple.avfoundation.AVCaptureDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A configuration for running body tracking.
 * 
 * Body tracking provides 6 degrees of freedom tracking of a detected body in the scene. By default,
 * ARFrameSemanticBodyDetection will be
 * enabled.
 * 
 * @see ARBodyAnchor
 * @see -[ARFrame detectedBody]
 * 
 *      API-Since: 13.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARBodyTrackingConfiguration extends ARConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected ARBodyTrackingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARBodyTrackingConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARBodyTrackingConfiguration allocWithZone(VoidPtr zone);

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of an image.
     * 
     * If set to true ARKit will attempt to use the computed camera positions in order to compute the scale by which the
     * given physical size
     * differs from the estimated one. The information about the estimated scale can be found as the property
     * estimatedScaleFactor on the ARImageAnchor.
     * [@note] When set to true the transform of a returned ARImageAnchor will use the estimated scale factor to correct
     * the translation. Default value is NO.
     */
    @Generated
    @Selector("automaticImageScaleEstimationEnabled")
    public native boolean automaticImageScaleEstimationEnabled();

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of a skeleton in 3D.
     * 
     * If set to true ARKit will attempt to use the computed camera positions in order to compute the scale by which the
     * given physical size
     * differs from the default one. The information about the estimated scale can be found as the property
     * estimatedScaleFactor on the ARBodyAnchor.
     * [@note] When set to true the transform of a returned ARBodyAnchor will use the estimated scale factor to correct
     * the translation. Default value is NO.
     */
    @Generated
    @Selector("automaticSkeletonScaleEstimationEnabled")
    public native boolean automaticSkeletonScaleEstimationEnabled();

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

    /**
     * Images to detect in the scene.
     * 
     * If set the session will attempt to detect the specified images. When an image is detected an ARImageAnchor will
     * be added to the session.
     */
    @NotNull
    @Generated
    @Selector("detectionImages")
    public native NSSet<? extends ARReferenceImage> detectionImages();

    /**
     * The mode of environment texturing to run.
     * 
     * If set, texture information will be accumulated and updated. Adding an AREnvironmentProbeAnchor to the session
     * will get the current environment texture available from that probe's perspective which can be used for lighting
     * virtual objects in the scene. Defaults to AREnvironmentTexturingNone.
     */
    @Generated
    @Selector("environmentTexturing")
    @NInt
    public native long environmentTexturing();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARBodyTrackingConfiguration init();

    /**
     * The initial map of the physical space that world tracking will localize to and track.
     * 
     * If set, the session will attempt to localize to the provided map with
     * a limited tracking state until localization is successful or run is called again
     * with a different (or no) initial map specified. Once localized, the map will be extended
     * and can again be saved using the `getCurrentWorldMap` method on the session.
     */
    @Nullable
    @Generated
    @Selector("initialWorldMap")
    public native ARWorldMap initialWorldMap();

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
     * Enable or disable continuous auto focus.
     * 
     * Enabled by default.
     */
    @Generated
    @Selector("isAutoFocusEnabled")
    public native boolean isAutoFocusEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Maximum number of images to track simultaneously.
     * 
     * Setting the maximum number of tracked images will limit the number of images that can be tracked in a given
     * frame.
     * If more than the maximum is visible, only the images already being tracked will continue to track until tracking
     * is lost or another image is removed.
     * Images will continue to be detected regardless of images tracked. Default value is zero.
     */
    @Generated
    @Selector("maximumNumberOfTrackedImages")
    @NInt
    public native long maximumNumberOfTrackedImages();

    @Generated
    @Owned
    @Selector("new")
    public static native ARBodyTrackingConfiguration new_objc();

    /**
     * Type of planes to detect in the scene.
     * 
     * If set, new planes will continue to be detected and updated over time. Detected planes will be added to the
     * session as
     * ARPlaneAnchor objects. In the event that two planes are merged, the newer plane will be removed. Defaults to
     * ARPlaneDetectionNone.
     */
    @Generated
    @Selector("planeDetection")
    @NUInt
    public native long planeDetection();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Enable or disable continuous auto focus.
     * 
     * Enabled by default.
     */
    @Generated
    @Selector("setAutoFocusEnabled:")
    public native void setAutoFocusEnabled(boolean value);

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of an image.
     * 
     * If set to true ARKit will attempt to use the computed camera positions in order to compute the scale by which the
     * given physical size
     * differs from the estimated one. The information about the estimated scale can be found as the property
     * estimatedScaleFactor on the ARImageAnchor.
     * [@note] When set to true the transform of a returned ARImageAnchor will use the estimated scale factor to correct
     * the translation. Default value is NO.
     */
    @Generated
    @Selector("setAutomaticImageScaleEstimationEnabled:")
    public native void setAutomaticImageScaleEstimationEnabled(boolean value);

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of a skeleton in 3D.
     * 
     * If set to true ARKit will attempt to use the computed camera positions in order to compute the scale by which the
     * given physical size
     * differs from the default one. The information about the estimated scale can be found as the property
     * estimatedScaleFactor on the ARBodyAnchor.
     * [@note] When set to true the transform of a returned ARBodyAnchor will use the estimated scale factor to correct
     * the translation. Default value is NO.
     */
    @Generated
    @Selector("setAutomaticSkeletonScaleEstimationEnabled:")
    public native void setAutomaticSkeletonScaleEstimationEnabled(boolean value);

    /**
     * Images to detect in the scene.
     * 
     * If set the session will attempt to detect the specified images. When an image is detected an ARImageAnchor will
     * be added to the session.
     */
    @Generated
    @Selector("setDetectionImages:")
    public native void setDetectionImages(@NotNull NSSet<? extends ARReferenceImage> value);

    /**
     * The mode of environment texturing to run.
     * 
     * If set, texture information will be accumulated and updated. Adding an AREnvironmentProbeAnchor to the session
     * will get the current environment texture available from that probe's perspective which can be used for lighting
     * virtual objects in the scene. Defaults to AREnvironmentTexturingNone.
     */
    @Generated
    @Selector("setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(@NInt long value);

    /**
     * The initial map of the physical space that world tracking will localize to and track.
     * 
     * If set, the session will attempt to localize to the provided map with
     * a limited tracking state until localization is successful or run is called again
     * with a different (or no) initial map specified. Once localized, the map will be extended
     * and can again be saved using the `getCurrentWorldMap` method on the session.
     */
    @Generated
    @Selector("setInitialWorldMap:")
    public native void setInitialWorldMap(@Nullable ARWorldMap value);

    /**
     * Maximum number of images to track simultaneously.
     * 
     * Setting the maximum number of tracked images will limit the number of images that can be tracked in a given
     * frame.
     * If more than the maximum is visible, only the images already being tracked will continue to track until tracking
     * is lost or another image is removed.
     * Images will continue to be detected regardless of images tracked. Default value is zero.
     */
    @Generated
    @Selector("setMaximumNumberOfTrackedImages:")
    public native void setMaximumNumberOfTrackedImages(@NInt long value);

    /**
     * Type of planes to detect in the scene.
     * 
     * If set, new planes will continue to be detected and updated over time. Detected planes will be added to the
     * session as
     * ARPlaneAnchor objects. In the event that two planes are merged, the newer plane will be removed. Defaults to
     * ARPlaneDetectionNone.
     */
    @Generated
    @Selector("setPlaneDetection:")
    public native void setPlaneDetection(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Determines whether environment textures will be provided with high dynamic range. Enabled by default.
     */
    @Generated
    @Selector("setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines whether environment textures will be provided with high dynamic range. Enabled by default.
     */
    @Generated
    @Selector("wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();

    /**
     * Enable or disable app clip code tracking. Disabled by default. When enabled, detected app clip codes will be
     * surfaced as an ARAppClipCodeAnchor.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("appClipCodeTrackingEnabled")
    public native boolean appClipCodeTrackingEnabled();

    /**
     * Enable or disable app clip code tracking. Disabled by default. When enabled, detected app clip codes will be
     * surfaced as an ARAppClipCodeAnchor.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("setAppClipCodeTrackingEnabled:")
    public native void setAppClipCodeTrackingEnabled(boolean value);

    /**
     * Indicates whether app clip code tracking can be enabled on this device.
     * 
     * API-Since: 14.3
     */
    @Generated
    @Selector("supportsAppClipCodeTracking")
    public static native boolean supportsAppClipCodeTracking();

    @Nullable
    @Generated
    @Selector("configurableCaptureDeviceForPrimaryCamera")
    public static native AVCaptureDevice configurableCaptureDeviceForPrimaryCamera();

    @Nullable
    @Generated
    @Selector("recommendedVideoFormatFor4KResolution")
    public static native ARVideoFormat recommendedVideoFormatFor4KResolution();

    @Nullable
    @Generated
    @Selector("recommendedVideoFormatForHighResolutionFrameCapturing")
    public static native ARVideoFormat recommendedVideoFormatForHighResolutionFrameCapturing();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

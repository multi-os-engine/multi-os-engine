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

/**
 * A configuration for running world tracking.
 * <p>
 * World tracking provides 6 degrees of freedom tracking of the device.
 * By finding feature points in the scene, world tracking enables performing hit-tests against the frame.
 * Tracking can no longer be resumed once the session is paused.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARWorldTrackingConfiguration extends ARConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected ARWorldTrackingConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARWorldTrackingConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARWorldTrackingConfiguration allocWithZone(VoidPtr zone);

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
    public native ARWorldTrackingConfiguration init();

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
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARWorldTrackingConfiguration new_objc();

    /**
     * Type of planes to detect in the scene.
     * <p>
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
     * Type of planes to detect in the scene.
     * <p>
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

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of an image.
     * <p>
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
     * Images to detect in the scene.
     * <p>
     * If set the session will attempt to detect the specified images. When an image is detected an ARImageAnchor will
     * be added to the session.
     */
    @Generated
    @Selector("detectionImages")
    public native NSSet<? extends ARReferenceImage> detectionImages();

    /**
     * Objects to detect in the scene.
     * <p>
     * If set the session will attempt to detect the specified objects. When an object is detected an ARObjectAnchor
     * will be added to the session.
     */
    @Generated
    @Selector("detectionObjects")
    public native NSSet<? extends ARReferenceObject> detectionObjects();

    /**
     * The mode of environment texturing to run.
     * <p>
     * If set, texture information will be accumulated and updated. Adding an AREnvironmentProbeAnchor to the session
     * will get the current environment texture available from that probe's perspective which can be used for lighting
     * virtual objects in the scene. Defaults to AREnvironmentTexturingNone.
     */
    @Generated
    @Selector("environmentTexturing")
    @NInt
    public native long environmentTexturing();

    /**
     * The initial map of the physical space that world tracking will localize to and track.
     * <p>
     * If set, the session will attempt to localize to the provided map with
     * a limited tracking state until localization is successful or run is called again
     * with a different (or no) initial map specified. Once localized, the map will be extended
     * and can again be saved using the `getCurrentWorldMap` method on the session.
     */
    @Generated
    @Selector("initialWorldMap")
    public native ARWorldMap initialWorldMap();

    /**
     * Enable or disable continuous auto focus.
     * <p>
     * Enabled by default.
     */
    @Generated
    @Selector("isAutoFocusEnabled")
    public native boolean isAutoFocusEnabled();

    /**
     * Enable/disable a collaborative session. Disabled by default.
     * <p>
     * When enabled, ARSession will output collaboration data for other participants using its delegate
     * didOutputCollaborationData.
     * It is the responsibility of the caller to send the data to each participant. When data is received by a
     * participant, it
     * should be passed to the ARSession by calling updateWithCollaborationData.
     */
    @Generated
    @Selector("isCollaborationEnabled")
    public native boolean isCollaborationEnabled();

    /**
     * Maximum number of images to track simultaneously.
     * <p>
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

    /**
     * Enable or disable continuous auto focus.
     * <p>
     * Enabled by default.
     */
    @Generated
    @Selector("setAutoFocusEnabled:")
    public native void setAutoFocusEnabled(boolean value);

    /**
     * Enables the estimation of a scale factor which may be used to correct the physical size of an image.
     * <p>
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
     * Enable/disable a collaborative session. Disabled by default.
     * <p>
     * When enabled, ARSession will output collaboration data for other participants using its delegate
     * didOutputCollaborationData.
     * It is the responsibility of the caller to send the data to each participant. When data is received by a
     * participant, it
     * should be passed to the ARSession by calling updateWithCollaborationData.
     */
    @Generated
    @Selector("setCollaborationEnabled:")
    public native void setCollaborationEnabled(boolean value);

    /**
     * Images to detect in the scene.
     * <p>
     * If set the session will attempt to detect the specified images. When an image is detected an ARImageAnchor will
     * be added to the session.
     */
    @Generated
    @Selector("setDetectionImages:")
    public native void setDetectionImages(NSSet<? extends ARReferenceImage> value);

    /**
     * Objects to detect in the scene.
     * <p>
     * If set the session will attempt to detect the specified objects. When an object is detected an ARObjectAnchor
     * will be added to the session.
     */
    @Generated
    @Selector("setDetectionObjects:")
    public native void setDetectionObjects(NSSet<? extends ARReferenceObject> value);

    /**
     * The mode of environment texturing to run.
     * <p>
     * If set, texture information will be accumulated and updated. Adding an AREnvironmentProbeAnchor to the session
     * will get the current environment texture available from that probe's perspective which can be used for lighting
     * virtual objects in the scene. Defaults to AREnvironmentTexturingNone.
     */
    @Generated
    @Selector("setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(@NInt long value);

    /**
     * The initial map of the physical space that world tracking will localize to and track.
     * <p>
     * If set, the session will attempt to localize to the provided map with
     * a limited tracking state until localization is successful or run is called again
     * with a different (or no) initial map specified. Once localized, the map will be extended
     * and can again be saved using the `getCurrentWorldMap` method on the session.
     */
    @Generated
    @Selector("setInitialWorldMap:")
    public native void setInitialWorldMap(ARWorldMap value);

    /**
     * Maximum number of images to track simultaneously.
     * <p>
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
     * Enable or disable running Face Tracking using the front facing camera. Disabled by default.
     * When enabled, ARSession detects faces (if visible in the front-facing camera image) and adds to its list of
     * anchors,
     * an ARFaceAnchor object representing each face.
     * <p>
     * The transform of the ARFaceAnchor objects will be in the world coordinate space.
     *
     * @see ARFaceAnchor
     */
    @Generated
    @Selector("setUserFaceTrackingEnabled:")
    public native void setUserFaceTrackingEnabled(boolean value);

    /**
     * Determines whether environment textures will be provided with high dynamic range. Enabled by default.
     */
    @Generated
    @Selector("setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean value);

    @Generated
    @Selector("supportedVideoFormats")
    public static native NSArray<? extends ARVideoFormat> supportedVideoFormats();

    @Generated
    @Selector("supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(@NUInt long frameSemantics);

    /**
     * Indicates whether user face tracking using the front facing camera can be enabled on this device.
     */
    @Generated
    @Selector("supportsUserFaceTracking")
    public static native boolean supportsUserFaceTracking();

    /**
     * Enable or disable running Face Tracking using the front facing camera. Disabled by default.
     * When enabled, ARSession detects faces (if visible in the front-facing camera image) and adds to its list of
     * anchors,
     * an ARFaceAnchor object representing each face.
     * <p>
     * The transform of the ARFaceAnchor objects will be in the world coordinate space.
     *
     * @see ARFaceAnchor
     */
    @Generated
    @Selector("userFaceTrackingEnabled")
    public native boolean userFaceTrackingEnabled();

    /**
     * Determines whether environment textures will be provided with high dynamic range. Enabled by default.
     */
    @Generated
    @Selector("wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();

    /**
     * Type of scene reconstruction to run. Defaults to ARSceneReconstructionNone.
     * <p>
     * If set to a value other than ARSceneReconstructionNone, output of scene reconstruction will be added to the
     * session as
     * ARMeshAnchor objects.
     *
     * @see ARMeshAnchor
     */
    @Generated
    @Selector("sceneReconstruction")
    @NUInt
    public native long sceneReconstruction();

    /**
     * Type of scene reconstruction to run. Defaults to ARSceneReconstructionNone.
     * <p>
     * If set to a value other than ARSceneReconstructionNone, output of scene reconstruction will be added to the
     * session as
     * ARMeshAnchor objects.
     *
     * @see ARMeshAnchor
     */
    @Generated
    @Selector("setSceneReconstruction:")
    public native void setSceneReconstruction(@NUInt long value);

    /**
     * Indicates whether the scene reconstruction type is supported for the configuration on this device.
     */
    @Generated
    @Selector("supportsSceneReconstruction:")
    public static native boolean supportsSceneReconstruction(@NUInt long sceneReconstruction);

    /**
     * Enable or disable app clip code tracking. Disabled by default. When enabled, detected app clip codes will be
     * surfaced as an ARAppClipCodeAnchor.
     */
    @Generated
    @Selector("appClipCodeTrackingEnabled")
    public native boolean appClipCodeTrackingEnabled();

    /**
     * Enable or disable app clip code tracking. Disabled by default. When enabled, detected app clip codes will be
     * surfaced as an ARAppClipCodeAnchor.
     */
    @Generated
    @Selector("setAppClipCodeTrackingEnabled:")
    public native void setAppClipCodeTrackingEnabled(boolean value);

    /**
     * Indicates whether app clip code tracking can be enabled on this device.
     */
    @Generated
    @Selector("supportsAppClipCodeTracking")
    public static native boolean supportsAppClipCodeTracking();
}

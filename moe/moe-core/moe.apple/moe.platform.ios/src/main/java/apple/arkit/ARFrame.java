package apple.arkit;

import apple.NSObject;
import apple.avfoundation.AVDepthData;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSDictionary;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object encapsulating the state of everything being tracked for a given moment in time.
 * 
 * The model provides a snapshot of all data needed to render a given frame.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARFrame extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected ARFrame(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARFrame alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARFrame allocWithZone(VoidPtr zone);

    /**
     * A list of anchors in the scene.
     */
    @NotNull
    @Generated
    @Selector("anchors")
    public native NSArray<? extends ARAnchor> anchors();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The camera used to capture the frame’s image.
     * 
     * The camera provides the device’s position and orientation as well as camera parameters.
     */
    @NotNull
    @Generated
    @Selector("camera")
    public native ARCamera camera();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * The frame’s captured depth data.
     * 
     * Depth data is only provided with face tracking on frames where depth data was captured.
     */
    @Nullable
    @Generated
    @Selector("capturedDepthData")
    public native AVDepthData capturedDepthData();

    /**
     * A timestamp identifying the depth data.
     */
    @Generated
    @Selector("capturedDepthDataTimestamp")
    public native double capturedDepthDataTimestamp();

    /**
     * The frame’s captured image.
     */
    @NotNull
    @Generated
    @Selector("capturedImage")
    public native CVBufferRef capturedImage();

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

    /**
     * Returns a display transform for the provided viewport size and orientation.
     * 
     * The display transform can be used to convert normalized points in the image-space coordinate system
     * of the captured image to normalized points in the view’s coordinate space. The transform provides the correct
     * rotation
     * and aspect-fill for presenting the captured image in the given orientation and size.
     * 
     * @param orientation  The orientation of the viewport.
     * @param viewportSize The size of the viewport.
     */
    @Generated
    @Selector("displayTransformForOrientation:viewportSize:")
    @ByValue
    public native CGAffineTransform displayTransformForOrientationViewportSize(@NInt long orientation,
            @ByValue CGSize viewportSize);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Searches the frame for objects corresponding to a point in the captured image.
     * 
     * A 2D point in the captured image’s coordinate space can refer to any point along a line segment
     * in the 3D coordinate space. Hit-testing is the process of finding objects in the world located along this line
     * segment.
     * 
     * @param point A point in the image-space coordinate system of the captured image.
     *              Values should range from (0,0) - upper left corner to (1,1) - lower right corner.
     * @param types The types of results to search for.
     * @return An array of all hit-test results sorted from nearest to farthest.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 14.0
     *         Deprecated-Message: Use [ARSession raycast:]
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("hitTest:types:")
    public native NSArray<? extends ARHitTestResult> hitTestTypes(@ByValue CGPoint point, @NUInt long types);

    @Generated
    @Selector("init")
    public native ARFrame init();

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
     * A light estimate representing the light in the scene.
     * 
     * Returns nil if there is no light estimation.
     */
    @Nullable
    @Generated
    @Selector("lightEstimate")
    public native ARLightEstimate lightEstimate();

    @Generated
    @Owned
    @Selector("new")
    public static native ARFrame new_objc();

    /**
     * Feature points in the scene with respect to the frame’s origin.
     * 
     * The feature points are only provided for configurations using world tracking.
     */
    @Nullable
    @Generated
    @Selector("rawFeaturePoints")
    public native ARPointCloud rawFeaturePoints();

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

    /**
     * A timestamp identifying the frame.
     */
    @Generated
    @Selector("timestamp")
    public native double timestamp();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The frame’s camera grain intensity in range 0 to 1.
     * 
     * A camera stream depicts image noise that gives the captured image
     * a grainy look and varies with light conditions.
     * The camera grain intensity can be used to select a texture slice from the frames
     * camera grain texture.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cameraGrainIntensity")
    public native float cameraGrainIntensity();

    /**
     * A tileable texture that contains image noise matching the current camera streams
     * noise properties.
     * 
     * A camera stream depicts image noise that gives the captured image
     * a grainy look and varies with light conditions.
     * The variations are stored along the depth dimension of the camera grain texture
     * and can be selected at runtime using the camera grain intensity of the current frame.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("cameraGrainTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture cameraGrainTexture();

    /**
     * A detected body in the current frame.
     * 
     * @see -[ARConfiguration setFrameSemantics:]
     * 
     *      API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("detectedBody")
    public native ARBody2D detectedBody();

    /**
     * A buffer that represents the estimated depth values for a performed segmentation.
     * 
     * For each non-background pixel in the segmentation buffer the corresponding depth value can be accessed in this
     * buffer.
     * 
     * @see -[ARConfiguration setFrameSemantics:]
     * @see -[ARFrame segmentationBuffer]
     * 
     *      API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("estimatedDepthData")
    public native CVBufferRef estimatedDepthData();

    /**
     * Creates a raycast query originating from the point on the captured image, aligned along the center of the field
     * of view of the camera.
     * 
     * A 2D point in the captured image’s coordinate space and the field of view of the frame's camera is used to create
     * a ray in the 3D cooridnate space originating at the point.
     * 
     * @param point     A point in the image-space coordinate system of the captured image.
     *                  Values should range from (0,0) - upper left corner to (1,1) - lower right corner.
     * @param target    Type of target where the ray should terminate.
     * @param alignment Alignment of the target.
     * 
     *                  API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("raycastQueryFromPoint:allowingTarget:alignment:")
    public native ARRaycastQuery raycastQueryFromPointAllowingTargetAlignment(@ByValue CGPoint point, @NInt long target,
            @NInt long alignment);

    /**
     * A buffer that represents the segmented content of the capturedImage.
     * 
     * In order to identify to which class a pixel has been classified one needs to compare its intensity value with the
     * values
     * found in `ARSegmentationClass`.
     * 
     * @see ARSegmentationClass
     * @see -[ARConfiguration setFrameSemantics:]
     * 
     *      API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("segmentationBuffer")
    public native CVBufferRef segmentationBuffer();

    /**
     * The status of world mapping for the area visible to the frame.
     * 
     * This can be used to identify the state of the world map for the visible area and if additional scanning
     * should be done before saving a world map.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("worldMappingStatus")
    @NInt
    public native long worldMappingStatus();

    /**
     * The status of geo tracking.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("geoTrackingStatus")
    public native ARGeoTrackingStatus geoTrackingStatus();

    /**
     * Scene depth data.
     * 
     * @see ARFrameSemanticSceneDepth.
     * @see -[ARConfiguration setFrameSemantics:]
     * 
     *      API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("sceneDepth")
    public native ARDepthData sceneDepth();

    /**
     * Scene depth data, smoothed for temporal consistency.
     * 
     * @see ARFrameSemanticSmoothedSceneDepth.
     * @see -[ARConfiguration setFrameSemantics:]
     * 
     *      API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("smoothedSceneDepth")
    public native ARDepthData smoothedSceneDepth();

    /**
     * A dictionary of EXIF metadata for the captured image.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("exifData")
    public native NSDictionary<String, ?> exifData();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

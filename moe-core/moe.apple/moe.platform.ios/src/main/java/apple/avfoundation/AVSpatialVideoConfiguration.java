package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * An AVSpatialVideoConfiguration specifies spatial video properties.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpatialVideoConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpatialVideoConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpatialVideoConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVSpatialVideoConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Specifies intrinsic and extrinsic parameters for single or multiple lenses.
     * 
     * The property value is an array of dictionaries describing the camera calibration data for each lens. The camera
     * calibration data includes intrinsics and extrinics with other parameters. This property is only applicable when
     * the projection kind is kCMTagProjectionTypeParametricImmersive. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("cameraCalibrationDataLensCollection")
    @Nullable
    public native NSArray<? extends NSDictionary<String, ?>> cameraCalibrationDataLensCollection();

    /**
     * Specifies the distance between centers of the lenses of the camera system that created the video.
     * 
     * The distance is in micrometers or thousandths of a millimeter. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("cameraSystemBaseline")
    @Nullable
    public native NSNumber cameraSystemBaseline();

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
     * Specifies a relative shift of the left and right images, which changes the zero parallax plane.
     * 
     * The value is in normalized image space and measured over the range of -10000 to 10000 mapping to the uniform
     * range [-1.0...1.0]. The interval of 0.0 to 1.0 or 0 to 10000 maps onto the stereo eye view image width. The
     * negative interval 0.0 to -1.0 or 0 to -10000 similarly map onto the stereo eye view image width. Can be nil if
     * the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("disparityAdjustment")
    @Nullable
    public native NSNumber disparityAdjustment();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Specifies horizontal field of view in thousandths of a degree. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("horizontalFieldOfView")
    @Nullable
    public native NSNumber horizontalFieldOfView();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native AVSpatialVideoConfiguration init();

    /**
     * Initializes an AVSpatialVideoConfiguration with a format description.
     * 
     * The format description is not stored.
     * - Parameter formatDescription: Format description to use to initialize the AVSpatialVideoConfiguration.
     * 
     * - Returns: An instance of AVSpatialVideoConfiguration
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithFormatDescription:")
    public native AVSpatialVideoConfiguration initWithFormatDescription(
            @NotNull CMFormatDescriptionRef formatDescription);

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
    public static native AVSpatialVideoConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies intrinsic and extrinsic parameters for single or multiple lenses.
     * 
     * The property value is an array of dictionaries describing the camera calibration data for each lens. The camera
     * calibration data includes intrinsics and extrinics with other parameters. This property is only applicable when
     * the projection kind is kCMTagProjectionTypeParametricImmersive. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCameraCalibrationDataLensCollection:")
    public native void setCameraCalibrationDataLensCollection(
            @Nullable NSArray<? extends NSDictionary<String, ?>> value);

    /**
     * Specifies the distance between centers of the lenses of the camera system that created the video.
     * 
     * The distance is in micrometers or thousandths of a millimeter. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCameraSystemBaseline:")
    public native void setCameraSystemBaseline(@Nullable NSNumber value);

    /**
     * Specifies a relative shift of the left and right images, which changes the zero parallax plane.
     * 
     * The value is in normalized image space and measured over the range of -10000 to 10000 mapping to the uniform
     * range [-1.0...1.0]. The interval of 0.0 to 1.0 or 0 to 10000 maps onto the stereo eye view image width. The
     * negative interval 0.0 to -1.0 or 0 to -10000 similarly map onto the stereo eye view image width. Can be nil if
     * the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDisparityAdjustment:")
    public native void setDisparityAdjustment(@Nullable NSNumber value);

    /**
     * Specifies horizontal field of view in thousandths of a degree. Can be nil if the value is unknown.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setHorizontalFieldOfView:")
    public native void setHorizontalFieldOfView(@Nullable NSNumber value);

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
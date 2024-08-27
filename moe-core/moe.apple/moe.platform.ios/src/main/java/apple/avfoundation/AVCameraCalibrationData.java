package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVCameraCalibrationData
 * 
 * AVCameraCalibrationData is a model object describing a camera's calibration information.
 * 
 * When rendering effects to images produced by cameras, or performing computer vision tasks such as correcting images
 * for geometric distortions, it is necessary to characterize the camera's calibration information, such as its pixel
 * focal length, principal point, lens distortion characteristics, etc. AVCameraCalibrationData provides this
 * information.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCameraCalibrationData extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCameraCalibrationData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCameraCalibrationData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCameraCalibrationData allocWithZone(VoidPtr zone);

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
    public native AVCameraCalibrationData init();

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
     * [@property] intrinsicMatrixReferenceDimensions
     * 
     * The reference frame dimensions used in calculating a camera's principal point.
     * 
     * A camera's intrinsic matrix expresses values in pixels with respect to a frame of this width and height.
     */
    @Generated
    @Selector("intrinsicMatrixReferenceDimensions")
    @ByValue
    public native CGSize intrinsicMatrixReferenceDimensions();

    /**
     * [@property] inverseLensDistortionLookupTable
     * 
     * An NSData of floats describing the inverse lookup table required to reapply the camera lens' radial distortions
     * to a rectified image.
     * 
     * See lensDistortionLookupTable. If you've rectified an image by removing the distortions characterized by the
     * lensDistortionLookupTable, and now wish to go back to geometrically distorted, you may use the
     * inverseLensDistortionLookupTable. For more information, see the reference implementation below.
     * 
     * If the camera lacks the calibration data needed to accurately characterize lens distortions, this property's
     * value is nil.
     */
    @Nullable
    @Generated
    @Selector("inverseLensDistortionLookupTable")
    public native NSData inverseLensDistortionLookupTable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] lensDistortionCenter
     * 
     * A CGPoint describing the offset of the lens’ distortion center from the top left in
     * intrinsicMatrixReferenceDimensions.
     * 
     * Due to geometric distortions in the image, the center of the distortion may not be equal to the optical center
     * (principal point) of the lens. When making an image rectilinear, the distortion center should be used rather than
     * the optical center of the image. For more information, see the reference implementation below.
     * 
     * If the camera lacks the calibration data needed to accurately characterize lens distortions, this property's
     * value is set to CGPointZero and should not be used.
     */
    @Generated
    @Selector("lensDistortionCenter")
    @ByValue
    public native CGPoint lensDistortionCenter();

    /**
     * [@property] lensDistortionLookupTable
     * 
     * An NSData of floats describing the camera lens' radial distortions.
     * 
     * Images captured by a camera are geometrically warped by radial distortions in the lens. In order to project from
     * the 2D image plane back into the 3D world, the images must be distortion corrected, or made rectilinear. Lens
     * distortion is modeled using a one-dimensional lookup table of 32-bit float values evenly distributed along a
     * radius from the center of the distortion to the farthest corner, with each value representing an elongation or
     * compression of the radius (0.0 for any given point indicates no elongation). This model assumes radially
     * symmetric lens distortion. When dealing with AVDepthData, the disparity / depth map representations are
     * geometrically distorted to align with images produced by the camera. For more information, see the reference
     * implementation below.
     * 
     * If the camera lacks the calibration data needed to accurately characterize lens distortions, this property's
     * value is nil.
     */
    @Nullable
    @Generated
    @Selector("lensDistortionLookupTable")
    public native NSData lensDistortionLookupTable();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCameraCalibrationData new_objc();

    /**
     * [@property] pixelSize
     * 
     * The size of one pixel at intrinsicMatrixReferenceDimensions in millimeters.
     */
    @Generated
    @Selector("pixelSize")
    public native float pixelSize();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

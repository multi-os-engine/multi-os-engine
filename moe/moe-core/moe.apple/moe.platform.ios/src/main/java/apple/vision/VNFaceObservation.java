package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;

/**
 * VNFaceObservation
 * [@superclass] VNDetectedObjectObservation
 * 
 * VNFaceObservation is the result of a face detection request or derivatives like a face landmark request.
 * 
 * The properties filled in this obervation depend on the request being performed. For instance, if just a
 * VNDetectFaceRectanglesRequest was performed the landmarks will not be populated. VNFaceObservation are also used as
 * inputs to other request as defined by the VNFaceObservationAccepting protocol. An example would be the
 * VNDetectFaceLandmarksRequest. This can be helpful for instance if the face rectangles in an image are not derived
 * from a VNDetectFaceRectanglesRequest but instead come from other sources like EXIF or other face detectors. In that
 * case the client of the API creates a VNFaceObservation with the boundingBox (in normalized coordinates) that were
 * based on those detected faces.
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNFaceObservation extends VNDetectedObjectObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNFaceObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNFaceObservation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNFaceObservation allocWithZone(VoidPtr zone);

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
    public native VNFaceObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNFaceObservation initWithCoder(NSCoder coder);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The face landmarks populated by the VNDetectFaceLandmarksRequest. This is set to nil if only a
     * VNDetectFaceRectanglesRequest was performed.
     */
    @Generated
    @Selector("landmarks")
    public native VNFaceLandmarks2D landmarks();

    @Generated
    @Owned
    @Selector("new")
    public static native VNFaceObservation new_objc();

    @Generated
    @Selector("observationWithBoundingBox:")
    public static native VNFaceObservation observationWithBoundingBox(@ByValue CGRect boundingBox);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The capture quality of the face as a normalized value between 0.0 and 1.0 that can be used to compare the quality
     * of the face in terms of it capture attributes (lighting, blur, position). This score can be used to compare the
     * capture quality of a face against other captures of the same face in a given set.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("faceCaptureQuality")
    public native NSNumber faceCaptureQuality();

    /**
     * Create a new VNFaceObservation with a normalized bounding box, roll and yaw.
     * 
     * @param requestRevision The revision of the VNDetectFaceRectanglesRequest that provided the bounding box. If this
     *                        observation is being created with data that did not originate from a Vision request, this
     *                        parameter should be VNRequestRevisionUnspecified.
     * @param roll            The roll angle of the face, reported in radians. A positive angle corresponds to
     *                        counterclockwise direction, range [-Pi, Pi). If no roll information is available, this
     *                        parameter should be nil.
     * @param yaw             The yaw angle of the face, reported in radians. A positive angle corresponds to
     *                        counterclockwise direction, range [-Pi/2, Pi/2). If no yaw information is available, this
     *                        parameter should be nil.
     * @param pitch           The pitch angle of the face, reported in radians. A positive angle corresponds to nodding
     *                        head down direction, range [-Pi/2, Pi/2]. If no pitch information is available, this
     *                        parameter should be nil.
     * 
     *                        API-Since: 12.0
     *                        Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("faceObservationWithRequestRevision:boundingBox:roll:yaw:")
    public static native VNFaceObservation faceObservationWithRequestRevisionBoundingBoxRollYaw(
            @NUInt long requestRevision, @ByValue CGRect boundingBox, NSNumber roll, NSNumber yaw);

    @Generated
    @Selector("observationWithRequestRevision:boundingBox:")
    public static native VNFaceObservation observationWithRequestRevisionBoundingBox(@NUInt long requestRevision,
            @ByValue CGRect boundingBox);

    /**
     * Face roll angle populated by VNDetectFaceRectanglesRequest. The roll is reported in radians, positive angle
     * corresponds to counterclockwise direction, range [-Pi, Pi). nil value indicates that the roll angle hasn't been
     * computed
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("roll")
    public native NSNumber roll();

    /**
     * Face yaw angle populated by VNDetectFaceRectanglesRequest. The yaw is reported in radians, positive angle
     * corresponds to counterclockwise direction, range [-Pi/2, Pi/2]. nil value indicates that the yaw angle hasn't
     * been computed
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("yaw")
    public native NSNumber yaw();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("faceObservationWithRequestRevision:boundingBox:roll:yaw:pitch:")
    public static native VNFaceObservation faceObservationWithRequestRevisionBoundingBoxRollYawPitch(
            @NUInt long requestRevision, @ByValue CGRect boundingBox, NSNumber roll, NSNumber yaw, NSNumber pitch);

    /**
     * Face pitch angle populated by VNDetectFaceRectanglesRequest. The pitch is reported in radians, positive angle
     * corresponds to nodding head down direction, range [-Pi/2, Pi/2]. nil value indicates that the pitch angle hasn't
     * been computed
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("pitch")
    public native NSNumber pitch();
}

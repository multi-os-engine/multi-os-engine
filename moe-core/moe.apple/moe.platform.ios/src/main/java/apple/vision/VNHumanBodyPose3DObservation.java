package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNHumanBodyPose3DObservation extends VNRecognizedPoints3DObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNHumanBodyPose3DObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNHumanBodyPose3DObservation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VNHumanBodyPose3DObservation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * All of the joint names available in the observation.
     */
    @Generated
    @Selector("availableJointNames")
    @NotNull
    public native NSArray<String> availableJointNames();

    /**
     * All of the joints group names available in the observation.
     */
    @Generated
    @Selector("availableJointsGroupNames")
    @NotNull
    public native NSArray<String> availableJointsGroupNames();

    /**
     * Estimated human height, in meters.
     * [@note] A measured height will be returned in meters if `heightEstimation` is
     * `VNHumanBodyPose3DObservationHeightEstimationMeasured`, otherwise reference height of 1.8 meters is returned for
     * `VNHumanBodyPose3DObservationHeightEstimationReference`
     */
    @Generated
    @Selector("bodyHeight")
    public native float bodyHeight();

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
     * Obtain position relative to camera for a named human body joint in meters
     * 
     * @param modelPositionOut A reference to a simd_float4x4 that will be updated to contain position of a joint
     *                         relative to the camera if successful
     * @param jointName        The name of the human body joint
     * @return BOOL indicating success of determing position
     */
    @Generated
    @Selector("getCameraRelativePosition:forJointName:error:")
    public native boolean getCameraRelativePositionForJointNameError(@NotNull VoidPtr modelPositionOut,
            @NotNull String jointName, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Technique used to estimate body height. `VNHumanBodyPose3DObservationHeightEstimationMeasured`
     * indicates`bodyHeight` returns measured height in meters more accurate to true world height.
     * `VNHumanBodyPose3DObservationHeightEstimationReference` indicates `bodyHeight` returns reference height of 1.8 m
     */
    @Generated
    @Selector("heightEstimation")
    @NInt
    public native long heightEstimation();

    @Generated
    @Selector("init")
    public native VNHumanBodyPose3DObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNHumanBodyPose3DObservation initWithCoder(@NotNull NSCoder coder);

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
    public static native VNHumanBodyPose3DObservation new_objc();

    /**
     * Obtain the parent joint of a specified joint
     * 
     * @param jointName The name of the human body joint
     * @return The name of the parent joint
     */
    @Generated
    @Selector("parentJointNameForJointName:")
    @Nullable
    public native String parentJointNameForJointName(@NotNull String jointName);

    /**
     * Obtain 2D point relative to the input image for named human body joint
     * 
     * @param jointName The name of the human body joint
     * @return A projection of the determined 3D position onto the original 2D image in normalized, lower left origin
     *         coordinates
     */
    @Generated
    @Selector("pointInImageForJointName:error:")
    @Nullable
    public native VNPoint pointInImageForJointNameError(@NotNull String jointName,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Obtain a specific point for a named human body joint.
     * Each returned `VNHumanBodyRecognizedPoint3D` instance contains position relative to the model (`position`) and
     * the parent joint (`localPosition`)
     * Model position is relative to root joint (hip) for a named human body joint in meters .
     * Local position is relative to parent joint for a named human body joint in meters.
     * 
     * @param jointName The name of the human body joint.
     * @param error     The address of a variable that will be populated with the error that describes the failure. If
     *                  the caller does not require this information, NULL can be passed.
     * @return The recognized point, or nil if the point could not be obtained.
     */
    @Generated
    @Selector("recognizedPointForJointName:error:")
    @Nullable
    public native VNHumanBodyRecognizedPoint3D recognizedPointForJointNameError(@NotNull String jointName,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Obtains the collection of joints associated with a named human body joints group.
     * 
     * The obtained collection is a dictionary that provides the mapping of human joint names to the recognized point.
     * 
     * @param jointsGroupName The name of the human body joints group.
     * @param error           The address of a variable that will be populated with the error that describes the
     *                        failure. If the caller does not require this information, NULL can be passed.
     * @return a dictionary of recognized points in the group, or nil if an error was encountered.
     */
    @Generated
    @Selector("recognizedPointsForJointsGroupName:error:")
    @Nullable
    public native NSDictionary<String, ? extends VNHumanBodyRecognizedPoint3D> recognizedPointsForJointsGroupNameError(
            @NotNull String jointsGroupName, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
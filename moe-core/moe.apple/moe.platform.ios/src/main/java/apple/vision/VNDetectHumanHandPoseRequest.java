package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Detects specific landmark points on human hands.
 * 
 * This request will produce a collection of VNRecognizedPointsObservation objects which describe the pose of each
 * detected human hand.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectHumanHandPoseRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectHumanHandPoseRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectHumanHandPoseRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNDetectHumanHandPoseRequest allocWithZone(VoidPtr zone);

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
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNDetectHumanHandPoseRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectHumanHandPoseRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

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
     * Defines an upper bounds to the maximum number of hands that will be processed for key points in an image.
     * 
     * The complexity in key points determination is scalable by the number of hands to be processed. All hands detected
     * in an image will be ordered by relative size, with only the N largest ones having key points determined. The
     * default value for this property is 2. The maximum value for VNDetectHumanHandPoseRequestRevision1 is 6.
     */
    @Generated
    @Selector("maximumHandCount")
    @NUInt
    public native long maximumHandCount();

    @Generated
    @Owned
    @Selector("new")
    public static native VNDetectHumanHandPoseRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * VNHumanHandPoseObservation results.
     */
    @Nullable
    @Generated
    @Selector("results")
    public native NSArray<? extends VNHumanHandPoseObservation> results();

    /**
     * Defines an upper bounds to the maximum number of hands that will be processed for key points in an image.
     * 
     * The complexity in key points determination is scalable by the number of hands to be processed. All hands detected
     * in an image will be ordered by relative size, with only the N largest ones having key points determined. The
     * default value for this property is 2. The maximum value for VNDetectHumanHandPoseRequestRevision1 is 6.
     */
    @Generated
    @Selector("setMaximumHandCount:")
    public native void setMaximumHandCount(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Obtain the collection of human hand joint names that are supported by a given request revision.
     * 
     * @param revision The revision of VNDetectHumanHandPoseRequest being queried.
     * @param error    The address of a variable that will be populated with an error upon failure. If the caller does
     *                 not need this information, NULL can be passed.
     * @return An array of VNHumanHandPoseObservationJointName symbols that are supported by the request revision, or
     *         nil if a failure occurs.
     * 
     *         API-Since: 14.0
     *         Deprecated-Since: 17.0
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("supportedJointNamesForRevision:error:")
    public static native NSArray<String> supportedJointNamesForRevisionError(@NUInt long revision,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Obtain the collection of human hand joints group names that are supported by a given request revision.
     * 
     * @param revision The revision of VNDetectHumanHandPoseRequest being queried.
     * @param error    The address of a variable that will be populated with an error upon failure. If the caller does
     *                 not need this information, NULL can be passed.
     * @return An array of VNHumanHandPoseObservationJointsGroupName symbols that are supported by the request revision,
     *         or nil if a failure occurs.
     * 
     *         API-Since: 14.0
     *         Deprecated-Since: 17.0
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("supportedJointsGroupNamesForRevision:error:")
    public static native NSArray<String> supportedJointsGroupNamesForRevisionError(@NUInt long revision,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Obtain the collection of human hand joint names that are supported by a given request object configured with a
     * specific revision.
     * 
     * @param error The address of a variable that will be populated with an error upon failure. If the caller does not
     *              need this information, NULL can be passed.
     * @return An array of VNHumanHandPoseObservationJointName symbols that are supported by the request revision, or
     *         nil if a failure occurs.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Selector("supportedJointNamesAndReturnError:")
    @Nullable
    public native NSArray<String> supportedJointNamesAndReturnError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Obtain the collection of human hand joints group names that are supported by a given request object configured
     * with a specific revision.
     * 
     * @param error The address of a variable that will be populated with an error upon failure. If the caller does not
     *              need this information, NULL can be passed.
     * @return An array of VNHumanHandPoseObservationJointsGroupName symbols that are supported by the request revision,
     *         or nil if a failure occurs.
     * 
     *         API-Since: 17.0
     */
    @Generated
    @Selector("supportedJointsGroupNamesAndReturnError:")
    @Nullable
    public native NSArray<String> supportedJointsGroupNamesAndReturnError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

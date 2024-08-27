package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Detects specific landmark points on animal bodies.
 * 
 * This request will produce a collection of VNAnimalBodyPoseObservation objects which describe the pose of each
 * detected animal body.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectAnimalBodyPoseRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectAnimalBodyPoseRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectAnimalBodyPoseRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VNDetectAnimalBodyPoseRequest allocWithZone(VoidPtr zone);

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
    public native VNDetectAnimalBodyPoseRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectAnimalBodyPoseRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") @Nullable VNRequest.Block_initWithCompletionHandler completionHandler);

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
    public static native VNDetectAnimalBodyPoseRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * VNAnimalBodyPoseObservation results.
     */
    @Generated
    @Selector("results")
    @Nullable
    public native NSArray<? extends VNAnimalBodyPoseObservation> results();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Obtain the collection of animal body joint names that are supported by a request object configured with a request
     * revision.
     * 
     * @param error The address of a variable that will be populated with an error upon failure. If the caller does not
     *              need this information, NULL can be passed.
     * @return An array of VNAnimalBodyPoseObservationJointName symbols that are supported by the request, or nil if a
     *         failure occurs.
     */
    @Generated
    @Selector("supportedJointNamesAndReturnError:")
    @Nullable
    public native NSArray<String> supportedJointNamesAndReturnError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Obtain the collection of animal body joints group names that are supported by a request object configured with a
     * request revision.
     * 
     * @param error The address of a variable that will be populated with an error upon failure. If the caller does not
     *              need this information, NULL can be passed.
     * @return An array of VNAnimalBodyPoseObservationJointsGroupName symbols that are supported by the request, or nil
     *         if a failure occurs.
     */
    @Generated
    @Selector("supportedJointsGroupNamesAndReturnError:")
    @Nullable
    public native NSArray<String> supportedJointsGroupNamesAndReturnError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("supportedRevisions")
    @NotNull
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
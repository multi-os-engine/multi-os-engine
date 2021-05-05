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
import org.moe.natj.general.ann.MappedReturn;
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
 * Detects specific landmark points on human bodies.
 * 
 * This request will produce a collection of VNHumanBodyPoseObservation objects which describe the pose of each detected human body.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectHumanBodyPoseRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectHumanBodyPoseRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectHumanBodyPoseRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    public native VNDetectHumanBodyPoseRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectHumanBodyPoseRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * VNHumanBodyPoseObservation results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNHumanBodyPoseObservation> results();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportedIdentifiedPointGroupKeysForRevision:error:")
    public static native NSArray<String> supportedIdentifiedPointGroupKeysForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportedIdentifiedPointKeysForRevision:error:")
    public static native NSArray<String> supportedIdentifiedPointKeysForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Obtain the collection of human body joint names that are supported by a given request revision.
     * 
     * @param revision The revision of VNDetectHumanBodyPoseRequest being queried.
     * @param error The address of a variable that will be populated with an error upon failure.  If the caller does not need this information, NULL can be passed.
     * @return An array of VNHumanBodyPoseObservationJointName symbols that are supported by the request revision, or nil if a failure occurs.
     */
    @Generated
    @Selector("supportedJointNamesForRevision:error:")
    public static native NSArray<String> supportedJointNamesForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Obtain the collection of human body joints group names that are supported by a given request revision.
     * 
     * @param revision The revision of VNDetectHumanBodyPoseRequest being queried.
     * @param error The address of a variable that will be populated with an error upon failure.  If the caller does not need this information, NULL can be passed.
     * @return An array of VNHumanBodyPoseObservationJointsGroupName symbols that are supported by the request revision, or nil if a failure occurs.
     */
    @Generated
    @Selector("supportedJointsGroupNamesForRevision:error:")
    public static native NSArray<String> supportedJointsGroupNamesForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportedRecognizedPointGroupKeysForRevision:error:")
    public static native NSArray<String> supportedRecognizedPointGroupKeysForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportedRecognizedPointKeysForRevision:error:")
    public static native NSArray<String> supportedRecognizedPointKeysForRevisionError(@NUInt long revision,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
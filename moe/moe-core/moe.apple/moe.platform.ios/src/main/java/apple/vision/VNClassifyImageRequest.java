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

/**
 * A request for classifying an image.
 * 
 * This request will produce a collection of VNClassificationObservation objects which describe an image.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNClassifyImageRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNClassifyImageRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNClassifyImageRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNClassifyImageRequest allocWithZone(VoidPtr zone);

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
    public native VNClassifyImageRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNClassifyImageRequest initWithCompletionHandler(
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

    /**
     * Obtain the collection of classifications currently recognized by the Vision framework.
     * 
     * @param requestRevision The revision of the request for which classifications should be reported.
     * 
     * @param error           The address of the variable that will be populated with the error when the call fails.
     * 
     * @return the collection of classifications for the revision, or nil if an error was encountered.
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("knownClassificationsForRevision:error:")
    public static native NSArray<? extends VNClassificationObservation> knownClassificationsForRevisionError(
            @NUInt long requestRevision, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native VNClassifyImageRequest new_objc();

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
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * VNClassificationObservation results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNClassificationObservation> results();

    /**
     * Obtain the collection of identifiers supported by the target request.
     * 
     * This method will return the collection of all possible classification identifiers that are produced by the target
     * request based on its current state of configuration at the time of the call.
     * 
     * @param error The address of the variable that will be populated with the error if the call fails.
     * 
     * @return The collection of classification identifiers, or nil if a failure occurs.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @Selector("supportedIdentifiersAndReturnError:")
    public native NSArray<String> supportedIdentifiersAndReturnError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

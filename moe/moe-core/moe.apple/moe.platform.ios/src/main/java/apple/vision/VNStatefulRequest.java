package apple.vision;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A request that builds evidence over time by being reused on multiple images.
 * <p>
 * The request requires the use of CMSampleBuffers with timestamps as input; otherwise, a VNErrorTimeStampNotFound error will be returned. VNStatefulRequest is used as a base class of other requests, so no objects of this class should be created directly.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNStatefulRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNStatefulRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNStatefulRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native VNStatefulRequest allocWithZone(VoidPtr zone);

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

    /**
     * The reciprocal of maximum rate at which buffers will be processed.
     * <p>
     * The request will not process buffers that fall within the requestFrameAnalysisSpacing after it has performed the analysis. The analysis is not done by wall time but by analysis of of the time stamps of the samplebuffers being processed.
     */
    @Generated
    @Selector("frameAnalysisSpacing")
    @ByValue
    public native CMTime frameAnalysisSpacing();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNStatefulRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNStatefulRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    /**
     * Create a new video-based stateful request.
     *
     * @param frameAnalysisSpacing The reciprocal of maximum rate at which buffers will be processed. The request will not process buffers that fall within the frameAnalysisSpacing after it has performed the analysis. The analysis is not done by wall time but by analysis of of the time stamps of the samplebuffers being processed.
     * @param completionHandler    The block to be invoked after the request has completed its processing. The completion handler gets executed on the same dispatch queue as the request being executed.
     */
    @Generated
    @Selector("initWithFrameAnalysisSpacing:completionHandler:")
    public native VNStatefulRequest initWithFrameAnalysisSpacingCompletionHandler(@ByValue CMTime frameAnalysisSpacing,
            @ObjCBlock(name = "call_initWithFrameAnalysisSpacingCompletionHandler") Block_initWithFrameAnalysisSpacingCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithFrameAnalysisSpacingCompletionHandler {
        @Generated
        void call_initWithFrameAnalysisSpacingCompletionHandler(VNRequest request, NSError error);
    }

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
     * The minimum number of frames that the request has to process on before reporting back any observation. This information is provided by the request once initialized with its required paramters.
     * <p>
     * Video based request often need a minimum number of frames before they can report back any observation. An example would be that a movement detection requires at least 5 frames to be detected. The minimumLatencyFrameCount for that request would report 5 and only after 5 frames have been processed an observation would be returned in the results. This latency is indicative of how responsive a request is in respect to the incoming data.
     */
    @Generated
    @Selector("minimumLatencyFrameCount")
    @NInt
    public native long minimumLatencyFrameCount();

    @Generated
    @Owned
    @Selector("new")
    public static native VNStatefulRequest new_objc();

    @Generated
    @Selector("requestFrameAnalysisSpacing")
    @ByValue
    public native CMTime requestFrameAnalysisSpacing();

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
}

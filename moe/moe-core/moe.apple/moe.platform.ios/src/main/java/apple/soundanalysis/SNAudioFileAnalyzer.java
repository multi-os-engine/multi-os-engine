package apple.soundanalysis;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.soundanalysis.protocol.SNRequest;
import apple.soundanalysis.protocol.SNResultsObserving;
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
 * Analyzes an audio file and provides analysis results to the client
 * 
 * API-Since: 13.0
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SNAudioFileAnalyzer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SNAudioFileAnalyzer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a new analysis request to the analyzer
     * 
     * If addRequest is called while the file is being processed, an error will be returned.
     * 
     * @param request  An audio analysis request to be performed on the audio stream
     * @param observer The object that will receive the analysis results for the supplied request. The observer is
     *                 weakly retained by the analyzer.
     * @param error    On input, a pointer to an error object. If an error occurs, this pointer is set to an actual
     *                 error object containing the error information. You may specify nil for this parameter if you do
     *                 not want the error information.
     * @return YES if the request was successfully added, and NO otherwise.
     */
    @Generated
    @Selector("addRequest:withObserver:error:")
    public native boolean addRequestWithObserverError(@Mapped(ObjCObjectMapper.class) SNRequest request,
            @Mapped(ObjCObjectMapper.class) SNResultsObserving observer,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SNAudioFileAnalyzer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SNAudioFileAnalyzer allocWithZone(VoidPtr zone);

    /**
     * Analyzes the audio file synchronously
     * 
     * This function executes synchronously. Any errors produced during analysis will flow downstream to the request
     * observers. This method may block for a long period of time, so be careful to ensure this call does not block UI
     * or other important tasks.
     */
    @Generated
    @Selector("analyze")
    public native void analyze();

    /**
     * Analyzes the audio file asynchronously
     * 
     * This function executes asynchronously, calling the completion after the entire file has completed analysis. Any
     * errors produced during analysis will flow downstream to the request observers. If the cancelAnalysis method is
     * called, the completionHandler will still be called, but with didReachEndOfFile set to NO.
     */
    @Generated
    @Selector("analyzeWithCompletionHandler:")
    public native void analyzeWithCompletionHandler(
            @ObjCBlock(name = "call_analyzeWithCompletionHandler") Block_analyzeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_analyzeWithCompletionHandler {
        @Generated
        void call_analyzeWithCompletionHandler(boolean didReachEndOfFile);
    }

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Cancels any in-progress analysis of the audio file
     * 
     * This function executes asynchronously, and will trigger the completion handler provided in the
     * analyzeWithCompletionHandler method after the cancellation is complete.
     */
    @Generated
    @Selector("cancelAnalysis")
    public native void cancelAnalysis();

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
    public native SNAudioFileAnalyzer init();

    /**
     * Creates a new analyzer
     * 
     * @param url   The url for the audio file to be analyzed
     * @param error On input, a pointer to an error object. If an error occurs, this pointer is set to an actual error
     *              object containing the error information. You may specify nil for this parameter if you do not want
     *              the error information.
     */
    @Generated
    @Selector("initWithURL:error:")
    public native SNAudioFileAnalyzer initWithURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native SNAudioFileAnalyzer new_objc();

    /**
     * Removes all requests from the analyzer
     */
    @Generated
    @Selector("removeAllRequests")
    public native void removeAllRequests();

    /**
     * Removes an existing analysis request from the analyzer
     * 
     * Requests can be removed while analysis is in progress. Once the removeRequest method returns, the previously
     * registered observer will not receive any more callbacks.
     * 
     * @param request An audio analysis request to be removed
     */
    @Generated
    @Selector("removeRequest:")
    public native void removeRequest(@Mapped(ObjCObjectMapper.class) SNRequest request);

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
}

package apple.soundanalysis;

import apple.NSObject;
import apple.avfaudio.AVAudioBuffer;
import apple.avfaudio.AVAudioFormat;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Analyzes a stream of audio data and provides analysis results to the client
 * 
 * SNAudioStreamAnalyzer should be used to analyze a stream of audio, represented by a sequence of audio buffers over
 * time.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SNAudioStreamAnalyzer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SNAudioStreamAnalyzer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a new analysis request to the analyzer
     * 
     * Requests can be added while analysis is in progress. If the analyzer cannot perform the requested analysis, an
     * error will be returned. For example, an error could be returned if the request requires a stream format that
     * doesn't match the analyzer's stream format.
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
    public native boolean addRequestWithObserverError(@NotNull @Mapped(ObjCObjectMapper.class) SNRequest request,
            @NotNull @Mapped(ObjCObjectMapper.class) SNResultsObserving observer,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SNAudioStreamAnalyzer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SNAudioStreamAnalyzer allocWithZone(VoidPtr zone);

    /**
     * Provides the next buffer for analysis
     * 
     * The framePosition should be a monotonically increasing sample timestamp. If the sample timeline is detected to be
     * non-continuous, the analyzer's internal state may reset to account for the jump. Some types of audio analysis are
     * performed at a fixed block size, which may differ from the buffer sizes provided for analysis. For this reason,
     * an invocation of analyzeAudioBuffer may cause an analysis request observer to be called zero times, one time, or
     * many times, depending on the relationship between the input buffer size, current analyzer state, and native
     * analysis block size. Any errors produced during analysis will be provided through the request observers. This
     * method may block as a means of indicating backpressure to the caller. These methods are not safe to call from a
     * realtime audio context but may be called from lower priority threads (i.e. AVAudioEngine tap callback or
     * AudioQueue callback).
     * 
     * @param audioBuffer        The buffer containing the audio to be processed
     * @param audioFramePosition The frame position of the data in the buffer
     */
    @Generated
    @Selector("analyzeAudioBuffer:atAudioFramePosition:")
    public native void analyzeAudioBufferAtAudioFramePosition(@NotNull AVAudioBuffer audioBuffer,
            long audioFramePosition);

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

    /**
     * Indicates that the audio stream has ended, and no more audio buffers will be analyzed
     * 
     * After this method has been called, it is invalid to provide any more audio data for analysis, and any provided
     * buffers will be ignored. This method is useful for types of analysis that may have final results to provide upon
     * the completion of the stream.
     */
    @Generated
    @Selector("completeAnalysis")
    public native void completeAnalysis();

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
    public native SNAudioStreamAnalyzer init();

    /**
     * Creates a new analyzer
     * 
     * @param format The format of the audio stream to be analyzed. Only PCM formats are supported.
     */
    @Generated
    @Selector("initWithFormat:")
    public native SNAudioStreamAnalyzer initWithFormat(@NotNull AVAudioFormat format);

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

    @Generated
    @Owned
    @Selector("new")
    public static native SNAudioStreamAnalyzer new_objc();

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
    public native void removeRequest(@NotNull @Mapped(ObjCObjectMapper.class) SNRequest request);

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

package apple.vision;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * A controller object that is used to perform one or more requests on a video stream.
 * 
 * VNVideoProcessor handles the video decoding and buffer management, feeding the buffers to the associated requests at
 * the best desired frame rate.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNVideoProcessor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VNVideoProcessor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add a VNRequest with the specified processing options to be performed on the video.
     * 
     * This method can be called either before calling -analyzeTimeRange:error: or from within one of the already
     * associated request's completion handlers.
     * 
     * [@note] The VNRequest must have completion handler set otherwise no results can be returned.
     * 
     * @param request           The VNRequest to be added to the processing pipeline. If added from within a
     *                          completionHandler, it will be processed on the same frame that is currently being
     *                          processed.
     * @param processingOptions The options applied to the request's processing of the video.
     * @param error             Returns an error that happened during scheduling of the requests. Check individual
     *                          requests results and errors for their respective success and failures. This parameter is
     *                          optional.
     * @return Returns true if the request added to the processing pipeline.
     */
    @Generated
    @Selector("addRequest:processingOptions:error:")
    public native boolean addRequestProcessingOptionsError(@NotNull VNRequest request,
            @NotNull VNVideoProcessorRequestProcessingOptions processingOptions,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("addRequest:withProcessingOptions:error:")
    public native boolean addRequestWithProcessingOptionsError(@NotNull VNRequest request,
            @NotNull NSDictionary<String, ?> processingOptions,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNVideoProcessor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNVideoProcessor allocWithZone(VoidPtr zone);

    /**
     * Processes the video over the specified time range.
     * 
     * This call is synchronous and only returns after the video is processed through its duration or an error prevented
     * the processing.
     * 
     * [@note] The intersection of the CMTimeRangeMake(start, duration) and CMTimeRangeMake(kCMTimeZero, asset.duration)
     * will determine the timerange of the video to process
     * 
     * @param timeRange Start and duration of the timerange within video to process. If the duration is longer than the
     *                  video (e.g., kCMTimeIndefinite) the processing stops at the end of the video.
     * @param error     Returns an error that happened during the starting of the processing queue (for instance if the
     *                  time range is not valid for the video asset). This parameter is optional.
     * @return Returns true if all requests were scheduled and performed. Check individual requests results and errors
     *         for their respective success and failures.
     */
    @Generated
    @Selector("analyzeTimeRange:error:")
    public native boolean analyzeTimeRangeError(@ByValue CMTimeRange timeRange,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("analyzeWithTimeRange:error:")
    public native boolean analyzeWithTimeRangeError(@ByValue CMTimeRange timeRange,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancel the processing of the video. This can return before the last request has completed.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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
    public native VNVideoProcessor init();

    /**
     * Creates a VNVideoProcessor to be used for performing requests against a video asset specified by it's URL.
     * 
     * @param videoURL A URL pointing at a video asset on which the requests will be performed. The video format has to
     *                 be supported by AVFoundation.
     */
    @Generated
    @Selector("initWithURL:")
    public native VNVideoProcessor initWithURL(@NotNull NSURL videoURL);

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
    public static native VNVideoProcessor new_objc();

    /**
     * Remove a VNRequest from the video processor, which means it won't be performed anymore.
     * 
     * This method can be called either before calling -analyzeTimeRange:error: or from within one of the already
     * associated request's completion handlers.
     * 
     * @param request The VNRequest to be removed from the processing pipeline.
     * @param error   Returns an error that happened during processing of the request, such as if the request was not
     *                found in the processing queue. This parameter is optional.
     * @return Returns true if the request was found and removed from the processing pipeline.
     */
    @Generated
    @Selector("removeRequest:error:")
    public native boolean removeRequestError(@NotNull VNRequest request,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

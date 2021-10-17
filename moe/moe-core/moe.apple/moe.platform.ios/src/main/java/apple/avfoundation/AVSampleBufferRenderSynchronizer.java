package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVQueuedSampleBufferRendering;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * AVSampleBufferRenderSynchronizer
 * <p>
 * AVSampleBufferRenderSynchronizer can synchronize multiple objects conforming to AVQueuedSampleBufferRendering to a single timebase.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferRenderSynchronizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferRenderSynchronizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addBoundaryTimeObserverForTimes:queue:usingBlock:
     * <p>
     * Requests invocation of a block when specified times are traversed during normal rendering.
     * <p>
     * Each call to -addPeriodicTimeObserverForInterval:queue:usingBlock: should be paired with a corresponding call to -removeTimeObserver:.  Releasing the observer object without a call to -removeTimeObserver: will result in undefined behavior.
     *
     * @return An object conforming to the NSObject protocol.  You must retain this returned value as long as you want the time observer to be invoked by the synchronizer.  Pass this object to -removeTimeObserver: to cancel time observation.
     * @param            times The times for which the observer requests notification, supplied as an array of NSValues carrying CMTimes.
     * @param            queue The serial queue onto which block should be enqueued.  If you pass NULL, the main queue (obtained using dispatch_get_main_queue()) will be used.  Passing a
     * concurrent queue to this method will result in undefined behavior.
     * @param            block The block to be invoked when any of the specified times is crossed during normal rendering.
     */
    @Generated
    @Selector("addBoundaryTimeObserverForTimes:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addBoundaryTimeObserverForTimesQueueUsingBlock(NSArray<? extends NSValue> times,
            NSObject queue,
            @ObjCBlock(name = "call_addBoundaryTimeObserverForTimesQueueUsingBlock") Block_addBoundaryTimeObserverForTimesQueueUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addBoundaryTimeObserverForTimesQueueUsingBlock {
        @Generated
        void call_addBoundaryTimeObserverForTimesQueueUsingBlock();
    }

    /**
     * addPeriodicTimeObserverForInterval:queue:usingBlock:
     * <p>
     * Requests invocation of a block during rendering to report changing time.
     * <p>
     * The block is invoked periodically at the interval specified, interpreted according to the timeline of the timebase.  The block is also invoked whenever time jumps and whenever rendering starts or stops.
     * <p>
     * If the interval corresponds to a very short interval in real time, the synchronizer may invoke the block less frequently than requested. Even so, the synchronizer will invoke the block sufficiently often for the client to update indications of the current time appropriately in its end-user interface.
     * <p>
     * Each call to -addPeriodicTimeObserverForInterval:queue:usingBlock: should be paired with a corresponding call to -removeTimeObserver:.  Releasing the observer object without a call to -removeTimeObserver: will result in undefined behavior.
     *
     * @return An object conforming to the NSObject protocol.  You must retain this returned value as long as you want the time observer to be invoked by the synchronizer.  Pass this object to -removeTimeObserver: to cancel time observation.
     * @param            interval The interval of invocation of the block during normal rendering, according to progress of the current time of the timebase.
     * @param            queue The serial queue onto which block should be enqueued.  If you pass NULL, the main queue (obtained using dispatch_get_main_queue()) will be used.  Passing a concurrent queue to this method will result in undefined behavior.
     * @param            block The block to be invoked periodically.
     */
    @Generated
    @Selector("addPeriodicTimeObserverForInterval:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime interval, NSObject queue,
            @ObjCBlock(name = "call_addPeriodicTimeObserverForIntervalQueueUsingBlock") Block_addPeriodicTimeObserverForIntervalQueueUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPeriodicTimeObserverForIntervalQueueUsingBlock {
        @Generated
        void call_addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime time);
    }

    /**
     * addRenderer:
     * <p>
     * Adds a renderer to the list of renderers under the synchronizer's control.
     * <p>
     * Adds a renderer to begin operating with the synchronizer's timebase.
     * <p>
     * This method can be called while rate is non-0.0.
     *
     * @param            renderer An object conforming to AVQueuedSampleBufferRendering to be synchronized by this synchronizer.
     */
    @Generated
    @Selector("addRenderer:")
    public native void addRenderer(@Mapped(ObjCObjectMapper.class) AVQueuedSampleBufferRendering renderer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferRenderSynchronizer alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVSampleBufferRenderSynchronizer allocWithZone(VoidPtr zone);

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
    public native AVSampleBufferRenderSynchronizer init();

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
    public static native AVSampleBufferRenderSynchronizer new_objc();

    /**
     * [@property]		rate
     * <p>
     * Playback rate.
     * <p>
     * Indicates the current rate of rendering.  A value of 0.0 means "stopped"; a value of 1.0 means "play at the natural rate of the media".  Must be greater than or equal to 0.0.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * removeRenderer:atTime:completionHandler:
     * <p>
     * Removes a renderer from the list of renderers under the synchronizer's control.
     * <p>
     * This method can be called while rate is non-0.0.
     * <p>
     * time is used to schedule future removals.  If the time is in the past, the renderer will be removed immediately.  kCMTimeInvalid can also be used to force immediate removal.
     * <p>
     * This method removes the renderer asynchronously.  The method can be called more than once, with a subsequent scheduled removal replacing a previously scheduled removal.
     * <p>
     * Clients may provide an optional completionHandler block to be notified when the scheduled removal completes.  If provided, completionHandler will always be called with the following values for didRemoveRenderer:
     * <p>
     * - If the renderer has not been added to this synchronizer, completionHandler will be called and didRemoveRenderer will be NO.
     * - If a removal of a particular renderer is scheduled after another removal of that same renderer has already been scheduled but not yet occurred, the previously-scheduled removal's completionHandler will be called and didRemoveRenderer will be NO.  The new scheduled removal's completionHandler will not be called until it is replaced by another scheduled removal or the renderer is actually removed.
     * - When the renderer is removed due to a scheduled removal, the completionHandler provided when that removal was scheduled will be called and didRemoveRenderer will be YES.
     *
     * @param            renderer An object conforming to AVQueuedSampleBufferRendering currently synchronized by this synchronizer to no longer be synchronized by the synchronizer.
     * @param            time The time on the timebase's timeline at which the renderer should be removed.
     * @param            completionHandler Optional.  A block called when the renderer is removed from the synchronizer.  If provided, this block will always be called with didRemoveRenderer indicating whether the renderer was removed by this scheduled removal.
     */
    @Generated
    @Selector("removeRenderer:atTime:completionHandler:")
    public native void removeRendererAtTimeCompletionHandler(
            @Mapped(ObjCObjectMapper.class) AVQueuedSampleBufferRendering renderer, @ByValue CMTime time,
            @ObjCBlock(name = "call_removeRendererAtTimeCompletionHandler") Block_removeRendererAtTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRendererAtTimeCompletionHandler {
        @Generated
        void call_removeRendererAtTimeCompletionHandler(boolean didRemoveRenderer);
    }

    /**
     * removeTimeObserver:
     * <p>
     * Cancels a previously registered time observer.
     * <p>
     * Upon return, the caller is guaranteed that no new time observer blocks will begin executing.  Depending on the calling thread and the queue used to add the time observer, an in-flight block may continue to execute after this method returns.  You can guarantee synchronous time observer removal by enqueuing the call to -removeTimeObserver: on that queue.  Alternatively, call dispatch_sync(queue, ^{}) after -removeTimeObserver: to wait for any in-flight blocks to finish executing.  -removeTimeObserver: should be used to explicitly cancel each time observer added using -addPeriodicTimeObserverForInterval:queue:usingBlock: and -addBoundaryTimeObserverForTimes:queue:usingBlock:.
     *
     * @param            observer An object returned by a previous call to -addPeriodicTimeObserverForInterval:queue:usingBlock: or -addBoundaryTimeObserverForTimes:queue:usingBlock:.
     */
    @Generated
    @Selector("removeTimeObserver:")
    public native void removeTimeObserver(@Mapped(ObjCObjectMapper.class) Object observer);

    /**
     * [@property]		renderers
     * <p>
     * Array of id<AVQueuedSampleBufferRendering> currently attached to the synchronizer.
     * <p>
     * A list of renderers added to and not removed from the synchronizer.  The list also includes renderers that have been scheduled to be removed but have not yet been removed.
     * <p>
     * This property is not KVO observable.
     */
    @Generated
    @Selector("renderers")
    public native NSArray<?> renderers();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]		rate
     * <p>
     * Playback rate.
     * <p>
     * Indicates the current rate of rendering.  A value of 0.0 means "stopped"; a value of 1.0 means "play at the natural rate of the media".  Must be greater than or equal to 0.0.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * setRate:time:
     * <p>
     * Sets the timebase's time and rate.
     * <p>
     * Sets the timebase's time to time and then sets the rendering rate to rate.  A rate value of 0.0 means "stopped"; a rate value of 1.0 means "play at the natural rate of the media".  Use kCMTimeInvalid for time to not modify the timebase's time.
     *
     * @param            rate A new timebase rate to set.  Must be greater than or equal to 0.0
     * @param            time A new time to set.  Must be greater than or equal to kCMTimeZero, or kCMTimeInvalid
     */
    @Generated
    @Selector("setRate:time:")
    public native void setRateTime(float rate, @ByValue CMTime time);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]		timebase
     * <p>
     * The synchronizer's rendering timebase, which governs how time stamps are interpreted.
     * <p>
     * By default, this timebase will be driven by the clock of an added AVSampleBufferAudioRenderer.
     * <p>
     * If no AVSampleBufferAudioRenderer has been added, the source clock will be the host time clock (mach_absolute_time with the appropriate timescale conversion; this is the same as Core Animation's CACurrentMediaTime).
     * <p>
     * The timebase is a read-only timebase.  Use the rate property and corresponding methods to adjust the timebase.
     */
    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * currentTime
     * <p>
     * Returns the current time of the synchronizer.
     * <p>
     * Returns the current time of the synchronizer. Not key-value observable; use -addPeriodicTimeObserverForInterval:queue:usingBlock: instead.
     *
     * @return A CMTime
     */
    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    /**
     * [@property]	delaysRateChangeUntilHasSufficientMediaData
     * <p>
     * Indicates whether the playback should be started immediately on rate change request.
     * <p>
     * If set to YES, playback will be delayed if the value of hasSufficientMediaDataForReliablePlaybackStart of any added renderer is NO. If set to NO, playback will attempt to start immediately regardless of the value of hasSufficientMediaDataForReliablePlaybackStart of added renderers. Default is YES.
     */
    @Generated
    @Selector("delaysRateChangeUntilHasSufficientMediaData")
    public native boolean delaysRateChangeUntilHasSufficientMediaData();

    /**
     * [@property]	delaysRateChangeUntilHasSufficientMediaData
     * <p>
     * Indicates whether the playback should be started immediately on rate change request.
     * <p>
     * If set to YES, playback will be delayed if the value of hasSufficientMediaDataForReliablePlaybackStart of any added renderer is NO. If set to NO, playback will attempt to start immediately regardless of the value of hasSufficientMediaDataForReliablePlaybackStart of added renderers. Default is YES.
     */
    @Generated
    @Selector("setDelaysRateChangeUntilHasSufficientMediaData:")
    public native void setDelaysRateChangeUntilHasSufficientMediaData(boolean value);

    /**
     * setRate:time:atHostTime:
     * <p>
     * Simultaneously sets the playback rate and the relationship between the current time and host time.
     * <p>
     * You can use this function to synchronize playback with an external activity.
     * <p>
     * The timebase is adjusted so that its time will be (or was) time when host time is (or was) hostTime.
     * In other words: if hostTime is in the past, the timebase's time will be interpolated as though the timebase has been running at the requested rate since that time.  If hostTime is in the future, the timebase will immediately start running at the requested rate from an earlier time so that it will reach the requested time at the requested hostTime.
     * It is a responsibility of the client to ensure that proper time and hostTime is set.  This method will not attempt to validate improper time, hostTime values.
     * In addition, it is also the caller’s responsibility to enqueue samples in the connected renderers that match the timeline defined here.
     * Note that any buffers that are in the past of the defined timeline will still be processed by the renderers.
     * <p>
     * The recommended approach is to use the output presentation time of the first buffer enqueued in the renderers as time and and an associated hostTime in the future.
     * Example use:
     * CMTime startTime = …;
     * __block CMTime nextBufferTime = startTime;
     * [renderer requestMediaDataWhenReadyOnQueue:queue usingBlock:^{
     * …
     * CMSampleBufferRef sampleBuffer = [self generateSampleBufferFor: nextBufferTime];
     * [renderer enqueueSampleBuffer:sampleBuffer];
     * ...
     * }];
     * CMTime inOneSecond = CMTimeAdd(CMClockGetTime(CMClockGetHostTimeClock()), CMTimeMake(1, 1));
     * [synchronizer setRate:rate time:startTime atHostTime:inOneSecond];
     *
     * @param            rate A new timebase rate to set.  Must be greater than or equal to 0.0
     * @param            time A new timebase time to set.  Must be greater than or equal to kCMTimeZero, or kCMTimeInvalid
     * @param            hostTime A new hostTime to set.  Must be greater than or equal to kCMTimeZero, or kCMTimeInvalid
     */
    @Generated
    @Selector("setRate:time:atHostTime:")
    public native void setRateTimeAtHostTime(float rate, @ByValue CMTime time, @ByValue CMTime hostTime);
}

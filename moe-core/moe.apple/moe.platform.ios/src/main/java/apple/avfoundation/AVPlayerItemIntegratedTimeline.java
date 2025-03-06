package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVPlayerItemIntegratedTimelineObserver;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * AVPlayerItemIntegratedTimeline
 * 
 * An AVPlayerItemIntegratedTimeline provides detailed timing information and control for the sequence of playback of a
 * primary AVPlayerItem and scheduled AVPlayerInterstitialEvents.
 * 
 * An object that models the timeline and sequence of playback of primary AVPlayerItem and scheduled
 * AVPlayerInterstitialEvents. The timeline models all regions expected to be traversed during playback. Notably
 * portions of the primary item may not be presented when exiting an interstitial event with a positive resumption
 * offset.
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemIntegratedTimeline extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemIntegratedTimeline(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addBoundaryTimeObserverForSegment
     * 
     * Requests invocation of a block when an offset in a segment is traversed during playback.
     * 
     * @param segment
     *                           AVPlayerItemSegment to monitor playback traversal of.
     * @param offsetsIntoSegment
     *                           Offsets in the segment for which the observer requests notification, supplied as an
     *                           array of NSValues carrying CMTimes.
     * @param queue
     *                           The serial queue onto which block should be enqueued. If you pass NULL, the main queue
     *                           (obtained using dispatch_get_main_queue()) will be used. Passing a concurrent queue to
     *                           this method will result in undefined behavior.
     * @param block
     *                           The block to be invoked when the offset is crossed during playback of a segment.
     * @return
     *         An object conforming to the AVPlayerItemIntegratedTimelineObserver protocol. You must retain this
     *         returned value as long as you want the time observer to be invoked by the timeline. Pass this object to
     *         -removeTimeObserver: to cancel time observation. One can also configure single point segments with
     *         segmentTimes to trigger during traversal of the segment's playback. As the timeline duration and segments
     *         change, the installed time observer will be automatically adjusted to fire at the desired offset in the
     *         segment. A segment that is removed from the timeline will trigger the invocation of the block immediately
     *         with success set as false.
     *         Each call to -addBoundaryTimeObserverForSegment:segment:offsetsInSegment:queue:usingBlock: should be
     *         paired with a corresponding call to -removeTimeObserver:. Releasing the observer object without a call to
     *         -removeTimeObserver: will result in undefined behavior
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("addBoundaryTimeObserverForSegment:offsetsIntoSegment:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native AVPlayerItemIntegratedTimelineObserver addBoundaryTimeObserverForSegmentOffsetsIntoSegmentQueueUsingBlock(
            @NotNull AVPlayerItemSegment segment, @NotNull NSArray<?> offsetsIntoSegment,
            @Nullable dispatch_queue_t queue,
            @ObjCBlock(name = "call_addBoundaryTimeObserverForSegmentOffsetsIntoSegmentQueueUsingBlock") @NotNull Block_addBoundaryTimeObserverForSegmentOffsetsIntoSegmentQueueUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addBoundaryTimeObserverForSegmentOffsetsIntoSegmentQueueUsingBlock {
        @Generated
        void call_addBoundaryTimeObserverForSegmentOffsetsIntoSegmentQueueUsingBlock(boolean success);
    }

    /**
     * addPeriodicTimeObserverForInterval
     * 
     * Requests invocation of a block during playback to report changing time.
     * 
     * @param interval
     *                 The interval of invocation of the block during normal playback, according to progress of the
     *                 current time in the integrated timeline.
     * @param queue
     *                 The serial queue onto which block should be enqueued. If you pass NULL, the main queue (obtained
     *                 using dispatch_get_main_queue()) will be used. Passing a concurrent queue to this method will
     *                 result in undefined behavior.
     * @param block
     *                 The block to be invoked periodically.
     * @return
     *         An object conforming to the AVPlayerItemIntegratedTimelineObserver protocol. You must retain this
     *         returned value as long as you want the time observer to be invoked by the timeline. The block is invoked
     *         periodically at the interval specified, interpreted according to the integrated timeline. The block is
     *         also invoked across AVPlayerItemSegment and AVPlayerItem boundaries, whenever time jumps, and whenever
     *         playback starts or stops. Each call to -addPeriodicTimeObserverForInterval:queue:usingBlock: should be
     *         paired with a corresponding call to -removeTimeObserver:. Releasing the observer object without a call to
     *         -removeTimeObserver: will result in undefined behavior
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("addPeriodicTimeObserverForInterval:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native AVPlayerItemIntegratedTimelineObserver addPeriodicTimeObserverForIntervalQueueUsingBlock(
            @ByValue CMTime interval, @Nullable dispatch_queue_t queue,
            @ObjCBlock(name = "call_addPeriodicTimeObserverForIntervalQueueUsingBlock") @NotNull Block_addPeriodicTimeObserverForIntervalQueueUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPeriodicTimeObserverForIntervalQueueUsingBlock {
        @Generated
        void call_addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime time);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemIntegratedTimeline alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlayerItemIntegratedTimeline allocWithZone(VoidPtr zone);

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

    /**
     * [@property] currentDate
     * 
     * Returns the date of current playback, or nil if playback is not mapped to any date.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentDate")
    @Nullable
    public native NSDate currentDate();

    /**
     * [@property] currentSnapshot
     * 
     * This property provides an immutable representation of the timeline state at time of request.
     * 
     * Returns an immutable representation of the timeline state at time of request. A timeline snapshot provides
     * accessors for obtaining inspectable details of the timeline. Because a snapshot is immutable, the snapshot's
     * properties will not update as playback continues.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentSnapshot")
    @NotNull
    public native AVPlayerItemIntegratedTimelineSnapshot currentSnapshot();

    /**
     * [@property] currentTime
     * 
     * Returns the current time on the integrated timeline.
     * 
     * Returns the current time on the integrated timeline. During playback of interstitial events that occupy a single
     * point, currentTime will not change.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

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
    public native AVPlayerItemIntegratedTimeline init();

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
    public static native AVPlayerItemIntegratedTimeline new_objc();

    /**
     * removeTimeObserver:
     * 
     * Cancels a previously registered time observer.
     * 
     * @param observer
     *                 An object returned by a previous call to -addPeriodicTimeObserverForInterval or
     *                 -addBoundaryTimeObserverForSegment.
     * 
     *                 API-Since: 18.0
     */
    @Generated
    @Selector("removeTimeObserver:")
    public native void removeTimeObserver(
            @Mapped(ObjCObjectMapper.class) @NotNull AVPlayerItemIntegratedTimelineObserver observer);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * seekToDate
     * 
     * Seeks playhead to corresponding date and invokes the completionHandler.
     * 
     * The integrated timeline will seek playhead to the coresponding date.
     * 
     * API-Since: 18.0
     * 
     * @param date
     *                          The new position for the playhead.
     * @param completionHandler
     *                          CompletionHandler callback after seek completes. Success will be true if the playhead
     *                          moved to the new date.
     */
    @Generated
    @Selector("seekToDate:completionHandler:")
    public native void seekToDateCompletionHandler(@NotNull NSDate date,
            @ObjCBlock(name = "call_seekToDateCompletionHandler") @Nullable Block_seekToDateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToDateCompletionHandler {
        @Generated
        void call_seekToDateCompletionHandler(boolean success);
    }

    /**
     * seekToTime
     * 
     * Seeks to a particular time in the integrated time domain and invokes the completionHandler
     * 
     * The integrated timeline seeks to the the range of [time-beforeTolerance, time+afterTolerance] will be attributed
     * to a segment and AVPlayerItem that falls in that range. You can request sample accurate seeking by passing a time
     * value of kCMTimeZero for both toleranceBefore and toleranceAfter.
     * 
     * API-Since: 18.0
     * 
     * @param time
     *                          Time represented in the integrated time domain.
     * @param toleranceBefore
     *                          Tolerance before target time allowed to seek to.
     * @param toleranceAfter
     *                          Tolerance after target time allowed to seek to.
     * @param completionHandler
     *                          CompletionHandler callback after seek completes. Success will be true if the playhead
     *                          moved to the new time.
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(@ByValue CMTime time,
            @ByValue CMTime toleranceBefore, @ByValue CMTime toleranceAfter,
            @ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") @Nullable Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
        @Generated
        void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(boolean success);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
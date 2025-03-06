package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVPlayerItemIntegratedTimelineSnapshot
 * 
 * AVPlayerItemIntegratedTimelineSnapshot provides an immutable representation of inspectable details from an
 * AVPlayerItemIntegratedTimeline.
 * 
 * An instance of AVPlayerItemIntegratedTimelineSnapshot is an immutable snapshot representation of inspectable details
 * from an AVPlayerItemIntegratedTimeline. As playback progresses,
 * AVPlayerItemIntegratedTimelineSnapshot will not reflect the new timeline state. One can request a new snapshot
 * instance from an AVPlayerItemIntegratedTimeline to reflect the latest timeline state.
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemIntegratedTimelineSnapshot extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemIntegratedTimelineSnapshot(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemIntegratedTimelineSnapshot alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlayerItemIntegratedTimelineSnapshot allocWithZone(VoidPtr zone);

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
     * Returns the current date when the snapshot was taken, or nil if playback is not mapped to any date.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentDate")
    @Nullable
    public native NSDate currentDate();

    /**
     * [@property] currentSegment
     * 
     * Returns the current AVPlayerItemSegment playback is traversing.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("currentSegment")
    @Nullable
    public native AVPlayerItemSegment currentSegment();

    /**
     * [@property] currentTime
     * 
     * Returns the current time on the integrated timeline when the snapshot was taken.
     * 
     * Returns the current time on the integrated timeline when the snapshot was taken. CurrentTime will not change as
     * playback progresses.
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

    /**
     * [@property] duration
     * 
     * Returns the duration totaling the primary item and scheduled interstitial events.
     * 
     * This property returns the duration totaling the primary item and scheduled interstitial events and taking into
     * account the interstitial event's playoutLimit and resumption offset.
     * Before loading the duration of the primary item, the value of this property is kCMTimeInvalid. For livestreams,
     * this value will be kCMTimeIndefinite.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVPlayerItemIntegratedTimelineSnapshot init();

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

    /**
     * mapTime
     * 
     * Provides mapping from time to AVPlayerItemSegment and offset in segment.
     * 
     * Provides mapping from time to segment and offset in the segment's timeMapping target. For time that correlates to
     * the start of multiple segments, this will return the first one.
     * 
     * API-Since: 18.0
     * 
     * @param time
     *                         Time represented in the integrated time domain.
     * @param timeSegmentOut
     *                         Output parameter for segment.
     * @param segmentOffsetOut
     *                         Output parameter for offset in segment.
     */
    @Generated
    @Selector("mapTime:toSegment:atSegmentOffset:")
    public native void mapTimeToSegmentAtSegmentOffset(@ByValue CMTime time,
            @ReferenceInfo(type = AVPlayerItemSegment.class) @Nullable Ptr<AVPlayerItemSegment> timeSegmentOut,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CMTime segmentOffsetOut);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerItemIntegratedTimelineSnapshot new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] segments
     * 
     * Returns an array of AVPlayerItemSegment for the snapshot.
     * 
     * Returns an array of AVPlayerItemSegment. The segments are presented in chronological order, contiguous from the
     * previous element, and non-overlapping.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("segments")
    @NotNull
    public native NSArray<? extends AVPlayerItemSegment> segments();

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
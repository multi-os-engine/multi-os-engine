package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeMapping;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVPlayerItemSegment
 * 
 * Representing a segment of time on the integrated timeline. Segments are immutable objects.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemSegment extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemSegment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemSegment alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlayerItemSegment allocWithZone(VoidPtr zone);

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
    public native AVPlayerItemSegment init();

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

    /**
     * [@property] interstitialEvent
     * 
     * The associated interstitial event for this segment.
     * 
     * The associated interstitial event for this segment. This value will be nil for segments representing playback of
     * the primary itme.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("interstitialEvent")
    @Nullable
    public native AVPlayerInterstitialEvent interstitialEvent();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] loadedTimeRanges
     * 
     * This property provides a collection of time ranges for the segment if media data is readily available. The ranges
     * provided might be discontinuous.
     * 
     * Returns an NSArray of NSValues containing CMTimeRanges. Loaded time ranges will be within the timeMapping's
     * target timeRange. Loaded time ranges will be empty for interstitial events that occupy a single point in time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("loadedTimeRanges")
    @NotNull
    public native NSArray<? extends NSValue> loadedTimeRanges();

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerItemSegment new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] segmentType
     * 
     * The type of content this segment represents.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("segmentType")
    @NInt
    public native long segmentType();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] startDate
     * 
     * The date this segment starts at.
     * 
     * The date this segment starts at. This value will be nil if the primary item does not contain dates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("startDate")
    @Nullable
    public native NSDate startDate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timeMapping
     * 
     * The timeMapping for this segment.
     * 
     * The timeMapping source timeRange represents the start and duration in the segment source's timeline (ie: primary
     * item timeline or interstitial event). The target timeRange represents the start point and duration in the
     * integrated timeline. For interstitial events which occupy a single point, the target's duration will be
     * kCMTimeZero.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("timeMapping")
    @ByValue
    public native CMTimeMapping timeMapping();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
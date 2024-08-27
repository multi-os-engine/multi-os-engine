package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.MappedReturn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPlayerInterstitialEvent
 * 
 * An AVPlayerInterstitialEvent provides instructions for temporarily suspending the playback of primary content in
 * order to play alternative interstitial content instead, resuming playback of the primary content when playback of the
 * interstitial content is complete or is canceled.
 * 
 * The primary content is specified as an instance of AVPlayerItem, designated as the primary item of the interstitial
 * event.
 * 
 * The timing of interstitial playback is specified as a date within the date range of the primary item. Interstitial
 * events are currently possible only for items with an intrinsic mapping from their timeline to real-time dates.
 * 
 * The alternative interstitial content is specified as an array of one or more AVPlayerItems that will be used as
 * templates for the creation of items for interstitial playback. In other words, these template items are not the
 * actual items that will be played during interstitial playback; instead they are used to generate the items that are
 * to be played, with property values that match the configuration of your template items.
 * 
 * If you wish to observe the scheduling and progress of interstitial events, use an AVPlayerInterstitialEventMonitor.
 * If you wish to specify your own schedule of interstitial events, use an AVPlayerInterstitialEventController.
 * 
 * Note that while previously AVPlayerInterstitialEvent was an immutable object, it is now mutable. This allows it to be
 * created and customized before being set on an AVPlayerInterstitialEventController.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerInterstitialEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerInterstitialEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerInterstitialEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerInterstitialEvent allocWithZone(VoidPtr zone);

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
     * [@property] date
     * 
     * The date within the date range of the primary item at which playback of the primary content should be temporarily
     * suspended and the interstitial items played.
     * 
     * Will have a value of nil if the event was initialized with a time instead of a date.
     */
    @Nullable
    @Generated
    @Selector("date")
    public native NSDate date();

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

    /**
     * [@property] identifier
     * 
     * An external identifier for the event.
     * 
     * If an event is set on an AVPlayerInterstitialEventController that already has an event with the same identifier,
     * the old event will be replaced by the new one.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVPlayerInterstitialEvent init();

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
     * interstitialEventWithPrimaryItem:date:templateItems:restrictions:resumptionOffset:
     * 
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     * 
     * @param primaryItem
     *                              An AVPlayerItem representing the primary content during the playback of which the
     *                              interstitial event should occur. The primaryItem must have an AVAsset that provides
     *                              an intrinsic mapping from its timeline to real-time dates.
     * @param identifier
     *                              An external identifier for the event.
     * @param date
     *                              The date within the date range of the primary item at which playback of the primary
     *                              content should be temporarily suspended and the interstitial items played.
     * @param templateItems
     *                              An array of AVPlayerItems with configurations that will be reproduced for the
     *                              playback of interstitial content. An NSInvalidArgumentException will be raised if
     *                              any of the template items employs an AVAsset that lacks a URL, such as an
     *                              AVComposition.
     * @param restrictions
     *                              Indicates restrictions on the use of end user playback controls that are imposed by
     *                              the event.
     * @param resumptionOffset
     *                              Specifies the offset in time at which playback of the primary item should resume
     *                              after interstitial playback has finished. Definite numeric values are supported. The
     *                              value kCMTimeIndefinite can also be used, in order to specify that the effective
     *                              resumption time offset should accord with the wallclock time elapsed during
     *                              interstitial playback.
     * @param playoutLimit
     *                              Specifies the offset from the beginning of the interstitial at which interstitial
     *                              playback should end, if the interstitial asset(s) are longer. Pass a positive
     *                              numeric value, or kCMTimeInvalid to indicate no playout limit.
     * @param userDefinedAttributes
     *                              Storage for attributes defined by the client or the content vendor. Attribute names
     *                              should begin with X- for uniformity with server insertion.
     * @return An instance of AVPlayerInterstitialEvent.
     * 
     *         API-Since: 15.0
     *         Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("interstitialEventWithPrimaryItem:identifier:date:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemIdentifierDateTemplateItemsRestrictionsResumptionOffsetPlayoutLimitUserDefinedAttributes(
            @NotNull AVPlayerItem primaryItem, @Nullable String identifier, @NotNull NSDate date,
            @NotNull NSArray<? extends AVPlayerItem> templateItems, @NUInt long restrictions,
            @ByValue CMTime resumptionOffset, @ByValue CMTime playoutLimit,
            @Nullable NSDictionary<?, ?> userDefinedAttributes);

    /**
     * interstitialEventWithPrimaryItem:time:templateItems:restrictions:resumptionOffset:
     * 
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     * 
     * @param primaryItem
     *                              An AVPlayerItem representing the primary content during the playback of which the
     *                              interstitial event should occur. The primaryItem must have an AVAsset that provides
     *                              an intrinsic mapping from its timeline to real-time dates.
     * @param identifier
     *                              An external identifier for the event.
     * @param time
     *                              The time within the duration of the primary item at which playback of the primary
     *                              content should be temporarily suspended and the interstitial items played.
     * @param templateItems
     *                              An array of AVPlayerItems with configurations that will be reproduced for the
     *                              playback of interstitial content. An NSInvalidArgumentException will be raised if
     *                              any of the template items employs an AVAsset that lacks a URL, such as an
     *                              AVComposition.
     * @param restrictions
     *                              Indicates restrictions on the use of end user playback controls that are imposed by
     *                              the event.
     * @param resumptionOffset
     *                              Specifies the offset in time at which playback of the primary item should resume
     *                              after interstitial playback has finished. Definite numeric values are supported. The
     *                              value kCMTimeIndefinite can also be used, in order to specify that the effective
     *                              resumption time offset should accord with the wallclock time elapsed during
     *                              interstitial playback.
     * @param playoutLimit
     *                              Specifies the offset from the beginning of the interstitial at which interstitial
     *                              playback should end, if the interstitial asset(s) are longer. Pass a positive
     *                              numeric value, or kCMTimeInvalid to indicate no playout limit.
     * @param userDefinedAttributes
     *                              Storage for attributes defined by the client or the content vendor. Attribute names
     *                              should begin with X- for uniformity with server insertion.
     * @return An instance of AVPlayerInterstitialEvent.
     * 
     *         API-Since: 15.0
     *         Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("interstitialEventWithPrimaryItem:identifier:time:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemIdentifierTimeTemplateItemsRestrictionsResumptionOffsetPlayoutLimitUserDefinedAttributes(
            @NotNull AVPlayerItem primaryItem, @Nullable String identifier, @ByValue CMTime time,
            @NotNull NSArray<? extends AVPlayerItem> templateItems, @NUInt long restrictions,
            @ByValue CMTime resumptionOffset, @ByValue CMTime playoutLimit,
            @Nullable NSDictionary<?, ?> userDefinedAttributes);

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
    public static native AVPlayerInterstitialEvent new_objc();

    /**
     * [@property] playoutLimit
     * 
     * Specifies the offset in time at which playback of the interstitial event should end.
     * 
     * Can be any positive numeric value, or invalid. The default value is kCMTimeInvalid, which means there is no
     * limit.
     */
    @Generated
    @Selector("playoutLimit")
    @ByValue
    public native CMTime playoutLimit();

    /**
     * [@property] primaryItem
     * 
     * An AVPlayerItem representing the primary content during the playback of which the interstitial event should
     * occur. The primaryItem must have an AVAsset that provides an intrinsic mapping from its timeline to real-time
     * dates.
     */
    @Nullable
    @Generated
    @Selector("primaryItem")
    public native AVPlayerItem primaryItem();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] restrictions
     * 
     * Indicates restrictions on the use of end user playback controls that are imposed by the event.
     */
    @Generated
    @Selector("restrictions")
    @NUInt
    public native long restrictions();

    /**
     * [@property] resumptionOffset
     * 
     * Specifies the offset in time at which playback of the primary item should resume after interstitial playback has
     * finished.
     * 
     * Definite numeric values are supported. The value kCMTimeIndefinite can also be used, in order to specify that the
     * effective resumption time offset should accord with the wallclock time elapsed during interstitial playback; this
     * value is typically suitable for live broadcasts. The default value is kCMTimeZero.
     */
    @Generated
    @Selector("resumptionOffset")
    @ByValue
    public native CMTime resumptionOffset();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] templateItems
     * 
     * An array of AVPlayerItems with configurations that will be reproduced for the playback of interstitial content.
     * 
     * If you want the instances of AVURLAsset used during interstitial playback to be identical to the ones you specify
     * for templateItems in AVPlayerInterstitialEvents that you set on an AVPlayerInterstitialEventController, rather
     * than equivalent AVURLAssets with the same URL, you must create them with a value for the key
     * AVURLAssetPrimarySessionIdentifierKey that's equal to the httpSessionIdentifier of the primary AVPlayerItem's
     * asset. See AVAsset.h. This is especially useful if you require the use of a custom AVAssetResourceLoader delegate
     * for interstitial assets.
     * 
     * An NSInvalidArgumentException will be raised if any of the template items employs an AVAsset that lacks a URL,
     * such as an AVComposition.
     */
    @NotNull
    @Generated
    @Selector("templateItems")
    public native NSArray<? extends AVPlayerItem> templateItems();

    /**
     * [@property] time
     * 
     * The time within the duration of the primary item at which playback of the primary content should be temporarily
     * suspended and the interstitial items played.
     * 
     * Will have a value equal to kCMTimeInvalid if the event was initialized with a date instead of a time.
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * [@property] userDefinedAttributes
     * 
     * Attributes of the event defined by the content vendor or the client.
     * 
     * Dictionary keys are attribute names. Dictionary values are attribute values.
     */
    @NotNull
    @Generated
    @Selector("userDefinedAttributes")
    public native NSDictionary<?, ?> userDefinedAttributes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] alignsResumptionWithPrimarySegmentBoundary
     * 
     * Specifies that the resumption time of primary playback should be snapped to a segment boundary of the primary
     * asset
     * 
     * If true, the resumption time of primary playback following an interstitial will be adjusted to the nearest
     * segment boundary when the primary player is playing an HTTP Live Streaming asset.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("alignsResumptionWithPrimarySegmentBoundary")
    public native boolean alignsResumptionWithPrimarySegmentBoundary();

    /**
     * [@property] alignsStartWithPrimarySegmentBoundary
     * 
     * Specifies that the start time of interstitial playback should be snapped to a segment boundary of the primary
     * asset
     * 
     * If true, the start time or date of the interstitial will be adjusted to the nearest segment boundary when the
     * primary player is playing an HTTP Live Streaming asset.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("alignsStartWithPrimarySegmentBoundary")
    public native boolean alignsStartWithPrimarySegmentBoundary();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] cue
     * 
     * The cue property is used to schedule event playback at a predefined position of primary playback.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cue")
    public native String cue();

    /**
     * interstitialEventWithPrimaryItem:date:
     * 
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     * 
     * @param primaryItem
     *                    An AVPlayerItem representing the primary content during the playback of which the interstitial
     *                    event should occur. The primaryItem must have an AVAsset that provides an intrinsic mapping
     *                    from its timeline to real-time dates.
     * @param date
     *                    The date within the date range of the primary item at which playback of the primary content
     *                    should be temporarily suspended and the interstitial items played.
     * @return An instance of AVPlayerInterstitialEvent.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("interstitialEventWithPrimaryItem:date:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemDate(
            @NotNull AVPlayerItem primaryItem, @NotNull NSDate date);

    /**
     * interstitialEventWithPrimaryItem:time:
     * 
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     * 
     * @param primaryItem
     *                    An AVPlayerItem representing the primary content during the playback of which the interstitial
     *                    event should occur. The primaryItem must have an AVAsset that provides an intrinsic mapping
     *                    from its timeline to real-time dates.
     * @param time
     *                    The time within the duration of the primary item at which playback of the primary content
     *                    should be temporarily suspended and the interstitial items played.
     * @return An instance of AVPlayerInterstitialEvent.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("interstitialEventWithPrimaryItem:time:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemTime(
            @NotNull AVPlayerItem primaryItem, @ByValue CMTime time);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAlignsResumptionWithPrimarySegmentBoundary:")
    public native void setAlignsResumptionWithPrimarySegmentBoundary(boolean value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAlignsStartWithPrimarySegmentBoundary:")
    public native void setAlignsStartWithPrimarySegmentBoundary(boolean value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCue:")
    public native void setCue(@NotNull String value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDate:")
    public native void setDate(@Nullable NSDate value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPlayoutLimit:")
    public native void setPlayoutLimit(@ByValue CMTime value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPrimaryItem:")
    public native void setPrimaryItem_unsafe(@Nullable AVPlayerItem value);

    /**
     * API-Since: 16.0
     */
    @Generated
    public void setPrimaryItem(@Nullable AVPlayerItem value) {
        Object __old = primaryItem();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPrimaryItem_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRestrictions:")
    public native void setRestrictions(@NUInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setResumptionOffset:")
    public native void setResumptionOffset(@ByValue CMTime value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTemplateItems:")
    public native void setTemplateItems(@NotNull NSArray<? extends AVPlayerItem> value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTime:")
    public native void setTime(@ByValue CMTime value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setUserDefinedAttributes:")
    public native void setUserDefinedAttributes(@NotNull NSDictionary<?, ?> value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setWillPlayOnce:")
    public native void setWillPlayOnce(boolean value);

    /**
     * [@property] willPlayOnce
     * 
     * Specifies that the interstitial should be scheduled for playback once only, and suppressed for subsequent replay.
     * 
     * The "once" provision takes effect at the start of interstitial playback. The interstitial will not be scheduled
     * again even if the first playback is canceled before completion.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("willPlayOnce")
    public native boolean willPlayOnce();

    /**
     * [@property] assetListResponse
     * 
     * The asset list JSON response as a dictionary, or nil if no asset list response has been loaded for the event.
     * 
     * If the AVPlayerInterstitialEvent's templateItems is empty and the assetListResponse is nil, then an asset list
     * read is expected. If the AVPlayerInterstitialEvent's templateItems is not empty and the assetListResponse is nil,
     * then an asset list read is not expected.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("assetListResponse")
    @Nullable
    public native NSDictionary<?, ?> assetListResponse();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

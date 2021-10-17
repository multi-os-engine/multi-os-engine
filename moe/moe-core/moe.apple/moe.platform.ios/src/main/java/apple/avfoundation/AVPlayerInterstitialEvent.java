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
import org.moe.natj.general.ann.MappedReturn;
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
 * AVPlayerInterstitialEvent
 * <p>
 * An AVPlayerInterstitialEvent provides instructions for temporarily suspending the playback of primary content in order to play alternative interstitial content instead, resuming playback of the primary content when playback of the interstitial content is complete or is canceled.
 * <p>
 * The primary content is specified as an instance of AVPlayerItem, designated as the primary item of the interstitial event.
 * <p>
 * The timing of interstitial playback is specified as a date within the date range of the primary item. Interstitial events are currently possible only for items with an intrinsic mapping from their timeline to real-time dates.
 * <p>
 * The alternative interstitial content is specified as an array of one or more AVPlayerItems that will be used as templates for the creation of items for interstitial playback. In other words, these template items are not the actual items that will be played during interstitial playback; instead they are used to generate the items that are to be played, with property values that match the configuration of your template items.
 * <p>
 * If you wish to observe the scheduling and progress of interstitial events, use an AVPlayerInterstitialEventMonitor. If you wish to specify your own schedule of interstitial events, use an AVPlayerInterstitialEventController.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerInterstitialEvent extends NSObject {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * [@property]     date
     * <p>
     * The date within the date range of the primary item at which playback of the primary content should be temporarily suspended and the interstitial items played.
     * <p>
     * Will have a value of nil if the event was initialized with a time instead of a date.
     */
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
     * [@property]     identifier
     * <p>
     * An external identifier for the event.
     * <p>
     * If an event is set on an AVPlayerInterstitialEventController that already has an event with the same identifier, the old event will be replaced by the new one.
     */
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
     * <p>
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     *
     * @param primaryItem           An AVPlayerItem representing the primary content during the playback of which the interstitial event should occur. The primaryItem must have an AVAsset that provides an intrinsic mapping from its timeline to real-time dates.
     * @param identifier            An external identifier for the event.
     * @param date                  The date within the date range of the primary item at which playback of the primary content should be temporarily suspended and the interstitial items played.
     * @param templateItems         An array of AVPlayerItems with configurations that will be reproduced for the playback of interstitial content.
     * @param restrictions          Indicates restrictions on the use of end user playback controls that are imposed by the event.
     * @param resumptionOffset      Specifies the offset in time at which playback of the primary item should resume after interstitial playback has finished. Definite numeric values are supported. The value kCMTimeIndefinite can also be used, in order to specify that the effective resumption time offset should accord with the wallclock time elapsed during interstitial playback.
     * @param playoutLimit          Specifies the offset from the beginning of the interstitial at which interstitial playback should end, if the interstitial asset(s) are longer. Pass a positive numeric value, or kCMTimeInvalid to indicate no playout limit.
     * @param userDefinedAttributes Storage for attributes defined by the client or the content vendor. Attribute names should begin with X- for uniformity with server insertion.
     * @return An instance of AVPlayerInterstitialEvent.
     */
    @Generated
    @Selector("interstitialEventWithPrimaryItem:identifier:date:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemIdentifierDateTemplateItemsRestrictionsResumptionOffsetPlayoutLimitUserDefinedAttributes(
            AVPlayerItem primaryItem, String identifier, NSDate date, NSArray<? extends AVPlayerItem> templateItems,
            @NUInt long restrictions, @ByValue CMTime resumptionOffset, @ByValue CMTime playoutLimit,
            NSDictionary<?, ?> userDefinedAttributes);

    /**
     * interstitialEventWithPrimaryItem:time:templateItems:restrictions:resumptionOffset:
     * <p>
     * Returns an instance of AVPlayerInterstitialEvent for use in scheduling interstitial playback.
     *
     * @param primaryItem           An AVPlayerItem representing the primary content during the playback of which the interstitial event should occur. The primaryItem must have an AVAsset that provides an intrinsic mapping from its timeline to real-time dates.
     * @param identifier            An external identifier for the event.
     * @param time                  The time within the duration of the primary item at which playback of the primary content should be temporarily suspended and the interstitial items played.
     * @param templateItems         An array of AVPlayerItems with configurations that will be reproduced for the playback of interstitial content.
     * @param restrictions          Indicates restrictions on the use of end user playback controls that are imposed by the event.
     * @param resumptionOffset      Specifies the offset in time at which playback of the primary item should resume after interstitial playback has finished. Definite numeric values are supported. The value kCMTimeIndefinite can also be used, in order to specify that the effective resumption time offset should accord with the wallclock time elapsed during interstitial playback.
     * @param playoutLimit          Specifies the offset from the beginning of the interstitial at which interstitial playback should end, if the interstitial asset(s) are longer. Pass a positive numeric value, or kCMTimeInvalid to indicate no playout limit.
     * @param userDefinedAttributes Storage for attributes defined by the client or the content vendor. Attribute names should begin with X- for uniformity with server insertion.
     * @return An instance of AVPlayerInterstitialEvent.
     */
    @Generated
    @Selector("interstitialEventWithPrimaryItem:identifier:time:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    public static native AVPlayerInterstitialEvent interstitialEventWithPrimaryItemIdentifierTimeTemplateItemsRestrictionsResumptionOffsetPlayoutLimitUserDefinedAttributes(
            AVPlayerItem primaryItem, String identifier, @ByValue CMTime time,
            NSArray<? extends AVPlayerItem> templateItems, @NUInt long restrictions, @ByValue CMTime resumptionOffset,
            @ByValue CMTime playoutLimit, NSDictionary<?, ?> userDefinedAttributes);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property]     playoutLimit
     * <p>
     * Specifies the offset in time at which playback of the interstitial event should end.
     * <p>
     * Can be any positive numeric value, or invalid. The default value is kCMTimeInvalid, which means there is no limit.
     */
    @Generated
    @Selector("playoutLimit")
    @ByValue
    public native CMTime playoutLimit();

    /**
     * [@property]     primaryItem
     * <p>
     * An AVPlayerItem representing the primary content during the playback of which the interstitial event should occur. The primaryItem must have an AVAsset that provides an intrinsic mapping from its timeline to real-time dates.
     */
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
     * [@property]     restrictions
     * <p>
     * Indicates restrictions on the use of end user playback controls that are imposed by the event.
     */
    @Generated
    @Selector("restrictions")
    @NUInt
    public native long restrictions();

    /**
     * [@property]     resumptionOffset
     * <p>
     * Specifies the offset in time at which playback of the primary item should resume after interstitial playback has finished.
     * <p>
     * Definite numeric values are supported. The value kCMTimeIndefinite can also be used, in order to specify that the effective resumption time offset should accord with the wallclock time elapsed during interstitial playback; this value is typically suitable for live broadcasts. The default value is kCMTimeZero.
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
     * [@property]     templateItems
     * <p>
     * An array of AVPlayerItems with configurations that will be reproduced for the playback of interstitial content.
     */
    @Generated
    @Selector("templateItems")
    public native NSArray<? extends AVPlayerItem> templateItems();

    /**
     * [@property]     time
     * <p>
     * The time within the duration of the primary item at which playback of the primary content should be temporarily suspended and the interstitial items played.
     * <p>
     * Will have a value equal to kCMTimeInvalid if the event was initialized with a date instead of a time.
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * [@property]     userDefinedAttributes
     * <p>
     * Attributes of the event defined by the content vendor or the client.
     * <p>
     * Dictionary keys are attribute names. Dictionary values are attribute values.
     */
    @Generated
    @Selector("userDefinedAttributes")
    public native NSDictionary<?, ?> userDefinedAttributes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

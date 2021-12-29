package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * AVPlayerInterstitialEventMonitor
 * <p>
 * An AVPlayerInterstitialEventMonitor allows you to observe the scheduling and progress of interstitial events, specified either intrinsically within the content of primary items, such as via use of directives carried by HLS media playlists, or via use of an AVPlayerInterstitialEventController.
 * <p>
 * The schedule of interstitial events is provided as an array of AVPlayerInterstitialEvents. For each AVPlayerInterstitialEvent, when the primary player's current item is the primary item of the interstitial event and its currentDate reaches the date of the event, playback of the primary item by the primary player is temporarily suspended, i.e. its timeControlStatus changes to AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate and its reasonForWaitingToPlay will change to AVPlayerWaitingDuringInterstitialEventReason. During this suspension, playback of items that replicate the interstitial template items of the event are played by the interstitial player, which temporarily assumes the output configuration of the primary player; for example, its visual content will be routed to AVPlayerLayers that reference the primary player. Once the interstitial player has advanced through playback of the interstitial items specified by the event or its current item otherwise becomes nil, playback of the primary content will resume, at an offset from the time at which it was suspended as specified by the event.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerInterstitialEventMonitor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerInterstitialEventMonitor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerInterstitialEventMonitor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerInterstitialEventMonitor allocWithZone(VoidPtr zone);

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
     * [@property]     currentEvent
     * <p>
     * The current interstitial event. Has a value of nil during playback of primary content by the primary player.
     */
    @Generated
    @Selector("currentEvent")
    public native AVPlayerInterstitialEvent currentEvent();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]     events
     * <p>
     * Provides the current schedule of interstitial events, specified either intrinsically within the content of primary items, such as via use of directives carried by HLS media playlists, or via use of an AVPlayerInterstitialEventController.
     * <p>
     * When interstitial events follow a schedule specified intrinsically within the content of primary items, the value of this property will typically change whenever the currentItem of the primaryPlayer changes. For HLS content that specifies interstitials via the use of DATERANGE tags, the value of this property may also change whenever the set of DATERANGE tags in the currentItem's media playlist changes.
     * When interstitial events follow a schedule specified via use of an AVPlayerInterstitialEventController, the value of this property changes only when a new schedule is set on the AVPlayerInterstitialEventController.
     */
    @Generated
    @Selector("events")
    public native NSArray<? extends AVPlayerInterstitialEvent> events();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVPlayerInterstitialEventMonitor init();

    @Generated
    @Selector("initWithPrimaryPlayer:")
    public native AVPlayerInterstitialEventMonitor initWithPrimaryPlayer(AVPlayer primaryPlayer);

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
     * interstitialEventMonitorWithPrimaryPlayer:
     * <p>
     * Returns an instance of AVPlayerInterstitialEvent for use in observing and scheduling interstitial playback.
     *
     * @param primaryPlayer The AVPlayer that will play the primaryItems of the receiver's interstitial events.
     * @return An instance of AVPlayerInterstitialEventMonitor.
     */
    @Generated
    @Selector("interstitialEventMonitorWithPrimaryPlayer:")
    public static native AVPlayerInterstitialEventMonitor interstitialEventMonitorWithPrimaryPlayer(
            AVPlayer primaryPlayer);

    /**
     * [@property]     interstitialPlayer
     * <p>
     * The AVQueuePlayer that will play interstitial items during suspension of playback of primary items.
     */
    @Generated
    @Selector("interstitialPlayer")
    public native AVQueuePlayer interstitialPlayer();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerInterstitialEventMonitor new_objc();

    /**
     * [@property]     primaryPlayer
     * <p>
     * The AVPlayer that will play the primaryItems of the receiver's interstitial events.
     */
    @Generated
    @Selector("primaryPlayer")
    public native AVPlayer primaryPlayer();

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

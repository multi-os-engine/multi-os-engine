package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
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

/**
 * AVPlayerInterstitialEventController
 * <p>
 * An AVPlayerInterstitialEventController allows you to specify a schedule of interstitial events for items played by a
 * primary player.
 * By creating an instance of AVPlayerInterstitialEventController and setting a schedule of interstitial events, you
 * pre-empt directives the are intrinsic to the items played by the primary player, if any exist, causing them to be
 * ignored.
 * <p>
 * The schedule of interstitial events is specified as an array of AVPlayerInterstitialEvents. For each
 * AVPlayerInterstitialEvent, when the primary player's current item is the primary item of the interstitial event and
 * its currentDate reaches the date of the event, playback of the primary item by the primary player is temporarily
 * suspended, i.e. its timeControlStatus changes to AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate and its
 * reasonForWaitingToPlay will change to AVPlayerWaitingDuringInterstitialEventReason. During this suspension, playback
 * of items that replicate the interstitial template items of the event are played by the interstitial player, which
 * temporarily assumes the output configuration of the primary player; for example, its visual content will be routed to
 * AVPlayerLayers that reference the primary player. Once the interstitial player has advanced through playback of the
 * interstitial items specified by the event or its current item otherwise becomes nil, playback of the primary content
 * will resume, at an offset from the time at which it was suspended as specified by the event.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerInterstitialEventController extends AVPlayerInterstitialEventMonitor {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerInterstitialEventController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerInterstitialEventController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerInterstitialEventController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * cancelCurrentEventWithResumptionOffset:
     * <p>
     * Causes the playback of any and all interstitial content currently in progress to be abandoned and the playback of
     * primary content to be resumed.
     * <p>
     * If invoked during the handling of coinciding interstitial events, they will all be canceled.
     * When you cancel interstitial events via the use of this method, the value of resumptionOffset that you pass
     * overrides the events' resumptionOffset.
     * Has no effect while currentEvent is nil.
     *
     * @param resumptionOffset Specifies the offset in time at which playback of the primary player's current item
     *                         should resume after interstitial playback has finished. To specify that the effective
     *                         resumption time offset should accord with the wallclock time elapsed during interstitial
     *                         playback, pass a value of kCMTimeIndefinite.
     */
    @Generated
    @Selector("cancelCurrentEventWithResumptionOffset:")
    public native void cancelCurrentEventWithResumptionOffset(@ByValue CMTime resumptionOffset);

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

    /**
     * [@property] events
     * <p>
     * Specifies the current schedule of interstitial events.
     * <p>
     * Setting this property to a non-nil value cancels and overrides all previously scheduled future interstitial
     * events, including those that are intrinsically specified by the content of primary items, such as directives
     * carried by HLS media playlists. Setting it to nil causes its value to be reset in accordance with the content of
     * the current primary item.
     * <p>
     * If you change the value of events during an interstitial event and the current event is not included in the new
     * value of events, the current event is nevertheless allowed to continue until completion. If you wish to cancel
     * the current event, use -cancelCurrentEventWithResumptionOffset:.
     * <p>
     * If interstitial events are scheduled with dates that coincide either with the date of another scheduled
     * interstitial event or with the date range of the primary content that's omitted according to the resumption
     * offset of another scheduled interstitial event, the primary content will remain suspended until all coinciding
     * interstitial events have been completed. The effective resumption offset will be the sum of the resumption
     * offsets of the coinciding interstitial events. (Note that the sum of a numeric CMTime and kCMTimeIndefinite is
     * kCMTimeIndefinite.)
     * <p>
     * If interstitial events are scheduled for the same date, they are ordered according to their position in the
     * events array.
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
    public native AVPlayerInterstitialEventController init();

    @Generated
    @Selector("initWithPrimaryPlayer:")
    public native AVPlayerInterstitialEventController initWithPrimaryPlayer(AVPlayer primaryPlayer);

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
     * interstitialEventControllerWithPrimaryPlayer
     * <p>
     * Returns an instance of AVPlayerInterstitialEvent for use in observing and scheduling interstitial playback.
     *
     * @param primaryPlayer The AVPlayer that will play the primaryItems of the receiver's interstitial events.
     * @return An instance of AVPlayerInterstitialEventController.
     */
    @Generated
    @Selector("interstitialEventControllerWithPrimaryPlayer:")
    public static native AVPlayerInterstitialEventController interstitialEventControllerWithPrimaryPlayer(
            AVPlayer primaryPlayer);

    @Generated
    @Selector("interstitialEventMonitorWithPrimaryPlayer:")
    public static native AVPlayerInterstitialEventController interstitialEventMonitorWithPrimaryPlayer(
            AVPlayer primaryPlayer);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerInterstitialEventController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] events
     * <p>
     * Specifies the current schedule of interstitial events.
     * <p>
     * Setting this property to a non-nil value cancels and overrides all previously scheduled future interstitial
     * events, including those that are intrinsically specified by the content of primary items, such as directives
     * carried by HLS media playlists. Setting it to nil causes its value to be reset in accordance with the content of
     * the current primary item.
     * <p>
     * If you change the value of events during an interstitial event and the current event is not included in the new
     * value of events, the current event is nevertheless allowed to continue until completion. If you wish to cancel
     * the current event, use -cancelCurrentEventWithResumptionOffset:.
     * <p>
     * If interstitial events are scheduled with dates that coincide either with the date of another scheduled
     * interstitial event or with the date range of the primary content that's omitted according to the resumption
     * offset of another scheduled interstitial event, the primary content will remain suspended until all coinciding
     * interstitial events have been completed. The effective resumption offset will be the sum of the resumption
     * offsets of the coinciding interstitial events. (Note that the sum of a numeric CMTime and kCMTimeIndefinite is
     * kCMTimeIndefinite.)
     * <p>
     * If interstitial events are scheduled for the same date, they are ordered according to their position in the
     * events array.
     */
    @Generated
    @Selector("setEvents:")
    public native void setEvents(NSArray<? extends AVPlayerInterstitialEvent> value);

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

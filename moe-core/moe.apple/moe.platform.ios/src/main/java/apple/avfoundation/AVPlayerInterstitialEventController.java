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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSBundle;

/**
 * An AVPlayerInterstitialEventController allows you to specify a schedule of interstitial events for items played by a
 * primary player. By creating an instance of AVPlayerInterstitialEventController and setting a schedule of interstitial
 * events, you pre-empt directives the are intrinsic to the items played by the primary player, if any exist, causing
 * them to be ignored.
 * 
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
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 15.0
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
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Causes the playback of any and all interstitial content currently in progress to be abandoned and the playback of
     * primary content to be resumed.
     * 
     * If invoked during the handling of coinciding interstitial events, they will all be canceled.
     * When you cancel interstitial events via the use of this method, the value of resumptionOffset that you pass
     * overrides the events' resumptionOffset.
     * Has no effect while currentEvent is nil.
     * 
     * - Parameter resumptionOffset: Specifies the offset in time at which playback of the primary player's current item
     * should resume after interstitial playback has finished. To specify that the effective resumption time offset
     * should match with the wallclock time elapsed during interstitial playback, pass a value of kCMTimeIndefinite. To
     * specify that the effective resumption time offset should match with the projected playback time, pass a value of
     * kCMTimeInvalid.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("cancelCurrentEventWithResumptionOffset:")
    public native void cancelCurrentEventWithResumptionOffset(@ByValue CMTime resumptionOffset);

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

    /**
     * Specifies the current schedule of interstitial events.
     * 
     * Setting this property to a non-nil value cancels and overrides all previously scheduled future interstitial
     * events, including those that are intrinsically specified by the content of primary items, such as directives
     * carried by HLS media playlists. Setting it to nil causes its value to be reset in accordance with the content of
     * the current primary item.
     * 
     * If you change the value of events during an interstitial event and the current event is not included in the new
     * value of events, the current event is nevertheless allowed to continue until completion. If you wish to cancel
     * the current event, use -cancelCurrentEventWithResumptionOffset:.
     * 
     * If interstitial events are scheduled with dates that coincide either with the date of another scheduled
     * interstitial event or with the date range of the primary content that's omitted according to the resumption
     * offset of another scheduled interstitial event, the primary content will remain suspended until all coinciding
     * interstitial events have been completed. The effective resumption offset will be the sum of the resumption
     * offsets of the coinciding interstitial events. (Note that the sum of a numeric CMTime and kCMTimeIndefinite is
     * kCMTimeIndefinite.)
     * 
     * If interstitial events are scheduled for the same date, they are ordered according to their position in the
     * events array.
     * 
     * The receiver will make a copy of the events that are set on it. Subsequent mutations on the original events will
     * have no effect on the copy.
     * 
     * An NSInvalidArgumentException will be raised if an under-specified AVPlayerInterstitialEvent is set, such as one
     * with a nil primaryItem, or with neither a time nor a date.
     * 
     * API-Since: 15.0
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

    /**
     * This method throws an exception if the primary player is an interstitial player.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithPrimaryPlayer:")
    public native AVPlayerInterstitialEventController initWithPrimaryPlayer(@NotNull AVPlayer primaryPlayer);

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
     * Returns an instance of AVPlayerInterstitialEvent for use in observing and scheduling interstitial playback.
     * 
     * This method throws an exception if the primary player is an interstitial player.
     * 
     * - Parameter primaryPlayer: The AVPlayer that will play the primaryItems of the receiver's interstitial events.
     * 
     * - Returns: An instance of AVPlayerInterstitialEventController.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("interstitialEventControllerWithPrimaryPlayer:")
    public static native AVPlayerInterstitialEventController interstitialEventControllerWithPrimaryPlayer(
            @NotNull AVPlayer primaryPlayer);

    @Generated
    @Selector("interstitialEventMonitorWithPrimaryPlayer:")
    public static native AVPlayerInterstitialEventController interstitialEventMonitorWithPrimaryPlayer(
            @NotNull AVPlayer primaryPlayer);

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
    public static native AVPlayerInterstitialEventController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies the current schedule of interstitial events.
     * 
     * Setting this property to a non-nil value cancels and overrides all previously scheduled future interstitial
     * events, including those that are intrinsically specified by the content of primary items, such as directives
     * carried by HLS media playlists. Setting it to nil causes its value to be reset in accordance with the content of
     * the current primary item.
     * 
     * If you change the value of events during an interstitial event and the current event is not included in the new
     * value of events, the current event is nevertheless allowed to continue until completion. If you wish to cancel
     * the current event, use -cancelCurrentEventWithResumptionOffset:.
     * 
     * If interstitial events are scheduled with dates that coincide either with the date of another scheduled
     * interstitial event or with the date range of the primary content that's omitted according to the resumption
     * offset of another scheduled interstitial event, the primary content will remain suspended until all coinciding
     * interstitial events have been completed. The effective resumption offset will be the sum of the resumption
     * offsets of the coinciding interstitial events. (Note that the sum of a numeric CMTime and kCMTimeIndefinite is
     * kCMTimeIndefinite.)
     * 
     * If interstitial events are scheduled for the same date, they are ordered according to their position in the
     * events array.
     * 
     * The receiver will make a copy of the events that are set on it. Subsequent mutations on the original events will
     * have no effect on the copy.
     * 
     * An NSInvalidArgumentException will be raised if an under-specified AVPlayerInterstitialEvent is set, such as one
     * with a nil primaryItem, or with neither a time nor a date.
     * 
     * API-Since: 15.0
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The bundle that contains the localized strings to be used by the AVPlayerInterstitialEventController.
     * 
     * If the value of the property is nil, any UI elements triggered by the AVPlayerInterstitialEventController, such
     * as the skip button, may contain a generic label based on the implementation of the UI that's in use. To ensure
     * the best available user experience in various playback configurations, including external playback, set a value
     * for this property that provides localized translations of skip control labels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("localizedStringsBundle")
    @Nullable
    public native NSBundle localizedStringsBundle();

    /**
     * The name of the table in the bundle that contains the localized strings to be used by the
     * AVPlayerInterstitialEventController.
     * 
     * If the value of the property is nil, it will default to "Localizable"
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("localizedStringsTableName")
    @Nullable
    public native String localizedStringsTableName();

    /**
     * The bundle that contains the localized strings to be used by the AVPlayerInterstitialEventController.
     * 
     * If the value of the property is nil, any UI elements triggered by the AVPlayerInterstitialEventController, such
     * as the skip button, may contain a generic label based on the implementation of the UI that's in use. To ensure
     * the best available user experience in various playback configurations, including external playback, set a value
     * for this property that provides localized translations of skip control labels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLocalizedStringsBundle:")
    public native void setLocalizedStringsBundle(@Nullable NSBundle value);

    /**
     * The name of the table in the bundle that contains the localized strings to be used by the
     * AVPlayerInterstitialEventController.
     * 
     * If the value of the property is nil, it will default to "Localizable"
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLocalizedStringsTableName:")
    public native void setLocalizedStringsTableName(@Nullable String value);

    /**
     * Causes the playback of the currently playing interstital event to be abandoned.
     * 
     * Note that coinciding events will NOT be skipped.
     * This results in AVPlayerInterstitialEventMonitorCurrentEventSkippedNotification being posted.
     * Has no effect while the currentEvent is nil.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("skipCurrentEvent")
    public native void skipCurrentEvent();
}

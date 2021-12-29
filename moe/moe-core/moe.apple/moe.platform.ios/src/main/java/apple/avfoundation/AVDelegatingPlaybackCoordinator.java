package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVPlaybackCoordinatorPlaybackControlDelegate;
import apple.coremedia.opaque.CMTimebaseRef;
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
 * AVDelegatingPlaybackCoordinator
 * <p>
 * An AVPlaybackCoordinator subclass for controlling a custom playback object.
 * [@note]		Use AVPlayer's playbackCoordinator property to get an AVPlaybackCoordinator for an AVPlayer.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVDelegatingPlaybackCoordinator extends AVPlaybackCoordinator {
    static {
        NatJ.register();
    }

    @Generated
    protected AVDelegatingPlaybackCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVDelegatingPlaybackCoordinator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVDelegatingPlaybackCoordinator allocWithZone(VoidPtr zone);

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
     * coordinateRateChangeToRate:options:
     * <p>
     * Coordinaties a rate change across the group of connected participants, waiting for other participants to become ready if necessary.
     * <p>
     * The coordinator will request a coordinated rate change from all other connected participants.
     * When changing the rate from zero to non-zero, it may also wait out other participant's suspensions as configured by the suspensionReasonsThatTriggerWaiting property.
     * <p>
     * This method should not be called when the rate change should not affect the group, or the group should not have control over local playback temporarily, e.g. a pause because of an audio session interruption.
     * In those cases, the coordinator should be informed by beginning a suspension with the appropriate reason instead. If other participants pause is dependent on the coordinator's configuration.
     * The suspension will stop the coordinator from issuing further commands to its playbackControlDelegate. After beginning the suspension, the playback object can be reconfigured as necessary.
     * [@note]		Calling this method while the coordinator is suspended affects only the local playback object. The group state will not be affected, even after the suspension ends.
     *
     * @param        rate The playback rate the group should be using.
     * @param        options Additional configuration of the rate change. For details see AVDelegatingPlaybackCoordinatorRateChangeOptions.
     */
    @Generated
    @Selector("coordinateRateChangeToRate:options:")
    public native void coordinateRateChangeToRateOptions(float rate, @NUInt long options);

    /**
     * coordinateSeekToTime:
     * <p>
     * Triggers a seek to the requested time for all connected participants.
     * <p>
     * For behavior around resuming playback after the seek is complete and suspensions, see the discussion of coordinateRateChangeToRate:options.
     * [@note]		Calling this method while the coordinator is suspended affects only the local playback object. The group state will not be affected, even after the suspension ends.
     * To end a suspension and also affect the group timing see -[AVCoordinatedPlaybackSuspension endProposingNewTime:]
     *
     * @param        time The time the group should seek to when the command ends.
     * @param        options Additional configuration of the seek. For details see AVDelegatingPlaybackCoordinatorSeekOptions.
     */
    @Generated
    @Selector("coordinateSeekToTime:options:")
    public native void coordinateSeekToTimeOptions(@ByValue CMTime time, @NUInt long options);

    /**
     * [@property]	currentItemIdentifier
     * <p>
     * The item identifier of the current item. Previously set by a call to transitionToItemWithIdentifier:proposingInitialTimingBasedOnTimebase:
     */
    @Generated
    @Selector("currentItemIdentifier")
    public native String currentItemIdentifier();

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
    public native AVDelegatingPlaybackCoordinator init();

    /**
     * initWithPlaybackControlDelegate:
     * <p>
     * Creates an AVPlaybackCoordinator for a custom playback object.
     * <p>
     * Use this to create an AVPlaybackCoordinator when playback is not driven by an AVPlayer.
     * [@note]		See AVPlayer's playbackCoordinator property to get an AVPlaybackCoordinator for an AVPlayer.
     *
     * @param        playbackControlDelegate An object conforming to the AVPlaybackCoordinatorPlaybackControlDelegate protocol representing a custom playback object.
     * The coordinator will only hold a weak reference to its delegate.
     */
    @Generated
    @Selector("initWithPlaybackControlDelegate:")
    public native AVDelegatingPlaybackCoordinator initWithPlaybackControlDelegate(
            @Mapped(ObjCObjectMapper.class) AVPlaybackCoordinatorPlaybackControlDelegate playbackControlDelegate);

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
    public static native AVDelegatingPlaybackCoordinator new_objc();

    /**
     * [@property]	playbackControlDelegate
     * <p>
     * The custom player implementation controlled by the coordinator.
     */
    @Generated
    @Selector("playbackControlDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlaybackCoordinatorPlaybackControlDelegate playbackControlDelegate();

    /**
     * reapplyCurrentItemStateToPlaybackControlDelegate
     * <p>
     * Instructs the coordinator to re-issue commands to synchronize the current item back to the state of the other participants.
     * <p>
     * Use this method when the playback object is in a state that doesn't match the group for some reason and should be re-synchronized.
     */
    @Generated
    @Selector("reapplyCurrentItemStateToPlaybackControlDelegate")
    public native void reapplyCurrentItemStateToPlaybackControlDelegate();

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

    /**
     * transitionToItemWithIdentifier:proposingInitialTimingBasedOnTimebase:
     * <p>
     * Informs the coordinator to transition to a new current item.
     * <p>
     * The coordinator will stop sending commands for any previous item identifier and begin sending commands for the new identifier.
     * The proposed timing will either be used as the new referece timing for the group, or it will be compared to an already existing reference timing.
     * If the proposed timing doesn't match such an existing reference timing, the coordinator will use the playbackControlDelegate to issue appropriate commands to match up the timing.
     * [@note] 		This is not a way to affect the play queue of other participants. All other participants must do this independently, e.g. as a side-effect of an automatic item transition or an out-of-band communication requesting a similar item change.
     *
     * @param        itemIdentifier The identifier for the new current item. May be nil if nothing is playing.
     * @param        snapshotTimebase A timebase used to communicate the initial playback state of the new item. If NULL, the coordinator will assume that playback is paused at kCMTimeZero.
     * An appropriate timebase to pass to the completion handler may be retreived from AVFoundation playback objects such as AVSampleBufferRenderSynchronizer.
     * It can also be created manually using CMTimebaseCreateWithSourceClock. The timebase will only be used to take a snapshot of its immediate timing. It will not be observed further.
     */
    @Generated
    @Selector("transitionToItemWithIdentifier:proposingInitialTimingBasedOnTimebase:")
    public native void transitionToItemWithIdentifierProposingInitialTimingBasedOnTimebase(String itemIdentifier,
            CMTimebaseRef snapshotTimebase);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

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

/**
 * AVPlaybackCoordinator
 * 
 * The playback coordinator negotiates playback state between a player, such as AVPlayer or a custom playback object
 * represented by an implementation of the AVPlaybackCoordinatorPlaybackControlDelegate protocol, and a group of other
 * connected players.
 * 
 * AVPlaybackCoordinator will match rate and time of all connected players. This means that a local rate change or seek
 * will be reflected in all connected players. Equally, a rate change or seek in any of the connected players will be
 * reflected locally.
 * AVPlaybackCoordinator does not manage the items in the play queue of the connected players, so it is up to player's
 * owner to share and match the play queue across participants.
 * The coordinator does, however, keep track of the identity of items enqueued in each player. This means that for one
 * player's current time and rate to be applied on another player, both players must be playing the same item. If two
 * players are playing different items, they each have independent playback states. When one of the two players
 * transitions to the other's item later, it will match the time and rate of that other player.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlaybackCoordinator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlaybackCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlaybackCoordinator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlaybackCoordinator allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * beginSuspensionForReason:
     * 
     * Informs the coordinator that its playback object is detached from the group for some reason and should not
     * receive any playback commands from the coordinator.
     * 
     * Use this to tell the coordinator that its player cannot, or should not, participate in coordinated playback
     * temporarily.
     * The coordinator will not respond to playback commands coming from the group and it will also not send any
     * commands to the group.
     * To resume in group playback, end a suspension by calling one of the suspension's end methods.
     * [@note] See the description of AVPlaybackCoordinator subclasses for suspensions automatically begun on behalf of
     * their playback objects, if any.
     * 
     * @param suspensionReason
     *                         Indicates the reason for the suspension that is shared with other participants. Can be a
     *                         system-defined reason (see AVCoordinatedPlaybackSuspensionReason*) or a custom string.
     */
    @NotNull
    @Generated
    @Selector("beginSuspensionForReason:")
    public native AVCoordinatedPlaybackSuspension beginSuspensionForReason(@NotNull String suspensionReason);

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
     * expectedItemTimeAtHostTime:
     * 
     * Returns the item time (for the current item) that the coordinator expects to be playing at a given host clock
     * time.
     * 
     * This method is useful to decide if it is appropriate to end a suspension, e.g. a suspension with
     * AVCoordinatedPlaybackSuspensionReasonStallRecovery, while other participants are continuing playback.
     */
    @Generated
    @Selector("expectedItemTimeAtHostTime:")
    @ByValue
    public native CMTime expectedItemTimeAtHostTime(@ByValue CMTime hostClockTime);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVPlaybackCoordinator init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlaybackCoordinator new_objc();

    /**
     * [@property] otherParticipants
     * 
     * The playback states of the other participants in the group.
     * 
     * Use this property to create UI informing the local user about the state of other participants in the group.
     * [@note] The coordinator posts AVPlaybackCoordinatorOtherParticipantsDidChangeNotification when the contents of
     * the array changes.
     */
    @NotNull
    @Generated
    @Selector("otherParticipants")
    public native NSArray<? extends AVCoordinatedPlaybackParticipant> otherParticipants();

    /**
     * participantLimitForWaitingOutSuspensionsWithReason:
     * 
     * Returns the maximum number of participants that can be in a group before the coordinator stops waiting out this
     * particular suspensions reason. Default value is NSIntegerMax.
     */
    @Generated
    @Selector("participantLimitForWaitingOutSuspensionsWithReason:")
    @NInt
    public native long participantLimitForWaitingOutSuspensionsWithReason(@NotNull String reason);

    /**
     * [@property] pauseSnapsToMediaTimeOfOriginator
     * 
     * Determines if participants should mirror the originator's stop time when pausing.
     * 
     * If YES, all participants will seek to the originator's stop time after they pause. Use this if it is desirable to
     * counteract any network delay incurred by communicating the originator's pause to the other participants.
     * If NO, it's acceptable for participants to stop at slightly different offsets and a pause will not cause other
     * participants' time to jump back.
     */
    @Generated
    @Selector("pauseSnapsToMediaTimeOfOriginator")
    public native boolean pauseSnapsToMediaTimeOfOriginator();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setParticipantLimit:forWaitingOutSuspensionsWithReason:
     * 
     * Sets the amount of participants that can join a group before the coordinator stops waiting for this particular
     * suspension reason.
     * 
     * This allows additional configuration for suspension reasons in the suspensionReasonsThatTriggerWaiting array.
     * When the coordinator decides whether one participant's suspensions should cause others to wait, it will also
     * consider this limit of participants currently in the group.
     */
    @Generated
    @Selector("setParticipantLimit:forWaitingOutSuspensionsWithReason:")
    public native void setParticipantLimitForWaitingOutSuspensionsWithReason(@NInt long participantLimit,
            @NotNull String reason);

    /**
     * [@property] pauseSnapsToMediaTimeOfOriginator
     * 
     * Determines if participants should mirror the originator's stop time when pausing.
     * 
     * If YES, all participants will seek to the originator's stop time after they pause. Use this if it is desirable to
     * counteract any network delay incurred by communicating the originator's pause to the other participants.
     * If NO, it's acceptable for participants to stop at slightly different offsets and a pause will not cause other
     * participants' time to jump back.
     */
    @Generated
    @Selector("setPauseSnapsToMediaTimeOfOriginator:")
    public native void setPauseSnapsToMediaTimeOfOriginator(boolean value);

    /**
     * [@property] suspensionReasonsThatTriggerWaiting
     * 
     * If the coordinator decides to delay playback to wait for others, it will wait out these reasons, but not others.
     */
    @Generated
    @Selector("setSuspensionReasonsThatTriggerWaiting:")
    public native void setSuspensionReasonsThatTriggerWaiting(@NotNull NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] suspensionReasons
     * 
     * Describes why the coordinator is currently not able to participate in group playback.
     * 
     * If the list of reasons is non-empty, the coordinator will not react to any changes of group playback state.
     */
    @NotNull
    @Generated
    @Selector("suspensionReasons")
    public native NSArray<String> suspensionReasons();

    /**
     * [@property] suspensionReasonsThatTriggerWaiting
     * 
     * If the coordinator decides to delay playback to wait for others, it will wait out these reasons, but not others.
     */
    @NotNull
    @Generated
    @Selector("suspensionReasonsThatTriggerWaiting")
    public native NSArray<String> suspensionReasonsThatTriggerWaiting();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

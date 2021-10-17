package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * AVDelegatingPlaybackCoordinatorSeekCommand
 * <p>
 * A playback command requesting a seek.
 * <p>
 * If the current playback rate is non-zero, playback should not automatically resume after the seek. Instead the delegate should pause and wait for the coordinator to issue another PlayCommand.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVDelegatingPlaybackCoordinatorSeekCommand extends AVDelegatingPlaybackCoordinatorPlaybackControlCommand {
    static {
        NatJ.register();
    }

    @Generated
    protected AVDelegatingPlaybackCoordinatorSeekCommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVDelegatingPlaybackCoordinatorSeekCommand alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * [@property]	anticipatedPlaybackRate
     * <p>
     * The rate to prepare for if shouldBufferInAnticipationOfPlayback is YES.
     */
    @Generated
    @Selector("anticipatedPlaybackRate")
    public native float anticipatedPlaybackRate();

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
     * [@property]	completionDueDate
     * <p>
     * Communicates when the coordinator expects the command's completion handler at the latest.
     * <p>
     * A seek command expecting buffering in anticipation of playback does expect the receiver to fire the completion handler by this date at the latest.
     * This is useful in buffering situations where the receiver has not yet buffered enough data to be considered ready to play by the due date.
     * The receiver should then decide to either complete the command as is to try and keep up with the group, or alternatively begin a stall recovery
     * suspension to communicate the situation to the other participants.
     * Completing the command after this date means that the coordinator will likely send a play command for a later time than the receiver buffered for.
     */
    @Generated
    @Selector("completionDueDate")
    public native NSDate completionDueDate();

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
    public native AVDelegatingPlaybackCoordinatorSeekCommand init();

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

    /**
     * [@property]	itemTime
     * <p>
     * The time to seek the currentItem to.
     * <p>
     * Playback should never automatically resume after seeking to this time. The coordinator will issue a new PlayCommand when everyone else is ready to resume.
     */
    @Generated
    @Selector("itemTime")
    @ByValue
    public native CMTime itemTime();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]	shouldBufferInAnticipationOfPlayback
     * <p>
     * Indicates that playback is anticipated and the player should begin buffering if necessary.
     * <p>
     * When shouldBufferInAnticipationOfPlayback, playback is expected to eventually resume at the rate indicated by the anticipatedPlaybackRate property.
     * This should be treated similar to receiving a separate AVDelegatingPlaybackCoordinatorBufferingCommand.
     * If YES, the command should only be considered complete once the player is ready to receive an AVDelegatingPlaybackCoordinatorPlayCommand with the indicated rate.
     */
    @Generated
    @Selector("shouldBufferInAnticipationOfPlayback")
    public native boolean shouldBufferInAnticipationOfPlayback();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

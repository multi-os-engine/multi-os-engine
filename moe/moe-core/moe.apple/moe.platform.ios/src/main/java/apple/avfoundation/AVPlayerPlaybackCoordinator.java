package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVPlayerPlaybackCoordinatorDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * AVPlayerPlaybackCoordinator
 * 
 * An AVPlaybackCoordinator subclass for controlling an AVPlayer
 * 
 * While the coordinator is connected to other participants, it will intercept rate changes and seeks issued to the
 * player to share these with other participants if appropriate.
 * Clients of AVPlayer can thus use the AVPlayer interfaces to modify the playback state of connected participants. When
 * appropriate, the coordinator will also impose rate changes and seeks from other participants on the player. If this
 * occurs, the corresponding notifications will carry an originating participant in their payload.
 * See AVPlayer's playbackCoordinator property for more details about player behavior changes.
 * AVPlayerPlaybackCoordinator may begin suspensions on behalf of the player when the player's timeControlStatus changes
 * from AVPlayerTimeControlStatusPlaying to AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate or
 * AVPlayerTimeControlStatusPaused. These suspensions will end when the player's timeControlStatus changes back to
 * AVPlayerTimeControlStatusPlaying. This means that a suspension that begun because the player entered a waiting state,
 * will end automatically when the player is done waiting. A suspension that begun because the player paused, will only
 * end once the player's rate changes back to non-zero.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerPlaybackCoordinator extends AVPlaybackCoordinator {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerPlaybackCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerPlaybackCoordinator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerPlaybackCoordinator allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * An object implementing the AVPlaybackCoordinatorDelegate protocol.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerPlaybackCoordinatorDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVPlayerPlaybackCoordinator init();

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
    public static native AVPlayerPlaybackCoordinator new_objc();

    /**
     * [@property] player
     * 
     * The AVPlayer this coordinator is controlling.
     */
    @Generated
    @Selector("player")
    public native AVPlayer player();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] delegate
     * 
     * An object implementing the AVPlaybackCoordinatorDelegate protocol.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVPlayerPlaybackCoordinatorDelegate value);

    /**
     * [@property] delegate
     * 
     * An object implementing the AVPlaybackCoordinatorDelegate protocol.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVPlayerPlaybackCoordinatorDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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

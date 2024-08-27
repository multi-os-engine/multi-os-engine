package apple.mediaplayer;

import apple.NSObject;
import apple.avfoundation.AVPlayer;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPNowPlayingSessionDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNowPlayingSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPNowPlayingSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add AVPlayer instance to this session.
     */
    @Generated
    @Selector("addPlayer:")
    public native void addPlayer(@NotNull AVPlayer player);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPNowPlayingSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPNowPlayingSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * When YES, now playing info will be automatically published, and nowPlayingInfoCenter must not be used.
     * Now playing info keys to be incorporated by automatic publishing can be set on the AVPlayerItem's nowPlayingInfo
     * property.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("automaticallyPublishesNowPlayingInfo")
    public native boolean automaticallyPublishesNowPlayingInfo();

    /**
     * Asks the system to make this session the active now playing sessin for the App.
     */
    @Generated
    @Selector("becomeActiveIfPossibleWithCompletion:")
    public native void becomeActiveIfPossibleWithCompletion(
            @Nullable @ObjCBlock(name = "call_becomeActiveIfPossibleWithCompletion") Block_becomeActiveIfPossibleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_becomeActiveIfPossibleWithCompletion {
        @Generated
        void call_becomeActiveIfPossibleWithCompletion(boolean isActive);
    }

    /**
     * Returns a Boolean value indicating whether this session can become the App's active now playing session.
     */
    @Generated
    @Selector("canBecomeActive")
    public native boolean canBecomeActive();

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

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPNowPlayingSessionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPNowPlayingSession init();

    /**
     * Creates a session associated with a given AVPlayer instance. This will assert if players is nil or empty.
     */
    @Generated
    @Selector("initWithPlayers:")
    public native MPNowPlayingSession initWithPlayers(@NotNull NSArray<? extends AVPlayer> players);

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
     * Returns a Boolean value indicating whether this session is the App's active now playing session.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

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
    public static native MPNowPlayingSession new_objc();

    /**
     * The now playing info center that is associated with this session.
     */
    @NotNull
    @Generated
    @Selector("nowPlayingInfoCenter")
    public native MPNowPlayingInfoCenter nowPlayingInfoCenter();

    /**
     * AVPlayer instances associated with this session.
     */
    @NotNull
    @Generated
    @Selector("players")
    public native NSArray<? extends AVPlayer> players();

    /**
     * The remote command center that is associated with this session.
     */
    @NotNull
    @Generated
    @Selector("remoteCommandCenter")
    public native MPRemoteCommandCenter remoteCommandCenter();

    /**
     * Remove AVPlayer instance from this session.
     */
    @Generated
    @Selector("removePlayer:")
    public native void removePlayer(@NotNull AVPlayer player);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * When YES, now playing info will be automatically published, and nowPlayingInfoCenter must not be used.
     * Now playing info keys to be incorporated by automatic publishing can be set on the AVPlayerItem's nowPlayingInfo
     * property.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAutomaticallyPublishesNowPlayingInfo:")
    public native void setAutomaticallyPublishesNowPlayingInfo(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) MPNowPlayingSessionDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MPNowPlayingSessionDelegate value) {
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
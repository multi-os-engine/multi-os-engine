package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INPlayMediaIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INPlayMediaIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INPlayMediaIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INPlayMediaIntent allocWithZone(VoidPtr zone);

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
    public native INPlayMediaIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INPlayMediaIntent initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 12.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the designated initializer instead
     */
    @Deprecated
    @Generated
    @Selector("initWithMediaItems:mediaContainer:playShuffled:playbackRepeatMode:resumePlayback:")
    public native INPlayMediaIntent initWithMediaItemsMediaContainerPlayShuffledPlaybackRepeatModeResumePlayback(
            @Nullable NSArray<? extends INMediaItem> mediaItems, @Nullable INMediaItem mediaContainer,
            @Nullable NSNumber playShuffled, @NInt long playbackRepeatMode, @Nullable NSNumber resumePlayback);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithMediaItems:mediaContainer:playShuffled:playbackRepeatMode:resumePlayback:playbackQueueLocation:playbackSpeed:mediaSearch:")
    public native INPlayMediaIntent initWithMediaItemsMediaContainerPlayShuffledPlaybackRepeatModeResumePlaybackPlaybackQueueLocationPlaybackSpeedMediaSearch(
            @Nullable NSArray<? extends INMediaItem> mediaItems, @Nullable INMediaItem mediaContainer,
            @Nullable NSNumber playShuffled, @NInt long playbackRepeatMode, @Nullable NSNumber resumePlayback,
            @NInt long playbackQueueLocation, @Nullable NSNumber playbackSpeed, @Nullable INMediaSearch mediaSearch);

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

    @Nullable
    @Generated
    @Selector("mediaContainer")
    public native INMediaItem mediaContainer();

    @Nullable
    @Generated
    @Selector("mediaItems")
    public native NSArray<? extends INMediaItem> mediaItems();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("mediaSearch")
    public native INMediaSearch mediaSearch();

    @Generated
    @Owned
    @Selector("new")
    public static native INPlayMediaIntent new_objc();

    /**
     * An NSNumber representing a boolean value where true indicates that the media should be shuffled.
     */
    @Nullable
    @Generated
    @Selector("playShuffled")
    public native NSNumber playShuffled();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("playbackQueueLocation")
    @NInt
    public native long playbackQueueLocation();

    @Generated
    @Selector("playbackRepeatMode")
    @NInt
    public native long playbackRepeatMode();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("playbackSpeed")
    public native NSNumber playbackSpeed();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An NSNumber representing a boolean value where true indicates that the media should be resumed.
     */
    @Nullable
    @Generated
    @Selector("resumePlayback")
    public native NSNumber resumePlayback();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

package apple.mediaaccessibility;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * API-Since: 18.0
 */
@Generated
@Library("MediaAccessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MAMusicHapticsManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MAMusicHapticsManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Determine the status of haptic playback for the now playing track asynchronously. This will only be delivered for
     * the app that is the active Now Playing app.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addStatusObserver:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object addStatusObserver(
            @ObjCBlock(name = "call_addStatusObserver") @NotNull Block_addStatusObserver statusHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addStatusObserver {
        @Generated
        void call_addStatusObserver(@NotNull String internationalStandardRecordingCode, boolean musicHapticsActive);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MAMusicHapticsManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MAMusicHapticsManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * In an asynchronous completion handler, returns whether a specific media track with the supplied
     * ISRC has an available haptic track.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("checkHapticTrackAvailabilityForMediaMatchingCode:completionHandler:")
    public native void checkHapticTrackAvailabilityForMediaMatchingCodeCompletionHandler(
            @NotNull String internationalStandardRecordingCode,
            @ObjCBlock(name = "call_checkHapticTrackAvailabilityForMediaMatchingCodeCompletionHandler") @Nullable Block_checkHapticTrackAvailabilityForMediaMatchingCodeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkHapticTrackAvailabilityForMediaMatchingCodeCompletionHandler {
        @Generated
        void call_checkHapticTrackAvailabilityForMediaMatchingCodeCompletionHandler(boolean musicHapticsAvailable);
    }

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native MAMusicHapticsManager init();

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
     * Whether the user setting to indicate Music Haptics are currently active.
     * 
     * @return A boolean result.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MAMusicHapticsManager new_objc();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeStatusObserver:")
    public native void removeStatusObserver(@Mapped(ObjCObjectMapper.class) @NotNull Object registrationToken);

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
     * API-Since: 18.0
     */
    @Generated
    @Selector("sharedManager")
    @NotNull
    public static native MAMusicHapticsManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
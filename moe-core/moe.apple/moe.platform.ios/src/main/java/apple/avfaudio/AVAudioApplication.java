package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Class containing methods that relate to an application bundle's audio (i.e. a collection of one or more
 * AVAudioSession instances)
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioApplication extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioApplication(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioApplication alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAudioApplication allocWithZone(VoidPtr zone);

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
    public native AVAudioApplication init();

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
     * Get the input muted state - return value is boolean 0 for unmuted or value 1 for muted (input samples zeroed out)
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isInputMuted")
    public native boolean isInputMuted();

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
    public static native AVAudioApplication new_objc();

    /**
     * Returns an enum indicating whether the user has granted or denied permission to record, or has
     * not been asked
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("recordPermission")
    @NInt
    public native long recordPermission();

    /**
     * Checks to see if calling process has permission to record audio.
     * 
     * The 'response' block will be called immediately if permission has already been granted or
     * denied. Otherwise, it presents a dialog to notify the user and allow them to choose, and calls
     * the block once the UI has been dismissed. 'granted' indicates whether permission has been
     * granted. Note that the block may be called in a different thread context.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("requestRecordPermissionWithCompletionHandler:")
    public static native void requestRecordPermissionWithCompletionHandler(
            @ObjCBlock(name = "call_requestRecordPermissionWithCompletionHandler") @NotNull Block_requestRecordPermissionWithCompletionHandler response);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestRecordPermissionWithCompletionHandler {
        @Generated
        void call_requestRecordPermissionWithCompletionHandler(boolean granted);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set the muted/unmuted state of the application's audio input. When set true, inputs
     * (microphone etc.) of all audio clients relating to this application will have their samples zeroed out.
     * [@note] - this is per-application input muting and doesn't affect the hardware mute state.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setInputMuted:error:")
    public native boolean setInputMutedError(boolean muted,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> outError);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns the singleton instance
     */
    @Generated
    @Selector("sharedInstance")
    @NotNull
    public static native AVAudioApplication sharedInstance();

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
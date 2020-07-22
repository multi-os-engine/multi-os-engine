package apple.corehaptics;

import apple.NSObject;
import apple.avfoundation.AVAudioSession;
import apple.corehaptics.protocol.CHHapticAdvancedPatternPlayer;
import apple.corehaptics.protocol.CHHapticDeviceCapability;
import apple.corehaptics.protocol.CHHapticPatternPlayer;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticEngine alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("capabilitiesForHardware")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CHHapticDeviceCapability capabilitiesForHardware();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("createAdvancedPlayerWithPattern:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CHHapticAdvancedPatternPlayer createAdvancedPlayerWithPatternError(CHHapticPattern pattern,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("createPlayerWithPattern:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CHHapticPatternPlayer createPlayerWithPatternError(CHHapticPattern pattern,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("currentTime")
    public native double currentTime();

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
    public native CHHapticEngine init();

    @Generated
    @Selector("initAndReturnError:")
    public native CHHapticEngine initAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithAudioSession:error:")
    public native CHHapticEngine initWithAudioSessionError(AVAudioSession audioSession,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("isAutoShutdownEnabled")
    public native boolean isAutoShutdownEnabled();

    @Generated
    @Selector("isMutedForAudio")
    public native boolean isMutedForAudio();

    @Generated
    @Selector("isMutedForHaptics")
    public native boolean isMutedForHaptics();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("notifyWhenPlayersFinished:")
    public native void notifyWhenPlayersFinished(
            @ObjCBlock(name = "call_notifyWhenPlayersFinished") Block_notifyWhenPlayersFinished finishedHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenPlayersFinished {
        @Generated
        @NInt
        long call_notifyWhenPlayersFinished(NSError error);
    }

    @Generated
    @Selector("playPatternFromData:error:")
    public native boolean playPatternFromDataError(NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("playPatternFromURL:error:")
    public native boolean playPatternFromURLError(NSURL fileURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("playsHapticsOnly")
    public native boolean playsHapticsOnly();

    @Generated
    @Selector("registerAudioResource:options:error:")
    @NUInt
    public native long registerAudioResourceOptionsError(NSURL resourceURL, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("resetHandler")
    @ObjCBlock(name = "call_resetHandler_ret")
    public native Block_resetHandler_ret resetHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetHandler_ret {
        @Generated
        void call_resetHandler_ret();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAutoShutdownEnabled:")
    public native void setAutoShutdownEnabled(boolean value);

    @Generated
    @Selector("setIsMutedForAudio:")
    public native void setIsMutedForAudio(boolean value);

    @Generated
    @Selector("setIsMutedForHaptics:")
    public native void setIsMutedForHaptics(boolean value);

    @Generated
    @Selector("setPlaysHapticsOnly:")
    public native void setPlaysHapticsOnly(boolean value);

    @Generated
    @Selector("setResetHandler:")
    public native void setResetHandler(@ObjCBlock(name = "call_setResetHandler") Block_setResetHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setResetHandler {
        @Generated
        void call_setResetHandler();
    }

    @Generated
    @Selector("setStoppedHandler:")
    public native void setStoppedHandler(@ObjCBlock(name = "call_setStoppedHandler") Block_setStoppedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setStoppedHandler {
        @Generated
        void call_setStoppedHandler(@NInt long stoppedReason);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("startWithCompletionHandler:")
    public native void startWithCompletionHandler(
            @ObjCBlock(name = "call_startWithCompletionHandler") Block_startWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithCompletionHandler {
        @Generated
        void call_startWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("stopWithCompletionHandler:")
    public native void stopWithCompletionHandler(
            @ObjCBlock(name = "call_stopWithCompletionHandler") Block_stopWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithCompletionHandler {
        @Generated
        void call_stopWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("stoppedHandler")
    @ObjCBlock(name = "call_stoppedHandler_ret")
    public native Block_stoppedHandler_ret stoppedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stoppedHandler_ret {
        @Generated
        void call_stoppedHandler_ret(@NInt long stoppedReason);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unregisterAudioResource:error:")
    public native boolean unregisterAudioResourceError(@NUInt long resourceID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
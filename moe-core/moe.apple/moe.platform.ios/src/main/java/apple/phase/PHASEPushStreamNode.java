package apple.phase;

import apple.NSObject;
import apple.avfaudio.AVAudioFormat;
import apple.avfaudio.AVAudioPCMBuffer;
import apple.avfaudio.AVAudioTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] PHASEPushStreamNode
 * 
 * An object for addessing an instance of a stream in an executing sound event
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEPushStreamNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEPushStreamNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEPushStreamNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEPushStreamNode allocWithZone(VoidPtr zone);

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

    /**
     * [@property] format
     * 
     * The readonly property that returns the AVAudioFormat that this stream was initialized with.
     */
    @NotNull
    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    /**
     * [@property] gainMetaParameter
     * 
     * If specified during construction, the metaparameter for controlling gain will be available here
     */
    @Nullable
    @Generated
    @Selector("gainMetaParameter")
    public native PHASENumberMetaParameter gainMetaParameter();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEPushStreamNode init();

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

    /**
     * [@property] mixer
     * 
     * The readonly property that returns the PHASEMixer this sampler was created with and assigned to.
     */
    @NotNull
    @Generated
    @Selector("mixer")
    public native PHASEMixer mixer();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEPushStreamNode new_objc();

    /**
     * [@property] rateMetaParameter
     * 
     * If specified during construction, the metaparameter for controlling rate/pitch will be available here
     */
    @Nullable
    @Generated
    @Selector("rateMetaParameter")
    public native PHASENumberMetaParameter rateMetaParameter();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * scheduleBuffer
     * 
     * Schedule a buffer for playback.
     * 
     * Schedules the buffer to be played following any previously scheduled buffer(s).
     * The buffer format must be same as format specified during player instantiation
     * 
     * @param buffer
     *               The buffer with PCM audio data.
     */
    @Generated
    @Selector("scheduleBuffer:")
    public native void scheduleBuffer(@NotNull AVAudioPCMBuffer buffer);

    /**
     * scheduleBuffer:atTime:options:
     * 
     * Schedule a buffer for playback at a given time.
     * 
     * The buffer format must be same as format specified during player instantiation
     * 
     * @param buffer
     *                The buffer with PCM audio data.
     * @param when
     *                The time at which to play the buffer. see the discussion of timestamps, above.
     * @param options
     *                Options for looping, interrupting other buffers, etc.
     */
    @Generated
    @Selector("scheduleBuffer:atTime:options:")
    public native void scheduleBufferAtTimeOptions(@NotNull AVAudioPCMBuffer buffer, @Nullable AVAudioTime when,
            @NUInt long options);

    /**
     * scheduleBuffer:atTime:options:completionCallbackType:completionHandler:
     * 
     * Schedule a buffer for playback at a given time.
     * 
     * The buffer format must be same as format specified during player instantiation
     * 
     * @param buffer
     *                               The buffer with PCM audio data.
     * @param when
     *                               The time at which to play the buffer. see the discussion of timestamps, above.
     * @param options
     *                               Options for looping, interrupting other buffers, etc.
     * @param completionCallbackType
     *                               Option to specify when the completion handler must be called.
     * @param completionHandler
     *                               The completionHandler to be called as per the callback type specified or when
     *                               the player is stopped, at which point the buffer can be recycled.
     */
    @Generated
    @Selector("scheduleBuffer:atTime:options:completionCallbackType:completionHandler:")
    public native void scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(
            @NotNull AVAudioPCMBuffer buffer, @Nullable AVAudioTime when, @NUInt long options,
            @NInt long completionCallbackType,
            @NotNull @ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(@NInt long callbackType);
    }

    /**
     * scheduleBuffer:completionCallbackType:completionHandler:
     * 
     * Schedule a buffer for playback.
     * 
     * Schedules the buffer to be played following any previously scheduled buffer(s).
     * The buffer format must be same as format specified during player instantiation
     * 
     * @param buffer
     *                               The buffer with PCM audio data.
     * @param completionCallbackType
     *                               Option to specify when the completion handler must be called.
     * @param completionHandler
     *                               The completionHandler to be called as per the specified completion callback type
     *                               or when the player is stopped, at which point the buffer can be recycled.
     */
    @Generated
    @Selector("scheduleBuffer:completionCallbackType:completionHandler:")
    public native void scheduleBufferCompletionCallbackTypeCompletionHandler(@NotNull AVAudioPCMBuffer buffer,
            @NInt long completionCallbackType,
            @NotNull @ObjCBlock(name = "call_scheduleBufferCompletionCallbackTypeCompletionHandler") Block_scheduleBufferCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferCompletionCallbackTypeCompletionHandler(@NInt long callbackType);
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

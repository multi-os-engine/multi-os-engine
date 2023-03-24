package apple.shazamkit;

import apple.NSObject;
import apple.avfaudio.AVAudioPCMBuffer;
import apple.avfaudio.AVAudioTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.shazamkit.protocol.SHSessionDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A @c SHSession matches instances of @c SHSignature against a @c SHCatalog
 * 
 * A @c SHSession can be used in two distinct ways to match against a @c SHCatalog
 * 
 * 1. Pass a @c SHSignature to the -[SHSession matchSignature:] method and respond to matches sent to the delegate
 * There is a 1 to 1 relationship between calls to this method and calls to the delegate
 * 2. Pass a continuous stream of @c AVAudioPCMBuffer to the -[SHSession matchStreamingBuffer:atTime:] method, matches
 * are sent to the delegate.
 * ShazamKit will convert the buffers in SHSignature objects internally and perform matches against the @c SHCatalog.
 * The details of how the matching
 * is performed is an implementation detail and is subject to change. As such there will be many callbacks to the
 * delegate per stream of audio, and the same match
 * may be reported multiple times in succession.
 * 
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SHSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHSession allocWithZone(VoidPtr zone);

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

    /**
     * The @c SHCatalog used to initialize this session and which all matches will be made against
     */
    @NotNull
    @Generated
    @Selector("catalog")
    public native SHCatalog catalog();

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

    /**
     * A delegate for communicating the results of matching
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SHSessionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Create A new @c SHSession that searches the Shazam Catalog
     */
    @Generated
    @Selector("init")
    public native SHSession init();

    /**
     * Create A new @c SHSession based upon the supplied @c SHCatalog
     * 
     * @param catalog The store of signatures to match against
     */
    @Generated
    @Selector("initWithCatalog:")
    public native SHSession initWithCatalog(@NotNull SHCatalog catalog);

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
     * Match the @c SHSignature against the provided @c SHCatalog
     * 
     * @param signature a @c SHSignature to be matched
     */
    @Generated
    @Selector("matchSignature:")
    public native void matchSignature(@NotNull SHSignature signature);

    /**
     * Flow audio buffers for matching into the session
     * 
     * Audio will be converted into signatures and matched against the @c SHCatalog. Results are communicated through
     * the delegate.
     * The initial buffer specifies the @c AVAudioFormat and all subsequent buffers must contain the same format
     * otherwise an error will be communicated through
     * the delegate.
     * 
     * It is advisable but not required to pass an @c AVAudioTime along with the audio buffer. The audio provided must
     * be contiguous, gaps in the audio will have adverse
     * effects on the ability to match the audio. The time variable is validated by the session to ensure that the audio
     * is contiguous and mitigate the effect of discontiguous audio.
     * [@note] This method will throw an exception if the audio format is not PCM in one of the following sample rates:
     * 48000, 44100, 32000, 16000.
     * 
     * @param buffer A buffer of audio to be used for recognition
     * @param time   Where in the stream the audio occurs
     */
    @Generated
    @Selector("matchStreamingBuffer:atTime:")
    public native void matchStreamingBufferAtTime(@NotNull AVAudioPCMBuffer buffer, @Nullable AVAudioTime time);

    @Generated
    @Owned
    @Selector("new")
    public static native SHSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A delegate for communicating the results of matching
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SHSessionDelegate value);

    /**
     * A delegate for communicating the results of matching
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SHSessionDelegate value) {
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

package apple.shazamkit;

import apple.NSObject;
import apple.avfaudio.AVAudioPCMBuffer;
import apple.avfaudio.AVAudioTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.avfoundation.AVAsset;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] SHSignatureGenerator provides a way to convert audio data into instances of @c SHSignature
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHSignatureGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SHSignatureGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHSignatureGenerator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHSignatureGenerator allocWithZone(VoidPtr zone);

    /**
     * Add audio to the generator
     * 
     * Audio passed to the generator should be contiguous, passing non contiguous data will affect the quality of the @c
     * SHSignature
     * produced. Passing the @c AVAudioTime is not required but recommended, it allows the generator to detect when the
     * audio is not contiguous.
     * This method will throw an exception if the audio format is not PCM in one of the following sample rates: 48000,
     * 44100, 32000, 16000.
     * 
     * @param time   Where in the stream the audio represents
     * @param buffer The audio data to be appended to the signature
     * @param error  An error if there was an issue appending the buffer
     */
    @Generated
    @Selector("appendBuffer:atTime:error:")
    public native boolean appendBufferAtTimeError(@NotNull AVAudioPCMBuffer buffer, @Nullable AVAudioTime time,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public native SHSignatureGenerator init();

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
    public static native SHSignatureGenerator new_objc();

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
     * Convert the current audio data into a @c SHSignature
     * 
     * Signature may be called as many times as needed, each time producing a @c SHSignature from
     * the audio data
     */
    @NotNull
    @Generated
    @Selector("signature")
    public native SHSignature signature();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Create a `SHSignature` from an @c AVAsset.
     * 
     * The asset can be any type of media that has audio tracks. If the asset has multiple tracks, they
     * will be mixed into one @c SHSignature
     * 
     * @param asset             An AVAsset that contains audio you would like to convert to a Signature
     * @param completionHandler A block called with the created @c SHSignature or nil and a populated error parameter if
     *                          a signature could not be created.
     * 
     *                          API-Since: 16.0
     */
    @Generated
    @Selector("generateSignatureFromAsset:completionHandler:")
    public static native void generateSignatureFromAssetCompletionHandler(@NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_generateSignatureFromAssetCompletionHandler") Block_generateSignatureFromAssetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateSignatureFromAssetCompletionHandler {
        @Generated
        void call_generateSignatureFromAssetCompletionHandler(@Nullable SHSignature signature, @Nullable NSError error);
    }
}

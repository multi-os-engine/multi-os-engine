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
 * An object for converting audio data into a signature.
 * 
 * Create both reference and query signatures using this class.
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
     * Adds audio to the generator.
     * 
     * Using noncontiguous audio may result in a lower-quality signature.
     * 
     * The audio must be PCM at one of these rates:
     * 
     * - `48000` hertz
     * - `44100` hertz
     * - `32000` hertz
     * - `16000` hertz
     * 
     * - Parameters:
     * - buffer: The audio data to append to the signature generator.
     * - time: The time position of the start of the audio buffer in the full audio you use to generate the signature.
     * - error: The error that occurs; otherwise, `nil`.
     * 
     * API-Since: 15.0
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
     * Converts the audio buffer into a signature.
     * 
     * - Returns: A signature that ShazamKit generates from the audio buffer.
     * 
     * API-Since: 15.0
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
     * Creates a signature with the asset you specify.
     * 
     * > Important:
     * > You can call this method from synchronous code using a completion handler, as shown on this page, or you can
     * call it as an asynchronous method that has the following declaration:
     * >
     * > ```swift
     * > class func signature(from asset: AVAsset) async throws -> SHSignature
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * The asset you specify can be any type of media that contains audio tracks. If the asset has multiple tracks, the
     * system mixes them into one ``SHSignature``.
     * 
     * - Parameters:
     * - asset: An asset that contains the audio to convert.
     * - completionHandler: The system calls this completion block after creating the signature, or an error if the
     * system couldn't create it.
     * 
     * This block takes the following parameters:
     * 
     * - term `signature`: A new signature instance.
     * - term error: An error object if a problem occurs when creating thesignature; otherwise, `nil`.
     * 
     * API-Since: 16.0
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

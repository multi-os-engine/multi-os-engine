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
 * An object that matches a specific audio recording when a segment of that recording is part of captured sound in the
 * Shazam catalog or your custom catalog.
 * 
 * Prepare to make matches by:
 * 
 * - Creating a session for the catalog that contains the reference signatures
 * - Adding your delegate that receives the match results
 * 
 * Search for a match in one of two ways:
 * 
 * - Generate a signature for the captured audio and call ``match(_:)``
 * - Call ``matchStreamingBuffer(_:at:)`` with a streaming audio buffer, and ShazamKit generates the signature for you
 * 
 * Searching the catalog is asynchronous. The session calls your delegate methods with the result.
 * 
 * Matching songs in Shazam music requires enabling your app to access the catalog. For more information on enabling
 * your app, see [Enable ShazamKit for an App
 * ID](https://developer.apple.com/help/account/configure-app-services/shazamkit).
 * 
 * The code below shows searching for a match in the Shazam catalog using an existing audio buffer:
 * 
 * ```swift
 * Set up the session.
 * let session = SHSession()
 * 
 * Create a signature from the captured audio buffer.
 * let signatureGenerator = SHSignatureGenerator()
 * try signatureGenerator.append(buffer, at: audioTime)
 * let signature = signatureGenerator.signature()
 * 
 * Check for a match.
 * let result = await session.result(from: signature)
 * 
 * Use the result.
 * switch result {
 * case .match(let match):
 * // Match found.
 * case .noMatch(let signature):
 * // No match found.
 * case .error(let error, let signature):
 * // An error occurred.
 * }
 * ```
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
     * The catalog object containing the reference signatures and their associated metadata that the session uses to
     * perform matches.
     * 
     * API-Since: 15.0
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
     * The object that the session calls with the result of a match request.
     * 
     * API-Since: 15.0
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
     * Creates a new session object for matching songs in the Shazam Music catalog.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("init")
    public native SHSession init();

    /**
     * Creates a new session object for matching audio in a custom catalog.
     * 
     * - Parameters:
     * - catalog: The catalog that contains the reference audio signatures and their associated metadata.
     * 
     * API-Since: 15.0
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
     * Searches for the query signature in the reference signatures that the session catalog contains.
     * 
     * - Parameters:
     * - signature: The signature for searching the catalog of reference signatures.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("matchSignature:")
    public native void matchSignature(@NotNull SHSignature signature);

    /**
     * Converts the audio in the buffer to a signature, and searches the reference signatures in the session catalog.
     * 
     * This method continues to generate signatures and perform searches until the audio in the buffer stops, which may
     * result in multiple calls to the ``SHSession/delegate``.
     * 
     * The audio buffer must be in one of the supported formats. For the list of the supported audio formats, see
     * ``SHSignatureGenerator/append(_:at:)``.
     * 
     * To use the microphone as input for the buffer, see <doc:matching-audio-using-the-built-in-microphone>.
     * 
     * > Note:
     * > You must use the audio format of the first call to this method in the current session in all subsequent calls
     * for the session.
     * 
     * - Parameters:
     * - buffer: An audio buffer.
     * - time: The start time of the audio to use for generating the signatures.
     * 
     * API-Since: 15.0
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
     * The object that the session calls with the result of a match request.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SHSessionDelegate value);

    /**
     * The object that the session calls with the result of a match request.
     * 
     * API-Since: 15.0
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

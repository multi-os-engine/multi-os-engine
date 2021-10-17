package apple.phase;

import apple.NSObject;
import apple.avfaudio.AVAudioChannelLayout;
import apple.avfaudio.AVAudioFormat;
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
 * [@interface] PHASEAssetRegistry
 * <p>
 * Asset registry
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEAssetRegistry extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEAssetRegistry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEAssetRegistry alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHASEAssetRegistry allocWithZone(VoidPtr zone);

    /**
     * assetForIdentifier
     * <p>
     * Finds an asset in the asset registry, given an identifier.
     *
     * @param identifier The identifier of this asset
     * @return A PHASEAsset object, or nil if one could not be found.
     */
    @Generated
    @Selector("assetForIdentifier:")
    public native PHASEAsset assetForIdentifier(String identifier);

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
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
     * [@property] globalMetaParameters
     * <p>
     * A dictionary of global metaparameters
     */
    @Generated
    @Selector("globalMetaParameters")
    public native NSDictionary<String, ? extends PHASEMetaParameter> globalMetaParameters();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEAssetRegistry init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEAssetRegistry new_objc();

    /**
     * registerGlobalMetaParameter:error
     * <p>
     * Register a global metaparameter with the asset registry.
     * [@note]
     * This function is synchronous and thread-safe.
     * Clients can safely run this function to register multiple global metaparameters from multiple threads, if required.
     *
     * @param metaParameterDefinition The metaparameter object to register.
     * @param error                   The error object in case of an error.
     * @return A PHASEGlobalMetaParameterAsset object.
     */
    @Generated
    @Selector("registerGlobalMetaParameter:error:")
    public native PHASEGlobalMetaParameterAsset registerGlobalMetaParameterError(
            PHASEMetaParameterDefinition metaParameterDefinition,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * registerSoundAssetAtURL:identifier:assetType:channelLayout:normalizationMode:error
     * <p>
     * Register an audio file as a sound asset in the system.
     * [@note]
     * This function is synchronous and thread-safe.
     * Clients can safely run this function to register multiple sound assets from multiple threads, if required.
     *
     * @param url               The URL of the audio file.
     * @param identifier        An identifier that uniquely represents this sound event asset. Nil generates an automatic identifier.
     * @param assetType         The asset type for this sound asset.
     * @param channelLayout     The audio channel layout for this sound asset.
     *                          If a valid channel layout definition is read from the file being registered, this will override it.
     *                          If nil is passed as a value for this property, the file must either be mono or stereo, or already contain a vaild channel layout definition.
     *                          This channel layout must have the same channel count as the audio file being loaded.
     * @param normalizationMode The normalization mode.
     * @param error             The error object in case of an error
     * @return A PHASESoundAsset object
     */
    @Generated
    @Selector("registerSoundAssetAtURL:identifier:assetType:channelLayout:normalizationMode:error:")
    public native PHASESoundAsset registerSoundAssetAtURLIdentifierAssetTypeChannelLayoutNormalizationModeError(
            NSURL url, String identifier, @NInt long assetType, AVAudioChannelLayout channelLayout,
            @NInt long normalizationMode, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * registerSoundAssetWithData:identifier:format:normalizationMode:error
     * <p>
     * Register audio data as a sound asset in the system.
     * [@note]
     * This function is synchronous and thread-safe.
     * Clients can safely run this function to register multiple sound assets from multiple threads, if required.
     *
     * @param data              A buffer containing the audio data to register as a sound asset.
     *                          Audio data must either be a single PCM buffer of interleaved channels or multiple deinterleaved PCM buffers per channel packed back to back.
     * @param identifier        The identifier to assign to this sound asset. Nil generates an automatic identifier.
     * @param format            The AVAudioFormat object that describes the audio data in the buffer.
     * @param normalizationMode The normalization mode.
     * @param error             The error object in case of an error.
     * @return A PHASESoundAsset object.
     */
    @Generated
    @Selector("registerSoundAssetWithData:identifier:format:normalizationMode:error:")
    public native PHASESoundAsset registerSoundAssetWithDataIdentifierFormatNormalizationModeError(NSData data,
            String identifier, AVAudioFormat format, @NInt long normalizationMode,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * registerSoundEventAssetWithRootNode:identifier:error
     * <p>
     * Register a sound event asset with the asset registry.
     * [@note]
     * This function is synchronous and thread-safe.
     * Clients can safely run this function to register multiple sound event assets from multiple threads, if required.
     *
     * @param rootNode   The root node of the sound event asset to register.
     * @param identifier An identifier that uniquely represents this sound event asset. Nil generates an automatic identifier.
     * @param error      The error object in case of an error
     * @return A PHASESoundEventNodeAsset object
     */
    @Generated
    @Selector("registerSoundEventAssetWithRootNode:identifier:error:")
    public native PHASESoundEventNodeAsset registerSoundEventAssetWithRootNodeIdentifierError(
            PHASESoundEventNodeDefinition rootNode, String identifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * unregisterAssetWithIdentifier:completion:
     * <p>
     * Unregister and unload an asset.
     *
     * @param identifier The identifier of the PHASEAsset object to unregister
     * @param handler    An optional completion block that will be called when the asset has been unregistered.
     *                   Once you receive this callback, it's safe to deallocate external resources, if applicable.
     */
    @Generated
    @Selector("unregisterAssetWithIdentifier:completion:")
    public native void unregisterAssetWithIdentifierCompletion(String identifier,
            @ObjCBlock(name = "call_unregisterAssetWithIdentifierCompletion") Block_unregisterAssetWithIdentifierCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unregisterAssetWithIdentifierCompletion {
        @Generated
        void call_unregisterAssetWithIdentifierCompletion(boolean success);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

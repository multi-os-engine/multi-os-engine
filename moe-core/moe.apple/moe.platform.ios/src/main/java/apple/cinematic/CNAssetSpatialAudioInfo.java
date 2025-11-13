package apple.cinematic;

import apple.NSObject;
import apple.avfoundation.AVAsset;
import apple.avfoundation.AVAssetTrack;
import apple.avfoundation.AVAudioMix;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
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
 * CNAssetSpatialAudioInfo
 * 
 * A helper class to inspect recordings made when Spatial Audio setting is turned on. An instance of this class contains
 * the default audio track with Spatial Audio, metadata read from the file that can be applied
 * during to enhance the playback experience. This class also provides tunable parameters to change the intensity & mode
 * of the playback experience.
 * 
 * The goal of this class is to assist users operate on assets in which audio has been captured in multiple formats like
 * Spatial Audio and Stereo to allow more audio customization.
 * Users can audition playback of this asset with an immersive audio rendering effect applied by fetching an AVAudioMix
 * containing the necessary metadata serialized in the file as well as any user supplied changes.
 * Once the results of the audition are satisfactory, clients can create a copy of the asset with the audio effect
 * burned in.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNAssetSpatialAudioInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNAssetSpatialAudioInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNAssetSpatialAudioInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNAssetSpatialAudioInfo allocWithZone(VoidPtr zone);

    /**
     * assetReaderOutputSettingsForContentType
     * 
     * Returns a dictionary of settings and the source track that should be used to fetch LPCM samples from this track
     * with the effect applied
     * 
     * Use the returned NSDictionary with the `defaulSpatialAudioTrack` to initialize an instance of
     * `AVAssetReaderAudioMixOutput`
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("assetReaderOutputSettingsForContentType:")
    @NotNull
    public native NSDictionary<String, ?> assetReaderOutputSettingsForContentType(@NInt long contentType);

    /**
     * assetWriterInputSettingsForContentType
     * 
     * Returns a dictionary of settings that should be used to encode LPCM samples using `AVAssetWriterInput`
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("assetWriterInputSettingsForContentType:")
    @NotNull
    public native NSDictionary<String, ?> assetWriterInputSettingsForContentType(@NInt long contentType);

    /**
     * audioMixWithEffectIntensity:renderingStyle:
     * 
     * returns an instance of `AVAudioMix` encapsulating all spatial audio related data with specified effect intensity
     * and rendering style.
     * 
     * Returns an `AVAudioMix` containing all the necessary state to operate on the asset with Spatial Audio effects
     * enabled
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("audioMixWithEffectIntensity:renderingStyle:")
    @NotNull
    public native AVAudioMix audioMixWithEffectIntensityRenderingStyle(float effectIntensity,
            @NInt long renderingStyle);

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
     * checkIfContainsSpatialAudio:
     * 
     * Check if asset meets all the requirements to operate with Spatial Audio and its accompanying effects
     * 
     * @param asset
     *                          An instance of AVAsset.
     * @param completionHandler
     *                          Completion handler to return the result
     * @return Boolean
     * 
     *         API-Since: 26.0
     */
    @Generated
    @Selector("checkIfContainsSpatialAudio:completionHandler:")
    public static native void checkIfContainsSpatialAudioCompletionHandler(@NotNull AVAsset asset,
            @ObjCBlock(name = "call_checkIfContainsSpatialAudioCompletionHandler") @NotNull Block_checkIfContainsSpatialAudioCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkIfContainsSpatialAudioCompletionHandler {
        @Generated
        void call_checkIfContainsSpatialAudioCompletionHandler(boolean result);
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

    /**
     * [@property] defaultEffectIntensity
     * 
     * default effect intensity value as provided by the system. Supported range is [0.0-1.0]
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultEffectIntensity")
    public native float defaultEffectIntensity();

    /**
     * defaultRenderingStyle
     * 
     * default rendering style as provided by the system
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultRenderingStyle")
    @NInt
    public native long defaultRenderingStyle();

    /**
     * [@property] defaulSpatialAudioTrack
     * 
     * default `AVAssetTrack` containing Spatial Audio
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultSpatialAudioTrack")
    @NotNull
    public native AVAssetTrack defaultSpatialAudioTrack();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNAssetSpatialAudioInfo init();

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

    /**
     * [@property] isSupported
     * 
     * Indicates whether the current device supports Audio Mix.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * loadFromAsset:
     * 
     * Returns an instance of CNAssetAudioInfo for an AVAsset object asynchronously.
     * 
     * @param asset
     *                          An instance of AVAsset
     * @param completionHandler
     *                          Completion handler to return the result
     * @return An instance of CNAssetSpatialAudioInfo delivered via the completion handler or an error on failure
     * 
     *         API-Since: 26.0
     */
    @Generated
    @Selector("loadFromAsset:completionHandler:")
    public static native void loadFromAssetCompletionHandler(@NotNull AVAsset asset,
            @ObjCBlock(name = "call_loadFromAssetCompletionHandler") @NotNull Block_loadFromAssetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromAssetCompletionHandler {
        @Generated
        void call_loadFromAssetCompletionHandler(@Nullable CNAssetSpatialAudioInfo assetInfo, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CNAssetSpatialAudioInfo new_objc();

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
     * spatialAudioMixMetadata
     * 
     * The result of audio analysis during recording which contains metadata necessary to properly configure the Audio
     * Mix feature during playback or editing..
     * Can be used with `AUAudioUnit` instances that support AudioUnitPropertyID `kProperty_SpatialAudioMixMetadata`
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("spatialAudioMixMetadata")
    @NotNull
    public native NSData spatialAudioMixMetadata();

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
package apple.phase;

import apple.NSObject;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] PHASESamplerNodeDefinition
 * 
 * Sampler node definition.
 * 
 * Sampler nodes play back registered sound assets.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASESamplerNodeDefinition extends PHASEGeneratorNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASESamplerNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASESamplerNodeDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASESamplerNodeDefinition allocWithZone(VoidPtr zone);

    /**
     * [@property] assetIdentifier
     * 
     * The identifier that uniquely represents the registered sound asset this sampler will play.
     */
    @NotNull
    @Generated
    @Selector("assetIdentifier")
    public native String assetIdentifier();

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

    /**
     * [@property] cullOption
     * 
     * The cull option for the sampler.
     * 
     * The default value is PHASECullOptionTerminate.
     */
    @Generated
    @Selector("cullOption")
    @NInt
    public native long cullOption();

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
    public native PHASESamplerNodeDefinition init();

    /**
     * initWithSoundAssetIdentifier:mixerDefinition
     * 
     * Create a sampler node definition
     * 
     * @param soundAssetIdentifier
     *                             The identifier of the registered sound asset this sampler will play
     * @param mixerDefinition
     *                             The mixer definition this sampler will be assigned to
     * @return
     *         A new PHASESamplerNodeDefinition object
     */
    @Generated
    @Selector("initWithSoundAssetIdentifier:mixerDefinition:")
    public native PHASESamplerNodeDefinition initWithSoundAssetIdentifierMixerDefinition(
            @NotNull String soundAssetIdentifier, @NotNull PHASEMixerDefinition mixerDefinition);

    /**
     * initWithSoundAssetIdentifier:mixerDefinition:identifier
     * 
     * Create a sampler node definition
     * 
     * @param soundAssetIdentifier
     *                             The identifier of the registered sound asset this sampler will play
     * @param mixerDefinition
     *                             The mixer definition this sampler will be assigned to
     * @param identifier
     *                             An optional custom identifier to give to this object
     * @return
     *         A new PHASESamplerNodeDefinition object
     */
    @Generated
    @Selector("initWithSoundAssetIdentifier:mixerDefinition:identifier:")
    public native PHASESamplerNodeDefinition initWithSoundAssetIdentifierMixerDefinitionIdentifier(
            @NotNull String soundAssetIdentifier, @NotNull PHASEMixerDefinition mixerDefinition,
            @NotNull String identifier);

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
    public static native PHASESamplerNodeDefinition new_objc();

    /**
     * [@property] playbackMode
     * 
     * The playback mode for the sampler.
     * 
     * If the playback mode is set to PHASEPlaybackModeOneShot, you need to make sure the the audio data in the
     * registered sound asset associated with this sampler
     * begins and ends at zero crossings. Otherwise, you'll hear a click when beginning playback and / or ending
     * playback.
     * If the playback mode is set to PHASEPlaybackModeLooping, you need to make sure the audio data in the registered
     * sound asset associated with this sampler
     * loops smoothly from the end sample to the start sample. Please verify this during authoring. Failing to do so
     * will result in audible clicks at loop boundaries.
     * The default value is PHASEPlaybackModeOneShot.
     */
    @Generated
    @Selector("playbackMode")
    @NInt
    public native long playbackMode();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] cullOption
     * 
     * The cull option for the sampler.
     * 
     * The default value is PHASECullOptionTerminate.
     */
    @Generated
    @Selector("setCullOption:")
    public native void setCullOption(@NInt long value);

    /**
     * [@property] playbackMode
     * 
     * The playback mode for the sampler.
     * 
     * If the playback mode is set to PHASEPlaybackModeOneShot, you need to make sure the the audio data in the
     * registered sound asset associated with this sampler
     * begins and ends at zero crossings. Otherwise, you'll hear a click when beginning playback and / or ending
     * playback.
     * If the playback mode is set to PHASEPlaybackModeLooping, you need to make sure the audio data in the registered
     * sound asset associated with this sampler
     * loops smoothly from the end sample to the start sample. Please verify this during authoring. Failing to do so
     * will result in audible clicks at loop boundaries.
     * The default value is PHASEPlaybackModeOneShot.
     */
    @Generated
    @Selector("setPlaybackMode:")
    public native void setPlaybackMode(@NInt long value);

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

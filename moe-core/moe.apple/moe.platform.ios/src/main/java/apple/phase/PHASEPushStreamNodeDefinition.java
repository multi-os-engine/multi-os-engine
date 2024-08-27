package apple.phase;

import apple.NSObject;
import apple.avfaudio.AVAudioFormat;
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
 * [@interface] PHASEPushStreamNodeDefinition
 * 
 * An object for defining a push stream sound event node when building a sound event.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEPushStreamNodeDefinition extends PHASEGeneratorNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEPushStreamNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEPushStreamNodeDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEPushStreamNodeDefinition allocWithZone(VoidPtr zone);

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
     * The readonly property that returns the AVAudioFormat that this stream was initialized with
     */
    @NotNull
    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEPushStreamNodeDefinition init();

    /**
     * initWithMixerDefinition:format
     * 
     * Create a push stream node definition
     * 
     * @param mixerDefinition
     *                        The mixer definition this stream will be assigned to
     * @param format
     *                        The AVAudioFormat object that will define the attributes of the audio this node will
     *                        accept.
     * @return
     *         A new PHASEPushStreamNodeDefinition object
     */
    @Generated
    @Selector("initWithMixerDefinition:format:")
    public native PHASEPushStreamNodeDefinition initWithMixerDefinitionFormat(
            @NotNull PHASEMixerDefinition mixerDefinition, @NotNull AVAudioFormat format);

    /**
     * initWithMixerDefinition:format:identifier
     * 
     * Create a push stream node definition
     * 
     * @param mixerDefinition
     *                        The mixer definition this stream will be assigned to
     * @param format
     *                        The AVAudioFormat object that will define the attributes of the audio this node will
     *                        accept.
     * @param identifier
     *                        An optional custom identifier to give to this object
     * @return
     *         A new PHASEPushStreamNodeDefinition object
     */
    @Generated
    @Selector("initWithMixerDefinition:format:identifier:")
    public native PHASEPushStreamNodeDefinition initWithMixerDefinitionFormatIdentifier(
            @NotNull PHASEMixerDefinition mixerDefinition, @NotNull AVAudioFormat format, @NotNull String identifier);

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
    public static native PHASEPushStreamNodeDefinition new_objc();

    /**
     * [@property] normalize
     * 
     * Determines whether or not the engine should normalize the stream. The default value is NO.
     * 
     * In general, client's are advised to normalize the input. Normalization is required to properly calibrate the
     * output level.
     * If you set this value to NO, it's advised that you do custom normalization of the audio data prior to passing the
     * buffers to PHASE.
     */
    @Generated
    @Selector("normalize")
    public native boolean normalize();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] normalize
     * 
     * Determines whether or not the engine should normalize the stream. The default value is NO.
     * 
     * In general, client's are advised to normalize the input. Normalization is required to properly calibrate the
     * output level.
     * If you set this value to NO, it's advised that you do custom normalization of the audio data prior to passing the
     * buffers to PHASE.
     */
    @Generated
    @Selector("setNormalize:")
    public native void setNormalize(boolean value);

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

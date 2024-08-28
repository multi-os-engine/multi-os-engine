package apple.phase;

import apple.NSObject;
import apple.avfaudio.AVAudioChannelLayout;
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
 * [@interface] PHASEChannelMixerDefinition
 * 
 * Channel mixer definition.
 * 
 * Channel mixers render audio without spatialization or environmental effects.
 * Use channel mixers for regular stem-based content that needs be rendered directly to the output device, such as
 * stereo music
 * or center channel narrative dialogue.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEChannelMixerDefinition extends PHASEMixerDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEChannelMixerDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEChannelMixerDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEChannelMixerDefinition allocWithZone(VoidPtr zone);

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
    public native PHASEChannelMixerDefinition init();

    /**
     * initWithChannelLayout
     * 
     * Create a new PHASEChannelMixerDefinition
     * [@note]
     * Any connected sampler must match this channel layout.
     * 
     * @param layout
     *               The input channel layout. Any connected sampler must match this channel layout.
     * @return
     *         A new PHASEChannelMixerDefinition object
     */
    @Generated
    @Selector("initWithChannelLayout:")
    public native PHASEChannelMixerDefinition initWithChannelLayout(@NotNull AVAudioChannelLayout layout);

    /**
     * initWithChannelLayout:identifier
     * 
     * Create a new PHASEChannelMixerDefinition
     * [@note]
     * Any connected sampler must match this channel layout.
     * 
     * @param layout
     *                   The input channel layout.
     * @param identifier
     *                   An optional custom identifier to give to this object
     * @return
     *         A new PHASEChannelMixerDefinition object
     */
    @Generated
    @Selector("initWithChannelLayout:identifier:")
    public native PHASEChannelMixerDefinition initWithChannelLayoutIdentifier(@NotNull AVAudioChannelLayout layout,
            @NotNull String identifier);

    /**
     * [@property] inputChannelLayout
     * 
     * A readonly value of the input channel layout this mixer was initialized with.
     */
    @NotNull
    @Generated
    @Selector("inputChannelLayout")
    public native AVAudioChannelLayout inputChannelLayout();

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
    public static native PHASEChannelMixerDefinition new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

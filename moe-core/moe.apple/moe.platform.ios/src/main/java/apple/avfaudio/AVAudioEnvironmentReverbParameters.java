package apple.avfaudio;

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
 * AVAudioEnvironmentReverbParameters
 * 
 * Parameters used to control the reverb in AVAudioEnvironmentNode
 * 
 * Reverberation can be used to simulate the acoustic characteristics of an environment.
 * AVAudioEnvironmentNode has a built in reverb that describes the space that the listener
 * is in.
 * 
 * The reverb also has a single filter that sits at the end of the chain. This filter is useful
 * to shape the overall sound of the reverb. For instance, one of the reverb presets can be
 * selected to simulate the general space and then the filter can be used to brighten or darken
 * the overall sound.
 * 
 * A standalone instance of AVAudioEnvironmentReverbParameters cannot be created.
 * Only an instance vended out by a source object (e.g. AVAudioEnvironmentNode) can be used.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEnvironmentReverbParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEnvironmentReverbParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEnvironmentReverbParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioEnvironmentReverbParameters allocWithZone(VoidPtr zone);

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
     * [@property] enable
     * 
     * Turns on/off the reverb
     * 
     * Default: NO
     */
    @Generated
    @Selector("enable")
    public native boolean enable();

    /**
     * [@property] filterParameters
     * 
     * filter that applies to the output of the reverb
     */
    @NotNull
    @Generated
    @Selector("filterParameters")
    public native AVAudioUnitEQFilterParameters filterParameters();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioEnvironmentReverbParameters init();

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
     * [@property] level
     * 
     * Controls the master level of the reverb
     * 
     * Range: -40 to 40 dB
     * Default: 0.0
     */
    @Generated
    @Selector("level")
    public native float level();

    /**
     * loadFactoryReverbPreset:
     * 
     * Load one of the reverb's factory presets
     * 
     * Loading a factory reverb preset changes the sound of the reverb. This works independently
     * of the filter which follows the reverb in the signal chain.
     * 
     * @param preset
     *               Reverb preset to be set.
     */
    @Generated
    @Selector("loadFactoryReverbPreset:")
    public native void loadFactoryReverbPreset(@NInt long preset);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioEnvironmentReverbParameters new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] enable
     * 
     * Turns on/off the reverb
     * 
     * Default: NO
     */
    @Generated
    @Selector("setEnable:")
    public native void setEnable(boolean value);

    /**
     * [@property] level
     * 
     * Controls the master level of the reverb
     * 
     * Range: -40 to 40 dB
     * Default: 0.0
     */
    @Generated
    @Selector("setLevel:")
    public native void setLevel(float value);

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

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
 * AVAudioEnvironmentDistanceAttenuationParameters
 * 
 * Parameters specifying the amount of distance attenuation
 * 
 * A standalone instance of AVAudioEnvironmentDistanceAttenuationParameters cannot be created.
 * Only an instance vended out by a source object (e.g. AVAudioEnvironmentNode) can be used.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEnvironmentDistanceAttenuationParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEnvironmentDistanceAttenuationParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEnvironmentDistanceAttenuationParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioEnvironmentDistanceAttenuationParameters allocWithZone(VoidPtr zone);

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
     * [@property] distanceAttenuationModel
     * 
     * Type of distance attenuation model
     * 
     * Default: AVAudioEnvironmentDistanceAttenuationModelInverse
     */
    @Generated
    @Selector("distanceAttenuationModel")
    @NInt
    public native long distanceAttenuationModel();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioEnvironmentDistanceAttenuationParameters init();

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
     * [@property] maximumDistance
     * 
     * The distance beyond which no further attenuation is applied
     * 
     * Default: 100000.0 meters
     * Models: AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("maximumDistance")
    public native float maximumDistance();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioEnvironmentDistanceAttenuationParameters new_objc();

    /**
     * [@property] referenceDistance
     * 
     * The minimum distance at which attenuation is applied
     * 
     * Default: 1.0 meter
     * Models: AVAudioEnvironmentDistanceAttenuationModelInverse,
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("referenceDistance")
    public native float referenceDistance();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] rolloffFactor
     * 
     * Determines the attenuation curve
     * 
     * A higher value results in a steeper attenuation curve.
     * The rolloff factor should be a value greater than 0.
     * Default: 1.0
     * Models: AVAudioEnvironmentDistanceAttenuationModelExponential
     * AVAudioEnvironmentDistanceAttenuationModelInverse
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("rolloffFactor")
    public native float rolloffFactor();

    /**
     * [@property] distanceAttenuationModel
     * 
     * Type of distance attenuation model
     * 
     * Default: AVAudioEnvironmentDistanceAttenuationModelInverse
     */
    @Generated
    @Selector("setDistanceAttenuationModel:")
    public native void setDistanceAttenuationModel(@NInt long value);

    /**
     * [@property] maximumDistance
     * 
     * The distance beyond which no further attenuation is applied
     * 
     * Default: 100000.0 meters
     * Models: AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("setMaximumDistance:")
    public native void setMaximumDistance(float value);

    /**
     * [@property] referenceDistance
     * 
     * The minimum distance at which attenuation is applied
     * 
     * Default: 1.0 meter
     * Models: AVAudioEnvironmentDistanceAttenuationModelInverse,
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("setReferenceDistance:")
    public native void setReferenceDistance(float value);

    /**
     * [@property] rolloffFactor
     * 
     * Determines the attenuation curve
     * 
     * A higher value results in a steeper attenuation curve.
     * The rolloff factor should be a value greater than 0.
     * Default: 1.0
     * Models: AVAudioEnvironmentDistanceAttenuationModelExponential
     * AVAudioEnvironmentDistanceAttenuationModelInverse
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("setRolloffFactor:")
    public native void setRolloffFactor(float value);

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

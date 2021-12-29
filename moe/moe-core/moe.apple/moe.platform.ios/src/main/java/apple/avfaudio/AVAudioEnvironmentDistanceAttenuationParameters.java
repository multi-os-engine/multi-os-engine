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

/**
 * AVAudioEnvironmentDistanceAttenuationParameters
 * <p>
 * Parameters specifying the amount of distance attenuation
 * <p>
 * A standalone instance of AVAudioEnvironmentDistanceAttenuationParameters cannot be created.
 * Only an instance vended out by a source object (e.g. AVAudioEnvironmentNode) can be used.
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
     * [@property] distanceAttenuationModel
     * <p>
     * Type of distance attenuation model
     * <p>
     * Default:    AVAudioEnvironmentDistanceAttenuationModelInverse
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] maximumDistance
     * <p>
     * The distance beyond which no further attenuation is applied
     * <p>
     * Default:    100000.0 meters
     * Models:     AVAudioEnvironmentDistanceAttenuationModelLinear
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
     * <p>
     * The minimum distance at which attenuation is applied
     * <p>
     * Default:    1.0 meter
     * Models:     AVAudioEnvironmentDistanceAttenuationModelInverse,
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
     * <p>
     * Determines the attenuation curve
     * <p>
     * A higher value results in a steeper attenuation curve.
     * The rolloff factor should be a value greater than 0.
     * Default:    1.0
     * Models:     AVAudioEnvironmentDistanceAttenuationModelExponential
     * AVAudioEnvironmentDistanceAttenuationModelInverse
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("rolloffFactor")
    public native float rolloffFactor();

    /**
     * [@property] distanceAttenuationModel
     * <p>
     * Type of distance attenuation model
     * <p>
     * Default:    AVAudioEnvironmentDistanceAttenuationModelInverse
     */
    @Generated
    @Selector("setDistanceAttenuationModel:")
    public native void setDistanceAttenuationModel(@NInt long value);

    /**
     * [@property] maximumDistance
     * <p>
     * The distance beyond which no further attenuation is applied
     * <p>
     * Default:    100000.0 meters
     * Models:     AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("setMaximumDistance:")
    public native void setMaximumDistance(float value);

    /**
     * [@property] referenceDistance
     * <p>
     * The minimum distance at which attenuation is applied
     * <p>
     * Default:    1.0 meter
     * Models:     AVAudioEnvironmentDistanceAttenuationModelInverse,
     * AVAudioEnvironmentDistanceAttenuationModelLinear
     */
    @Generated
    @Selector("setReferenceDistance:")
    public native void setReferenceDistance(float value);

    /**
     * [@property] rolloffFactor
     * <p>
     * Determines the attenuation curve
     * <p>
     * A higher value results in a steeper attenuation curve.
     * The rolloff factor should be a value greater than 0.
     * Default:    1.0
     * Models:     AVAudioEnvironmentDistanceAttenuationModelExponential
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
}

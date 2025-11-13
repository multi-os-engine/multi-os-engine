package apple.sensorkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 26.0
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRAcousticSettings extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SRAcousticSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] accessibilitySettings
     * 
     * Accessibility Settings
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("accessibilitySettings")
    @NotNull
    public native SRAcousticSettingsAccessibility accessibilitySettings();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRAcousticSettings alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SRAcousticSettings allocWithZone(VoidPtr zone);

    /**
     * [@property] audioExposureSampleLifetime
     * 
     * Expected lifetime of headphone audio exposure samples in HealthKit
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("audioExposureSampleLifetime")
    @NInt
    public native long audioExposureSampleLifetime();

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] headphoneSafetyAudioLevel
     * 
     * Reduce Loud Audio
     * 
     * iPhone can analyze headphone audio and reduce any sound that is over a set decibel level. A nil value
     * means the setting is disabled. If the setting is enabled, the property will hold the decibel value
     * that headphone audio sound volume is not to exceed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("headphoneSafetyAudioLevel")
    @Nullable
    public native NSNumber headphoneSafetyAudioLevel();

    @Generated
    @Selector("init")
    public native SRAcousticSettings init();

    @Generated
    @Selector("initWithCoder:")
    public native SRAcousticSettings initWithCoder(@NotNull NSCoder coder);

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

    /**
     * [@property] environmentalSoundMeasurementsEnabled
     * 
     * Environmental Sound Measurements
     * 
     * Setting for Apple Watch Environmental Sound Measurements.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isEnvironmentalSoundMeasurementsEnabled")
    public native boolean isEnvironmentalSoundMeasurementsEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] musicEQSettings
     * 
     * Music EQ Settings
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("musicEQSettings")
    @NotNull
    public native SRAcousticSettingsMusicEQ musicEQSettings();

    @Generated
    @Owned
    @Selector("new")
    public static native SRAcousticSettings new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
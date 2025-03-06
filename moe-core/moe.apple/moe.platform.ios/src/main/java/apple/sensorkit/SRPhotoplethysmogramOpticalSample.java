package apple.sensorkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUnitFrequency;
import apple.foundation.NSUnitLength;
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
 * API-Since: 17.4
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRPhotoplethysmogramOpticalSample extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SRPhotoplethysmogramOpticalSample(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] activePhotodiodeIndexes
     * 
     * The set of photodiodes in use during the sample reading
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("activePhotodiodeIndexes")
    @NotNull
    public native NSIndexSet activePhotodiodeIndexes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRPhotoplethysmogramOpticalSample alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SRPhotoplethysmogramOpticalSample allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] backgroundNoise
     * 
     * Estimated ambient noise intrusion
     * 
     * This may be \c nil when the sensor data reading is invalid
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("backgroundNoise")
    @Nullable
    public native NSNumber backgroundNoise();

    /**
     * [@property] backgroundNoiseOffset
     * 
     * Estimated electronics noise floor level of the sensor
     * 
     * To estimate the total ambient noise, subtract scaled background noise offset
     * from the background noise. The scaling factor can be computed based on
     * the researcher's digital filter setup.
     * This may be \c nil when the sensor data reading is invalid
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("backgroundNoiseOffset")
    @Nullable
    public native NSNumber backgroundNoiseOffset();

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

    /**
     * [@property] conditions
     * 
     * Flags indicating sensor context or conditions that may effect
     * the sample reading
     * 
     * These flags can provide some indication of data validity or other system conditions
     * that may influence how the recorded data should be treated.
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("conditions")
    @NotNull
    public native NSArray<String> conditions();

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

    /**
     * [@property] effectiveWavelength
     * 
     * a temperature compensated wavelength in nanometers estimate that the emitter is producing
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("effectiveWavelength")
    @NotNull
    public native NSMeasurement<NSUnitLength> effectiveWavelength();

    /**
     * [@property] emitter
     * 
     * The index of the LED in use during the sample reading
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("emitter")
    @NInt
    public native long emitter();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SRPhotoplethysmogramOpticalSample init();

    @Generated
    @Selector("initWithCoder:")
    public native SRPhotoplethysmogramOpticalSample initWithCoder(@NotNull NSCoder coder);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] nanosecondsSinceStart
     * 
     * nanoseconds since the \c SRPhotoplethysmogramSample start date of the
     * specific optical sample
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("nanosecondsSinceStart")
    public native long nanosecondsSinceStart();

    @Generated
    @Owned
    @Selector("new")
    public static native SRPhotoplethysmogramOpticalSample new_objc();

    /**
     * [@property] nominalWavelength
     * 
     * the wavelength in nanometers the emitter was designed to produce while
     * operating at a specific temperature
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("nominalWavelength")
    @NotNull
    public native NSMeasurement<NSUnitLength> nominalWavelength();

    /**
     * [@property] normalizedReflectance
     * 
     * The PPG waveform
     * 
     * This may be \c nil when the sensor data reading is invalid
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("normalizedReflectance")
    @Nullable
    public native NSNumber normalizedReflectance();

    /**
     * [@property] pinkNoise
     * 
     * Pink noise estimation
     * 
     * This may be \c nil when the sensor data reading is invalid
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("pinkNoise")
    @Nullable
    public native NSNumber pinkNoise();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] samplingFrequency
     * 
     * Sampling frequency of PPG data in Hz
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("samplingFrequency")
    @NotNull
    public native NSMeasurement<NSUnitFrequency> samplingFrequency();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] signalIdentifier
     * 
     * identifier to distinguish between different signals produced
     * using the same photodiodes and emitters
     * 
     * To provide the same quality of service certain system conditions may require configuring the
     * PPG sensor behavior differently while using the same photodiodes and emitters. This
     * identifier can be used distinguish between the different signals generated by these
     * different configurations.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("signalIdentifier")
    @NInt
    public native long signalIdentifier();

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

    /**
     * [@property] whiteNoise
     * 
     * White noise estimation
     * 
     * This may be \c nil when the sensor data reading is invalid
     * 
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("whiteNoise")
    @Nullable
    public native NSNumber whiteNoise();
}
package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 13.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKAudiogramSensitivityPoint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKAudiogramSensitivityPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKAudiogramSensitivityPoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKAudiogramSensitivityPoint allocWithZone(VoidPtr zone);

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
     * [@property] frequency Frequency where sensitivity was measured. The unit of measurement
     * is [HKUnit hertzUnit] or "Hz".
     */
    @NotNull
    @Generated
    @Selector("frequency")
    public native HKQuantity frequency();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKAudiogramSensitivityPoint init();

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
     * [@property] sensitivity Left ear sensitivity measured in attenuated dB from a baseline of 0 dB.
     * The unit of measurement is [HKUnit decibelHearingLevelUnit] or "dBHL".
     */
    @Nullable
    @Generated
    @Selector("leftEarSensitivity")
    public native HKQuantity leftEarSensitivity();

    @Generated
    @Owned
    @Selector("new")
    public static native HKAudiogramSensitivityPoint new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sensitivity Right ear sensitivity measured in attenuated dB from a baseline of 0 dB.
     * The unit of measurement is [HKUnit decibelHearingLevelUnit] or "dBHL".
     */
    @Nullable
    @Generated
    @Selector("rightEarSensitivity")
    public native HKQuantity rightEarSensitivity();

    /**
     * sensitivityPointWithFrequency:leftEarSensitivity:rightEarSensitivity:error:
     * 
     * Creates a point that can be included in a audiogram.
     * 
     * @param frequency           Frequency where sensitivity was measured.
     * @param leftEarSensitivity  Left ear sensitivity measured in attenuated dB from a baseline of 0 dB.
     * @param rightEarSensitivity Right ear sensitivity measured in attenuated dB from a baseline of 0 dB.
     * @param error               If there was a problem creating this instance this will contain the error.
     * @return New instance of a sensitivity point or nil if there were problems
     *         creating the instance. Errors may include incorrect quantity units
     *         or data that is out of an expected range.
     */
    @Generated
    @Selector("sensitivityPointWithFrequency:leftEarSensitivity:rightEarSensitivity:error:")
    public static native HKAudiogramSensitivityPoint sensitivityPointWithFrequencyLeftEarSensitivityRightEarSensitivityError(
            @NotNull HKQuantity frequency, @Nullable HKQuantity leftEarSensitivity,
            @Nullable HKQuantity rightEarSensitivity,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

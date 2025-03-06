package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.1
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKAudiogramSensitivityTest extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKAudiogramSensitivityTest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKAudiogramSensitivityTest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKAudiogramSensitivityTest allocWithZone(VoidPtr zone);

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
     * [@property] clampingRange
     * 
     * If present, indicates that the range within which the sensitivity point should be clamped.
     * 
     * API-Since: 18.1
     */
    @Generated
    @Selector("clampingRange")
    @Nullable
    public native HKAudiogramSensitivityPointClampingRange clampingRange();

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

    @Generated
    @Selector("init")
    public native HKAudiogramSensitivityTest init();

    @Generated
    @Selector("initWithCoder:")
    public native HKAudiogramSensitivityTest initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithSensitivity:type:masked:side:clampingRange:error:
     * 
     * Creates a sensitivity test which can be added to a HKAudiogramSensitivityPoint
     * 
     * @param sensitivity   The ear sensitivity measured in dB from a baseline of 0 dB with unit
     *                      `HKUnit.decibelHearingLevelUnit` or "dBHL".
     * @param type          The type of test
     * @param masked        If the test was conducted with or without masking
     * @param side          The test side which was tested
     * @param clampingRange The clamping range (if any)
     * @param errorOut      If there was a problem creating this instance this will contain the error.
     * @return New instance of a Sensitivity Test or nil if there were problems
     *         creating the instance. Errors may include incorrect quantity units or sensitivity out of range
     * 
     *         API-Since: 18.1
     */
    @Generated
    @Selector("initWithSensitivity:type:masked:side:clampingRange:error:")
    public native HKAudiogramSensitivityTest initWithSensitivityTypeMaskedSideClampingRangeError(
            @NotNull HKQuantity sensitivity, @NInt long type, boolean masked, @NInt long side,
            @Nullable HKAudiogramSensitivityPointClampingRange clampingRange,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> errorOut);

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
     * [@property] masked
     * 
     * Indicates if the test was conducted with or without masking
     * 
     * API-Since: 18.1
     */
    @Generated
    @Selector("masked")
    public native boolean masked();

    @Generated
    @Owned
    @Selector("new")
    public static native HKAudiogramSensitivityTest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sensitivity
     * 
     * Ear sensitivity measured in dB from a baseline of 0 dB. Reduced hearing sensitivity corresponds to an increase
     * from 0 dB.
     * The unit of measurement is `HKUnit.decibelHearingLevelUnit` or "dBHL".
     * 
     * API-Since: 18.1
     */
    @Generated
    @Selector("sensitivity")
    @NotNull
    public native HKQuantity sensitivity();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] side
     * 
     * The test side
     * 
     * API-Since: 18.1
     */
    @Generated
    @Selector("side")
    @NInt
    public native long side();

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

    /**
     * [@property] type
     * 
     * The conduction type
     * 
     * API-Since: 18.1
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
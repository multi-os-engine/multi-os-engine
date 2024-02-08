package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.MappedReturn;

/**
 * HKContactsPrescription
 * 
 * An object representing a contacts prescription
 * 
 * API-Since: 16.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKContactsPrescription extends HKVisionPrescription implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKContactsPrescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKContactsPrescription alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKContactsPrescription allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] brand
     * 
     * The prescribed brand after contact lens fitting
     */
    @NotNull
    @Generated
    @Selector("brand")
    public native String brand();

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
    public native HKContactsPrescription init();

    @Generated
    @Selector("initWithCoder:")
    public native HKContactsPrescription initWithCoder(@NotNull NSCoder coder);

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
     * [@property] leftEye
     * 
     * The left eye lens specification
     */
    @Nullable
    @Generated
    @Selector("leftEye")
    public native HKContactsLensSpecification leftEye();

    @Generated
    @Owned
    @Selector("new")
    public static native HKContactsPrescription new_objc();

    /**
     * prescriptionWithRightEyeSpecification:leftEyeSpecification:brand:dateIssued:expirationDate:device:metadata
     * 
     * @param rightEyeSpecification The right eye specification
     * @param leftEyeSpecification  The left eye specification
     * @param brand                 The prescribed brand after contact lens fitting
     * @param dateIssued            The date the prescription was issued
     * @param expirationDate        The date the prescription expires
     * @param device                The device that generated the sample
     * @param metadata              The metadata for the sample
     */
    @Generated
    @Selector("prescriptionWithRightEyeSpecification:leftEyeSpecification:brand:dateIssued:expirationDate:device:metadata:")
    public static native HKContactsPrescription prescriptionWithRightEyeSpecificationLeftEyeSpecificationBrandDateIssuedExpirationDateDeviceMetadata(
            @Nullable HKContactsLensSpecification rightEyeSpecification,
            @Nullable HKContactsLensSpecification leftEyeSpecification, @NotNull String brand,
            @NotNull NSDate dateIssued, @Nullable NSDate expirationDate, @Nullable HKDevice device,
            @Nullable NSDictionary<String, ?> metadata);

    @Generated
    @Selector("prescriptionWithType:dateIssued:expirationDate:device:metadata:")
    public static native HKContactsPrescription prescriptionWithTypeDateIssuedExpirationDateDeviceMetadata(
            @NUInt long type, @NotNull NSDate dateIssued, @Nullable NSDate expirationDate, @Nullable HKDevice device,
            @Nullable NSDictionary<String, ?> metadata);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] rightEye
     * 
     * The right eye lens specification
     */
    @Nullable
    @Generated
    @Selector("rightEye")
    public native HKContactsLensSpecification rightEye();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
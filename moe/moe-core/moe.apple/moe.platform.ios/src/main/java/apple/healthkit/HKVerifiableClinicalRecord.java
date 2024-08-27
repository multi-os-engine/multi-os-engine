package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
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

/**
 * HKVerifiableClinicalRecord
 * 
 * An NSObject that represents a verifiable clinical record.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKVerifiableClinicalRecord extends HKSample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKVerifiableClinicalRecord(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] JWSRepresentation
     * 
     * The record's entirety as JSON Web Signature (JWS) data.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 15.4
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("JWSRepresentation")
    public native NSData JWSRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKVerifiableClinicalRecord alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKVerifiableClinicalRecord allocWithZone(VoidPtr zone);

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
     * [@property] expirationDate
     * 
     * The date this record expires.
     */
    @Nullable
    @Generated
    @Selector("expirationDate")
    public native NSDate expirationDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKVerifiableClinicalRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native HKVerifiableClinicalRecord initWithCoder(@NotNull NSCoder coder);

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

    /**
     * [@property] issuedDate
     * 
     * The date this record was issued.
     */
    @NotNull
    @Generated
    @Selector("issuedDate")
    public native NSDate issuedDate();

    /**
     * [@property] issuerIdentifier
     * 
     * The identifier for the issuer of this record.
     */
    @NotNull
    @Generated
    @Selector("issuerIdentifier")
    public native String issuerIdentifier();

    /**
     * [@property] itemNames
     * 
     * A list of display names for each item contained in this record.
     */
    @NotNull
    @Generated
    @Selector("itemNames")
    public native NSArray<String> itemNames();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKVerifiableClinicalRecord new_objc();

    /**
     * [@property] recordTypes
     * 
     * The types present in this record.
     */
    @NotNull
    @Generated
    @Selector("recordTypes")
    public native NSArray<String> recordTypes();

    /**
     * [@property] relevantDate
     * 
     * A date most relevant to this record, like when a vaccine was
     * administered or a test was performed.
     */
    @NotNull
    @Generated
    @Selector("relevantDate")
    public native NSDate relevantDate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] subject
     * 
     * The subject of this record.
     */
    @NotNull
    @Generated
    @Selector("subject")
    public native HKVerifiableClinicalRecordSubject subject();

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

    /**
     * [@property] dataRepresentation
     * 
     * The record's data representation, determined by source type.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @Selector("dataRepresentation")
    public native NSData dataRepresentation();

    /**
     * [@property] sourceType
     * 
     * The type of the source leading to this verifiable record.
     * 
     * API-Since: 15.4
     */
    @Nullable
    @Generated
    @Selector("sourceType")
    public native String sourceType();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Elements that can be requested from identity documents. Not
 * all elements are supported by all document types. If an element
 * is requested from a type that does not support it, the element
 * is ignored.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKIdentityElement extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKIdentityElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The address on record with the issuer.
     */
    @NotNull
    @Generated
    @Selector("addressElement")
    public static native PKIdentityElement addressElement();

    /**
     * The user's age in years.
     */
    @NotNull
    @Generated
    @Selector("ageElement")
    public static native PKIdentityElement ageElement();

    /**
     * Boolean indicating whether the user's age is at least the given age.
     * For example, ageThresholdElementWithAge:21 will return true if the user is at least 21 years old.
     * This value is only available for a given age if it was provided by the issuer. If this value
     * is not available, it will automatically fall back to a request for age.
     */
    @NotNull
    @Generated
    @Selector("ageThresholdElementWithAge:")
    public static native PKIdentityElement ageThresholdElementWithAge(@NInt long age);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKIdentityElement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKIdentityElement allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The user's date of birth.
     */
    @NotNull
    @Generated
    @Selector("dateOfBirthElement")
    public static native PKIdentityElement dateOfBirthElement();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The document's expiration date. This is usually the expiration date of the corresponding physical
     * document, if applicable.
     */
    @NotNull
    @Generated
    @Selector("documentExpirationDateElement")
    public static native PKIdentityElement documentExpirationDateElement();

    /**
     * The document's issue date. This is usually the issue date of the corresponding physical
     * document, if applicable.
     */
    @NotNull
    @Generated
    @Selector("documentIssueDateElement")
    public static native PKIdentityElement documentIssueDateElement();

    /**
     * The doument's number, as defined by the document's issuing authority.
     */
    @NotNull
    @Generated
    @Selector("documentNumberElement")
    public static native PKIdentityElement documentNumberElement();

    /**
     * The user's driving privileges.
     */
    @NotNull
    @Generated
    @Selector("drivingPrivilegesElement")
    public static native PKIdentityElement drivingPrivilegesElement();

    /**
     * The user's family name or last name.
     */
    @NotNull
    @Generated
    @Selector("familyNameElement")
    public static native PKIdentityElement familyNameElement();

    /**
     * The user's given name or first name.
     */
    @NotNull
    @Generated
    @Selector("givenNameElement")
    public static native PKIdentityElement givenNameElement();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKIdentityElement init();

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
     * The state or government that issued the identity document.
     */
    @NotNull
    @Generated
    @Selector("issuingAuthorityElement")
    public static native PKIdentityElement issuingAuthorityElement();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKIdentityElement new_objc();

    /**
     * The portrait of the user on record with the issuer.
     */
    @NotNull
    @Generated
    @Selector("portraitElement")
    public static native PKIdentityElement portraitElement();

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

    /**
     * The document's DHS (U.S. Department of Homeland Security) compliance status.
     * 
     * This is also known as the document's "REAL ID status".
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("documentDHSComplianceStatusElement")
    @NotNull
    public static native PKIdentityElement documentDHSComplianceStatusElement();

    /**
     * The user's sex.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("sexElement")
    @NotNull
    public static native PKIdentityElement sexElement();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
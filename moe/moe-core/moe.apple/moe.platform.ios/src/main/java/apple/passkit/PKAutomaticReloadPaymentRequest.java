package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * Represents a request to set up an automatic reload or refill payment, such as a store card top-up.
 * This request will receive a merchant-specific payment token, if the payment network supports
 * merchant-specific payment tokens.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKAutomaticReloadPaymentRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKAutomaticReloadPaymentRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKAutomaticReloadPaymentRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKAutomaticReloadPaymentRequest allocWithZone(VoidPtr zone);

    /**
     * Details about the automatic reload payment, for example "top-up with $20 when account reaches $5".
     */
    @NotNull
    @Generated
    @Selector("automaticReloadBilling")
    public native PKAutomaticReloadPaymentSummaryItem automaticReloadBilling();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
     * This may include further details about the threshold amount or reload conditions.
     */
    @Nullable
    @Generated
    @Selector("billingAgreement")
    public native String billingAgreement();

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
    public native PKAutomaticReloadPaymentRequest init();

    @Generated
    @Selector("initWithPaymentDescription:automaticReloadBilling:managementURL:")
    public native PKAutomaticReloadPaymentRequest initWithPaymentDescriptionAutomaticReloadBillingManagementURL(
            @NotNull String paymentDescription, @NotNull PKAutomaticReloadPaymentSummaryItem automaticReloadBilling,
            @NotNull NSURL managementURL);

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
     * A URL that links to a page on your web site where the user can manage the payment method for this
     * automatic reload payment, including deleting it.
     */
    @NotNull
    @Generated
    @Selector("managementURL")
    public native NSURL managementURL();

    @Generated
    @Owned
    @Selector("new")
    public static native PKAutomaticReloadPaymentRequest new_objc();

    /**
     * A description of the automatic reload, for example "Gift Card Reload".
     */
    @NotNull
    @Generated
    @Selector("paymentDescription")
    public native String paymentDescription();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Details about the automatic reload payment, for example "top-up with $20 when account reaches $5".
     */
    @Generated
    @Selector("setAutomaticReloadBilling:")
    public native void setAutomaticReloadBilling(@NotNull PKAutomaticReloadPaymentSummaryItem value);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
     * This may include further details about the threshold amount or reload conditions.
     */
    @Generated
    @Selector("setBillingAgreement:")
    public native void setBillingAgreement(@Nullable String value);

    /**
     * A URL that links to a page on your web site where the user can manage the payment method for this
     * automatic reload payment, including deleting it.
     */
    @Generated
    @Selector("setManagementURL:")
    public native void setManagementURL(@NotNull NSURL value);

    /**
     * A description of the automatic reload, for example "Gift Card Reload".
     */
    @Generated
    @Selector("setPaymentDescription:")
    public native void setPaymentDescription(@NotNull String value);

    /**
     * Optional URL to receive lifecycle notifications for the merchant-specific payment token issued
     * for this request, if applicable. If this property is not set, notifications will not be sent when
     * lifecycle changes occur for the token, for example when the token is deleted.
     */
    @Generated
    @Selector("setTokenNotificationURL:")
    public native void setTokenNotificationURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Optional URL to receive lifecycle notifications for the merchant-specific payment token issued
     * for this request, if applicable. If this property is not set, notifications will not be sent when
     * lifecycle changes occur for the token, for example when the token is deleted.
     */
    @Nullable
    @Generated
    @Selector("tokenNotificationURL")
    public native NSURL tokenNotificationURL();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
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
 * Represents a request to set up a recurring payment, typically a subscription. This request will
 * receive a merchant-specific payment token, if the payment network supports merchant-specific
 * payment tokens.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKRecurringPaymentRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKRecurringPaymentRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKRecurringPaymentRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKRecurringPaymentRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
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
    public native PKRecurringPaymentRequest init();

    @Generated
    @Selector("initWithPaymentDescription:regularBilling:managementURL:")
    public native PKRecurringPaymentRequest initWithPaymentDescriptionRegularBillingManagementURL(
            @NotNull String paymentDescription, @NotNull PKRecurringPaymentSummaryItem regularBilling,
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
     * recurring payment, including deleting it.
     */
    @NotNull
    @Generated
    @Selector("managementURL")
    public native NSURL managementURL();

    @Generated
    @Owned
    @Selector("new")
    public static native PKRecurringPaymentRequest new_objc();

    /**
     * A description of the recurring payment, for example "Apple News+".
     */
    @NotNull
    @Generated
    @Selector("paymentDescription")
    public native String paymentDescription();

    /**
     * The regular billing cycle, for example "$9.99 monthly".
     */
    @NotNull
    @Generated
    @Selector("regularBilling")
    public native PKRecurringPaymentSummaryItem regularBilling();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
     */
    @Generated
    @Selector("setBillingAgreement:")
    public native void setBillingAgreement(@Nullable String value);

    /**
     * A URL that links to a page on your web site where the user can manage the payment method for this
     * recurring payment, including deleting it.
     */
    @Generated
    @Selector("setManagementURL:")
    public native void setManagementURL(@NotNull NSURL value);

    /**
     * A description of the recurring payment, for example "Apple News+".
     */
    @Generated
    @Selector("setPaymentDescription:")
    public native void setPaymentDescription(@NotNull String value);

    /**
     * The regular billing cycle, for example "$9.99 monthly".
     */
    @Generated
    @Selector("setRegularBilling:")
    public native void setRegularBilling(@NotNull PKRecurringPaymentSummaryItem value);

    /**
     * Optional URL to receive lifecycle notifications for the merchant-specific payment token issued
     * for this request, if applicable. If this property is not set, notifications will not be sent when
     * lifecycle changes occur for the token, for example when the token is deleted.
     */
    @Generated
    @Selector("setTokenNotificationURL:")
    public native void setTokenNotificationURL(@Nullable NSURL value);

    /**
     * Optional, trial billing cycle, for example "$1.99 for the first six months".
     */
    @Generated
    @Selector("setTrialBilling:")
    public native void setTrialBilling(@Nullable PKRecurringPaymentSummaryItem value);

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

    /**
     * Optional, trial billing cycle, for example "$1.99 for the first six months".
     */
    @Nullable
    @Generated
    @Selector("trialBilling")
    public native PKRecurringPaymentSummaryItem trialBilling();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
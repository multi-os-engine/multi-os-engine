package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * Represents a request to set up a deferred payment, such as a hotel booking or a pre-order.
 * This request will receive a merchant-specific payment token, if the
 * payment network supports merchant-specific payment tokens.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKDeferredPaymentRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKDeferredPaymentRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKDeferredPaymentRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKDeferredPaymentRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
     * This may include further details about the cancellation period or penalties for late cancellation.
     */
    @Generated
    @Selector("billingAgreement")
    @Nullable
    public native String billingAgreement();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Details about the deferred payment, for example "Pay $2.99 on January 9, 2022".
     */
    @Generated
    @Selector("deferredBilling")
    @NotNull
    public native PKDeferredPaymentSummaryItem deferredBilling();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Optional, the last date before which cancellation charges don't apply. If `freeCancellationDate` is set,
     * `freeCancellationDateTimeZone` must be set as well.
     */
    @Generated
    @Selector("freeCancellationDate")
    @Nullable
    public native NSDate freeCancellationDate();

    /**
     * Optional, the timezone of the "destination" of the payment. As an example, for a hotel booking, this refers to
     * the local timezone of the hotel. On the payment sheet, this timezone will be used to format the cancellation
     * date. If `freeCancellationDateTimeZone` date is set, `freeCancellationDate` must be set as well
     */
    @Generated
    @Selector("freeCancellationDateTimeZone")
    @Nullable
    public native NSTimeZone freeCancellationDateTimeZone();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKDeferredPaymentRequest init();

    @Generated
    @Selector("initWithPaymentDescription:deferredBilling:managementURL:")
    public native PKDeferredPaymentRequest initWithPaymentDescriptionDeferredBillingManagementURL(
            @NotNull String paymentDescription, @NotNull PKDeferredPaymentSummaryItem deferredBilling,
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * A URL that links to a page on your web site where the user can manage the payment method for this
     * deferred payment, including deleting it.
     */
    @Generated
    @Selector("managementURL")
    @NotNull
    public native NSURL managementURL();

    @Generated
    @Owned
    @Selector("new")
    public static native PKDeferredPaymentRequest new_objc();

    /**
     * A description of the deferred payment, for example "Hotel Stay, 2 nights".
     */
    @Generated
    @Selector("paymentDescription")
    @NotNull
    public native String paymentDescription();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Optional, localized billing agreement to be displayed to the user prior to payment authorization.
     * This may include further details about the cancellation period or penalties for late cancellation.
     */
    @Generated
    @Selector("setBillingAgreement:")
    public native void setBillingAgreement(@Nullable String value);

    /**
     * Details about the deferred payment, for example "Pay $2.99 on January 9, 2022".
     */
    @Generated
    @Selector("setDeferredBilling:")
    public native void setDeferredBilling(@NotNull PKDeferredPaymentSummaryItem value);

    /**
     * Optional, the last date before which cancellation charges don't apply. If `freeCancellationDate` is set,
     * `freeCancellationDateTimeZone` must be set as well.
     */
    @Generated
    @Selector("setFreeCancellationDate:")
    public native void setFreeCancellationDate(@Nullable NSDate value);

    /**
     * Optional, the timezone of the "destination" of the payment. As an example, for a hotel booking, this refers to
     * the local timezone of the hotel. On the payment sheet, this timezone will be used to format the cancellation
     * date. If `freeCancellationDateTimeZone` date is set, `freeCancellationDate` must be set as well
     */
    @Generated
    @Selector("setFreeCancellationDateTimeZone:")
    public native void setFreeCancellationDateTimeZone(@Nullable NSTimeZone value);

    /**
     * A URL that links to a page on your web site where the user can manage the payment method for this
     * deferred payment, including deleting it.
     */
    @Generated
    @Selector("setManagementURL:")
    public native void setManagementURL(@NotNull NSURL value);

    /**
     * A description of the deferred payment, for example "Hotel Stay, 2 nights".
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
    @Generated
    @Selector("tokenNotificationURL")
    @Nullable
    public native NSURL tokenNotificationURL();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
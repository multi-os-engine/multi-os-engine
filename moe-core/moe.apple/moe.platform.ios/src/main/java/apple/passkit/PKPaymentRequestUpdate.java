package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPaymentRequestUpdate extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentRequestUpdate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentRequestUpdate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPaymentRequestUpdate allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKPaymentRequestUpdate init();

    @Generated
    @Selector("initWithPaymentSummaryItems:")
    public native PKPaymentRequestUpdate initWithPaymentSummaryItems(
            @NotNull NSArray<? extends PKPaymentSummaryItem> paymentSummaryItems);

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

    @Generated
    @Owned
    @Selector("new")
    public static native PKPaymentRequestUpdate new_objc();

    /**
     * The new payment summary items to update the payment request with
     */
    @NotNull
    @Generated
    @Selector("paymentSummaryItems")
    public native NSArray<? extends PKPaymentSummaryItem> paymentSummaryItems();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The new payment summary items to update the payment request with
     */
    @Generated
    @Selector("setPaymentSummaryItems:")
    public native void setPaymentSummaryItems(@NotNull NSArray<? extends PKPaymentSummaryItem> value);

    /**
     * The status of the payment request update. Set PKPaymentAuthorizationStatusSuccess for a successful update,
     * and PKPaymentAuthorizationStatusFailure if you were unable to process the required changes.
     * PKPaymentAuthorizationStatusSuccess by default
     */
    @Generated
    @Selector("setStatus:")
    public native void setStatus(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The status of the payment request update. Set PKPaymentAuthorizationStatusSuccess for a successful update,
     * and PKPaymentAuthorizationStatusFailure if you were unable to process the required changes.
     * PKPaymentAuthorizationStatusSuccess by default
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The new shipping methods to update the payment request with. An empty array, the default value,
     * indicates that the shipping methods don't need updating.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setShippingMethods:")
    public native void setShippingMethods(@NotNull NSArray<? extends PKShippingMethod> value);

    /**
     * The new shipping methods to update the payment request with. An empty array, the default value,
     * indicates that the shipping methods don't need updating.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("shippingMethods")
    public native NSArray<? extends PKShippingMethod> shippingMethods();

    /**
     * The new automatic reload payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreement cannot be changed.
     * 
     * This property cannot be used simultaneously with multi token contexts or recurring payment requests.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("automaticReloadPaymentRequest")
    public native PKAutomaticReloadPaymentRequest automaticReloadPaymentRequest();

    /**
     * The new array of payment token contexts to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * This property cannot be used simultaneously with recurring or automatic reload payment requests.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("multiTokenContexts")
    public native NSArray<? extends PKPaymentTokenContext> multiTokenContexts();

    /**
     * The new recurring payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreement cannot be changed.
     * 
     * This property cannot be used simultaneously with multi token contexts or automatic reload payment requests.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("recurringPaymentRequest")
    public native PKRecurringPaymentRequest recurringPaymentRequest();

    /**
     * The new automatic reload payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreement cannot be changed.
     * 
     * This property cannot be used simultaneously with multi token contexts or recurring payment requests.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAutomaticReloadPaymentRequest:")
    public native void setAutomaticReloadPaymentRequest(@Nullable PKAutomaticReloadPaymentRequest value);

    /**
     * The new array of payment token contexts to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * This property cannot be used simultaneously with recurring or automatic reload payment requests.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMultiTokenContexts:")
    public native void setMultiTokenContexts(@Nullable NSArray<? extends PKPaymentTokenContext> value);

    /**
     * The new recurring payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreement cannot be changed.
     * 
     * This property cannot be used simultaneously with multi token contexts or automatic reload payment requests.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRecurringPaymentRequest:")
    public native void setRecurringPaymentRequest(@Nullable PKRecurringPaymentRequest value);

    /**
     * The new deferred payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreeement cannot be changed.
     * 
     * This property cannot be used simultaneously with: multi token contexts, recurring payment requests or automatic
     * reload payment requests.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deferredPaymentRequest")
    @Nullable
    public native PKDeferredPaymentRequest deferredPaymentRequest();

    /**
     * The new deferred payment request to update the payment request with.
     * The default value is `nil`, which indicates no update is needed.
     * 
     * The billing agreeement cannot be changed.
     * 
     * This property cannot be used simultaneously with: multi token contexts, recurring payment requests or automatic
     * reload payment requests.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setDeferredPaymentRequest:")
    public native void setDeferredPaymentRequest(@Nullable PKDeferredPaymentRequest value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

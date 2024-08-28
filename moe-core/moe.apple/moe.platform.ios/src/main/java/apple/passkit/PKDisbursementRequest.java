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
import apple.foundation.NSData;
import apple.foundation.NSError;

/**
 * API-Since: 17.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKDisbursementRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKDisbursementRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKDisbursementRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKDisbursementRequest allocWithZone(VoidPtr zone);

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

    /**
     * Currency code for this disbursement.
     */
    @NotNull
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

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
    public native PKDisbursementRequest init();

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
    public static native PKDisbursementRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Currency code for this disbursement.
     */
    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(@NotNull String value);

    /**
     * Array of PKPaymentSummaryItem objects which should be presented to the user.
     * The last item should be the total you wish to disburse, and should not be pending.
     */
    @Generated
    @Selector("setSummaryItems:")
    public native void setSummaryItems(@NotNull NSArray<? extends PKPaymentSummaryItem> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Array of PKPaymentSummaryItem objects which should be presented to the user.
     * The last item should be the total you wish to disburse, and should not be pending.
     */
    @NotNull
    @Generated
    @Selector("summaryItems")
    public native NSArray<? extends PKPaymentSummaryItem> summaryItems();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Optional merchant-supplied information about the disbursement request.
     * It will be signed and included in the resulting PKPaymentToken.
     */
    @Generated
    @Selector("applicationData")
    @Nullable
    public native NSData applicationData();

    /**
     * Convenience method to create an error indicating that the selected card does not support receiving
     * funds via disbursements.
     */
    @Generated
    @Selector("disbursementCardUnsupportedError")
    @NotNull
    public static native NSError disbursementCardUnsupportedError();

    /**
     * Convenience method to create a receipient contact error with the supplied field
     * You may optionally provide a localized description to be displayed to the user.
     * Available display space for descriptions may be limited, so you should keep your messages concise
     */
    @Generated
    @Selector("disbursementContactInvalidErrorWithContactField:localizedDescription:")
    @NotNull
    public static native NSError disbursementContactInvalidErrorWithContactFieldLocalizedDescription(
            @NotNull String field, @Nullable String localizedDescription);

    /**
     * Initialise a disbursement request with all required fields.
     */
    @Generated
    @Selector("initWithMerchantIdentifier:currencyCode:regionCode:supportedNetworks:merchantCapabilities:summaryItems:")
    public native PKDisbursementRequest initWithMerchantIdentifierCurrencyCodeRegionCodeSupportedNetworksMerchantCapabilitiesSummaryItems(
            @NotNull String merchantIdentifier, @NotNull String currencyCode, @NotNull String regionCode,
            @NotNull NSArray<String> supportedNetworks, @NUInt long merchantCapabilities,
            @NotNull NSArray<? extends PKPaymentSummaryItem> summaryItems);

    /**
     * The payment processing capabilities of the merchant.
     */
    @Generated
    @Selector("merchantCapabilities")
    @NUInt
    public native long merchantCapabilities();

    /**
     * Identifies the merchant, as previously agreed with Apple. Must match one of the merchant
     * identifiers in the application's entitlement.
     */
    @Generated
    @Selector("merchantIdentifier")
    @NotNull
    public native String merchantIdentifier();

    /**
     * If the merchant already has recipient contact information on file, set it here.
     */
    @Generated
    @Selector("recipientContact")
    @Nullable
    public native PKContact recipientContact();

    /**
     * The merchant's ISO 3166 region code.
     */
    @Generated
    @Selector("regionCode")
    @NotNull
    public native String regionCode();

    /**
     * Indicates which of the recipient's contact details the merchant requires in order to process a disbursement.
     * The order of the elements is ignored.
     */
    @Generated
    @Selector("requiredRecipientContactFields")
    @NotNull
    public native NSArray<String> requiredRecipientContactFields();

    /**
     * Optional merchant-supplied information about the disbursement request.
     * It will be signed and included in the resulting PKPaymentToken.
     */
    @Generated
    @Selector("setApplicationData:")
    public native void setApplicationData(@Nullable NSData value);

    /**
     * The payment processing capabilities of the merchant.
     */
    @Generated
    @Selector("setMerchantCapabilities:")
    public native void setMerchantCapabilities(@NUInt long value);

    /**
     * Identifies the merchant, as previously agreed with Apple. Must match one of the merchant
     * identifiers in the application's entitlement.
     */
    @Generated
    @Selector("setMerchantIdentifier:")
    public native void setMerchantIdentifier(@NotNull String value);

    /**
     * If the merchant already has recipient contact information on file, set it here.
     */
    @Generated
    @Selector("setRecipientContact:")
    public native void setRecipientContact(@Nullable PKContact value);

    /**
     * The merchant's ISO 3166 region code.
     */
    @Generated
    @Selector("setRegionCode:")
    public native void setRegionCode(@NotNull String value);

    /**
     * Indicates which of the recipient's contact details the merchant requires in order to process a disbursement.
     * The order of the elements is ignored.
     */
    @Generated
    @Selector("setRequiredRecipientContactFields:")
    public native void setRequiredRecipientContactFields(@NotNull NSArray<String> value);

    /**
     * The payment networks supported by the merchant, for example `@[ PKPaymentNetworkVisa,
     * PKPaymentNetworkMasterCard ]`. This property constrains payment cards that may receive the funds.
     */
    @Generated
    @Selector("setSupportedNetworks:")
    public native void setSupportedNetworks(@NotNull NSArray<String> value);

    /**
     * Set of two-letter ISO 3166 region codes. When provided, it will filter the selectable payment passes to those
     * issued in the supported regions. The order of the elements is ignored.
     */
    @Generated
    @Selector("setSupportedRegions:")
    public native void setSupportedRegions(@Nullable NSArray<String> value);

    /**
     * The payment networks supported by the merchant, for example `@[ PKPaymentNetworkVisa,
     * PKPaymentNetworkMasterCard ]`. This property constrains payment cards that may receive the funds.
     */
    @Generated
    @Selector("supportedNetworks")
    @NotNull
    public native NSArray<String> supportedNetworks();

    /**
     * Set of two-letter ISO 3166 region codes. When provided, it will filter the selectable payment passes to those
     * issued in the supported regions. The order of the elements is ignored.
     */
    @Generated
    @Selector("supportedRegions")
    @Nullable
    public native NSArray<String> supportedRegions();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

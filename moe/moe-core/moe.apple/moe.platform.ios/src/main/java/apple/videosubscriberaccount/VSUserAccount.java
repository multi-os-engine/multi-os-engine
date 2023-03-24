package apple.videosubscriberaccount;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * API-Since: 16.0
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VSUserAccount extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VSUserAccount(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The identifier of the provider known to Apple that provides the account. For use only with TV Provider
     * Authentication integrated apps.
     */
    @Nullable
    @Generated
    @Selector("accountProviderIdentifier")
    public native String accountProviderIdentifier();

    @Generated
    @Selector("accountType")
    @NInt
    public native long accountType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VSUserAccount alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VSUserAccount allocWithZone(VoidPtr zone);

    /**
     * The authentication token or data used to maintain the authentication state for the account
     * in your application. This will be provided to the application JS during account refresh requests
     * so that billing cycle dates, account validity, or any other data can be fetched for the account.
     * Additionally, when fetching accounts using VSUserAccountManager, if an account is pulled from a
     * different device, and the user is not signed in to the current device, it can be used to
     * authenticate the user seamlessly without requiring username/password.
     * This data is not accessible by Apple.
     */
    @Nullable
    @Generated
    @Selector("authenticationData")
    public native String authenticationData();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Identifies the billing group associated with the subscription.
     */
    @Nullable
    @Generated
    @Selector("billingIdentifier")
    public native String billingIdentifier();

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
     * The type of device the VSUserAccount was registered on.
     */
    @Generated
    @Selector("deviceCategory")
    @NInt
    public native long deviceCategory();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A value opaque to Apple that can be used to uniquely identify the account.
     * When an account update request is made to the application JS, this identifier will be provided in order to help
     * identify the account to be refreshed.
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native VSUserAccount init();

    /**
     * Initializes a new VSUserAccount with a URL that points to an application JS
     * that can respond to account update requests.
     */
    @Generated
    @Selector("initWithAccountType:updateURL:")
    public native VSUserAccount initWithAccountTypeUpdateURL(@NInt long accountType, @Nullable NSURL url);

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

    /**
     * Indicates that the user has deleted their account.
     */
    @Generated
    @Selector("isDeleted")
    public native boolean isDeleted();

    /**
     * Indicates whether or not the account was registered on the current device.
     * Accounts pulled using VSUserAccountManager may be from other devices signed
     * in to the same iCloud account.
     */
    @Generated
    @Selector("isFromCurrentDevice")
    public native boolean isFromCurrentDevice();

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
    public static native VSUserAccount new_objc();

    /**
     * Indicates whether or not the update URL must have a certificate trusted by the system,
     * and not a certificate trusted by the user of the device.
     */
    @Generated
    @Selector("requiresSystemTrust")
    public native boolean requiresSystemTrust();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The identifier of the provider known to Apple that provides the account. For use only with TV Provider
     * Authentication integrated apps.
     */
    @Generated
    @Selector("setAccountProviderIdentifier:")
    public native void setAccountProviderIdentifier(@Nullable String value);

    @Generated
    @Selector("setAccountType:")
    public native void setAccountType(@NInt long value);

    /**
     * The authentication token or data used to maintain the authentication state for the account
     * in your application. This will be provided to the application JS during account refresh requests
     * so that billing cycle dates, account validity, or any other data can be fetched for the account.
     * Additionally, when fetching accounts using VSUserAccountManager, if an account is pulled from a
     * different device, and the user is not signed in to the current device, it can be used to
     * authenticate the user seamlessly without requiring username/password.
     * This data is not accessible by Apple.
     */
    @Generated
    @Selector("setAuthenticationData:")
    public native void setAuthenticationData(@Nullable String value);

    /**
     * Identifies the billing group associated with the subscription.
     */
    @Generated
    @Selector("setBillingIdentifier:")
    public native void setBillingIdentifier(@Nullable String value);

    /**
     * Indicates that the user has deleted their account.
     */
    @Generated
    @Selector("setDeleted:")
    public native void setDeleted(boolean value);

    /**
     * A value opaque to Apple that can be used to uniquely identify the account.
     * When an account update request is made to the application JS, this identifier will be provided in order to help
     * identify the account to be refreshed.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@Nullable String value);

    /**
     * Indicates whether or not the update URL must have a certificate trusted by the system,
     * and not a certificate trusted by the user of the device.
     */
    @Generated
    @Selector("setRequiresSystemTrust:")
    public native void setRequiresSystemTrust(boolean value);

    /**
     * The date in which the billing cycle ends for paid accounts.
     * used as a heuristic to determine when a refresh should occur.
     * If there is no existing billing cycle, this value should be nil.
     */
    @Generated
    @Selector("setSubscriptionBillingCycleEndDate:")
    public native void setSubscriptionBillingCycleEndDate(@Nullable NSDate value);

    /**
     * Identifies a subset of content from your catalog that subscriber can play.
     * Matches tier identifiers that are present in the availability feed.
     */
    @Generated
    @Selector("setTierIdentifiers:")
    public native void setTierIdentifiers(@Nullable NSArray<String> value);

    /**
     * The URL pointing to the application JS that can respond to account update requests, or nil if JS updates are not
     * supported.
     */
    @Generated
    @Selector("setUpdateURL:")
    public native void setUpdateURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The date in which the billing cycle ends for paid accounts.
     * used as a heuristic to determine when a refresh should occur.
     * If there is no existing billing cycle, this value should be nil.
     */
    @Nullable
    @Generated
    @Selector("subscriptionBillingCycleEndDate")
    public native NSDate subscriptionBillingCycleEndDate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Identifies a subset of content from your catalog that subscriber can play.
     * Matches tier identifiers that are present in the availability feed.
     */
    @Nullable
    @Generated
    @Selector("tierIdentifiers")
    public native NSArray<String> tierIdentifiers();

    /**
     * The URL pointing to the application JS that can respond to account update requests, or nil if JS updates are not
     * supported.
     */
    @Nullable
    @Generated
    @Selector("updateURL")
    public native NSURL updateURL();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
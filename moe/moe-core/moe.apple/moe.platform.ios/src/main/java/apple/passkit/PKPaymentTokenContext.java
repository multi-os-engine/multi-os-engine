package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDecimalNumber;
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
 * Defines the context for a single payment token in a request for multiple payment tokens.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPaymentTokenContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentTokenContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentTokenContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKPaymentTokenContext allocWithZone(VoidPtr zone);

    /**
     * The amount this particular payment token should be authorized for. It has the same currency as
     * the enclosing payment request. Must be less than or equal to the total amount of the enclosing
     * payment request.
     */
    @NotNull
    @Generated
    @Selector("amount")
    public native NSDecimalNumber amount();

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
     * An external identifier for the merchant, provided by the developer. If you request a payment
     * token for another merchant, try to always use the same external identifier for that merchant,
     * if possible.
     */
    @NotNull
    @Generated
    @Selector("externalIdentifier")
    public native String externalIdentifier();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKPaymentTokenContext init();

    @Generated
    @Selector("initWithMerchantIdentifier:externalIdentifier:merchantName:merchantDomain:amount:")
    public native PKPaymentTokenContext initWithMerchantIdentifierExternalIdentifierMerchantNameMerchantDomainAmount(
            @NotNull String merchantIdentifier, @NotNull String externalIdentifier, @NotNull String merchantName,
            @Nullable String merchantDomain, @NotNull NSDecimalNumber amount);

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
     * The main top-level domain of the merchant this payment token is intended for, optional.
     */
    @Nullable
    @Generated
    @Selector("merchantDomain")
    public native String merchantDomain();

    /**
     * An identifier for the merchant, as previously agreed with Apple. If you request a payment token
     * for another merchant, use their merchant identifier, if available. Otherwise, use your own.
     */
    @NotNull
    @Generated
    @Selector("merchantIdentifier")
    public native String merchantIdentifier();

    /**
     * The name of the merchant this payment token is intended for; will be displayed to the user.
     */
    @NotNull
    @Generated
    @Selector("merchantName")
    public native String merchantName();

    @Generated
    @Owned
    @Selector("new")
    public static native PKPaymentTokenContext new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The amount this particular payment token should be authorized for. It has the same currency as
     * the enclosing payment request. Must be less than or equal to the total amount of the enclosing
     * payment request.
     */
    @Generated
    @Selector("setAmount:")
    public native void setAmount(@NotNull NSDecimalNumber value);

    /**
     * An external identifier for the merchant, provided by the developer. If you request a payment
     * token for another merchant, try to always use the same external identifier for that merchant,
     * if possible.
     */
    @Generated
    @Selector("setExternalIdentifier:")
    public native void setExternalIdentifier(@NotNull String value);

    /**
     * The main top-level domain of the merchant this payment token is intended for, optional.
     */
    @Generated
    @Selector("setMerchantDomain:")
    public native void setMerchantDomain(@Nullable String value);

    /**
     * An identifier for the merchant, as previously agreed with Apple. If you request a payment token
     * for another merchant, use their merchant identifier, if available. Otherwise, use your own.
     */
    @Generated
    @Selector("setMerchantIdentifier:")
    public native void setMerchantIdentifier(@NotNull String value);

    /**
     * The name of the merchant this payment token is intended for; will be displayed to the user.
     */
    @Generated
    @Selector("setMerchantName:")
    public native void setMerchantName(@NotNull String value);

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
}
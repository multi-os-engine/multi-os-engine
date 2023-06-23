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
 * PKDisbursementRequest defines an application's request to disburse an amount
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

    /**
     * An amount is always required. If the disbursement amount is pending, the amount should be zero
     * 
     * API-Since: 12.2
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

    /**
     * The merchant's ISO country code.
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    /**
     * Currency code for this disbursement. The currency code is required unless the requestType is future
     * 
     * API-Since: 12.2
     */
    @Nullable
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

    /**
     * Specifies if the disbursement is a one time request or a future request
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("requestSchedule")
    @NInt
    public native long requestSchedule();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An amount is always required. If the disbursement amount is pending, the amount should be zero
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setAmount:")
    public native void setAmount(@NotNull NSDecimalNumber value);

    /**
     * The merchant's ISO country code.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setCountryCode:")
    public native void setCountryCode(@NotNull String value);

    /**
     * Currency code for this disbursement. The currency code is required unless the requestType is future
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(@Nullable String value);

    /**
     * Specifies if the disbursement is a one time request or a future request
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setRequestSchedule:")
    public native void setRequestSchedule(@NInt long value);

    /**
     * The summary items are optional. The final amount summary item will be prepopulated by the amount specified above.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setSummaryItems:")
    public native void setSummaryItems(@Nullable NSArray<? extends PKPaymentSummaryItem> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The summary items are optional. The final amount summary item will be prepopulated by the amount specified above.
     * 
     * API-Since: 12.2
     */
    @Nullable
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
}

package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * API-Since: 15.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKRecurringPaymentSummaryItem extends PKPaymentSummaryItem {
    static {
        NatJ.register();
    }

    @Generated
    protected PKRecurringPaymentSummaryItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKRecurringPaymentSummaryItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKRecurringPaymentSummaryItem allocWithZone(VoidPtr zone);

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
     * If set, the date at which the recurring payments will end. Default is nil.
     */
    @Nullable
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKRecurringPaymentSummaryItem init();

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
     * The number of intervals between payments. Default is 1.
     */
    @Generated
    @Selector("intervalCount")
    @NInt
    public native long intervalCount();

    /**
     * The interval at which payments will be taken (daily, weekly, monthly, yearly, etc.). The default value is
     * NSCalendarUnitMonth.
     */
    @Generated
    @Selector("intervalUnit")
    @NUInt
    public native long intervalUnit();

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
    public static native PKRecurringPaymentSummaryItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * If set, the date at which the recurring payments will end. Default is nil.
     */
    @Generated
    @Selector("setEndDate:")
    public native void setEndDate(@Nullable NSDate value);

    /**
     * The number of intervals between payments. Default is 1.
     */
    @Generated
    @Selector("setIntervalCount:")
    public native void setIntervalCount(@NInt long value);

    /**
     * The interval at which payments will be taken (daily, weekly, monthly, yearly, etc.). The default value is
     * NSCalendarUnitMonth.
     */
    @Generated
    @Selector("setIntervalUnit:")
    public native void setIntervalUnit(@NUInt long value);

    /**
     * The timestamp at which the first payment will be taken; nil indicates immediately. The default value is nil.
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(@Nullable NSDate value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The timestamp at which the first payment will be taken; nil indicates immediately. The default value is nil.
     */
    @Nullable
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Selector("summaryItemWithLabel:amount:")
    public static native PKRecurringPaymentSummaryItem summaryItemWithLabelAmount(@NotNull String label,
            @NotNull NSDecimalNumber amount);

    @Generated
    @Selector("summaryItemWithLabel:amount:type:")
    public static native PKRecurringPaymentSummaryItem summaryItemWithLabelAmountType(@NotNull String label,
            @NotNull NSDecimalNumber amount, @NUInt long type);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

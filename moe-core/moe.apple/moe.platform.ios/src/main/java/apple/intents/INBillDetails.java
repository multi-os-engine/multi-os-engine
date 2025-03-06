package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDateComponents;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.3
 * Deprecated-Since: 15.0
 * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INBillDetails extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INBillDetails(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INBillDetails alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INBillDetails allocWithZone(VoidPtr zone);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("amountDue")
    public native INCurrencyAmount amountDue();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("billPayee")
    public native INBillPayee billPayee();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("billType")
    @NInt
    public native long billType();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("dueDate")
    public native NSDateComponents dueDate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INBillDetails init();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("initWithBillType:paymentStatus:billPayee:amountDue:minimumDue:lateFee:dueDate:paymentDate:")
    public native INBillDetails initWithBillTypePaymentStatusBillPayeeAmountDueMinimumDueLateFeeDueDatePaymentDate(
            @NInt long billType, @NInt long paymentStatus, @Nullable INBillPayee billPayee,
            @Nullable INCurrencyAmount amountDue, @Nullable INCurrencyAmount minimumDue,
            @Nullable INCurrencyAmount lateFee, @Nullable NSDateComponents dueDate,
            @Nullable NSDateComponents paymentDate);

    @Generated
    @Selector("initWithCoder:")
    public native INBillDetails initWithCoder(@NotNull NSCoder coder);

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
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("lateFee")
    public native INCurrencyAmount lateFee();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("minimumDue")
    public native INCurrencyAmount minimumDue();

    @Generated
    @Owned
    @Selector("new")
    public static native INBillDetails new_objc();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("paymentDate")
    public native NSDateComponents paymentDate();

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("paymentStatus")
    @NInt
    public native long paymentStatus();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setAmountDue:")
    public native void setAmountDue(@Nullable INCurrencyAmount value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setBillPayee:")
    public native void setBillPayee(@Nullable INBillPayee value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setBillType:")
    public native void setBillType(@NInt long value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setDueDate:")
    public native void setDueDate(@Nullable NSDateComponents value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setLateFee:")
    public native void setLateFee(@Nullable INCurrencyAmount value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setMinimumDue:")
    public native void setMinimumDue(@Nullable INCurrencyAmount value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setPaymentDate:")
    public native void setPaymentDate(@Nullable NSDateComponents value);

    /**
     * API-Since: 10.3
     * Deprecated-Since: 15.0
     * Deprecated-Message: INBillDetails is deprecated. There is no replacement.
     */
    @Deprecated
    @Generated
    @Selector("setPaymentStatus:")
    public native void setPaymentStatus(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

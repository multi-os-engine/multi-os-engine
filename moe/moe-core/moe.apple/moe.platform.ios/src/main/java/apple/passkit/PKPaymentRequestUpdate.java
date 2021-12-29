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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
            NSArray<? extends PKPaymentSummaryItem> paymentSummaryItems);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKPaymentRequestUpdate new_objc();

    /**
     * The new payment summary items to update the payment request with
     */
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
    public native void setPaymentSummaryItems(NSArray<? extends PKPaymentSummaryItem> value);

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
     */
    @Generated
    @Selector("setShippingMethods:")
    public native void setShippingMethods(NSArray<? extends PKShippingMethod> value);

    /**
     * The new shipping methods to update the payment request with. An empty array, the default value,
     * indicates that the shipping methods don't need updating.
     */
    @Generated
    @Selector("shippingMethods")
    public native NSArray<? extends PKShippingMethod> shippingMethods();
}

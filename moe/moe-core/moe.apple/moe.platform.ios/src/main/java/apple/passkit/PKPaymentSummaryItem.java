/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * PKPaymentSummaryItem Defines a line-item for a payment such as tax, shipping, or discount.
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPaymentSummaryItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentSummaryItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentSummaryItem alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("summaryItemWithLabel:amount:")
    public static native PKPaymentSummaryItem summaryItemWithLabelAmount(String label, NSDecimalNumber amount);

    @Generated
    @Selector("summaryItemWithLabel:amount:type:")
    public static native PKPaymentSummaryItem summaryItemWithLabelAmountType(String label, NSDecimalNumber amount,
            @NUInt long type);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Same currency as the enclosing PKPaymentRequest.  Negative values are permitted, for example when
     * redeeming a coupon. An amount is always required unless the summary item's type is set to pending
     */
    @Generated
    @Selector("amount")
    public native NSDecimalNumber amount();

    @Generated
    @Selector("init")
    public native PKPaymentSummaryItem init();

    /**
     * A short localized description of the item, e.g. "Tax" or "Gift Card".
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * Same currency as the enclosing PKPaymentRequest.  Negative values are permitted, for example when
     * redeeming a coupon. An amount is always required unless the summary item's type is set to pending
     */
    @Generated
    @Selector("setAmount:")
    public native void setAmount(NSDecimalNumber value);

    /**
     * A short localized description of the item, e.g. "Tax" or "Gift Card".
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * Defaults to PKPaymentSummaryItemTypeFinal
     * Set to PKPaymentSummaryItemTypePending if the amount of the item is not known at this time
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NUInt long value);

    /**
     * Defaults to PKPaymentSummaryItemTypeFinal
     * Set to PKPaymentSummaryItemTypePending if the amount of the item is not known at this time
     */
    @Generated
    @Selector("type")
    @NUInt
    public native long type();
}

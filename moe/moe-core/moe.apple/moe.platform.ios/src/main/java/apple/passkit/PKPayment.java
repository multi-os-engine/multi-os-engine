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
import org.moe.natj.general.ptr.ConstVoidPtr;
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
 * PKPayment represents the result of a payment request. Successful payments
 * have a PKPaymentToken which contains a payment credential encrypted to the merchant
 * identifier specified in the request, and when requested, the user's shipping address
 * and chosen shipping method.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPayment extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPayment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPayment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPayment allocWithZone(VoidPtr zone);

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
    public static native PKPayment new_objc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use billingContact instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("billingAddress")
    public native ConstVoidPtr billingAddress();

    /**
     * The full billing address that the user selected for this transaction. Fields are
     * constrained to those specified in the requiredBillingAddressFields property of the original
     * PKPaymentRequest object. This property is only set when the application has set
     * the requiredBillingAddressFields property of the PKPaymentRequest.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("billingContact")
    public native PKContact billingContact();

    @Generated
    @Selector("init")
    public native PKPayment init();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use shippingContact instead
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("shippingAddress")
    public native ConstVoidPtr shippingAddress();

    /**
     * The full shipping address that the user selected for this transaction. Fields are
     * constrained to those specified in the requiredShippingAddressFields property of the original
     * PKPaymentRequest object. This property is only set when the application has set
     * the requiredShippingAddressFields property of the PKPaymentRequest.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("shippingContact")
    public native PKContact shippingContact();

    /**
     * The shipping method that the user chose. This property is only set when the
     * application has set the shippingMethods property of the PKPaymentRequest.
     */
    @Nullable
    @Generated
    @Selector("shippingMethod")
    public native PKShippingMethod shippingMethod();

    /**
     * A PKPaymentToken which contains an encrypted payment credential.
     */
    @NotNull
    @Generated
    @Selector("token")
    public native PKPaymentToken token();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

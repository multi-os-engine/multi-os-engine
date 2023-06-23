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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * API-Since: 3.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKMutablePayment extends SKPayment {
    static {
        NatJ.register();
    }

    @Generated
    protected SKMutablePayment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKMutablePayment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKMutablePayment allocWithZone(VoidPtr zone);

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
    public static native SKMutablePayment new_objc();

    @Generated
    @Selector("paymentWithProduct:")
    public static native SKMutablePayment paymentWithProduct(@NotNull SKProduct product);

    @Generated
    @Deprecated
    @Selector("paymentWithProductIdentifier:")
    public static native SKMutablePayment paymentWithProductIdentifier(@NotNull String identifier);

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
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("applicationUsername")
    public native String applicationUsername();

    @Generated
    @Selector("init")
    public native SKMutablePayment init();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("productIdentifier")
    public native String productIdentifier();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("quantity")
    @NInt
    public native long quantity();

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("requestData")
    public native NSData requestData();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setApplicationUsername:")
    public native void setApplicationUsername(@Nullable String value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setProductIdentifier:")
    public native void setProductIdentifier(@NotNull String value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setQuantity:")
    public native void setQuantity(@NInt long value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setRequestData:")
    public native void setRequestData(@Nullable NSData value);

    /**
     * API-Since: 8.3
     */
    @Generated
    @Selector("setSimulatesAskToBuyInSandbox:")
    public native void setSimulatesAskToBuyInSandbox(boolean value);

    /**
     * API-Since: 8.3
     */
    @Generated
    @Selector("simulatesAskToBuyInSandbox")
    public native boolean simulatesAskToBuyInSandbox();

    /**
     * API-Since: 12.2
     */
    @Nullable
    @Generated
    @Selector("paymentDiscount")
    public native SKPaymentDiscount paymentDiscount();

    /**
     * API-Since: 12.2
     */
    @Generated
    @Selector("setPaymentDiscount:")
    public native void setPaymentDiscount(@Nullable SKPaymentDiscount value);
}

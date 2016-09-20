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
import apple.foundation.NSData;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
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
public class PKPaymentRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentRequest alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * applicationData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/applicationData">iOS Dev Center</a>
     */
    @Generated
    @Selector("applicationData")
    public native NSData applicationData();

    /**
     * billingAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/billingAddress">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("billingAddress")
    public native ConstVoidPtr billingAddress();

    /**
     * countryCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/countryCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    /**
     * currencyCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/currencyCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    @Generated
    @Selector("init")
    public native PKPaymentRequest init();

    /**
     * merchantCapabilities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/merchantCapabilities">iOS Dev Center</a>
     */
    @Generated
    @Selector("merchantCapabilities")
    @NUInt
    public native long merchantCapabilities();

    /**
     * merchantIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/merchantIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("merchantIdentifier")
    public native String merchantIdentifier();

    /**
     * paymentSummaryItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/paymentSummaryItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("paymentSummaryItems")
    public native NSArray<? extends PKPaymentSummaryItem> paymentSummaryItems();

    /**
     * requiredBillingAddressFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/requiredBillingAddressFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiredBillingAddressFields")
    @NUInt
    public native long requiredBillingAddressFields();

    /**
     * requiredShippingAddressFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/requiredShippingAddressFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiredShippingAddressFields")
    @NUInt
    public native long requiredShippingAddressFields();

    /**
     * applicationData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/applicationData">iOS Dev Center</a>
     */
    @Generated
    @Selector("setApplicationData:")
    public native void setApplicationData(NSData value);

    /**
     * billingAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/billingAddress">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setBillingAddress:")
    public native void setBillingAddress(ConstVoidPtr value);

    /**
     * countryCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/countryCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCountryCode:")
    public native void setCountryCode(String value);

    /**
     * currencyCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/currencyCode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(String value);

    /**
     * merchantCapabilities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/merchantCapabilities">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMerchantCapabilities:")
    public native void setMerchantCapabilities(@NUInt long value);

    /**
     * merchantIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/merchantIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMerchantIdentifier:")
    public native void setMerchantIdentifier(String value);

    /**
     * paymentSummaryItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/paymentSummaryItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaymentSummaryItems:")
    public native void setPaymentSummaryItems(NSArray<? extends PKPaymentSummaryItem> value);

    /**
     * requiredBillingAddressFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/requiredBillingAddressFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRequiredBillingAddressFields:")
    public native void setRequiredBillingAddressFields(@NUInt long value);

    /**
     * requiredShippingAddressFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/requiredShippingAddressFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRequiredShippingAddressFields:")
    public native void setRequiredShippingAddressFields(@NUInt long value);

    /**
     * shippingAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingAddress">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setShippingAddress:")
    public native void setShippingAddress(ConstVoidPtr value);

    /**
     * shippingMethods</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingMethods">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShippingMethods:")
    public native void setShippingMethods(NSArray<? extends PKShippingMethod> value);

    /**
     * shippingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShippingType:")
    public native void setShippingType(@NUInt long value);

    /**
     * supportedNetworks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/supportedNetworks">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSupportedNetworks:")
    public native void setSupportedNetworks(NSArray<String> value);

    /**
     * shippingAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingAddress">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("shippingAddress")
    public native ConstVoidPtr shippingAddress();

    /**
     * shippingMethods</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingMethods">iOS Dev Center</a>
     */
    @Generated
    @Selector("shippingMethods")
    public native NSArray<? extends PKShippingMethod> shippingMethods();

    /**
     * shippingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingType">iOS Dev Center</a>
     */
    @Generated
    @Selector("shippingType")
    @NUInt
    public native long shippingType();

    /**
     * supportedNetworks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/supportedNetworks">iOS Dev Center</a>
     */
    @Generated
    @Selector("supportedNetworks")
    public native NSArray<String> supportedNetworks();

    /**
     * billingContact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/billingContact">iOS Dev Center</a>
     */
    @Generated
    @Selector("billingContact")
    public native PKContact billingContact();

    /**
     * billingContact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/billingContact">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBillingContact:")
    public native void setBillingContact(PKContact value);

    /**
     * shippingContact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingContact">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShippingContact:")
    public native void setShippingContact(PKContact value);

    /**
     * shippingContact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKPaymentRequest_Ref/index.html#//apple_ref/occ/instp/PKPaymentRequest/shippingContact">iOS Dev Center</a>
     */
    @Generated
    @Selector("shippingContact")
    public native PKContact shippingContact();
}

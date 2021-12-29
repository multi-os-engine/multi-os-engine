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
public class PKAddPaymentPassRequestConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKAddPaymentPassRequestConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKAddPaymentPassRequestConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKAddPaymentPassRequestConfiguration allocWithZone(VoidPtr zone);

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
    public static native PKAddPaymentPassRequestConfiguration new_objc();

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

    @Generated
    @Selector("cardDetails")
    public native NSArray<? extends PKLabeledValue> cardDetails();

    @Generated
    @Selector("cardholderName")
    public native String cardholderName();

    @Generated
    @Selector("encryptionScheme")
    public native String encryptionScheme();

    @Generated
    @Selector("init")
    public native PKAddPaymentPassRequestConfiguration init();

    /**
     * Schemes defined in PKConstants.h.
     * Supported Schemes:
     * PKEncryptionSchemeECC_V2:
     * ephemeralPublicKey
     * PKEncryptionSchemeRSA_V2:
     * wrappedKey
     */
    @Generated
    @Selector("initWithEncryptionScheme:")
    public native PKAddPaymentPassRequestConfiguration initWithEncryptionScheme(String encryptionScheme);

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * Filters introduction page to a specific network - does not function as a restriction.
     */
    @Generated
    @Selector("paymentNetwork")
    public native String paymentNetwork();

    /**
     * Pass Library Filters:
     * If the filtered set is empty, then all filter will be ignored.
     */
    @Generated
    @Selector("primaryAccountIdentifier")
    public native String primaryAccountIdentifier();

    @Generated
    @Selector("primaryAccountSuffix")
    public native String primaryAccountSuffix();

    @Generated
    @Selector("requiresFelicaSecureElement")
    public native boolean requiresFelicaSecureElement();

    @Generated
    @Selector("setCardDetails:")
    public native void setCardDetails(NSArray<? extends PKLabeledValue> value);

    @Generated
    @Selector("setCardholderName:")
    public native void setCardholderName(String value);

    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * Filters introduction page to a specific network - does not function as a restriction.
     */
    @Generated
    @Selector("setPaymentNetwork:")
    public native void setPaymentNetwork(String value);

    /**
     * Pass Library Filters:
     * If the filtered set is empty, then all filter will be ignored.
     */
    @Generated
    @Selector("setPrimaryAccountIdentifier:")
    public native void setPrimaryAccountIdentifier(String value);

    @Generated
    @Selector("setPrimaryAccountSuffix:")
    public native void setPrimaryAccountSuffix(String value);

    @Generated
    @Selector("setRequiresFelicaSecureElement:")
    public native void setRequiresFelicaSecureElement(boolean value);

    /**
     * Filters introduction page to a specific set of images - does not function as a restriction.
     */
    @Generated
    @Selector("productIdentifiers")
    public native NSSet<String> productIdentifiers();

    /**
     * Filters introduction page to a specific set of images - does not function as a restriction.
     */
    @Generated
    @Selector("setProductIdentifiers:")
    public native void setProductIdentifiers(NSSet<String> value);

    /**
     * Display Properties:
     * At least one of cardholder name or primary account suffix must be supplied.
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * Display Properties:
     * At least one of cardholder name or primary account suffix must be supplied.
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();
}

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
import apple.passkit.protocol.PKPaymentAuthorizationControllerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * PKPaymentAuthorizationController prompts the user to authorize a PKPaymentRequest, funding the
 * payment amount with a valid payment card.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPaymentAuthorizationController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentAuthorizationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentAuthorizationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPaymentAuthorizationController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Determine whether this device can process payment requests.
     * YES if the device is generally capable of making in-app payments.
     * NO if the device cannot make in-app payments or if the user is restricted from authorizing payments.
     */
    @Generated
    @Selector("canMakePayments")
    public static native boolean canMakePayments();

    /**
     * Determine whether this device can process payment requests using specific payment network brands.
     * Your application should confirm that the user can make payments before attempting to authorize a payment.
     * Your application may also want to alter its appearance or behavior when the user is not allowed
     * to make payments.
     * YES if the user can authorize payments on this device using one of the payment networks supported
     * by the merchant.
     * NO if the user cannot authorize payments on these networks or if the user is restricted from
     * authorizing payments.
     */
    @Generated
    @Selector("canMakePaymentsUsingNetworks:")
    public static native boolean canMakePaymentsUsingNetworks(NSArray<String> supportedNetworks);

    /**
     * Determine whether this device can process payments using the specified networks and capabilities bitmask
     * See +canMakePaymentsUsingNetworks:
     */
    @Generated
    @Selector("canMakePaymentsUsingNetworks:capabilities:")
    public static native boolean canMakePaymentsUsingNetworksCapabilities(NSArray<String> supportedNetworks,
            @NUInt long capabilties);

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
    public static native PKPaymentAuthorizationController new_objc();

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
     * The controller's delegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native PKPaymentAuthorizationControllerDelegate delegate();

    /**
     * Dismisses the Apple Pay UI. Call this when you receive the paymentAuthorizationControllerDidFinish delegate
     * callback, or otherwise wish a dismissal to occur
     */
    @Generated
    @Selector("dismissWithCompletion:")
    public native void dismissWithCompletion(
            @ObjCBlock(name = "call_dismissWithCompletion") Block_dismissWithCompletion completion);

    @Generated
    @Selector("init")
    public native PKPaymentAuthorizationController init();

    /**
     * Initialize the controller with a payment request.
     */
    @Generated
    @Selector("initWithPaymentRequest:")
    public native PKPaymentAuthorizationController initWithPaymentRequest(PKPaymentRequest request);

    /**
     * Presents the Apple Pay UI modally over your app. You are responsible for dismissal
     */
    @Generated
    @Selector("presentWithCompletion:")
    public native void presentWithCompletion(
            @ObjCBlock(name = "call_presentWithCompletion") Block_presentWithCompletion completion);

    /**
     * The controller's delegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) PKPaymentAuthorizationControllerDelegate value);

    /**
     * The controller's delegate.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) PKPaymentAuthorizationControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissWithCompletion {
        @Generated
        void call_dismissWithCompletion();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentWithCompletion {
        @Generated
        void call_presentWithCompletion(boolean success);
    }
}

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
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPassLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPassLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPassLibrary alloc();

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
    @Selector("endAutomaticPassPresentationSuppressionWithRequestToken:")
    public static native void endAutomaticPassPresentationSuppressionWithRequestToken(@NUInt long requestToken);

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
    @Selector("isPassLibraryAvailable")
    public static native boolean isPassLibraryAvailable();

    @Generated
    @Deprecated
    @Selector("isPaymentPassActivationAvailable")
    public static native boolean isPaymentPassActivationAvailable_static();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isSuppressingAutomaticPassPresentation")
    public static native boolean isSuppressingAutomaticPassPresentation();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("requestAutomaticPassPresentationSuppressionWithResponseHandler:")
    @NUInt
    public static native long requestAutomaticPassPresentationSuppressionWithResponseHandler(
            @ObjCBlock(name = "call_requestAutomaticPassPresentationSuppressionWithResponseHandler") Block_requestAutomaticPassPresentationSuppressionWithResponseHandler responseHandler);

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
    @Deprecated
    @Selector("activatePaymentPass:withActivationCode:completion:")
    public native void activatePaymentPassWithActivationCodeCompletion(PKPaymentPass paymentPass, String activationCode,
            @ObjCBlock(name = "call_activatePaymentPassWithActivationCodeCompletion") Block_activatePaymentPassWithActivationCodeCompletion completion);

    @Generated
    @Selector("activatePaymentPass:withActivationData:completion:")
    public native void activatePaymentPassWithActivationDataCompletion(PKPaymentPass paymentPass, NSData activationData,
            @ObjCBlock(name = "call_activatePaymentPassWithActivationDataCompletion") Block_activatePaymentPassWithActivationDataCompletion completion);

    @Generated
    @Selector("addPasses:withCompletionHandler:")
    public native void addPassesWithCompletionHandler(NSArray<? extends PKPass> passes,
            @ObjCBlock(name = "call_addPassesWithCompletionHandler") Block_addPassesWithCompletionHandler completion);

    @Generated
    @Selector("canAddFelicaPass")
    public native boolean canAddFelicaPass();

    @Generated
    @Selector("canAddPaymentPassWithPrimaryAccountIdentifier:")
    public native boolean canAddPaymentPassWithPrimaryAccountIdentifier(String primaryAccountIdentifier);

    @Generated
    @Selector("containsPass:")
    public native boolean containsPass(PKPass pass);

    @Generated
    @Selector("init")
    public native PKPassLibrary init();

    @Generated
    @Selector("isPaymentPassActivationAvailable")
    public native boolean isPaymentPassActivationAvailable();

    @Generated
    @Selector("openPaymentSetup")
    public native void openPaymentSetup();

    @Generated
    @Selector("passWithPassTypeIdentifier:serialNumber:")
    public native PKPass passWithPassTypeIdentifierSerialNumber(String identifier, String serialNumber);

    @Generated
    @Selector("passes")
    public native NSArray<? extends PKPass> passes();

    @Generated
    @Selector("passesOfType:")
    public native NSArray<? extends PKPass> passesOfType(@NUInt long passType);

    @Generated
    @Selector("presentPaymentPass:")
    public native void presentPaymentPass(PKPaymentPass pass);

    @Generated
    @Selector("remotePaymentPasses")
    public native NSArray<? extends PKPaymentPass> remotePaymentPasses();

    @Generated
    @Selector("removePass:")
    public native void removePass(PKPass pass);

    @Generated
    @Selector("replacePassWithPass:")
    public native boolean replacePassWithPass(PKPass pass);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activatePaymentPassWithActivationCodeCompletion {
        @Generated
        void call_activatePaymentPassWithActivationCodeCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activatePaymentPassWithActivationDataCompletion {
        @Generated
        void call_activatePaymentPassWithActivationDataCompletion(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPassesWithCompletionHandler {
        @Generated
        void call_addPassesWithCompletionHandler(@NInt long status);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAutomaticPassPresentationSuppressionWithResponseHandler {
        @Generated
        void call_requestAutomaticPassPresentationSuppressionWithResponseHandler(@NUInt long result);
    }

    @Generated
    @Selector("activateSecureElementPass:withActivationData:completion:")
    public native void activateSecureElementPassWithActivationDataCompletion(PKSecureElementPass secureElementPass,
            NSData activationData,
            @ObjCBlock(name = "call_activateSecureElementPassWithActivationDataCompletion") Block_activateSecureElementPassWithActivationDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activateSecureElementPassWithActivationDataCompletion {
        @Generated
        void call_activateSecureElementPassWithActivationDataCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("canAddSecureElementPassWithPrimaryAccountIdentifier:")
    public native boolean canAddSecureElementPassWithPrimaryAccountIdentifier(String primaryAccountIdentifier);

    @Generated
    @Selector("isSecureElementPassActivationAvailable")
    public native boolean isSecureElementPassActivationAvailable();

    @Generated
    @Selector("presentSecureElementPass:")
    public native void presentSecureElementPass(PKSecureElementPass pass);

    @Generated
    @Selector("remoteSecureElementPasses")
    public native NSArray<? extends PKSecureElementPass> remoteSecureElementPasses();

    @Generated
    @Selector("signData:withSecureElementPass:completion:")
    public native void signDataWithSecureElementPassCompletion(NSData signData, PKSecureElementPass secureElementPass,
            @ObjCBlock(name = "call_signDataWithSecureElementPassCompletion") Block_signDataWithSecureElementPassCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_signDataWithSecureElementPassCompletion {
        @Generated
        void call_signDataWithSecureElementPassCompletion(NSData signedData, NSData signature, NSError error);
    }
}

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

    /**
     * The library is not available on iPad in 6.0.
     */
    @Generated
    @Selector("isPassLibraryAvailable")
    public static native boolean isPassLibraryAvailable();

    /**
     * If device supports adding payment passes, this method will return YES. Otherwise, NO will be returned.
     */
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

    /**
     * These methods may be used to temporarily disable the automatic presentation of passes when a device encounters a contactless field.
     * Use of these methods require an entitlement. Otherwise, requesting will always return a PKAutomaticPassPresentationSuppressionResultDenied as the result.
     */
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

    /**
     * These methods may be utilized to activate a payment pass that is provisioned but currently in the inactive state, by providing
     * either a cryptographic OTP, or an activation code.
     */
    @Generated
    @Selector("activatePaymentPass:withActivationData:completion:")
    public native void activatePaymentPassWithActivationDataCompletion(PKPaymentPass paymentPass, NSData activationData,
            @ObjCBlock(name = "call_activatePaymentPassWithActivationDataCompletion") Block_activatePaymentPassWithActivationDataCompletion completion);

    /**
     * The user will be prompted to grant permission for the calling process to add passes to the Pass Library. The user may respond
     * by allowing the passes to be added, or requesting to review the passes. The selection will be returned in the completionHandler
     * as a PKPassLibraryAddPassesStatus. If PKPassLibraryPassesPresentReview is returned, you must present a PKAddPassesViewController
     * initialized with the passes so that the user may review and add the passes manually. The completion handler for this method is
     * called on an arbitrary queue - dispatch to the main queue if you're presenting UI.
     */
    @Generated
    @Selector("addPasses:withCompletionHandler:")
    public native void addPassesWithCompletionHandler(NSArray<? extends PKPass> passes,
            @ObjCBlock(name = "call_addPassesWithCompletionHandler") Block_addPassesWithCompletionHandler completion);

    /**
     * If the library can add Felica passes, this method will return YES. Otherwise, NO will be returned.
     */
    @Generated
    @Selector("canAddFelicaPass")
    public native boolean canAddFelicaPass();

    /**
     * Returns YES if either the current device or an attached device both supports adding payment passes and does not already contain
     * a payment pass with the supplied primary account identifier.
     */
    @Generated
    @Selector("canAddPaymentPassWithPrimaryAccountIdentifier:")
    public native boolean canAddPaymentPassWithPrimaryAccountIdentifier(String primaryAccountIdentifier);

    /**
     * This returns YES even if the process is not entitled to access the pass in the library.  An app like Mail is not entitled to get
     * pass from the library, but it should avoid presenting UI for adding an email attachment pass that is already in the library.
     */
    @Generated
    @Selector("containsPass:")
    public native boolean containsPass(PKPass pass);

    @Generated
    @Selector("init")
    public native PKPassLibrary init();

    /**
     * If this pass library supports activating payment passes, this method will return YES. Otherwise, NO will be returned.
     */
    @Generated
    @Selector("isPaymentPassActivationAvailable")
    public native boolean isPaymentPassActivationAvailable();

    /**
     * Opens the card setup flow (in Wallet on iPhone, Settings on iPad). Use this to direct a user to card setup directly from your app.
     */
    @Generated
    @Selector("openPaymentSetup")
    public native void openPaymentSetup();

    @Generated
    @Selector("passWithPassTypeIdentifier:serialNumber:")
    public native PKPass passWithPassTypeIdentifierSerialNumber(String identifier, String serialNumber);

    /**
     * These return only local passes the process is entitled to access.
     */
    @Generated
    @Selector("passes")
    public native NSArray<? extends PKPass> passes();

    @Generated
    @Selector("passesOfType:")
    public native NSArray<? extends PKPass> passesOfType(@NUInt long passType);

    /**
     * Presents the pass for use above the current application. The pass must already be in the pass library for this to have effect.
     */
    @Generated
    @Selector("presentPaymentPass:")
    public native void presentPaymentPass(PKPaymentPass pass);

    /**
     * This returns the remote payment passes from attached devices
     */
    @Generated
    @Selector("remotePaymentPasses")
    public native NSArray<? extends PKPaymentPass> remotePaymentPasses();

    @Generated
    @Selector("removePass:")
    public native void removePass(PKPass pass);

    /**
     * This will fail if a pass with matching identifier and serial number is not already present in the library, or if the process
     * is not entitled to access the pass. To add a completely new pass, use PKAddPassesViewController.
     */
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

    /**
     * Sign a payload using the pass
     */
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

    /**
     * Returns custom data for a given secure element pass, if supported by that pass
     */
    @Generated
    @Selector("serviceProviderDataForSecureElementPass:completion:")
    public native void serviceProviderDataForSecureElementPassCompletion(PKSecureElementPass secureElementPass,
            @ObjCBlock(name = "call_serviceProviderDataForSecureElementPassCompletion") Block_serviceProviderDataForSecureElementPassCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_serviceProviderDataForSecureElementPassCompletion {
        @Generated
        void call_serviceProviderDataForSecureElementPassCompletion(NSData serviceProviderData, NSError error);
    }
}

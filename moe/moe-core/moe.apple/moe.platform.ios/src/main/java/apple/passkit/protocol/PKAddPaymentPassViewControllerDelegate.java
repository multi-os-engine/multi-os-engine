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

package apple.passkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.passkit.PKAddPaymentPassRequest;
import apple.passkit.PKAddPaymentPassViewController;
import apple.passkit.PKPaymentPass;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 9.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKAddPaymentPassViewControllerDelegate")
public interface PKAddPaymentPassViewControllerDelegate {
    /**
     * Error parameter will use codes from the PKAddPaymentPassError enumeration, using the PKPassKitErrorDomain domain.
     */
    @Generated
    @Selector("addPaymentPassViewController:didFinishAddingPaymentPass:error:")
    void addPaymentPassViewControllerDidFinishAddingPaymentPassError(PKAddPaymentPassViewController controller,
            PKPaymentPass pass, NSError error);

    /**
     * Certificates is an array of NSData, each a DER encoded X.509 certificate, with the leaf first and root last.
     * The continuation handler must be called within 20 seconds or an error will be displayed.
     * Subsequent to timeout, the continuation handler is invalid and invocations will be ignored.
     */
    @Generated
    @Selector("addPaymentPassViewController:generateRequestWithCertificateChain:nonce:nonceSignature:completionHandler:")
    void addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler(
            PKAddPaymentPassViewController controller, NSArray<? extends NSData> certificates, NSData nonce,
            NSData nonceSignature,
            @ObjCBlock(name = "call_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler") Block_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler {
        @Generated
        void call_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler(
                PKAddPaymentPassRequest request);
    }
}

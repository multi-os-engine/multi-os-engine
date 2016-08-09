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

package ios.passkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.passkit.PKAddPaymentPassRequest;
import ios.passkit.PKAddPaymentPassViewController;
import ios.passkit.PKPaymentPass;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKAddPaymentPassViewControllerDelegate")
public interface PKAddPaymentPassViewControllerDelegate {
	/**
	 * addPaymentPassViewController:didFinishAddingPaymentPass:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKAddPaymentPassViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/PKAddPaymentPassViewControllerDelegate/addPaymentPassViewController:didFinishAddingPaymentPass:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPaymentPassViewController:didFinishAddingPaymentPass:error:")
	void addPaymentPassViewControllerDidFinishAddingPaymentPassError(PKAddPaymentPassViewController controller,
			PKPaymentPass pass, NSError error);

	/**
	 * addPaymentPassViewController:generateRequestWithCertificateChain:nonce:nonceSignature:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/PassKit/Reference/PKAddPaymentPassViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/PKAddPaymentPassViewControllerDelegate/addPaymentPassViewController:generateRequestWithCertificateChain:nonce:nonceSignature:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPaymentPassViewController:generateRequestWithCertificateChain:nonce:nonceSignature:completionHandler:")
	void addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler(
			PKAddPaymentPassViewController controller, NSArray<? extends NSData> certificates, NSData nonce, NSData nonceSignature,
			@ObjCBlock(name = "call_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler") Block_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler {
		@Generated
		void call_addPaymentPassViewControllerGenerateRequestWithCertificateChainNonceNonceSignatureCompletionHandler(
				PKAddPaymentPassRequest arg0);
	}
}

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

package ios.networkextension.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.networkextension.NWTCPConnection;
import ios.security.opaque.SecIdentityRef;
import ios.security.opaque.SecTrustRef;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NWTCPConnectionAuthenticationDelegate")
public interface NWTCPConnectionAuthenticationDelegate {
	/**
	 * evaluateTrustForConnection:peerCertificateChain:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionAuthenticationDelegateClassRef/index.html#//apple_ref/occ/intfm/NWTCPConnectionAuthenticationDelegate/evaluateTrustForConnection:peerCertificateChain:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("evaluateTrustForConnection:peerCertificateChain:completionHandler:")
	default void evaluateTrustForConnectionPeerCertificateChainCompletionHandler(NWTCPConnection connection,
			NSArray<?> peerCertificateChain,
			@ObjCBlock(name = "call_evaluateTrustForConnectionPeerCertificateChainCompletionHandler") Block_evaluateTrustForConnectionPeerCertificateChainCompletionHandler completion) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_evaluateTrustForConnectionPeerCertificateChainCompletionHandler {
		@Generated
		void call_evaluateTrustForConnectionPeerCertificateChainCompletionHandler(SecTrustRef arg0);
	}

	/**
	 * provideIdentityForConnection:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionAuthenticationDelegateClassRef/index.html#//apple_ref/occ/intfm/NWTCPConnectionAuthenticationDelegate/provideIdentityForConnection:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("provideIdentityForConnection:completionHandler:")
	default void provideIdentityForConnectionCompletionHandler(NWTCPConnection connection,
			@ObjCBlock(name = "call_provideIdentityForConnectionCompletionHandler") Block_provideIdentityForConnectionCompletionHandler completion) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_provideIdentityForConnectionCompletionHandler {
		@Generated
		void call_provideIdentityForConnectionCompletionHandler(SecIdentityRef arg0, NSArray<?> arg1);
	}

	/**
	 * shouldEvaluateTrustForConnection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionAuthenticationDelegateClassRef/index.html#//apple_ref/occ/intfm/NWTCPConnectionAuthenticationDelegate/shouldEvaluateTrustForConnection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("shouldEvaluateTrustForConnection:")
	default boolean shouldEvaluateTrustForConnection(NWTCPConnection connection) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * shouldProvideIdentityForConnection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkExtension/Reference/NWTCPConnectionAuthenticationDelegateClassRef/index.html#//apple_ref/occ/intfm/NWTCPConnectionAuthenticationDelegate/shouldProvideIdentityForConnection:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("shouldProvideIdentityForConnection:")
	default boolean shouldProvideIdentityForConnection(NWTCPConnection connection) {
		throw new java.lang.UnsupportedOperationException();
	}
}

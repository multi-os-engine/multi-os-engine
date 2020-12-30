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

package apple.networkextension.protocol;

import apple.foundation.NSArray;
import apple.networkextension.NWTCPConnection;
import apple.security.opaque.SecIdentityRef;
import apple.security.opaque.SecTrustRef;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] NWTCPConnectionAuthenticationDelegate
 * 
 * Allows the caller to take custom actions on some connection events.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NWTCPConnectionAuthenticationDelegate")
public interface NWTCPConnectionAuthenticationDelegate {
    /**
     * evaluateTrustForConnection:peerCertificateChain:completionHandler:
     * 
     * The caller can implement this optional protocol method to set up custom policies
     * 	for peer certificate trust evaluation. If the delegate method is implemented, the caller
     * 	is responsible for creating and setting up the SecTrustRef object and passing it to the
     * 	completion handler. Otherwise, the default trust evaluation policy is used for the connection.
     * 
     * @param connection The connection sending this message
     * @param peerCertificateChain The peer certificate chain
     * @param completion The completion handler for passing the SecTrustRef object to the connection.
     * 	The SecTrustRef object "trust" is required and must not be nil. It will be evaluated using
     * 	SecTrustEvaluate() if necessary. The caller is responsible for keeping the argument object
     * 	alive for the duration of the completion handler invocation.
     */
    @Generated
    @IsOptional
    @Selector("evaluateTrustForConnection:peerCertificateChain:completionHandler:")
    default void evaluateTrustForConnectionPeerCertificateChainCompletionHandler(NWTCPConnection connection,
            NSArray<?> peerCertificateChain,
            @ObjCBlock(name = "call_evaluateTrustForConnectionPeerCertificateChainCompletionHandler") Block_evaluateTrustForConnectionPeerCertificateChainCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * provideIdentityForConnection:completionHandler:
     * 
     * The caller can implement this optional protocol method to provide the identity
     * 	and an optional certificate chain to be used for authentication.
     * 
     * @param connection The connection sending this message
     * @param completion The completion handler for passing identity and certificate chain to the connection.
     * 	The "identity" argument is required and must not be nil. The "certificateChain" argument is optional,
     * 	and is an array of one or more SecCertificateRef objects. The certificate chain must contain objects
     * 	of type SecCertificateRef only. If the certificate chain is set, it will be used. Otherwise, the leaf
     * 	certificate will be extracted from the SecIdentityRef object and will be used for authentication.
     * 
     * 	The caller is responsible for keeping the argument object(s) alive for the duration of the
     * 	completion handler invocation.
     */
    @Generated
    @IsOptional
    @Selector("provideIdentityForConnection:completionHandler:")
    default void provideIdentityForConnectionCompletionHandler(NWTCPConnection connection,
            @ObjCBlock(name = "call_provideIdentityForConnectionCompletionHandler") Block_provideIdentityForConnectionCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldEvaluateTrustForConnection:
     * 
     * The caller can implement this optional protocol method to decide whether it
     * 	wants to take over the default trust evaluation for this connection. If this delegate method
     * 	is not implemented, the return value will default to YES if
     * 	provideIdentityForConnection:completionHandler: is implemented.
     * 
     * @param connection The connection sending this message
     * @return YES to take over the default trust evaluation, in which case, the delegate method
     * 	evaluateTrustForConnection:peerCertificateChain:completionHandler: will be called.
     */
    @Generated
    @IsOptional
    @Selector("shouldEvaluateTrustForConnection:")
    default boolean shouldEvaluateTrustForConnection(NWTCPConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * shouldProvideIdentityForConnection:
     * 
     * The caller can implement this optional protocol method to decide whether it
     * 	wants to provide the identity for this connection for authentication. If this delegate
     * 	method is not implemented, the return value will default to YES if
     * 	provideIdentityForConnection:completionHandler: is implemented.
     * 
     * @param connection The connection sending this message
     * @return YES to provide the identity for this connection, in which case, the delegate method
     * 	provideIdentityForConnection:completionHandler: will be called.
     */
    @Generated
    @IsOptional
    @Selector("shouldProvideIdentityForConnection:")
    default boolean shouldProvideIdentityForConnection(NWTCPConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evaluateTrustForConnectionPeerCertificateChainCompletionHandler {
        @Generated
        void call_evaluateTrustForConnectionPeerCertificateChainCompletionHandler(SecTrustRef trust);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_provideIdentityForConnectionCompletionHandler {
        @Generated
        void call_provideIdentityForConnectionCompletionHandler(SecIdentityRef identity, NSArray<?> certificateChain);
    }
}

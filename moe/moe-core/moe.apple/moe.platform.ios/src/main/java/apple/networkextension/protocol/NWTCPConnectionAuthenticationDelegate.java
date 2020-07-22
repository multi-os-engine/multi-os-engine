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

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NWTCPConnectionAuthenticationDelegate")
public interface NWTCPConnectionAuthenticationDelegate {
    @Generated
    @IsOptional
    @Selector("evaluateTrustForConnection:peerCertificateChain:completionHandler:")
    default void evaluateTrustForConnectionPeerCertificateChainCompletionHandler(NWTCPConnection connection,
            NSArray<?> peerCertificateChain,
            @ObjCBlock(name = "call_evaluateTrustForConnectionPeerCertificateChainCompletionHandler") Block_evaluateTrustForConnectionPeerCertificateChainCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("provideIdentityForConnection:completionHandler:")
    default void provideIdentityForConnectionCompletionHandler(NWTCPConnection connection,
            @ObjCBlock(name = "call_provideIdentityForConnectionCompletionHandler") Block_provideIdentityForConnectionCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("shouldEvaluateTrustForConnection:")
    default boolean shouldEvaluateTrustForConnection(NWTCPConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }

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

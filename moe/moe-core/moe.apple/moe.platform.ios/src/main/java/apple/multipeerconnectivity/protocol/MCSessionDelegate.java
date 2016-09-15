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

package apple.multipeerconnectivity.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSInputStream;
import apple.foundation.NSProgress;
import apple.foundation.NSURL;
import apple.multipeerconnectivity.MCPeerID;
import apple.multipeerconnectivity.MCSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCSessionDelegate")
public interface MCSessionDelegate {
    /**
     * session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:">iOS Dev Center</a>
     */
    @Generated
    @Selector("session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:")
    void sessionDidFinishReceivingResourceWithNameFromPeerAtURLWithError(MCSession session, String resourceName,
            MCPeerID peerID, NSURL localURL, NSError error);

    /**
     * session:didReceiveCertificate:fromPeer:certificateHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:didReceiveCertificate:fromPeer:certificateHandler:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveCertificate:fromPeer:certificateHandler:")
    default void sessionDidReceiveCertificateFromPeerCertificateHandler(MCSession session, NSArray<?> certificate,
            MCPeerID peerID,
            @ObjCBlock(name = "call_sessionDidReceiveCertificateFromPeerCertificateHandler") Block_sessionDidReceiveCertificateFromPeerCertificateHandler certificateHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionDidReceiveCertificateFromPeerCertificateHandler {
        @Generated
        void call_sessionDidReceiveCertificateFromPeerCertificateHandler(boolean arg0);
    }

    /**
     * session:didReceiveData:fromPeer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:didReceiveData:fromPeer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("session:didReceiveData:fromPeer:")
    void sessionDidReceiveDataFromPeer(MCSession session, NSData data, MCPeerID peerID);

    /**
     * session:didReceiveStream:withName:fromPeer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:didReceiveStream:withName:fromPeer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("session:didReceiveStream:withName:fromPeer:")
    void sessionDidReceiveStreamWithNameFromPeer(MCSession session, NSInputStream stream, String streamName,
            MCPeerID peerID);

    /**
     * session:didStartReceivingResourceWithName:fromPeer:withProgress:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:didStartReceivingResourceWithName:fromPeer:withProgress:">iOS Dev Center</a>
     */
    @Generated
    @Selector("session:didStartReceivingResourceWithName:fromPeer:withProgress:")
    void sessionDidStartReceivingResourceWithNameFromPeerWithProgress(MCSession session, String resourceName,
            MCPeerID peerID, NSProgress progress);

    /**
     * session:peer:didChangeState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionDelegateRef/index.html#//apple_ref/occ/intfm/MCSessionDelegate/session:peer:didChangeState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("session:peer:didChangeState:")
    void sessionPeerDidChangeState(MCSession session, MCPeerID peerID, @NInt long state);
}

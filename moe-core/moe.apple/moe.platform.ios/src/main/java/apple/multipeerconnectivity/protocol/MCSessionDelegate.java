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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Delegate methods for MCSession.
 */
@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCSessionDelegate")
public interface MCSessionDelegate {
    /**
     * Finished receiving a resource from remote peer and saved the content
     * in a temporary location - the app is responsible for moving the file
     * to a permanent location within its sandbox.
     */
    @Generated
    @Selector("session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:")
    void sessionDidFinishReceivingResourceWithNameFromPeerAtURLWithError(@NotNull MCSession session,
            @NotNull String resourceName, @NotNull MCPeerID peerID, @Nullable NSURL localURL, @Nullable NSError error);

    /**
     * Made first contact with peer and have identity information about the
     * remote peer (certificate may be nil).
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveCertificate:fromPeer:certificateHandler:")
    default void sessionDidReceiveCertificateFromPeerCertificateHandler(@NotNull MCSession session,
            @Nullable NSArray<?> certificate, @NotNull MCPeerID peerID,
            @NotNull @ObjCBlock(name = "call_sessionDidReceiveCertificateFromPeerCertificateHandler") Block_sessionDidReceiveCertificateFromPeerCertificateHandler certificateHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Received data from remote peer.
     */
    @Generated
    @Selector("session:didReceiveData:fromPeer:")
    void sessionDidReceiveDataFromPeer(@NotNull MCSession session, @NotNull NSData data, @NotNull MCPeerID peerID);

    /**
     * Received a byte stream from remote peer.
     */
    @Generated
    @Selector("session:didReceiveStream:withName:fromPeer:")
    void sessionDidReceiveStreamWithNameFromPeer(@NotNull MCSession session, @NotNull NSInputStream stream,
            @NotNull String streamName, @NotNull MCPeerID peerID);

    /**
     * Start receiving a resource from remote peer.
     */
    @Generated
    @Selector("session:didStartReceivingResourceWithName:fromPeer:withProgress:")
    void sessionDidStartReceivingResourceWithNameFromPeerWithProgress(@NotNull MCSession session,
            @NotNull String resourceName, @NotNull MCPeerID peerID, @NotNull NSProgress progress);

    /**
     * Remote peer changed state.
     */
    @Generated
    @Selector("session:peer:didChangeState:")
    void sessionPeerDidChangeState(@NotNull MCSession session, @NotNull MCPeerID peerID, @NInt long state);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionDidReceiveCertificateFromPeerCertificateHandler {
        @Generated
        void call_sessionDidReceiveCertificateFromPeerCertificateHandler(boolean accept);
    }
}

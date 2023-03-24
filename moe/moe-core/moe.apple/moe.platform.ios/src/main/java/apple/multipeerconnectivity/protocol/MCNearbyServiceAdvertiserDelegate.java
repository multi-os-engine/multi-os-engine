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

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.multipeerconnectivity.MCNearbyServiceAdvertiser;
import apple.multipeerconnectivity.MCPeerID;
import apple.multipeerconnectivity.MCSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCNearbyServiceAdvertiserDelegate")
public interface MCNearbyServiceAdvertiserDelegate {
    /**
     * Advertising did not start due to an error.
     */
    @Generated
    @IsOptional
    @Selector("advertiser:didNotStartAdvertisingPeer:")
    default void advertiserDidNotStartAdvertisingPeer(@NotNull MCNearbyServiceAdvertiser advertiser,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Incoming invitation request. Call the invitationHandler block with YES
     * and a valid session to connect the inviting peer to the session.
     */
    @Generated
    @Selector("advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:")
    void advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler(
            @NotNull MCNearbyServiceAdvertiser advertiser, @NotNull MCPeerID peerID, @Nullable NSData context,
            @NotNull @ObjCBlock(name = "call_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler") Block_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler invitationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler {
        @Generated
        void call_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler(boolean accept,
                @Nullable MCSession session);
    }
}

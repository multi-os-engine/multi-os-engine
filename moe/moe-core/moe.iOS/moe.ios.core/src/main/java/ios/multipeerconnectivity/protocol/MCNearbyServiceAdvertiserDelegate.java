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

package ios.multipeerconnectivity.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.multipeerconnectivity.MCNearbyServiceAdvertiser;
import ios.multipeerconnectivity.MCPeerID;
import ios.multipeerconnectivity.MCSession;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCNearbyServiceAdvertiserDelegate")
public interface MCNearbyServiceAdvertiserDelegate {
	/**
	 * advertiser:didNotStartAdvertisingPeer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCNearbyServiceAdvertiserDelegateProtocolRef/index.html#//apple_ref/occ/intfm/MCNearbyServiceAdvertiserDelegate/advertiser:didNotStartAdvertisingPeer:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("advertiser:didNotStartAdvertisingPeer:")
	default void advertiserDidNotStartAdvertisingPeer(
			MCNearbyServiceAdvertiser advertiser, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCNearbyServiceAdvertiserDelegateProtocolRef/index.html#//apple_ref/occ/intfm/MCNearbyServiceAdvertiserDelegate/advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:")
	void advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler(
			MCNearbyServiceAdvertiser advertiser,
			MCPeerID peerID,
			NSData context,
			@ObjCBlock(name = "call_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler") Block_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler invitationHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler {
		@Generated
		void call_advertiserDidReceiveInvitationFromPeerWithContextInvitationHandler(
				boolean arg0, MCSession arg1);
	}
}

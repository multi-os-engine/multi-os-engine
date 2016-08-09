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
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.multipeerconnectivity.MCNearbyServiceBrowser;
import ios.multipeerconnectivity.MCPeerID;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCNearbyServiceBrowserDelegate")
public interface MCNearbyServiceBrowserDelegate {
	/**
	 * browser:didNotStartBrowsingForPeers:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCNearbyServiceBrowserDelegateRef/index.html#//apple_ref/occ/intfm/MCNearbyServiceBrowserDelegate/browser:didNotStartBrowsingForPeers:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("browser:didNotStartBrowsingForPeers:")
	default void browserDidNotStartBrowsingForPeers(
			MCNearbyServiceBrowser browser, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * browser:foundPeer:withDiscoveryInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCNearbyServiceBrowserDelegateRef/index.html#//apple_ref/occ/intfm/MCNearbyServiceBrowserDelegate/browser:foundPeer:withDiscoveryInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("browser:foundPeer:withDiscoveryInfo:")
	void browserFoundPeerWithDiscoveryInfo(
			MCNearbyServiceBrowser browser, MCPeerID peerID, NSDictionary<String, String> info);

	/**
	 * browser:lostPeer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCNearbyServiceBrowserDelegateRef/index.html#//apple_ref/occ/intfm/MCNearbyServiceBrowserDelegate/browser:lostPeer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("browser:lostPeer:")
	void browserLostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID);
}

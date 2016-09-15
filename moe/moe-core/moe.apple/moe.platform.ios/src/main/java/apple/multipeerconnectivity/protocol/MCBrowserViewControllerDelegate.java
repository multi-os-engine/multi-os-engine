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

import apple.foundation.NSDictionary;
import apple.multipeerconnectivity.MCBrowserViewController;
import apple.multipeerconnectivity.MCPeerID;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MCBrowserViewControllerDelegate")
public interface MCBrowserViewControllerDelegate {
    /**
     * browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewControllerDelegate/index.html#//apple_ref/occ/intfm/MCBrowserViewControllerDelegate/browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:")
    default boolean browserViewControllerShouldPresentNearbyPeerWithDiscoveryInfo(
            MCBrowserViewController browserViewController, MCPeerID peerID, NSDictionary<String, String> info) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * browserViewControllerDidFinish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewControllerDelegate/index.html#//apple_ref/occ/intfm/MCBrowserViewControllerDelegate/browserViewControllerDidFinish:">iOS Dev Center</a>
     */
    @Generated
    @Selector("browserViewControllerDidFinish:")
    void browserViewControllerDidFinish(MCBrowserViewController browserViewController);

    /**
     * browserViewControllerWasCancelled:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewControllerDelegate/index.html#//apple_ref/occ/intfm/MCBrowserViewControllerDelegate/browserViewControllerWasCancelled:">iOS Dev Center</a>
     */
    @Generated
    @Selector("browserViewControllerWasCancelled:")
    void browserViewControllerWasCancelled(MCBrowserViewController browserViewController);
}

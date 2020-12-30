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
     * Notifies delegate that a peer was found; discoveryInfo can be used to
     * determine whether the peer should be presented to the user, and the
     * delegate should return a YES if the peer should be presented; this method
     * is optional, if not implemented every nearby peer will be presented to
     * the user.
     */
    @Generated
    @IsOptional
    @Selector("browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:")
    default boolean browserViewControllerShouldPresentNearbyPeerWithDiscoveryInfo(
            MCBrowserViewController browserViewController, MCPeerID peerID, NSDictionary<String, String> info) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate, when the user taps the done button.
     */
    @Generated
    @Selector("browserViewControllerDidFinish:")
    void browserViewControllerDidFinish(MCBrowserViewController browserViewController);

    /**
     * Notifies delegate that the user taps the cancel button.
     */
    @Generated
    @Selector("browserViewControllerWasCancelled:")
    void browserViewControllerWasCancelled(MCBrowserViewController browserViewController);
}

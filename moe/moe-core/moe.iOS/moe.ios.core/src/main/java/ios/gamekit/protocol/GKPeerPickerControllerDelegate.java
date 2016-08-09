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

package ios.gamekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.gamekit.GKPeerPickerController;
import ios.gamekit.GKSession;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKPeerPickerControllerDelegate")
public interface GKPeerPickerControllerDelegate {
	/**
	 * peerPickerController:didConnectPeer:toSession:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKPeerPickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKPeerPickerControllerDelegate/peerPickerController:didConnectPeer:toSession:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peerPickerController:didConnectPeer:toSession:")
	default void peerPickerControllerDidConnectPeerToSession(
			GKPeerPickerController picker, String peerID, GKSession session) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peerPickerController:didSelectConnectionType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKPeerPickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKPeerPickerControllerDelegate/peerPickerController:didSelectConnectionType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peerPickerController:didSelectConnectionType:")
	default void peerPickerControllerDidSelectConnectionType(
			GKPeerPickerController picker, @NUInt long type) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peerPickerController:sessionForConnectionType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKPeerPickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKPeerPickerControllerDelegate/peerPickerController:sessionForConnectionType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peerPickerController:sessionForConnectionType:")
	default GKSession peerPickerControllerSessionForConnectionType(
			GKPeerPickerController picker, @NUInt long type) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * peerPickerControllerDidCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKPeerPickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKPeerPickerControllerDelegate/peerPickerControllerDidCancel:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("peerPickerControllerDidCancel:")
	default void peerPickerControllerDidCancel(
			GKPeerPickerController picker) {
		throw new java.lang.UnsupportedOperationException();
	}
}

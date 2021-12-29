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

package apple.gamekit.protocol;

import apple.gamekit.GKPeerPickerController;
import apple.gamekit.GKSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * callbacks to the GKPeerPickerController delegate
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKPeerPickerControllerDelegate")
public interface GKPeerPickerControllerDelegate {
    /**
     * Notifies delegate that the peer was connected to a GKSession.
     */
    @Generated
    @IsOptional
    @Selector("peerPickerController:didConnectPeer:toSession:")
    default void peerPickerControllerDidConnectPeerToSession(GKPeerPickerController picker, String peerID,
            GKSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies delegate that a connection type was chosen by the user.
     */
    @Generated
    @IsOptional
    @Selector("peerPickerController:didSelectConnectionType:")
    default void peerPickerControllerDidSelectConnectionType(GKPeerPickerController picker, @NUInt long type) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies delegate that the connection type is requesting a GKSession object.
     * <p>
     * You should return a valid GKSession object for use by the picker. If this method is not implemented or returns 'nil', a default GKSession is created on the delegate's behalf.
     */
    @Generated
    @IsOptional
    @Selector("peerPickerController:sessionForConnectionType:")
    default GKSession peerPickerControllerSessionForConnectionType(GKPeerPickerController picker, @NUInt long type) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies delegate that the user cancelled the picker.
     */
    @Generated
    @IsOptional
    @Selector("peerPickerControllerDidCancel:")
    default void peerPickerControllerDidCancel(GKPeerPickerController picker) {
        throw new java.lang.UnsupportedOperationException();
    }
}

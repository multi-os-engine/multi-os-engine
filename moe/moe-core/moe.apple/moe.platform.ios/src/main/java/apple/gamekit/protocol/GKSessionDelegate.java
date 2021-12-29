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

import apple.foundation.NSError;
import apple.gamekit.GKSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Callbacks to the GKSession delegate.
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKSessionDelegate")
public interface GKSessionDelegate {
    /**
     * Indicates a connection error occurred with a peer, which includes connection request failures, or disconnects due to timeouts.
     */
    @Generated
    @IsOptional
    @Selector("session:connectionWithPeerFailed:withError:")
    default void sessionConnectionWithPeerFailedWithError(GKSession session, String peerID, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates an error occurred with the session such as failing to make available.
     */
    @Generated
    @IsOptional
    @Selector("session:didFailWithError:")
    default void sessionDidFailWithError(GKSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates a connection request was received from another peer.
     * <p>
     * Accept by calling -acceptConnectionFromPeer:
     * Deny by calling -denyConnectionFromPeer:
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveConnectionRequestFromPeer:")
    default void sessionDidReceiveConnectionRequestFromPeer(GKSession session, String peerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:peer:didChangeState:")
    default void sessionPeerDidChangeState(GKSession session, String peerID, int state) {
        throw new java.lang.UnsupportedOperationException();
    }
}

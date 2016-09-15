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

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKSessionDelegate")
public interface GKSessionDelegate {
    /**
     * session:connectionWithPeerFailed:withError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSessionDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKSessionDelegate/session:connectionWithPeerFailed:withError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("session:connectionWithPeerFailed:withError:")
    default void sessionConnectionWithPeerFailedWithError(GKSession session, String peerID, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * session:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSessionDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKSessionDelegate/session:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("session:didFailWithError:")
    default void sessionDidFailWithError(GKSession session, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * session:didReceiveConnectionRequestFromPeer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSessionDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKSessionDelegate/session:didReceiveConnectionRequestFromPeer:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveConnectionRequestFromPeer:")
    default void sessionDidReceiveConnectionRequestFromPeer(GKSession session, String peerID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * session:peer:didChangeState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKSessionDelegate_Protocol/index.html#//apple_ref/occ/intfm/GKSessionDelegate/session:peer:didChangeState:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("session:peer:didChangeState:")
    default void sessionPeerDidChangeState(GKSession session, String peerID, int state) {
        throw new java.lang.UnsupportedOperationException();
    }
}

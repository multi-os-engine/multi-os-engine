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

package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Specifies how GKSession behaves when it is made available.
 */
@Deprecated
@Generated
public final class GKSessionMode {
    @Deprecated @Generated public static final int Server = 0x00000000;
    /**
     * delegate will get -didReceiveConnectionRequestFromPeer callback when a client wants to connect
     */
    @Deprecated @Generated public static final int Client = 0x00000001;
    /**
     * delegate will get -session:peer:didChangeState: callback with GKPeerStateAvailable, or GKPeerStateUnavailable for
     * discovered servers
     */
    @Deprecated @Generated public static final int Peer = 0x00000002;

    @Generated
    private GKSessionMode() {
    }
}

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
 * Specifies the type of peers to return in method -peersWithConnectionState:
 */
@Generated
public final class GKPeerConnectionState {
    @Generated public static final int Available = 0x00000000;
    /**
     * not connected to session, but available for connectToPeer:withTimeout:
     */
    @Generated public static final int Unavailable = 0x00000001;
    /**
     * no longer available
     */
    @Generated public static final int Connected = 0x00000002;
    /**
     * connected to the session
     */
    @Generated public static final int Disconnected = 0x00000003;
    /**
     * disconnected from the session
     */
    @Generated public static final int Connecting = 0x00000004;

    @Generated
    private GKPeerConnectionState() {
    }

    /**
     * waiting for accept, or deny response
     */
    @Generated public static final int ConnectedRelay = 0x00000005;
}

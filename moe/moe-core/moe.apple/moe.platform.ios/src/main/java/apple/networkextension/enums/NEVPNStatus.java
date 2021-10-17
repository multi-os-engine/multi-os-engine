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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEVPNStatus
 * <p>
 * VPN status codes
 */
@Generated
public final class NEVPNStatus {
    /**
     * [@const] NEVPNStatusInvalid The VPN is not configured.
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * [@const] NEVPNStatusDisconnected The VPN is disconnected.
     */
    @Generated @NInt public static final long Disconnected = 0x0000000000000001L;
    /**
     * [@const] NEVPNStatusConnecting The VPN is connecting.
     */
    @Generated @NInt public static final long Connecting = 0x0000000000000002L;
    /**
     * [@const] NEVPNStatusConnected The VPN is connected.
     */
    @Generated @NInt public static final long Connected = 0x0000000000000003L;
    /**
     * [@const] NEVPNStatusReasserting The VPN is reconnecting following loss of underlying network connectivity.
     */
    @Generated @NInt public static final long Reasserting = 0x0000000000000004L;
    /**
     * [@const] NEVPNStatusDisconnecting The VPN is disconnecting.
     */
    @Generated @NInt public static final long Disconnecting = 0x0000000000000005L;

    @Generated
    private NEVPNStatus() {
    }
}

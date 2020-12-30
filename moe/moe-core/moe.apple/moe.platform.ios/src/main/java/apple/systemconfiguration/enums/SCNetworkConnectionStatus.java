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

package apple.systemconfiguration.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum SCNetworkConnectionStatus
 * @discussion Status of the network connection.
 * 	This status is intended to be generic and high level.
 * 	An extended status, specific to the type of network
 * 	connection is also available for applications that
 * 	need additonal information.
 * @constant kSCNetworkConnectionInvalid
 * 	The network connection refers to an invalid service.
 * @constant kSCNetworkConnectionDisconnected
 * 	The network connection is disconnected.
 * @constant kSCNetworkConnectionConnecting
 * 	The network connection is connecting.
 * @constant kSCNetworkConnectionConnected
 * 	The network connection is connected.
 * @constant kSCNetworkConnectionDisconnecting
 * 	The network connection is disconnecting.
 */
@Generated
public final class SCNetworkConnectionStatus {
    @Generated public static final int Invalid = 0xFFFFFFFF;
    @Generated public static final int Disconnected = 0x00000000;
    @Generated public static final int Connecting = 0x00000001;
    @Generated public static final int Connected = 0x00000002;
    @Generated public static final int Disconnecting = 0x00000003;

    @Generated
    private SCNetworkConnectionStatus() {
    }
}

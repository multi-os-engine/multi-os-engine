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
 * @typedef NWTCPConnectionState
 * @abstract Defined connection states. New types may be defined in the future.
 */
@Generated
public final class NWTCPConnectionState {
    /**
     * @constant NWTCPConnectionStateInvalid The connection is in an invalid or uninitialized state
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * @constant NWTCPConnectionStateConnecting The connection is attempting
     */
    @Generated @NInt public static final long Connecting = 0x0000000000000001L;
    /**
     * @constant NWTCPConnectionStateWaiting The connection has attempted but failed. It is now
     * waiting for better condition(s) before trying again.
     */
    @Generated @NInt public static final long Waiting = 0x0000000000000002L;
    /**
     * @constant NWTCPConnectionStateConnected The connection is established. It is now possible
     * to transfer data. If TLS is in use, the TLS handshake would have finished when the connection
     * is in this state.
     */
    @Generated @NInt public static final long Connected = 0x0000000000000003L;
    /**
     * @constant NWTCPConnectionStateDisconnected The connection is disconnected. It is no longer
     * possible to transfer data. The application should call cancellation method to clean up resources
     * when the connection is in this state.
     */
    @Generated @NInt public static final long Disconnected = 0x0000000000000004L;
    /**
     * @constant NWTCPConnectionStateCancelled The connection is cancelled. This is triggered by
     * the cancellation method.
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000005L;

    @Generated
    private NWTCPConnectionState() {
    }
}

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
 * [@typedef] NWUDPSessionState
 * 
 * UDP session state values
 */
@Generated
public final class NWUDPSessionState {
    /**
     * [@constant] NWUDPSessionStateInvalid The session is in an invalid or uninitialized state.
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * [@constant] NWUDPSessionStateWaiting The session is waiting for better conditions before
     * attempting to make the session ready.
     */
    @Generated @NInt public static final long Waiting = 0x0000000000000001L;
    /**
     * [@constant] NWUDPSessionStatePreparing The endpoint is being resolved
     */
    @Generated @NInt public static final long Preparing = 0x0000000000000002L;
    /**
     * [@constant] NWUDPSessionStateReady The session is ready for reading and writing data
     */
    @Generated @NInt public static final long Ready = 0x0000000000000003L;
    /**
     * [@constant] NWUDPSessionStateFailed None of the currently resolved endpoints can be used
     * at this time, either due to problems with the path or the client rejecting the
     * endpoints.
     */
    @Generated @NInt public static final long Failed = 0x0000000000000004L;
    /**
     * [@constant] NWUDPSessionStateCancelled The session has been cancelled by the client
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000005L;

    @Generated
    private NWUDPSessionState() {
    }
}

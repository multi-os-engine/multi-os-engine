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
 * [@typedef] NEVPNIKEv2DeadPeerDetectionRate
 * 
 * IKEv2 Dead Peer Detection Rates
 * 
 * API-Since: 8.0
 */
@Generated
public final class NEVPNIKEv2DeadPeerDetectionRate {
    /**
     * [@const] NEVPNIKEv2DeadPeerDetectionRateNone Do not perform dead peer detection
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * [@const] NEVPNIKEv2DeadPeerDetectionRateLow Run dead peer detection once every 30 minutes. If the peer does not
     * respond, retry 5 times at 1 second intervals before declaring the peer dead
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Low = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEv2DeadPeerDetectionRateMedium Run dead peer detection once every 10 minutes. If the peer does
     * not respond, retry 5 times at 1 second intervals before declaring the peer dead
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * [@const] NEVPNIKEv2DeadPeerDetectionRateHigh Run dead peer detection once every 1 minute. If the peer does not
     * respond, retry 5 times at 1 second intervals before declaring the peer dead
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long High = 0x0000000000000003L;

    @Generated
    private NEVPNIKEv2DeadPeerDetectionRate() {
    }
}

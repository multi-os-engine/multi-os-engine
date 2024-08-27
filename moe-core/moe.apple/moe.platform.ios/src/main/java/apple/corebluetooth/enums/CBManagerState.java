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

package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CBManagerState
 * 
 * Represents the current state of a CBManager.
 * 
 * [@constant] CBManagerStateUnknown State unknown, update imminent.
 * [@constant] CBManagerStateResetting The connection with the system service was momentarily lost, update imminent.
 * [@constant] CBManagerStateUnsupported The platform doesn't support the Bluetooth Low Energy Central/Client role.
 * [@constant] CBManagerStateUnauthorized The application is not authorized to use the Bluetooth Low Energy role.
 * [@constant] CBManagerStatePoweredOff Bluetooth is currently powered off.
 * [@constant] CBManagerStatePoweredOn Bluetooth is currently powered on and available to use.
 * 
 * @see authorization
 * 
 *      API-Since: 10.0
 */
@Generated
public final class CBManagerState {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Resetting = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unauthorized = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PoweredOff = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PoweredOn = 0x0000000000000005L;

    @Generated
    private CBManagerState() {
    }
}

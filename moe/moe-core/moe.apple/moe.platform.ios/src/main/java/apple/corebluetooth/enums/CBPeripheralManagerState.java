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
 * [@enum] CBPeripheralManagerState
 * <p>
 * Represents the current state of a CBPeripheralManager.
 * <p>
 * [@constant] CBPeripheralManagerStateUnknown       State unknown, update imminent.
 * [@constant] CBPeripheralManagerStateResetting     The connection with the system service was momentarily lost, update imminent.
 * [@constant] CBPeripheralManagerStateUnsupported   The platform doesn't support the Bluetooth Low Energy Peripheral/Server role.
 * [@constant] CBPeripheralManagerStateUnauthorized  The application is not authorized to use the Bluetooth Low Energy Peripheral/Server role.
 * [@constant] CBPeripheralManagerStatePoweredOff    Bluetooth is currently powered off.
 * [@constant] CBPeripheralManagerStatePoweredOn     Bluetooth is currently powered on and available to use.
 */
@Generated
public final class CBPeripheralManagerState {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Resetting = 0x0000000000000001L;
    @Generated @NInt public static final long Unsupported = 0x0000000000000002L;
    @Generated @NInt public static final long Unauthorized = 0x0000000000000003L;
    @Generated @NInt public static final long PoweredOff = 0x0000000000000004L;
    @Generated @NInt public static final long PoweredOn = 0x0000000000000005L;

    @Generated
    private CBPeripheralManagerState() {
    }
}

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
 * [@enum] CBPeripheralManagerConnectionLatency
 * <p>
 * The latency of a peripheral-central connection controls how frequently messages can be exchanged.
 * <p>
 * [@constant] CBPeripheralManagerConnectionLatencyLow       Prioritizes rapid communication over battery life.
 * [@constant] CBPeripheralManagerConnectionLatencyMedium    A balance between communication frequency and battery life.
 * [@constant] CBPeripheralManagerConnectionLatencyHigh      Prioritizes extending battery life over rapid communication.
 */
@Generated
public final class CBPeripheralManagerConnectionLatency {
    @Generated @NInt public static final long Low = 0x0000000000000000L;
    @Generated @NInt public static final long Medium = 0x0000000000000001L;
    @Generated @NInt public static final long High = 0x0000000000000002L;

    @Generated
    private CBPeripheralManagerConnectionLatency() {
    }
}

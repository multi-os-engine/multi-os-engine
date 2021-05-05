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

package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueDoorState
 * 
 * [@constant]  HMCharacteristicValueDoorStateOpen     The door is fully open.
 * [@constant]  HMCharacteristicValueDoorStateClosed   The door is fully closed.
 * [@constant]  HMCharacteristicValueDoorStateOpening  The door is actively opening.
 * [@constant]  HMCharacteristicValueDoorStateClosing  The door is actively closing.
 * [@constant]  HMCharacteristicValueDoorStateStopped  The door is not moving, and it is not fully open nor fully closed.
 */
@Generated
public final class HMCharacteristicValueDoorState {
    @Generated @NInt public static final long Open = 0x0000000000000000L;
    @Generated @NInt public static final long Closed = 0x0000000000000001L;
    @Generated @NInt public static final long Opening = 0x0000000000000002L;
    @Generated @NInt public static final long Closing = 0x0000000000000003L;
    @Generated @NInt public static final long Stopped = 0x0000000000000004L;

    @Generated
    private HMCharacteristicValueDoorState() {
    }
}

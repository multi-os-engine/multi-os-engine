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
 * [@enum] HMCharacteristicValueHeatingCooling
 * 
 * [@constant] HMCharacteristicValueHeatingCoolingOff Off.
 * [@constant] HMCharacteristicValueHeatingCoolingHeat If the current temperature is below the target temperature then
 * turn on heating.
 * [@constant] HMCharacteristicValueHeatingCoolingCool If the current temperature is above the target temperature then
 * turn on cooling.
 * [@constant] HMCharacteristicValueHeatingCoolingAuto Turn on heating or cooling to maintain temperature within the
 * heating and cooling threshold of the target temperature.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HMCharacteristicValueHeatingCooling {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Heat = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Cool = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Auto = 0x0000000000000003L;

    @Generated
    private HMCharacteristicValueHeatingCooling() {
    }
}

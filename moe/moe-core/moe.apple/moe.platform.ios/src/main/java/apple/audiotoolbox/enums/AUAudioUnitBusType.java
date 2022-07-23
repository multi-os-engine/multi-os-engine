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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AUAudioUnitBusType
 * <p>
 * Describes whether a bus array is for input or output.
 */
@Generated
public final class AUAudioUnitBusType {
    @Generated @NInt public static final long Input = 0x0000000000000001L;
    @Generated @NInt public static final long Output = 0x0000000000000002L;

    @Generated
    private AUAudioUnitBusType() {
    }
}

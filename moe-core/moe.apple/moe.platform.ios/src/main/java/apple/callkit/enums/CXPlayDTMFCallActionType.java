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

package apple.callkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class CXPlayDTMFCallActionType {
    /**
     * The user tapped a digit on the in-call keypad
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long SingleTone = 0x0000000000000001L;
    /**
     * The user included digits after a soft pause in their dial string
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long SoftPause = 0x0000000000000002L;
    /**
     * The user included digits after a hard pause in their dial string
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long HardPause = 0x0000000000000003L;

    @Generated
    private CXPlayDTMFCallActionType() {
    }
}

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
 * [@typedef] NEHotspotHelperConfidence
 * 
 *   The HotspotHelper's confidence in its ability to handle the network.
 * 
 *   The HotspotHelper indicates its confidence in being able to handle the
 *   given hotspot network.
 * [@const] kNEHotspotHelperConfidenceNone The helper is unable to handle
 *   the network.
 * [@const] kNEHotspotHelperConfidenceLow The helper has some confidence
 *   in being able to handle the network.
 * [@const] kNEHotspotHelperConfidenceHigh The helper has high confidence
 *   in being able to handle the network.
 */
@Generated
public final class NEHotspotHelperConfidence {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Low = 0x0000000000000001L;
    @Generated @NInt public static final long High = 0x0000000000000002L;

    @Generated
    private NEHotspotHelperConfidence() {
    }
}

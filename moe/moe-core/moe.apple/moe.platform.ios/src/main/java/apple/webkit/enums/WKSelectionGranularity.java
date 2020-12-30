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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKSelectionGranularity
 * 
 * The granularity with which a selection can be created and modified interactively.
 * [@constant] WKSelectionGranularityDynamic    Selection granularity varies automatically based on the selection.
 * [@constant] WKSelectionGranularityCharacter  Selection endpoints can be placed at any character boundary.
 * 
 * An example of how granularity may vary when WKSelectionGranularityDynamic is used is
 * that when the selection is within a single block, the granularity may be single character, and when
 * the selection is not confined to a single block, the selection granularity may be single block.
 */
@Generated
public final class WKSelectionGranularity {
    @Generated @NInt public static final long Dynamic = 0x0000000000000000L;
    @Generated @NInt public static final long Character = 0x0000000000000001L;

    @Generated
    private WKSelectionGranularity() {
    }
}

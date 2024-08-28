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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class MTLStepFunction {
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Constant = 0x0000000000000000L;
    /**
     * vertex functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long PerVertex = 0x0000000000000001L;
    /**
     * vertex functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long PerInstance = 0x0000000000000002L;
    /**
     * vertex functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long PerPatch = 0x0000000000000003L;
    /**
     * vertex functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long PerPatchControlPoint = 0x0000000000000004L;
    /**
     * compute functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ThreadPositionInGridX = 0x0000000000000005L;
    /**
     * compute functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ThreadPositionInGridY = 0x0000000000000006L;
    /**
     * compute functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ThreadPositionInGridXIndexed = 0x0000000000000007L;
    /**
     * compute functions only
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ThreadPositionInGridYIndexed = 0x0000000000000008L;

    @Generated
    private MTLStepFunction() {
    }
}

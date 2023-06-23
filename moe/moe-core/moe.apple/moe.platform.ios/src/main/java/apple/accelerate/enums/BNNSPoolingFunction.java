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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class BNNSPoolingFunction {
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSPoolingFunctionMax = 0x00000000;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated public static final int BNNSPoolingFunctionAverage = 0x00000001;

    @Generated
    private BNNSPoolingFunction() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSPoolingFunctionAverageCountIncludePadding = 0x00000001;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSPoolingFunctionAverageCountExcludePadding = 0x00000002;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSPoolingFunctionUnMax = 0x00000003;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSPoolingFunctionL2Norm = 0x00000004;
}

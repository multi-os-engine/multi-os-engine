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
public final class BNNSActivationFunction {
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionIdentity = 0x00000000;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionRectifiedLinear = 0x00000001;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionLeakyRectifiedLinear = 0x00000002;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionSigmoid = 0x00000003;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionTanh = 0x00000004;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionScaledTanh = 0x00000005;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int BNNSActivationFunctionAbs = 0x00000006;

    @Generated
    private BNNSActivationFunction() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated public static final int BNNSActivationFunctionLinear = 0x00000007;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int BNNSActivationFunctionClamp = 0x00000008;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int BNNSActivationFunctionIntegerLinearSaturate = 0x00000009;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int BNNSActivationFunctionIntegerLinearSaturatePerChannel = 0x0000000A;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int BNNSActivationFunctionSoftmax = 0x0000000B;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionGELUApproximation = 0x0000000C;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionGumbel = 0x0000000D;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionGumbelMax = 0x0000000E;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionHardSigmoid = 0x0000000F;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionSoftplus = 0x00000010;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionSoftsign = 0x00000011;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionELU = 0x00000012;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionClampedLeakyRectifiedLinear = 0x00000013;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionLinearWithBias = 0x00000014;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionLogSoftmax = 0x00000015;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionLogSigmoid = 0x00000016;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionSELU = 0x00000017;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionCELU = 0x00000018;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionHardShrink = 0x00000019;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionSoftShrink = 0x0000001A;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionTanhShrink = 0x0000001B;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionThreshold = 0x0000001C;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionPReLUPerChannel = 0x0000001D;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int BNNSActivationFunctionGELUApproximation2 = 0x0000001E;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int BNNSActivationFunctionHardSwish = 0x0000001E;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int BNNSActivationFunctionSiLU = 0x0000001F;
}

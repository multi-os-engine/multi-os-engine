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
    @Generated
    private BNNSActivationFunction() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated public static final int Identity = 0x00000000;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int RectifiedLinear = 0x00000001;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int LeakyRectifiedLinear = 0x00000002;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int Sigmoid = 0x00000003;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int Tanh = 0x00000004;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int ScaledTanh = 0x00000005;
    /**
     * API-Since: 10.0
     */
    @Generated public static final int Abs = 0x00000006;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Linear = 0x00000007;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Clamp = 0x00000008;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int IntegerLinearSaturate = 0x00000009;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int IntegerLinearSaturatePerChannel = 0x0000000A;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Softmax = 0x0000000B;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int GELUApproximation = 0x0000000C;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Gumbel = 0x0000000D;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int GumbelMax = 0x0000000E;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int HardSigmoid = 0x0000000F;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Softplus = 0x00000010;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Softsign = 0x00000011;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int ELU = 0x00000012;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int ClampedLeakyRectifiedLinear = 0x00000013;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int LinearWithBias = 0x00000014;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int LogSoftmax = 0x00000015;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int LogSigmoid = 0x00000016;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int SELU = 0x00000017;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int CELU = 0x00000018;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int HardShrink = 0x00000019;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int SoftShrink = 0x0000001A;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int TanhShrink = 0x0000001B;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Threshold = 0x0000001C;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int PReLUPerChannel = 0x0000001D;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int GELUApproximation2 = 0x0000001E;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int HardSwish = 0x0000001E;
    /**
     * API-Since: 15.0
     */
    @Generated public static final int SiLU = 0x0000001F;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int ReLU6 = 0x00000020;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int Erf = 0x00000021;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int GELU = 0x00000022;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int GELUApproximationSigmoid = 0x00000023;
}

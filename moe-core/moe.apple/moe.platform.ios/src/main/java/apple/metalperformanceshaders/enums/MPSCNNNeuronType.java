package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNNeuronType {
    @Generated
    private MPSCNNNeuronType() {
    }

    /**
     * < f(x) = x
     * 
     * API-Since: 11.0
     */
    @Generated public static final int None = 0x00000000;
    /**
     * < f(x) = x >= 0 ? x : a * x; rectified linear unit
     * 
     * API-Since: 11.0
     */
    @Generated public static final int ReLU = 0x00000001;
    /**
     * < f(x) = a * x + b
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Linear = 0x00000002;
    /**
     * < f(x) = 1 / (1 + e^-x)
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Sigmoid = 0x00000003;
    /**
     * < f(x) = clamp((x * a) + b, 0, 1)
     * 
     * API-Since: 11.0
     */
    @Generated public static final int HardSigmoid = 0x00000004;
    /**
     * < f(x) = a * tanh(b * x)
     * 
     * API-Since: 11.0
     */
    @Generated public static final int TanH = 0x00000005;
    /**
     * < f(x) = fabs(x)
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Absolute = 0x00000006;
    /**
     * < f(x) = a * log(1 + e^(b * x))
     * 
     * API-Since: 11.0
     */
    @Generated public static final int SoftPlus = 0x00000007;
    /**
     * < f(x) = x / (1 + abs(x))
     * 
     * API-Since: 11.0
     */
    @Generated public static final int SoftSign = 0x00000008;
    /**
     * < f(x) = x >= 0 ? x : a * (exp(x) - 1); exponential linear unit
     * 
     * API-Since: 11.0
     */
    @Generated public static final int ELU = 0x00000009;
    /**
     * < Same as ReLU except parameter a is per channel; parameterized rectified linear unit
     * 
     * API-Since: 11.0
     */
    @Generated public static final int PReLU = 0x0000000A;
    /**
     * < f(x) = min((x >= 0 ? x : a * x), b); clamped rectified liniear unit
     * 
     * API-Since: 11.0
     */
    @Generated public static final int ReLUN = 0x0000000B;
    /**
     * < holds the number of MPSCNNNeuronTypes
     * 
     * API-Since: 11.0
     */
    @Generated public static final int Count = 0x00000010;
    /**
     * < f(x) = (a * x + b) ^ c
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Power = 0x0000000C;
    /**
     * < f(x) = c ^ (a * x + b)
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Exponential = 0x0000000D;
    /**
     * < f(x) = log_c(a * x + b)
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Logarithm = 0x0000000E;
    /**
     * < f(x) = (1.0 + erf(x * sqrt(0.5))) * 0.5 * x
     * 
     * API-Since: 13.0
     */
    @Generated public static final int GeLU = 0x0000000F;
}
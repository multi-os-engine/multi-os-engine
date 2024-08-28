package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCActivationType
 * 
 * An activation type that you specify for an activation descriptor.
 */
@Generated
public final class MLCActivationType {
    @Generated
    private MLCActivationType() {
    }

    /**
     * The identity activation type.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * The ReLU activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x >= 0 ? x : a * x
     * \endcode
     */
    @Generated public static final int ReLU = 0x00000001;
    /**
     * The linear activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = a * x + b
     * \endcode
     */
    @Generated public static final int Linear = 0x00000002;
    /**
     * The sigmoid activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = 1 / (1 + e⁻ˣ)
     * \endcode
     */
    @Generated public static final int Sigmoid = 0x00000003;
    /**
     * The hard sigmoid activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = clamp((x * a) + b, 0, 1)
     * \endcode
     */
    @Generated public static final int HardSigmoid = 0x00000004;
    /**
     * The hyperbolic tangent (TanH) activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = a * tanh(b * x)
     * \endcode
     */
    @Generated public static final int Tanh = 0x00000005;
    /**
     * The absolute activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = fabs(x)
     * \endcode
     */
    @Generated public static final int Absolute = 0x00000006;
    /**
     * The parametric soft plus activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = a * log(1 + e^(b * x))
     * \endcode
     */
    @Generated public static final int SoftPlus = 0x00000007;
    /**
     * The parametric soft sign activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x / (1 + abs(x))
     * \endcod
     */
    @Generated public static final int SoftSign = 0x00000008;
    /**
     * The parametric ELU activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x >= 0 ? x : a * (exp(x) - 1)
     * \endcode
     */
    @Generated public static final int ELU = 0x00000009;
    /**
     * The ReLUN activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = min((x >= 0 ? x : a * x), b)
     * \endcode
     */
    @Generated public static final int ReLUN = 0x0000000A;
    /**
     * The log sigmoid activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = log(1 / (1 + exp(-x)))
     * \endcode
     */
    @Generated public static final int LogSigmoid = 0x0000000B;
    /**
     * The SELU activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = scale * (max(0, x) + min(0, α * (exp(x) − 1)))
     * \endcode
     * where:
     * \code
     * α = 1.6732632423543772848170429916717
     * scale = 1.0507009873554804934193349852946
     * \endcode
     */
    @Generated public static final int SELU = 0x0000000C;
    /**
     * The CELU activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = max(0, x) + min(0, a * (exp(x / a) − 1))
     * \endcode
     */
    @Generated public static final int CELU = 0x0000000D;
    /**
     * The hard shrink activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x, if x > a or x < −a, else 0
     * \endcode
     */
    @Generated public static final int HardShrink = 0x0000000E;
    /**
     * The soft shrink activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x - a, if x > a, x + a, if x < −a, else 0
     * \endcode
     */
    @Generated public static final int SoftShrink = 0x0000000F;
    /**
     * The hyperbolic tangent (TanH) shrink activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x - tanh(x)
     * \endcode
     */
    @Generated public static final int TanhShrink = 0x00000010;
    /**
     * The threshold activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x, if x > a, else b
     * \endcode
     */
    @Generated public static final int Threshold = 0x00000011;
    /**
     * The GELU activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = x * CDF(x)
     * \endcode
     */
    @Generated public static final int GELU = 0x00000012;
    /**
     * The hardswish activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = 0, if x <= -3
     * f(x) = x, if x >= +3
     * f(x) = x * (x + 3)/6, otherwise
     * \endcode
     * 
     * API-Since: 14.5
     */
    @Generated public static final int HardSwish = 0x00000013;
    /**
     * The clamp activation type.
     * 
     * This activation type implements the following function:
     * \code
     * f(x) = min(max(x, a), b)
     * \endcode
     * 
     * API-Since: 14.5
     */
    @Generated public static final int Clamp = 0x00000014;
    /**
     * Must be last
     */
    @Generated public static final int Count = 0x00000015;
}

package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCArithmeticOperation
 * <p>
 * The list of supported arithmetic operations.
 */
@Generated
public final class MLCArithmeticOperation {
    @Generated
    private MLCArithmeticOperation() {
    }

    /**
     * An operation that calculates the elementwise sum of its two inputs.
     */
    @Generated public static final int Add = 0x00000000;
    /**
     * An operation that calculates the elementwise difference of its two inputs.
     */
    @Generated public static final int Subtract = 0x00000001;
    /**
     * An operation that calculates the elementwise product of its two inputs.
     */
    @Generated public static final int Multiply = 0x00000002;
    /**
     * An operation that calculates the elementwise division of its two inputs.
     */
    @Generated public static final int Divide = 0x00000003;
    /**
     * An operation that calculates the elementwise floor of its two inputs.
     */
    @Generated public static final int Floor = 0x00000004;
    /**
     * An operation that calculates the elementwise round of its inputs.
     */
    @Generated public static final int Round = 0x00000005;
    /**
     * An operation that calculates the elementwise ceiling of its inputs.
     */
    @Generated public static final int Ceil = 0x00000006;
    /**
     * An operation that calculates the elementwise square root of its inputs.
     */
    @Generated public static final int Sqrt = 0x00000007;
    /**
     * An operation that calculates the elementwise reciprocal of the square root of its inputs.
     */
    @Generated public static final int Rsqrt = 0x00000008;
    /**
     * An operation that calculates the elementwise sine of its inputs.
     */
    @Generated public static final int Sin = 0x00000009;
    /**
     * An operation that calculates the elementwise cosine of its inputs.
     */
    @Generated public static final int Cos = 0x0000000A;
    /**
     * An operation that calculates the elementwise tangent of its inputs.
     */
    @Generated public static final int Tan = 0x0000000B;
    /**
     * An operation that calculates the elementwise inverse sine of its inputs.
     */
    @Generated public static final int Asin = 0x0000000C;
    /**
     * An operation that calculates the elementwise inverse cosine of its inputs.
     */
    @Generated public static final int Acos = 0x0000000D;
    /**
     * An operation that calculates the elementwise inverse tangent of its inputs.
     */
    @Generated public static final int Atan = 0x0000000E;
    /**
     * An operation that calculates the elementwise hyperbolic sine of its inputs.
     */
    @Generated public static final int Sinh = 0x0000000F;
    /**
     * An operation that calculates the elementwise hyperbolic cosine of its inputs.
     */
    @Generated public static final int Cosh = 0x00000010;
    /**
     * An operation that calculates the elementwise hyperbolic tangent of its inputs.
     */
    @Generated public static final int Tanh = 0x00000011;
    /**
     * An operation that calculates the elementwise inverse hyperbolic sine of its inputs.
     */
    @Generated public static final int Asinh = 0x00000012;
    /**
     * An operation that calculates the elementwise inverse hyperbolic cosine of its inputs.
     */
    @Generated public static final int Acosh = 0x00000013;
    /**
     * An operation that calculates the elementwise inverse hyperbolic tangent of its inputs.
     */
    @Generated public static final int Atanh = 0x00000014;
    /**
     * An operation that calculates the elementwise first input raised to the power of its second input.
     */
    @Generated public static final int Pow = 0x00000015;
    /**
     * An operation that calculates the elementwise result of e raised to the power of its input.
     */
    @Generated public static final int Exp = 0x00000016;
    /**
     * An operation that calculates the elementwise result of 2 raised to the power of its input.
     */
    @Generated public static final int Exp2 = 0x00000017;
    /**
     * An operation that calculates the elementwise natural logarithm of its input.
     */
    @Generated public static final int Log = 0x00000018;
    /**
     * An operation that calculates the elementwise base 2 logarithm of its input.
     */
    @Generated public static final int Log2 = 0x00000019;
    /**
     * An operation that calculates the elementwise product of its two inputs. Returns 0 if y in x * y is zero, even if
     * x is NaN or INF
     */
    @Generated public static final int MultiplyNoNaN = 0x0000001A;
    /**
     * An operations that calculates the elementwise division of its two inputs. Returns 0 if the denominator is 0.
     */
    @Generated public static final int DivideNoNaN = 0x0000001B;
    /**
     * An operation that calculates the elementwise min of two inputs.
     */
    @Generated public static final int Min = 0x0000001C;
    /**
     * An operations that calculates the elementwise max of two inputs.
     */
    @Generated public static final int Max = 0x0000001D;
    /**
     * Must be last
     */
    @Generated public static final int Count = 0x0000001E;
}

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLMathMode
 * 
 * An enum to indicate if the compiler can perform optimizations for floating-point arithmetic that may violate the IEEE
 * 754 standard
 * 
 * [@constant] MTLMathModeSafe
 * Disables unsafe floating-point optimizations
 * 
 * [@constant] MTLMathModeRelaxed
 * Allows aggressive, unsafe floating-point optimizations but preserves infs and nans
 * 
 * [@constant] MTLMathModeFast
 * Allows aggressive, unsafe floating-point optimizations
 */
@Generated
public final class MTLMathMode {
    @Generated
    private MTLMathMode() {
    }

    @Generated @NInt public static final long Safe = 0x0000000000000000L;
    @Generated @NInt public static final long Relaxed = 0x0000000000000001L;
    @Generated @NInt public static final long Fast = 0x0000000000000002L;
}
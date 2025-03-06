package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLMathFloatingPointFunctions
 * 
 * An enum to indicate the default math functions for single precision floating-point
 * 
 * [@constant] MTLMathFloatingPointFunctionsFast
 * Sets the default math functions for single precision floating-point to the corresponding functions in `metal::fast`
 * namespace
 * 
 * [@constant] MTLMathFloatingPointFunctionsPrecise
 * Sets the default math functions for single precision floating-point to the corresponding functions in
 * 'metal::precise' namespace
 */
@Generated
public final class MTLMathFloatingPointFunctions {
    @Generated
    private MTLMathFloatingPointFunctions() {
    }

    @Generated @NInt public static final long Fast = 0x0000000000000000L;
    @Generated @NInt public static final long Precise = 0x0000000000000001L;
}
package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLLibraryOptimizationLevel
 * 
 * Optimization level for the Metal compiler.
 * 
 * [@constant] MTLLibraryOptimizationLevelDefault
 * Optimize for program performance.
 * 
 * [@constant] MTLLibraryOptimizationLevelSize
 * Like default, with extra optimizations to reduce code size.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLLibraryOptimizationLevel {
    @Generated
    private MTLLibraryOptimizationLevel() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Size = 0x0000000000000001L;
}
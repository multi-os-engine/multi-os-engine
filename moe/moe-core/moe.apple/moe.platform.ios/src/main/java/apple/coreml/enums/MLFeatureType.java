package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Supported data type enumeration
 * 
 * API-Since: 11.0
 */
@Generated
public final class MLFeatureType {
    @Generated
    private MLFeatureType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * Discrete values, sometimes used to hold numeric encoding of a categorical value
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Int64 = 0x0000000000000001L;
    /**
     * Continuous values
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Double = 0x0000000000000002L;
    /**
     * Text or categorical strings
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long String = 0x0000000000000003L;
    /**
     * CVPixelBufferRef
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Image = 0x0000000000000004L;
    /**
     * MLMultiArray
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long MultiArray = 0x0000000000000005L;
    /**
     * Numerically weighted hashable objects (e.g. word counts)
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Dictionary = 0x0000000000000006L;
    /**
     * MLSequence. Ordered collection of feature values with the same type
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Sequence = 0x0000000000000007L;
}
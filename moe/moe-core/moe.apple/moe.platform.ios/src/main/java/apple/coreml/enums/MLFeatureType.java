package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Supported data type enumeration
 */
@Generated
public final class MLFeatureType {
    @Generated
    private MLFeatureType() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * Discrete values, sometimes used to hold numeric encoding of a categorical value
     */
    @Generated @NInt public static final long Int64 = 0x0000000000000001L;
    /**
     * Continuous values
     */
    @Generated @NInt public static final long Double = 0x0000000000000002L;
    /**
     * Text or categorical strings
     */
    @Generated @NInt public static final long String = 0x0000000000000003L;
    /**
     * CVPixelBufferRef
     */
    @Generated @NInt public static final long Image = 0x0000000000000004L;
    /**
     * MLMultiArray
     */
    @Generated @NInt public static final long MultiArray = 0x0000000000000005L;
    /**
     * Numerically weighted hashable objects (e.g. word counts)
     */
    @Generated @NInt public static final long Dictionary = 0x0000000000000006L;
    /**
     * MLSequence. Ordered collection of feature values with the same type
     */
    @Generated @NInt public static final long Sequence = 0x0000000000000007L;
}
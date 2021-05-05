package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options supported by methods that produce difference objects.
 */
@Generated
public final class NSOrderedCollectionDifferenceCalculationOptions {
    @Generated
    private NSOrderedCollectionDifferenceCalculationOptions() {
    }

    /**
     * Insertion changes do not store a reference to the inserted object.
     */
    @Generated @NUInt public static final long OmitInsertedObjects = 0x0000000000000001L;
    /**
     * Insertion changes do not store a reference to the removed object.
     */
    @Generated @NUInt public static final long OmitRemovedObjects = 0x0000000000000002L;
    /**
     * Assume objects that were uniquely removed and inserted were moved.
     * This is useful when diffing based on identity instead of equality.
     */
    @Generated @NUInt public static final long InferMoves = 0x0000000000000004L;
}
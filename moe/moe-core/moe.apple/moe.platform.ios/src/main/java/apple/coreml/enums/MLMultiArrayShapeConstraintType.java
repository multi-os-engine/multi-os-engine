package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLMultiArrayShapeConstraintType {
    @Generated
    private MLMultiArrayShapeConstraintType() {
    }

    /**
     * An unconstrained shape. Any multi array satisfies this constraint.
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000001L;
    /**
     * Limited to an enumerated set of shapes
     */
    @Generated @NInt public static final long Enumerated = 0x0000000000000002L;
    /**
     * Allow full specified range per dimension
     */
    @Generated @NInt public static final long Range = 0x0000000000000003L;
}
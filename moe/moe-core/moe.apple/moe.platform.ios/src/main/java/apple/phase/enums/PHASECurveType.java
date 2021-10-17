package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASECurveType
 * <p>
 * Curve types.
 * [@constant] PHASECurveTypeLinear
 * A curve of the form y = x.
 * [@constant] PHASECurveTypeSquared
 * A curve of the form y = x^2.
 * [@constant] PHASECurveTypeInverseSquared
 * A curve of the form y = 1 / x^2.
 * [@constant] PHASECurveTypeCubed
 * A curve of the form y = x^3.
 * [@constant] PHASECurveTypeInverseCubed
 * A curve of the form y = 1 / x^3.
 * [@constant] PHASECurveTypeSine
 * A sine curve.
 * [@constant] PHASECurveTypeInverseSine
 * An inverse sine curve.
 * [@constant] PHASECurveTypeSigmoid
 * A sigmoid curve.
 * Also known as an s-curve, slow at the ends and quick in the middle.
 * [@constant] PHASECurveTypeInverseSigmoid
 * An inverse sigmoid curve.
 * Also known as an inverse s-curve, quick at the ends and slow in the middle.
 */
@Generated
public final class PHASECurveType {
    @Generated
    private PHASECurveType() {
    }

    @Generated @NInt public static final long Linear = 0x0000000063724C6EL;
    @Generated @NInt public static final long Squared = 0x0000000063725371L;
    @Generated @NInt public static final long InverseSquared = 0x0000000063724951L;
    @Generated @NInt public static final long Cubed = 0x0000000063724375L;
    @Generated @NInt public static final long InverseCubed = 0x0000000063724943L;
    @Generated @NInt public static final long Sine = 0x000000006372536EL;
    @Generated @NInt public static final long InverseSine = 0x0000000063724953L;
    @Generated @NInt public static final long Sigmoid = 0x0000000063725367L;
    @Generated @NInt public static final long InverseSigmoid = 0x0000000063724947L;
}

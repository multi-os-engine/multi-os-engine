package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef]    MPSGraphPaddingStyle
 * <p>
 * Tensor Layout
 * <p>
 * [@constant]   MPSGraphPaddingStyleExplicit                Explicit
 * [@constant]   MPSGraphPaddingStyleTF_SAME           TF_SAME
 * [@constant]   MPSGraphPaddingStyleTF_VALID           TF_VALID
 * [@constant]   MPSGraphPaddingStyleExplicitOffset       Explicit offsets
 */
@Generated
public final class MPSGraphPaddingStyle {
    @Generated
    private MPSGraphPaddingStyle() {
    }

    @Generated @NUInt public static final long Explicit = 0x0000000000000000L;
    @Generated @NUInt public static final long TF_VALID = 0x0000000000000001L;
    @Generated @NUInt public static final long TF_SAME = 0x0000000000000002L;
    @Generated @NUInt public static final long ExplicitOffset = 0x0000000000000003L;
}

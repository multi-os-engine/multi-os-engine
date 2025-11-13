package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Available algorithm revisions.
 * 
 * A new enum case with higher revision number is added when the processing algorithm is updated.
 * The ``VTMotionBlurConfiguration/defaultRevision`` property provides the default algorithm revision.
 */
@Generated
public final class VTMotionBlurConfigurationRevision {
    @Generated
    private VTMotionBlurConfigurationRevision() {
    }

    /**
     * revision 1
     */
    @Generated @NInt public static final long VTMotionBlurConfigurationRevision1 = 0x0000000000000001L;
}
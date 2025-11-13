package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Available algorithm revisions.
 * 
 * A new enum case with a higher revision number is added when the processing algorithm is updated.
 * The ``VTSuperResolutionScalerConfiguration/defaultRevision`` property provides the default algorithm revision.
 */
@Generated
public final class VTSuperResolutionScalerConfigurationRevision {
    @Generated
    private VTSuperResolutionScalerConfigurationRevision() {
    }

    /**
     * revision 1
     */
    @Generated @NInt public static final long VTSuperResolutionScalerConfigurationRevision1 = 0x0000000000000001L;
}
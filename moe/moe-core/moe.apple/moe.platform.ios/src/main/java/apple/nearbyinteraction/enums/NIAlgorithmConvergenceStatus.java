package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Expose algorithm state to make it possible for apps to coach users.
 */
@Generated
public final class NIAlgorithmConvergenceStatus {
    @Generated
    private NIAlgorithmConvergenceStatus() {
    }

    /**
     * Algorithm convergence status is unknown.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Algorithm is not converged.
     */
    @Generated @NInt public static final long NotConverged = 0x0000000000000001L;
    /**
     * Algorithm is converged.
     */
    @Generated @NInt public static final long Converged = 0x0000000000000002L;
}
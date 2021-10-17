package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Keeps track of where an altitude value came from and informs the user about the expected accuracy.
 */
@Generated
public final class ARAltitudeSource {
    @Generated
    private ARAltitudeSource() {
    }

    /**
     * Altitude could not be determined (yet).
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * ARKit determined altitude based on a coarse digital elevation model. The provided value is too imprecise to be used at close range, but is sufficient to anchor far away content.
     */
    @Generated @NInt public static final long Coarse = 0x0000000000000001L;
    /**
     * ARKit determined altitude based on a high resolution digital elevation model.
     */
    @Generated @NInt public static final long Precise = 0x0000000000000002L;
    /**
     * Altitude was provided by the user.
     */
    @Generated @NInt public static final long UserDefined = 0x0000000000000003L;
}
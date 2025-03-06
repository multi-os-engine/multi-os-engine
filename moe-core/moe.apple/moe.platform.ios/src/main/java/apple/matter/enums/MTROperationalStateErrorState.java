package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.4
 */
@Generated
public final class MTROperationalStateErrorState {
    @Generated
    private MTROperationalStateErrorState() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated public static final byte NoError = 0;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte UnableToStartOrResume = 1;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte UnableToCompleteOperation = 2;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte CommandInvalidInState = 3;
}
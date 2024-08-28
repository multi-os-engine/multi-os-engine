package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.2
 */
@Generated
public final class MTROTASoftwareUpdateRequestorChangeReason {
    @Generated
    private MTROTASoftwareUpdateRequestorChangeReason() {
    }

    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Unknown = 0;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Success = 1;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Failure = 2;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte TimeOut = 3;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte DelayByProvider = 4;
}
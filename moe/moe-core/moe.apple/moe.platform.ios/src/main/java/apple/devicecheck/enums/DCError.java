package apple.devicecheck.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class DCError {
    @Generated
    private DCError() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long UnknownSystemFailure = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long FeatureUnsupported = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InvalidInput = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InvalidKey = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ServerUnavailable = 0x0000000000000004L;
}
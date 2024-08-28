package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class SRErrorCode {
    @Generated
    private SRErrorCode() {
    }

    /**
     * No valid entitlement found
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InvalidEntitlement = 0x0000000000000000L;
    /**
     * Insufficient authorization to perform the action.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NoAuthorization = 0x0000000000000001L;
    /**
     * Data is not accessible at this time
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DataInaccessible = 0x0000000000000002L;
    /**
     * Fetch request contained invalid values
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long FetchRequestInvalid = 0x0000000000000003L;
    /**
     * Authorization request not completed
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long PromptDeclined = 0x0000000000000004L;
}

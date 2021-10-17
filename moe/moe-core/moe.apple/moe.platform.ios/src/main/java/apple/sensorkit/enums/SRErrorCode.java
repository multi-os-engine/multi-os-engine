package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SRErrorCode {
    @Generated
    private SRErrorCode() {
    }

    /**
     * No valid entitlement found
     */
    @Generated @NInt public static final long InvalidEntitlement = 0x0000000000000000L;
    /**
     * Insufficient authorization to perform the action.
     */
    @Generated @NInt public static final long NoAuthorization = 0x0000000000000001L;
    /**
     * Data is not accessible at this time
     */
    @Generated @NInt public static final long DataInaccessible = 0x0000000000000002L;
    /**
     * Fetch request contained invalid values
     */
    @Generated @NInt public static final long FetchRequestInvalid = 0x0000000000000003L;
    /**
     * Authorization request not completed
     */
    @Generated @NInt public static final long PromptDeclined = 0x0000000000000004L;
}

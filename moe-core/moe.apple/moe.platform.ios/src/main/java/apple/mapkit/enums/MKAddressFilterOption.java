package apple.mapkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class MKAddressFilterOption {
    @Generated
    private MKAddressFilterOption() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Country = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long AdministrativeArea = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long SubAdministrativeArea = 0x0000000000000004L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Locality = 0x0000000000000008L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long SubLocality = 0x0000000000000010L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long PostalCode = 0x0000000000000020L;
}
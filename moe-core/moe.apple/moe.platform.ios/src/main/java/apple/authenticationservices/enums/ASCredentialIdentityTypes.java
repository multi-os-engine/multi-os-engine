package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class ASCredentialIdentityTypes {
    @Generated
    private ASCredentialIdentityTypes() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long All = 0x0000000000000000L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Password = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Passkey = 0x0000000000000002L;
    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long OneTimeCode = 0x0000000000000004L;
}
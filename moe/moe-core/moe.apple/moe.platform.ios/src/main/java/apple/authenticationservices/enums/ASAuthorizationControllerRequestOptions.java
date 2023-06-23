package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class ASAuthorizationControllerRequestOptions {
    @Generated
    private ASAuthorizationControllerRequestOptions() {
    }

    /**
     * Tell the authorization controller that it should prefer credentials that are immediately available on the local
     * device.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ASAuthorizationControllerRequestOptionPreferImmediatelyAvailableCredentials = 0x0000000000000001L;
}
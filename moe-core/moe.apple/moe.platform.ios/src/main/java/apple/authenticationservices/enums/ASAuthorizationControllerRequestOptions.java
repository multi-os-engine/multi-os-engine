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
     * When used for sign-in requests, tell the authorization controller that it should only be presented if there are
     * credentials immediately available on the local device.
     * When used for registration requests, tell the authorization controller that it should only be presented if the
     * local device is currently set up to fulfill at least one of the request types.
     */
    @Generated @NUInt public static final long ASAuthorizationControllerRequestOptionPreferImmediatelyAvailableCredentials = 0x0000000000000001L;
}
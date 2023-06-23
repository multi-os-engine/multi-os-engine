package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ASCredentialServiceIdentifierType
 * 
 * The type of value represented by the service identifier.
 * [@constant] ASCredentialServiceIdentifierTypeDomain The service identifier represents a domain name that conforms to
 * RFC 1035.
 * [@constant] ASCredentialServiceIdentifierTypeURL The service identifier represents a URL that conforms to RFC 1738.
 * 
 * API-Since: 12.0
 */
@Generated
public final class ASCredentialServiceIdentifierType {
    @Generated
    private ASCredentialServiceIdentifierType() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Domain = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long URL = 0x0000000000000001L;
}

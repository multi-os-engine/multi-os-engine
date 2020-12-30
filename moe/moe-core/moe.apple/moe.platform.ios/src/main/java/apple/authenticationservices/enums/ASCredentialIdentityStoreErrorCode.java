package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ASCredentialIdentityStoreErrorCode
 * [@constant] ASCredentialIdentityStoreErrorCodeInternalError The operation failed due to an internal error.
 * [@constant] ASCredentialIdentityStoreErrorCodeStoreDisabled The operation failed because the credential identity store is disabled.
 * [@constant] ASCredentialIdentityStoreErrorCodeStoreBusy The operation failed because the credential identity store is busy. Attempt the operation again at a later time.
 */
@Generated
public final class ASCredentialIdentityStoreErrorCode {
    @Generated
    private ASCredentialIdentityStoreErrorCode() {
    }

    @Generated @NInt public static final long InternalError = 0x0000000000000000L;
    @Generated @NInt public static final long StoreDisabled = 0x0000000000000001L;
    @Generated @NInt public static final long StoreBusy = 0x0000000000000002L;
}
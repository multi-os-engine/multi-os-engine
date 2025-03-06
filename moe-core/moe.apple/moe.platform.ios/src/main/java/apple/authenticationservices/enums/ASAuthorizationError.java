package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class ASAuthorizationError {
    @Generated
    private ASAuthorizationError() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unknown = 0x00000000000003E8L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Canceled = 0x00000000000003E9L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long InvalidResponse = 0x00000000000003EAL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NotHandled = 0x00000000000003EBL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Failed = 0x00000000000003ECL;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long NotInteractive = 0x00000000000003EDL;
    /**
     * This error should only be returned when specifying @c excludedCredentials on a public key credential registration
     * request.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long MatchedExcludedCredential = 0x00000000000003EEL;
    /**
     * This error signals that the import request failed. Details will be available in the `userInfo` of the NSError.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long CredentialImport = 0x00000000000003EFL;
    /**
     * This error signals that the export request failed. Details will be available in the `userInfo` of the NSError.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long CredentialExport = 0x00000000000003F0L;
}

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
}

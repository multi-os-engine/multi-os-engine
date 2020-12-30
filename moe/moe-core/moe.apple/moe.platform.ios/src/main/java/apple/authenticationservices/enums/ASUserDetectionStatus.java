package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum ASUserDetectionStatus
 * @constant ASUserDetectionStatusUnsupported Not supported on current platform, ignore the value
 * @constant ASUserDetectionStatusUnknown We could not determine the value.  New users in the ecosystem will get this value as well, so you should not block these users, but instead treat them as any new user through standard email sign up flows
 * @constant ASUserDetectionStatusLikelyReal A hint that we have high confidence that the user is real.
 */
@Generated
public final class ASUserDetectionStatus {
    @Generated
    private ASUserDetectionStatus() {
    }

    @Generated @NInt public static final long Unsupported = 0x0000000000000000L;
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    @Generated @NInt public static final long LikelyReal = 0x0000000000000002L;
}
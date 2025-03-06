package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ASUserAgeRange
 * [@constant] ASUserAgeRangeUnknown This is returned if the project is missing the required entitlement to support
 * child accounts.
 * [@constant] ASUserAgeRangeChild The user is a child.
 * [@constant] ASUserAgeRangeNotChild The user is not a child.
 * 
 * API-Since: 17.0
 */
@Generated
public final class ASUserAgeRange {
    @Generated
    private ASUserAgeRange() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Child = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long NotChild = 0x0000000000000002L;
}
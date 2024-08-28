package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Each of the different states of a right
 * 
 * API-Since: 16.0
 */
@Generated
public final class LARightState {
    @Generated
    private LARightState() {
    }

    /**
     * Right has not been evaluated yet.
     * 
     * This is the initial state of @c LARight and changes when @c authorize method is called.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Requirements are currently being evaluated.
     * 
     * This happens after calling @c authorize method but before the user has granted the right.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Authorizing = 0x0000000000000001L;
    /**
     * Authorization was granted
     * 
     * This can be achieved by succesful authorization.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000002L;
    /**
     * Authorization was rejected.
     * 
     * This can be caused by several reasons. For example requirements were not satisified or user rejects to authorize.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000003L;
}
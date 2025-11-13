package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * URL Filter Verdicts
 * 
 * API-Since: 26.0
 */
@Generated
public final class NEURLFilterVerdict {
    @Generated
    private NEURLFilterVerdict() {
    }

    /**
     * [@const] NEURLFilterVerdictUnknown The validation failed
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * [@const] NEURLFilterVerdictAllow URL should be allowed
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Allow = 0x0000000000000002L;
    /**
     * [@const] NEURLFilterVerdictDeny URL should be denied.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Deny = 0x0000000000000003L;
}
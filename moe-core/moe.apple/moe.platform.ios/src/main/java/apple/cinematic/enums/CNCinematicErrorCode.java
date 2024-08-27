package apple.cinematic.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class CNCinematicErrorCode {
    @Generated
    private CNCinematicErrorCode() {
    }

    /**
     * failed for unknown reasons (check for underlying error)
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * not readable
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unreadable = 0x0000000000000002L;
    /**
     * missing needed information (e.g. not cinematic)
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Incomplete = 0x0000000000000003L;
    /**
     * data or content is corrupted
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Malformed = 0x0000000000000004L;
    /**
     * version or feature not supported
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000005L;
    /**
     * not compatible in current context
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Incompatible = 0x0000000000000006L;
    /**
     * operation was cancelled
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000007L;
}
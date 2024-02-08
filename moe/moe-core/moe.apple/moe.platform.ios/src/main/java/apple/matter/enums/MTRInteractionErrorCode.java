package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * MTRInteractionErrorDomain contains errors that represent a Matter
 * StatusIB error. These represent errors reported by the other side of a
 * Matter interaction.
 * 
 * When the code is MTRInteractionErrorCodeFailure the userInfo may have a
 * key named @"clusterStatus" whose value is the cluster-specific status that
 * was reported. This key will be absent if there was no cluster-specific
 * status.
 * clang-format off
 */
@Generated
public final class MTRInteractionErrorCode {
    @Generated
    private MTRInteractionErrorCode() {
    }

    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long Failure = 0x0000000000000001L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long InvalidSubscription = 0x000000000000007DL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedAccess = 0x000000000000007EL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedEndpoint = 0x000000000000007FL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long InvalidAction = 0x0000000000000080L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedCommand = 0x0000000000000081L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long InvalidCommand = 0x0000000000000085L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedAttribute = 0x0000000000000086L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long ConstraintError = 0x0000000000000087L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedWrite = 0x0000000000000088L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long ResourceExhausted = 0x0000000000000089L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long NotFound = 0x000000000000008BL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnreportableAttribute = 0x000000000000008CL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long InvalidDataType = 0x000000000000008DL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedRead = 0x000000000000008FL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long DataVersionMismatch = 0x0000000000000092L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long Timeout = 0x0000000000000094L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long Busy = 0x000000000000009CL;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedCluster = 0x00000000000000C3L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long NoUpstreamSubscription = 0x00000000000000C5L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long NeedsTimedInteraction = 0x00000000000000C6L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long UnsupportedEvent = 0x00000000000000C7L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long PathsExhausted = 0x00000000000000C8L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long TimedRequestMismatch = 0x00000000000000C9L;
    /**
     * These values come from the general status code table in the Matter
     * Interaction Model specification.
     */
    @Generated @NInt public static final long FailsafeRequired = 0x00000000000000CAL;
}
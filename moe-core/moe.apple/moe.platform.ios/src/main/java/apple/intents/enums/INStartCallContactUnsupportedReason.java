package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class INStartCallContactUnsupportedReason {
    @Generated
    private INStartCallContactUnsupportedReason() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoContactFound = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MultipleContactsUnsupported = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoHandleForLabel = 0x0000000000000003L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long InvalidHandle = 0x0000000000000004L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UnsupportedMmiUssd = 0x0000000000000005L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long NoCallHistoryForRedial = 0x0000000000000006L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoUsableHandleForRedial = 0x0000000000000007L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long RequiringInAppAuthentication = 0x0000000000000008L;
}
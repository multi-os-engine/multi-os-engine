package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.3
 */
@Generated
public final class AVContentKeyRequestStatus {
    @Generated
    private AVContentKeyRequestStatus() {
    }

    /**
     * Indicates that the request has just been created.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long RequestingResponse = 0x0000000000000000L;
    /**
     * Indicates that a response to a key reequest was received and key is in use. This does not indicate that the key
     * is valid.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long ReceivedResponse = 0x0000000000000001L;
    /**
     * Indicates that the key request was renewed. This does not indicate that the key is valid.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long Renewed = 0x0000000000000002L;
    /**
     * Indicates that the key request was retried.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long Retried = 0x0000000000000003L;
    /**
     * Indicates that the key request was cancelled.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;
    /**
     * Indicates that the request has encountered an error. See also the error property.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long Failed = 0x0000000000000005L;
}

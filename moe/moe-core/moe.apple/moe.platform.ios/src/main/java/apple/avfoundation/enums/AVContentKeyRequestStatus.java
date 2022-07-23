package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@constant] AVContentKeyRequestStatusRequestingResponse
 * Indicates that the request has just been created.
 * [@constant] AVContentKeyRequestStatusReceivedResponse
 * Indicates that a response to a key reequest was received and key is in use. This does not indicate that the key is
 * valid.
 * [@constant] AVContentKeyRequestStatusRenewed
 * Indicates that the key request was renewed. This does not indicate that the key is valid.
 * [@constant] AVContentKeyRequestStatusRetried
 * Indicates that the key request was retried.
 * [@constant] AVContentKeyRequestStatusCancelled
 * Indicates that the key request was cancelled.
 * [@constant] AVContentKeyRequestStatusFailed
 * Indicates that the request has encountered an error. See also the error property.
 */
@Generated
public final class AVContentKeyRequestStatus {
    @Generated
    private AVContentKeyRequestStatus() {
    }

    @Generated @NInt public static final long RequestingResponse = 0x0000000000000000L;
    @Generated @NInt public static final long ReceivedResponse = 0x0000000000000001L;
    @Generated @NInt public static final long Renewed = 0x0000000000000002L;
    @Generated @NInt public static final long Retried = 0x0000000000000003L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;
    @Generated @NInt public static final long Failed = 0x0000000000000005L;
}

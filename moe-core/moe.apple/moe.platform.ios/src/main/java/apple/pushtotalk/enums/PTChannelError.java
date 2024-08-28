package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTChannelError {
    @Generated
    private PTChannelError() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The action cannot be performed because there is no active channel with the supplied UUID
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ChannelNotFound = 0x0000000000000001L;
    /**
     * There is a maximum of one active channel at a time, for the whole device
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ChannelLimitReached = 0x0000000000000002L;
    /**
     * A traditional call is ongoing, preventing the channel action
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long CallActive = 0x0000000000000003L;
    /**
     * Setting a nonnil active participant is not posible while transmitting is ongoing.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransmissionInProgress = 0x0000000000000004L;
    /**
     * Error for trying to end a transmission when no transmission is even started
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransmissionNotFound = 0x0000000000000005L;
    /**
     * Error for trying to join a channel or begin transmitting while app is not foreground
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AppNotForeground = 0x0000000000000006L;
    /**
     * A device management policy or profile forbids joining the channel
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DeviceManagementRestriction = 0x0000000000000007L;
    /**
     * A Screen Time restriction prevented the action
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ScreenTimeRestriction = 0x0000000000000008L;
    /**
     * A transmission is not allowed due to the current transmission mode of the channel
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransmissionNotAllowed = 0x0000000000000009L;
}
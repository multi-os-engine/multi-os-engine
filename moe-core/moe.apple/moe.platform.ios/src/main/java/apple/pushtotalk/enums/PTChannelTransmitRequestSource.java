package apple.pushtotalk.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class PTChannelTransmitRequestSource {
    @Generated
    private PTChannelTransmitRequestSource() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * User pressed the transmit button in the on-screen system user interface
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UserRequest = 0x0000000000000001L;
    /**
     * The app made a call to requestBeginTransmittingWithChannelUUID:
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DeveloperRequest = 0x0000000000000002L;
    /**
     * User pressed a button on a hands-free device such as a wired headset
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long HandsfreeButton = 0x0000000000000003L;
}
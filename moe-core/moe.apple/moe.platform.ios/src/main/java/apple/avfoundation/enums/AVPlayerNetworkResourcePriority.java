package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This defines the network resource priority for a player.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVPlayerNetworkResourcePriority {
    @Generated
    private AVPlayerNetworkResourcePriority() {
    }

    /**
     * The default priority level given to a player for loading network resources. Use this when the player requires an
     * optimal level of network resources and streaming in high-quality resolution is ideal. Players with
     * AVPlayerNetworkResourcePriorityHigh will take precedence over this player. This player will take precedence over
     * players with AVPlayerNetworkResourcePriorityLow.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Indicates a low priority level for loading network resources. Use this when the player requires minimal network
     * bandwidth and streaming in high-quality resolution is not crucial. Other players with higher priority will take
     * precedence over this player.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Low = 0x0000000000000001L;
    /**
     * Indicates a high priority level for loading network resources. Use this when the player requires a high level of
     * network resources and streaming in high-quality resolution is crucial. This player will take precedence over
     * other lower priority players.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long High = 0x0000000000000002L;
}
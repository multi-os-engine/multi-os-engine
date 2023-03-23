package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NETrafficDirection
 * 
 * The direction of network traffic
 * 
 * API-Since: 13.0
 */
@Generated
public final class NETrafficDirection {
    @Generated
    private NETrafficDirection() {
    }

    /**
     * [@const] NETrafficDirectionAny Any direction
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Any = 0x0000000000000000L;
    /**
     * [@const] NETrafficDirectionInbound Inbound direction
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Inbound = 0x0000000000000001L;
    /**
     * [@const] NETrafficDirectionOutbound Outbound direction
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Outbound = 0x0000000000000002L;
}

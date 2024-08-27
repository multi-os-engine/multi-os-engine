package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GKMatchmakingMode {
    @Generated
    private GKMatchmakingMode() {
    }

    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long NearbyOnly = 0x0000000000000001L;
    @Generated @NInt public static final long AutomatchOnly = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InviteOnly = 0x0000000000000003L;
}

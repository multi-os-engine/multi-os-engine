package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class BNNSShuffleType {
    @Generated
    private BNNSShuffleType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated public static final int BNNSShuffleTypePixelShuffleNCHW = 0x00000000;
    /**
     * API-Since: 16.0
     */
    @Generated public static final int BNNSShuffleTypePixelUnshuffleNCHW = 0x00000001;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int BNNSShuffleTypeDepthToSpaceNCHW = 0x00000002;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int BNNSShuffleTypeSpaceToDepthNCHW = 0x00000003;
}
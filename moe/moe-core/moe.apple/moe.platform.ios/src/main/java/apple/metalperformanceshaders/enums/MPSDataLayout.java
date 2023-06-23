package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class MPSDataLayout {
    @Generated
    private MPSDataLayout() {
    }

    /**
     * output as order [imageNum][imageHeight][imageWidth][numberOfFeatureChannels]
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long HeightxWidthxFeatureChannels = 0x0000000000000000L;
    /**
     * output as order [imageNum][numberOfFeatureChannels][imageHeight][imageWidth]
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long FeatureChannelsxHeightxWidth = 0x0000000000000001L;
}
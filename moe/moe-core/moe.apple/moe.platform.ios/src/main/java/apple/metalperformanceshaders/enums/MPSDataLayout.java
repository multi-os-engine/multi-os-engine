package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSDataLayout {
    @Generated
    private MPSDataLayout() {
    }

    /**
     * output as order [imageNum][imageHeight][imageWidth][numberOfFeatureChannels]
     */
    @Generated @NUInt public static final long HeightxWidthxFeatureChannels = 0x0000000000000000L;
    /**
     * output as order [imageNum][numberOfFeatureChannels][imageHeight][imageWidth]
     */
    @Generated @NUInt public static final long FeatureChannelsxHeightxWidth = 0x0000000000000001L;
}
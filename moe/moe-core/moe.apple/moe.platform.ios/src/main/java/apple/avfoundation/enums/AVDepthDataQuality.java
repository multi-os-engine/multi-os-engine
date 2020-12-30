package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum AVDepthDataQuality
 * @abstract
 *    Constants indicating the overall quality of depth data map values.
 * 
 * @constant AVDepthDataQualityLow
 *    The overall quality of values within the map is low (too many invalid depth values).
 * @constant AVDepthDataQualityHigh
 *    The overall quality of values within the map is high.
 * 
 * @discussion
 *    Depth data maps are typically generated by comparing images and calculating disparity. If features are lacking in either input image, it may be difficult to find matching keypoints, resulting in a depth data map with substantial holes. These holes can be filled with depth data filtering, but still may produce a map of overall poor quality. If a depth data map suffers from insufficient features, it is marked as low quality, and should be considered a substandard candidate for rendering high-quality depth effects or reconstructing a 3D scene. High quality depth is feature-rich, contains a high level of detail, and should be considered a good candidate for rendering high-quality depth effects or reconstructing a 3D scene.
 */
@Generated
public final class AVDepthDataQuality {
    @Generated
    private AVDepthDataQuality() {
    }

    @Generated @NInt public static final long Low = 0x0000000000000000L;
    @Generated @NInt public static final long High = 0x0000000000000001L;
}
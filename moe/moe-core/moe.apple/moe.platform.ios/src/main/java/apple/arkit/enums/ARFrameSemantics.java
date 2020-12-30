package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Option set indicating semantic understanding types of the image frame.
 */
@Generated
public final class ARFrameSemantics {
    @Generated
    private ARFrameSemantics() {
    }

    /**
     * No semantic operation is run.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Person segmentation.
     * @discussion A pixel in the image frame that gets classified as person will have an intensity value equal to 'ARSegmentationClassPerson'.
     * @see -[ARFrame segmentationBuffer]
     * @see ARSegmentationClass
     */
    @Generated @NUInt public static final long PersonSegmentation = 0x0000000000000001L;
    /**
     * Person segmentation with depth.
     * @discussion A pixel in the image frame that gets classified as person will have an intensity value equal to 'ARSegmentationClassPerson'.
     * Additionally, every pixel in the image frame that gets classified as person will also have a depth value.
     * @see -[ARFrame estimatedDepthData]
     * @see -[ARFrame segmentationBuffer]
     */
    @Generated @NUInt public static final long PersonSegmentationWithDepth = 0x0000000000000003L;
    /**
     * Body detection.
     * @discussion Once activated an ARFrame will contain information about a detected body.
     * @see -[ARFrame detectedBody]
     * @see ARBody2D
     */
    @Generated @NUInt public static final long BodyDetection = 0x0000000000000004L;
    /**
     * Scene Depth.
     * @discussion Each capturedImage will have an associated scene depth data.
     * @see - [ARFrame sceneDepth]
     */
    @Generated @NUInt public static final long SceneDepth = 0x0000000000000008L;
    /**
     * Smoothed Scene Depth.
     * @discussion Each capturedImage will have an associated scene depth data that is temporally smoothed.
     * @see - [ARFrame smoothedSceneDepth]
     */
    @Generated @NUInt public static final long SmoothedSceneDepth = 0x0000000000000010L;
}
package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Segmentation classes which defines a pixel's semantic label.
 * 
 * When running a configuration with 'ARFrameSemanticPersonSegmentation' every pixel in the
 * segmentationBuffer on the ARFrame will conform to one of these classes.
 * 
 * @see -[ARConfiguration setFrameSemantics:]
 * @see -[ARFrame segmentationBuffer]
 */
@Generated
public final class ARSegmentationClass {
    @Generated
    private ARSegmentationClass() {
    }

    /**
     * Pixel has been not been classified.
     */
    @Generated public static final byte None = 0;
    /**
     * Pixel has been classified as person.
     */
    @Generated public static final byte Person = -1;
}

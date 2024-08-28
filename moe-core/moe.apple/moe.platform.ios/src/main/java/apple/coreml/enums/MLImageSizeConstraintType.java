package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class MLImageSizeConstraintType {
    @Generated
    private MLImageSizeConstraintType() {
    }

    /**
     * Any image size is allowed
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * Limited to an enumerated set of image sizes
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Enumerated = 0x0000000000000002L;
    /**
     * Allow full width and height ranges
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Range = 0x0000000000000003L;
}
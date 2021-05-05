package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLImageSizeConstraintType {
    @Generated
    private MLImageSizeConstraintType() {
    }

    /**
     * Any image size is allowed
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * Limited to an enumerated set of image sizes
     */
    @Generated @NInt public static final long Enumerated = 0x0000000000000002L;
    /**
     * Allow full width and height ranges
     */
    @Generated @NInt public static final long Range = 0x0000000000000003L;
}
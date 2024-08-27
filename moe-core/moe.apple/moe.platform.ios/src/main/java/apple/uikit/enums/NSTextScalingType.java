package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Supported values for NSTextScalingDocumentAttribute, NSSourceTextScalingDocumentAttribute,
 * NSTargetTextScalingDocumentOption, NSSourceTextScalingDocumentOption
 * 
 * API-Since: 13.0
 */
@Generated
public final class NSTextScalingType {
    @Generated
    private NSTextScalingType() {
    }

    /**
     * Font sizes throughout the document should appear visually similar to how they would render on macOS and non-Apple
     * platforms
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ScalingStandard = 0x0000000000000000L;
    /**
     * Font sizes throughout the document should appear visually similar to how they would render on iOS
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ScalingiOS = 0x0000000000000001L;
}
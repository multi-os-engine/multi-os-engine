package apple.accessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options indicating which Accessibility features will be turned on or off when an override session is held by your
 * app.
 */
@Generated
public final class AXFeatureOverrideSessionOptions {
    @Generated
    private AXFeatureOverrideSessionOptions() {
    }

    @Generated @NUInt public static final long Grayscale = 0x0000000000000001L;
    @Generated @NUInt public static final long InvertColors = 0x0000000000000002L;
    @Generated @NUInt public static final long VoiceControl = 0x0000000000000004L;
    @Generated @NUInt public static final long VoiceOver = 0x0000000000000008L;
    @Generated @NUInt public static final long Zoom = 0x0000000000000010L;
}
package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Applications that are locked into Guided Access via a Single App Mode profile are granted the ability to configure certain accessibility features,
 * to support kiosk deployments. If your app is locked into Single App Mode, you can use the UIGuidedAccessConfigureAccessibilityFeatures function
 * to configure what accessibility features are enabled.
 */
@Generated
public final class UIGuidedAccessAccessibilityFeature {
    @Generated
    private UIGuidedAccessAccessibilityFeature() {
    }

    @Generated @NUInt public static final long VoiceOver = 0x0000000000000001L;
    @Generated @NUInt public static final long Zoom = 0x0000000000000002L;
    @Generated @NUInt public static final long AssistiveTouch = 0x0000000000000004L;
    @Generated @NUInt public static final long InvertColors = 0x0000000000000008L;
    @Generated @NUInt public static final long GrayscaleDisplay = 0x0000000000000010L;
}
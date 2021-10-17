package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPrintRenderingQuality {
    @Generated
    private UIPrintRenderingQuality() {
    }

    /**
     * Renders the printing at the best possible quality, regardless of speed.
     */
    @Generated @NInt public static final long Best = 0x0000000000000000L;
    /**
     * Sacrifices the least possible amount of rendering quality for speed to maintain a responsive user interface. This option should be used only after establishing that best quality rendering does indeed make the user interface unresponsive.
     */
    @Generated @NInt public static final long Responsive = 0x0000000000000001L;
}

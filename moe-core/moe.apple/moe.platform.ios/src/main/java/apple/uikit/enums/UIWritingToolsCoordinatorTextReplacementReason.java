package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Options that indicate whether Writing Tools is animating changes to
 * your view’s text.
 * 
 * During an operation, Writing Tools delivers replacement text to the
 * delegate of the active ``UIWritingToolsCoordinator`` object. Depending
 * on the configured experience for your view, it delivers these changes
 * as either interactive or noninteractive replacements. For interactive
 * replacements, Writing Tools animates the change automatically and provides
 * you with the information you need to perform any related animations.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIWritingToolsCoordinatorTextReplacementReason {
    @Generated
    private UIWritingToolsCoordinatorTextReplacementReason() {
    }

    /**
     * animating a chunk from a proofreading or rewrite inline delivery
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Interactive = 0x0000000000000000L;
    /**
     * an unanimated replacement prompted from writing tools, perhaps copied from the overlay-panel experience, perhaps
     * a reverted rewrite or individual proofreading suggestion, and so forth
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Noninteractive = 0x0000000000000001L;
}
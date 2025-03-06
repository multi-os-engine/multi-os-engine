package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The types of animations that Writing Tools performs during an interactive
 * update of your view.
 * 
 * Use the `UIWritingToolsCoordinator/TextAnimation` constants to determine
 * the type of animation that is occurring. During an interactive change to
 * your view, Writing Tools creates animations to provide feedback about what’s
 * happening. During the setup for each animation, Writing Tools reports the
 * type of animation to the coordinator’s delegate, so that you can perform
 * additional actions related to that animation. For example, during an insertion
 * animation, you might animate changes to other views in your interface.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIWritingToolsCoordinatorTextAnimation {
    @Generated
    private UIWritingToolsCoordinatorTextAnimation() {
    }

    /**
     * The animation effect for the text awaiting the results of the Writing Tools evaluation
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Anticipate = 0x0000000000000000L;
    /**
     * The animation effect for washing out text that will be replaced by a Writing Tools delivery
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Remove = 0x0000000000000001L;
    /**
     * The amimation effect for washing in replacement text from a Writing Tools delivery
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Insert = 0x0000000000000002L;
}
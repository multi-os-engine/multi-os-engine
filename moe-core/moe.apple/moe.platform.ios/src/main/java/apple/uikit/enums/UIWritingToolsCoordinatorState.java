package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The states that indicate the current activity, if any, Writing Tools
 * is performing in your view.
 * 
 * Making changes to your view requires several different levels of
 * interaction. Initially, Writing Tools displays its UI and collects
 * information about what the person wants to do. When the person selects
 * an operation, Writing Tools sends the relevant details to a large language
 * model (LLM) and processes the results. It then works with the custom view to
 * integrate any changes into the view’s text storage. During each
 * of these activities, the coordinator reflects what’s happening in
 * its ``UIWritingToolsCoordinator/state`` property. You can use
 * the current state as a guide to making decisions in other parts of your view.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIWritingToolsCoordinatorState {
    @Generated
    private UIWritingToolsCoordinatorState() {
    }

    /**
     * Writing Tools is not active
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Inactive = 0x0000000000000000L;
    /**
     * Writing Tools is presenting UI, and the WTC may call the
     * -writingToolsCoordinator:replaceRange:inContext:withText:reason: delegate method (with
     * UIWritingToolsCoordinatorTextReplacementReasonNoninteractive) if the textual view is editable
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Noninteractive = 0x0000000000000001L;
    /**
     * Writing Tools is providing the full inline-editing experience, and has delivered a complete set of results.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long InteractiveResting = 0x0000000000000002L;
    /**
     * Writing Tools is providing the full inline-editing experience, and is updating text, either because results are
     * provided from AppleIntelligence, or because user interaction has requested changes, such as showing a different
     * revision
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long InteractiveStreaming = 0x0000000000000003L;
}
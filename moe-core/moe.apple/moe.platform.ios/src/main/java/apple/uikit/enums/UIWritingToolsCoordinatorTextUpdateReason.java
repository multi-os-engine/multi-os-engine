package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants that specify the reason you updated your view’s content
 * outside of the Writing Tools workflow.
 * 
 * If you modify your view’s text storage while Writing Tools is active,
 * report those changes to your ``UIWritingToolsCoordinator`` object
 * so it can track them correctly. Call the
 * ``UIWritingToolsCoordinator/updateRange(_:with:reason:forContextWithIdentifier:)``
 * method to report changes that occur inside one of your context objects. Call the
 * ``UIWritingToolsCoordinator/updateForReflowedTextInContextWithIdentifier(_:)``
 * method for changes that affect the layout of your text, such as text insertions
 * before a context object or changes to your view’s frame rectangle.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIWritingToolsCoordinatorTextUpdateReason {
    @Generated
    private UIWritingToolsCoordinatorTextUpdateReason() {
    }

    /**
     * An operation that involved a person editing the text in your view.
     * 
     * Specify this option when the changes come from the text input system.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long Typing = 0x0000000000000000L;
    /**
     * An operation that changed the view’s text as part of an undo or
     * redo command.
     * 
     * Specify this option when an undo or redo command initiated the
     * change to your view.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long UndoRedo = 0x0000000000000001L;
}
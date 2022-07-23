package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NSTextSelectionNavigation is an interface exposing methods for obtaining results from actions performed on text
 * selections. It returns the essential information necessary for editing, selecting, and navigating operations.
 */
@Generated
public final class NSTextSelectionNavigationDirection {
    @Generated
    private NSTextSelectionNavigationDirection() {
    }

    /**
     * Logical directions
     * Works with just character information
     */
    @Generated @NInt public static final long Forward = 0x0000000000000000L;
    /**
     * Logical directions
     * Works with just character information
     */
    @Generated @NInt public static final long Backward = 0x0000000000000001L;
    /**
     * Visual directions
     * Requires layout information if the direction is along the line (i.e. right and left for a horizontal line).
     * Otherwise, it gets resolved to the corresponding logical direction except for
     * NSTextSelectionNavigationDestinationCharacter
     */
    @Generated @NInt public static final long Right = 0x0000000000000002L;
    /**
     * Visual directions
     * Requires layout information if the direction is along the line (i.e. right and left for a horizontal line).
     * Otherwise, it gets resolved to the corresponding logical direction except for
     * NSTextSelectionNavigationDestinationCharacter
     */
    @Generated @NInt public static final long Left = 0x0000000000000003L;
    /**
     * Visual directions
     * Requires layout information if the direction is along the line (i.e. right and left for a horizontal line).
     * Otherwise, it gets resolved to the corresponding logical direction except for
     * NSTextSelectionNavigationDestinationCharacter
     */
    @Generated @NInt public static final long Up = 0x0000000000000004L;
    /**
     * Visual directions
     * Requires layout information if the direction is along the line (i.e. right and left for a horizontal line).
     * Otherwise, it gets resolved to the corresponding logical direction except for
     * NSTextSelectionNavigationDestinationCharacter
     */
    @Generated @NInt public static final long Down = 0x0000000000000005L;
}

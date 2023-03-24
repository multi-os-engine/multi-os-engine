package apple.uikit.protocol;

import apple.foundation.NSDateComponents;
import apple.uikit.UICalendarSelectionMultiDate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICalendarSelectionMultiDateDelegate")
public interface UICalendarSelectionMultiDateDelegate {
    /**
     * Determines if a date can be deselected.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date to be checked by selection.
     * 
     * @return YES if the date can be deselected, NO otherwise.
     */
    @Generated
    @IsOptional
    @Selector("multiDateSelection:canDeselectDate:")
    default boolean multiDateSelectionCanDeselectDate(@NotNull UICalendarSelectionMultiDate selection,
            @NotNull NSDateComponents dateComponents) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Determines if a date is selectable. Dates that are not selectable will be disabled in the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date to be checked by selection.
     * 
     * @return YES if the date can be selected, NO otherwise.
     */
    @Generated
    @IsOptional
    @Selector("multiDateSelection:canSelectDate:")
    default boolean multiDateSelectionCanSelectDate(@NotNull UICalendarSelectionMultiDate selection,
            @NotNull NSDateComponents dateComponents) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the user removes selection from one of hte selected dates the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date that was deselected by the user.
     */
    @Generated
    @Selector("multiDateSelection:didDeselectDate:")
    void multiDateSelectionDidDeselectDate(@NotNull UICalendarSelectionMultiDate selection,
            @NotNull NSDateComponents dateComponents);

    /**
     * Called after the user selects a date in the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date that was selected by the user.
     */
    @Generated
    @Selector("multiDateSelection:didSelectDate:")
    void multiDateSelectionDidSelectDate(@NotNull UICalendarSelectionMultiDate selection,
            @NotNull NSDateComponents dateComponents);
}
package apple.uikit.protocol;

import apple.foundation.NSDateComponents;
import apple.uikit.UICalendarSelectionSingleDate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICalendarSelectionSingleDateDelegate")
public interface UICalendarSelectionSingleDateDelegate {
    /**
     * Determines if a date is selectable. Dates that are not selectable will be disabled in the calendar view.
     * By default, @c dateSelection:canSelectDate: returns YES if dateComponents is non-nil.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date to be checked by selection; a @c nil date represents a deselected date.
     * 
     * @return YES if the date can be selected, NO otherwise.
     */
    @Generated
    @IsOptional
    @Selector("dateSelection:canSelectDate:")
    default boolean dateSelectionCanSelectDate(@NotNull UICalendarSelectionSingleDate selection,
            @Nullable NSDateComponents dateComponents) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the user selects a date in the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionMultiDate
     * @param dateComponents The date that was selected by the user. @c dateComponents can be @c nil when the selected
     *                       date is deselected by the user.
     */
    @Generated
    @Selector("dateSelection:didSelectDate:")
    void dateSelectionDidSelectDate(@NotNull UICalendarSelectionSingleDate selection,
            @Nullable NSDateComponents dateComponents);
}
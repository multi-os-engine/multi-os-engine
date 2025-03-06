package apple.uikit.protocol;

import apple.foundation.NSDateComponents;
import apple.uikit.UICalendarSelectionWeekOfYear;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICalendarSelectionWeekOfYearDelegate")
public interface UICalendarSelectionWeekOfYearDelegate {
    /**
     * Determines if a week of year is selectable. Dates that are not selectable will be disabled in the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionWeekOfYear
     * @param dateComponents The date to be checked by selection.
     * 
     * @return YES if the date can be selected, NO otherwise.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("weekOfYearSelection:canSelectWeekOfYear:")
    default boolean weekOfYearSelectionCanSelectWeekOfYear(@NotNull UICalendarSelectionWeekOfYear selection,
            @Nullable NSDateComponents weekOfYearComponents) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the user selects a week of year in the calendar view.
     * 
     * @param selection      The @c UICalendarSelectionWeekOfYear
     * @param dateComponents The date that was selected by the user.
     * 
     *                       API-Since: 18.0
     */
    @Generated
    @Selector("weekOfYearSelection:didSelectWeekOfYear:")
    void weekOfYearSelectionDidSelectWeekOfYear(@NotNull UICalendarSelectionWeekOfYear selection,
            @Nullable NSDateComponents weekOfYearComponents);
}
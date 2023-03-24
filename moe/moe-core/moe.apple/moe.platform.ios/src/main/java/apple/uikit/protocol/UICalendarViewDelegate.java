package apple.uikit.protocol;

import apple.foundation.NSDateComponents;
import apple.uikit.UICalendarView;
import apple.uikit.UICalendarViewDecoration;
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
@ObjCProtocolName("UICalendarViewDelegate")
public interface UICalendarViewDelegate {
    /**
     * Called when the calendar view is preparing decorations.
     * 
     * @param calendarView   The @c UICalendarView
     * @param dateComponents The date for which the decoration is prepared for.
     * 
     * @return A @c UICalendarViewDecoration to annotate the specific date. Return @c nil for no decoration.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("calendarView:decorationForDateComponents:")
    default UICalendarViewDecoration calendarViewDecorationForDateComponents(@NotNull UICalendarView calendarView,
            @NotNull NSDateComponents dateComponents) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the visible date has changed from @c previousDateComponents from user interaction.
     * 
     * @param calendarView           The @c UICalendarView
     * @param previousDateComponents The previous date components before the visible date components changed.
     * 
     *                               API-Since: 16.2
     */
    @Generated
    @IsOptional
    @Selector("calendarView:didChangeVisibleDateComponentsFrom:")
    default void calendarViewDidChangeVisibleDateComponentsFrom(@NotNull UICalendarView calendarView,
            @NotNull NSDateComponents previousDateComponents) {
        throw new java.lang.UnsupportedOperationException();
    }
}
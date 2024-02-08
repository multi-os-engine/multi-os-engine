package apple.uikit.protocol;

import apple.uikit.UIPageControlTimerProgress;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPageControlTimerProgressDelegate")
public interface UIPageControlTimerProgressDelegate extends UIPageControlProgressDelegate {
    /**
     * Determines if the time interval progress should advance to the next page upon progress completion of
     * the current page's duration. Default is YES.
     */
    @Generated
    @IsOptional
    @Selector("pageControlTimerProgress:shouldAdvanceToPage:")
    default boolean pageControlTimerProgressShouldAdvanceToPage(@NotNull UIPageControlTimerProgress progress,
            @NInt long page) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the progress has changed from the time interval progress.
     */
    @Generated
    @IsOptional
    @Selector("pageControlTimerProgressDidChange:")
    default void pageControlTimerProgressDidChange(@NotNull UIPageControlTimerProgress progress) {
        throw new java.lang.UnsupportedOperationException();
    }
}
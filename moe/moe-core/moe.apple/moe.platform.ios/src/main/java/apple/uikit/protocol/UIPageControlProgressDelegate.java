package apple.uikit.protocol;

import apple.uikit.UIPageControlProgress;
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
@ObjCProtocolName("UIPageControlProgressDelegate")
public interface UIPageControlProgressDelegate {
    /**
     * Returns the initial progress (between 0...1) for the specified page. By default, `currentProgress` is set to 0
     * when the page changes.
     */
    @Generated
    @IsOptional
    @Selector("pageControlProgress:initialProgressForPage:")
    default float pageControlProgressInitialProgressForPage(@NotNull UIPageControlProgress progress, @NInt long page) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the page control progress visibility has changed, which could occur when the page control is being
     * interacted
     * with. The page control progress becomes hidden when the user begins to interact with the page control (when it
     * begins
     * continuous interaction), and is visible again when the user stops interacting with the control. Observe the page
     * control progress
     * visibility to pause or resume the paging content.
     * 
     * Example:
     * [@code]
     * - (void)pageControlProgressVisibilityDidChange:(UIPageControlProgress *)progress {
     * BOOL isProgressVisible = progress.isProgressVisible;
     * if (isProgressVisible) {
     * [self _resumeContentFromInteractionChanges];
     * } else {
     * [self _pauseContentFromInteractionChanges];
     * }
     * }
     * [@endcode]
     */
    @Generated
    @IsOptional
    @Selector("pageControlProgressVisibilityDidChange:")
    default void pageControlProgressVisibilityDidChange(@NotNull UIPageControlProgress progress) {
        throw new java.lang.UnsupportedOperationException();
    }
}
package apple.uikit.protocol;

import apple.foundation.struct.NSRange;
import apple.uikit.UINavigationItem;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
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
@ObjCProtocolName("UINavigationItemRenameDelegate")
public interface UINavigationItemRenameDelegate {
    /**
     * This method is called when renaming has ended. The title on the navigation item has already been changed when
     * this method is called but
     * clients can make further adjustments to it when necessary.
     */
    @Generated
    @Selector("navigationItem:didEndRenamingWithTitle:")
    void navigationItemDidEndRenamingWithTitle(@NotNull UINavigationItem navigationItem, @NotNull String title);

    /**
     * This method can be used to prevent renaming from happening. However there are cases (e.g. when a new navigation
     * item is pushed on the navigation
     * bar) where this method will not be called and instead navigationItem:didEndRenamingWithTitle: is called right
     * away. Clients are therefore expected to
     * handle titles in navigationItem:didEndRenamingWithTitle: for which they would return NO from
     * navigationItem:shouldEndRenamingWithTitle:.
     */
    @Generated
    @IsOptional
    @Selector("navigationItem:shouldEndRenamingWithTitle:")
    default boolean navigationItemShouldEndRenamingWithTitle(@NotNull UINavigationItem navigationItem,
            @NotNull String title) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when we begin renaming. Implementing this method allows for customizing the initial text that will show up
     * in the text field as well as the
     * selected range of that text.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("navigationItem:willBeginRenamingWithSuggestedTitle:selectedRange:")
    default String navigationItemWillBeginRenamingWithSuggestedTitleSelectedRange(
            @NotNull UINavigationItem navigationItem, @NotNull String title,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") NSRange selectedRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Controls whether the rename action is supported for the given navigation item. For example this method is called
     * when the navigation bar's
     * document menu is shown to validate if the rename action should be part of that menu.
     */
    @Generated
    @IsOptional
    @Selector("navigationItemShouldBeginRenaming:")
    default boolean navigationItemShouldBeginRenaming(@NotNull UINavigationItem navigationItem) {
        throw new java.lang.UnsupportedOperationException();
    }
}
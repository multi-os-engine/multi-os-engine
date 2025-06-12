package apple.webkit.protocol;

import apple.corefoundation.struct.CGSize;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
import apple.webkit.WKSnapshotConfiguration;
import apple.webkit.WKWebExtensionContext;
import apple.webkit.WKWebExtensionTabConfiguration;
import apple.webkit.WKWebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class conforming to the ``WKWebExtensionTab`` protocol represents a tab to web extensions.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKWebExtensionTab")
public interface WKWebExtensionTab {
    /**
     * Called to activate the tab, making it frontmost.
     * 
     * Upon activation, the tab should become the frontmost and either be the sole selected tab or
     * be included among the selected tabs. No action is performed if not implemented.
     * 
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see setSelected:forWebExtensionContext:completionHandler:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("activateForWebExtensionContext:completionHandler:")
    default void activateForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_activateForWebExtensionContextCompletionHandler") @NotNull Block_activateForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activateForWebExtensionContextCompletionHandler {
        @Generated
        void call_activateForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to close the tab.
     * 
     * No action is performed if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("closeForWebExtensionContext:completionHandler:")
    default void closeForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_closeForWebExtensionContextCompletionHandler") @NotNull Block_closeForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeForWebExtensionContextCompletionHandler {
        @Generated
        void call_closeForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to detect the locale of the webpage currently loaded in the tab.
     * 
     * No action is performed if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. The block takes two arguments:
     *                          the detected locale (or \c nil if the locale is unknown) and an error, which should be
     *                          provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("detectWebpageLocaleForWebExtensionContext:completionHandler:")
    default void detectWebpageLocaleForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_detectWebpageLocaleForWebExtensionContextCompletionHandler") @NotNull Block_detectWebpageLocaleForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_detectWebpageLocaleForWebExtensionContextCompletionHandler {
        @Generated
        void call_detectWebpageLocaleForWebExtensionContextCompletionHandler(@Nullable NSLocale locale,
                @Nullable NSError error);
    }

    /**
     * Called to duplicate the tab.
     * 
     * This is equivalent to the user selecting to duplicate the tab through a menu item, with the specified
     * configuration.
     * No action is performed if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param configuration     The tab configuration influencing the duplicated tab's properties.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes two arguments:
     *                          the duplicated tab (or \c nil if no tab was created) and an error, which should be
     *                          provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("duplicateUsingConfiguration:forWebExtensionContext:completionHandler:")
    default void duplicateUsingConfigurationForWebExtensionContextCompletionHandler(
            @NotNull WKWebExtensionTabConfiguration configuration, @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_duplicateUsingConfigurationForWebExtensionContextCompletionHandler") @NotNull Block_duplicateUsingConfigurationForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_duplicateUsingConfigurationForWebExtensionContextCompletionHandler {
        @Generated
        void call_duplicateUsingConfigurationForWebExtensionContextCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab duplicatedTab, @Nullable NSError error);
    }

    /**
     * Called to navigate the tab to the previous page in its history.
     * 
     * Navigates to the previous page in the tab's web view via ``goBack`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("goBackForWebExtensionContext:completionHandler:")
    default void goBackForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_goBackForWebExtensionContextCompletionHandler") @NotNull Block_goBackForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goBackForWebExtensionContextCompletionHandler {
        @Generated
        void call_goBackForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to navigate the tab to the next page in its history.
     * 
     * Navigates to the next page in the tab's web view via ``goForward`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("goForwardForWebExtensionContext:completionHandler:")
    default void goForwardForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_goForwardForWebExtensionContextCompletionHandler") @NotNull Block_goForwardForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goForwardForWebExtensionContextCompletionHandler {
        @Generated
        void call_goForwardForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called when the index of the tab in the window is needed.
     * 
     * This method should be implemented for better performance. Defaults to the window's
     * ``tabsForWebExtensionContext:`` method to find the index if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The index of the tab in the window, or ``NSNotFound`` if the tab is not currently in a window.
     */
    @Generated
    @IsOptional
    @Selector("indexInWindowForWebExtensionContext:")
    @NUInt
    default long indexInWindowForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to check if the tab has finished loading.
     * 
     * Defaults to ``isLoading`` of the tab's web view if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab has finished loading, `NO` otherwise.
     */
    @Generated
    @IsOptional
    @Selector("isLoadingCompleteForWebExtensionContext:")
    default boolean isLoadingCompleteForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to check if the tab is currently muted.
     * 
     * Defaults to `NO` if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab is muted, `NO` otherwise.
     * @see setMuted:forWebExtensionContext:completionHandler:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("isMutedForWebExtensionContext:")
    default boolean isMutedForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the pinned state of the tab is needed.
     * 
     * Defaults to `NO` if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab is pinned, `NO` otherwise.
     * @see setPinned:forWebExtensionContext:completionHandler:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("isPinnedForWebExtensionContext:")
    default boolean isPinnedForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to check if the tab is currently playing audio.
     * 
     * Defaults to `NO` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab is playing audio, `NO` otherwise.
     */
    @Generated
    @IsOptional
    @Selector("isPlayingAudioForWebExtensionContext:")
    default boolean isPlayingAudioForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to check if the tab is currently showing reader mode.
     * 
     * Defaults to `NO` if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab is showing reader mode, `NO` otherwise.
     * @see isReaderModeAvailableForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("isReaderModeActiveForWebExtensionContext:")
    default boolean isReaderModeActiveForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to check if reader mode is available for the tab.
     * 
     * Defaults to `NO` if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if reader mode is available for the tab, `NO` otherwise.
     * @see isReaderModeActiveForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("isReaderModeAvailableForWebExtensionContext:")
    default boolean isReaderModeAvailableForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the selected state of the tab is needed.
     * 
     * Defaults to `YES` for the active tab and `NO` for other tabs if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the tab is selected, `NO` otherwise.
     */
    @Generated
    @IsOptional
    @Selector("isSelectedForWebExtensionContext:")
    default boolean isSelectedForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to load a URL in the tab.
     * 
     * If the tab is already loading a page, calling this method should stop the current page from loading and start
     * loading the new URL. Loads the URL in the tab's web view via ``loadRequest:`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param url               The URL to be loaded in the tab.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("loadURL:forWebExtensionContext:completionHandler:")
    default void loadURLForWebExtensionContextCompletionHandler(@NotNull NSURL url,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_loadURLForWebExtensionContextCompletionHandler") @NotNull Block_loadURLForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadURLForWebExtensionContextCompletionHandler {
        @Generated
        void call_loadURLForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called when the parent tab for the tab is needed.
     * 
     * Defaults to `nil` if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return The parent tab of the tab, if the tab was opened from another tab.
     * @see setParentTab:forWebExtensionContext:completionHandler:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("parentTabForWebExtensionContext:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    default WKWebExtensionTab parentTabForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the pending URL of the tab is needed.
     * 
     * The pending URL is the URL of a page that is in the process of loading. If there is no pending URL, return `nil`.
     * Defaults to `nil` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The pending URL of the tab.
     */
    @Generated
    @IsOptional
    @Selector("pendingURLForWebExtensionContext:")
    @Nullable
    default NSURL pendingURLForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to reload the current page in the tab.
     * 
     * Reloads the tab's web view via ``reload`` or ``reloadFromOrigin`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param fromOrigin        A boolean value indicating whether to reload the tab from the origin, bypassing the
     *                          cache.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("reloadFromOrigin:forWebExtensionContext:completionHandler:")
    default void reloadFromOriginForWebExtensionContextCompletionHandler(boolean fromOrigin,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_reloadFromOriginForWebExtensionContextCompletionHandler") @NotNull Block_reloadFromOriginForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reloadFromOriginForWebExtensionContextCompletionHandler {
        @Generated
        void call_reloadFromOriginForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the mute state of the tab.
     * 
     * No action is performed if not implemented.
     * 
     * @param muted             A boolean indicating whether the tab should be muted.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see isMutedForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setMuted:forWebExtensionContext:completionHandler:")
    default void setMutedForWebExtensionContextCompletionHandler(boolean muted, @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setMutedForWebExtensionContextCompletionHandler") @NotNull Block_setMutedForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMutedForWebExtensionContextCompletionHandler {
        @Generated
        void call_setMutedForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set or clear the parent tab for the tab.
     * 
     * No action is performed if not implemented.
     * 
     * @param parentTab         The tab that should be set as the parent of the tab. If \c nil is provided, the current
     *                          parent tab should be cleared.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see parentTabForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setParentTab:forWebExtensionContext:completionHandler:")
    default void setParentTabForWebExtensionContextCompletionHandler(
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab parentTab,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setParentTabForWebExtensionContextCompletionHandler") @NotNull Block_setParentTabForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setParentTabForWebExtensionContextCompletionHandler {
        @Generated
        void call_setParentTabForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the pinned state of the tab.
     * 
     * This is equivalent to the user selecting to pin or unpin the tab through a menu item. When a tab is pinned,
     * it should be moved to the front of the tab bar and usually reduced in size. When a tab is unpinned, it should be
     * restored
     * to a normal size and position in the tab bar. No action is performed if not implemented.
     * 
     * @param pinned            A boolean value indicating whether to pin the tab.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see isPinnedForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setPinned:forWebExtensionContext:completionHandler:")
    default void setPinnedForWebExtensionContextCompletionHandler(boolean pinned,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setPinnedForWebExtensionContextCompletionHandler") @NotNull Block_setPinnedForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPinnedForWebExtensionContextCompletionHandler {
        @Generated
        void call_setPinnedForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the reader mode for the tab.
     * 
     * No action is performed if not implemented.
     * 
     * @param active            A boolean value indicating whether to activate reader mode.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see isReaderModeAvailableForWebExtensionContext:
     * @see isReaderModeActiveForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setReaderModeActive:forWebExtensionContext:completionHandler:")
    default void setReaderModeActiveForWebExtensionContextCompletionHandler(boolean active,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setReaderModeActiveForWebExtensionContextCompletionHandler") @NotNull Block_setReaderModeActiveForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReaderModeActiveForWebExtensionContextCompletionHandler {
        @Generated
        void call_setReaderModeActiveForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the selected state of the tab.
     * 
     * This is equivalent to the user command-clicking on the tab to add it to or remove it from a selection.
     * The method should update the tab's selection state without changing the active tab. No action is performed if not
     * implemented.
     * 
     * @param selected          A boolean value indicating whether to select the tab.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see isSelectedForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setSelected:forWebExtensionContext:completionHandler:")
    default void setSelectedForWebExtensionContextCompletionHandler(boolean selected,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setSelectedForWebExtensionContextCompletionHandler") @NotNull Block_setSelectedForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSelectedForWebExtensionContextCompletionHandler {
        @Generated
        void call_setSelectedForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the zoom factor of the tab.
     * 
     * Sets ``pageZoom`` of the tab's web view if not implemented.
     * 
     * @param zoomFactor        The desired zoom factor for the tab.
     * @param context           The context in which the web extension is running.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see zoomFactorForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setZoomFactor:forWebExtensionContext:completionHandler:")
    default void setZoomFactorForWebExtensionContextCompletionHandler(double zoomFactor,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setZoomFactorForWebExtensionContextCompletionHandler") @NotNull Block_setZoomFactorForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setZoomFactorForWebExtensionContextCompletionHandler {
        @Generated
        void call_setZoomFactorForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to determine if the tab should bypass host permission checks.
     * 
     * This method allows the app to dynamically control whether a tab can bypass standard host permission checks.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` to bypass host permission checks, `NO` to enforce them.
     */
    @Generated
    @IsOptional
    @Selector("shouldBypassPermissionsForWebExtensionContext:")
    default boolean shouldBypassPermissionsForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to determine if permissions should be granted for the tab on user gesture.
     * 
     * This method allows the app to control granting of permissions on a per-tab basis when triggered by a user
     * gesture. Implementing this method enables the app to dynamically manage `activeTab` permissions based on the
     * tab's
     * current state, the content being accessed, or other custom criteria.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if permissions should be granted to the tab, `NO` otherwise.
     */
    @Generated
    @IsOptional
    @Selector("shouldGrantPermissionsOnUserGestureForWebExtensionContext:")
    default boolean shouldGrantPermissionsOnUserGestureForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the size of the tab is needed.
     * 
     * Defaults to size of the tab's web view if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The size of the tab.
     */
    @Generated
    @IsOptional
    @Selector("sizeForWebExtensionContext:")
    @ByValue
    default CGSize sizeForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("takeSnapshotUsingConfiguration:forWebExtensionContext:completionHandler:")
    default void takeSnapshotUsingConfigurationForWebExtensionContextCompletionHandler(
            @NotNull WKSnapshotConfiguration configuration, @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_takeSnapshotUsingConfigurationForWebExtensionContextCompletionHandler") @NotNull Block_takeSnapshotUsingConfigurationForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_takeSnapshotUsingConfigurationForWebExtensionContextCompletionHandler {
        @Generated
        void call_takeSnapshotUsingConfigurationForWebExtensionContextCompletionHandler(@Nullable UIImage webpageImage,
                @Nullable NSError error);
    }

    /**
     * Called when the title of the tab is needed.
     * 
     * Defaults to ``title`` of the tab's web view if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The title of the tab.
     */
    @Generated
    @IsOptional
    @Selector("titleForWebExtensionContext:")
    @Nullable
    default String titleForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the URL of the tab is needed.
     * 
     * Defaults to `URL` of the tab's web view if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The URL of the tab.
     */
    @Generated
    @IsOptional
    @Selector("urlForWebExtensionContext:")
    @Nullable
    default NSURL urlForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the web view for the tab is needed.
     * 
     * The web view's ``WKWebViewConfiguration`` must have its ``webExtensionController`` property set to match
     * the controller of the given context; otherwise `nil` will be used. Defaults to `nil` if not implemented. If
     * `nil`, some critical features
     * will not be available for this tab, such as content injection or modification.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The web view for the tab.
     */
    @Generated
    @IsOptional
    @Selector("webViewForWebExtensionContext:")
    @Nullable
    default WKWebView webViewForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the window containing the tab is needed.
     * 
     * Defaults to `nil` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The window containing the tab.
     */
    @Generated
    @IsOptional
    @Selector("windowForWebExtensionContext:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    default WKWebExtensionWindow windowForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the zoom factor of the tab is needed.
     * 
     * Defaults to ``pageZoom`` of the tab's web view if not implemented.
     * 
     * @param context The context in which the web extension is running.
     * @return The zoom factor of the tab.
     * @see setZoomFactor:forWebExtensionContext:completionHandler:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("zoomFactorForWebExtensionContext:")
    default double zoomFactorForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }
}
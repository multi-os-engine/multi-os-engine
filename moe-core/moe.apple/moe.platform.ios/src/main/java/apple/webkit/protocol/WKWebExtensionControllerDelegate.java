package apple.webkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.webkit.WKWebExtensionAction;
import apple.webkit.WKWebExtensionContext;
import apple.webkit.WKWebExtensionController;
import apple.webkit.WKWebExtensionMatchPattern;
import apple.webkit.WKWebExtensionMessagePort;
import apple.webkit.WKWebExtensionTabConfiguration;
import apple.webkit.WKWebExtensionWindowConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKWebExtensionControllerDelegate")
public interface WKWebExtensionControllerDelegate {
    /**
     * Called when an extension context wants to establish a persistent connection to an application.
     * 
     * This method should be implemented by the app to handle establishing connections to applications.
     * The provided ``WKWebExtensionPort`` object can be used to handle message sending, receiving, and disconnection.
     * You should retain the port object for as long as the connection remains active. Releasing the port will
     * disconnect it.
     * If not implemented, the default behavior is to pass the messages to the app extension handler within the
     * extension's bundle,
     * if the extension was loaded from an app extension bundle; otherwise, no action is performed if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param extensionContext  The context in which the web extension is running.
     * @param port              A port object for handling the message exchange.
     * @param completionHandler A block to be called when the connection is ready to use, taking an optional error.
     *                          If the connection is successfully established, the error should be \c nil.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:connectUsingMessagePort:forExtensionContext:completionHandler:")
    default void webExtensionControllerConnectUsingMessagePortForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionMessagePort port,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerConnectUsingMessagePortForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerConnectUsingMessagePortForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerConnectUsingMessagePortForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerConnectUsingMessagePortForExtensionContextCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * Called when an action's properties are updated.
     * 
     * This method is called when an action's properties are updated and should be reflected in the app's user
     * interface.
     * The app should ensure that any visible changes, such as icons and labels, are updated accordingly.
     * 
     * API-Since: 18.4
     * 
     * @param controller The web extension controller initiating the request.
     * @param action     The web extension action whose properties are updated.
     * @param context    The context within which the web extension is running.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:didUpdateAction:forExtensionContext:")
    default void webExtensionControllerDidUpdateActionForExtensionContext(@NotNull WKWebExtensionController controller,
            @NotNull WKWebExtensionAction action, @NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when an extension context requests the currently focused window.
     * 
     * This method can be optionally implemented by the app to designate the window currently in focus to the extension.
     * If not implemented, the first window in the result of ``webExtensionController:openWindowsForExtensionContext:``
     * is used.
     * 
     * @param controller       The web extension controller that is managing the extension.
     * @param extensionContext The context in which the web extension is running.
     * @return The window that is currently focused, or `nil` if no window is focused or the focused window is not
     *         visible to the extension.
     * @see webExtensionController:openWindowsForExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:focusedWindowForExtensionContext:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    default WKWebExtensionWindow webExtensionControllerFocusedWindowForExtensionContext(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionContext extensionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when an extension context requests a new tab to be opened.
     * 
     * This method should be implemented by the app to handle requests to open new tabs. The app can decide how to
     * handle the
     * process based on the provided configuration and existing tabs. Once handled, the app should call the completion
     * handler with the opened tab
     * or `nil` if the request was declined or failed. If not implemented, the extension will be unable to open new
     * tabs.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param configuration     The configuration specifying how the new tab should be created.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called with the newly created tab or \c nil if the tab wasn't created. An
     *                          error should be
     *                          provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:openNewTabUsingConfiguration:forExtensionContext:completionHandler:")
    default void webExtensionControllerOpenNewTabUsingConfigurationForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionTabConfiguration configuration,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerOpenNewTabUsingConfigurationForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerOpenNewTabUsingConfigurationForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerOpenNewTabUsingConfigurationForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerOpenNewTabUsingConfigurationForExtensionContextCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab newTab, @Nullable NSError error);
    }

    /**
     * Called when an extension context requests a new window to be opened.
     * 
     * This method should be implemented by the app to handle requests to open new windows. The app can decide how to
     * handle the
     * process based on the provided configuration and existing windows. Once handled, the app should call the
     * completion handler with the opened window
     * or `nil` if the request was declined or failed. If not implemented, the extension will be unable to open new
     * windows.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param configuration     The configuration specifying how the new window should be created.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called with the newly created window or \c nil if the window wasn't
     *                          created. An error should be
     *                          provided if any errors occurred.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:openNewWindowUsingConfiguration:forExtensionContext:completionHandler:")
    default void webExtensionControllerOpenNewWindowUsingConfigurationForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionWindowConfiguration configuration,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerOpenNewWindowUsingConfigurationForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerOpenNewWindowUsingConfigurationForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerOpenNewWindowUsingConfigurationForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerOpenNewWindowUsingConfigurationForExtensionContextCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionWindow newWindow, @Nullable NSError error);
    }

    /**
     * Called when an extension context requests its options page to be opened.
     * 
     * This method should be implemented by the app to handle requests to display the extension's options page. The app
     * can decide
     * how and where to display the options page (e.g., in a new tab or a separate window). The app should call the
     * completion handler once the options
     * page is visible to the user, or with an error if the operation was declined or failed. If not implemented, the
     * options page will be opened in a new tab
     * using the ``webExtensionController:openNewTabUsingConfiguration:forExtensionContext:completionHandler:`` delegate
     * method.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called once the options page has been displayed or with an error if the
     *                          page could not be shown.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:openOptionsPageForExtensionContext:completionHandler:")
    default void webExtensionControllerOpenOptionsPageForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerOpenOptionsPageForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerOpenOptionsPageForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerOpenOptionsPageForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerOpenOptionsPageForExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called when an extension context requests the list of ordered open windows.
     * 
     * This method should be implemented by the app to provide the extension with the ordered open windows. Depending on
     * your
     * app's requirements, you may return different windows for each extension or the same windows for all extensions.
     * The first window in the returned
     * array must correspond to the currently focused window and match the result of
     * ``webExtensionController:focusedWindowForExtensionContext:``.
     * If ``webExtensionController:focusedWindowForExtensionContext:`` returns `nil`, indicating that no window has
     * focus or the focused
     * window is not visible to the extension, the first window in the list returned by this method will be considered
     * the presumed focused window. An empty result
     * indicates no open windows are available for the extension. Defaults to an empty array if not implemented.
     * 
     * @param controller       The web extension controller that is managing the extension.
     * @param extensionContext The context in which the web extension is running.
     * @return The array of ordered open windows.
     * @see webExtensionController:focusedWindowForExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:openWindowsForExtensionContext:")
    @NotNull
    default NSArray<?> webExtensionControllerOpenWindowsForExtensionContext(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionContext extensionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a popup is requested to be displayed for a specific action.
     * 
     * This method is called in response to the extension's scripts or when invoking ``performActionForTab:`` if the
     * action has a popup.
     * The associated tab, if applicable, can be located through the ``associatedTab`` property of the ``action``
     * parameter. This delegate method is
     * called when the web view for the popup is fully loaded and ready to display. Implementing this method is needed
     * if the app intends to support
     * programmatically showing the popup by the extension, although it is recommended for handling both programmatic
     * and user-initiated cases.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller initiating the request.
     * @param action            The action for which the popup is requested.
     * @param context           The context within which the web extension is running.
     * @param completionHandler A block to be called once the popup display operation is completed.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:presentPopupForAction:forExtensionContext:completionHandler:")
    default void webExtensionControllerPresentPopupForActionForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull WKWebExtensionAction action,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_webExtensionControllerPresentPopupForActionForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerPresentPopupForActionForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerPresentPopupForActionForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerPresentPopupForActionForExtensionContextCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * Called when an extension context requests access to a set of match patterns.
     * 
     * This method should be implemented by the app to prompt the user for permission and call the completion handler
     * with the
     * set of match patterns that were granted access to and an optional expiration date. If not implemented or the
     * completion handler is not called
     * within a reasonable amount of time, the request is assumed to have been denied. The expiration date can be used
     * to specify when the match
     * patterns expire. If `nil`, match patterns are assumed to not expire.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param matchPatterns     The set of match patterns that the extension is requesting access to.
     * @param tab               The tab in which the extension is running, or \c nil if the request is not specific to a
     *                          tab.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called with the set of allowed match patterns and an optional expiration
     *                          date.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:promptForPermissionMatchPatterns:inTab:forExtensionContext:completionHandler:")
    default void webExtensionControllerPromptForPermissionMatchPatternsInTabForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller,
            @NotNull NSSet<? extends WKWebExtensionMatchPattern> matchPatterns,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerPromptForPermissionMatchPatternsInTabForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerPromptForPermissionMatchPatternsInTabForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerPromptForPermissionMatchPatternsInTabForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerPromptForPermissionMatchPatternsInTabForExtensionContextCompletionHandler(
                @NotNull NSSet<? extends WKWebExtensionMatchPattern> allowedMatchPatterns,
                @Nullable NSDate expirationDate);
    }

    /**
     * Called when an extension context requests access to a set of URLs.
     * 
     * This method should be implemented by the app to prompt the user for permission and call the completion handler
     * with the
     * set of URLs that were granted access to and an optional expiration date. If not implemented or the completion
     * handler is not called within a
     * reasonable amount of time, the request is assumed to have been denied. The expiration date can be used to specify
     * when the URLs expire.
     * If `nil`, URLs are assumed to not expire.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param urls              The set of URLs that the extension is requesting access to.
     * @param tab               The tab in which the extension is running, or \c nil if the request is not specific to a
     *                          tab.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called with the set of allowed URLs and an optional expiration date.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:promptForPermissionToAccessURLs:inTab:forExtensionContext:completionHandler:")
    default void webExtensionControllerPromptForPermissionToAccessURLsInTabForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull NSSet<? extends NSURL> urls,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerPromptForPermissionToAccessURLsInTabForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerPromptForPermissionToAccessURLsInTabForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerPromptForPermissionToAccessURLsInTabForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerPromptForPermissionToAccessURLsInTabForExtensionContextCompletionHandler(
                @NotNull NSSet<? extends NSURL> allowedURLs, @Nullable NSDate expirationDate);
    }

    /**
     * Called when an extension context requests permissions.
     * 
     * This method should be implemented by the app to prompt the user for permission and call the completion handler
     * with the
     * set of permissions that were granted and an optional expiration date. If not implemented or the completion
     * handler is not called within a reasonable
     * amount of time, the request is assumed to have been denied. The expiration date can be used to specify when the
     * permissions expire. If `nil`,
     * permissions are assumed to not expire.
     * 
     * API-Since: 18.4
     * 
     * @param controller        The web extension controller that is managing the extension.
     * @param permissions       The set of permissions being requested by the extension.
     * @param tab               The tab in which the extension is running, or \c nil if the request is not specific to a
     *                          tab.
     * @param extensionContext  The context in which the web extension is running.
     * @param completionHandler A block to be called with the set of allowed permissions and an optional expiration
     *                          date.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:promptForPermissions:inTab:forExtensionContext:completionHandler:")
    default void webExtensionControllerPromptForPermissionsInTabForExtensionContextCompletionHandler(
            @NotNull WKWebExtensionController controller, @NotNull NSSet<String> permissions,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerPromptForPermissionsInTabForExtensionContextCompletionHandler") @NotNull Block_webExtensionControllerPromptForPermissionsInTabForExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerPromptForPermissionsInTabForExtensionContextCompletionHandler {
        @Generated
        void call_webExtensionControllerPromptForPermissionsInTabForExtensionContextCompletionHandler(
                @NotNull NSSet<String> allowedPermissions, @Nullable NSDate expirationDate);
    }

    /**
     * Called when an extension context wants to send a one-time message to an application.
     * 
     * This method should be implemented by the app to handle one-off messages to applications.
     * If not implemented, the default behavior is to pass the message to the app extension handler within the
     * extension's bundle,
     * if the extension was loaded from an app extension bundle; otherwise, no action is performed if not implemented.
     * [@note] The reply message must be JSON-serializable according to ``NSJSONSerialization``.
     * 
     * API-Since: 18.4
     * 
     * @param controller            The web extension controller that is managing the extension.
     * @param message               The message to be sent.
     * @param applicationIdentifier The unique identifier for the application, or \c nil if none was specified.
     * @param extensionContext      The context in which the web extension is running.
     * @param replyHandler          A block to be called with a JSON-serializable reply message or an error.
     */
    @Generated
    @IsOptional
    @Selector("webExtensionController:sendMessage:toApplicationWithIdentifier:forExtensionContext:replyHandler:")
    default void webExtensionControllerSendMessageToApplicationWithIdentifierForExtensionContextReplyHandler(
            @NotNull WKWebExtensionController controller, @Mapped(ObjCObjectMapper.class) @NotNull Object message,
            @Nullable String applicationIdentifier, @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_webExtensionControllerSendMessageToApplicationWithIdentifierForExtensionContextReplyHandler") @NotNull Block_webExtensionControllerSendMessageToApplicationWithIdentifierForExtensionContextReplyHandler replyHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webExtensionControllerSendMessageToApplicationWithIdentifierForExtensionContextReplyHandler {
        @Generated
        void call_webExtensionControllerSendMessageToApplicationWithIdentifierForExtensionContextReplyHandler(
                @Mapped(ObjCObjectMapper.class) @Nullable Object replyMessage, @Nullable NSError error);
    }
}
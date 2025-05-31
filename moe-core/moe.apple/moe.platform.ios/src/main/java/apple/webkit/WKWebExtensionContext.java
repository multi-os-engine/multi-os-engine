package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIKeyCommand;
import apple.uikit.UIMenuElement;
import apple.webkit.protocol.WKWebExtensionTab;
import apple.webkit.protocol.WKWebExtensionWindow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A ``WKWebExtensionContext`` object represents the runtime environment for a web extension.
 * 
 * This class provides methods for managing the extension's permissions, allowing it to inject content, run
 * background logic, show popovers, and display other web-based UI to the user.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Retrieves the extension action for a given tab, or the default action if `nil` is passed.
     * 
     * The returned object represents the action specific to the tab when provided; otherwise, it returns the default
     * action. The default
     * action is useful when the context is unrelated to a specific tab. When possible, specify the tab to get the most
     * context-relevant action.
     * 
     * @param tab The tab for which to retrieve the extension action, or `nil` to get the default action.
     * @see performActionForTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("actionForTab:")
    @Nullable
    public native WKWebExtensionAction actionForTab(@Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionContext allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The base URL the context uses for loading extension resources or injecting content into webpages.
     * 
     * The default value is a unique URL using the `webkit-extension` scheme.
     * The base URL can be set to any URL, but only the scheme and host will be used. The scheme cannot be a scheme that
     * is
     * already supported by ``WKWebView`` (e.g. http, https, etc.) Setting is only allowed when the context is not
     * loaded.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("baseURL")
    @NotNull
    public native NSURL baseURL();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Should be called by the app to clear a user gesture in a specific tab.
     * 
     * When a user gesture is no longer relevant in a tab, this method should be called to update the extension context.
     * This will revoke the extension's access to features that require active user interaction, such as `activeTab`.
     * User gestures are
     * automatically cleared during navigation in certain scenarios; this method is needed if the app intends to clear
     * the gesture more aggressively.
     * 
     * @param tab The tab from which the user gesture should be cleared.
     * @see userGesturePerformedInTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("clearUserGestureInTab:")
    public native void clearUserGestureInTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab tab);

    /**
     * The commands associated with the extension.
     * 
     * Provides all commands registered within the extension. Each command represents an action or behavior available
     * for the web extension.
     * 
     * @see performCommand:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("commands")
    @NotNull
    public native NSArray<? extends WKWebExtensionCommand> commands();

    /**
     * Returns a web extension context initialized with the specified extension.
     * 
     * @param extension The extension to use for the new web extension context.
     * @return An initialized web extension context.
     * 
     *         API-Since: 18.4
     */
    @Generated
    @Selector("contextForExtension:")
    public static native WKWebExtensionContext contextForExtension(@NotNull WKWebExtension extension);

    /**
     * The currently granted permission match patterns that have not expired.
     * 
     * @see grantedPermissionMatchPatterns
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("currentPermissionMatchPatterns")
    @NotNull
    public native NSSet<? extends WKWebExtensionMatchPattern> currentPermissionMatchPatterns();

    /**
     * The currently granted permissions that have not expired.
     * 
     * @see grantedPermissions
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("currentPermissions")
    @NotNull
    public native NSSet<String> currentPermissions();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The currently denied permission match patterns and their expiration dates.
     * 
     * Match patterns that don't expire will have a distant future date. This will never include expired entries at time
     * of access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Match patterns in this dictionary should be explicitly denied by the user before being added. Any match pattern
     * in this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forMatchPattern:
     * @see setPermissionStatus:forMatchPattern:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("deniedPermissionMatchPatterns")
    @NotNull
    public native NSDictionary<? extends WKWebExtensionMatchPattern, ? extends NSDate> deniedPermissionMatchPatterns();

    /**
     * The currently denied permissions and their expiration dates.
     * 
     * Permissions that don't expire will have a distant future date. This will never include expired entries at time of
     * access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Permissions in this dictionary should be explicitly denied by the user before being added. Any match pattern in
     * this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forPermission:
     * @see setPermissionStatus:forPermission:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("deniedPermissions")
    @NotNull
    public native NSDictionary<String, ? extends NSDate> deniedPermissions();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Should be called by the app when a tab is activated to notify only this specific extension.
     * 
     * This method informs only the specific extension of the tab activation. If the intention is to inform all loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param activatedTab The tab that has become active.
     * @param previousTab  The tab that was active before. This parameter can be \c nil if there was no previously
     *                     active tab.
     */
    @Generated
    @Selector("didActivateTab:previousActiveTab:")
    public native void didActivateTabPreviousActiveTab(
            @Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab activatedTab,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab previousTab);

    /**
     * Should be called by the app when the properties of a tab are changed to fire appropriate events with only this
     * extension.
     * 
     * This method informs only the specific extension of the changes to a tab's properties. If the intention is to
     * inform all loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param properties The properties of the tab that were changed.
     * @param changedTab The tab whose properties were changed.
     */
    @Generated
    @Selector("didChangeTabProperties:forTab:")
    public native void didChangeTabPropertiesForTab(@NUInt long properties,
            @Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab changedTab);

    /**
     * Should be called by the app when a tab is closed to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension of the closure of a tab. If the intention is to inform all loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * @param closedTab       The tab that was closed.
     * @param windowIsClosing A boolean value indicating whether the window containing the tab is also closing.
     * @see didOpenTab:
     * @see openTabs
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didCloseTab:windowIsClosing:")
    public native void didCloseTabWindowIsClosing(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab closedTab,
            boolean windowIsClosing);

    /**
     * Should be called by the app when a window is closed to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension of the closure of a window. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * @param newWindow The window that was closed.
     * @see didOpenWindow:
     * @see openWindows
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didCloseWindow:")
    public native void didCloseWindow(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionWindow closedWindow);

    /**
     * Should be called by the app when tabs are deselected to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension that tabs have been deselected. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param deselectedTabs The set of tabs that were deselected.
     */
    @Generated
    @Selector("didDeselectTabs:")
    public native void didDeselectTabs(@NotNull NSArray<?> deselectedTabs);

    /**
     * Should be called by the app when a window gains focus to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension that a window has gained focus. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param focusedWindow The window that gained focus, or \c nil if no window has focus or a window has focus that is
     *                      not visible to this extension.
     */
    @Generated
    @Selector("didFocusWindow:")
    public native void didFocusWindow(@Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionWindow focusedWindow);

    /**
     * Should be called by the app when a tab is moved to fire appropriate events with only this extension.
     * 
     * If the window is staying the same, the current window should be specified. This method informs only the specific
     * extension
     * that a tab has been moved. If the intention is to inform all loaded extensions consistently, you should use the
     * respective method on
     * the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param movedTab  The tab that was moved.
     * @param index     The old index of the tab within the window.
     * @param oldWindow The window that the tab was moved from, or \c nil if the tab is moving from no open window.
     */
    @Generated
    @Selector("didMoveTab:fromIndex:inWindow:")
    public native void didMoveTabFromIndexInWindow(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab movedTab,
            @NUInt long index, @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionWindow oldWindow);

    /**
     * Should be called by the app when a new tab is opened to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension of the opening of a new tab. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * @param newTab The newly opened tab.
     * @see didCloseTab:
     * @see openTabs
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didOpenTab:")
    public native void didOpenTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab newTab);

    /**
     * Should be called by the app when a new window is opened to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension of the opening of a new window. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * @param newWindow The newly opened window.
     * @see didCloseWindow:
     * @see openWindows
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didOpenWindow:")
    public native void didOpenWindow(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionWindow newWindow);

    /**
     * Should be called by the app when a tab is replaced by another tab to fire appropriate events with only this
     * extension.
     * 
     * This method informs only the specific extension that a tab has been replaced. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param oldTab The tab that was replaced.
     * @param newTab The tab that replaced the old tab.
     */
    @Generated
    @Selector("didReplaceTab:withTab:")
    public native void didReplaceTabWithTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab oldTab,
            @Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab newTab);

    /**
     * Should be called by the app when tabs are selected to fire appropriate events with only this extension.
     * 
     * This method informs only the specific extension that tabs have been selected. If the intention is to inform all
     * loaded
     * extensions consistently, you should use the respective method on the extension controller instead.
     * 
     * API-Since: 18.4
     * 
     * @param selectedTabs The set of tabs that were selected.
     */
    @Generated
    @Selector("didSelectTabs:")
    public native void didSelectTabs(@NotNull NSArray<?> selectedTabs);

    /**
     * All errors that occurred in the extension context.
     * 
     * Provides an array of all parse-time and runtime errors for the extension and extension context, with repeat
     * errors
     * consolidated into a single entry for the original occurrence. If no errors occurred, an empty array is returned.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("errors")
    @NotNull
    public native NSArray<? extends NSError> errors();

    /**
     * The window that currently has focus for this extension.
     * 
     * Provides the window that currently has focus, as set by the ``didFocusWindow:`` method.
     * It will be `nil` if no window has focus or if a window has focus that is not visible to the extension. Initially
     * populated by the window
     * returned by the extension controller delegate method
     * ``webExtensionController:focusedWindowForExtensionContext:``.
     * 
     * @see didFocusWindow:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("focusedWindow")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native WKWebExtensionWindow focusedWindow();

    /**
     * The currently granted permission match patterns and their expiration dates.
     * 
     * Match patterns that don't expire will have a distant future date. This will never include expired entries at time
     * of access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Match patterns in this dictionary should be explicitly granted by the user before being added. Any match pattern
     * in this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forMatchPattern:
     * @see setPermissionStatus:forMatchPattern:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("grantedPermissionMatchPatterns")
    @NotNull
    public native NSDictionary<? extends WKWebExtensionMatchPattern, ? extends NSDate> grantedPermissionMatchPatterns();

    /**
     * The currently granted permissions and their expiration dates.
     * 
     * Permissions that don't expire will have a distant future date. This will never include expired entries at time of
     * access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Permissions in this dictionary should be explicitly granted by the user before being added. Any permissions in
     * this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forPermission:
     * @see setPermissionStatus:forPermission:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("grantedPermissions")
    @NotNull
    public native NSDictionary<String, ? extends NSDate> grantedPermissions();

    /**
     * A Boolean value indicating if the currently granted permission match patterns set contains the `<all_urls>`
     * pattern or any `*` host patterns.
     * 
     * @see currentPermissionMatchPatterns
     * @see hasAccessToAllURLs
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasAccessToAllHosts")
    public native boolean hasAccessToAllHosts();

    /**
     * A Boolean value indicating if the currently granted permission match patterns set contains the `<all_urls>`
     * pattern.
     * 
     * This does not check for any `*` host patterns. In most cases you should use the broader ``hasAccessToAllHosts``.
     * 
     * @see currentPermissionMatchPatterns
     * @see hasAccessToAllHosts
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasAccessToAllURLs")
    public native boolean hasAccessToAllURLs();

    /**
     * A Boolean value indicating if the extension has access to private data.
     * 
     * If this property is `YES`, the extension is granted permission to interact with private windows, tabs, and
     * cookies. Access to private data
     * should be explicitly allowed by the user before setting this property. This value should be saved and restored as
     * needed by the app.
     * [@note] To ensure proper isolation between private and non-private data, web views associated with private data
     * must use a
     * different ``WKUserContentController``. Likewise, to be identified as a private web view and to ensure that
     * cookies and other
     * website data is not shared, private web views must be configured to use a non-persistent ``WKWebsiteDataStore``.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasAccessToPrivateData")
    public native boolean hasAccessToPrivateData();

    /**
     * Checks the specified URL against the currently granted permission match patterns.
     * 
     * @param url The URL for which to return the status.
     * @see currentPermissionMatchPatterns
     * @see hasAccessToURL:inTab:
     * @see permissionStatusForURL:
     * @see permissionStatusForURL:inTab:
     * @see permissionStatusForMatchPattern:
     * @see permissionStatusForMatchPattern:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasAccessToURL:")
    public native boolean hasAccessToURL(@NotNull NSURL url);

    /**
     * Checks the specified URL against the currently granted permission match patterns in a specific tab.
     * 
     * Some match patterns can be granted on a per-tab basis. When the tab is known, access checks should always use
     * this method.
     * 
     * @param url The URL for which to return the status.
     * @param tab The tab in which to return the permission status, or \c nil if the tab is not known or the global
     *            status is desired.
     * @see currentPermissionMatchPatterns
     * @see hasAccessToURL:
     * @see permissionStatusForURL:
     * @see permissionStatusForURL:inTab:
     * @see permissionStatusForMatchPattern:
     * @see permissionStatusForMatchPattern:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasAccessToURL:inTab:")
    public native boolean hasAccessToURLInTab(@NotNull NSURL url,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    /**
     * Indicates if a user gesture is currently active in the specified tab.
     * 
     * An active user gesture may influence the availability of certain permissions, such as `activeTab`. User gestures
     * can
     * be triggered by various user interactions with the web extension, including clicking on extension menu items,
     * executing extension commands,
     * or interacting with extension actions. A tab as having an active user gesture enables the extension to access
     * features that require user interaction.
     * 
     * @param tab The tab for which to check for an active user gesture.
     * @see userGesturePerformedInTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasActiveUserGestureInTab:")
    public native boolean hasActiveUserGestureInTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab tab);

    /**
     * A boolean value indicating whether the extension includes rules used for content modification or blocking.
     * 
     * This includes both static rules available in the extension's manifest and dynamic rules applied during a browsing
     * session.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasContentModificationRules")
    public native boolean hasContentModificationRules();

    /**
     * A Boolean value indicating whether the extension has script or stylesheet content that can be injected into
     * webpages.
     * 
     * If this property is `YES`, the extension has content that can be injected by matching against the extension's
     * requested match patterns.
     * 
     * @see hasInjectedContentForURL:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasInjectedContent")
    public native boolean hasInjectedContent();

    /**
     * Checks if the extension has script or stylesheet content that can be injected into the specified URL.
     * 
     * The extension context will still need to be loaded and have granted website permissions for its content to
     * actually be injected.
     * 
     * API-Since: 18.4
     * 
     * @param url The webpage URL to check.
     * @return Returns `YES` if the extension has content that can be injected by matching the URL against the
     *         extension's requested match patterns.
     */
    @Generated
    @Selector("hasInjectedContentForURL:")
    public native boolean hasInjectedContentForURL(@NotNull NSURL url);

    /**
     * Checks the specified permission against the currently granted permissions.
     * 
     * @param permission The permission for which to return the status.
     * @see currentPermissions
     * @see hasPermission:inTab:
     * @see permissionStatusForPermission:
     * @see permissionStatusForPermission:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasPermission:")
    public native boolean hasPermission(@NotNull String permission);

    /**
     * Checks the specified permission against the currently granted permissions in a specific tab.
     * 
     * Permissions can be granted on a per-tab basis. When the tab is known, permission checks should always use this
     * method.
     * 
     * @param permission The permission for which to return the status.
     * @param tab        The tab in which to return the permission status, or \c nil if the tab is not known or the
     *                   global status is desired.
     * @see currentPermissions
     * @see hasPermission:
     * @see permissionStatusForPermission:
     * @see permissionStatusForPermission:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("hasPermission:inTab:")
    public native boolean hasPermissionInTab(@NotNull String permission,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    /**
     * A Boolean value indicating if the extension has requested optional access to all hosts.
     * 
     * If this property is `YES`, the extension has asked for access to all hosts in a call to
     * `browser.runtime.permissions.request()`,
     * and future permission checks will present discrete hosts for approval as being implicitly requested. This value
     * should be saved and restored as needed by the app.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("hasRequestedOptionalAccessToAllHosts")
    public native boolean hasRequestedOptionalAccessToAllHosts();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKWebExtensionContext init();

    /**
     * Returns a web extension context initialized with a specified extension.
     * 
     * This is a designated initializer.
     * 
     * API-Since: 18.4
     * 
     * @param extension The extension to use for the new web extension context.
     * @return An initialized web extension context.
     */
    @Generated
    @Selector("initForExtension:")
    public native WKWebExtensionContext initForExtension(@NotNull WKWebExtension extension);

    /**
     * The name shown when inspecting the background web view.
     * 
     * This is the text that will appear when inspecting the background web view.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("inspectionName")
    @Nullable
    public native String inspectionName();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * Determines whether Web Inspector can inspect the ``WKWebView`` instances for this context.
     * 
     * A context can control multiple ``WKWebView`` instances, from the background content, to the popover.
     * You should set this to `YES` when needed for debugging purposes. The default value is `NO`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isInspectable")
    public native boolean isInspectable();

    /**
     * A Boolean value indicating if this context is loaded in an extension controller.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isLoaded")
    public native boolean isLoaded();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Loads the background content if needed for the extension.
     * 
     * This method forces the loading of the background content for the extension that will otherwise be loaded
     * on-demand during specific events.
     * It is useful when the app requires the background content to be loaded for other reasons. If the background
     * content is already loaded, the completion handler
     * will be called immediately. An error will occur if the extension does not have any background content to load or
     * loading fails.
     * 
     * API-Since: 18.4
     * 
     * @param completionHandler A block to be called upon completion of the loading process, with an optional error.
     */
    @Generated
    @Selector("loadBackgroundContentWithCompletionHandler:")
    public native void loadBackgroundContentWithCompletionHandler(
            @ObjCBlock(name = "call_loadBackgroundContentWithCompletionHandler") @NotNull Block_loadBackgroundContentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadBackgroundContentWithCompletionHandler {
        @Generated
        void call_loadBackgroundContentWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("menuItemsForTab:")
    @NotNull
    public native NSArray<? extends UIMenuElement> menuItemsForTab(
            @Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab tab);

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionContext new_objc();

    /**
     * A set of open tabs in all open windows that are exposed to this extension.
     * 
     * Provides a set of tabs in all open windows that are visible to the extension, as updated by the ``didOpenTab:``
     * and ``didCloseTab:`` methods.
     * Initially populated by the tabs in the windows returned by the extension controller delegate method
     * ``webExtensionController:openWindowsForExtensionContext:``.
     * 
     * @see didOpenTab:
     * @see didCloseTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("openTabs")
    @NotNull
    public native NSSet<?> openTabs();

    /**
     * The open windows that are exposed to this extension.
     * 
     * Provides the windows that are open and visible to the extension, as updated by the ``didOpenWindow:`` and
     * ``didCloseWindow:`` methods.
     * Initially populated by the windows returned by the extension controller delegate method
     * ``webExtensionController:openWindowsForExtensionContext:``.
     * 
     * @see didOpenWindow:
     * @see didCloseWindow:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("openWindows")
    @NotNull
    public native NSArray<?> openWindows();

    /**
     * The URL of the extension's options page, if the extension has one.
     * 
     * Provides the URL for the dedicated options page, if provided by the extension; otherwise `nil` if no page is
     * defined.
     * The app should provide access to this page through a user interface element.
     * [@note] Navigation to the options page is only possible after this extension has been loaded.
     * 
     * @see webViewConfiguration
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("optionsPageURL")
    @Nullable
    public native NSURL optionsPageURL();

    /**
     * The URL to use as an alternative to the default new tab page, if the extension has one.
     * 
     * Provides the URL for a new tab page, if provided by the extension; otherwise `nil` if no page is defined.
     * The app should prompt the user for permission to use the extension's new tab page as the default.
     * [@note] Navigation to the override new tab page is only possible after this extension has been loaded.
     * 
     * @see webViewConfiguration
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("overrideNewTabPageURL")
    @Nullable
    public native NSURL overrideNewTabPageURL();

    /**
     * Performs the extension action associated with the specified tab or performs the default action if `nil` is
     * passed.
     * 
     * Performing the action will mark the tab, if specified, as having an active user gesture. When the ``tab``
     * parameter is `nil`,
     * the default action is performed. The action can either trigger an event or display a popup, depending on how the
     * extension is configured.
     * If the action is configured to display a popup, implementing the appropriate web extension controller delegate
     * method is required; otherwise,
     * no action is performed for popup actions.
     * 
     * API-Since: 18.4
     * 
     * @param tab The tab for which to perform the extension action, or `nil` to perform the default action.
     */
    @Generated
    @Selector("performActionForTab:")
    public native void performActionForTab(@Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    /**
     * Performs the specified command, triggering events specific to this extension.
     * 
     * This method performs the given command as if it was triggered by a user gesture within the context of the focused
     * window and active tab.
     * 
     * API-Since: 18.4
     * 
     * @param command The command to be performed.
     */
    @Generated
    @Selector("performCommand:")
    public native void performCommand(@NotNull WKWebExtensionCommand command);

    /**
     * Performs the command associated with the given key command.
     * 
     * This method checks for a command corresponding to the provided ``UIKeyCommand`` and performs it, if available.
     * The app should use this method to perform
     * any extension commands at an appropriate time in the app's responder object that handles the
     * ``performWebExtensionCommandForKeyCommand:`` action.
     * 
     * @param keyCommand The key command received by the first responder.
     * @return Returns `YES` if a command corresponding to the UIKeyCommand was found and performed, `NO` otherwise.
     * 
     *         API-Since: 18.4
     */
    @Generated
    @Selector("performCommandForKeyCommand:")
    public native boolean performCommandForKeyCommand(@NotNull UIKeyCommand keyCommand);

    /**
     * Checks the specified match pattern against the currently denied, granted, and requested permission match
     * patterns.
     * 
     * Match patterns can be granted on a per-tab basis. When the tab is known, access checks should always use the
     * method that checks in a tab.
     * 
     * @param pattern The pattern for which to return the status.
     * @see permissionStatusForMatchPattern:inTab:
     * @see hasAccessToURL:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForMatchPattern:")
    @NInt
    public native long permissionStatusForMatchPattern(@NotNull WKWebExtensionMatchPattern pattern);

    /**
     * Checks the specified match pattern against the currently denied, granted, and requested permission match
     * patterns.
     * 
     * Match patterns can be granted on a per-tab basis. When the tab is known, access checks should always use this
     * method.
     * 
     * @param pattern The pattern for which to return the status.
     * @param tab     The tab in which to return the permission status, or \c nil if the tab is not known or the global
     *                status is desired.
     * @see permissionStatusForMatchPattern:
     * @see hasAccessToURL:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForMatchPattern:inTab:")
    @NInt
    public native long permissionStatusForMatchPatternInTab(@NotNull WKWebExtensionMatchPattern pattern,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    /**
     * Checks the specified permission against the currently denied, granted, and requested permissions.
     * 
     * Permissions can be granted on a per-tab basis. When the tab is known, access checks should always use the method
     * that checks in a tab.
     * 
     * @param permission The permission for which to return the status.
     * @see permissionStatusForPermission:inTab:
     * @see hasPermission:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForPermission:")
    @NInt
    public native long permissionStatusForPermission(@NotNull String permission);

    /**
     * Checks the specified permission against the currently denied, granted, and requested permissions.
     * 
     * Permissions can be granted on a per-tab basis. When the tab is known, access checks should always specify the
     * tab.
     * 
     * @param permission The permission for which to return the status.
     * @param tab        The tab in which to return the permission status, or \c nil if the tab is not known or the
     *                   global status is desired.
     * @see permissionStatusForPermission:
     * @see hasPermission:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForPermission:inTab:")
    @NInt
    public native long permissionStatusForPermissionInTab(@NotNull String permission,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    /**
     * Checks the specified URL against the currently denied, granted, and requested permission match patterns.
     * 
     * URLs and match patterns can be granted on a per-tab basis. When the tab is known, access checks should always use
     * the method that checks in a tab.
     * 
     * @param url The URL for which to return the status.
     * @see permissionStatusForURL:inTab:
     * @see hasAccessToURL:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForURL:")
    @NInt
    public native long permissionStatusForURL(@NotNull NSURL url);

    /**
     * Checks the specified URL against the currently denied, granted, and requested permission match patterns.
     * 
     * URLs and match patterns can be granted on a per-tab basis. When the tab is known, access checks should always use
     * this method.
     * 
     * @param url The URL for which to return the status.
     * @param tab The tab in which to return the permission status, or \c nil if the tab is not known or the global
     *            status is desired.
     * @see permissionStatusForURL:
     * @see hasAccessToURL:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("permissionStatusForURL:inTab:")
    @NInt
    public native long permissionStatusForURLInTab(@NotNull NSURL url,
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionTab tab);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The base URL the context uses for loading extension resources or injecting content into webpages.
     * 
     * The default value is a unique URL using the `webkit-extension` scheme.
     * The base URL can be set to any URL, but only the scheme and host will be used. The scheme cannot be a scheme that
     * is
     * already supported by ``WKWebView`` (e.g. http, https, etc.) Setting is only allowed when the context is not
     * loaded.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setBaseURL:")
    public native void setBaseURL(@NotNull NSURL value);

    /**
     * The currently denied permission match patterns and their expiration dates.
     * 
     * Match patterns that don't expire will have a distant future date. This will never include expired entries at time
     * of access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Match patterns in this dictionary should be explicitly denied by the user before being added. Any match pattern
     * in this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forMatchPattern:
     * @see setPermissionStatus:forMatchPattern:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setDeniedPermissionMatchPatterns:")
    public native void setDeniedPermissionMatchPatterns(
            @NotNull NSDictionary<? extends WKWebExtensionMatchPattern, ? extends NSDate> value);

    /**
     * The currently denied permissions and their expiration dates.
     * 
     * Permissions that don't expire will have a distant future date. This will never include expired entries at time of
     * access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Permissions in this dictionary should be explicitly denied by the user before being added. Any match pattern in
     * this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forPermission:
     * @see setPermissionStatus:forPermission:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setDeniedPermissions:")
    public native void setDeniedPermissions(@NotNull NSDictionary<String, ? extends NSDate> value);

    /**
     * The currently granted permission match patterns and their expiration dates.
     * 
     * Match patterns that don't expire will have a distant future date. This will never include expired entries at time
     * of access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Match patterns in this dictionary should be explicitly granted by the user before being added. Any match pattern
     * in this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forMatchPattern:
     * @see setPermissionStatus:forMatchPattern:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setGrantedPermissionMatchPatterns:")
    public native void setGrantedPermissionMatchPatterns(
            @NotNull NSDictionary<? extends WKWebExtensionMatchPattern, ? extends NSDate> value);

    /**
     * The currently granted permissions and their expiration dates.
     * 
     * Permissions that don't expire will have a distant future date. This will never include expired entries at time of
     * access.
     * Setting this property will replace all existing entries. Use this property for saving and restoring permission
     * status in bulk.
     * Permissions in this dictionary should be explicitly granted by the user before being added. Any permissions in
     * this collection will not be
     * presented for approval again until they expire. This value should be saved and restored as needed by the app.
     * 
     * @see setPermissionStatus:forPermission:
     * @see setPermissionStatus:forPermission:expirationDate:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setGrantedPermissions:")
    public native void setGrantedPermissions(@NotNull NSDictionary<String, ? extends NSDate> value);

    /**
     * A Boolean value indicating if the extension has access to private data.
     * 
     * If this property is `YES`, the extension is granted permission to interact with private windows, tabs, and
     * cookies. Access to private data
     * should be explicitly allowed by the user before setting this property. This value should be saved and restored as
     * needed by the app.
     * [@note] To ensure proper isolation between private and non-private data, web views associated with private data
     * must use a
     * different ``WKUserContentController``. Likewise, to be identified as a private web view and to ensure that
     * cookies and other
     * website data is not shared, private web views must be configured to use a non-persistent ``WKWebsiteDataStore``.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setHasAccessToPrivateData:")
    public native void setHasAccessToPrivateData(boolean value);

    /**
     * A Boolean value indicating if the extension has requested optional access to all hosts.
     * 
     * If this property is `YES`, the extension has asked for access to all hosts in a call to
     * `browser.runtime.permissions.request()`,
     * and future permission checks will present discrete hosts for approval as being implicitly requested. This value
     * should be saved and restored as needed by the app.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setHasRequestedOptionalAccessToAllHosts:")
    public native void setHasRequestedOptionalAccessToAllHosts(boolean value);

    /**
     * Determines whether Web Inspector can inspect the ``WKWebView`` instances for this context.
     * 
     * A context can control multiple ``WKWebView`` instances, from the background content, to the popover.
     * You should set this to `YES` when needed for debugging purposes. The default value is `NO`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setInspectable:")
    public native void setInspectable(boolean value);

    /**
     * The name shown when inspecting the background web view.
     * 
     * This is the text that will appear when inspecting the background web view.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setInspectionName:")
    public native void setInspectionName(@Nullable String value);

    /**
     * Sets the status of a match pattern with a distant future expiration date.
     * 
     * This method will update ``grantedPermissionMatchPatterns`` and ``deniedPermissionMatchPatterns``. Use this method
     * for changing a single match pattern's status.
     * Only ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly``
     * states are allowed to be set using this method.
     * 
     * @param status  The new permission status to set for the given match pattern.
     * @param pattern The match pattern for which to set the status.
     * @see setPermissionStatus:forMatchPattern:expirationDate:
     * @see setPermissionStatus:forMatchPattern:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forMatchPattern:")
    public native void setPermissionStatusForMatchPattern(@NInt long status,
            @NotNull WKWebExtensionMatchPattern pattern);

    /**
     * Sets the status of a match pattern with a specific expiration date.
     * 
     * This method will update ``grantedPermissionMatchPatterns`` and ``deniedPermissionMatchPatterns``. Use this method
     * for changing a single match pattern's status.
     * Passing a `nil` expiration date will be treated as a distant future date. Only
     * ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly`` states are allowed to be set using this method.
     * 
     * @param status         The new permission status to set for the given match pattern.
     * @param pattern        The match pattern for which to set the status.
     * @param expirationDate The expiration date for the new permission status, or \c nil for distant future.
     * @see setPermissionStatus:forMatchPattern:
     * @see setPermissionStatus:forMatchPattern:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forMatchPattern:expirationDate:")
    public native void setPermissionStatusForMatchPatternExpirationDate(@NInt long status,
            @NotNull WKWebExtensionMatchPattern pattern, @Nullable NSDate expirationDate);

    /**
     * Sets the status of a permission with a distant future expiration date.
     * 
     * This method will update ``grantedPermissions`` and ``deniedPermissions``. Use this method for changing a single
     * permission's status.
     * Only ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly``
     * states are allowed to be set using this method.
     * 
     * @param status     The new permission status to set for the given permission.
     * @param permission The permission for which to set the status.
     * @see setPermissionStatus:forPermission:expirationDate:
     * @see setPermissionStatus:forPermission:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forPermission:")
    public native void setPermissionStatusForPermission(@NInt long status, @NotNull String permission);

    /**
     * Sets the status of a permission with a specific expiration date.
     * 
     * This method will update ``grantedPermissions`` and ``deniedPermissions``. Use this method for changing a single
     * permission's status.
     * Passing a `nil` expiration date will be treated as a distant future date. Only
     * ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly`` states are allowed to be set using this method.
     * 
     * @param status         The new permission status to set for the given permission.
     * @param permission     The permission for which to set the status.
     * @param expirationDate The expiration date for the new permission status, or \c nil for distant future.
     * @see setPermissionStatus:forPermission:
     * @see setPermissionStatus:forPermission:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forPermission:expirationDate:")
    public native void setPermissionStatusForPermissionExpirationDate(@NInt long status, @NotNull String permission,
            @Nullable NSDate expirationDate);

    /**
     * Sets the permission status of a URL with a distant future expiration date.
     * 
     * The URL is converted into a match pattern and will update ``grantedPermissionMatchPatterns`` and
     * ``deniedPermissionMatchPatterns``. Use this method for changing a single URL's status.
     * Only ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly``
     * states are allowed to be set using this method.
     * 
     * @param status The new permission status to set for the given URL.
     * @param url    The URL for which to set the status.
     * @see setPermissionStatus:forURL:expirationDate:
     * @see setPermissionStatus:forURL:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forURL:")
    public native void setPermissionStatusForURL(@NInt long status, @NotNull NSURL url);

    /**
     * Sets the permission status of a URL with a distant future expiration date.
     * 
     * The URL is converted into a match pattern and will update ``grantedPermissionMatchPatterns`` and
     * ``deniedPermissionMatchPatterns``. Use this method for changing a single URL's status.
     * Passing a `nil` expiration date will be treated as a distant future date. Only
     * ``WKWebExtensionContextPermissionStatusDeniedExplicitly``, ``WKWebExtensionContextPermissionStatusUnknown``,
     * and ``WKWebExtensionContextPermissionStatusGrantedExplicitly`` states are allowed to be set using this method.
     * 
     * @param status         The new permission status to set for the given URL.
     * @param url            The URL for which to set the status.
     * @param expirationDate The expiration date for the new permission status, or \c nil for distant future.
     * @see setPermissionStatus:forURL:
     * @see setPermissionStatus:forURL:inTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("setPermissionStatus:forURL:expirationDate:")
    public native void setPermissionStatusForURLExpirationDate(@NInt long status, @NotNull NSURL url,
            @Nullable NSDate expirationDate);

    /**
     * A unique identifier used to distinguish the extension from other extensions and target it for messages.
     * 
     * The default value is a unique value that matches the host in the default base URL. The identifier can be any
     * value that is unique. Setting is only allowed when the context is not loaded. This value is accessible by the
     * extension via
     * `browser.runtime.id` and is used for messaging the extension via `browser.runtime.sendMessage()`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setUniqueIdentifier:")
    public native void setUniqueIdentifier(@NotNull String value);

    /**
     * Specifies unsupported APIs for this extension, making them `undefined` in JavaScript.
     * 
     * This property allows the app to specify a subset of web extension APIs that it chooses not to support,
     * effectively making
     * these APIs `undefined` within the extension's JavaScript contexts. This enables extensions to employ feature
     * detection techniques
     * for unsupported APIs, allowing them to adapt their behavior based on the APIs actually supported by the app.
     * Setting is only allowed when
     * the context is not loaded. Only certain APIs can be specified here, particularly those within the `browser`
     * namespace and other dynamic
     * functions and properties, anything else will be silently ignored.
     * [@note] For example, specifying `"browser.windows.create"` and `"browser.storage"` in this set will result in the
     * `browser.windows.create()` function and `browser.storage` property being `undefined`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setUnsupportedAPIs:")
    public native void setUnsupportedAPIs(NSSet<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A unique identifier used to distinguish the extension from other extensions and target it for messages.
     * 
     * The default value is a unique value that matches the host in the default base URL. The identifier can be any
     * value that is unique. Setting is only allowed when the context is not loaded. This value is accessible by the
     * extension via
     * `browser.runtime.id` and is used for messaging the extension via `browser.runtime.sendMessage()`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("uniqueIdentifier")
    @NotNull
    public native String uniqueIdentifier();

    /**
     * Specifies unsupported APIs for this extension, making them `undefined` in JavaScript.
     * 
     * This property allows the app to specify a subset of web extension APIs that it chooses not to support,
     * effectively making
     * these APIs `undefined` within the extension's JavaScript contexts. This enables extensions to employ feature
     * detection techniques
     * for unsupported APIs, allowing them to adapt their behavior based on the APIs actually supported by the app.
     * Setting is only allowed when
     * the context is not loaded. Only certain APIs can be specified here, particularly those within the `browser`
     * namespace and other dynamic
     * functions and properties, anything else will be silently ignored.
     * [@note] For example, specifying `"browser.windows.create"` and `"browser.storage"` in this set will result in the
     * `browser.windows.create()` function and `browser.storage` property being `undefined`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("unsupportedAPIs")
    public native NSSet<String> unsupportedAPIs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Should be called by the app when a user gesture is performed in a specific tab.
     * 
     * When a user gesture is performed in a tab, this method should be called to update the extension context.
     * This enables the extension to be aware of the user gesture, potentially granting it access to features that
     * require user interaction,
     * such as `activeTab`. Not required if using ``performActionForTab:``.
     * 
     * @param tab The tab in which the user gesture was performed.
     * @see hasActiveUserGestureInTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("userGesturePerformedInTab:")
    public native void userGesturePerformedInTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab tab);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The extension this context represents.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webExtension")
    @NotNull
    public native WKWebExtension webExtension();

    /**
     * The extension controller this context is loaded in, otherwise `nil` if it isn't loaded.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webExtensionController")
    @Nullable
    public native WKWebExtensionController webExtensionController();

    /**
     * The web view configuration to use for web views that load pages from this extension.
     * 
     * Returns a customized copy of the configuration, originally set in the web extension controller configuration, for
     * this extension.
     * The app must use this configuration when initializing web views intended to navigate to a URL originating from
     * this extension's base URL.
     * The app must also swap web views in tabs when navigating to and from web extension URLs. This property returns
     * `nil` if the context isn't
     * associated with a web extension controller. The returned configuration copy can be customized prior to web view
     * initialization.
     * [@note] Navigations will fail if a web view using this configuration attempts to navigate to a URL that doesn't
     * originate from this extension's
     * base URL. Similarly, navigations will be canceled if a web view not configured with this configuration attempts
     * to navigate to a URL that does
     * originate from this extension's base URL.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("webViewConfiguration")
    @Nullable
    public native WKWebViewConfiguration webViewConfiguration();
}
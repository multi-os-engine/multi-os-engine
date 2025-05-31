package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.webkit.protocol.WKWebExtensionControllerDelegate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A ``WKWebExtensionController`` object manages a set of loaded extension contexts.
 * 
 * You can have one or more extension controller instances, allowing different parts of the app to use different sets of
 * extensions.
 * A controller is associated with ``WKWebView`` via the ``webExtensionController`` property on
 * ``WKWebViewConfiguration``.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Returns a set of all available extension data types.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("allExtensionDataTypes")
    @NotNull
    public static native NSSet<String> allExtensionDataTypes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
     * A copy of the configuration with which the web extension controller was initialized.
     * 
     * Mutating the configuration has no effect on the web extension controller.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("configuration")
    @NotNull
    public native WKWebExtensionControllerConfiguration configuration();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The extension controller delegate.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native WKWebExtensionControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Should be called by the app when a tab is activated to notify all loaded web extensions.
     * 
     * This method informs all loaded extensions of the tab activation, ensuring consistent state awareness across
     * extensions.
     * If the intention is to inform only a specific extension, use the respective method on that extension's context
     * instead.
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
     * Should be called by the app when the properties of a tab are changed to fire appropriate events with all loaded
     * web extensions.
     * 
     * This method informs all loaded extensions of changes to tab properties, ensuring a unified understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
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
     * Should be called by the app when a tab is closed to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions of the closing of a tab, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * @param closedTab       The tab that was closed.
     * @param windowIsClosing A boolean value indicating whether the window containing the tab is also closing.
     * @see didOpenTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didCloseTab:windowIsClosing:")
    public native void didCloseTabWindowIsClosing(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab closedTab,
            boolean windowIsClosing);

    /**
     * Should be called by the app when a window is closed to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions of the closure of a window, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * @param newWindow The window that was closed.
     * @see didOpenWindow:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didCloseWindow:")
    public native void didCloseWindow(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionWindow closedWindow);

    /**
     * Should be called by the app when tabs are deselected to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions that tabs have been deselected, ensuring consistent understanding
     * across extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * API-Since: 18.4
     * 
     * @param deselectedTabs The set of tabs that were deselected.
     */
    @Generated
    @Selector("didDeselectTabs:")
    public native void didDeselectTabs(@NotNull NSArray<?> deselectedTabs);

    /**
     * Should be called by the app when a window gains focus to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions of the focused window, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * API-Since: 18.4
     * 
     * @param focusedWindow The window that gained focus, or \c nil if no window has focus or a window has focus that is
     *                      not visible to extensions.
     */
    @Generated
    @Selector("didFocusWindow:")
    public native void didFocusWindow(@Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionWindow focusedWindow);

    /**
     * Should be called by the app when a tab is moved to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions of the movement of a tab, ensuring consistent understanding across
     * extensions.
     * If the window is staying the same, the current window should be specified. If the intention is to inform only a
     * specific extension,
     * use the respective method on that extension's context instead.
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
     * Should be called by the app when a new tab is opened to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions of the opening of a new tab, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * @param newTab The newly opened tab.
     * @see didCloseTab:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didOpenTab:")
    public native void didOpenTab(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionTab newTab);

    /**
     * Should be called by the app when a new window is opened to fire appropriate events with all loaded web
     * extensions.
     * 
     * This method informs all loaded extensions of the opening of a new window, ensuring consistent understanding
     * across extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * @param newWindow The newly opened window.
     * @see didCloseWindow:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("didOpenWindow:")
    public native void didOpenWindow(@Mapped(ObjCObjectMapper.class) @NotNull WKWebExtensionWindow newWindow);

    /**
     * Should be called by the app when a tab is replaced by another tab to fire appropriate events with all loaded web
     * extensions.
     * 
     * This method informs all loaded extensions of the replacement of a tab, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
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
     * Should be called by the app when tabs are selected to fire appropriate events with all loaded web extensions.
     * 
     * This method informs all loaded extensions that tabs have been selected, ensuring consistent understanding across
     * extensions.
     * If the intention is to inform only a specific extension, you should use the respective method on that extension's
     * context instead.
     * 
     * API-Since: 18.4
     * 
     * @param selectedTabs The set of tabs that were selected.
     */
    @Generated
    @Selector("didSelectTabs:")
    public native void didSelectTabs(@NotNull NSArray<?> selectedTabs);

    /**
     * Returns a loaded extension context for the specified extension.
     * 
     * @param extension An extension to lookup.
     * @return An extension context or `nil` if no match was found.
     * @see extensions
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("extensionContextForExtension:")
    @Nullable
    public native WKWebExtensionContext extensionContextForExtension(@NotNull WKWebExtension extension);

    /**
     * Returns a loaded extension context matching the specified URL.
     * 
     * This method is useful for determining the extension context to use when about to navigate to an extension URL.
     * For example,
     * you could use this method to retrieve the appropriate extension context and then use its ``webViewConfiguration``
     * property to configure a
     * web view for loading that URL.
     * 
     * API-Since: 18.4
     * 
     * @param URL The URL to lookup.
     * @return An extension context or `nil` if no match was found.
     */
    @Generated
    @Selector("extensionContextForURL:")
    @Nullable
    public native WKWebExtensionContext extensionContextForURL(@NotNull NSURL URL);

    /**
     * A set of all the currently loaded extension contexts.
     * 
     * @see extensions
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("extensionContexts")
    @NotNull
    public native NSSet<? extends WKWebExtensionContext> extensionContexts();

    /**
     * A set of all the currently loaded extensions.
     * 
     * @see extensionContexts
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("extensions")
    @NotNull
    public native NSSet<? extends WKWebExtension> extensions();

    /**
     * Fetches a data record containing the given extension data types for a specific known web extension context.
     * [@note] The extension does not need to be loaded to be included in the result.
     * 
     * API-Since: 18.4
     * 
     * @param dataTypes         The extension data types to fetch records for.
     * @param extensionContext  The specific web extension context to fetch records for.
     * @param completionHandler A block to invoke when the data record has been fetched.
     */
    @Generated
    @Selector("fetchDataRecordOfTypes:forExtensionContext:completionHandler:")
    public native void fetchDataRecordOfTypesForExtensionContextCompletionHandler(@NotNull NSSet<String> dataTypes,
            @NotNull WKWebExtensionContext extensionContext,
            @ObjCBlock(name = "call_fetchDataRecordOfTypesForExtensionContextCompletionHandler") @NotNull Block_fetchDataRecordOfTypesForExtensionContextCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchDataRecordOfTypesForExtensionContextCompletionHandler {
        @Generated
        void call_fetchDataRecordOfTypesForExtensionContextCompletionHandler(@Nullable WKWebExtensionDataRecord arg0);
    }

    /**
     * Fetches data records containing the given extension data types for all known extensions.
     * [@note] The extension does not need to be loaded to be included in the result.
     * 
     * API-Since: 18.4
     * 
     * @param dataTypes         The extension data types to fetch records for.
     * @param completionHandler A block to invoke when the data records have been fetched.
     */
    @Generated
    @Selector("fetchDataRecordsOfTypes:completionHandler:")
    public native void fetchDataRecordsOfTypesCompletionHandler(@NotNull NSSet<String> dataTypes,
            @ObjCBlock(name = "call_fetchDataRecordsOfTypesCompletionHandler") @NotNull Block_fetchDataRecordsOfTypesCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchDataRecordsOfTypesCompletionHandler {
        @Generated
        void call_fetchDataRecordsOfTypesCompletionHandler(@NotNull NSArray<? extends WKWebExtensionDataRecord> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Returns a web extension controller initialized with the default configuration.
     * 
     * This is a designated initializer. You can use ``initWithConfiguration:`` to
     * initialize an instance with a configuration.
     * 
     * @return An initialized web extension controller, or nil if the object could not be initialized.
     * @see initWithConfiguration:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("init")
    public native WKWebExtensionController init();

    /**
     * Returns a web extension controller initialized with the specified configuration.
     * 
     * This is a designated initializer. You can use ``init:`` to initialize an
     * instance with the default configuration. The initializer copies the specified configuration, so mutating
     * the configuration after invoking the initializer has no effect on the web extension controller.
     * 
     * @param configuration The configuration for the new web extension controller.
     * @return An initialized web extension controller, or nil if the object could not be initialized.
     * @see init
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("initWithConfiguration:")
    public native WKWebExtensionController initWithConfiguration(
            @NotNull WKWebExtensionControllerConfiguration configuration);

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Loads the specified extension context.
     * 
     * Causes the context to start, loading any background content, and injecting any content into relevant tabs.
     * 
     * @param error Set to \c nil or an \c NSError instance if an error occurred.
     * @return A Boolean value indicating if the context was successfully loaded.
     * @see loadExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("loadExtensionContext:error:")
    public native boolean loadExtensionContextError(@NotNull WKWebExtensionContext extensionContext,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionController new_objc();

    /**
     * Removes extension data of the given types for the given data records.
     * 
     * @param dataTypes         The extension data types that should be removed.
     * @param dataRecords       The extension data records to delete data from.
     * @param completionHandler A block to invoke when the data has been removed.
     * 
     *                          API-Since: 18.4
     */
    @Generated
    @Selector("removeDataOfTypes:fromDataRecords:completionHandler:")
    public native void removeDataOfTypesFromDataRecordsCompletionHandler(@NotNull NSSet<String> dataTypes,
            @NotNull NSArray<? extends WKWebExtensionDataRecord> dataRecords,
            @ObjCBlock(name = "call_removeDataOfTypesFromDataRecordsCompletionHandler") @NotNull Block_removeDataOfTypesFromDataRecordsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDataOfTypesFromDataRecordsCompletionHandler {
        @Generated
        void call_removeDataOfTypesFromDataRecordsCompletionHandler();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The extension controller delegate.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionControllerDelegate value);

    /**
     * The extension controller delegate.
     * 
     * API-Since: 18.4
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable WKWebExtensionControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Unloads the specified extension context.
     * 
     * Causes the context to stop running.
     * 
     * @param error Set to \c nil or an \c NSError instance if an error occurred.
     * @return A Boolean value indicating if the context was successfully unloaded.
     * @see unloadExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @Selector("unloadExtensionContext:error:")
    public native boolean unloadExtensionContextError(@NotNull WKWebExtensionContext extensionContext,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
package apple.webkit.protocol;

import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.webkit.WKWebExtensionContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class conforming to the ``WKWebExtensionWindow`` protocol represents a window to web extensions.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKWebExtensionWindow")
public interface WKWebExtensionWindow {
    /**
     * Called when the active tab is needed for the window.
     * 
     * Defaults to `nil` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The active tab in the window, which represents the frontmost tab currently in view.
     */
    @Generated
    @IsOptional
    @Selector("activeTabForWebExtensionContext:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    default WKWebExtensionTab activeTabForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to close the window.
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
     * Called to focus the window.
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
    @Selector("focusForWebExtensionContext:completionHandler:")
    default void focusForWebExtensionContextCompletionHandler(@NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_focusForWebExtensionContextCompletionHandler") @NotNull Block_focusForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_focusForWebExtensionContextCompletionHandler {
        @Generated
        void call_focusForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called when the frame of the window is needed.
     * 
     * Defaults to ``CGRectNull`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The frame of the window, in screen coordinates
     */
    @Generated
    @IsOptional
    @Selector("frameForWebExtensionContext:")
    @ByValue
    default CGRect frameForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the private state of the window is needed.
     * 
     * Defaults to `NO` if not implemented. This value is cached and will not change for the duration of the window or
     * its contained tabs.
     * [@note] To ensure proper isolation between private and non-private data, web views associated with private data
     * must use a
     * different ``WKUserContentController``. Likewise, to be identified as a private web view and to ensure that
     * cookies and other
     * website data is not shared, private web views must be configured to use a non-persistent ``WKWebsiteDataStore``.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return `YES` if the window is private, `NO` otherwise.
     */
    @Generated
    @IsOptional
    @Selector("isPrivateForWebExtensionContext:")
    default boolean isPrivateForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to set the frame of the window.
     * 
     * On macOS, the implementation of both ``frameForWebExtensionContext:`` and ``screenFrameForWebExtensionContext:``
     * are prerequisites. On iOS, iPadOS, and visionOS, only ``frameForWebExtensionContext:`` is a prerequisite. Without
     * the respective method(s),
     * this method will not be called.
     * 
     * @param context           The context in which the web extension is running.
     * @param frame             The new frame of the window, in screen coordinates.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see frameForWebExtensionContext:
     * @see screenFrameForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setFrame:forWebExtensionContext:completionHandler:")
    default void setFrameForWebExtensionContextCompletionHandler(@ByValue CGRect frame,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setFrameForWebExtensionContextCompletionHandler") @NotNull Block_setFrameForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFrameForWebExtensionContextCompletionHandler {
        @Generated
        void call_setFrameForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called to set the state of the window.
     * 
     * The implementation of ``windowStateForWebExtensionContext:`` is a prerequisite.
     * Without it, this method will not be called.
     * 
     * @param context           The context in which the web extension is running.
     * @param state             The new state of the window.
     * @param completionHandler A block that must be called upon completion. It takes a single error argument,
     *                          which should be provided if any errors occurred.
     * @see windowStateForWebExtensionContext:
     * 
     *      API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("setWindowState:forWebExtensionContext:completionHandler:")
    default void setWindowStateForWebExtensionContextCompletionHandler(@NInt long state,
            @NotNull WKWebExtensionContext context,
            @ObjCBlock(name = "call_setWindowStateForWebExtensionContextCompletionHandler") @NotNull Block_setWindowStateForWebExtensionContextCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWindowStateForWebExtensionContextCompletionHandler {
        @Generated
        void call_setWindowStateForWebExtensionContextCompletionHandler(@Nullable NSError error);
    }

    /**
     * Called when the tabs are needed for the window.
     * 
     * Defaults to an empty array if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return An array of tabs in the window.
     */
    @Generated
    @IsOptional
    @Selector("tabsForWebExtensionContext:")
    @NotNull
    default NSArray<?> tabsForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the state of the window is needed.
     * 
     * Defaults to``WKWebExtensionWindowStateNormal`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The state of the window.
     */
    @Generated
    @IsOptional
    @Selector("windowStateForWebExtensionContext:")
    @NInt
    default long windowStateForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the type of the window is needed.
     * 
     * Defaults to``WKWebExtensionWindowTypeNormal`` if not implemented.
     * 
     * API-Since: 18.4
     * 
     * @param context The context in which the web extension is running.
     * @return The type of the window.
     */
    @Generated
    @IsOptional
    @Selector("windowTypeForWebExtensionContext:")
    @NInt
    default long windowTypeForWebExtensionContext(@NotNull WKWebExtensionContext context) {
        throw new java.lang.UnsupportedOperationException();
    }
}
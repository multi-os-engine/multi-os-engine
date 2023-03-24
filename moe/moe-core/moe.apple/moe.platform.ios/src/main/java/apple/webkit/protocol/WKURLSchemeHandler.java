package apple.webkit.protocol;

import apple.webkit.WKWebView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * A class conforming to the WKURLSchemeHandler protocol provides methods for
 * loading resources with URL schemes that WebKit doesn't know how to handle itself.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKURLSchemeHandler")
public interface WKURLSchemeHandler {
    /**
     * Notifies your app to start loading the data for a particular resource
     * represented by the URL scheme handler task.
     * 
     * @param webView       The web view invoking the method.
     * @param urlSchemeTask The task that your app should start loading data for.
     */
    @Generated
    @Selector("webView:startURLSchemeTask:")
    void webViewStartURLSchemeTask(@NotNull WKWebView webView,
            @NotNull @Mapped(ObjCObjectMapper.class) WKURLSchemeTask urlSchemeTask);

    /**
     * Notifies your app to stop handling a URL scheme handler task.
     * 
     * After your app is told to stop loading data for a URL scheme handler task
     * it must not perform any callbacks for that task.
     * An exception will be thrown if any callbacks are made on the URL scheme handler task
     * after your app has been told to stop loading for it.
     * 
     * @param webView       The web view invoking the method.
     * @param urlSchemeTask The task that your app should stop handling.
     */
    @Generated
    @Selector("webView:stopURLSchemeTask:")
    void webViewStopURLSchemeTask(@NotNull WKWebView webView,
            @NotNull @Mapped(ObjCObjectMapper.class) WKURLSchemeTask urlSchemeTask);
}

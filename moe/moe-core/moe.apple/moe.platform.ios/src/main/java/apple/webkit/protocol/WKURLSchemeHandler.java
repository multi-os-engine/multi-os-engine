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

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKURLSchemeHandler")
public interface WKURLSchemeHandler {
    @Generated
    @Selector("webView:startURLSchemeTask:")
    void webViewStartURLSchemeTask(WKWebView webView, @Mapped(ObjCObjectMapper.class) Object urlSchemeTask);

    @Generated
    @Selector("webView:stopURLSchemeTask:")
    void webViewStopURLSchemeTask(WKWebView webView, @Mapped(ObjCObjectMapper.class) Object urlSchemeTask);
}
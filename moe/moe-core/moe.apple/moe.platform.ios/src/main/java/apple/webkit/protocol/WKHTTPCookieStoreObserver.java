package apple.webkit.protocol;

import apple.webkit.WKHTTPCookieStore;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKHTTPCookieStoreObserver")
public interface WKHTTPCookieStoreObserver {
    @Generated
    @IsOptional
    @Selector("cookiesDidChangeInCookieStore:")
    default void cookiesDidChangeInCookieStore(WKHTTPCookieStore cookieStore) {
        throw new java.lang.UnsupportedOperationException();
    }
}
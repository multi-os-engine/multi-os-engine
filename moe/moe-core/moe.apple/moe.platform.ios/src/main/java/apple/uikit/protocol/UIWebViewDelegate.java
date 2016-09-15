/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURLRequest;
import apple.uikit.UIWebView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIWebViewDelegate")
public interface UIWebViewDelegate {
    /**
     * webView:didFailLoadWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIWebViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIWebViewDelegate/webView:didFailLoadWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("webView:didFailLoadWithError:")
    default void webViewDidFailLoadWithError(UIWebView webView, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * webView:shouldStartLoadWithRequest:navigationType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIWebViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIWebViewDelegate/webView:shouldStartLoadWithRequest:navigationType:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("webView:shouldStartLoadWithRequest:navigationType:")
    default boolean webViewShouldStartLoadWithRequestNavigationType(UIWebView webView, NSURLRequest request,
            @NInt long navigationType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * webViewDidFinishLoad:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIWebViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIWebViewDelegate/webViewDidFinishLoad:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("webViewDidFinishLoad:")
    default void webViewDidFinishLoad(UIWebView webView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * webViewDidStartLoad:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIWebViewDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIWebViewDelegate/webViewDidStartLoad:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("webViewDidStartLoad:")
    default void webViewDidStartLoad(UIWebView webView) {
        throw new java.lang.UnsupportedOperationException();
    }
}

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

package apple.webkit.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import apple.webkit.WKNavigation;
import apple.webkit.WKNavigationAction;
import apple.webkit.WKNavigationResponse;
import apple.webkit.WKWebView;
import apple.webkit.WKWebpagePreferences;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKNavigationDelegate")
public interface WKNavigationDelegate {
    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationAction:decisionHandler:")
    default void webViewDecidePolicyForNavigationActionDecisionHandler(WKWebView webView,
            WKNavigationAction navigationAction,
            @ObjCBlock(name = "call_webViewDecidePolicyForNavigationActionDecisionHandler") Block_webViewDecidePolicyForNavigationActionDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationResponse:decisionHandler:")
    default void webViewDecidePolicyForNavigationResponseDecisionHandler(WKWebView webView,
            WKNavigationResponse navigationResponse,
            @ObjCBlock(name = "call_webViewDecidePolicyForNavigationResponseDecisionHandler") Block_webViewDecidePolicyForNavigationResponseDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didCommitNavigation:")
    default void webViewDidCommitNavigation(WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didFailNavigation:withError:")
    default void webViewDidFailNavigationWithError(WKWebView webView, WKNavigation navigation, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didFailProvisionalNavigation:withError:")
    default void webViewDidFailProvisionalNavigationWithError(WKWebView webView, WKNavigation navigation,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didFinishNavigation:")
    default void webViewDidFinishNavigation(WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didReceiveAuthenticationChallenge:completionHandler:")
    default void webViewDidReceiveAuthenticationChallengeCompletionHandler(WKWebView webView,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_webViewDidReceiveAuthenticationChallengeCompletionHandler") Block_webViewDidReceiveAuthenticationChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didReceiveServerRedirectForProvisionalNavigation:")
    default void webViewDidReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webView:didStartProvisionalNavigation:")
    default void webViewDidStartProvisionalNavigation(WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("webViewWebContentProcessDidTerminate:")
    default void webViewWebContentProcessDidTerminate(WKWebView webView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewDecidePolicyForNavigationActionDecisionHandler {
        @Generated
        void call_webViewDecidePolicyForNavigationActionDecisionHandler(@NInt long arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewDecidePolicyForNavigationResponseDecisionHandler {
        @Generated
        void call_webViewDecidePolicyForNavigationResponseDecisionHandler(@NInt long arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewDidReceiveAuthenticationChallengeCompletionHandler {
        @Generated
        void call_webViewDidReceiveAuthenticationChallengeCompletionHandler(@NInt long disposition,
                NSURLCredential credential);
    }

    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationAction:preferences:decisionHandler:")
    default void webViewDecidePolicyForNavigationActionPreferencesDecisionHandler(WKWebView webView,
            WKNavigationAction navigationAction, WKWebpagePreferences preferences,
            @ObjCBlock(name = "call_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler") Block_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler {
        @Generated
        void call_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler(@NInt long arg0,
                WKWebpagePreferences arg1);
    }

    @Generated
    @IsOptional
    @Selector("webView:authenticationChallenge:shouldAllowDeprecatedTLS:")
    default void webViewAuthenticationChallengeShouldAllowDeprecatedTLS(WKWebView webView,
            NSURLAuthenticationChallenge challenge,
            @ObjCBlock(name = "call_webViewAuthenticationChallengeShouldAllowDeprecatedTLS") Block_webViewAuthenticationChallengeShouldAllowDeprecatedTLS decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewAuthenticationChallengeShouldAllowDeprecatedTLS {
        @Generated
        void call_webViewAuthenticationChallengeShouldAllowDeprecatedTLS(boolean arg0);
    }
}

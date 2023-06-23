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
import apple.webkit.WKDownload;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class conforming to the WKNavigationDelegate protocol can provide
 * methods for tracking progress for main frame navigations and for deciding
 * policy for main frame and subframe navigations.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKNavigationDelegate")
public interface WKNavigationDelegate {
    /**
     * Decides whether to allow or cancel a navigation.
     * 
     * If you do not implement this method, the web view will load the request or, if appropriate, forward it to another
     * application.
     * 
     * @param webView          The web view invoking the delegate method.
     * @param navigationAction Descriptive information about the action
     *                         triggering the navigation request.
     * @param decisionHandler  The decision handler to call to allow or cancel the
     *                         navigation. The argument is one of the constants of the enumerated type
     *                         WKNavigationActionPolicy.
     */
    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationAction:decisionHandler:")
    default void webViewDecidePolicyForNavigationActionDecisionHandler(@NotNull WKWebView webView,
            @NotNull WKNavigationAction navigationAction,
            @NotNull @ObjCBlock(name = "call_webViewDecidePolicyForNavigationActionDecisionHandler") Block_webViewDecidePolicyForNavigationActionDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Decides whether to allow or cancel a navigation after its
     * response is known.
     * 
     * If you do not implement this method, the web view will allow the response, if the web view can show it.
     * 
     * @param webView            The web view invoking the delegate method.
     * @param navigationResponse Descriptive information about the navigation
     *                           response.
     * @param decisionHandler    The decision handler to call to allow or cancel the
     *                           navigation. The argument is one of the constants of the enumerated type
     *                           WKNavigationResponsePolicy.
     */
    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationResponse:decisionHandler:")
    default void webViewDecidePolicyForNavigationResponseDecisionHandler(@NotNull WKWebView webView,
            @NotNull WKNavigationResponse navigationResponse,
            @NotNull @ObjCBlock(name = "call_webViewDecidePolicyForNavigationResponseDecisionHandler") Block_webViewDecidePolicyForNavigationResponseDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when content starts arriving for the main frame.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     */
    @Generated
    @IsOptional
    @Selector("webView:didCommitNavigation:")
    default void webViewDidCommitNavigation(@NotNull WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when an error occurs during a committed main frame
     * navigation.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     * @param error      The error that occurred.
     */
    @Generated
    @IsOptional
    @Selector("webView:didFailNavigation:withError:")
    default void webViewDidFailNavigationWithError(@NotNull WKWebView webView, WKNavigation navigation,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when an error occurs while starting to load data for
     * the main frame.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     * @param error      The error that occurred.
     */
    @Generated
    @IsOptional
    @Selector("webView:didFailProvisionalNavigation:withError:")
    default void webViewDidFailProvisionalNavigationWithError(@NotNull WKWebView webView, WKNavigation navigation,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a main frame navigation completes.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     */
    @Generated
    @IsOptional
    @Selector("webView:didFinishNavigation:")
    default void webViewDidFinishNavigation(@NotNull WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the web view needs to respond to an authentication challenge.
     * 
     * If you do not implement this method, the web view will respond to the authentication challenge with the
     * NSURLSessionAuthChallengeRejectProtectionSpace disposition.
     * 
     * @param webView           The web view that received the authentication challenge.
     * @param challenge         The authentication challenge.
     * @param completionHandler The completion handler you must invoke to respond to the challenge. The
     *                          disposition argument is one of the constants of the enumerated type
     *                          NSURLSessionAuthChallengeDisposition. When disposition is
     *                          NSURLSessionAuthChallengeUseCredential,
     *                          the credential argument is the credential to use, or nil to indicate continuing without
     *                          a
     *                          credential.
     */
    @Generated
    @IsOptional
    @Selector("webView:didReceiveAuthenticationChallenge:completionHandler:")
    default void webViewDidReceiveAuthenticationChallengeCompletionHandler(@NotNull WKWebView webView,
            @NotNull NSURLAuthenticationChallenge challenge,
            @NotNull @ObjCBlock(name = "call_webViewDidReceiveAuthenticationChallengeCompletionHandler") Block_webViewDidReceiveAuthenticationChallengeCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a server redirect is received for the main
     * frame.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     */
    @Generated
    @IsOptional
    @Selector("webView:didReceiveServerRedirectForProvisionalNavigation:")
    default void webViewDidReceiveServerRedirectForProvisionalNavigation(@NotNull WKWebView webView,
            WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a main frame navigation starts.
     * 
     * @param webView    The web view invoking the delegate method.
     * @param navigation The navigation.
     */
    @Generated
    @IsOptional
    @Selector("webView:didStartProvisionalNavigation:")
    default void webViewDidStartProvisionalNavigation(@NotNull WKWebView webView, WKNavigation navigation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the web view's web content process is terminated.
     * 
     * @param webView The web view whose underlying web content process was terminated.
     * 
     *                API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("webViewWebContentProcessDidTerminate:")
    default void webViewWebContentProcessDidTerminate(@NotNull WKWebView webView) {
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
                @Nullable NSURLCredential credential);
    }

    /**
     * Decides whether to allow or cancel a navigation.
     * 
     * If you implement this method,
     * -webView:decidePolicyForNavigationAction:decisionHandler: will not be called.
     * 
     * API-Since: 13.0
     * 
     * @param webView          The web view invoking the delegate method.
     * @param navigationAction Descriptive information about the action
     *                         triggering the navigation request.
     * @param preferences      The default set of webpage preferences. This may be
     *                         changed by setting defaultWebpagePreferences on WKWebViewConfiguration.
     * @param decisionHandler  The policy decision handler to call to allow or cancel
     *                         the navigation. The arguments are one of the constants of the enumerated type
     *                         WKNavigationActionPolicy, as well as an instance of WKWebpagePreferences.
     */
    @Generated
    @IsOptional
    @Selector("webView:decidePolicyForNavigationAction:preferences:decisionHandler:")
    default void webViewDecidePolicyForNavigationActionPreferencesDecisionHandler(@NotNull WKWebView webView,
            @NotNull WKNavigationAction navigationAction, @NotNull WKWebpagePreferences preferences,
            @NotNull @ObjCBlock(name = "call_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler") Block_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler {
        @Generated
        void call_webViewDecidePolicyForNavigationActionPreferencesDecisionHandler(@NInt long arg0,
                @NotNull WKWebpagePreferences arg1);
    }

    /**
     * Invoked when the web view is establishing a network connection using a deprecated version of TLS.
     * 
     * @param webView         The web view initiating the connection.
     * @param challenge       The authentication challenge.
     * @param decisionHandler The decision handler you must invoke to respond to indicate whether or not to continue
     *                        with the connection establishment.
     * 
     *                        API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("webView:authenticationChallenge:shouldAllowDeprecatedTLS:")
    default void webViewAuthenticationChallengeShouldAllowDeprecatedTLS(@NotNull WKWebView webView,
            @NotNull NSURLAuthenticationChallenge challenge,
            @NotNull @ObjCBlock(name = "call_webViewAuthenticationChallengeShouldAllowDeprecatedTLS") Block_webViewAuthenticationChallengeShouldAllowDeprecatedTLS decisionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewAuthenticationChallengeShouldAllowDeprecatedTLS {
        @Generated
        void call_webViewAuthenticationChallengeShouldAllowDeprecatedTLS(boolean arg0);
    }

    /**
     * Called after using WKNavigationActionPolicyDownload.
     * 
     * The download needs its delegate to be set to receive updates about its progress.
     * 
     * API-Since: 14.5
     * 
     * @param webView          The web view that created the download.
     * @param navigationAction The action that is being turned into a download.
     * @param download         The download.
     */
    @Generated
    @IsOptional
    @Selector("webView:navigationAction:didBecomeDownload:")
    default void webViewNavigationActionDidBecomeDownload(@NotNull WKWebView webView,
            @NotNull WKNavigationAction navigationAction, @NotNull WKDownload download) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after using WKNavigationResponsePolicyDownload.
     * 
     * The download needs its delegate to be set to receive updates about its progress.
     * 
     * API-Since: 14.5
     * 
     * @param webView            The web view that created the download.
     * @param navigationResponse The response that is being turned into a download.
     * @param download           The download.
     */
    @Generated
    @IsOptional
    @Selector("webView:navigationResponse:didBecomeDownload:")
    default void webViewNavigationResponseDidBecomeDownload(@NotNull WKWebView webView,
            @NotNull WKNavigationResponse navigationResponse, @NotNull WKDownload download) {
        throw new java.lang.UnsupportedOperationException();
    }
}

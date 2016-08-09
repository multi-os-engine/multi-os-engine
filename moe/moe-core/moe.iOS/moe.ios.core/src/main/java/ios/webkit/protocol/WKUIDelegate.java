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

package ios.webkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.webkit.WKFrameInfo;
import ios.webkit.WKNavigationAction;
import ios.webkit.WKWebView;
import ios.webkit.WKWebViewConfiguration;
import ios.webkit.WKWindowFeatures;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKUIDelegate")
public interface WKUIDelegate {
	/**
	 * webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKUIDelegate_Ref/index.html#//apple_ref/occ/intfm/WKUIDelegate/webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
	default WKWebView webViewCreateWebViewWithConfigurationForNavigationActionWindowFeatures(
			WKWebView webView, WKWebViewConfiguration configuration,
			WKNavigationAction navigationAction, WKWindowFeatures windowFeatures) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKUIDelegate_Ref/index.html#//apple_ref/occ/intfm/WKUIDelegate/webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
	default void webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler(
			WKWebView webView,
			String message,
			WKFrameInfo frame,
			@ObjCBlock(name = "call_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler completionHandler) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler {
		@Generated
		void call_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler();
	}

	/**
	 * webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKUIDelegate_Ref/index.html#//apple_ref/occ/intfm/WKUIDelegate/webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
	default void webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler(
			WKWebView webView,
			String message,
			WKFrameInfo frame,
			@ObjCBlock(name = "call_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler completionHandler) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler {
		@Generated
		void call_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler(
				boolean arg0);
	}

	/**
	 * webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKUIDelegate_Ref/index.html#//apple_ref/occ/intfm/WKUIDelegate/webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
	default void webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler(
			WKWebView webView,
			String prompt,
			String defaultText,
			WKFrameInfo frame,
			@ObjCBlock(name = "call_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler completionHandler) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler {
		@Generated
		void call_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler(
				String arg0);
	}

	/**
	 * webViewDidClose:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKUIDelegate_Ref/index.html#//apple_ref/occ/intfm/WKUIDelegate/webViewDidClose:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("webViewDidClose:")
	default void webViewDidClose(WKWebView webView) {
		throw new java.lang.UnsupportedOperationException();
	}
}

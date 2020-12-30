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

import apple.foundation.NSArray;
import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UIViewController;
import apple.uikit.protocol.UIContextMenuInteractionCommitAnimating;
import apple.webkit.WKContextMenuElementInfo;
import apple.webkit.WKFrameInfo;
import apple.webkit.WKNavigationAction;
import apple.webkit.WKPreviewElementInfo;
import apple.webkit.WKWebView;
import apple.webkit.WKWebViewConfiguration;
import apple.webkit.WKWindowFeatures;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class conforming to the WKUIDelegate protocol provides methods for
 * presenting native UI on behalf of a webpage.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKUIDelegate")
public interface WKUIDelegate {
    /**
     * @abstract Allows your app to pop to the view controller it created.
     * @param webView The web view invoking the delegate method.
     * @param previewingViewController The view controller that is being popped.
     */
    @Generated
    @IsOptional
    @Selector("webView:commitPreviewingViewController:")
    default void webViewCommitPreviewingViewController(WKWebView webView, UIViewController previewingViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Creates a new web view.
     * @param webView The web view invoking the delegate method.
     * @param configuration The configuration to use when creating the new web
     * view. This configuration is a copy of webView.configuration.
     * @param navigationAction The navigation action causing the new web view to
     * be created.
     * @param windowFeatures Window features requested by the webpage.
     * @result A new web view or nil.
     * @discussion The web view returned must be created with the specified configuration. WebKit will load the request in the returned web view.
     * 
     * If you do not implement this method, the web view will cancel the navigation.
     */
    @Generated
    @IsOptional
    @Selector("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    default WKWebView webViewCreateWebViewWithConfigurationForNavigationActionWindowFeatures(WKWebView webView,
            WKWebViewConfiguration configuration, WKNavigationAction navigationAction,
            WKWindowFeatures windowFeatures) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Allows your app to provide a custom view controller to show when the given element is peeked.
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user is peeking.
     * @param defaultActions An array of the actions that WebKit would use as previewActionItems for this element by 
     * default. These actions would be used if allowsLinkPreview is YES but these delegate methods have not been 
     * implemented, or if this delegate method returns nil.
     * @discussion Returning a view controller will result in that view controller being displayed as a peek preview.
     * To use the defaultActions, your app is responsible for returning whichever of those actions it wants in your 
     * view controller's implementation of -previewActionItems.
     * 
     * Returning nil will result in WebKit's default preview behavior. webView:commitPreviewingViewController: will only be invoked
     * if a non-nil view controller was returned.
     */
    @Generated
    @IsOptional
    @Selector("webView:previewingViewControllerForElement:defaultActions:")
    default UIViewController webViewPreviewingViewControllerForElementDefaultActions(WKWebView webView,
            WKPreviewElementInfo elementInfo, NSArray<?> previewActions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Displays a JavaScript alert panel.
     * @param webView The web view invoking the delegate method.
     * @param message The message to display.
     * @param frame Information about the frame whose JavaScript initiated this
     * call.
     * @param completionHandler The completion handler to call after the alert
     * panel has been dismissed.
     * @discussion For user security, your app should call attention to the fact
     * that a specific website controls the content in this panel. A simple forumla
     * for identifying the controlling website is frame.request.URL.host.
     * The panel should have a single OK button.
     * 
     * If you do not implement this method, the web view will behave as if the user selected the OK button.
     */
    @Generated
    @IsOptional
    @Selector("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    default void webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler(WKWebView webView,
            String message, WKFrameInfo frame,
            @ObjCBlock(name = "call_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Displays a JavaScript confirm panel.
     * @param webView The web view invoking the delegate method.
     * @param message The message to display.
     * @param frame Information about the frame whose JavaScript initiated this call.
     * @param completionHandler The completion handler to call after the confirm
     * panel has been dismissed. Pass YES if the user chose OK, NO if the user
     * chose Cancel.
     * @discussion For user security, your app should call attention to the fact
     * that a specific website controls the content in this panel. A simple forumla
     * for identifying the controlling website is frame.request.URL.host.
     * The panel should have two buttons, such as OK and Cancel.
     * 
     * If you do not implement this method, the web view will behave as if the user selected the Cancel button.
     */
    @Generated
    @IsOptional
    @Selector("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    default void webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler(WKWebView webView,
            String message, WKFrameInfo frame,
            @ObjCBlock(name = "call_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Displays a JavaScript text input panel.
     * @param webView The web view invoking the delegate method.
     * @param prompt The prompt to display.
     * @param defaultText The initial text to display in the text entry field.
     * @param frame Information about the frame whose JavaScript initiated this call.
     * @param completionHandler The completion handler to call after the text
     * input panel has been dismissed. Pass the entered text if the user chose
     * OK, otherwise nil.
     * @discussion For user security, your app should call attention to the fact
     * that a specific website controls the content in this panel. A simple forumla
     * for identifying the controlling website is frame.request.URL.host.
     * The panel should have two buttons, such as OK and Cancel, and a field in
     * which to enter text.
     * 
     * If you do not implement this method, the web view will behave as if the user selected the Cancel button.
     */
    @Generated
    @IsOptional
    @Selector("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    default void webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler(
            WKWebView webView, String prompt, String defaultText, WKFrameInfo frame,
            @ObjCBlock(name = "call_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler") Block_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Allows your app to determine whether or not the given element should show a preview.
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user has started touching.
     * @discussion To disable previews entirely for the given element, return NO. Returning NO will prevent 
     * webView:previewingViewControllerForElement:defaultActions: and webView:commitPreviewingViewController:
     * from being invoked.
     * 
     * This method will only be invoked for elements that have default preview in WebKit, which is
     * limited to links. In the future, it could be invoked for additional elements.
     */
    @Generated
    @IsOptional
    @Selector("webView:shouldPreviewElement:")
    default boolean webViewShouldPreviewElement(WKWebView webView, WKPreviewElementInfo elementInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Notifies your app that the DOM window object's close() method completed successfully.
     * @param webView The web view invoking the delegate method.
     * @discussion Your app should remove the web view from the view hierarchy and update
     * the UI as needed, such as by closing the containing browser tab or window.
     */
    @Generated
    @IsOptional
    @Selector("webViewDidClose:")
    default void webViewDidClose(WKWebView webView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler {
        @Generated
        void call_webViewRunJavaScriptAlertPanelWithMessageInitiatedByFrameCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler {
        @Generated
        void call_webViewRunJavaScriptConfirmPanelWithMessageInitiatedByFrameCompletionHandler(boolean result);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler {
        @Generated
        void call_webViewRunJavaScriptTextInputPanelWithPromptDefaultTextInitiatedByFrameCompletionHandler(
                String result);
    }

    /**
     * @abstract Called when a context menu interaction begins.
     * 
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user is touching.
     * @param completionHandler A completion handler to call once a it has been decided whether or not to show a context menu.
     * Pass a valid UIContextMenuConfiguration to show a context menu, or pass nil to not show a context menu.
     */
    @Generated
    @IsOptional
    @Selector("webView:contextMenuConfigurationForElement:completionHandler:")
    default void webViewContextMenuConfigurationForElementCompletionHandler(WKWebView webView,
            WKContextMenuElementInfo elementInfo,
            @ObjCBlock(name = "call_webViewContextMenuConfigurationForElementCompletionHandler") Block_webViewContextMenuConfigurationForElementCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_webViewContextMenuConfigurationForElementCompletionHandler {
        @Generated
        void call_webViewContextMenuConfigurationForElementCompletionHandler(UIContextMenuConfiguration configuration);
    }

    /**
     * @abstract Called when the context menu ends, either by being dismissed or when a menu action is taken.
     * 
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user is touching.
     */
    @Generated
    @IsOptional
    @Selector("webView:contextMenuDidEndForElement:")
    default void webViewContextMenuDidEndForElement(WKWebView webView, WKContextMenuElementInfo elementInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Called when the context menu configured by the UIContextMenuConfiguration from
     * webView:contextMenuConfigurationForElement:completionHandler: is committed. That is, when
     * the user has selected the view provided in the UIContextMenuContentPreviewProvider.
     * 
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user is touching.
     * @param animator The animator to use for the commit animation.
     */
    @Generated
    @IsOptional
    @Selector("webView:contextMenuForElement:willCommitWithAnimator:")
    default void webViewContextMenuForElementWillCommitWithAnimator(WKWebView webView,
            WKContextMenuElementInfo elementInfo,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Called when the context menu will be presented.
     * 
     * @param webView The web view invoking the delegate method.
     * @param elementInfo The elementInfo for the element the user is touching.
     */
    @Generated
    @IsOptional
    @Selector("webView:contextMenuWillPresentForElement:")
    default void webViewContextMenuWillPresentForElement(WKWebView webView, WKContextMenuElementInfo elementInfo) {
        throw new java.lang.UnsupportedOperationException();
    }
}

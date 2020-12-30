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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum WKErrorCode
 * @abstract Constants used by NSError to indicate errors in the WebKit domain.
 * @constant WKErrorUnknown                              Indicates that an unknown error occurred.
 * @constant WKErrorWebContentProcessTerminated          Indicates that the Web Content process was terminated.
 * @constant WKErrorWebViewInvalidated                   Indicates that the WKWebView was invalidated.
 * @constant WKErrorJavaScriptExceptionOccurred          Indicates that a JavaScript exception occurred.
 * @constant WKErrorJavaScriptResultTypeIsUnsupported    Indicates that the result of JavaScript execution could not be returned.
 * @constant WKErrorContentRuleListStoreCompileFailed    Indicates that compiling a WKUserContentRuleList failed.
 * @constant WKErrorContentRuleListStoreLookUpFailed     Indicates that looking up a WKUserContentRuleList failed.
 * @constant WKErrorContentRuleListStoreRemoveFailed     Indicates that removing a WKUserContentRuleList failed.
 * @constant WKErrorContentRuleListStoreVersionMismatch  Indicates that the WKUserContentRuleList version did not match the latest.
 * @constant WKErrorAttributedStringContentFailedToLoad  Indicates that the attributed string content failed to load.
 * @constant WKErrorAttributedStringContentLoadTimedOut  Indicates that loading attributed string content timed out.
 * @constant WKErrorNavigationAppBoundDomain  Indicates that a navigation failed due to an app-bound domain restriction.
 * @constant WKErrorJavaScriptAppBoundDomain  Indicates that JavaScript execution failed due to an app-bound domain restriction.
 */
@Generated
public final class WKErrorCode {
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    @Generated @NInt public static final long WebContentProcessTerminated = 0x0000000000000002L;
    @Generated @NInt public static final long WebViewInvalidated = 0x0000000000000003L;
    @Generated @NInt public static final long JavaScriptExceptionOccurred = 0x0000000000000004L;
    @Generated @NInt public static final long JavaScriptResultTypeIsUnsupported = 0x0000000000000005L;

    @Generated
    private WKErrorCode() {
    }

    @Generated @NInt public static final long ContentRuleListStoreCompileFailed = 0x0000000000000006L;
    @Generated @NInt public static final long ContentRuleListStoreLookUpFailed = 0x0000000000000007L;
    @Generated @NInt public static final long ContentRuleListStoreRemoveFailed = 0x0000000000000008L;
    @Generated @NInt public static final long ContentRuleListStoreVersionMismatch = 0x0000000000000009L;
    @Generated @NInt public static final long AttributedStringContentFailedToLoad = 0x000000000000000AL;
    @Generated @NInt public static final long AttributedStringContentLoadTimedOut = 0x000000000000000BL;
    @Generated @NInt public static final long JavaScriptInvalidFrameTarget = 0x000000000000000CL;
    @Generated @NInt public static final long NavigationAppBoundDomain = 0x000000000000000DL;
    @Generated @NInt public static final long JavaScriptAppBoundDomain = 0x000000000000000EL;
}

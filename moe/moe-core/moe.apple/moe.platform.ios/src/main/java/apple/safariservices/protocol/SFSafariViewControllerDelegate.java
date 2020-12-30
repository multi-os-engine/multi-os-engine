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

package apple.safariservices.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSURL;
import apple.safariservices.SFSafariViewController;
import apple.uikit.UIActivity;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFSafariViewControllerDelegate")
public interface SFSafariViewControllerDelegate {
    /**
     * Called when the view controller is about to show UIActivityViewController after the user taps the action button.
     * 
     * @param URL the URL of the web page.
     * @param title the title of the web page.
     * @return Returns an array of UIActivity instances that will be appended to UIActivityViewController.
     */
    @Generated
    @IsOptional
    @Selector("safariViewController:activityItemsForURL:title:")
    default NSArray<? extends UIActivity> safariViewControllerActivityItemsForURLTitle(
            SFSafariViewController controller, NSURL URL, String title) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the initial URL load is complete.
     * 
     * This method is invoked when SFSafariViewController completes the loading of the URL that you pass
     * to its initializer. It is not invoked for any subsequent page loads in the same SFSafariViewController instance.
     * 
     * @param didLoadSuccessfully YES if loading completed successfully, NO if loading failed.
     */
    @Generated
    @IsOptional
    @Selector("safariViewController:didCompleteInitialLoad:")
    default void safariViewControllerDidCompleteInitialLoad(SFSafariViewController controller,
            boolean didLoadSuccessfully) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Delegate callback called when the user taps the Done button. Upon this call, the view controller is dismissed modally.
     */
    @Generated
    @IsOptional
    @Selector("safariViewControllerDidFinish:")
    default void safariViewControllerDidFinish(SFSafariViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows you to exclude certain UIActivityTypes from the UIActivityViewController presented when the user taps the action button.
     * 
     * Called when the view controller is about to show a UIActivityViewController after the user taps the action button.
     * 
     * @param URL the URL of the current web page.
     * @param title the title of the current web page.
     * @return Returns an array of any UIActivityType that you want to be excluded from the UIActivityViewController.
     */
    @Generated
    @IsOptional
    @Selector("safariViewController:excludedActivityTypesForURL:title:")
    default NSArray<String> safariViewControllerExcludedActivityTypesForURLTitle(SFSafariViewController controller,
            NSURL URL, String title) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the browser is redirected to another URL while loading the initial page.
     * 
     * This method may be called even after -safariViewController:didCompleteInitialLoad: if
     * the web page performs additional redirects without user interaction.
     * 
     * @param URL The new URL to which the browser was redirected.
     */
    @Generated
    @IsOptional
    @Selector("safariViewController:initialLoadDidRedirectToURL:")
    default void safariViewControllerInitialLoadDidRedirectToURL(SFSafariViewController controller, NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user opens the current page in the default browser by tapping the toolbar button.
     */
    @Generated
    @IsOptional
    @Selector("safariViewControllerWillOpenInBrowser:")
    default void safariViewControllerWillOpenInBrowser(SFSafariViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}

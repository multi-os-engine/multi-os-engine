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
    @Generated
    @IsOptional
    @Selector("safariViewController:activityItemsForURL:title:")
    default NSArray<? extends UIActivity> safariViewControllerActivityItemsForURLTitle(
            SFSafariViewController controller, NSURL URL, String title) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("safariViewController:didCompleteInitialLoad:")
    default void safariViewControllerDidCompleteInitialLoad(SFSafariViewController controller,
            boolean didLoadSuccessfully) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("safariViewControllerDidFinish:")
    default void safariViewControllerDidFinish(SFSafariViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("safariViewController:excludedActivityTypesForURL:title:")
    default NSArray<String> safariViewControllerExcludedActivityTypesForURLTitle(SFSafariViewController controller,
            NSURL URL, String title) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("safariViewController:initialLoadDidRedirectToURL:")
    default void safariViewControllerInitialLoadDidRedirectToURL(SFSafariViewController controller, NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }
}

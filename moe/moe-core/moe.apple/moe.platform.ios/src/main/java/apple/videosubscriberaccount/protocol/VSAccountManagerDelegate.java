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

package apple.videosubscriberaccount.protocol;

import apple.uikit.UIViewController;
import apple.videosubscriberaccount.VSAccountManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A VSAccountManager instance coordinates access to a subscriber's account.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VSAccountManagerDelegate")
public interface VSAccountManagerDelegate {
    /**
     * Called when the account manager is finished using the presented view controller.
     * 
     * @param accountManager The account manager instance that previously asked to show the view controller.
     * @param viewController The view controller that is being presented to the user. You must use
     *                       -dismissViewControllerAnimated:completion: to begin dismissing the view controller before
     *                       returning from this method.
     */
    @Generated
    @Selector("accountManager:dismissViewController:")
    void accountManagerDismissViewController(VSAccountManager accountManager, UIViewController viewController);

    /**
     * Called when the account manager needs user interaction to complete a request.
     * 
     * @param accountManager The account manager instance that needs to show the view controller.
     * @param viewController A view controller that needs to be presented to the user. You must use
     *                       -presentViewController:animated:completion: to begin presenting this view controller before
     *                       returning from this method.
     */
    @Generated
    @Selector("accountManager:presentViewController:")
    void accountManagerPresentViewController(VSAccountManager accountManager, UIViewController viewController);

    /**
     * This method can be used to temporarily refrain from authenticating with an
     * otherwise-supported provider during a transient outage.
     * This method will be called when the user chooses a supported provider from
     * the list of providers.
     * If you do not implement this method, the user will be able to authenticate
     * with all supported providers.
     * [@returns] Returning NO will cause the request will fail with an unsupported provider error.
     * 
     * @param accountManager            The account manager instance that received a metadata request.
     * @param accountProviderIdentifier Identifies the otherwise-supported account provider.
     */
    @Generated
    @IsOptional
    @Selector("accountManager:shouldAuthenticateAccountProviderWithIdentifier:")
    default boolean accountManagerShouldAuthenticateAccountProviderWithIdentifier(VSAccountManager accountManager,
            String accountProviderIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}

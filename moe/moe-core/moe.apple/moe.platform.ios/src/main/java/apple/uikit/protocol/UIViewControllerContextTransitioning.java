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

import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGRect;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerContextTransitioning")
public interface UIViewControllerContextTransitioning {
    @Generated
    @Selector("cancelInteractiveTransition")
    void cancelInteractiveTransition();

    @Generated
    @Selector("completeTransition:")
    void completeTransition(boolean didComplete);

    @Generated
    @Selector("containerView")
    UIView containerView();

    @Generated
    @Selector("finalFrameForViewController:")
    @ByValue
    CGRect finalFrameForViewController(UIViewController vc);

    @Generated
    @Selector("finishInteractiveTransition")
    void finishInteractiveTransition();

    @Generated
    @Selector("initialFrameForViewController:")
    @ByValue
    CGRect initialFrameForViewController(UIViewController vc);

    @Generated
    @Selector("isAnimated")
    boolean isAnimated();

    @Generated
    @Selector("isInteractive")
    boolean isInteractive();

    @Generated
    @Selector("presentationStyle")
    @NInt
    long presentationStyle();

    @Generated
    @Selector("targetTransform")
    @ByValue
    CGAffineTransform targetTransform();

    @Generated
    @Selector("transitionWasCancelled")
    boolean transitionWasCancelled();

    @Generated
    @Selector("updateInteractiveTransition:")
    void updateInteractiveTransition(@NFloat double percentComplete);

    @Generated
    @Selector("viewControllerForKey:")
    UIViewController viewControllerForKey(String key);

    @Generated
    @Selector("viewForKey:")
    UIView viewForKey(String key);
}

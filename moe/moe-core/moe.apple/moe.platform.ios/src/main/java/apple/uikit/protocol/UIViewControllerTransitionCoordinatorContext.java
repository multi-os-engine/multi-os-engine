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
@ObjCProtocolName("UIViewControllerTransitionCoordinatorContext")
public interface UIViewControllerTransitionCoordinatorContext {
    /**
     * completionCurve</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/completionCurve">iOS Dev Center</a>
     */
    @Generated
    @Selector("completionCurve")
    @NInt
    long completionCurve();

    /**
     * completionVelocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/completionVelocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("completionVelocity")
    @NFloat
    double completionVelocity();

    /**
     * containerView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/containerView">iOS Dev Center</a>
     */
    @Generated
    @Selector("containerView")
    UIView containerView();

    /**
     * initiallyInteractive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/initiallyInteractive">iOS Dev Center</a>
     */
    @Generated
    @Selector("initiallyInteractive")
    boolean initiallyInteractive();

    /**
     * isAnimated</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/isAnimated">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAnimated")
    boolean isAnimated();

    /**
     * isCancelled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/isCancelled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCancelled")
    boolean isCancelled();

    /**
     * isInteractive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/isInteractive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isInteractive")
    boolean isInteractive();

    /**
     * percentComplete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/percentComplete">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentComplete")
    @NFloat
    double percentComplete();

    /**
     * presentationStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/presentationStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentationStyle")
    @NInt
    long presentationStyle();

    /**
     * targetTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/targetTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetTransform")
    @ByValue
    CGAffineTransform targetTransform();

    /**
     * transitionDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/transitionDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("transitionDuration")
    double transitionDuration();

    /**
     * viewControllerForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/viewControllerForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewControllerForKey:")
    UIViewController viewControllerForKey(String key);

    /**
     * viewForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerTransitionCoordinatorContext_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerTransitionCoordinatorContext/viewForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewForKey:")
    UIView viewForKey(String key);
}

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
    @Generated
    @Selector("completionCurve")
    @NInt
    long completionCurve();

    @Generated
    @Selector("completionVelocity")
    @NFloat
    double completionVelocity();

    @Generated
    @Selector("containerView")
    UIView containerView();

    @Generated
    @Selector("initiallyInteractive")
    boolean initiallyInteractive();

    @Generated
    @Selector("isAnimated")
    boolean isAnimated();

    @Generated
    @Selector("isCancelled")
    boolean isCancelled();

    @Generated
    @Selector("isInteractive")
    boolean isInteractive();

    @Generated
    @Selector("percentComplete")
    @NFloat
    double percentComplete();

    @Generated
    @Selector("presentationStyle")
    @NInt
    long presentationStyle();

    @Generated
    @Selector("targetTransform")
    @ByValue
    CGAffineTransform targetTransform();

    @Generated
    @Selector("transitionDuration")
    double transitionDuration();

    @Generated
    @Selector("viewControllerForKey:")
    UIViewController viewControllerForKey(String key);

    @Generated
    @Selector("viewForKey:")
    UIView viewForKey(String key);
}

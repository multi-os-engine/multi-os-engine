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

import apple.uikit.UINavigationController;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UINavigationControllerDelegate")
public interface UINavigationControllerDelegate {
    @Generated
    @IsOptional
    @Selector("navigationController:animationControllerForOperation:fromViewController:toViewController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object navigationControllerAnimationControllerForOperationFromViewControllerToViewController(
            UINavigationController navigationController, @NInt long operation, UIViewController fromVC,
            UIViewController toVC) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("navigationController:didShowViewController:animated:")
    default void navigationControllerDidShowViewControllerAnimated(UINavigationController navigationController,
            UIViewController viewController, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("navigationController:interactionControllerForAnimationController:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object navigationControllerInteractionControllerForAnimationController(
            UINavigationController navigationController, @Mapped(ObjCObjectMapper.class) Object animationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("navigationController:willShowViewController:animated:")
    default void navigationControllerWillShowViewControllerAnimated(UINavigationController navigationController,
            UIViewController viewController, boolean animated) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("navigationControllerPreferredInterfaceOrientationForPresentation:")
    @NInt
    default long navigationControllerPreferredInterfaceOrientationForPresentation(
            UINavigationController navigationController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("navigationControllerSupportedInterfaceOrientations:")
    @NUInt
    default long navigationControllerSupportedInterfaceOrientations(UINavigationController navigationController) {
        throw new java.lang.UnsupportedOperationException();
    }
}

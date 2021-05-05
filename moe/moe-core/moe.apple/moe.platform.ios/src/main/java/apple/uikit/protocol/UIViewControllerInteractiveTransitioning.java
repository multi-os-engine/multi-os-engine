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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerInteractiveTransitioning")
public interface UIViewControllerInteractiveTransitioning {
    @Generated
    @IsOptional
    @Selector("completionCurve")
    @NInt
    default long completionCurve() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("completionSpeed")
    @NFloat
    default double completionSpeed() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("startInteractiveTransition:")
    void startInteractiveTransition(
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    /**
     * In 10.0, if an object conforming to UIViewControllerAnimatedTransitioning is
     * known to be interruptible, it is possible to start it as if it was not
     * interactive and then interrupt the transition and interact with it. In this
     * case, implement this method and return NO. If an interactor does not
     * implement this method, YES is assumed.
     */
    @Generated
    @IsOptional
    @Selector("wantsInteractiveStart")
    default boolean wantsInteractiveStart() {
        throw new java.lang.UnsupportedOperationException();
    }
}

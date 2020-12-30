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

package apple.quartzcore.protocol;

import apple.quartzcore.CAAnimation;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Delegate methods for CAAnimation.
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAAnimationDelegate")
public interface CAAnimationDelegate {
    /**
     * Called when the animation begins its active duration.
     */
    @Generated
    @IsOptional
    @Selector("animationDidStart:")
    default void animationDidStart(CAAnimation anim) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the animation either completes its active duration or
     * is removed from the object it is attached to (i.e. the layer). 'flag'
     * is true if the animation reached the end of its active duration
     * without being removed.
     */
    @Generated
    @IsOptional
    @Selector("animationDidStop:finished:")
    default void animationDidStopFinished(CAAnimation anim, boolean flag) {
        throw new java.lang.UnsupportedOperationException();
    }
}

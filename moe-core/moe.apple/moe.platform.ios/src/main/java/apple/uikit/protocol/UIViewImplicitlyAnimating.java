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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewImplicitlyAnimating")
public interface UIViewImplicitlyAnimating extends UIViewAnimating {
    @Generated
    @IsOptional
    @Selector("addAnimations:")
    default void addAnimations(@NotNull @ObjCBlock(name = "call_addAnimations") Block_addAnimations animation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("addAnimations:delayFactor:")
    default void addAnimationsDelayFactor(
            @NotNull @ObjCBlock(name = "call_addAnimationsDelayFactor") Block_addAnimationsDelayFactor animation,
            @NFloat double delayFactor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("addCompletion:")
    default void addCompletion(@NotNull @ObjCBlock(name = "call_addCompletion") Block_addCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("continueAnimationWithTimingParameters:durationFactor:")
    default void continueAnimationWithTimingParametersDurationFactor(
            @Nullable @Mapped(ObjCObjectMapper.class) UITimingCurveProvider parameters, @NFloat double durationFactor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAnimations {
        @Generated
        void call_addAnimations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAnimationsDelayFactor {
        @Generated
        void call_addAnimationsDelayFactor();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletion {
        @Generated
        void call_addCompletion(@NInt long finalPosition);
    }
}

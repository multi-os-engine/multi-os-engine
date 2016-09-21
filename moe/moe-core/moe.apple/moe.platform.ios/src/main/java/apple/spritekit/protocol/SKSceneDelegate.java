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

package apple.spritekit.protocol;

import apple.spritekit.SKScene;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKSceneDelegate")
public interface SKSceneDelegate {
    @Generated
    @IsOptional
    @Selector("didApplyConstraintsForScene:")
    default void didApplyConstraintsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("didEvaluateActionsForScene:")
    default void didEvaluateActionsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("didFinishUpdateForScene:")
    default void didFinishUpdateForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("didSimulatePhysicsForScene:")
    default void didSimulatePhysicsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("update:forScene:")
    default void updateForScene(double currentTime, SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }
}

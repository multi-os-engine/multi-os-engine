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
    /**
     * didApplyConstraintsForScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSceneDelegate_Ref/index.html#//apple_ref/occ/intfm/SKSceneDelegate/didApplyConstraintsForScene:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didApplyConstraintsForScene:")
    default void didApplyConstraintsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didEvaluateActionsForScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSceneDelegate_Ref/index.html#//apple_ref/occ/intfm/SKSceneDelegate/didEvaluateActionsForScene:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didEvaluateActionsForScene:")
    default void didEvaluateActionsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didFinishUpdateForScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSceneDelegate_Ref/index.html#//apple_ref/occ/intfm/SKSceneDelegate/didFinishUpdateForScene:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didFinishUpdateForScene:")
    default void didFinishUpdateForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didSimulatePhysicsForScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSceneDelegate_Ref/index.html#//apple_ref/occ/intfm/SKSceneDelegate/didSimulatePhysicsForScene:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("didSimulatePhysicsForScene:")
    default void didSimulatePhysicsForScene(SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * update:forScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKSceneDelegate_Ref/index.html#//apple_ref/occ/intfm/SKSceneDelegate/update:forScene:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("update:forScene:")
    default void updateForScene(double currentTime, SKScene scene) {
        throw new java.lang.UnsupportedOperationException();
    }
}

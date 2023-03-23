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

package apple.scenekit.protocol;

import apple.scenekit.SCNPhysicsContact;
import apple.scenekit.SCNPhysicsWorld;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] SCNPhysicsContactDelegate
 * 
 * The SCNPhysicsContactDelegate protocol is to be implemented by delegates that want to be notified when a contact
 * occured.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNPhysicsContactDelegate")
public interface SCNPhysicsContactDelegate {
    @Generated
    @IsOptional
    @Selector("physicsWorld:didBeginContact:")
    default void physicsWorldDidBeginContact(SCNPhysicsWorld world, SCNPhysicsContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("physicsWorld:didEndContact:")
    default void physicsWorldDidEndContact(SCNPhysicsWorld world, SCNPhysicsContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("physicsWorld:didUpdateContact:")
    default void physicsWorldDidUpdateContact(SCNPhysicsWorld world, SCNPhysicsContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }
}

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

import apple.scenekit.SCNScene;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneRendererDelegate")
public interface SCNSceneRendererDelegate {
    @Generated
    @IsOptional
    @Selector("renderer:didApplyAnimationsAtTime:")
    default void rendererDidApplyAnimationsAtTime(@Mapped(ObjCObjectMapper.class) Object renderer, double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:didRenderScene:atTime:")
    default void rendererDidRenderSceneAtTime(@Mapped(ObjCObjectMapper.class) Object renderer, SCNScene scene,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:didSimulatePhysicsAtTime:")
    default void rendererDidSimulatePhysicsAtTime(@Mapped(ObjCObjectMapper.class) Object renderer, double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:updateAtTime:")
    default void rendererUpdateAtTime(@Mapped(ObjCObjectMapper.class) Object renderer, double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("renderer:willRenderScene:atTime:")
    default void rendererWillRenderSceneAtTime(@Mapped(ObjCObjectMapper.class) Object renderer, SCNScene scene,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }
}

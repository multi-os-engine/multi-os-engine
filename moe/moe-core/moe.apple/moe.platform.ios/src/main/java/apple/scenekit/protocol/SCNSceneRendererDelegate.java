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

/**
 * @protocol SCNSceneRendererDelegate
 * @abstract Implement this protocol to perform operations at various times during the rendering
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneRendererDelegate")
public interface SCNSceneRendererDelegate {
    /**
     * @method renderer:didApplyAnimationsAtTime:
     * @abstract Invoked on the delegate once the scene renderer did apply the animations.
     * @param renderer The renderer that did render the scene.
     * @param time The time at which the animations were applied.
     * @discussion All modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didApplyAnimationsAtTime:")
    default void rendererDidApplyAnimationsAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method renderer:didRenderScene:atTime:
     * @abstract Invoked on the delegate once the scene renderer did render the scene.
     * @param renderer The renderer that did render the scene.
     * @param scene The rendered scene.
     * @param time The time at which the scene was rendered.
     * @discussion Starting in 10.10 all modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didRenderScene:atTime:")
    default void rendererDidRenderSceneAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, SCNScene scene,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method renderer:didSimulatePhysicsAtTime:
     * @abstract Invoked on the delegate once the scene renderer did simulate the physics.
     * @param renderer The renderer that did render the scene.
     * @param time The time at which the physics were simulated.
     * @discussion All modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didSimulatePhysicsAtTime:")
    default void rendererDidSimulatePhysicsAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method renderer:updateAtTime:
     * @abstract Implement this to perform per-frame game logic. Called exactly once per frame before any animation and actions are evaluated and any physics are simulated.
     * @param renderer The renderer that will render the scene.
     * @param time The time at which to update the scene.
     * @discussion All modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:updateAtTime:")
    default void rendererUpdateAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer, double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method renderer:willRenderScene:atTime:
     * @abstract Invoked on the delegate before the scene renderer renders the scene. At this point the openGL context and the destination framebuffer are bound.
     * @param renderer The renderer that will render the scene.
     * @param scene The scene to be rendered.
     * @param time The time at which the scene is to be rendered.
     * @discussion Starting in 10.10 all modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:willRenderScene:atTime:")
    default void rendererWillRenderSceneAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            SCNScene scene, double time) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method renderer:didApplyConstraintsAtTime:
     * @abstract Invoked on the delegate once the scene renderer did apply the constraints.
     * @param renderer The renderer that did render the scene.
     * @param time The time at which the constraints were simulated.
     * @discussion All modifications done within this method don't go through the transaction model, they are directly applied on the presentation tree.
     */
    @Generated
    @IsOptional
    @Selector("renderer:didApplyConstraintsAtTime:")
    default void rendererDidApplyConstraintsAtTime(@Mapped(ObjCObjectMapper.class) SCNSceneRenderer renderer,
            double time) {
        throw new java.lang.UnsupportedOperationException();
    }
}

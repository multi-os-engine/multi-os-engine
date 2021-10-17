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

import apple.foundation.NSDictionary;
import apple.scenekit.SCNNode;
import apple.scenekit.SCNRenderer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@category] NSObject (SCNNodeRendererDelegate)
 * <p>
 * The SCNNodeRendererDelegate protocol declares the methods that an instance of SCNNode invokes to let a delegate customize its rendering.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNNodeRendererDelegate")
public interface SCNNodeRendererDelegate {
    /**
     * renderNode:renderer:arguments:
     * <p>
     * Invoked when a node is rendered.
     * <p>
     * The preferred way to customize the rendering is to tweak the material properties of the different materials of the node's geometry. SCNMaterial conforms to the SCNShadable protocol and allows for more advanced rendering using GLSL.
     * You would typically use a renderer delegate with a node that has no geometry and only serves as a location in space. An example would be attaching a particle system to that node and render it with custom OpenGL code.
     * Only drawing calls and the means to achieve them are supposed to be performed during the renderer delegate callback, any changes in the model (nodes, geometry...) would involve unexpected results.
     *
     * @param node      The node to render.
     * @param renderer  The scene renderer to render into.
     * @param arguments A dictionary whose values are SCNMatrix4 matrices wrapped in NSValue objects.
     */
    @Generated
    @IsOptional
    @Selector("renderNode:renderer:arguments:")
    default void renderNodeRendererArguments(SCNNode node, SCNRenderer renderer, NSDictionary<String, ?> arguments) {
        throw new java.lang.UnsupportedOperationException();
    }
}

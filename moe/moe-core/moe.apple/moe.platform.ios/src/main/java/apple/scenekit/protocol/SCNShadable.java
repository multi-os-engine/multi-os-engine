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
import apple.scenekit.SCNProgram;
import apple.scenekit.SCNRenderer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] SCNShadable
 * 
 * The SCNShadable protocol defines an object that is rendered with shaders.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNShadable")
public interface SCNShadable {
    /**
     * handleBindingOfSymbol:usingBlock:
     * 
     * Sets the block to call at render time to bind the value for the specified symbol of the receiver's SCNProgram. This method has no effect for symbols declared in shader modifiers.
     * 
     * This method can only be used with OpenGL and OpenGLES based programs.
     * 
     * @param symbol The name of the symbol to bind a value for.
     * @param block The block to call to bind the specified symbol.
     */
    @Generated
    @IsOptional
    @Selector("handleBindingOfSymbol:usingBlock:")
    default void handleBindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleBindingOfSymbolUsingBlock") Block_handleBindingOfSymbolUsingBlock block) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * handleUnbindingOfSymbol:usingBlock:
     * 
     * Sets the block to call at render time to unbind the value for the specified symbol of the receiver's SCNProgram. This method has no effect for symbols declared in shader modifiers.
     * 
     * This method can only be used with OpenGL and OpenGLES based programs.
     * 
     * @param symbol The name of the symbol to unbind.
     * @param block The block to call to unbind the specified symbol.
     */
    @Generated
    @IsOptional
    @Selector("handleUnbindingOfSymbol:usingBlock:")
    default void handleUnbindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleUnbindingOfSymbolUsingBlock") Block_handleUnbindingOfSymbolUsingBlock block) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] program
     * 
     * Specifies a custom program used to render the receiver.
     * 
     * When a program is set, it overrides all the rendering parameters such as material settings and shaderModifiers.
     */
    @Generated
    @IsOptional
    @Selector("program")
    default SCNProgram program() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] program
     * 
     * Specifies a custom program used to render the receiver.
     * 
     * When a program is set, it overrides all the rendering parameters such as material settings and shaderModifiers.
     */
    @Generated
    @IsOptional
    @Selector("setProgram:")
    default void setProgram(SCNProgram value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] shaderModifiers
     * 
     * Dictionary of shader modifiers snippets, targeting entry points. The valid keys are the entry points described in the "Shader Modifier Entry Point" constants. The values are the code snippets formatted as described below.
     * 
     * Shader modifiers allow you to inject shader code in the standard shaders of SceneKit. This injection is allowed in few controlled entry points, allowing specific kind of tasks in specific context. Each modifier can operate on specific structures along with access to global uniforms, that could be the standard SceneKit uniforms or its own declared uniforms.
     * 
     * Shader modifiers can be used to tweak SceneKit rendering by adding custom code at the following entry points:
     *     1. vertex   (SCNShaderModifierEntryPointGeometry)
     *     2. surface  (SCNShaderModifierEntryPointSurface)
     *     3. lighting (SCNShaderModifierEntryPointLightingModel)
     *     4. fragment (SCNShaderModifierEntryPointFragment)
     * See below for a detailed explanation of these entry points and the context they provide.
     * 
     * Shader modifiers can be written in either GLSL or the Metal Shading Language. Metal shaders won't run on iOS 8 and macOS 10.10 or earlier.
     * 
     * The structure of a shader modifier is:
     * 
     *     GLSL
     *     | uniform float myGrayAmount = 3.0; // Custom GLSL uniforms declarations are of the form `[uniform type uniformName [= defaultValue]]`
     *     |
     *     | // Optional global function definitions (for Metal: references to uniforms in global functions are not supported).
     *     | float mySin(float t) {
     *     |    return sin(t);
     *     | }
     *     |
     *     | [#pragma transparent | opaque]
     *     | [#pragma body]
     *     |
     *     | // the shader modifier code snippet itself
     *     | vec3 myColor = myGrayAmount;
     *     | _output.color.rgb += myColor;
     * 
     *     Metal Shading Language
     *     | #pragma arguments
     *     | float myGrayAmount; // Custom Metal uniforms declarations require a #pragma and are of the form `[type name]`
     *     |
     *     | #pragma declaration
     *     | // Optional global function definitions (for Metal: references to uniforms in global functions are not supported).
     *     | float mySin(float t) {
     *     |    return sin(t);
     *     | }
     *     |
     *     | [#pragma transparent | opaque]
     *     | [#pragma body]
     *     |
     *     | // the shader modifier code snippet itself
     *     | float3 myColor = myGrayAmount;
     *     | _output.color.rgb += myColor;
     * 
     * The `#pragma body` directive
     *     Is only needed if you declared functions that must not be included in the shader code itself.
     * 
     * The `#pragma transparent` directive
     *     Forces the rendering to be blended using the following equation:
     *         _output.color.rgb + (1 - _output.color.a) * dst.rgb;
     *     where `dst` represents the current fragment color. The rgb components must be premultiplied.
     * 
     * The `#pragma opaque` directive
     *     Forces the rendering to be opaque. It then ignores the alpha component of the fragment.
     * 
     * When using Metal, you can also transfer varying values from the vertex shader (geometry shader modifier) to the fragment shader (surface and/or fragment shader modifier):
     *     1. Start by declaring the varying values in at least one of the shader modifiers:
     * 
     *         Metal Shading Language
     *         | #pragma varyings
     *         | half3 myVec;
     * 
     *     2. Then write the varying values from the vertex shader (geometry shader modifier):
     * 
     *         Metal Shading Language
     *         | #pragma body
     *         | out.myVec = _geometry.normal.xyz * 0.5h + 0.5h;
     * 
     *     3. Finally read the varying values from the fragment shader (surface and/or fragment shader modifier):
     * 
     *         Metal Shading Language
     *         | _output.color.rgb = saturate(in.myVec);
     * 
     *  SceneKit declares the following built-in uniforms:
     * 
     *     GLSL                                        | Metal Shading Language                                |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     float u_time                                | float    scn_frame.time                               | The current time, in seconds
     *     vec2  u_inverseResolution                   | float2   scn_frame.inverseResolution                  | 1.0 / screen size
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat4  u_viewTransform                       | float4x4 scn_frame.viewTransform                      | See SCNViewTransform
     *     mat4  u_inverseViewTransform                | float4x4 scn_frame.inverseViewTransform               |
     *     mat4  u_projectionTransform                 | float4x4 scn_frame.projectionTransform                | See SCNProjectionTransform
     *     mat4  u_inverseProjectionTransform          | float4x4 scn_frame.inverseProjectionTransform         |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat4  u_normalTransform                     | float4x4 scn_node.normalTransform                     | See SCNNormalTransform
     *     mat4  u_modelTransform                      | float4x4 scn_node.modelTransform                      | See SCNModelTransform
     *     mat4  u_inverseModelTransform               | float4x4 scn_node.inverseModelTransform               |
     *     mat4  u_modelViewTransform                  | float4x4 scn_node.modelViewTransform                  | See SCNModelViewTransform
     *     mat4  u_inverseModelViewTransform           | float4x4 scn_node.inverseModelViewTransform           |
     *     mat4  u_modelViewProjectionTransform        | float4x4 scn_node.modelViewProjectionTransform        | See SCNModelViewProjectionTransform
     *     mat4  u_inverseModelViewProjectionTransform | float4x4 scn_node.inverseModelViewProjectionTransform |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat2x3 u_boundingBox;                       | float2x3 scn_node.boundingBox                         | The bounding box of the current geometry, in model space, u_boundingBox[0].xyz and u_boundingBox[1].xyz being respectively the minimum and maximum corner of the box.
     *     mat2x3 u_worldBoundingBox;                  | float2x3 scn_node.worldBoundingBox                    | The bounding box of the current geometry, in world space.
     * 
     *     When writing shaders using the Metal Shading Language a complete description of the type of the scn_frame variable (SCNSceneBuffer) can be found in the <SceneKit/scn_metal> header file.
     *     The type of the scn_node variable is generated at compile time and there's no corresponding header file in the framework.
     * 
     * In addition to these built-in uniforms, it is possible to use custom uniforms:
     * 
     *     The SCNGeometry and SCNMaterial classes are key-value coding compliant classes, which means that you can set values for arbitrary keys. Even if the key `myAmplitude` is not a declared property of the class, you can still set a value for it.
     *     Declaring a `myAmplitude` uniform in the shader modifier makes SceneKit observe the reveiver's `myAmplitude` key. Any change to that key will make SceneKit bind the uniform with the new value.
     * 
     *     The following GLSL and Metal Shading Language types (and their Objective-C counterparts) can be used to declare (and bind) custom uniforms:
     * 
     *        GLSL        | Metal Shading Language | Objective-C                           |
     *        ------------┼------------------------┼---------------------------------------┤
     *        int         | int                    | NSNumber, NSInteger, int              |
     *        float       | float                  | NSNumber, CGFloat, float, double      |
     *        vec2        | float2                 | CGPoint                               |
     *        vec3        | float3                 | SCNVector3                            |
     *        vec4        | float4                 | SCNVector4                            |
     *        mat4, mat44 | float4x4               | SCNMatrix4                            |
     *        sampler2D   | texture2d              | SCNMaterialProperty                   |
     *        samplerCube | texturecube            | SCNMaterialProperty (with a cube map) |
     *        -           | device const T*        | MTLBuffer                             | Feature introduced in macOS 10.13, iOS 11.0 and tvOS 11.0
     *        -           | struct {...}           | NSData                                | The entire struct can be set using NSData but it is also possible to set individual members using the member's name as a key and a value compatible with the member's type
     * 
     *     Common scalar types wrapped into a NSValue are also supported.
     * 
     *     The following prefixes are reserved by SceneKit and should not be used in custom names:
     *         1. u_
     *         2. a_
     *         3. v_
     * 
     *     Custom uniforms can be animated using explicit animations.
     */
    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    default void setShaderModifiers(NSDictionary<String, String> value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] shaderModifiers
     * 
     * Dictionary of shader modifiers snippets, targeting entry points. The valid keys are the entry points described in the "Shader Modifier Entry Point" constants. The values are the code snippets formatted as described below.
     * 
     * Shader modifiers allow you to inject shader code in the standard shaders of SceneKit. This injection is allowed in few controlled entry points, allowing specific kind of tasks in specific context. Each modifier can operate on specific structures along with access to global uniforms, that could be the standard SceneKit uniforms or its own declared uniforms.
     * 
     * Shader modifiers can be used to tweak SceneKit rendering by adding custom code at the following entry points:
     *     1. vertex   (SCNShaderModifierEntryPointGeometry)
     *     2. surface  (SCNShaderModifierEntryPointSurface)
     *     3. lighting (SCNShaderModifierEntryPointLightingModel)
     *     4. fragment (SCNShaderModifierEntryPointFragment)
     * See below for a detailed explanation of these entry points and the context they provide.
     * 
     * Shader modifiers can be written in either GLSL or the Metal Shading Language. Metal shaders won't run on iOS 8 and macOS 10.10 or earlier.
     * 
     * The structure of a shader modifier is:
     * 
     *     GLSL
     *     | uniform float myGrayAmount = 3.0; // Custom GLSL uniforms declarations are of the form `[uniform type uniformName [= defaultValue]]`
     *     |
     *     | // Optional global function definitions (for Metal: references to uniforms in global functions are not supported).
     *     | float mySin(float t) {
     *     |    return sin(t);
     *     | }
     *     |
     *     | [#pragma transparent | opaque]
     *     | [#pragma body]
     *     |
     *     | // the shader modifier code snippet itself
     *     | vec3 myColor = myGrayAmount;
     *     | _output.color.rgb += myColor;
     * 
     *     Metal Shading Language
     *     | #pragma arguments
     *     | float myGrayAmount; // Custom Metal uniforms declarations require a #pragma and are of the form `[type name]`
     *     |
     *     | #pragma declaration
     *     | // Optional global function definitions (for Metal: references to uniforms in global functions are not supported).
     *     | float mySin(float t) {
     *     |    return sin(t);
     *     | }
     *     |
     *     | [#pragma transparent | opaque]
     *     | [#pragma body]
     *     |
     *     | // the shader modifier code snippet itself
     *     | float3 myColor = myGrayAmount;
     *     | _output.color.rgb += myColor;
     * 
     * The `#pragma body` directive
     *     Is only needed if you declared functions that must not be included in the shader code itself.
     * 
     * The `#pragma transparent` directive
     *     Forces the rendering to be blended using the following equation:
     *         _output.color.rgb + (1 - _output.color.a) * dst.rgb;
     *     where `dst` represents the current fragment color. The rgb components must be premultiplied.
     * 
     * The `#pragma opaque` directive
     *     Forces the rendering to be opaque. It then ignores the alpha component of the fragment.
     * 
     * When using Metal, you can also transfer varying values from the vertex shader (geometry shader modifier) to the fragment shader (surface and/or fragment shader modifier):
     *     1. Start by declaring the varying values in at least one of the shader modifiers:
     * 
     *         Metal Shading Language
     *         | #pragma varyings
     *         | half3 myVec;
     * 
     *     2. Then write the varying values from the vertex shader (geometry shader modifier):
     * 
     *         Metal Shading Language
     *         | #pragma body
     *         | out.myVec = _geometry.normal.xyz * 0.5h + 0.5h;
     * 
     *     3. Finally read the varying values from the fragment shader (surface and/or fragment shader modifier):
     * 
     *         Metal Shading Language
     *         | _output.color.rgb = saturate(in.myVec);
     * 
     *  SceneKit declares the following built-in uniforms:
     * 
     *     GLSL                                        | Metal Shading Language                                |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     float u_time                                | float    scn_frame.time                               | The current time, in seconds
     *     vec2  u_inverseResolution                   | float2   scn_frame.inverseResolution                  | 1.0 / screen size
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat4  u_viewTransform                       | float4x4 scn_frame.viewTransform                      | See SCNViewTransform
     *     mat4  u_inverseViewTransform                | float4x4 scn_frame.inverseViewTransform               |
     *     mat4  u_projectionTransform                 | float4x4 scn_frame.projectionTransform                | See SCNProjectionTransform
     *     mat4  u_inverseProjectionTransform          | float4x4 scn_frame.inverseProjectionTransform         |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat4  u_normalTransform                     | float4x4 scn_node.normalTransform                     | See SCNNormalTransform
     *     mat4  u_modelTransform                      | float4x4 scn_node.modelTransform                      | See SCNModelTransform
     *     mat4  u_inverseModelTransform               | float4x4 scn_node.inverseModelTransform               |
     *     mat4  u_modelViewTransform                  | float4x4 scn_node.modelViewTransform                  | See SCNModelViewTransform
     *     mat4  u_inverseModelViewTransform           | float4x4 scn_node.inverseModelViewTransform           |
     *     mat4  u_modelViewProjectionTransform        | float4x4 scn_node.modelViewProjectionTransform        | See SCNModelViewProjectionTransform
     *     mat4  u_inverseModelViewProjectionTransform | float4x4 scn_node.inverseModelViewProjectionTransform |
     *     --------------------------------------------┼-------------------------------------------------------┤
     *     mat2x3 u_boundingBox;                       | float2x3 scn_node.boundingBox                         | The bounding box of the current geometry, in model space, u_boundingBox[0].xyz and u_boundingBox[1].xyz being respectively the minimum and maximum corner of the box.
     *     mat2x3 u_worldBoundingBox;                  | float2x3 scn_node.worldBoundingBox                    | The bounding box of the current geometry, in world space.
     * 
     *     When writing shaders using the Metal Shading Language a complete description of the type of the scn_frame variable (SCNSceneBuffer) can be found in the <SceneKit/scn_metal> header file.
     *     The type of the scn_node variable is generated at compile time and there's no corresponding header file in the framework.
     * 
     * In addition to these built-in uniforms, it is possible to use custom uniforms:
     * 
     *     The SCNGeometry and SCNMaterial classes are key-value coding compliant classes, which means that you can set values for arbitrary keys. Even if the key `myAmplitude` is not a declared property of the class, you can still set a value for it.
     *     Declaring a `myAmplitude` uniform in the shader modifier makes SceneKit observe the reveiver's `myAmplitude` key. Any change to that key will make SceneKit bind the uniform with the new value.
     * 
     *     The following GLSL and Metal Shading Language types (and their Objective-C counterparts) can be used to declare (and bind) custom uniforms:
     * 
     *        GLSL        | Metal Shading Language | Objective-C                           |
     *        ------------┼------------------------┼---------------------------------------┤
     *        int         | int                    | NSNumber, NSInteger, int              |
     *        float       | float                  | NSNumber, CGFloat, float, double      |
     *        vec2        | float2                 | CGPoint                               |
     *        vec3        | float3                 | SCNVector3                            |
     *        vec4        | float4                 | SCNVector4                            |
     *        mat4, mat44 | float4x4               | SCNMatrix4                            |
     *        sampler2D   | texture2d              | SCNMaterialProperty                   |
     *        samplerCube | texturecube            | SCNMaterialProperty (with a cube map) |
     *        -           | device const T*        | MTLBuffer                             | Feature introduced in macOS 10.13, iOS 11.0 and tvOS 11.0
     *        -           | struct {...}           | NSData                                | The entire struct can be set using NSData but it is also possible to set individual members using the member's name as a key and a value compatible with the member's type
     * 
     *     Common scalar types wrapped into a NSValue are also supported.
     * 
     *     The following prefixes are reserved by SceneKit and should not be used in custom names:
     *         1. u_
     *         2. a_
     *         3. v_
     * 
     *     Custom uniforms can be animated using explicit animations.
     */
    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    default NSDictionary<String, String> shaderModifiers() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBindingOfSymbolUsingBlock {
        @Generated
        void call_handleBindingOfSymbolUsingBlock(int programID, int location, SCNNode renderedNode,
                SCNRenderer renderer);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleUnbindingOfSymbolUsingBlock {
        @Generated
        void call_handleUnbindingOfSymbolUsingBlock(int programID, int location, SCNNode renderedNode,
                SCNRenderer renderer);
    }
}

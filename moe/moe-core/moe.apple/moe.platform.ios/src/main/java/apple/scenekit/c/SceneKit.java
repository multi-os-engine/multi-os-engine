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

package apple.scenekit.c;

import apple.glkit.struct.GLKMatrix4;
import apple.glkit.struct.GLKVector3;
import apple.glkit.struct.GLKVector4;
import apple.javascriptcore.JSContext;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("SceneKit")
@Runtime(CRuntime.class)
public final class SceneKit {
    static {
        NatJ.register();
    }

    @Generated
    private SceneKit() {
    }

    /**
     * Returns true if 'a' is exactly equal to 'b'.
     */
    @Generated
    @CFunction
    public static native boolean SCNVector3EqualToVector3(@ByValue SCNVector3 a, @ByValue SCNVector3 b);

    /**
     * Returns true if 'a' is exactly equal to 'b'.
     */
    @Generated
    @CFunction
    public static native boolean SCNVector4EqualToVector4(@ByValue SCNVector4 a, @ByValue SCNVector4 b);

    /**
     * Returns an initialized SCNVector3
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector3 SCNVector3Make(float x, float y, float z);

    /**
     * Returns an initialized SCNVector4
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector4 SCNVector4Make(float x, float y, float z, float w);

    /**
     * Returns true if 'm' is the identity matrix.
     */
    @Generated
    @CFunction
    public static native boolean SCNMatrix4IsIdentity(@ByValue SCNMatrix4 m);

    /**
     * Returns true if 'a' is exactly equal to 'b'.
     */
    @Generated
    @CFunction
    public static native boolean SCNMatrix4EqualToMatrix4(@ByValue SCNMatrix4 a, @ByValue SCNMatrix4 b);

    /**
     * Returns a transform that translates by '(tx, ty, tz)':
     * m' = [1 0 0 0; 0 1 0 0; 0 0 1 0; tx ty tz 1].
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeTranslation(float tx, float ty, float tz);

    /**
     * Returns a transform that scales by '(sx, sy, sz)':
     * m' = [sx 0 0 0; 0 sy 0 0; 0 0 sz 0; 0 0 0 1].
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeScale(float sx, float sy, float sz);

    /**
     * Returns a matrix that rotates by 'angle' radians about the vector '(x, y, z)'.
     */
    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeRotation(float angle, float x, float y, float z);

    /**
     * Translate 'm' by '(tx, ty, tz)' and return the result:
     * m' = translate(tx, ty, tz) * m.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Translate(@ByValue SCNMatrix4 m, float tx, float ty, float tz);

    /**
     * Scale 'm' by '(sx, sy, sz)' and return the result:
     * m' = scale(sx, sy, sz) * m.
     */
    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Scale(@ByValue SCNMatrix4 m, float sx, float sy, float sz);

    /**
     * Rotate 'm' by 'angle' radians about the vector '(x, y, z)' and return the result:
     * * m' = rotation(angle, x, y, z) * m.
     * Note: on iOS 10.12 or before, the matrix are combined in the wrong order: m' = m * rotation(angle, x, y, z)
     */
    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Rotate(@ByValue SCNMatrix4 m, float angle, float x, float y, float z);

    /**
     * Invert 'm' and return the result.
     */
    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Invert(@ByValue SCNMatrix4 m);

    /**
     * Concatenate 'b' to 'a' and return the result: m' = a * b.
     */
    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Mult(@ByValue SCNMatrix4 a, @ByValue SCNMatrix4 b);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector3 SCNVector3FromGLKVector3(@ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 SCNVector3ToGLKVector3(@ByValue SCNVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector4 SCNVector4FromGLKVector4(@ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 SCNVector4ToGLKVector4(@ByValue SCNVector4 vector);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 SCNMatrix4ToGLKMatrix4(@ByValue SCNMatrix4 mat);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4FromGLKMatrix4(@ByValue GLKMatrix4 mat);

    /**
     * [@function] SCNExportJavaScriptModule
     * <p>
     * Exports SceneKit's symbols (constants and class definition) into the specified JavaScript context.
     * <p>
     * SceneKit's classes, properties and constants are exported as global object with their original name. Selectors
     * are exported using the rules defined in JavaScriptCore's JSExport.h.
     * <p>
     * For example to instanciate a node in JavaScript:
     * <p>
     * var aNode = SCNNode.node();
     * <p>
     * to change its opacity:
     * <p>
     * aNode.opacity = 0.5;
     * <p>
     * to remove from its parent node:
     * <p>
     * aNode.removeFromParentNode();
     * <p>
     * to animate a node opacity:
     * <p>
     * SCNTransaction.begin();
     * SCNTransaction.setAnimationDuration(1.0);
     * aNode.opacity = 0.5;
     * SCNTransaction.commit();
     * <p>
     * The following special objects are also exported:
     * <p>
     * class name constructor Objective-C class
     * SCNColor SCNColor.color(r,g,b,a) NSColor
     * CATimingFunction CATimingFunction.functionWithName(name) CATimingFunction
     * CABasicAnimation CABasicAnimation.animationWithKeyPath(aPath) CABasicAnimation
     * CAAnimationGroup new CAAnimationGroup() CAAnimationGroup
     * CAKeyframeAnimation CAKeyframeAnimation.animationWithKeyPath(aPath) CAKeyframeAnimation
     * SCNImage SCNImage.imageWithURL(aURL) NSImage / UIImage
     * SCNImage.imageWithPath(aPath)
     * <p>
     * Vectors use this syntax:
     * aNode.scale = {x:2, y:2, z:2};
     * <p>
     * Matrices use this syntax:
     * aNode.transform = {m11:1, m12:0, m13:0 ... m44:1};
     */
    @Generated
    @CFunction
    public static native void SCNExportJavaScriptModule(JSContext context);

    /**
     * The null vector: [0 0 0].
     */
    @Generated
    @CVariable()
    @ByValue
    public static native SCNVector3 SCNVector3Zero();

    /**
     * The null vector: [0 0 0 0].
     */
    @Generated
    @CVariable()
    @ByValue
    public static native SCNVector4 SCNVector4Zero();

    /**
     * The identity matrix: [1 0 0 0; 0 1 0 0; 0 0 1 0; 0 0 0 1].
     */
    @Generated
    @CVariable()
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Identity();

    /**
     * domain for errors from SceneKit API.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNErrorDomain();

    /**
     * Deprecated, use SCNHitTestSearchModeAny for the SCNHitTestOptionSearchMode option instead
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestFirstFoundOnlyKey();

    /**
     * Deprecated, use SCNHitTestSearchModeAll for the SCNHitTestOptionSearchMode option instead
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestSortResultsKey();

    /**
     * If set to YES ignores the objects clipped by the zNear/zFar range of the current point of view. Defaults to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestClipToZRangeKey();

    /**
     * If set to YES ignores the faces not facing to the camera. Defaults to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestBackFaceCullingKey();

    /**
     * If set to YES only tests the bounding boxes of the 3D objects. Defaults to NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestBoundingBoxOnlyKey();

    /**
     * Determines whether the child nodes are ignored. Defaults to NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestIgnoreChildNodesKey();

    /**
     * Specifies the root node to use for the hit test. Defaults to the root node of the scene.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestRootNodeKey();

    /**
     * Determines whether hidden nodes should be ignored. Defaults to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestIgnoreHiddenNodesKey();

    /**
     * Determines the node categories to test. Defaults to all bits set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestOptionCategoryBitMask();

    /**
     * This key is optional and may be used in association with the SCNGeometrySourceSemanticTexcoord semantic. It
     * allows to associate a mapping channel from the geometry to a symbol from the program source code. The mapping
     * channel allows to plug programs that work with multiple texture coordinates. The associated value must be a
     * NSNumber(integer) greater than zero.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNProgramMappingChannelKey();

    /**
     * [@constant] SCNShaderModifierEntryPointGeometry
     * <p>
     * This is the entry point to operate on the geometry vertices, for example deforming them.
     * <p>
     * It operates entirely in the vertex shader stage. It's input is the geometry structure:
     * <p>
     * Structures available from the SCNShaderModifierEntryPointGeometry entry point:
     * <p>
     * | struct SCNShaderGeometry {
     * | float4 position;
     * | float3 normal;
     * | float4 tangent;
     * | float4 color;
     * | float2 texcoords[kSCNTexcoordCount];
     * | } _geometry;
     * |
     * | Access: ReadWrite
     * | Stages: Vertex shader only
     * <p>
     * kSCNTexcoordCount is a constant integer set to the number of texture coordinates used.
     * <p>
     * All the geometric fields (position, normal and tangent) are in model space. You can use one of the provided
     * automatic uniforms
     * such as u_modelTransform or u_modelViewTransform if you want to operate in another space (but the results must
     * stay in the model space, otherwise remaining computations won't be correct).
     * The texture coordinates are the raw values found in the mesh, they have not been transformed yet by their
     * optional contentsTransform. The contentsTransform if any is applied after the geometry shader modifier.
     * <p>
     * Example: Simple sinusoidal deformation
     * <p>
     * GLSL
     * | uniform float Amplitude = 0.1;
     * |
     * | _geometry.position.xyz += _geometry.normal * (Amplitude * _geometry.position.y * _geometry.position.x) *
     * sin(u_time);
     * <p>
     * Metal Shading Language
     * | #pragma arguments
     * | float Amplitude;
     * |
     * | _geometry.position.xyz += _geometry.normal * (Amplitude * _geometry.position.y * _geometry.position.x) *
     * sin(scn_frame.time);
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointGeometry();

    /**
     * [@constant] SCNShaderModifierEntryPointSurface
     * <p>
     * This is the entry point to alter the surface representation of the material, before the lighting has taken place.
     * <p>
     * Structures available from the SCNShaderModifierEntryPointSurface entry point:
     * <p>
     * | struct SCNShaderSurface {
     * | float3 view; // Direction from the point on the surface toward the camera (V)
     * | float3 position; // Position of the fragment
     * | float3 normal; // Normal of the fragment (N)
     * | float3 geometryNormal; // Geometric normal of the fragment (normal map is ignored)
     * | float3 tangent; // Tangent of the fragment
     * | float3 bitangent; // Bitangent of the fragment
     * | float4 ambient; // Ambient property of the fragment
     * | float2 ambientTexcoord; // Ambient texture coordinates
     * | float4 diffuse; // Diffuse property of the fragment. Alpha contains the opacity.
     * | float2 diffuseTexcoord; // Diffuse texture coordinates
     * | float4 specular; // Specular property of the fragment
     * | float2 specularTexcoord; // Specular texture coordinates
     * | float4 emission; // Emission property of the fragment
     * | float2 emissionTexcoord; // Emission texture coordinates
     * | float4 multiply; // Multiply property of the fragment
     * | float2 multiplyTexcoord; // Multiply texture coordinates
     * | float4 transparent; // Transparent property of the fragment
     * | float2 transparentTexcoord; // Transparent texture coordinates
     * | float4 reflective; // Reflective property of the fragment
     * | float metalness; // Metalness property of the fragment
     * | float2 metalnessTexcoord; // Metalness texture coordinates
     * | float roughness; // Roughness property of the fragment
     * | float2 roughnessTexcoord; // Roughness texture coordinates
     * | float clearCoat; // Clear Coat property of the fragment. Available since macOS 10.15, iOS 13, tvOS 13 and
     * watchOS 6.
     * | float2 clearCoatTexcoord; // Clear Coat texture coordinates. Available since macOS 10.15, iOS 13, tvOS 13 and
     * watchOS 6.
     * | float clearCoatRoughness; // Clear Coat Roughness property of the fragment. Available since macOS 10.15, iOS
     * 13, tvOS 13 and watchOS 6.
     * | float2 clearCoatRoughnessTexcoord; // Clear Coat Roughness texture coordinates. Available since macOS 10.15,
     * iOS 13, tvOS 13 and watchOS 6.
     * | float3 clearCoatNormal; // Clear Coat Normal property of the fragment. Available since macOS 10.15, iOS 13,
     * tvOS 13 and watchOS 6.
     * | float2 clearCoatNormalTexcoord; // Clear Coat Normnal texture coordinates. Available since macOS 10.15, iOS 13,
     * tvOS 13 and watchOS 6.
     * | float4 selfIllumination; // Self Illumination property of the fragment. Available since macOS 10.13, iOS 11,
     * tvOS 11 and watchOS 4. Available as `emission` in previous versions.
     * | float2 selfIlluminationTexcoord; // Self Illumination texture coordinates. Available since macOS 10.13, iOS 11,
     * tvOS 11 and watchOS 4. Available as `emissionTexcoord` in previous versions.
     * | float ambientOcclusion; // Ambient Occlusion property of the fragment. Available since macOS 10.13, iOS 11,
     * tvOS 11 and watchOS 4. Available as `multiply` in previous versions.
     * | float2 ambientOcclusionTexcoord; // Ambient Occlusion texture coordinates. Available since macOS 10.13, iOS 11,
     * tvOS 11 and watchOS 4. Available as `multiplyTexcoord` in previous versions.
     * | float shininess; // Shininess property of the fragment
     * | float fresnel; // Fresnel property of the fragment
     * | } _surface;
     * |
     * | Access: ReadWrite
     * | Stages: Fragment shader only
     * <p>
     * All geometric fields are in view space.
     * All the other properties will be colors (texture have already been sampled at this stage) or floats. You can
     * however do an extra sampling of standard textures if you want.
     * In this case the naming pattern is u_<property>Texture. For example u_diffuseTexture or u_reflectiveTexture. Note
     * that you have to be sure that the material do have a texture
     * set for this property, otherwise you'll trigger a shader compilation error.
     * <p>
     * Example: Procedural black and white stripes
     * <p>
     * GLSL
     * | uniform float Scale = 12.0;
     * | uniform float Width = 0.25;
     * | uniform float Blend = 0.3;
     * |
     * | vec2 position = fract(_surface.diffuseTexcoord * Scale);
     * | float f1 = clamp(position.y / Blend, 0.0, 1.0);
     * | float f2 = clamp((position.y - Width) / Blend, 0.0, 1.0);
     * | f1 = f1 * (1.0 - f2);
     * | f1 = f1 * f1 * 2.0 * (3. * 2. * f1);
     * | _surface.diffuse = mix(vec4(1.0), vec4(0.0), f1);
     * <p>
     * Metal Shading Language
     * | #pragma arguments
     * | float Scale;
     * | float Width;
     * | float Blend;
     * |
     * | float2 position = fract(_surface.diffuseTexcoord * Scale);
     * | float f1 = clamp(position.y / Blend, 0.0, 1.0);
     * | float f2 = clamp((position.y - Width) / Blend, 0.0, 1.0);
     * | f1 = f1 * (1.0 - f2);
     * | f1 = f1 * f1 * 2.0 * (3. * 2. * f1);
     * | _surface.diffuse = mix(float4(1.0), float4(0.0), f1);
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointSurface();

    /**
     * [@constant] SCNShaderModifierEntryPointLightingModel
     * <p>
     * This is the entry point to provide custom lighting equation. The fragment will be called for each active light
     * of the scene and will need to accumulate lighting contribution for the vertex or the fragment in the
     * _lightingContribution structure, using the light structure given.
     * <p>
     * Structures available from the SCNShaderModifierEntryPointLightingModel entry point:
     * <p>
     * | All the structures available from the SCNShaderModifierEntryPointSurface entry point
     * |
     * | Access: ReadOnly
     * | Stages: Vertex shader and fragment shader
     * <p>
     * | struct SCNShaderLightingContribution {
     * | float3 ambient;
     * | float3 diffuse;
     * | float3 specular;
     * | } _lightingContribution;
     * |
     * | Access: ReadWrite
     * | Stages: Vertex shader and fragment shader
     * <p>
     * | struct SCNShaderLight {
     * | float4 intensity;
     * | float3 direction; // Direction from the point on the surface toward the light (L)
     * | } _light;
     * |
     * | Access: ReadOnly
     * | Stages: Vertex shader and fragment shader
     * <p>
     * Example: Wrap diffuse lighting
     * <p>
     * GLSL
     * | uniform float WrapFactor = 0.5;
     * |
     * | float dotProduct = (WrapFactor + max(0.0, dot(_surface.normal,_light.direction))) / (1 + WrapFactor);
     * | _lightingContribution.diffuse += (dotProduct * _light.intensity.rgb);
     * | vec3 halfVector = normalize(_light.direction + _surface.view);
     * | dotProduct = max(0.0, pow(max(0.0, dot(_surface.normal, halfVector)), _surface.shininess));
     * | _lightingContribution.specular += (dotProduct * _light.intensity.rgb);
     * <p>
     * Metal Shading Language
     * | #pragma arguments
     * | float WrapFactor;
     * |
     * | float dotProduct = (WrapFactor + max(0.0, dot(_surface.normal,_light.direction))) / (1 + WrapFactor);
     * | _lightingContribution.diffuse += (dotProduct * _light.intensity.rgb);
     * | float3 halfVector = normalize(_light.direction + _surface.view);
     * | dotProduct = max(0.0, pow(max(0.0, dot(_surface.normal, halfVector)), _surface.shininess));
     * | _lightingContribution.specular += (dotProduct * _light.intensity.rgb);
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointLightingModel();

    /**
     * [@constant] SCNShaderModifierEntryPointFragment
     * <p>
     * This is the last entry point in the fragment shader, where you can alter the final color returned by the shader.
     * <p>
     * You can alter the final color by reading and writing to the output color via the output structure below.
     * <p>
     * Structures available from the SCNShaderModifierEntryPointFragment entry point:
     * <p>
     * | All the structures available from the SCNShaderModifierEntryPointSurface entry point
     * |
     * | Access: ReadOnly
     * | Stages: Fragment shader only
     * <p>
     * | struct SCNShaderOutput {
     * | float4 color;
     * | } _output;
     * |
     * | Access: ReadWrite
     * | Stages: Fragment shader only
     * <p>
     * Example: Inverse final color
     * <p>
     * GLSL
     * | _output.color.rgb = vec3(1.0) - _output.color.rgb;
     * <p>
     * Metal Shading Language
     * | _output.color.rgb = 1.0 - _output.color.rgb;
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointFragment();

    /**
     * [@constant] SCNViewOptionPreferredRenderingAPI Specifies the preferred rendering API to be used by the renderer.
     * <p>
     * Pass it as the key in the options dictionary given to initWithFrame:options:. The value is a NSNumber wrapping a
     * SCNRenderingAPI. You can also select the preferred rendering API directly from the SCNView inspector in
     * InterfaceBuilder.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferredRenderingAPIKey();

    /**
     * [@constant] SCNViewOptionPreferredDevice Specifies the preferred Metal device to be used by the renderer.
     * <p>
     * The value is directly a id <MTLDevice>.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferredDeviceKey();

    /**
     * [@constant] SCNViewOptionPreferLowPowerDevice Specifies if the renderer should prefer a low power Metal device.
     * <p>
     * The value is a NSNumber wrapping a BOOL. Defaults to NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferLowPowerDeviceKey();

    /**
     * [@group] Scene source properties
     * File contributors. The values are dictionaries populated with keys documented in the "Contributor dictionary
     * keys" group.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetContributorsKey();

    /**
     * When the file was created. The value is a NSDate instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetCreatedDateKey();

    /**
     * When the file was last modified. The value is a NSDate instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetModifiedDateKey();

    /**
     * The up axis of the file. If the file is oriented Y-up, for example, then this is the string \@"0.0 1.0 0.0"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUpAxisKey();

    /**
     * The unit used in the file. The value is a dictionary populated with keys documented in the "Unit dictionary keys"
     * group.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitKey();

    /**
     * [@group] Contributor dictionary keys
     * Authoring tool used to create the file. The corresponding value is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetAuthoringToolKey();

    /**
     * The file's author. The corresponding value is an NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetAuthorKey();

    /**
     * [@group] Unit dictionary keys
     * The name (NSString) of the unit
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitNameKey();

    /**
     * A NSNumber encapsulating a floating-point value indicating how many meters the unit is. For example, if the name
     * is \@"centimeter", then this will be 0.01.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitMeterKey();

    /**
     * [@constant] SCNSceneSourceCreateNormalsIfAbsentKey
     * <p>
     * Enable to try to guess acceptable normals for the vertices if none are given in the file
     * <p>
     * Use this with a boolean value encapsulated in a NSNumber. The default value is NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceCreateNormalsIfAbsentKey();

    /**
     * [@constant] SCNSceneSourceCheckConsistencyKey
     * <p>
     * Pass YES in order to perform the document validation.
     * <p>
     * This option can be set in the options dictionary of the SCNScene and SCNSceneSource loading methods.
     * The value for this option should be a boolean NSNumber. If its boolean value is YES (the default is NO),
     * SceneKit will attempt to check the document for consistency.
     * If the document doesn't pass the consistency check it is then not loaded and an error is returned.
     * This is slower, but for security reasons it should be set to YES if you are not sure the files you load are valid
     * and have not been tampered with.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceCheckConsistencyKey();

    /**
     * [@constant] SCNSceneSourceFlattenSceneKey
     * <p>
     * Pass YES to flatten the scene graph when possible.
     * <p>
     * This option can be set in the options dictionary of the SCNScene and SCNSceneSource loading methods.
     * The value for this option should be a boolean NSNumber. If its boolean value is YES (the default is NO),
     * SceneKit will attempt to reduce the scene graph by merging the geometries.
     * This option is suitable to preview a 3D scene efficiently and when manipulating the scene graph is not needed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceFlattenSceneKey();

    /**
     * [@constant] SCNSceneSourceUseSafeModeKey
     * <p>
     * Pass YES in order to enable the safe mode.
     * <p>
     * This option can be set in the options dictionary of the SCNScene and SCNSceneSource loading methods.
     * The value for this option should be a boolean NSNumber. If its boolean value is YES (the default is NO),
     * SceneKit will forbid network accesses, prevent the loading of resources from arbitrary directories, and will not
     * execute
     * any code present in the loaded files.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceUseSafeModeKey();

    /**
     * [@constant] SCNSceneSourceAssetDirectoryURLsKey
     * <p>
     * Pass an array of directory URLs where SceneKit should look for resources
     * <p>
     * By default, SceneKit will look for the external resources it cannot find in the parent directory of the imported
     * file.
     * You can add additional directories by setting an array of URLs for this key when calling sceneWithOptions:error:.
     * This is recommended if you want to construct your scene source from a data object, not from an URL,
     * and need to load resources whose paths are not absolute.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetDirectoryURLsKey();

    /**
     * [@constant] SCNSceneSourceOverrideAssetURLsKey
     * <p>
     * Pass YES in order to override assets URLs with the directory URLs passed via SCNSceneSourceAssetDirectoryURLsKey.
     * <p>
     * By default, SceneKit will look for the external resources using the paths/urls as described in the imported file.
     * You can force SceneKit to only search for extern resources within the directories specified by the
     * SCNSceneSourceAssetDirectoryURLsKey key.
     * This can be useful to load a file and its resources from a specific bundle for instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceOverrideAssetURLsKey();

    /**
     * [@constant] SCNSceneSourceStrictConformanceKey
     * <p>
     * Pass YES to interpret the 3D format of the file in a strict way.
     * <p>
     * This option defaults to NO. In this case SceneKit will try to read any additional metadata present in the file to
     * enable additional features and make the rendering as close as possible to the original intent. If you pass YES,
     * SceneKit will instead only consider features which are part of the file format specification.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceStrictConformanceKey();

    /**
     * [@constant] SCNSceneSourceAnimationImportPolicyKey
     * <p>
     * Pass one of the value below to specify what to do with loaded animations.
     * <p>
     * See below for the description of each individual key. Defaults to
     * SCNSceneSourceAnimationImportPolicyPlayRepeatedly. On 10.9 and before the behavior is
     * SCNSceneSourceAnimationImportPolicyPlayUsingSceneTimeBase. For compatibility reason if the application was built
     * on 10.9 or before the default behavior is SCNSceneSourceAnimationImportPolicyPlayUsingSceneTimeBase.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyKey();

    /**
     * [@constant] SCNSceneSourceLoadingOptionPreserveOriginalTopology
     * <p>
     * Pass YES to make SceneKit preserve the original topology instead of triangulating at load time. This can be
     * useful to get better results when subdividing a geometry.
     * <p>
     * Defaults to YES starting macOS 10.15, iOS 13, tvOS 13 and watchOS 6. Defaults to NO in previous versions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceLoadingOptionPreserveOriginalTopology();

    /**
     * [@constant] SCNSceneSourceAnimationImportPolicyPlay
     * <p>
     * Add animations to the scene and play them once (repeatCount set to 1).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlay();

    /**
     * [@constant] SCNSceneSourceAnimationImportPolicyPlayRepeatedly
     * <p>
     * Add animations to the scene and play them repeatedly (repeatCount set to infinity).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlayRepeatedly();

    /**
     * [@constant] SCNSceneSourceAnimationImportPolicyDoNotPlay
     * <p>
     * Only keep animations in the SCNSceneSource and don't add to the animatable elements of the scene.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyDoNotPlay();

    /**
     * [@constant] SCNSceneSourceAnimationImportPolicyPlayUsingSceneTimeBase
     * <p>
     * Add animations to the scene and play them using the SCNView/SCNRenderer's scene time (usesSceneTimeBase set to
     * YES)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlayUsingSceneTimeBase();

    /**
     * [@constant] SCNDetailedErrorsKey
     * <p>
     * Key to access the detailed validation errors.
     * <p>
     * This key will be present in the user info dictionary of errors created by the various sceneWithOptions: methods.
     * When present, the value associated with it is an array of detailed errors found by the consistency checker
     * which represent consistency errors in the 3D file. Some metadata about these detailed errors is available
     * in their user info dictionary using the other keys (SCNConsistency*) defined in this file.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNDetailedErrorsKey();

    /**
     * [@constant] SCNConsistencyElementIDErrorKey
     * <p>
     * For XML-based formats, the ID of the element where the error occurred.
     * <p>
     * When the element does not have an ID, the ID of the closest parent element which has one is returned.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyElementIDErrorKey();

    /**
     * [@constant] SCNConsistencyElementTypeErrorKey
     * <p>
     * For XML-based formats, the tag name of the element where the error occurred.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyElementTypeErrorKey();

    /**
     * [@constant] SCNConsistencyLineNumberErrorKey
     * <p>
     * For text-based formats, the line number where an error occurred.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyLineNumberErrorKey();

    /**
     * [@constant] SCNSceneExportDestinationURL
     * <p>
     * Specifies the final destination (as a NSURL) of the scene being exported.
     * <p>
     * The destination URL is required if the scene is exported to a temporary directory and then moved to a final
     * destination. This enables the exported document to get correct relative paths to referenced images.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneExportDestinationURL();

    /**
     * A floating point value, encapsulated in a NSNumber, containing the start time of the scene.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneStartTimeAttributeKey();

    /**
     * A floating point value, encapsulated in a NSNumber, containing the end time of the scene.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneEndTimeAttributeKey();

    /**
     * A floating point value, encapsulated in a NSNumber, containing the framerate of the scene.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneFrameRateAttributeKey();

    /**
     * A vector3 value, encapsulated in a NSValue, containing the up axis of the scene. This is just for information,
     * setting the up axis as no effect.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneUpAxisAttributeKey();

    /**
     * [@group] Rendering arguments
     * <p>
     * These keys are used for the 'semantic' argument of -[SCNProgram setSemantic:forSymbol:options:]
     * Transforms are SCNMatrix4 wrapped in NSValues.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNViewTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNProjectionTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNNormalTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelViewTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelViewProjectionTransform();

    /**
     * Ambient light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeAmbient();

    /**
     * Omnidirectional light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeOmni();

    /**
     * Directional light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeDirectional();

    /**
     * Spot light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeSpot();

    /**
     * IES light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeIES();

    /**
     * Light probe
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeProbe();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelPhong();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelBlinn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelLambert();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelConstant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelPhysicallyBased();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticVertex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticNormal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticTexcoord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticTangent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticVertexCrease();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticEdgeCrease();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticBoneWeights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticBoneIndices();

    /**
     * float3 : {x,y,z} controller animation type : {NSValue(SCNVector3)}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyPosition();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyAngle();

    /**
     * float3 : {x,y,z} controller animation type : {NSValue(SCNVector3)}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyRotationAxis();

    /**
     * float3 : {x,y,z} controller animation type : {NSValue(SCNVector3)}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyVelocity();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyAngularVelocity();

    /**
     * float not controllable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyLife();

    /**
     * float4 : {r,g,b,a} controller animation type : {UIColor}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyColor();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyOpacity();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertySize();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFrame();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFrameRate();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyBounce();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyCharge();

    /**
     * float controller animation type : {NSNumber}
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFriction();

    /**
     * float3 not controllable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyContactPoint();

    /**
     * float3 not controllable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyContactNormal();

    /**
     * Type of the physics shape. Default is SCNPhysicsShapeTypeConvexHull. See below for the list of shape types.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeKey();

    /**
     * A boolean to decide if a hierarchy is kept as a compound of shapes or flattened as one single volume. Default is
     * true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeKeepAsCompoundKey();

    /**
     * Local scaling of the physics shape (as an SCNVector3 wrapped in a NSValue)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeScaleKey();

    /**
     * Collision margin of the physics shape (as an NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeOptionCollisionMargin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeBoundingBox();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeConvexHull();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeConcavePolyhedron();

    /**
     * Allows to filter the objects tested by rayTest, contactTest and convexSweep. Default is
     * SCNPhysicsCollisionCategoryAll
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestCollisionBitMaskKey();

    /**
     * Specifies how to perform the ray/contact/sweep test. Values are defined below. If not defined, then defaults to
     * SCNPhysicsTestSearchModeAny
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeKey();

    /**
     * Specifies whether the back faces should be ignored or not. Defaults to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestBackfaceCullingKey();

    /**
     * Returns the first contact found.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeAny();

    /**
     * Returns the nearest contact found only.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeClosest();

    /**
     * All contacts are returned.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeAll();

    /**
     * Determines whether the search should be exhaustive. Defaults to SCNHitTestSearchModeClosest.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestOptionSearchMode();

    /**
     * [@constant] SCNSceneSourceConvertUnitsToMetersKey
     * <p>
     * Pass the units you want the scene to be converted to (in meter).
     * <p>
     * Use this with a floating value encapsulated in a NSNumber. The default value is nil which means no conversion
     * done. Passing a non-zero value will convert the scene coordinates so that 1 unit corresponds to N meters. For
     * example pass 0.01 for 1 unit == 1 centimeter, pass 0.3048 for 1 unit == 1 foot...
     * For better physics simulation it is recommended to use 1 unit equals to 1 meter.
     * This option has no effect for SCN files or if the asset is already compressed by Xcode (use the compression
     * options instead).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceConvertUnitsToMetersKey();

    /**
     * [@constant] SCNSceneSourceConvertToYUpKey
     * <p>
     * Pass YES if a scene should be converted to Y up if it currently has a different up axis.
     * <p>
     * Use this with a boolean value encapsulated in a NSNumber. The default value is NO.
     * This option has no effect for SCN files or if the asset is already compressed by Xcode (use the compression
     * options instead).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceConvertToYUpKey();

    /**
     * Determines whether the shape of an area light should not be taken into account. Defaults to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestOptionIgnoreLightArea();

    /**
     * Area light
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeArea();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelShadowOnly();
}

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

package apple.modelio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * MDLMaterialSemantic
 * 
 * [@summary] The material semantics are identifiers for material properties 
 *            formally identified by one of the standard material descriptors.
 * 
 * When files containing material properties are loaded and translated
 *             by ModelIO, an appropriate standard material descriptor will be 
 *             chosen, and any properties translated from the loaded file can be 
 *             retrieved using one of these semantics.
 * 
 * MDLMaterialSemanticBaseColor
 *    The inherent color of a surface to be used as a modulator during shading. 
 *    Default is 50% gray
 * 
 * MDLMaterialSemanticSubsurface,
 *    The degree to which light scatters under the surface of a material
 * 
 * MDLMaterialSemanticMetallic
 *    A blend between a material behaving as a dielectric material at zero, and a 
 *    metal at one.
 * 
 * MDLMaterialSemanticSpecular
 *    Specular response to incident light
 * 
 * MDLMaterialSemanticSpecularExponent
 *    Power of the specular exponent in the case that a Blinn/Phong BSDF is in use.
 * 
 * MDLMaterialSemanticSpecularTint
 *    At zero, the specular highlight will use the hue, saturation, and intensity 
 *    of incoming light to color the specular response; at one, the material's 
 *    base color, and the light's intensity will be used.
 * 
 * MDLMaterialSemanticRoughness
 *    Controls diffuse and specular response. A value of zero is smooth and shiny. 
 *    At one, a diffuse material will retroreflect, and the specular highlight 
 *    will be very spread out.
 * 
 * MDLMaterialSemanticAnisotropic
 *    The degree to which the specular highlight is elongated in the direction of 
 *    the local tangent basis. A mesh that does not have a tangent basis will not 
 *    respond to this parameter.
 * 
 * MDLMaterialSemanticAnisotropicRotation
 *    The degree to which the anisotropy is rotated relative to the direction of the
 *    local tangent basis. Values from zero to one are mapped to zero to two PI.
 * 
 * MDLMaterialSemanticSheen
 *    A specular tint that appears at glancing angles on an object
 * 
 * MDLMaterialSemanticSheenTint
 *    At zero, the specular highlight will use the hue, saturation, and intensity 
 *    of incoming light to color the specular response; at one, the material's 
 *    base color, and the light's intensity will be used.
 * 
 * MDLMaterialSemanticClearcoat
 *    A second specular highlight, much like the gloss that results from a clear 
 *    coat on an automotive finish
 * 
 * MDLMaterialSemanticClearcoatGloss
 *    The glossiness of the clear coat highlight.
 * 
 * MDLMaterialSemanticEmission
 *    A value that is to be emitted as radiance by a surface
 * 
 * MDLMaterialSemanticBump
 *    A value that perturbs surface normals according to the local gradient of 
 *    the property
 * 
 * MDLMaterialSemanticOpacity
 *    The opacity of the surface
 * 
 * MDLMaterialSemanticInterfaceIndexOfRefraction
 *    n1 in Schlick's equation, typically 1.0 for air
 * 
 * MDLMaterialSemanticMaterialIndexOfRefraction
 *    n2 in Schlick's equation
 * 
 * MDLMaterialSemanticObjectSpaceNormal
 *    A value that perturbs surface normals in object space
 * 
 * MDLMaterialSemanticTangentSpaceNormal
 *    A value that perturbs surface normals in a local tangent space
 * 
 * MDLMaterialSemanticDisplacement
 *    Displacement of a surface relative to surface normal
 * 
 * MDLMaterialSemanticDisplacementScale
 *    Scaling factor for displacement
 * 
 * MDLMaterialSemanticAmbientOcclusion
 *    Ambient occlusion describes the accessibility of the surface to the 
 *    surrounding radiant environment and is typically used to attenuate it. It is 
 *    not intended to attenuate direct illumination sources.
 * 
 * MDLMaterialSemanticAmbientOcclusionScale
 *    The degree to which the ambient occlusion values are applied
 * 
 * MDLMaterialSemanticUserDefined = 0x8000
 *    Properties with this value are created when material properties are 
 *    translated for which no known semantic applies.
 *    Semantics defined at greater than this value are available to be user defined.
 *    The first value is also used to indicate
 */
@Generated
public final class MDLMaterialSemantic {
    @Generated @NUInt public static final long BaseColor = 0x0000000000000000L;
    @Generated @NUInt public static final long Subsurface = 0x0000000000000001L;
    @Generated @NUInt public static final long Metallic = 0x0000000000000002L;
    @Generated @NUInt public static final long Specular = 0x0000000000000003L;
    @Generated @NUInt public static final long SpecularExponent = 0x0000000000000004L;
    @Generated @NUInt public static final long SpecularTint = 0x0000000000000005L;
    @Generated @NUInt public static final long Roughness = 0x0000000000000006L;
    @Generated @NUInt public static final long Anisotropic = 0x0000000000000007L;
    @Generated @NUInt public static final long AnisotropicRotation = 0x0000000000000008L;
    @Generated @NUInt public static final long Sheen = 0x0000000000000009L;
    @Generated @NUInt public static final long SheenTint = 0x000000000000000AL;
    @Generated @NUInt public static final long Clearcoat = 0x000000000000000BL;
    @Generated @NUInt public static final long ClearcoatGloss = 0x000000000000000CL;
    @Generated @NUInt public static final long Emission = 0x000000000000000DL;
    @Generated @NUInt public static final long Bump = 0x000000000000000EL;
    @Generated @NUInt public static final long Opacity = 0x000000000000000FL;
    @Generated @NUInt public static final long InterfaceIndexOfRefraction = 0x0000000000000010L;
    @Generated @NUInt public static final long MaterialIndexOfRefraction = 0x0000000000000011L;
    @Generated @NUInt public static final long ObjectSpaceNormal = 0x0000000000000012L;
    @Generated @NUInt public static final long TangentSpaceNormal = 0x0000000000000013L;
    @Generated @NUInt public static final long Displacement = 0x0000000000000014L;
    @Generated @NUInt public static final long DisplacementScale = 0x0000000000000015L;
    @Generated @NUInt public static final long AmbientOcclusion = 0x0000000000000016L;
    @Generated @NUInt public static final long AmbientOcclusionScale = 0x0000000000000017L;
    @Generated @NUInt public static final long None = 0x0000000000008000L;
    @Generated @NUInt public static final long UserDefined = 0x0000000000008001L;

    @Generated
    private MDLMaterialSemantic() {
    }
}

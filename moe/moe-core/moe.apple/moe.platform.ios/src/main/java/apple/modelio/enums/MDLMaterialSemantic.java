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

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

package apple.modelio.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("ModelIO")
@Runtime(CRuntime.class)
public final class ModelIO {
    static {
        NatJ.register();
    }

    @Generated
    private ModelIO() {
    }

    /**
     * Alembic file format, file extension ABC, UTI public.alembic
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypeAlembic();

    /**
     * 3d Object file format, file extension OBJ, UTI public.geometry-definition-format
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTType3dObject();

    /**
     * Polygon file format, file extension PLY, UTI public.polygon-file-format
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypePolygon();

    /**
     * Stereolithography file format, file extension STL, UTI public.standard-tesselated-geometry-format
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypeStereolithography();

    /**
     * Universal Scene Description file format, file extension USDA or USDB, UTI com.pixar.universal-scene-description
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypeUniversalSceneDescription();

    /**
     * The attribute data describes the degree to which a surface’s appearance
     * changes in appearance when rotated about its normal vector. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeAnisotropy();

    /**
     * The normal to a curve at a vertex position
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeBinormal();

    /**
     * The vector completing a tangent basis at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeBitangent();

    /**
     * Color of a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeColor();

    /**
     * A crease value along an edge to be applied during subdivision.
     * A zero value indicates an edge is smooth, one is sharply creased. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeEdgeCrease();

    /**
     * Indices of joints in an animation rig corresponding to weighting information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeJointIndices();

    /**
     * Weights corresponding to joints for the purpose of blending animation
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeJointWeights();

    /**
     * The direction of a normal at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeNormal();

    /**
     * A value indicating the degree to which a vertex is occluded by surrounding geometry
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeOcclusionValue();

    /**
     * The position of a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributePosition();

    /**
     * The u direction of a shading basis at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeShadingBasisU();

    /**
     * The v direction of a shading basis at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeShadingBasisV();

    /**
     * Stencil values for subdivision at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeSubdivisionStencil();

    /**
     * A vector tangent to a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeTangent();

    /**
     * Texture coordinate mapping at a vertex
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeTextureCoordinate();
}

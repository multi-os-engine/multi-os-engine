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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypeAlembic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTType3dObject();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypePolygon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kUTTypeStereolithography();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeAnisotropy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeBinormal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeBitangent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeEdgeCrease();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeJointIndices();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeJointWeights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeNormal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeOcclusionValue();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributePosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeShadingBasisU();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeShadingBasisV();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeSubdivisionStencil();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeTangent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MDLVertexAttributeTextureCoordinate();
}

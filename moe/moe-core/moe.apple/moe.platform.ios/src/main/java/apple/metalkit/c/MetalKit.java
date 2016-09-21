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

package apple.metalkit.c;

import apple.metal.MTLVertexDescriptor;
import apple.modelio.MDLVertexDescriptor;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("MetalKit")
@Runtime(CRuntime.class)
public final class MetalKit {
    static {
        NatJ.register();
    }

    @Generated
    private MetalKit() {
    }

    @Generated
    @CFunction
    public static native MDLVertexDescriptor MTKModelIOVertexDescriptorFromMetal(MTLVertexDescriptor metalDescriptor);

    @Generated
    @CFunction
    public static native MTLVertexDescriptor MTKMetalVertexDescriptorFromModelIO(MDLVertexDescriptor modelIODescriptor);

    @Generated
    @CFunction
    @NUInt
    public static native long MTKModelIOVertexFormatFromMetal(@NUInt long vertexFormat);

    @Generated
    @CFunction
    @NUInt
    public static native long MTKMetalVertexFormatFromModelIO(@NUInt long vertexFormat);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionAllocateMipmaps();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionSRGB();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionTextureUsage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKTextureLoaderOptionTextureCPUCacheMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKModelErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTKModelErrorKey();
}

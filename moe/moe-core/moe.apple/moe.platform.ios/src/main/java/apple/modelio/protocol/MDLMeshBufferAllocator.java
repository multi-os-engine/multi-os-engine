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

package apple.modelio.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBufferAllocator")
public interface MDLMeshBufferAllocator {
    @Generated
    @Selector("newBuffer:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferType(@NUInt long length, @NUInt long type);

    @Generated
    @Selector("newBufferFromZone:data:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferFromZoneDataType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone, NSData data,
            @NUInt long type);

    @Generated
    @Selector("newBufferFromZone:length:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferFromZoneLengthType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone,
            @NUInt long length, @NUInt long type);

    @Generated
    @Selector("newBufferWithData:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferWithDataType(NSData data, @NUInt long type);

    @Generated
    @Selector("newZone:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone newZone(@NUInt long capacity);

    @Generated
    @Selector("newZoneForBuffersWithSize:andType:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone newZoneForBuffersWithSizeAndType(NSArray<? extends NSNumber> sizes,
            NSArray<? extends NSNumber> types);
}

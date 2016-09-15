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
    /**
     * newBuffer:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newBuffer:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newBuffer:type:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newBufferType(@NUInt long length, @NUInt long type);

    /**
     * newBufferFromZone:data:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newBufferFromZone:data:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newBufferFromZone:data:type:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newBufferFromZoneDataType(@Mapped(ObjCObjectMapper.class) Object zone, NSData data, @NUInt long type);

    /**
     * newBufferFromZone:length:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newBufferFromZone:length:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newBufferFromZone:length:type:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newBufferFromZoneLengthType(@Mapped(ObjCObjectMapper.class) Object zone, @NUInt long length,
            @NUInt long type);

    /**
     * newBufferWithData:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newBufferWithData:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newBufferWithData:type:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newBufferWithDataType(NSData data, @NUInt long type);

    /**
     * newZone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newZone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newZone:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newZone(@NUInt long capacity);

    /**
     * newZoneForBuffersWithSize:andType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMeshBufferAllocator_Protocol/index.html#//apple_ref/occ/intfm/MDLMeshBufferAllocator/newZoneForBuffersWithSize:andType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newZoneForBuffersWithSize:andType:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newZoneForBuffersWithSizeAndType(NSArray<? extends NSNumber> sizes, NSArray<? extends NSNumber> types);
}

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

/**
 * @protocol MDLMeshBufferAllocator
 * @abstract Object for allocating buffers to back vertex and index data
 * @discussion Accepted by MDLAsset init method.  Implementor creates objects 
 *             implementing MDLMeshBuffer with memory to be filled with vertex and 
 *             index data during 3d file loading and parsing.
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBufferAllocator")
public interface MDLMeshBufferAllocator {
    /**
     * @method newBuffer:type:
     * @abstract Create a buffer in a default zone
     * @param length Size of buffer to be created in bytes
     * @param type Type of data to be stored in this buffer
     */
    @Generated
    @Selector("newBuffer:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferType(@NUInt long length, @NUInt long type);

    /**
     * @method newBufferFromZone:data:type:
     * @abstract Create a buffer from a given zone and fill with data in the supplied 
     *           NSData object
     * @return An object conforming to the MDLMeshBuffer protocol.  Returns nil the 
     *         buffer could not be allocated in the given zone
     * @param zone Zone from which to allocate the memory
     * @param data Values with which to fill the buffer
     * @param type Type of data to be stored in this buffer
     * @discussion An implementing MDLMeshBufferAllocator object may increase the size 
     *             of the zone if the buffer could not be allocated with the current 
     *             zone size. Alternatively the implementation may return nil if the 
     *             buffer could not be allocated.
     */
    @Generated
    @Selector("newBufferFromZone:data:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferFromZoneDataType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone, NSData data,
            @NUInt long type);

    /**
     * @method newBufferFromZone:length:type:
     * @abstract Create a buffer from a given zone with the given length
     * @return An object conforming to the MDLMeshBuffer protocol.  Returns nil the 
     *         buffer could not be allocated in the zone given.
     * @param zone Zone from which to allocate the memory
     * @param type Type of data to be stored in this buffer
     * @discussion An implementing MDLMeshBufferAllocator object may increase the size 
     *             of the zone if the buffer could not be allocated with the current 
     *             zone size.  Alternatively the implementation may return nil if the 
     *             buffer could not be allocated.
     */
    @Generated
    @Selector("newBufferFromZone:length:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferFromZoneLengthType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone,
            @NUInt long length, @NUInt long type);

    /**
     * @method newBufferWithData:type:
     * @abstract Create a buffer in a default zone and fill with data in the supplied 
     *           NSData object
     * @param data Memory to fill the buffer with
     * @param type Type of data to be stored in this buffer
     */
    @Generated
    @Selector("newBufferWithData:type:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBuffer newBufferWithDataType(NSData data, @NUInt long type);

    /**
     * @method newZone:
     * @abstract Create a zone which can be used to allocate MDLMeshBuffer objects
     * @param capacity Total size in bytes of all buffers which can be created from 
     *        this zone
     */
    @Generated
    @Selector("newZone:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone newZone(@NUInt long capacity);

    /**
     * @method newZoneForBuffersWithSize:andType:
     * @abstract Create a zone which can be used to allocate MDLMeshBuffer objects
     * @param sizes Sizes of each buffer to be created in this zone
     * @param types Type of each buffer to be created in this zone. Values to be of
     *              MDLMeshBufferType
     * @discussion Will create a zone from which MDLMeshBuffer objects can be 
     *             allocated.  This will allocate a zone with enough capacity
     *             for each of the buffers with sizes and types specified even taking
     *             into any alignment restrictions necessary to use these buffers.
     */
    @Generated
    @Selector("newZoneForBuffersWithSize:andType:")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone newZoneForBuffersWithSizeAndType(NSArray<? extends NSNumber> sizes,
            NSArray<? extends NSNumber> types);
}

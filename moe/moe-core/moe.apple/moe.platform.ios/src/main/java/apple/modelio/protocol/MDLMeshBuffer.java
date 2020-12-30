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

import apple.foundation.NSData;
import apple.foundation.protocol.NSCopying;
import apple.modelio.MDLMeshBufferMap;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MDLMeshBuffer
 * 
 * Used by ModelIO to represent a buffer to be filled with vertex and
 *           index data
 * 
 * Supports deep copy of data by conforming to the NSCopying protocol
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBuffer")
public interface MDLMeshBuffer extends NSCopying {
    /**
     * [@property] allocator
     * 
     * Allocator object used to create this buffer.
     * 
     * This allcoator used for copy and relayout operations (such as when
     *             a new vertex descriptor is applied to a vertex buffer)
     */
    @Generated
    @Selector("allocator")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferAllocator allocator();

    /**
     * fillData:offset:
     * 
     * Fills buffer with data at offset
     * 
     * Fills data.length bytes of data.  Will not write beyond length of
     *             this buffer.
     * 
     * @param data Data to fill buffer with
     * @param offset Byte offset in buffer to begin filling data
     */
    @Generated
    @Selector("fillData:offset:")
    void fillDataOffset(NSData data, @NUInt long offset);

    /**
     * [@property] length
     * 
     * Size in bytes of the buffer allocation
     */
    @Generated
    @Selector("length")
    @NUInt
    long length();

    /**
     * map
     * 
     * CPU access to buffer's memory
     * 
     * The buffer will remain mapped as long as the returned MDLMeshBufferMap
     *             object exists. Mapping a buffer may impose restrictions on a system.
     *             For instance,  if the implementing class maps an OpenGL buffer, that
     *             buffer may be  unavailable for rendering while mapped, and cause a
     *             draw failure.  Precautions must be taken in such cases.
     * 
     * @return An MDLMeshBufferMap object to read or modify a buffer's memory
     */
    @Generated
    @Selector("map")
    MDLMeshBufferMap map();

    /**
     * [@property] type
     * 
     * the intended type of the buffer
     */
    @Generated
    @Selector("type")
    @NUInt
    long type();

    /**
     * [@property] zone
     * 
     * Zone from which this buffer was created
     * 
     * This zone will be used for copy and relayout operations (such as
     *             when a new vertex descriptor is applied to a vertex buffer).  If
     *             the default zone is used this will be nil.
     */
    @Generated
    @Selector("zone")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone zone();
}

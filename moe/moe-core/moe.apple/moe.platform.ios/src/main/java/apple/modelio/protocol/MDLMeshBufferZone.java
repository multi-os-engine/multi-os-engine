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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] MDLMeshBufferZone
 * 
 * A reference to a logical pool of memory from which mesh buffers would
 * be allocated
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBufferZone")
public interface MDLMeshBufferZone {
    /**
     * [@property] allocator
     * 
     * Allocator used to create the zone
     */
    @NotNull
    @Generated
    @Selector("allocator")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferAllocator allocator();

    /**
     * [@property] capacity
     * 
     * Total size of memory in the zone
     */
    @Generated
    @Selector("capacity")
    @NUInt
    long capacity();
}

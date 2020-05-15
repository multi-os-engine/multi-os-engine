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

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLMeshBuffer")
public interface MDLMeshBuffer extends NSCopying {
    @Generated
    @Selector("allocator")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferAllocator allocator();

    @Generated
    @Selector("fillData:offset:")
    void fillDataOffset(NSData data, @NUInt long offset);

    @Generated
    @Selector("length")
    @NUInt
    long length();

    @Generated
    @Selector("map")
    MDLMeshBufferMap map();

    @Generated
    @Selector("type")
    @NUInt
    long type();

    @Generated
    @Selector("zone")
    @MappedReturn(ObjCObjectMapper.class)
    MDLMeshBufferZone zone();
}

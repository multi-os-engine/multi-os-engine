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

package apple.metal.protocol;

import apple.metal.MTLCommandBufferDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandQueue")
public interface MTLCommandQueue {
    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBuffer();

    @Generated
    @Selector("commandBufferWithUnretainedReferences")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithUnretainedReferences();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("insertDebugCaptureBoundary")
    void insertDebugCaptureBoundary();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("commandBufferWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithDescriptor(MTLCommandBufferDescriptor descriptor);
}

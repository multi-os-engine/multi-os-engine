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

import apple.foundation.NSError;
import apple.metal.MTLRenderPassDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandBuffer")
public interface MTLCommandBuffer {
    @Generated
    @Selector("addCompletedHandler:")
    void addCompletedHandler(@ObjCBlock(name = "call_addCompletedHandler") Block_addCompletedHandler block);

    @Generated
    @Selector("addScheduledHandler:")
    void addScheduledHandler(@ObjCBlock(name = "call_addScheduledHandler") Block_addScheduledHandler block);

    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    Object blitCommandEncoder();

    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    Object commandQueue();

    @Generated
    @Selector("commit")
    void commit();

    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    Object computeCommandEncoder();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    Object device();

    @Generated
    @Selector("enqueue")
    void enqueue();

    @Generated
    @Selector("error")
    NSError error();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object parallelRenderCommandEncoderWithDescriptor(MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("presentDrawable:")
    void presentDrawable(@Mapped(ObjCObjectMapper.class) Object drawable);

    @Generated
    @Selector("presentDrawable:atTime:")
    void presentDrawableAtTime(@Mapped(ObjCObjectMapper.class) Object drawable, double presentationTime);

    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object renderCommandEncoderWithDescriptor(MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("retainedReferences")
    boolean retainedReferences();

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("status")
    @NUInt
    long status();

    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();

    @Generated
    @Selector("waitUntilScheduled")
    void waitUntilScheduled();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletedHandler {
        @Generated
        void call_addCompletedHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addScheduledHandler {
        @Generated
        void call_addScheduledHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("GPUEndTime")
    double GPUEndTime();

    @Generated
    @Selector("GPUStartTime")
    double GPUStartTime();

    @Generated
    @Selector("kernelEndTime")
    double kernelEndTime();

    @Generated
    @Selector("kernelStartTime")
    double kernelStartTime();

    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    @Generated
    @Selector("presentDrawable:afterMinimumDuration:")
    void presentDrawableAfterMinimumDuration(@Mapped(ObjCObjectMapper.class) Object drawable, double duration);

    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(String string);
}

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
    /**
     * addCompletedHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/addCompletedHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addCompletedHandler:")
    void addCompletedHandler(@ObjCBlock(name = "call_addCompletedHandler") Block_addCompletedHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletedHandler {
        @Generated
        void call_addCompletedHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * addScheduledHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/addScheduledHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addScheduledHandler:")
    void addScheduledHandler(@ObjCBlock(name = "call_addScheduledHandler") Block_addScheduledHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addScheduledHandler {
        @Generated
        void call_addScheduledHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * blitCommandEncoder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/blitCommandEncoder">iOS Dev Center</a>
     */
    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    Object blitCommandEncoder();

    /**
     * commandQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/commandQueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    Object commandQueue();

    /**
     * commit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/commit">iOS Dev Center</a>
     */
    @Generated
    @Selector("commit")
    void commit();

    /**
     * computeCommandEncoder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/computeCommandEncoder">iOS Dev Center</a>
     */
    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    Object computeCommandEncoder();

    /**
     * device</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/device">iOS Dev Center</a>
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    Object device();

    /**
     * enqueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/enqueue">iOS Dev Center</a>
     */
    @Generated
    @Selector("enqueue")
    void enqueue();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    NSError error();

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * parallelRenderCommandEncoderWithDescriptor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/parallelRenderCommandEncoderWithDescriptor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object parallelRenderCommandEncoderWithDescriptor(MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * presentDrawable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/presentDrawable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentDrawable:")
    void presentDrawable(@Mapped(ObjCObjectMapper.class) Object drawable);

    /**
     * presentDrawable:atTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/presentDrawable:atTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentDrawable:atTime:")
    void presentDrawableAtTime(@Mapped(ObjCObjectMapper.class) Object drawable, double presentationTime);

    /**
     * renderCommandEncoderWithDescriptor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/renderCommandEncoderWithDescriptor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    Object renderCommandEncoderWithDescriptor(MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * retainedReferences</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/retainedReferences">iOS Dev Center</a>
     */
    @Generated
    @Selector("retainedReferences")
    boolean retainedReferences();

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfp/MTLCommandBuffer/status">iOS Dev Center</a>
     */
    @Generated
    @Selector("status")
    @NUInt
    long status();

    /**
     * waitUntilCompleted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/waitUntilCompleted">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();

    /**
     * waitUntilScheduled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLCommandBuffer_Ref/index.html#//apple_ref/occ/intfm/MTLCommandBuffer/waitUntilScheduled">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitUntilScheduled")
    void waitUntilScheduled();
}

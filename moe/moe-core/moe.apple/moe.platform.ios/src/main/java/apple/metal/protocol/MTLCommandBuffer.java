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
import apple.metal.MTLBlitPassDescriptor;
import apple.metal.MTLComputePassDescriptor;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.MTLResourceStatePassDescriptor;
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

/**
 * [@protocol] MTLCommandBuffer
 * <p>
 * A serial list of commands for the device to execute.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandBuffer")
public interface MTLCommandBuffer {
    /**
     * addCompletedHandler:block:
     * <p>
     * Add a block to be called when this command buffer has completed execution.
     */
    @Generated
    @Selector("addCompletedHandler:")
    void addCompletedHandler(@ObjCBlock(name = "call_addCompletedHandler") Block_addCompletedHandler block);

    /**
     * addScheduledHandler:block:
     * <p>
     * Adds a block to be called when this command buffer has been scheduled for execution.
     */
    @Generated
    @Selector("addScheduledHandler:")
    void addScheduledHandler(@ObjCBlock(name = "call_addScheduledHandler") Block_addScheduledHandler block);

    /**
     * blitCommandEncoder
     * <p>
     * returns a blit command encoder to encode into this command buffer.
     */
    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBlitCommandEncoder blitCommandEncoder();

    /**
     * [@property] commandQueue
     * <p>
     * The command queue this command buffer was created from.
     */
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue commandQueue();

    /**
     * commit
     * <p>
     * Commit a command buffer so it can be executed as soon as possible.
     */
    @Generated
    @Selector("commit")
    void commit();

    /**
     * computeCommandEncoder
     * <p>
     * returns a compute command encoder to encode into this command buffer.
     */
    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoder();

    /**
     * [@property] device
     * <p>
     * The device this resource was created against.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * enqueue
     * <p>
     * Append this command buffer to the end of its MTLCommandQueue.
     */
    @Generated
    @Selector("enqueue")
    void enqueue();

    /**
     * [@property] error
     * <p>
     * If an error occurred during execution, the NSError may contain more details about the problem.
     */
    @Generated
    @Selector("error")
    NSError error();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * parallelRenderCommandEncoderWithDescriptor:
     * <p>
     * returns a parallel render pass encoder to encode into this command buffer.
     */
    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLParallelRenderCommandEncoder parallelRenderCommandEncoderWithDescriptor(
            MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * presentDrawable:
     * <p>
     * Add a drawable present that will be invoked when this command buffer has been scheduled for execution.
     * <p>
     * The submission thread will be lock stepped with present call been serviced by window server
     */
    @Generated
    @Selector("presentDrawable:")
    void presentDrawable(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable);

    /**
     * presentDrawable:atTime:
     * <p>
     * Add a drawable present for a specific host time that will be invoked when this command buffer has been scheduled for execution.
     * <p>
     * The submission thread will be lock stepped with present call been serviced by window server
     */
    @Generated
    @Selector("presentDrawable:atTime:")
    void presentDrawableAtTime(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable, double presentationTime);

    /**
     * renderCommandEncoderWithDescriptor:
     * <p>
     * returns a render command endcoder to encode into this command buffer.
     */
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderCommandEncoder renderCommandEncoderWithDescriptor(MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * [@property] retainedReferences
     * <p>
     * If YES, this command buffer holds strong references to objects needed to execute this command buffer.
     */
    @Generated
    @Selector("retainedReferences")
    boolean retainedReferences();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * [@property] status
     * <p>
     * status reports the current stage in the lifetime of MTLCommandBuffer, as it proceeds to enqueued, committed, scheduled, and completed.
     */
    @Generated
    @Selector("status")
    @NUInt
    long status();

    /**
     * waitUntilCompleted
     * <p>
     * Synchronously wait for this command buffer to complete.
     */
    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();

    /**
     * waitUntilScheduled
     * <p>
     * Synchronously wait for this command buffer to be scheduled.
     */
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

    /**
     * [@property] GPUEndTime
     * <p>
     * The host time in seconds that GPU finishes executing this command buffer. Returns zero if CPU has not received completion notification. This usually can be called in command buffer completion handler.
     */
    @Generated
    @Selector("GPUEndTime")
    double GPUEndTime();

    /**
     * [@property] GPUStartTime
     * <p>
     * The host time in seconds that GPU starts executing this command buffer. Returns zero if it has not started. This usually can be called in command buffer completion handler.
     */
    @Generated
    @Selector("GPUStartTime")
    double GPUStartTime();

    @Generated
    @Selector("kernelEndTime")
    double kernelEndTime();

    @Generated
    @Selector("kernelStartTime")
    double kernelStartTime();

    /**
     * popDebugGroup
     * <p>
     * Pop the latest named string off of the stack.
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * presentDrawable:afterMinimumDuration:
     * <p>
     * Add a drawable present for a specific host time that allows previous frame to be on screen for at least duration time.
     * <p>
     * The difference of this API versus presentDrawable:atTime is that this API defers calculation of the presentation time until the previous frame's actual presentation time is known, thus to be able to maintain a more consistent and stable frame time. This also provides an easy way to set frame rate.
     * The submission thread will be lock stepped with present call been serviced by window server
     *
     * @param drawable The drawable to be presented
     * @param duration The minimum time that previous frame should be displayed. The time is double preceision floating point in the unit of seconds.
     */
    @Generated
    @Selector("presentDrawable:afterMinimumDuration:")
    void presentDrawableAfterMinimumDuration(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable, double duration);

    /**
     * pushDebugGroup:
     * <p>
     * Push a new named string onto a stack of string labels.
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(String string);

    /**
     * computeCommandEncoderWithDispatchType
     * <p>
     * returns a compute command encoder to encode into this command buffer. Optionally allow this command encoder to execute dispatches concurrently.
     * <p>
     * On devices that do not support concurrent command encoders, this call is equivalent to computeCommandEncoder
     */
    @Generated
    @Selector("computeCommandEncoderWithDispatchType:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoderWithDispatchType(@NUInt long dispatchType);

    /**
     * encodeSignalEvent:value:
     * <p>
     * Encodes a command that signals an event with a given value.
     * <p>
     * This method may only be called if there is no current command encoder on the receiver.
     */
    @Generated
    @Selector("encodeSignalEvent:value:")
    void encodeSignalEventValue(@Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    /**
     * encodeWaitForEvent:value:
     * <p>
     * Encodes a command that pauses execution of this command buffer until the specified event reaches a given value.
     * <p>
     * This method may only be called if there is no current command encoder on the receiver.
     */
    @Generated
    @Selector("encodeWaitForEvent:value:")
    void encodeWaitForEventValue(@Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    @Generated
    @Selector("resourceStateCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResourceStateCommandEncoder resourceStateCommandEncoder();

    @Generated
    @Selector("accelerationStructureCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder();

    /**
     * blitCommandEncoderWithDescriptor:
     * <p>
     * returns a blit command endcoder to encode into this command buffer.
     */
    @Generated
    @Selector("blitCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBlitCommandEncoder blitCommandEncoderWithDescriptor(MTLBlitPassDescriptor blitPassDescriptor);

    /**
     * computeCommandEncoderWithDescriptor:
     * <p>
     * returns a compute command endcoder to encode into this command buffer.
     */
    @Generated
    @Selector("computeCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoderWithDescriptor(MTLComputePassDescriptor computePassDescriptor);

    /**
     * The set of options configuring the error reporting of the created command buffer.
     */
    @Generated
    @Selector("errorOptions")
    @NUInt
    long errorOptions();

    /**
     * [@property] logs
     * <p>
     * Logs generated by the command buffer during execution of the GPU commands. Valid after GPU execution is completed
     */
    @Generated
    @Selector("logs")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLogContainer logs();

    @Generated
    @Selector("resourceStateCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResourceStateCommandEncoder resourceStateCommandEncoderWithDescriptor(
            MTLResourceStatePassDescriptor resourceStatePassDescriptor);
}

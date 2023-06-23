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
import apple.metal.MTLAccelerationStructurePassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLCommandBuffer
 * 
 * A serial list of commands for the device to execute.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandBuffer")
public interface MTLCommandBuffer {
    /**
     * addCompletedHandler:block:
     * 
     * Add a block to be called when this command buffer has completed execution.
     */
    @Generated
    @Selector("addCompletedHandler:")
    void addCompletedHandler(@NotNull @ObjCBlock(name = "call_addCompletedHandler") Block_addCompletedHandler block);

    /**
     * addScheduledHandler:block:
     * 
     * Adds a block to be called when this command buffer has been scheduled for execution.
     */
    @Generated
    @Selector("addScheduledHandler:")
    void addScheduledHandler(@NotNull @ObjCBlock(name = "call_addScheduledHandler") Block_addScheduledHandler block);

    /**
     * blitCommandEncoder
     * 
     * returns a blit command encoder to encode into this command buffer.
     */
    @Nullable
    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBlitCommandEncoder blitCommandEncoder();

    /**
     * [@property] commandQueue
     * 
     * The command queue this command buffer was created from.
     */
    @NotNull
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue commandQueue();

    /**
     * commit
     * 
     * Commit a command buffer so it can be executed as soon as possible.
     */
    @Generated
    @Selector("commit")
    void commit();

    /**
     * computeCommandEncoder
     * 
     * returns a compute command encoder to encode into this command buffer.
     */
    @Nullable
    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoder();

    /**
     * [@property] device
     * 
     * The device this resource was created against.
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * enqueue
     * 
     * Append this command buffer to the end of its MTLCommandQueue.
     */
    @Generated
    @Selector("enqueue")
    void enqueue();

    /**
     * [@property] error
     * 
     * If an error occurred during execution, the NSError may contain more details about the problem.
     */
    @Nullable
    @Generated
    @Selector("error")
    NSError error();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * parallelRenderCommandEncoderWithDescriptor:
     * 
     * returns a parallel render pass encoder to encode into this command buffer.
     */
    @Nullable
    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLParallelRenderCommandEncoder parallelRenderCommandEncoderWithDescriptor(
            @NotNull MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * presentDrawable:
     * 
     * Add a drawable present that will be invoked when this command buffer has been scheduled for execution.
     * 
     * The submission thread will be lock stepped with present call been serviced by window server
     */
    @Generated
    @Selector("presentDrawable:")
    void presentDrawable(@NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable);

    /**
     * presentDrawable:atTime:
     * 
     * Add a drawable present for a specific host time that will be invoked when this command buffer has been scheduled
     * for execution.
     * 
     * The submission thread will be lock stepped with present call been serviced by window server
     */
    @Generated
    @Selector("presentDrawable:atTime:")
    void presentDrawableAtTime(@NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable, double presentationTime);

    /**
     * renderCommandEncoderWithDescriptor:
     * 
     * returns a render command endcoder to encode into this command buffer.
     */
    @Nullable
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderCommandEncoder renderCommandEncoderWithDescriptor(@NotNull MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * [@property] retainedReferences
     * 
     * If YES, this command buffer holds strong references to objects needed to execute this command buffer.
     */
    @Generated
    @Selector("retainedReferences")
    boolean retainedReferences();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * [@property] status
     * 
     * status reports the current stage in the lifetime of MTLCommandBuffer, as it proceeds to enqueued, committed,
     * scheduled, and completed.
     */
    @Generated
    @Selector("status")
    @NUInt
    long status();

    /**
     * waitUntilCompleted
     * 
     * Synchronously wait for this command buffer to complete.
     */
    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();

    /**
     * waitUntilScheduled
     * 
     * Synchronously wait for this command buffer to be scheduled.
     */
    @Generated
    @Selector("waitUntilScheduled")
    void waitUntilScheduled();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addCompletedHandler {
        @Generated
        void call_addCompletedHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addScheduledHandler {
        @Generated
        void call_addScheduledHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * [@property] GPUEndTime
     * 
     * The host time in seconds that GPU finishes executing this command buffer. Returns zero if CPU has not received
     * completion notification. This usually can be called in command buffer completion handler.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("GPUEndTime")
    double GPUEndTime();

    /**
     * [@property] GPUStartTime
     * 
     * The host time in seconds that GPU starts executing this command buffer. Returns zero if it has not started. This
     * usually can be called in command buffer completion handler.
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("GPUStartTime")
    double GPUStartTime();

    /**
     * API-Since: 10.3
     */
    @Generated
    @Selector("kernelEndTime")
    double kernelEndTime();

    /**
     * API-Since: 10.3
     */
    @Generated
    @Selector("kernelStartTime")
    double kernelStartTime();

    /**
     * popDebugGroup
     * 
     * Pop the latest named string off of the stack.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * presentDrawable:afterMinimumDuration:
     * 
     * Add a drawable present for a specific host time that allows previous frame to be on screen for at least duration
     * time.
     * 
     * The difference of this API versus presentDrawable:atTime is that this API defers calculation of the presentation
     * time until the previous frame's actual presentation time is known, thus to be able to maintain a more consistent
     * and stable frame time. This also provides an easy way to set frame rate.
     * The submission thread will be lock stepped with present call been serviced by window server
     * 
     * API-Since: 10.3
     * 
     * @param drawable The drawable to be presented
     * @param duration The minimum time that previous frame should be displayed. The time is double preceision floating
     *                 point in the unit of seconds.
     */
    @Generated
    @Selector("presentDrawable:afterMinimumDuration:")
    void presentDrawableAfterMinimumDuration(@NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable,
            double duration);

    /**
     * pushDebugGroup:
     * 
     * Push a new named string onto a stack of string labels.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(@NotNull String string);

    /**
     * computeCommandEncoderWithDispatchType
     * 
     * returns a compute command encoder to encode into this command buffer. Optionally allow this command encoder to
     * execute dispatches concurrently.
     * 
     * On devices that do not support concurrent command encoders, this call is equivalent to computeCommandEncoder
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("computeCommandEncoderWithDispatchType:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoderWithDispatchType(@NUInt long dispatchType);

    /**
     * encodeSignalEvent:value:
     * 
     * Encodes a command that signals an event with a given value.
     * 
     * This method may only be called if there is no current command encoder on the receiver.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("encodeSignalEvent:value:")
    void encodeSignalEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    /**
     * encodeWaitForEvent:value:
     * 
     * Encodes a command that pauses execution of this command buffer until the specified event reaches a given value.
     * 
     * This method may only be called if there is no current command encoder on the receiver.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("encodeWaitForEvent:value:")
    void encodeWaitForEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("resourceStateCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResourceStateCommandEncoder resourceStateCommandEncoder();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("accelerationStructureCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder();

    /**
     * blitCommandEncoderWithDescriptor:
     * 
     * returns a blit command endcoder to encode into this command buffer.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("blitCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBlitCommandEncoder blitCommandEncoderWithDescriptor(@NotNull MTLBlitPassDescriptor blitPassDescriptor);

    /**
     * computeCommandEncoderWithDescriptor:
     * 
     * returns a compute command endcoder to encode into this command buffer.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("computeCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputeCommandEncoder computeCommandEncoderWithDescriptor(
            @NotNull MTLComputePassDescriptor computePassDescriptor);

    /**
     * The set of options configuring the error reporting of the created command buffer.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("errorOptions")
    @NUInt
    long errorOptions();

    /**
     * [@property] logs
     * 
     * Logs generated by the command buffer during execution of the GPU commands. Valid after GPU execution is completed
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("logs")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLogContainer logs();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("resourceStateCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResourceStateCommandEncoder resourceStateCommandEncoderWithDescriptor(
            @NotNull MTLResourceStatePassDescriptor resourceStatePassDescriptor);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("accelerationStructureCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoderWithDescriptor(
            @NotNull MTLAccelerationStructurePassDescriptor descriptor);
}

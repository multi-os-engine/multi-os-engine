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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.NUInt;

/**
 * [@protocol] MTLCommandEncoder
 * 
 * MTLCommandEncoder is the common interface for objects that write commands into MTLCommandBuffers.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandEncoder")
public interface MTLCommandEncoder {
    /**
     * [@property] device
     * 
     * The device this resource was created against.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * endEncoding
     * 
     * Declare that all command generation from this encoder is complete, and detach from the MTLCommandBuffer.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("endEncoding")
    void endEncoding();

    /**
     * insertDebugSignpost:
     * 
     * Inserts a debug string into the command buffer. This does not change any API behavior, but can be useful when
     * debugging.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("insertDebugSignpost:")
    void insertDebugSignpost(@NotNull String string);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * popDebugGroup
     * 
     * Pop the latest named string off of the stack.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * pushDebugGroup:
     * 
     * Push a new named string onto a stack of string labels.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(@NotNull String string);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * Encodes a consumer barrier on work you commit to the same command queue.
     * 
     * Encode a barrier that guarantees that any subsequent work you encode in the current command encoder that
     * corresponds
     * to the `beforeStages` stages doesn't proceed until Metal completes all work prior to the current command encoder
     * corresponding to the `afterQueueStages` stages, completes.
     * 
     * Metal can reorder the exact point where it applies the barrier, so use this method for synchronizing between
     * different passes.
     * 
     * If you need to synchronize work within a pass that you encode with an instance of a subclass of
     * ``MTLCommandEncoder``,
     * use memory barriers instead. For subclasses of ``MTL4CommandEncoder``, use encoder barriers.
     * 
     * You can specify `afterQueueStages` and `beforeStages` that contain ``MTLStages`` unrelated to the current command
     * encoder.
     * 
     * - Parameters:
     * - afterQueueStages: ``MTLStages`` mask that represents the stages of work to wait for.
     * This argument applies to work corresponding to these stages you
     * encode in prior command encoders, and not for the current encoder.
     * - beforeStages: ``MTLStages`` mask that represents the stages of work that wait.
     * This argument applies to work you encode in the current command encoder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("barrierAfterQueueStages:beforeStages:")
    void barrierAfterQueueStagesBeforeStages(@NUInt long afterQueueStages, @NUInt long beforeStages);
}

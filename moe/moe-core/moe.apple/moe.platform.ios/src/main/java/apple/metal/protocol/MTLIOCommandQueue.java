package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLIOCommandQueue
 * 
 * Represents a queue that schedules command buffers containing command that
 * read from handle objects and write to MTLResource objects.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIOCommandQueue")
public interface MTLIOCommandQueue {
    /**
     * commandBuffer
     * 
     * Vends an autoreleased commandBuffer that can be used to
     * encode commands that read from handle objects and write to MTLResource objects.
     */
    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOCommandBuffer commandBuffer();

    /**
     * commandBufferWithUnretainedReferences
     * 
     * Vends an autoreleased commandBuffer that can be used to
     * encode commands that read from handle objects and write to MTLResource objects.
     * This commandBuffer does not retain objects referenced by the commandBuffer
     * as an optimization.
     * 
     * For correct execution its the application's responsibility to retain
     * objects referenced by commands within the commandBuffer.
     */
    @Generated
    @Selector("commandBufferWithUnretainedReferences")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOCommandBuffer commandBufferWithUnretainedReferences();

    /**
     * enqueueBarrier
     * 
     * Inserts a barrier that ensures that all commandBuffers commited
     * prior are completed before any commandBuffers after start execution.
     * 
     * A serial commandQueue has implicit barriers between
     * each commandBuffer.
     */
    @Generated
    @Selector("enqueueBarrier")
    void enqueueBarrier();

    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}
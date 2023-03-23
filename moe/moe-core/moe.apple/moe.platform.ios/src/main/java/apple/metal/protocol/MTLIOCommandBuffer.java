package apple.metal.protocol;

import apple.foundation.NSError;
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLIOCommandBuffer
 * 
 * represents a list of IO commands for a queue to execute
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIOCommandBuffer")
public interface MTLIOCommandBuffer {
    /**
     * addBarrier
     * 
     * add a barrier that starts subsequent commands after all
     * the previously encoded commands have completed.
     */
    @Generated
    @Selector("addBarrier")
    void addBarrier();

    /**
     * addCompletedHandler:block:
     * 
     * Add a block to be called when this command buffer has completed execution.
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
     * commit
     * 
     * Commit a command buffer so it can be executed as soon as possible.
     */
    @Generated
    @Selector("commit")
    void commit();

    /**
     * copyStatusToBuffer:buffer:offset
     * 
     * Encodes a command that writes the status of this commandBuffer upon completion
     * to a buffer at a given offset
     */
    @Generated
    @Selector("copyStatusToBuffer:offset:")
    void copyStatusToBufferOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);

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
    @Generated
    @Selector("error")
    NSError error();

    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * loadBuffer:offset:size:sourceHandle:sourceHandleOffset
     * 
     * Encodes a command that loads from a handle
     * and offset into a buffer and an offset.
     */
    @Generated
    @Selector("loadBuffer:offset:size:sourceHandle:sourceHandleOffset:")
    void loadBufferOffsetSizeSourceHandleSourceHandleOffset(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset, @NUInt long size, @Mapped(ObjCObjectMapper.class) MTLIOFileHandle sourceHandle,
            @NUInt long sourceHandleOffset);

    /**
     * loadBytes:size:sourceHandle:sourceHandleOffset
     * 
     * Encodes a command that loads from a handle
     * and offset into a memory location.
     */
    @Generated
    @Selector("loadBytes:size:sourceHandle:sourceHandleOffset:")
    void loadBytesSizeSourceHandleSourceHandleOffset(VoidPtr pointer, @NUInt long size,
            @Mapped(ObjCObjectMapper.class) MTLIOFileHandle sourceHandle, @NUInt long sourceHandleOffset);

    /**
     * loadTexture:texture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:
     * 
     * Encodes a command that loads a region from a handle
     * and offset into a texture at a given slice, level and origin.
     */
    @Generated
    @Selector("loadTexture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:")
    void loadTextureSliceLevelSizeSourceBytesPerRowSourceBytesPerImageDestinationOriginSourceHandleSourceHandleOffset(
            @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long slice, @NUInt long level,
            @ByValue MTLSize size, @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage,
            @ByValue MTLOrigin destinationOrigin, @Mapped(ObjCObjectMapper.class) MTLIOFileHandle sourceHandle,
            @NUInt long sourceHandleOffset);

    /**
     * popDebugGroup
     * 
     * Pop the latest named string off of the stack.
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * pushDebugGroup:
     * 
     * Push a new named string onto a stack of string labels.
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(String string);

    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * signalEvent:value:
     * 
     * Encodes a command that signals an event with a given value.
     */
    @Generated
    @Selector("signalEvent:value:")
    void signalEventValue(@Mapped(ObjCObjectMapper.class) MTLSharedEvent event, long value);

    /**
     * [@property] status
     * 
     * status reports the completion status of the MTLIOCommandBuffer, pending, cancelled, error or complete.
     */
    @Generated
    @Selector("status")
    @NInt
    long status();

    /**
     * tryCancel
     * 
     * request a cancellation of an in-flight command buffer.
     */
    @Generated
    @Selector("tryCancel")
    void tryCancel();

    /**
     * waitForEvent:value:
     * 
     * Encodes a command that pauses execution of this command buffer until the specified event reaches a given value.
     */
    @Generated
    @Selector("waitForEvent:value:")
    void waitForEventValue(@Mapped(ObjCObjectMapper.class) MTLSharedEvent event, long value);

    /**
     * waitUntilCompleted
     * 
     * Synchronously wait for this command buffer to complete.
     */
    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();
}
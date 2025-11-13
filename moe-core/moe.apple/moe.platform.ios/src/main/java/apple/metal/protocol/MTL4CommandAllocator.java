package apple.metal.protocol;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Manages the memory backing the encoding of GPU commands into command buffers.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CommandAllocator")
public interface MTL4CommandAllocator {
    /**
     * Queries the size of the internal memory heaps of this command allocator that support encoding
     * commands into command buffers.
     * 
     * - Returns: a size in bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allocatedSize")
    long allocatedSize();

    /**
     * Returns the GPU device that this command allocator belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Provides the optional label you specify at creation time for debug purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Marks the command allocator's heaps for reuse.
     * 
     * Calling this method allows new ``MTL4CommandBuffer`` to reuse its existing internal
     * memory heaps to encode new GPU commands.
     * 
     * You are responsible to ensure that all command buffers with memory originating
     * from this allocator instance are complete before calling resetting it.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reset")
    void reset();
}
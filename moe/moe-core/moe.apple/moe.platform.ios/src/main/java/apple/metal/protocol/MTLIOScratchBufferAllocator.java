package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLIOScratchBufferAllocator
 * 
 * An extendible protocol that can implement a custom allocator passed
 * to the queue descriptor.
 * 
 * If provided, the queue will call newScratchBufferWithMinimumSize
 * when it needs scratch storage for IO commands. When the commands that use the memory
 * complete they return the storage by dealloc'ing the MTLIOScratchBuffer objects (where
 * the application can optionally pool the memory for use by future commands.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIOScratchBufferAllocator")
public interface MTLIOScratchBufferAllocator {
    /**
     * newScratchBufferWithMinimumSize:minimumSize
     * 
     * This method is called when additional scratch memory is required by a load command.
     * The scratch buffer returned should NOT be an autoreleased object.
     * 
     * Scratch memory is needed for cases where a texture is being copied to. minimumSize
     * is the smallest buffer that will allow the command to execute, however a larger buffer can be provided and
     * susequent commands will be able to use it, thus avoiding the need for an additional callback. Returning nil
     * from the function will result in the load command being skipped and the commandBuffer getting cancelled.
     */
    @Nullable
    @Generated
    @Selector("newScratchBufferWithMinimumSize:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOScratchBuffer newScratchBufferWithMinimumSize(@NUInt long minimumSize);
}
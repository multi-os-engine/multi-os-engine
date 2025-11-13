package apple.metal.protocol;

import apple.metal.MTLTextureDescriptor;
import apple.metal.MTLTextureViewDescriptor;
import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A pool of lightweight texture views.
 * 
 * Use texture view pools to create lightweight texture view objects of ``MTLTexture``
 * and ``MTLBuffer`` instances.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTextureViewPool")
public interface MTLTextureViewPool extends MTLResourceViewPool {
    /**
     * Copies a default texture view to a slot in this texture view pool at an index provided.
     * 
     * - Parameters:
     * - texture: An ``MTLTexture`` instance for which to copy its texture view.
     * - index: An index of a slot in this texture pool into which this method copies the texture view.
     * - Returns: The ``MTLResourceID`` of a newly created texture view in this pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTextureView:atIndex:")
    @ByValue
    MTLResourceID setTextureViewAtIndex(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture, @NUInt long index);

    /**
     * Creates a new lightweight texture view.
     * 
     * This method creates a lightweight texture view over a texture according to
     * a descriptor you provide. It then associates the texture view with a slot
     * in this texture view pool at the index you specify.
     * 
     * - Parameters:
     * - texture: An ``MTLTexture`` instance for which to create a new lightweight texture view.
     * - descriptor: A descriptor specifying properties of the texture view to create.
     * - index: An index of a slot in the texture pool into which this method writes the new texture view.
     * - Returns: The ``MTLResourceID`` of a newly created texture view in this pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTextureView:descriptor:atIndex:")
    @ByValue
    MTLResourceID setTextureViewDescriptorAtIndex(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture,
            @NotNull MTLTextureViewDescriptor descriptor, @NUInt long index);

    /**
     * Creates a new lightweight texture view of a buffer.
     * 
     * This method creates a lightweight texture view over a buffer, according to
     * a descriptor you provide. It then associates the texture view with a slot
     * in this texture view pool at the index you specify.
     * 
     * - Parameters:
     * - buffer: An ``MTLBuffer`` instance for which to create a new texture view.
     * - descriptor: A descriptor specifying properties of the texture view to create.
     * - offset: A byte offset, within the `buffer` parameter, at which the data for the texture view starts.
     * - bytesPerRow: The number of bytes between adjacent rows of pixels in the source buffer’s memory.
     * - index: An index of a slot in the table into which this method writes the new texture view.
     * - Returns: The ``MTLResourceID`` of a new buffer view in this pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTextureViewFromBuffer:descriptor:offset:bytesPerRow:atIndex:")
    @ByValue
    MTLResourceID setTextureViewFromBufferDescriptorOffsetBytesPerRowAtIndex(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer buffer, @NotNull MTLTextureDescriptor descriptor,
            @NUInt long offset, @NUInt long bytesPerRow, @NUInt long index);
}
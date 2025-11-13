package apple.metal.protocol;

import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Provides a mechanism to manage and provide resource bindings for buffers, textures, sampler states and other Metal
 * resources.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4ArgumentTable")
public interface MTL4ArgumentTable {
    /**
     * The device from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Assigns an optional label with this argument table for debugging purposes.
     * 
     * You set this label by setting property ``MTL4ArgumentTableDescriptor/label`` on the descriptor object, prior to
     * creating this table instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Binds a GPU address to a buffer binding slot.
     * 
     * - Parameters:
     * - gpuAddress: The GPU address of a ``MTLBuffer`` to set.
     * - bindingIndex: a valid binding index in the buffer binding range.
     * It is an error for this value to match or exceed the value of property
     * ``MTL4ArgumentTableDescriptor/maxBufferBindCount`` on the descriptor
     * from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAddress:atIndex:")
    void setAddressAtIndex(long gpuAddress, @NUInt long bindingIndex);

    /**
     * Binds a GPU address to a buffer binding slot, providing a dynamic vertex stride.
     * 
     * This method requires that the value of property ``MTL4ArgumentTableDescriptor/supportAttributeStrides`` on the
     * descriptor from which you created this argument table is true.
     * 
     * - Parameters:
     * - gpuAddress: The GPU address of a ``MTLBuffer`` to set.
     * - stride: The stride between attributes in the buffer.
     * - bindingIndex: a valid binding index in the buffer binding range.
     * It is an error for this value to match or exceed the value of property
     * ``MTL4ArgumentTableDescriptor/maxBufferBindCount`` on the descriptor
     * from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAddress:attributeStride:atIndex:")
    void setAddressAttributeStrideAtIndex(long gpuAddress, @NUInt long stride, @NUInt long bindingIndex);

    /**
     * Binds a resource to a buffer binding slot.
     * 
     * - Parameters:
     * - resourceID: The ``MTLResourceID`` of the Metal resource to bind.
     * - bindingIndex: a valid binding index in the buffer binding range.
     * It is an error for this value to match or exceed the value of property
     * ``MTL4ArgumentTableDescriptor/maxBufferBindCount`` on the descriptor
     * from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setResource:atBufferIndex:")
    void setResourceAtBufferIndex(@ByValue MTLResourceID resourceID, @NUInt long bindingIndex);

    /**
     * Binds a sampler state to a sampler state binding slot.
     * 
     * - Parameters:
     * - resourceID: The ``MTLResourceID`` of the ``MTLSamplerState`` instance to bind.
     * - bindingIndex: a valid binding index in the sampler binding range.
     * It is an error for this value to match or exceed the value of property
     * ``MTL4ArgumentTableDescriptor/maxSamplerStateBindCount`` on the descriptor
     * from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@ByValue MTLResourceID resourceID, @NUInt long bindingIndex);

    /**
     * Binds a texture to a texture binding slot.
     * 
     * - Parameters:
     * - resourceID: The ``MTLResourceID`` of the ``MTLTexture`` instance to bind.
     * - bindingIndex: a valid binding index in the texture binding range.
     * It is an error for this value to match or exceed the value of property
     * ``MTL4ArgumentTableDescriptor/maxTextureBindCount`` on the descriptor
     * from which you created this argument table.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@ByValue MTLResourceID resourceID, @NUInt long bindingIndex);
}
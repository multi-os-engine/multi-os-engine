package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLBindingsType
 * 
 * The type of a resource binding.
 * 
 * [@constant] MTLBindingTypeBuffer
 * This binding represents a buffer.
 * 
 * [@constant] MTLBindingTypeThreadgroupMemory
 * This binding represents threadgroup memory.
 * 
 * [@constant] MTLBindingTypeTexture
 * This binding represents a texture.
 * 
 * [@constant] MTLBindingTypeSampler
 * This binding represents a sampler.
 * 
 * [@constant] MTLBindingTypeImageblockData
 * This binding represents an image block data.
 * 
 * [@constant] MTLBindingTypeImageblock
 * This binding represents an image block.
 * 
 * [@constant] MTLBindingTypeVisibleFunctionTable
 * This binding represents a visible function table object.
 * 
 * [@constant] MTLBindingTypePrimitiveAccelerationStructure
 * This binding represents a primitive acceleration structure object.
 * 
 * [@constant] MTLBindingTypeInstanceAccelerationStructure
 * This binding represents an instance acceleration structure object.
 * 
 * [@constant] MTLBinidngTypeIntersectionFunctionTable
 * This binding represents an intersection function table object.
 * 
 * [@constant] MTLBindingTypeObjectPayload
 * This binding represents an object payload.
 * 
 * API-Since: 14.0
 */
@Generated
public final class MTLBindingType {
    @Generated
    private MTLBindingType() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Buffer = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ThreadgroupMemory = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Texture = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Sampler = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ImageblockData = 0x0000000000000010L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Imageblock = 0x0000000000000011L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long VisibleFunctionTable = 0x0000000000000018L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long PrimitiveAccelerationStructure = 0x0000000000000019L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InstanceAccelerationStructure = 0x000000000000001AL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long IntersectionFunctionTable = 0x000000000000001BL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ObjectPayload = 0x0000000000000022L;
}
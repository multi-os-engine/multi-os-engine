package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Describes stages of GPU work.
 * 
 * All commands you encoder into command buffers relate to one or more shader stages,
 * for example, a compute dispatch command from a compute command encoder relates to
 * stage ``MTLStageDispatch``.
 * 
 * Use these stages to issue barriers between shader stages to ensure Metal correctly
 * synchronizes GPU commands.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLStages {
    @Generated
    private MTLStages() {
    }

    /**
     * Represents all vertex shader stage work in a render pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Vertex = 0x0000000000000001L;
    /**
     * Represents all fragment shader stage work in a render pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Fragment = 0x0000000000000002L;
    /**
     * Represents all tile shading stage work in a render pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Tile = 0x0000000000000004L;
    /**
     * Represents all object shader stage work in a render pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Object = 0x0000000000000008L;
    /**
     * Represents all mesh shader stage work work in a render pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Mesh = 0x0000000000000010L;
    /**
     * Represents all sparse and placement sparse resource mapping updates.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long ResourceState = 0x0000000004000000L;
    /**
     * Represents all compute dispatches in a compute pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Dispatch = 0x0000000008000000L;
    /**
     * Represents all blit operations in a pass.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Blit = 0x0000000010000000L;
    /**
     * Represents all acceleration structure operations.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long AccelerationStructure = 0x0000000020000000L;
    /**
     * Represents all machine learning network dispatch operations.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long MachineLearning = 0x0000000040000000L;
    /**
     * Convenience mask representing all stages of GPU work.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
}
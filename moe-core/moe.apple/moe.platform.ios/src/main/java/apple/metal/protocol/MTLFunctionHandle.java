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
import org.jetbrains.annotations.NotNull;
import apple.metal.struct.MTLResourceID;
import org.moe.natj.general.ann.ByValue;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunctionHandle")
public interface MTLFunctionHandle {
    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("functionType")
    @NUInt
    long functionType();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("name")
    String name();

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Intersection Function Buffer.
     * 
     * The handle must have been created from an intersection function annotated with the `intersection_function_buffer`
     * tag.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();
}
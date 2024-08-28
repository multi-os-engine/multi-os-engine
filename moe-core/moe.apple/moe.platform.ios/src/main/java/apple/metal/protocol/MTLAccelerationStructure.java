package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.metal.struct.MTLResourceID;
import org.moe.natj.general.ann.ByValue;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLAccelerationStructure")
public interface MTLAccelerationStructure extends MTLResource {
    @Generated
    @Selector("size")
    @NUInt
    long size();

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Argument Buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();
}
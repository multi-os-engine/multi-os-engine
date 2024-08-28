package apple.metalperformanceshaders.protocol;

import apple.metal.protocol.MTLDevice;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A way of extending a NSCoder to enable the setting of MTLDevice for unarchived objects
 * 
 * When a object is initialized by a NSCoder, it calls -initWithCoder:, which is
 * missing the necessary MTLDevice to correctly initialize the MPSKernel, or MPSNNGraph.
 * If the coder does not conform to MPSDeviceProvider, the system default device
 * will be used. If you would like to specify which device to use, subclass the
 * NSCoder (NSKeyedUnarchiver, etc.) to conform to MPSDeviceProvider so that
 * the device can be gotten from the NSCoder.
 * 
 * See MPSKeyedUnarchiver for one implementation of this protocol. It reads files
 * prepared with the NSKeyedArchiver and allows you to set the MTLDevice that the
 * unarchived objects use.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSDeviceProvider")
public interface MPSDeviceProvider {
    /**
     * Return the device to use when making MPSKernel subclasses from the NSCoder
     */
    @Generated
    @Selector("mpsMTLDevice")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice mpsMTLDevice();
}

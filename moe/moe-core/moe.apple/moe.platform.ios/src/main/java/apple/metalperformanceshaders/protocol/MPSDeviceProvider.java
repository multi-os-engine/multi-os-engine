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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSDeviceProvider")
public interface MPSDeviceProvider {
    @Generated
    @Selector("mpsMTLDevice")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice mpsMTLDevice();
}
package apple.metalperformanceshaders.protocol;

import apple.metal.MTLHeapDescriptor;
import apple.metal.protocol.MTLHeap;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSHeapProvider")
public interface MPSHeapProvider {
    @Generated
    @Selector("newHeapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap newHeapWithDescriptor(MTLHeapDescriptor descriptor);

    @Generated
    @IsOptional
    @Selector("retireHeap:cacheDelay:")
    default void retireHeapCacheDelay(@Mapped(ObjCObjectMapper.class) MTLHeap heap, double seconds) {
        throw new java.lang.UnsupportedOperationException();
    }
}
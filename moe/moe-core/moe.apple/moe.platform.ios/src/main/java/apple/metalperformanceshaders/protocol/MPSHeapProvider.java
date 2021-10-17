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
    /**
     * Return a heap of the size indicated
     * <p>
     * The heap may be larger than requested.
     * id <MTLDevice> implements this method.
     *
     * @param descriptor A descriptor for the new heap
     * @return A new heap of size at least descriptor.size.  If nil is returned, MPS
     * will use the MPS internal heap cache instead to satisfy the allocation.
     */
    @Generated
    @Selector("newHeapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap newHeapWithDescriptor(MTLHeapDescriptor descriptor);

    /**
     * Retire a heap
     * <p>
     * When MPS is done with the heap, this is called to return the heap to the heap provider
     * MPS will release the heap after this is called.
     *
     * @param heap    The heap to be retired
     * @param seconds A hint for how long to cache the heap before retiring it.  See MPSSetHeapCacheDuration().
     */
    @Generated
    @IsOptional
    @Selector("retireHeap:cacheDelay:")
    default void retireHeapCacheDelay(@Mapped(ObjCObjectMapper.class) MTLHeap heap, double seconds) {
        throw new java.lang.UnsupportedOperationException();
    }
}

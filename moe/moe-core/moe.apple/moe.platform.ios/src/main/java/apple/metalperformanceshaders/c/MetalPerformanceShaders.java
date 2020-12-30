/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metalperformanceshaders.c;

import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.struct.MPSCustomKernelArgumentCount;
import apple.metalperformanceshaders.struct.MPSIntegerDivisionParams;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(CRuntime.class)
public final class MetalPerformanceShaders {
    static {
        NatJ.register();
    }

    @Generated
    private MetalPerformanceShaders() {
    }

    /**
     * MPSSupportsMTLDevice
     * 
     * Determine whether a MetalPerformanceShaders.framework  supports a MTLDevice.
     * 
     * Use this function to determine whether a MTLDevice can be used with interfaces in MetalPerformanceShaders.framework.
     * 
     * @param      device          A valid MTLDevice
     * @return     YES             The device is supported.
     *             NO              The device is not supported
     */
    @Generated
    @CFunction
    public static native boolean MPSSupportsMTLDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@memberof]   MPSKernel
     * [@constant]   MPSRectNoClip
     * 
     * This is a special constant to indicate no clipping is to be done.
     *             The entire image will be used.
     *             This is the default clipping rectangle or the input extent for MPSKernels.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native MTLRegion MPSRectNoClip();

    @Generated
    @CFunction
    public static native int MPSGetImageType(MPSImage image);

    /**
     * a/b = (a * recip + addend) >> shift      imad(a, recip, addend) >> shift
     * valid for all uint16_t a and b
     * div/0 is returned as div/1
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native MPSIntegerDivisionParams MPSFindIntegerDivisionParams(char divisor);

    /**
     * maximum allowed batch size
     */
    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelMaxBatchSize(@ByValue MPSCustomKernelArgumentCount c,
            @NUInt long MPSMaxTextures);

    /**
     * The index of the first destination texture argument
     */
    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBatchedDestinationIndex(@ByValue MPSCustomKernelArgumentCount c);

    /**
     * The index of the ith batched source texture argument
     */
    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBatchedSourceIndex(@ByValue MPSCustomKernelArgumentCount c,
            @NUInt long sourceIndex, @NUInt long MPSMaxTextures);

    /**
     * The index of the ith non-batched source texture argument.
     * 
     * A non-batched source is one that is shared for all items in a batch
     */
    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long MPSGetCustomKernelBroadcastSourceIndex(@ByValue MPSCustomKernelArgumentCount c,
            @NUInt long sourceIndex, @NUInt long MPSMaxTextures);

    /**
     * Hint to MPS how much memory your application expects to need for the command buffer
     * 
     * This will cause MPS to prefetch a MTLHeap into its internal cache of
     *               the indicated size, which will be sub-allocated to back the temporary images,
     *               matrices, vectors and states in used over the course of the command buffer.
     *               This can be helpful in certain pathological situations when allocation sizes
     *               needed to support temporary objects do not allow for reuse of previous allocations
     *               for new objects.
     * 
     *               Example: if the temporary resources need progressively larger MTLHeaps
     *               over the course of the MTLCommandBuffer, such as 1 MB, 2MB, 4 MB and 8MB,
     *               the first allocation might create a 1 MB heap, this might be released,
     *               but since the second allocation needs a 2 MB heap and the 1 MB heap is too
     *               small to be used, a new heap would need to be made, and so forth.  Using
     *               MPSHintTemporaryMemoryHighWaterMark(), a single 8 MB heap might be made manifest,
     *               and all four allocations can use it if they don't overlap temporally. Otherwise,
     *               a total of 1+2+4+8=15 MB might be allocated.
     * 
     *               The application should be careful not to pass the sum of all allocations over
     *               the course of the command buffer. As we expect that not all temporary resources
     *               need to coexist at the same time, and so can alias one another, that would waste
     *               memory. The application should instead track the high water mark of the most
     *               memory in use at any single point over the course of the command buffer.
     * 
     *               This can be simply done by traversing your graph creating all the temporary images,
     *               states, matrices and vectors that you will need in advance. Since the allocation of
     *               the underlying MTLHeaps that they use is deferred until you actually attempt to write
     *               to these resources or get the underlying MTLTexture or MTLBuffer, you can create all
     *               the objects, then call MPSHintTemporaryMemoryUsage, then call the various -encode
     *               methods and the heap should be sized correctly before memory is distributed to the
     *               temporary objects. In this exercise, assume that memory is not distributed to the
     *               temporary object until it is used to hold data, and is reclaimed for reuse when readCount
     *               reaches zero. The expected size temporary memory used by each object can be queried
     *               using its -resourceSize method.
     * 
     *               Notes: The MPSNNGraph does this automatically for its workload. It is not necessary to
     *               prefetch for that. If a MTLHeap large enough to satisfy the size is already cached,
     *               no new one will be created. If the prefetched heap turns out to be too small, additional
     *               small heaps will be created as needed dynamically. If the prefetched heap is too big,
     *               any additional memory is wasted.
     * 
     *               When the graph is known in advance, this method is preferred over
     *               +[MPSTemporaryImage prefetchStorageWithCommandBuffer:imageDescriptorList:]
     *               as the latter can not estimate the time period over which each resource is used, and is
     *               likely to conservatively prefetch too small a heap.
     * 
     *   @param      cmdBuf      The scope of the MTLHeap
     *   @param      bytes       The size, in bytes, of the prefetched heap. The actual size ussed may be rounded
     *                           up according to device alignment requirements. This should be the maximum
     * `                         amount of temporary memory used at any point in the command buffer.
     */
    @Generated
    @CFunction
    public static native void MPSHintTemporaryMemoryHighWaterMark(@Mapped(ObjCObjectMapper.class) Object cmdBuf,
            @NUInt long bytes);

    /**
     * Set the timeout after which unused cached MTLHeaps are released
     * 
     * MPS maintains a private set of MTLHeaps attached to each MTLCommandBuffer
     *             for use by temporary images, matrices, vectors and states, and also for its own
     *             private usage for temporary storage in some (typically multipass) filters. When the
     *             command buffer completes, these are returned to a MTLDevice level cache for reuse.
     *             If it is not reused within the heap cache duration, then the MTLHeaps are released
     *             and the memory is returned to the operating system for general reuse. The intent
     *             of this second level cache is to avoid surrendering the GPU performance advantage
     *             on repetitive workloads to  allocation, zero-fill and deallocation and reallocation
     *             of large MTLHeaps, which otherwise can easily occur.
     * 
     *             Default: 5s.
     * 
     * @param      cmdBuf  The scope over which to set the heap cache duration. If the MTLCommandBuffer
     *             has already been committed, behavior is undefined.
     * @param      seconds The number of seconds to cache used MTLHeaps before retiring them.
     *             NaN will be interpeted as 0.
     */
    @Generated
    @CFunction
    public static native void MPSSetHeapCacheDuration(@Mapped(ObjCObjectMapper.class) Object cmdBuf, double seconds);

    /**
     * Identify the preferred device for MPS computation
     * 
     * This method identifies a suitable device for MPS operation. By
     *             default, it prefers a headless high performance GPU. Your application
     *             may use the options parameter to adjust this behavior.  If your application
     *             needs a particular device, for example one attached to the display on
     *             which a view resides, then please see:
     * 
     *                 https://developer.apple.com/documentation/metal/choosing_gpus_on_mac/device_selection_and_fallback_for_graphics_rendering
     * 
     *             ...for preferred methods to get that device.
     * 
     *             The choice made by MPSGetPreferredDevice can be overridden by setting the
     *             MPS_PREFERED_DEVICE environment variable to the index of the desired device.
     *             Expprt MPS_PREFERRED_DEVICE=-1 to print a list of devices to stderr.
     * 
     *             Your application is welcome to use any MTLDevice with MPS so long as
     *             MPSSupportsMTLDevice(device) returns YES. This convenience function is provided
     *             to simplify device selection for common cases.
     * 
     * @param      options Customimze the display selection
     *                     If a matching device can not be found, another device will be returned, if available.
     * @return     A valid MTLDevice supported by MPS or nil if none are available.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object MPSGetPreferredDevice(@NUInt long options);

    @Generated public static final long MPSFunctionConstantNone = 0xFFFFFFFFFFFFFFFFL;
}

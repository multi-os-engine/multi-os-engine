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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSTemporaryImage
 * [@dependency] MPSImage
 * 
 * MPSTemporaryImages are for MPSImages with short lifetimes.
 * 
 * What is temporary memory? It is memory, plain and simple. Analogy: If we
 * use an app as an analogy for a command buffer, then "Regular memory"
 * (such as what backs a MPSImage or the typical MTLTexture) would be memory
 * that you allocate at launch and never free. Temporary memory would be memory
 * that you free when you are done with it so it can be used for something
 * else as needed later in your app. You /could/ write your app to allocate
 * everything you will ever need up front, but this is very inefficient and
 * quite frankly a pain to plan out in advance. You don't do it for your app,
 * so why would you do it for your command buffers?
 * 
 * Welcome to the 1970's! We have added a heap.
 * 
 * Unsurprisingly, MPSTemporaryImages can provide for profound reduction in
 * the the amount of memory used by your application. Like malloc, MPS
 * maintains a heap of memory usable in a command buffer. Over the lifetime
 * of a command buffer, the same piece of memory may be reused many times.
 * This means that each time the same memory is reused, it aliases with previous
 * uses. If we aren't careful, we might find that needed data is overwritten
 * by successive allocations. However, this is no different than accessing freed
 * memory only to discover it doesn't contain what you thought it did anymore,
 * so you should be able to keep out of trouble by following a few simple rules,
 * like with malloc.
 * 
 * To this end, we added some restrictions to help you out and get a bit more
 * performance. Some comments are appended in parentheses below to extend the
 * analogy of command buffer = program:
 * 
 * - The textures are MTLStorageModePrivate. You can not, for example, use
 * [MTLTexture getBytes...] or [MTLTexture replaceRegion...] with them.
 * MPSTemporaryImages are strictly read and written by the GPU. (There is
 * protected memory to prevent other processes from overwriting your heap.)
 * 
 * - The temporary image may be used only on a single MTLCommandBuffer.
 * This limits the chronology to a single linear time stream. (The heap
 * is specific to just one command buffer. There are no mutexes to
 * coordinate timing of simultaneous access by multiple GPUs. Nor are we
 * likely to like them if there were. So, we disallow it.)
 * 
 * - The readCount property must be managed correctly. Please see
 * the description of the readCount property for full details. (The readCount
 * is a reference count for the block of memory that holds your data. The
 * usual undefined behaviors apply to reading data that has been released.
 * We assert when we can to prevent that from happening accidentally,
 * just as a program might segfault. The readCount counts procedural users
 * of the object -- MPSKernel.encode... calls that read the MPSTemporaryImage.
 * As each reads from it, the readCount is automatically decremented. The
 * texture data will be freed in typical usage at the right time as the
 * readCount reaches zero, typically with little user involvement other
 * than to set the readCount up front. We did examine using the main MPSTemporaryImage
 * reference count for this instead so that ARC would do work for you automatically.
 * Alas, ARC destroys things at end of scope rather than promptly, sometimes resulting
 * in greatly increased memory usage. These allocations are large! So, we
 * use this method instead.)
 * 
 * Since MPSTemporaryImages can only be used with a single MTLCommandBuffer,
 * and can not be used off the GPU, they generally should not be kept
 * around past the completion of the MTLCommandBuffer. The lifetime of
 * MPSTemporaryImages is expected to be typically extremely short, perhaps
 * only a few lines of code. Like malloc, it is intended to be fairly cheap
 * to make MPSTemporaryImages and throw them away. Please do so.
 * 
 * To keep the lifetime of the underlying texture allocation as short as
 * possible, the underlying texture is not allocated until the first time
 * the MPSTemporaryImage is used by a MPSCNNKernel or the .texture property
 * is read. The readCount property serves to limit the lifetime on the
 * other end.
 * 
 * You may use the MPSTemporaryImage.texture with MPSUnaryImageKernel -encode... methods,
 * iff featureChannels <= 4 and the MTLTexture conforms to requirements of that MPSKernel.
 * There is no locking mechanism provided to prevent a MTLTexture returned
 * from the .texture property from becoming invalid when the readCount reaches 0.
 * 
 * Finally, MPSTemporaryImages are complicated to use with blit encoders.
 * Your application should assume that the MPSTemporaryImage is backed by a MTLHeap,
 * and consequently needs a MTLFence to ensure that compute command encoders and other
 * encoders do not trip over one another with heap based memory. MPS will almost never
 * use a blit encoder for this reason. If you do need one, then you will need to make
 * a new compute encoder to block on whatever previous compute encoder last used the
 * heap block. (MPS will not tell you who previously used the heap block. That encoder
 * is almost certainly long dead anyway.) If concurrent encoders are involved, then a
 * barrier might be needed. Within that compute encoder, you will call -updateFence.
 * End the compute encoder, make a blit encoder wait for the fence, do the blit, update
 * a new fence, then make a new compute encoder, wait for the second fence, then you
 * can continue. Possibly the second do-nothing compute encoder needs to be ended so
 * MPS can be called. Frankly, we don't bother with blit encoders and just write a compute
 * operation for copy / clear as needed, or better yet find a way to eliminate the
 * clear / copy pass so we don't have to pay for it. Note: the most common use of a
 * blit encoder, -synchronizeResource: can not encounter this problem because
 * MPSTemporaryImages live in GPU private memory and can not be read by the CPU.
 * 
 * MPSTemporaryImages can otherwise be used wherever MPSImages are used.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSTemporaryImage extends MPSImage {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSTemporaryImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSTemporaryImage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSTemporaryImage allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSTemporaryImage new_objc();

    /**
     * Help MPS decide which allocations to make ahead of time
     * 
     * The texture cache that underlies the MPSTemporaryImage can automatically allocate new storage as
     * needed as you create new temporary images. However, sometimes a more global view of what you
     * plan to make is useful for maximizing memory reuse to get the most efficient operation.
     * This class method hints to the cache what the list of images will be.
     * 
     * It is never necessary to call this method. It is purely a performance and memory optimization.
     * 
     * This method makes a conservative estimate of memory required and may not fully
     * cover temporary memory needs, resulting in additional allocations later that could
     * encounter pathological behavior, if they are too small. If the full extent and timing of the
     * workload is known in advance, it is recommended that MPSHintTemporaryMemoryHighWaterMark() be
     * used instead.
     * 
     * @param commandBuffer  The command buffer on which the MPSTemporaryImages will be used
     * @param descriptorList A NSArray of MPSImageDescriptors, indicating images that will be created
     */
    @Generated
    @Selector("prefetchStorageWithCommandBuffer:imageDescriptorList:")
    public static native void prefetchStorageWithCommandBufferImageDescriptorList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull NSArray<? extends MPSImageDescriptor> descriptorList);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Initialize a MPSTemporaryImage for use on a MTLCommandBuffer
     * 
     * @param commandBuffer   The MTLCommandBuffer on which the MPSTemporaryImage will be exclusively used
     * 
     * @param imageDescriptor A valid imageDescriptor describing the MPSImage format to create.
     * 
     * @return A valid MPSTemporaryImage. The object will be released when the command buffer
     *         is committed. The underlying texture will become invalid before this time
     *         due to the action of the readCount property.
     */
    @Generated
    @Selector("temporaryImageWithCommandBuffer:imageDescriptor:")
    public static native MPSTemporaryImage temporaryImageWithCommandBufferImageDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSImageDescriptor imageDescriptor);

    /**
     * Low level interface for creating a MPSTemporaryImage using a MTLTextureDescriptor
     * 
     * This function provides access to MTLPixelFormats not typically covered by -initForCommandBuffer:imageDescriptor:
     * The feature channels will be inferred from the MTLPixelFormat without changing the width.
     * The following restrictions apply:
     * 
     * MTLTextureType must be MTLTextureType2D or MTLTextureType2DArray
     * MTLTextureUsage must contain at least one of MTLTextureUsageShaderRead, MTLTextureUsageShaderWrite
     * MTLStorageMode must be MTLStorageModePrivate
     * depth must be 1
     * 
     * @param commandBuffer     The command buffer on which the MPSTemporaryImage may be used
     * @param textureDescriptor A texture descriptor describing the MPSTemporaryImage texture
     * 
     * @return A valid MPSTemporaryImage. The object will be released when the command buffer
     *         is committed. The underlying texture will become invalid before this time
     *         due to the action of the readCount property.
     */
    @Generated
    @Selector("temporaryImageWithCommandBuffer:textureDescriptor:")
    public static native MPSTemporaryImage temporaryImageWithCommandBufferTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MTLTextureDescriptor textureDescriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native MPSTemporaryImage init();

    @Generated
    @Selector("initWithDevice:imageDescriptor:")
    public native MPSTemporaryImage initWithDeviceImageDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSImageDescriptor imageDescriptor);

    @Generated
    @Selector("initWithTexture:featureChannels:")
    public native MPSTemporaryImage initWithTextureFeatureChannels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long featureChannels);

    /**
     * The number of times a temporary image may be read by a MPSCNNKernel
     * before its contents become undefined.
     * 
     * MPSTemporaryImages must release their underlying textures for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryImage is read by a
     * MPSCNNKernel -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying texture is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryImages prior to return from the -encode.. function.
     * The contents of the texture become undefined at this time.
     * 
     * By default, the readCount is initialized to 1, indicating a image that
     * may be overwritten any number of times, but read only once.
     * 
     * You may change the readCount as desired to allow MPSCNNKernels to read
     * the MPSTemporaryImage additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryImage with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying texture to be returned to MPS. Writing
     * to a MPSTemporaryImage does not adjust the readCount.
     * 
     * The Metal API Validation layer will assert if a MPSTemporaryImage is
     * deallocated with non-zero readCount to help identify cases when resources
     * are not returned promptly.
     */
    @Generated
    @Selector("readCount")
    @NUInt
    public native long readCount();

    /**
     * The number of times a temporary image may be read by a MPSCNNKernel
     * before its contents become undefined.
     * 
     * MPSTemporaryImages must release their underlying textures for reuse
     * immediately after last use. So as to facilitate *prompt* convenient
     * memory recycling, each time a MPSTemporaryImage is read by a
     * MPSCNNKernel -encode... method, its readCount is automatically
     * decremented. When the readCount reaches 0, the underlying texture is
     * automatically made available for reuse to MPS for its own needs and for
     * other MPSTemporaryImages prior to return from the -encode.. function.
     * The contents of the texture become undefined at this time.
     * 
     * By default, the readCount is initialized to 1, indicating a image that
     * may be overwritten any number of times, but read only once.
     * 
     * You may change the readCount as desired to allow MPSCNNKernels to read
     * the MPSTemporaryImage additional times. However, it is an error to change
     * the readCount once it is zero. It is an error to read or write to a
     * MPSTemporaryImage with a zero readCount. You may set the readCount to 0
     * yourself to cause the underlying texture to be returned to MPS. Writing
     * to a MPSTemporaryImage does not adjust the readCount.
     * 
     * The Metal API Validation layer will assert if a MPSTemporaryImage is
     * deallocated with non-zero readCount to help identify cases when resources
     * are not returned promptly.
     */
    @Generated
    @Selector("setReadCount:")
    public native void setReadCount(@NUInt long value);

    /**
     * Get a well known MPSImageAllocator that makes MPSTemporaryImages
     */
    @NotNull
    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSImageAllocator defaultAllocator();

    @Generated
    @Selector("initWithParentImage:sliceRange:featureChannels:")
    public native MPSTemporaryImage initWithParentImageSliceRangeFeatureChannels(@NotNull MPSImage parent,
            @ByValue NSRange sliceRange, @NUInt long featureChannels);

    /**
     * Low level interface for creating a MPSTemporaryImage using a MTLTextureDescriptor
     * 
     * This function provides access to MTLPixelFormats not typically covered by -initForCommandBuffer:imageDescriptor:
     * The number of images will be inferred from number of slices in the descriptor.arrayLength and
     * the number of feature channels.
     * 
     * The following restrictions apply:
     * 
     * MTLTextureType must be MTLTextureType2D or MTLTextureType2DArray
     * MTLTextureUsage must contain at least one of MTLTextureUsageShaderRead, MTLTextureUsageShaderWrite
     * MTLStorageMode must be MTLStorageModePrivate
     * 
     * @param commandBuffer     The command buffer on which the MPSTemporaryImage may be used
     * @param textureDescriptor A texture descriptor describing the MPSTemporaryImage texture
     * 
     * @return A valid MPSTemporaryImage. The object will be released when the command buffer
     *         is committed. The underlying texture will become invalid before this time
     *         due to the action of the readCount property.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("temporaryImageWithCommandBuffer:textureDescriptor:featureChannels:")
    public static native MPSTemporaryImage temporaryImageWithCommandBufferTextureDescriptorFeatureChannels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MTLTextureDescriptor textureDescriptor, @NUInt long featureChannels);
}

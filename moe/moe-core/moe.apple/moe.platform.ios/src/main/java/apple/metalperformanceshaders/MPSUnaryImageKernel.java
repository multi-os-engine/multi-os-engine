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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import apple.metalperformanceshaders.struct.MPSOffset;
import apple.metalperformanceshaders.struct.MPSRegion;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSUnaryImageKernel
 * [@dependency] This depends on Metal.framework
 * <p>
 * A MPSUnaryImageKernel consumes one MTLTexture and produces one MTLTexture.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSUnaryImageKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSUnaryImageKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSUnaryImageKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSUnaryImageKernel allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSUnaryImageKernel new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] clipRect
     * <p>
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * <p>
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_clipRect
     */
    @Generated
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    /**
     * [@property] edgeMode
     * <p>
     * The MPSImageEdgeMode to use when texture reads stray off the edge of an image
     * <p>
     * Most MPSKernel objects can read off the edge of the source image. This can happen because of a
     * negative offset property, because the offset + clipRect.size is larger than the
     * source image or because the filter looks at neighboring pixels, such as a Convolution
     * or morphology filter. Default: usually MPSImageEdgeModeZero. (Some MPSKernel types default
     * to MPSImageEdgeModeClamp, because MPSImageEdgeModeZero is either not supported or
     * would produce unexpected results.)
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_edgemode
     */
    @Generated
    @Selector("edgeMode")
    @NUInt
    public native long edgeMode();

    /**
     * This method attempts to apply the MPSKernel in place on a texture.
     * <p>
     * In-place operation means that the same texture is used both to hold the input
     * image and the results. Operating in-place can be an excellent way to reduce
     * resource utilization, and save time and energy. While simple Metal kernels can
     * not operate in place because textures can not be readable and writable at the
     * same time, some MPSKernels can operate in place because they use
     * multi-pass algorithms. Whether a MPSKernel can operate in-place can
     * depend on current hardware, operating system revision and the parameters
     * and properties passed to it. You should never assume that a MPSKernel will
     * continue to work in place, even if you have observed it doing so before.
     * <p>
     * If the operation succeeds in-place, YES is returned. If the in-place operation
     * fails and no copyAllocator is provided, then NO is returned. Without a fallback
     * MPSCopyAllocator, in neither case is the pointer held at *texture modified.
     * <p>
     * Failure during in-place operation is very common and will occur inconsistently across
     * different hardware platforms and OS releases. Without a fallback MPSCopyAllocator,
     * operating in place may require significant error handling code to accompany each
     * call to -encodeToCommandBuffer:..., complicating your code.
     * <p>
     * You may find it simplifies your code to provide a fallback MPSCopyAllocator so
     * that the operation can proceed reliably even when it can not proceed in-place.
     * When an in-place filter fails, the MPSCopyAllocator (if any) will be
     * invoked to create a new texture in which to write the results, allowing the
     * filter to proceed reliably out-of-place. The original texture will be released,
     * replaced with a pointer to the new texture and YES will be returned. If the
     * allocator returns an invalid texture, it is released, *texture remains unmodified
     * and NO is returned. Please see the MPSCopyAllocator definition for a sample allocator
     * implementation.
     * <p>
     * Sample usage with a copy allocator:
     * [@code]
     * id <MTLTexture> inPlaceTex = ...;
     * MPSImageSobel *sobelFiler = [[MPSImageSobel alloc] initWithDevice: myDevice];
     * <p>
     * // With a fallback MPSCopyAllocator, failure should only occur in exceptional
     * // conditions such as MTLTexture allocation failure or programmer error.
     * // That is, the operation is roughly as robust as the MPSCopyAllocator.
     * // Depending on the quality of that, we might decide we are justified here
     * // in not checking the return value.
     * [sobelFilter encodeToCommandBuffer: myCommandBuffer
     * inPlaceTexture: &inPlaceTex // may be replaced!
     * fallbackCopyAllocator: myAllocator];
     * <p>
     * // If myAllocator was not called:
     * //
     * // inPlaceTex holds the original texture with the result pixels in it
     * //
     * // else,
     * //
     * // 1) myAllocator creates a new texture.
     * // 2) The new texture pixel data is overwritten by MPSUnaryImageKernel.
     * // 3) The old texture passed in *inPlaceTex is released once.
     * // 4) *inPlaceTex = the new texture
     * //
     * // In either case, the caller should now hold one reference to the texture now held in
     * // inPlaceTex, whether it was replaced or not. Most of the time that means that nothing
     * // further needs to be done here, and you can proceed to the next image encoding operation.
     * // However, if other agents held references to the original texture, they still hold them
     * // and may need to be alerted that the texture has been replaced so that they can retain
     * // the new texture and release the old one.
     * <p>
     * [sobelFilter release]; // if not ARC, clean up the MPSImageSobel object
     * [@endcode]
     * <p>
     * Note: Image filters that look at neighboring pixel values may actually consume more
     * memory when operating in place than out of place. Many such operations are
     * tiled internally to save intermediate texture storage, but can not tile when
     * operating in place. The memory savings for tiling is however very short term,
     * typically the lifetime of the MTLCommandBuffer.
     * <p>
     * Attempt to apply a MPSKernel to a texture in place.
     *
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded filter
     * @param texture       A pointer to a valid MTLTexture containing source image.
     *                      On success, the image contents and possibly texture itself
     *                      will be replaced with the result image.
     * @param copyAllocator An optional block to allocate a new texture to hold the
     *                      results, in case in-place operation is not possible. The
     *                      allocator may use a different MTLPixelFormat or size than
     *                      the original texture. You may enqueue operations on the
     *                      provided MTLCommandBuffer using the provided
     *                      MTLComputeCommandEncoder to initialize the texture contents.
     * @return On success, YES is returned. The texture may have been replaced with a new
     *         texture if a copyAllocator was provided. On failure, NO is returned. The
     *         texture is unmodified.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:")
    public native boolean encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> texture,
            @ObjCBlock(name = "call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator") Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator copyAllocator);

    /**
     * Encode a MPSKernel into a command Buffer. The operation shall proceed out-of-place.
     *
     * @param commandBuffer      A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceTexture      A valid MTLTexture containing the source image.
     * @param destinationTexture A valid MTLTexture to be overwritten by result image. DestinationTexture may not alias
     *                           sourceTexture.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:destinationTexture:")
    public native void encodeToCommandBufferSourceTextureDestinationTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    @Generated
    @Selector("init")
    public native MPSUnaryImageKernel init();

    /**
     * Standard init with default properties per filter type
     *
     * @param device The device that the filter will be used on. May not be NULL.
     * @return a pointer to the newly initialized object. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSUnaryImageKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@property] offset
     * <p>
     * The position of the destination clip rectangle origin relative to the source buffer.
     * <p>
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_mpsoffset
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native MPSOffset offset();

    /**
     * [@property] clipRect
     * <p>
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * <p>
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_clipRect
     */
    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    /**
     * [@property] edgeMode
     * <p>
     * The MPSImageEdgeMode to use when texture reads stray off the edge of an image
     * <p>
     * Most MPSKernel objects can read off the edge of the source image. This can happen because of a
     * negative offset property, because the offset + clipRect.size is larger than the
     * source image or because the filter looks at neighboring pixels, such as a Convolution
     * or morphology filter. Default: usually MPSImageEdgeModeZero. (Some MPSKernel types default
     * to MPSImageEdgeModeClamp, because MPSImageEdgeModeZero is either not supported or
     * would produce unexpected results.)
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_edgemode
     */
    @Generated
    @Selector("setEdgeMode:")
    public native void setEdgeMode(@NUInt long value);

    /**
     * [@property] offset
     * <p>
     * The position of the destination clip rectangle origin relative to the source buffer.
     * <p>
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * <p>
     * See Also: @ref MetalPerformanceShaders.h subsubsection_mpsoffset
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue MPSOffset value);

    /**
     * sourceRegionForDestinationSize: is used to determine which region of the
     * sourceTexture will be read by encodeToCommandBuffer:sourceTexture:destinationTexture
     * (and similar) when the filter runs. This information may be needed if the
     * source image is broken into multiple textures. The size of the full
     * (untiled) destination image is provided. The region of the full (untiled)
     * source image that will be read is returned. You can then piece together an
     * appropriate texture containing that information for use in your tiled context.
     * <p>
     * The function will consult the MPSUnaryImageKernel offset and clipRect parameters,
     * to determine the full region read by the function. Other parameters such as
     * sourceClipRect, kernelHeight and kernelWidth will be consulted as necessary.
     * All properties should be set to intended values prior to calling
     * sourceRegionForDestinationSize:.
     * <p>
     * Caution: This function operates using global image coordinates, but
     * -encodeToCommandBuffer:... uses coordinates local to the source and
     * destination image textures. Consequently, the offset and clipRect
     * attached to this object will need to be updated using a global to
     * local coordinate transform before -encodeToCommandBuffer:... is
     * called.
     * <p>
     * Determine the region of the source texture that will be read for a encode operation
     *
     * @param destinationSize The size of the full virtual destination image.
     * @return The area in the virtual source image that will be read.
     */
    @Generated
    @Selector("sourceRegionForDestinationSize:")
    @ByValue
    public native MPSRegion sourceRegionForDestinationSize(@ByValue MTLSize destinationSize);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_encodeToCommandBufferInPlaceTextureFallbackCopyAllocator(MPSKernel arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, @Mapped(ObjCObjectMapper.class) Object arg2);
    }

    /**
     * Encode a MPSKernel into a command Buffer. The operation shall proceed out-of-place.
     *
     * @param commandBuffer    A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceImage      A valid MPSImage containing the source image.
     * @param destinationImage A valid MPSImage to be overwritten by result image. DestinationImage may not alias
     *                         sourceImage.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationImage:")
    public native void encodeToCommandBufferSourceImageDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSImage destinationImage);

    @Generated
    @Selector("initWithCoder:")
    public native MPSUnaryImageKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSUnaryImageKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

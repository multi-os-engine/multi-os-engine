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
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import apple.metalperformanceshaders.struct.MPSImageReadWriteParams;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImage
 *   [@dependency] This depends on Metal.framework
 * 
 * A MPSImage object describes a MTLTexture that may have more than 4 channels.
 * 
 * Some image types, such as those found in convolutional neural networks (CNN)
 *               differ from a standard texture in that they may have more than 4 channels
 *               per image. While the channels could hold RGBA data, they will more commonly
 *               hold a number of structural permutations upon a multi-channel image as the neural
 *               network progresses. It is not uncommon for each pixel to have 32 or 64 channels
 *               in it.
 * 
 *               A standard MTLTexture may have no more than 4 channels. The additional
 *               channels are stored in slices of 2d texture array (i.e. texture type is MTLTextureType2DArray)
 *               such that 4 consecutive channels are stored in each slice of this array.
 *               If the number of feature channels is N, number of array slices needed is (N+3)/4.
 *               E.g. a CNN image with width 3 and height 2 with 9 channels will be stored as
 *  [@code]
 *               slice 0   RGBA   RGBA  RGBA
 *                         RGBA   RGBA  RGBA
 * 
 *               slice 1      RGBA   RGBA   RGBA
 *                            RGBA   RGBA   RGBA         (ASCII art /diagonal offset/ intended to show a Z dimension)
 * 
 *               slice 2         R???   R???   R???
 *                               R???   R???   R???
 * [@endcode]
 *               The width and height of underlying 2d texture array is the same as the width and height of the MPSImage.
 *               The array length is equal to (featureChannels + 3) / 4. Channels marked with ? are just
 *               for padding and should not contain NaNs or Infs.
 * 
 *               A MPSImage can be container of multiple CNN images for batch processing. In order to create a
 *               MPSImage that contains N images, create MPSImageDescriptor with numberOfImages set to N.
 * 
 *               Although a MPSImage can contain numberOfImages > 1, the actual number of images among these processed by MPSCNNKernel
 *               is controlled by z-dimension of the clipRect. A MPSCNNKernel processes n=clipRect.size.depth images from this collection.
 *               The starting source image index to process is given by offset.z. The starting index of the destination image is given by
 *               clipRect.origin.z. The MPSCNNKernel takes n=clipRect.size.depth images from tje source at indices [offset.z, offset.z+n],
 *               processes each independently and stores the result in the destination at indices [clipRect.origin.z, clipRect.origin.z+n]
 *               respectively. Offset.z+n should be <= [src numberOfImage] and clipRect.origin.z+n should be <= [dest numberOfImages] and
 *               offset.z must be >= 0.
 * 
 *               Example: Suppose MPSCNNConvolution takes an input image with 8 channels and outputs an image with 16 channels. The number of
 *               slices needed in the source 2d texture array is 2 and the number of slices needed in the destination 2d array is 4. Suppose
 *               the source batch size is 5 and destination batch size is 4. (Multiple N-channel images can be processed concurrently in a
 *               batch.) The number of source slices will be 2*5=10 and number of destination slices will be 4*4=16. If you want to process
 *               just images 2 and 3 of the source and store the result at index 1 and 2 in the destination, you may achieve this by setting
 *               offset.z=2, clipRect.origin.z=1 and clipRect.size.depth=2. MPSCNNConvolution will take, in this case, slice 4 and 5 of source and
 *               produce slices 4 to 7 of destination. Similarly, slices 6 and 7 will be used to produce slices 8 to 11 of destination.
 * 
 *               All MPSCNNKernels process images within each batch independently. That is, calling a MPSCNNKernel on an
 *               batch is formally the same as calling it on each image in the batch one at a time. However, quite a lot of CPU and GPU overhead
 *               will be avoided if batch processing is used. This is especially important for better performance on small images.
 * 
 *               If the number of feature channels is <= 4 and numberOfImages = 1 i.e. only one slice is needed to represent a MPSImage, the underlying
 *               metal texture type will be MTLTextureType2D rather than MTLTextureType2DArray.
 * 
 *               There are also MPSTemporaryImages, intended for use for very short-lived image data that are produced and consumed
 *               immediately in the same MTLCommandBuffer. They are a useful way to minimize CPU-side texture allocation costs and
 *               greatly reduce the amount of memory used by your image pipeline.
 * 
 *               Creation of the underlying texture may in some cases occur lazily.  You should
 *               in general avoid calling MPSImage.texture except when unavoidable to avoid
 *               materializing memory for longer than necessary. When possible, use the other MPSImage
 *               properties to get information about the MPSImage instead.
 * 
 *               Most MPSImages of 4 or fewer feature channels can generate quicklooks output in
 *               Xcode for easy visualization of image data in the object. MPSTemporaryImages can not.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImage alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * [@property] device
     * 
     * The device on which the MPSImage will be used
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    /**
     * [@property]   featureChannels
     * 
     * The number of feature channels per pixel.
     */
    @Generated
    @Selector("featureChannels")
    @NUInt
    public native long featureChannels();

    /**
     * [@property]   height
     * 
     * The formal height of the image in pixels.
     */
    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MPSImage init();

    /**
     * Initialize an empty image object
     * 
     * Storage to store data needed is allocated lazily on first use of MPSImage or
     *             when application calls MPSImage.texture
     * 
     * @param      device              The device that the image will be used. May not be NULL.
     * @param      imageDescriptor     The MPSImageDescriptor. May not be NULL.
     * @return     A valid MPSImage object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:imageDescriptor:")
    public native MPSImage initWithDeviceImageDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSImageDescriptor imageDescriptor);

    /**
     * Initialize an MPSImage object using Metal texture. Metal texture has been created by
     *             user for specific number of feature channels and number of images.
     * 
     * Application can let MPS framework allocate texture with properties specified in imageDescriptor
     *             using initWithDevice:MPSImageDescriptor API above. However in memory intensive application,
     *             you can save memory (and allocation/deallocation time) by using MPSTemporaryImage where MPS
     *             framework aggressively reuse memory underlying textures on same command buffer. See MPSTemporaryImage
     *             class for details below. However, in certain cases, application developer may want more control
     *             on allocation, placement, reusing/recycling of memory backing textures used in application using
     *             Metal Heaps API. In this case, application can create MPSImage from pre-allocated texture using
     *             initWithTexture:featureChannels.
     * 
     *             MTLTextureType of texture can be MTLTextureType2D ONLY if featureChannels <= 4 in which case
     *             MPSImage.numberOfImages is set to 1. Else it should be MTLTextureType2DArray with
     *             arrayLength == numberOfImage * ((featureChannels + 3)/4). MPSImage.numberOfImages is set to
     *             texture.arrayLength / ((featureChannels + 3)/4).
     * 
     *             For MTLTextures containing typical image data which application may obtain from MetalKit or
     *             other libraries such as that drawn from a JPEG or PNG, featureChannels should
     *             be set to number of valid color channel e.g. for RGB data, even thought MTLPixelFormat will be
     *             MTLPixelFormatRGBA, featureChannels should be set to 3.
     * 
     * @param      texture          The MTLTexture allocated by the user to be used as backing for MPSImage.
     * @param      featureChannels  Number of feature channels this texture contains.
     * @return     A valid MPSImage object or nil, if failure.
     */
    @Generated
    @Selector("initWithTexture:featureChannels:")
    public native MPSImage initWithTextureFeatureChannels(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long featureChannels);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * [@property]   numberOfImages
     * 
     * numberOfImages for batch processing
     */
    @Generated
    @Selector("numberOfImages")
    @NUInt
    public native long numberOfImages();

    /**
     * [@property]   pixelFormat
     * 
     * The MTLPixelFormat of the underlying texture
     * 
     * Note that in some cases, this value may be misleading. For example,
     *             float16 data (BFloat16) is sometimes stored in MTLPixelFormatRGBA16Unorm
     *             Please consult the featureChannelFormat.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * [@property]   pixelSize
     * 
     * Number of bytes from the first byte of one pixel to the first byte of the next
     *             pixel in storage order.  (Includes padding.)
     */
    @Generated
    @Selector("pixelSize")
    @NUInt
    public native long pixelSize();

    /**
     * [@property]   precision
     * 
     * The number of bits of numeric precision available for each feature channel.
     * 
     * This is precision, not size.  That is, float is 24 bits, not 32. half
     *             precision floating-point is 11 bits, not 16. SNorm formats have one less
     *             bit of precision for the sign bit, etc. For formats like MTLPixelFormatB5G6R5Unorm
     *             it is the precision of the most precise channel, in this case 6.  When this
     *             information is unavailable, typically compressed formats, 0 will be returned.
     */
    @Generated
    @Selector("precision")
    @NUInt
    public native long precision();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * Set (or query) the purgeability state of a MPSImage
     * 
     * Usage is per [MTLResource setPurgeableState:], except that the MTLTexture might be
     *                 MPSPurgeableStateAllocationDeferred, which means there is no texture to mark volatile / nonvolatile.
     *                 Attempts to set purgeability on MTLTextures that have not been allocated will be ignored.
     */
    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    public native long setPurgeableState(@NUInt long state);

    /**
     * [@property]   texture
     * 
     * The associated MTLTexture object.
     *             This is a 2D texture if numberOfImages is 1 and number of feature channels <= 4.
     *             It is a 2D texture array otherwise.
     * 
     * To avoid the high cost of premature allocation of the underlying texture, avoid calling this
     *             property except when strictly necessary. [MPSCNNKernel encode...] calls typically cause
     *             their arguments to become allocated. Likewise, MPSImages initialized with -initWithTexture:
     *             featureChannels: have already been allocated.
     */
    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture texture();

    /**
     * [@property]   textureType
     * 
     * The type of the underlying texture, typically MTLTextureType2D
     *             or MTLTextureType2DArray
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    /**
     * [@property]   usage
     * 
     * Description of texture usage.
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    /**
     * [@property]   width
     * 
     * The formal width of the image in pixels.
     */
    @Generated
    @Selector("width")
    @NUInt
    public native long width();

    /**
     * Get a well known MPSImageAllocator that makes MPSImages
     */
    @Generated
    @Selector("defaultAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public static native MPSImageAllocator defaultAllocator();

    /**
     * readBytes
     * 
     * Get the values inside MPSImage and put them in the Buffer passed in.
     * 
     * Use the enum to set data is coming in with what order. The data type will be determined by the pixelFormat
     *                 defined in the Image Descriptor.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          bytesPerRow                  Bytes to stride to point to next row(pixel just below current one) in the user buffer.
     * @param          featureChannelInfo           information user fills in to write to a set of feature channels in the image
     * @param          imageIndex                   Image index in MPSImage to write to.
     * @param          region                       region of the MPSImage to read from. A region is a structure with the origin in the Image from which to start
     *                                              reading values and a size which represents the width and height of the rectangular region to read from.
     *                                              The z direction denotes the number of images, thus for 1 image, origin.z = 0 and size.depth = 1
     */
    @Generated
    @Selector("readBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void readBytesDataLayoutBytesPerRowRegionFeatureChannelInfoImageIndex(VoidPtr dataBytes,
            @NUInt long dataLayout, @NUInt long bytesPerRow, @ByValue MTLRegion region,
            @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);

    /**
     * readBytes
     * 
     * Get the values inside MPSImage and put them in the Buffer passed in.
     * 
     * Use the enum to set data is coming in with what order. The data type will be determined by the pixelFormat
     *                 defined in the Image Descriptor. Region is full image, buffer width and height is same as MPSImage width and height.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          imageIndex                   Image index in MPSImage to read from.
     */
    @Generated
    @Selector("readBytes:dataLayout:imageIndex:")
    public native void readBytesDataLayoutImageIndex(VoidPtr dataBytes, @NUInt long dataLayout, @NUInt long imageIndex);

    /**
     * Set the values inside MPSImage with the Buffer passed in.
     * 
     * This method is used to copy data from the storage provided by dataBytes to the MPSImage. The ordering of data in
     *                 your dataBytes buffer is given by dataLayout. Each image may be stored as either a series of planar images (a series of single WxH images, one per
     *                 feature channel) or a single chunky image, WxHxfeature_channels. BytesPerRow and BytesPerImage are there to allow some padding between
     *                 successive rows and successive images. No padding is allowed between successive feature channels.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          bytesPerRow                  Bytes to stride to point to next row(pixel just below current one) in the user buffer.
     * @param          region                       region of the MPSImage to write to. A region is a structure with the origin in the Image from which to start
     *                                              writing values and a size which represents the width and height of the rectangular region to write in.
     *                                              The z direction denotes the number of images, thus for 1 image, origin.z = 0 and size.depth = 1
     * @param          featureChannelInfo           information user fills in to read from a set of feature channels in the image
     * @param          imageIndex                   Image index in MPSImage to write to.
     */
    @Generated
    @Selector("writeBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void writeBytesDataLayoutBytesPerRowRegionFeatureChannelInfoImageIndex(ConstVoidPtr dataBytes,
            @NUInt long dataLayout, @NUInt long bytesPerRow, @ByValue MTLRegion region,
            @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);

    /**
     * writeBytes
     * 
     * Set the values inside MPSImage with the Buffer passed in.
     * 
     * Use the enum to set data is coming in with what order. The data type will be determined by the pixelFormat
     *                 defined in the Image Descriptor. Region is full image, buffer width and height is same as MPSImage width and height.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          imageIndex                   Image index in MPSImage to write to.
     */
    @Generated
    @Selector("writeBytes:dataLayout:imageIndex:")
    public native void writeBytesDataLayoutImageIndex(ConstVoidPtr dataBytes, @NUInt long dataLayout,
            @NUInt long imageIndex);

    /**
     * [@property]   featureChannelFormat
     * 
     * The true encoding of the feature channels
     */
    @Generated
    @Selector("featureChannelFormat")
    @NUInt
    public native long featureChannelFormat();

    /**
     * Use -batchRepresentation or -subImageWithFeatureChannelRange instead
     * 
     * Generally, you should call -batchRepresentation or -subImageWithFeatureChannelRange
     *             instead because they are safer. This is provided so that these interfaces will work
     *             with your MPSImage subclass.
     * 
     * @param  parent  The parent image that owns the texture. It may be a sub-image.
     * @param  sliceRange  The range of MTLTexture2dArray slices to be included in the sub-image
     * @param  featureChannels The number of feature channels in the new image. The number of images
     *                         is inferred.
     * @return A MPSImage that references a subregion of the texel storage in parent instead of
     *             using its own storage.
     */
    @Generated
    @Selector("initWithParentImage:sliceRange:featureChannels:")
    public native MPSImage initWithParentImageSliceRangeFeatureChannels(MPSImage parent, @ByValue NSRange sliceRange,
            @NUInt long featureChannels);

    /**
     * The MPSImage from which this MPSImage was derived. Otherwise nil.
     * 
     * This will point to the original image if this image was created using
     *             -batchRepresentation, -batchRepresentationWithRange: or
     *             -subImageWithFeatureChannelRange:.
     */
    @Generated
    @Selector("parent")
    public native MPSImage parent();

    /**
     * readBytes
     * 
     * Get the values inside MPSImage and put them in the Buffer passed in.
     * 
     * This method is used to copy data from the MPSImage to the storage provided by dataBytes. The ordering of data in
     *                 your dataBytes buffer is given by dataLayout. Each image may be stored as either a series of planar images (a series of single WxH images, one per
     *                 feature channel) or a single chunky image, WxHxfeature_channels. BytesPerRow and BytesPerImage are there to allow some padding between
     *                 successive rows and successive images. No padding is allowed between successive feature channels.
     * 
     *                 BUG: Prior to MacOS 10.15, iOS/tvOS 13.0, incorrect behavior may be observed if region.size.depth != 1 or if
     *                      bytesPerRow allowed for unused padding between rows.
     *                 BUG: To provide for full capability to extract and insert content from arbitrarily sized buffers, there should
     *                      also be a featureChannelStride in addition to bytesPerRow and bytesPerImage. With the current design, when we finish the
     *                      last feature channel, the next byte will contain the 0th feature channel for the next texel or slice, depending
     *                      on packing order. This method can not be used to modify some but not all of the feature channels in an image.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          bytesPerRow                  Bytes to stride to point to next row(pixel just below current one) in the user buffer.
     * @param          bytesPerImage                Bytes to stride to point to next dataBytes image. See region.size.depth for image count.
     * @param          featureChannelInfo           information user fills in to write to a set of feature channels in the image
     * @param          imageIndex                   Image index in MPSImage to write to.
     * @param          region                       region of the MPSImage to read from. A region is a structure with the origin in the Image from which to start
     *                                              reading values and a size which represents the width and height of the rectangular region to read from.
     *                                              The z direction denotes the number of images, thus for 1 image, origin.z = 0 and size.depth = 1
     */
    @Generated
    @Selector("readBytes:dataLayout:bytesPerRow:bytesPerImage:region:featureChannelInfo:imageIndex:")
    public native void readBytesDataLayoutBytesPerRowBytesPerImageRegionFeatureChannelInfoImageIndex(VoidPtr dataBytes,
            @NUInt long dataLayout, @NUInt long bytesPerRow, @NUInt long bytesPerImage, @ByValue MTLRegion region,
            @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);

    /**
     * Get the number of bytes used to allocate underyling MTLResources
     * 
     * This is the size of the backing store of underlying MTLResources.
     *                 It does not include all storage used by the object, for example
     *                 the storage used to hold the MPSImage instantiation and MTLTexture
     *                 is not included. It only measures the size of the allocation
     *                 used to hold the texels in the image. This value is subject to
     *                 change between different devices and operating systems.
     * 
     *                 Except when -initWithTexture:featureChannels: is used, most
     *                 MPSImages (including MPSTemporaryImages) are allocated without
     *                 a backing store. The backing store is allocated lazily when
     *                 it is needed, typically when the .texture property is called.
     *                 Consequently, in most cases, it should be inexpensive to make
     *                 a MPSImage to see how much memory it will need, and release it
     *                 if it is too large.
     * 
     *                 This method may fail in certain circumstances, such as when the
     *                 MPSImage is created with -initWithTexture:featureChannels:, in
     *                 which case 0 will be returned. 0 will also be returned if
     *                 it is a sub-image or sub-batch (.parent is not nil).
     */
    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    /**
     * Make a sub-image that points to a subset of feature channels in the original
     * 
     * This makes a MPSImage that points to a feature channel subregion within
     *              the original image. It is a much cheaper form of the slice operator in both
     *              memory usage and GPU time, and should be used instead when the slice operator
     *              does not need to operate out of place and the feature channel range is a
     *              multiple of 4.
     * 
     *              If the original is a temporary image, the result will be a temporary image.
     *              It will hold 1 readCount on the original. When the readCount drops to 0, it
     *              will decrement the appropriate counter on the parent.
     * 
     * @param       range     A range describing the sub-range within the MPSImage
     *                        to make the subImage within. The location and length
     *                        must be multiples of 4. If the length is too big, it
     *                        will be reduced to fit in the image.
     */
    @Generated
    @Selector("subImageWithFeatureChannelRange:")
    public native MPSImage subImageWithFeatureChannelRange(@ByValue NSRange range);

    /**
     * Flush the underlying MTLTexture from the device's caches, and invalidate any CPU caches if needed.
     * 
     * This will call [id <MTLBlitEncoder> synchronizeResource: ] on the image's MTLTexture, if any.
     *             This is necessary for all MTLStorageModeManaged resources. For other resources, including temporary
     *             resources (these are all MTLStorageModePrivate), and textures that have not yet been allocated, nothing is done.
     *             It is more efficient to use this method than to attempt to do this yourself with the texture property.
     * 
     * @param      commandBuffer       The commandbuffer on which to synchronize
     */
    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * Set the values inside MPSImage with the Buffer passed in.
     * 
     * This method is used to copy data from the storage provided by dataBytes to the MPSImage. The ordering of data in
     *                 your dataBytes buffer is given by dataLayout. Each image may be stored as either a series of planar images (a series of single WxH images, one per
     *                 feature channel) or a single chunky image, WxHxfeature_channels. BytesPerRow and BytesPerImage are there to allow some padding between
     *                 successive rows and successive images. No padding is allowed between successive feature channels.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          bytesPerColumn               This is the stride in bytes from W[0] to W[1], for both HWC and CHW orderings in the buffer pointed to by dataBytes.
     * @param          bytesPerRow                  Bytes to stride to point to next row(pixel just below current one, i.e. H[0] to H[1]) in the buffer pointed to by  dataBytes.
     * @param          bytesPerImage                This is the stride in bytes from image[0] to image[1] im the buffer pointed to by dataBytes.
     * @param          region                       region of the MPSImage to write to. A region is a structure with the origin in the Image from which to start
     *                                              writing values and a size which represents the width and height of the rectangular region to write in.
     *                                              The z direction denotes the number of images, thus for 1 image, origin.z = 0 and size.depth = 1
     * @param          featureChannelInfo           information user fills in to read from a set of feature channels in the image
     * @param          imageIndex                   Image index in MPSImage to write to.
     */
    @Generated
    @Selector("writeBytes:dataLayout:bytesPerColumn:bytesPerRow:bytesPerImage:region:featureChannelInfo:imageIndex:")
    public native void writeBytesDataLayoutBytesPerColumnBytesPerRowBytesPerImageRegionFeatureChannelInfoImageIndex(
            ConstVoidPtr dataBytes, @NUInt long dataLayout, @NUInt long bytesPerColumn, @NUInt long bytesPerRow,
            @NUInt long bytesPerImage, @ByValue MTLRegion region, @ByValue MPSImageReadWriteParams featureChannelInfo,
            @NUInt long imageIndex);

    /**
     * writeBytes
     * 
     * Set the values inside MPSImage with the Buffer passed in.
     * 
     * Use the enum to set data is coming in with what order. The data type will be determined by the pixelFormat
     *                 defined in the Image Descriptor.
     * 
     *                 BUG: Prior to MacOS 10.15, iOS/tvOS 13.0, incorrect behavior may be observed if region.size.depth != 1 or if
     *                      bytesPerRow allowed for unused padding between rows.
     *                 BUG: To provide for full capability to extract and insert content from arbitrarily sized buffers, there should
     *                      also be a featureChannelStride in addition to bytesPerRow and bytesPerImage. With the current design, when we finish the
     *                      last feature channel, the next byte will contain the 0th feature channel for the next texel or slice, depending
     *                      on packing order. This method can not be used to modify some but not all of the feature channels in an image.
     * 
     * @param          dataBytes                    The array allocated by the user to be used to put data from MPSImage, the length should be
     *                                              imageWidth * imageHeight * numberOfFeatureChannels and dataType should be inferred from pixelFormat
     *                                              defined in the Image Descriptor.
     * @param          dataLayout                   The enum tells how to layout MPS data in the buffer.
     * @param          bytesPerRow                  Bytes to stride to point to next row(pixel just below current one) in the user buffer.
     * @param          bytesPerImage                Bytes to stride to point to next dataBytes image. See region.size.depth for image count.
     * @param          region                       region of the MPSImage to write to. A region is a structure with the origin in the Image from which to start
     *                                              writing values and a size which represents the width and height of the rectangular region to write in.
     *                                              The z direction denotes the number of images, thus for 1 image, origin.z = 0 and size.depth = 1
     * @param          featureChannelInfo           information user fills in to read from a set of feature channels in the image
     * @param          imageIndex                   Image index in MPSImage to write to.
     */
    @Generated
    @Selector("writeBytes:dataLayout:bytesPerRow:bytesPerImage:region:featureChannelInfo:imageIndex:")
    public native void writeBytesDataLayoutBytesPerRowBytesPerImageRegionFeatureChannelInfoImageIndex(
            ConstVoidPtr dataBytes, @NUInt long dataLayout, @NUInt long bytesPerRow, @NUInt long bytesPerImage,
            @ByValue MTLRegion region, @ByValue MPSImageReadWriteParams featureChannelInfo, @NUInt long imageIndex);
}

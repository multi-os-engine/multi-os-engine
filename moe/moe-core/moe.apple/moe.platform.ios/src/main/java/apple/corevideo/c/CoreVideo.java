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

package apple.corevideo.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.IOSurfaceRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.corevideo.opaque.CVMetalTextureCacheRef;
import apple.corevideo.opaque.CVOpenGLESTextureCacheRef;
import apple.corevideo.opaque.CVPixelBufferPoolRef;
import apple.corevideo.struct.CVTime;
import apple.opengles.EAGLContext;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreVideo")
@Runtime(CRuntime.class)
public final class CoreVideo {
    static {
        NatJ.register();
    }

    @Generated
    private CoreVideo() {
    }

    /**
     * [@function] CVBufferRetain
     * 
     * Retains a CVBuffer object
     * 
     * Like CFRetain CVBufferRetain increments the retain count of a CVBuffer object. In contrast to the CF call it is
     * NULL safe.
     * 
     * @param buffer A CVBuffer object that you want to retain.
     * @return A CVBuffer object that is the same as the passed in buffer.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CVBufferRef CVBufferRetain(@Nullable CVBufferRef buffer);

    /**
     * [@function] CVBufferRelease
     * 
     * Release a CVBuffer object
     * 
     * Like CFRetain CVBufferRetain decrements the retain count of a CVBuffer object. If that count consequently becomes
     * zero the memory allocated to the object is deallocated and the object is destroyed. In contrast to the CF call it
     * is NULL safe.
     * 
     * @param buffer A CVBuffer object that you want to release.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferRelease(@Nullable CVBufferRef buffer);

    /**
     * [@function] CVBufferSetAttachment
     * 
     * Sets or adds a attachment of a CVBuffer object
     * 
     * You can attach any CF object to a CVBuffer object to store additional information. CVBufferGetAttachment stores
     * an attachement identified by a key. If the key doesn't exist, the attachment will be added. If the key does
     * exist, the existing attachment will be replaced. In bouth cases the retain count of the attachment will be
     * incremented. The value can be any CFType but nil has no defined behavior.
     * 
     * @param buffer         Target CVBuffer object.
     * @param key            Key in form of a CFString identifying the desired attachment.
     * @param value          Attachment in form af a CF object.
     * @param attachmentMode Specifies which attachment mode is desired for this attachment. A particular attachment key
     *                       may only exist in
     *                       a single mode at a time.
     * 
     *                       API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferSetAttachment(@NotNull CVBufferRef buffer, @NotNull CFStringRef key,
            @NotNull ConstVoidPtr value, int attachmentMode);

    /**
     * [@function] CVBufferGetAttachment
     * 
     * Returns a specific attachment of a CVBuffer object
     * 
     * You can attach any CF object to a CVBuffer object to store additional information. CVBufferGetAttachment
     * retrieves an attachement identified by a key.
     * 
     * @param buffer          Target CVBuffer object.
     * @param key             Key in form of a CFString identifying the desired attachment.
     * @param attachmentMode. Returns the mode of the attachment, if desired. May be NULL.
     * @return If found the attachment object
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 15.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr CVBufferGetAttachment(@NotNull CVBufferRef buffer, @NotNull CFStringRef key,
            @Nullable IntPtr attachmentMode);

    /**
     * [@function] CVBufferRemoveAttachment
     * 
     * Removes a specific attachment of a CVBuffer object
     * 
     * CVBufferRemoveAttachment removes an attachement identified by a key. If found the attachement is removed and the
     * retain count decremented.
     * 
     * @param buffer Target CVBuffer object.
     * @param key    Key in form of a CFString identifying the desired attachment.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferRemoveAttachment(@NotNull CVBufferRef buffer, @NotNull CFStringRef key);

    /**
     * [@function] CVBufferRemoveAllAttachments
     * 
     * Removes all attachments of a CVBuffer object
     * 
     * While CVBufferRemoveAttachment removes a specific attachement identified by a key CVBufferRemoveAllAttachments
     * removes all attachments of a buffer and decrements their retain counts.
     * 
     * @param buffer Target CVBuffer object.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferRemoveAllAttachments(@NotNull CVBufferRef buffer);

    /**
     * [@function] CVBufferGetAttachments
     * 
     * Returns all attachments of a CVBuffer object
     * 
     * CVBufferGetAttachments is a convenience call that returns all attachments with their corresponding keys in a
     * CFDictionary.
     * 
     * @param buffer Target CVBuffer object.
     * @return A CFDictionary with all buffer attachments identified by there keys. If no attachment is present, the
     *         dictionary is empty. Returns NULL
     *         for invalid attachment mode.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 15.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFDictionaryRef CVBufferGetAttachments(@NotNull CVBufferRef buffer, int attachmentMode);

    /**
     * [@function] CVBufferSetAttachments
     * 
     * Sets a set of attachments for a CVBuffer
     * 
     * CVBufferSetAttachments is a convenience call that in turn calls CVBufferSetAttachment for each key and value in
     * the given dictionary. All key value pairs must be in the root level of the dictionary.
     * 
     * @param buffer Target CVBuffer object.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferSetAttachments(@NotNull CVBufferRef buffer,
            @NotNull CFDictionaryRef theAttachments, int attachmentMode);

    /**
     * [@function] CVBufferPropagateAttachments
     * 
     * Copy all propagatable attachments from one buffer to another.
     * 
     * CVBufferPropagateAttachments is a convenience call that copies all attachments with a mode of
     * kCVAttachmentMode_ShouldPropagate from one
     * buffer to another.
     * 
     * @param sourceBuffer      CVBuffer to copy attachments from.
     * @param destinationBuffer CVBuffer to copy attachments to.
     * 
     *                          API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVBufferPropagateAttachments(@NotNull CVBufferRef sourceBuffer,
            @NotNull CVBufferRef destinationBuffer);

    /**
     * [@function] CVImageBufferGetEncodedSize
     * 
     * Returns the full encoded dimensions of a CVImageBuffer. For example, for an NTSC DV frame this would be 720x480
     * 
     * @param imageBuffer A CVImageBuffer that you wish to retrieve the encoded size from.
     * @return A CGSize returning the full encoded size of the buffer
     *         Returns zero size if called with a non-CVImageBufferRef type or NULL.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CVImageBufferGetEncodedSize(@NotNull CVBufferRef imageBuffer);

    /**
     * [@function] CVImageBufferGetDisplaySize
     * 
     * Returns the nominal output display size (in square pixels) of a CVImageBuffer.
     * For example, for an NTSC DV frame this would be 640x480
     * 
     * @param imageBuffer A CVImageBuffer that you wish to retrieve the display size from.
     * @return A CGSize returning the nominal display size of the buffer
     *         Returns zero size if called with a non-CVImageBufferRef type or NULL.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CVImageBufferGetDisplaySize(@NotNull CVBufferRef imageBuffer);

    /**
     * [@function] CVImageBufferGetCleanRect
     * 
     * Returns the source rectangle of a CVImageBuffer that represents the clean aperture
     * of the buffer in encoded pixels. For example, an NTSC DV frame would return a CGRect with an
     * origin of 8,0 and a size of 704,480.
     * Note that the origin of this rect always the lower left corner. This is the same coordinate system as
     * used by CoreImage.
     * 
     * @param imageBuffer A CVImageBuffer that you wish to retrieve the display size from.
     * @return A CGSize returning the nominal display size of the buffer
     *         Returns zero rect if called with a non-CVImageBufferRef type or NULL.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CVImageBufferGetCleanRect(@NotNull CVBufferRef imageBuffer);

    /**
     * [@function] CVImageBufferIsFlipped
     * 
     * Returns whether the image is flipped vertically or not.
     * 
     * @param CVImageBuffer target
     * @return True if 0,0 in the texture is upper left, false if 0,0 is lower left.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CVImageBufferIsFlipped(@NotNull CVBufferRef imageBuffer);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetTypeID();

    /**
     * [@function] CVPixelBufferRetain
     * 
     * Retains a CVPixelBuffer object
     * 
     * Equivalent to CFRetain, but NULL safe
     * 
     * @param buffer A CVPixelBuffer object that you want to retain.
     * @return A CVPixelBuffer object that is the same as the passed in buffer.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CVBufferRef CVPixelBufferRetain(@Nullable CVBufferRef texture);

    /**
     * [@function] CVPixelBufferRelease
     * 
     * Releases a CVPixelBuffer object
     * 
     * Equivalent to CFRelease, but NULL safe
     * 
     * @param buffer A CVPixelBuffer object that you want to release.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVPixelBufferRelease(@Nullable CVBufferRef texture);

    /**
     * [@function] CVPixelBufferCreateResolvedAttributesDictionary
     * 
     * Takes a CFArray of CFDictionary objects describing various pixel buffer attributes and tries to resolve them into
     * a
     * single dictionary.
     * 
     * This is useful when you need to resolve multiple requirements between different potential clients of a buffer.
     * 
     * @param attributes            CFArray of CFDictionaries containing kCVPixelBuffer key/value pairs.
     * @param resolvedDictionaryOut The resulting dictionary will be placed here.
     * @return Return value that may be useful in discovering why resolution failed.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferCreateResolvedAttributesDictionary(@Nullable CFAllocatorRef allocator,
            @Nullable CFArrayRef attributes, @NotNull Ptr<CFDictionaryRef> resolvedDictionaryOut);

    /**
     * [@function] CVPixelBufferCreate
     * 
     * Call to create a single PixelBuffer for a given size and pixelFormatType.
     * 
     * Creates a single PixelBuffer for a given size and pixelFormatType. It allocates the necessary memory based on the
     * pixel dimensions, pixelFormatType and extended pixels described in the pixelBufferAttributes. Not all parameters
     * of the pixelBufferAttributes will be used here.
     * 
     * @param width                 Width of the PixelBuffer in pixels.
     * @param height                Height of the PixelBuffer in pixels.
     * @param pixelFormatType       Pixel format indentified by its respective OSType.
     * @param pixelBufferAttributes A dictionary with additional attributes for a pixel buffer. This parameter is
     *                              optional. See BufferAttributeKeys for more details.
     * @param pixelBufferOut        The new pixel buffer will be returned here
     * @return returns kCVReturnSuccess on success.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferCreate(@Nullable CFAllocatorRef allocator, @NUInt long width,
            @NUInt long height, int pixelFormatType, @Nullable CFDictionaryRef pixelBufferAttributes,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * [@function] CVPixelBufferCreateWithBytes
     * 
     * Call to create a single PixelBuffer for a given size and pixelFormatType based on a passed in piece of memory.
     * 
     * Creates a single PixelBuffer for a given size and pixelFormatType. Not all parameters of the
     * pixelBufferAttributes will be used here. It requires a release callback function that will be called, when the
     * PixelBuffer gets destroyed so that the owner of the pixels can free the memory.
     * 
     * @param width                 Width of the PixelBuffer in pixels
     * @param height                Height of the PixelBuffer in pixels
     * @param pixelFormatType       Pixel format indentified by its respective OSType.
     * @param baseAddress           Address of the memory storing the pixels.
     * @param bytesPerRow           Row bytes of the pixel storage memory.
     * @param releaseCallback       CVPixelBufferReleaseBytePointerCallback function that gets called when the
     *                              PixelBuffer gets destroyed.
     * @param releaseRefCon         User data identifying the PixelBuffer for the release callback.
     * @param pixelBufferAttributes A dictionary with additional attributes for a a pixel buffer. This parameter is
     *                              optional. See PixelBufferAttributes for more details.
     * @param pixelBufferOut        The new pixel buffer will be returned here
     * @return returns kCVReturnSuccess on success.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferCreateWithBytes(@Nullable CFAllocatorRef allocator, @NUInt long width,
            @NUInt long height, int pixelFormatType, @NotNull VoidPtr baseAddress, @NUInt long bytesPerRow,
            @Nullable @FunctionPtr(name = "call_CVPixelBufferCreateWithBytes") Function_CVPixelBufferCreateWithBytes releaseCallback,
            @Nullable VoidPtr releaseRefCon, @Nullable CFDictionaryRef pixelBufferAttributes,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * [@function] CVPixelBufferCreateWithPlanarBytes
     * 
     * Call to create a single PixelBuffer in planar format for a given size and pixelFormatType based on a passed in
     * piece of memory.
     * 
     * Creates a single PixelBuffer for a given size and pixelFormatType. Not all parameters of the
     * pixelBufferAttributes will be used here. It requires a release callback function that will be called, when the
     * PixelBuffer gets destroyed so that the owner of the pixels can free the memory.
     * 
     * @param width                 Width of the PixelBuffer in pixels
     * @param height                Height of the PixelBuffer in pixels
     * @param pixelFormatType       Pixel format indentified by its respective OSType.
     * @param dataPtr               Pass a pointer to a plane descriptor block, or NULL.
     * @param dataSize              pass size if planes are contiguous, NULL if not.
     * @param numberOfPlanes        Number of planes.
     * @param planeBaseAddress      Array of base addresses for the planes.
     * @param planeWidth            Array of plane widths.
     * @param planeHeight           Array of plane heights.
     * @param planeBytesPerRow      Array of plane bytesPerRow values.
     * @param releaseCallback       CVPixelBufferReleaseBytePointerCallback function that gets called when the
     *                              PixelBuffer gets destroyed.
     * @param releaseRefCon         User data identifying the PixelBuffer for the release callback.
     * @param pixelBufferAttributes A dictionary with additional attributes for a a pixel buffer. This parameter is
     *                              optional. See PixelBufferAttributes for more details.
     * @param pixelBufferOut        The new pixel buffer will be returned here
     * @return returns kCVReturnSuccess on success.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferCreateWithPlanarBytes(@Nullable CFAllocatorRef allocator, @NUInt long width,
            @NUInt long height, int pixelFormatType, @Nullable VoidPtr dataPtr, @NUInt long dataSize,
            @NUInt long numberOfPlanes, @NotNull Ptr<VoidPtr> planeBaseAddress, @NotNull NUIntPtr planeWidth,
            @NotNull NUIntPtr planeHeight, @NotNull NUIntPtr planeBytesPerRow,
            @Nullable @FunctionPtr(name = "call_CVPixelBufferCreateWithPlanarBytes") Function_CVPixelBufferCreateWithPlanarBytes releaseCallback,
            @Nullable VoidPtr releaseRefCon, @Nullable CFDictionaryRef pixelBufferAttributes,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * [@function] CVPixelBufferLockBaseAddress
     * 
     * Description Locks the BaseAddress of the PixelBuffer to ensure that the memory is accessible.
     * 
     * This API ensures that the CVPixelBuffer is accessible in system memory. This should only be called if the base
     * address is going to be used and the pixel data will be accessed by the CPU.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param lockFlags   See CVPixelBufferLockFlags.
     * @return kCVReturnSuccess if the lock succeeded, or error code on failure
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferLockBaseAddress(@NotNull CVBufferRef pixelBuffer, long lockFlags);

    /**
     * [@function] CVPixelBufferUnlockBaseAddress
     * 
     * Description Unlocks the BaseAddress of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param unlockFlags See CVPixelBufferLockFlags.
     * @return kCVReturnSuccess if the unlock succeeded, or error code on failure
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferUnlockBaseAddress(@NotNull CVBufferRef pixelBuffer, long unlockFlags);

    /**
     * [@function] CVPixelBufferGetWidth
     * 
     * Returns the width of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Width in pixels.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetWidth(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetHeight
     * 
     * Returns the height of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Height in pixels.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetHeight(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetPixelFormatType
     * 
     * Returns the PixelFormatType of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return OSType identifying the pixel format by its type.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferGetPixelFormatType(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetBaseAddress
     * 
     * Returns the base address of the PixelBuffer.
     * 
     * Retrieving the base address for a PixelBuffer requires that the buffer base address be locked
     * via a successful call to CVPixelBufferLockBaseAddress.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Base address of the pixels.
     *         For chunky buffers, this will return a pointer to the pixel at 0,0 in the buffer
     *         For planar buffers this will return a pointer to a PlanarComponentInfo struct (defined in QuickTime).
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr CVPixelBufferGetBaseAddress(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetBytesPerRow
     * 
     * Returns the rowBytes of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Bytes per row of the image data. For planar buffers this will return a rowBytes value such that
     *         bytesPerRow * height
     *         will cover the entire image including all planes.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetBytesPerRow(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetDataSize
     * 
     * Returns the data size for contigous planes of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Data size used in CVPixelBufferCreateWithPlanarBytes.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetDataSize(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferIsPlanar
     * 
     * Returns if the PixelBuffer is planar.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return True if the PixelBuffer was created using CVPixelBufferCreateWithPlanarBytes.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CVPixelBufferIsPlanar(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetPlaneCount
     * 
     * Returns number of planes of the PixelBuffer.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @return Number of planes. Returns 0 for non-planar CVPixelBufferRefs.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetPlaneCount(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferGetWidthOfPlane
     * 
     * Returns the width of the plane at planeIndex in the PixelBuffer.
     * 
     * On OSX 10.10 and earlier, or iOS 8 and earlier, calling this
     * function with a non-planar buffer will have undefined behavior.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param planeIndex  Identifying the plane.
     * @return Width in pixels, or 0 for non-planar CVPixelBufferRefs.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetWidthOfPlane(@NotNull CVBufferRef pixelBuffer, @NUInt long planeIndex);

    /**
     * [@function] CVPixelBufferGetHeightOfPlane
     * 
     * Returns the height of the plane at planeIndex in the PixelBuffer.
     * 
     * On OSX 10.10 and earlier, or iOS 8 and earlier, calling this
     * function with a non-planar buffer will have undefined behavior.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param planeIndex  Identifying the plane.
     * @return Height in pixels, or 0 for non-planar CVPixelBufferRefs.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetHeightOfPlane(@NotNull CVBufferRef pixelBuffer, @NUInt long planeIndex);

    /**
     * [@function] CVPixelBufferGetBaseAddressOfPlane
     * 
     * Returns the base address of the plane at planeIndex in the PixelBuffer.
     * 
     * Retrieving the base address for a PixelBuffer requires that the buffer base address be locked
     * via a successful call to CVPixelBufferLockBaseAddress. On OSX 10.10 and earlier, or iOS 8 and
     * earlier, calling this function with a non-planar buffer will have undefined behavior.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param planeIndex  Identifying the plane.
     * @return Base address of the plane, or NULL for non-planar CVPixelBufferRefs.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr CVPixelBufferGetBaseAddressOfPlane(@NotNull CVBufferRef pixelBuffer,
            @NUInt long planeIndex);

    /**
     * [@function] CVPixelBufferGetBytesPerRowOfPlane
     * 
     * Returns the row bytes of the plane at planeIndex in the PixelBuffer.
     * 
     * On OSX 10.10 and earlier, or iOS 8 and earlier, calling this
     * function with a non-planar buffer will have undefined behavior.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * @param planeIndex  Identifying the plane.
     * @return Row bytes of the plane, or NULL for non-planar CVPixelBufferRefs.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferGetBytesPerRowOfPlane(@NotNull CVBufferRef pixelBuffer,
            @NUInt long planeIndex);

    /**
     * [@function] CVPixelBufferGetExtendedPixels
     * 
     * Returns the size of extended pixels of the PixelBuffer.
     * 
     * On OSX 10.10 and earlier, or iOS 8 and earlier, calling this
     * function with a non-planar buffer will have undefined behavior.
     * 
     * @param pixelBuffer         Target PixelBuffer.
     * @param extraColumnsOnLeft  Returns the pixel row padding to the left. May be NULL.
     * @param extraRowsOnTop      Returns the pixel row padding to the top. May be NULL.
     * @param extraColumnsOnRight Returns the pixel row padding to the right. May be NULL.
     * @param extraRowsOnBottom   Returns the pixel row padding to the bottom. May be NULL.
     * 
     *                            API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVPixelBufferGetExtendedPixels(@NotNull CVBufferRef pixelBuffer,
            @Nullable NUIntPtr extraColumnsOnLeft, @Nullable NUIntPtr extraColumnsOnRight,
            @Nullable NUIntPtr extraRowsOnTop, @Nullable NUIntPtr extraRowsOnBottom);

    /**
     * [@function] CVPixelBufferFillExtendedPixels
     * 
     * Fills the extended pixels of the PixelBuffer. This function replicates edge pixels to fill the entire extended
     * region of the image.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * 
     *                    API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferFillExtendedPixels(@NotNull CVBufferRef pixelBuffer);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVPixelBufferPoolGetTypeID();

    /**
     * [@function] CVPixelBufferPoolRetain
     * 
     * Retains a CVPixelBufferPoolRef object
     * 
     * Equivalent to CFRetain, but NULL safe
     * 
     * @param buffer A CVPixelBufferPoolRef object that you want to retain.
     * @return A CVPixelBufferPoolRef object that is the same as the passed in buffer.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CVPixelBufferPoolRef CVPixelBufferPoolRetain(@Nullable CVPixelBufferPoolRef pixelBufferPool);

    /**
     * [@function] CVPixelBufferPoolRelease
     * 
     * Releases a CVPixelBufferPoolRef object
     * 
     * Equivalent to CFRelease, but NULL safe
     * 
     * @param buffer A CVPixelBufferPoolRef object that you want to release.
     * 
     *               API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVPixelBufferPoolRelease(@Nullable CVPixelBufferPoolRef pixelBufferPool);

    /**
     * [@function] CVPixelBufferPoolCreate
     * 
     * Creates a new Pixel Buffer pool.
     * 
     * @param allocator  The CFAllocatorRef to use for allocating this buffer pool. May be NULL.
     * @param attributes A CFDictionaryRef containing the attributes to be used for creating new PixelBuffers within the
     *                   pool.
     * @param poolOut    The newly created pool will be placed here
     * @return Returns kCVReturnSuccess on success
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferPoolCreate(@Nullable CFAllocatorRef allocator,
            @Nullable CFDictionaryRef poolAttributes, @Nullable CFDictionaryRef pixelBufferAttributes,
            @NotNull Ptr<CVPixelBufferPoolRef> poolOut);

    /**
     * [@function] CVPixelBufferPoolGetAttributes
     * 
     * Returns the pool attributes dictionary for a CVPixelBufferPool
     * 
     * @param pool The CVPixelBufferPoolRef to retrieve the attributes from
     * @return Returns the pool attributes dictionary, or NULL on failure.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CVPixelBufferPoolGetAttributes(@NotNull CVPixelBufferPoolRef pool);

    /**
     * [@function] CVPixelBufferPoolGetPixelBufferAttributes
     * 
     * Returns the attributes of pixel buffers that will be created from this pool.
     * 
     * This function is provided for those cases where you may need to know some information about the buffers that
     * will be created up front.
     * 
     * @param pool The CVPixelBufferPoolRef to retrieve the attributes from
     * @return Returns the pixel buffer attributes dictionary, or NULL on failure.
     * 
     *         API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CVPixelBufferPoolGetPixelBufferAttributes(@NotNull CVPixelBufferPoolRef pool);

    /**
     * [@function] CVPixelBufferPoolCreatePixelBuffer
     * 
     * Creates a new PixelBuffer object from the pool.
     * 
     * The function creates a new (attachment-free) CVPixelBuffer using the pixel buffer attributes specifed during pool
     * creation.
     * 
     * @param allocator      The CFAllocatorRef to use for creating the pixel buffer. May be NULL.
     * @param pool           The CVPixelBufferPool that should create the new CVPixelBuffer.
     * @param pixelBufferOut The newly created pixel buffer will be placed here
     * @return Returns kCVReturnSuccess on success
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferPoolCreatePixelBuffer(@Nullable CFAllocatorRef allocator,
            @NotNull CVPixelBufferPoolRef pixelBufferPool, @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * [@function] CVPixelBufferPoolCreatePixelBufferWithAuxAttributes
     * 
     * Creates a new PixelBuffer object from the pool.
     * 
     * This function creates a new CVPixelBuffer using the pixel buffer attributes specified during pool creation and
     * the attributes specified in the auxAttributes parameter.
     * 
     * @param allocator       The CFAllocatorRef to use for creating the pixel buffer. May be NULL.
     * @param pixelBufferPool The CVPixelBufferPool that should create the new CVPixelBuffer.
     * @param auxAttributes   Attributes describing this specific allocation request. May be NULL.
     * @param pixelBufferOut  The newly created pixel buffer will be placed here
     * @return Returns kCVReturnSuccess on success
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferPoolCreatePixelBufferWithAuxAttributes(@Nullable CFAllocatorRef allocator,
            @NotNull CVPixelBufferPoolRef pixelBufferPool, @Nullable CFDictionaryRef auxAttributes,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * [@function] CVPixelBufferPoolFlush
     * 
     * Frees as many buffers from the pool as possible.
     * 
     * By default, this function will free all aged out buffers. Setting the
     * kCVPixelBufferPoolFlushExcessBuffers flag will cause this call to free all unused
     * buffers regardless of age.
     * 
     * @param pool    The CVPixelBufferPool to be flushed.
     * @param options Set to kCVPixelBufferPoolFlushExcessBuffers to free all unused buffers
     *                regardless of their age.
     */
    @Generated
    @CFunction
    public static native void CVPixelBufferPoolFlush(@NotNull CVPixelBufferPoolRef pool, long options);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     * COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    @NUInt
    public static native long CVOpenGLESTextureGetTypeID();

    /**
     * [@function] CVOpenGLESTextureGetTarget
     * 
     * Returns the texture target (eg. 2D vs. rect texture extension) of the CVOpenGLESTexture
     * 
     * @param image Target CVOpenGLESTexture
     * @return OpenGLES texture target
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 12.0
     *         Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     *         COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CVOpenGLESTextureGetTarget(@NotNull CVBufferRef image);

    /**
     * [@function] CVOpenGLESTextureGetName
     * 
     * Returns the texture target name of the CVOpenGLESTexture
     * 
     * @param image Target CVOpenGLESTexture
     * @return OpenGLES texture target name
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 12.0
     *         Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     *         COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CVOpenGLESTextureGetName(@NotNull CVBufferRef image);

    /**
     * [@function] CVOpenGLESTextureIsFlipped
     * 
     * Returns whether the image is flipped vertically or not.
     * 
     * @param image Target CVOpenGLESTexture
     * @return True if 0,0 in the texture is upper left, false if 0,0 is lower left
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 12.0
     *         Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     *         COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte CVOpenGLESTextureIsFlipped(@NotNull CVBufferRef image);

    /**
     * textureAttributes - reserved for future use
     * 
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     * COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    @NUInt
    public static native long CVOpenGLESTextureCacheGetTypeID();

    /**
     * [@function] CVOpenGLESTextureCacheCreate
     * 
     * Creates a new Texture Cache.
     * 
     * @param allocator         The CFAllocatorRef to use for allocating the cache. May be NULL.
     * @param cacheAttributes   A CFDictionaryRef containing the attributes of the cache itself. May be NULL.
     * @param eaglContext       The OpenGLES 2.0 context into which the texture objects will be created. OpenGLES 1.x
     *                          contexts are not supported.
     * @param textureAttributes A CFDictionaryRef containing the attributes to be used for creating the
     *                          CVOpenGLESTexture objects. May be NULL.
     * @param cacheOut          The newly created texture cache will be placed here
     * @return Returns kCVReturnSuccess on success
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 12.0
     *         Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     *         COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CVOpenGLESTextureCacheCreate(@Nullable CFAllocatorRef allocator,
            @Nullable CFDictionaryRef cacheAttributes, @NotNull EAGLContext eaglContext,
            @Nullable CFDictionaryRef textureAttributes, @NotNull Ptr<CVOpenGLESTextureCacheRef> cacheOut);

    /**
     * [@function] CVOpenGLESTextureCacheCreateTextureFromImage
     * 
     * Creates a CVOpenGLESTexture object from an existing CVImageBuffer
     * 
     * Creates or returns a cached CVOpenGLESTexture texture object mapped to the CVImageBuffer and
     * associated params. This creates a live binding between the CVImageBuffer and underlying
     * CVOpenGLESTexture texture object. The EAGLContext associated with the cache may be modified,
     * to create, delete, or bind textures. When used as a source texture or GL_COLOR_ATTACHMENT,
     * the CVImageBuffer must be unlocked before rendering. The source or render buffer texture should
     * not be re-used until the rendering has completed. This can be guaranteed by calling glFlush().
     * 
     * Here are some example mappings:
     * 
     * Mapping a BGRA buffer as a source texture:
     * CVOpenGLESTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL, GL_TEXTURE_2D,
     * GL_RGBA, width, height, GL_RGBA, GL_UNSIGNED_BYTE, 0, &outTexture);
     * 
     * Mapping a BGRA buffer as a renderbuffer:
     * CVOpenGLESTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL,
     * GL_RENDERBUFFER, GL_RGBA8_OES, width, height, GL_RGBA, GL_UNSIGNED_BYTE, 0, &outTexture);
     * 
     * Mapping the luma plane of a 420v buffer as a source texture:
     * CVOpenGLESTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL, GL_TEXTURE_2D,
     * GL_LUMINANCE, width, height, GL_LUMINANCE, GL_UNSIGNED_BYTE, 0, &outTexture);
     * 
     * Mapping the chroma plane of a 420v buffer as a source texture:
     * CVOpenGLESTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL, GL_TEXTURE_2D,
     * GL_LUMINANCE_ALPHA, width/2, height/2, GL_LUMINANCE_ALPHA, GL_UNSIGNED_BYTE, 1, &outTexture);
     * 
     * Mapping a yuvs buffer as a source texture (note: yuvs/f and 2vuy are unpacked and resampled -- not colorspace
     * converted)
     * CVOpenGLESTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL, GL_TEXTURE_2D,
     * GL_RGB_422_APPLE, width, height, GL_RGB_422_APPLE, GL_UNSIGNED_SHORT_8_8_APPLE, 1, &outTexture);
     * 
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     * COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     * 
     * @param allocator         The CFAllocatorRef to use for allocating the CVOpenGLESTexture object. May be NULL.
     * @param textureCache      The texture cache object that will manage the texture.
     * @param sourceImage       The CVImageBuffer that you want to create a CVOpenGLESTexture from.
     * @param textureAttributes A CFDictionaryRef containing attributes to be used for creating the CVOpenGLESTexture
     *                          objects. May be NULL.
     * @param target            Specifies the target texture. GL_TEXTURE_2D and GL_RENDERBUFFER are the only targets
     *                          currently supported.
     * @param internalFormat    Specifies the number of color components in the texture. Examples are GL_RGBA,
     *                          GL_LUMINANCE, GL_RGBA8_OES, GL_RG, and GL_RED (NOTE: On GLES3 use GL_R8 instead of
     *                          GL_RED).
     * @param width             Specifies the width of the texture image.
     * @param height            Specifies the height of the texture image.
     * @param format            Specifies the format of the pixel data. Examples are GL_RGBA and GL_LUMINANCE.
     * @param type              Specifies the data type of the pixel data. Examples are GL_UNSIGNED_BYTE.
     * @param planeIndex        Specifies the plane of the CVImageBuffer to map bind. Ignored for non-planar
     *                          CVImageBuffers.
     * @param textureOut        The newly created texture object will be placed here.
     * @return Returns kCVReturnSuccess on success
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int CVOpenGLESTextureCacheCreateTextureFromImage(@Nullable CFAllocatorRef allocator,
            @NotNull CVOpenGLESTextureCacheRef textureCache, @NotNull CVBufferRef sourceImage,
            @Nullable CFDictionaryRef textureAttributes, int target, int internalFormat, int width, int height,
            int format, int type, @NUInt long planeIndex, @NotNull Ptr<CVBufferRef> textureOut);

    /**
     * [@function] CVOpenGLESTextureCacheFlush
     * 
     * Performs internal housekeeping/recycling operations
     * 
     * This call must be made periodically to give the texture cache a chance to make OpenGLES calls
     * on the OpenGLES context used to create it in order to do housekeeping operations. The EAGLContext
     * associated with the cache may be used to delete or unbind textures.
     * 
     * @param textureCache The texture cache object to flush
     * @param options      Currently unused, set to 0.
     * 
     *                     API-Since: 5.0
     *                     Deprecated-Since: 12.0
     *                     Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     *                     COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void CVOpenGLESTextureCacheFlush(@NotNull CVOpenGLESTextureCacheRef textureCache,
            long options);

    /**
     * Create a description of a pixel format from a provided OSType
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CVPixelFormatDescriptionCreateWithPixelFormatType(
            @Nullable CFAllocatorRef allocator, int pixelFormat);

    /**
     * Get a CFArray of CFNumbers containing all known pixel formats as OSTypes
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes(
            @Nullable CFAllocatorRef allocator);

    /**
     * Register a new pixel format with CoreVideo
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType(
            @NotNull CFDictionaryRef description, int pixelFormat);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVMetalTextureGetTypeID();

    /**
     * [@function] CVMetalTextureGetTexture
     * 
     * Returns the Meta MTLTexture object of the CVMetalTextureRef
     * 
     * @param image Target CVMetalTexture
     * @return Metal texture
     * 
     *         API-Since: 8.0
     */
    @Nullable
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object CVMetalTextureGetTexture(@NotNull CVBufferRef image);

    /**
     * [@function] CVMetalTextureIsFlipped
     * 
     * Returns whether the image is flipped vertically or not.
     * 
     * @param image Target CVMetalTexture
     * @return True if 0,0 in the texture is upper left, false if 0,0 is lower left
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CVMetalTextureIsFlipped(@NotNull CVBufferRef image);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CVMetalTextureCacheGetTypeID();

    /**
     * [@function] CVMetalTextureCacheCreate
     * 
     * Creates a new Texture Cache.
     * 
     * @param allocator         The CFAllocatorRef to use for allocating the cache. May be NULL.
     * @param cacheAttributes   A CFDictionaryRef containing the attributes of the cache itself. May be NULL.
     * @param metalDevice       The Metal device for which the texture objects will be created.
     * @param textureAttributes A CFDictionaryRef containing the attributes to be used for creating the CVMetalTexture
     *                          objects. May be NULL.
     * @param cacheOut          The newly created texture cache will be placed here
     * @return Returns kCVReturnSuccess on success
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int CVMetalTextureCacheCreate(@Nullable CFAllocatorRef allocator,
            @Nullable CFDictionaryRef cacheAttributes, @NotNull @Mapped(ObjCObjectMapper.class) Object metalDevice,
            @Nullable CFDictionaryRef textureAttributes, @NotNull Ptr<CVMetalTextureCacheRef> cacheOut);

    /**
     * [@function] CVMetalTextureCacheCreateTextureFromImage
     * 
     * Creates a CVMetalTexture object from an existing CVImageBuffer
     * 
     * Creates or returns a cached CVMetalTexture texture object mapped to the CVImageBuffer and
     * associated params. This creates a live binding between the CVImageBuffer and underlying
     * CVMetalTexture texture object.
     * 
     * IMPORTANT NOTE: Clients should retain CVMetalTexture objects until they are done using the images in them.
     * Retaining a CVMetalTexture is your way to indicate that you're still using the image in the buffer, and that it
     * should not be recycled yet.
     * 
     * Note that CoreVideo does not explicitly declare any pixel format types to be Metal compatible. The assumption
     * is that if the CVPixelBufferMetalCompatibilityKey has been specified, all buffers will be Metal compatible
     * (IOSurface backed), and thus it is the developer's responsibility to choose an appropriate Metal pixel format
     * for the CVPixelBuffers.
     * 
     * Here are some example mappings:
     * 
     * Mapping a BGRA buffer:
     * CVMetalTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL,
     * MTLPixelFormatBGRA8Unorm, width, height, 0, &outTexture);
     * 
     * Mapping the luma plane of a 420v buffer:
     * CVMetalTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL,
     * MTLPixelFormatR8Unorm, width, height, 0, &outTexture);
     * 
     * Mapping the chroma plane of a 420v buffer as a source texture:
     * CVMetalTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL,
     * MTLPixelFormatRG8Unorm width/2, height/2, 1, &outTexture);
     * 
     * Mapping a yuvs buffer as a source texture (note: yuvs/f and 2vuy are unpacked and resampled -- not colorspace
     * converted)
     * CVMetalTextureCacheCreateTextureFromImage(kCFAllocatorDefault, textureCache, pixelBuffer, NULL,
     * MTLPixelFormatGBGR422, width, height, 1, &outTexture);
     * 
     * API-Since: 8.0
     * 
     * @param allocator         The CFAllocatorRef to use for allocating the CVMetalTexture object. May be NULL.
     * @param textureCache      The texture cache object that will manage the texture.
     * @param sourceImage       The CVImageBuffer that you want to create a CVMetalTexture from.
     * @param textureAttributes A CFDictionaryRef containing attributes to be used for creating the CVMetalTexture
     *                          objects. May be NULL.
     * @param pixelFormat       Specifies the Metal pixel format.
     * @param width             Specifies the width of the texture image.
     * @param height            Specifies the height of the texture image.
     * @param planeIndex        Specifies the plane of the CVImageBuffer to map bind. Ignored for non-planar
     *                          CVImageBuffers.
     * @param textureOut        The newly created texture object will be placed here.
     * @return Returns kCVReturnSuccess on success
     */
    @Generated
    @CFunction
    public static native int CVMetalTextureCacheCreateTextureFromImage(@Nullable CFAllocatorRef allocator,
            @NotNull CVMetalTextureCacheRef textureCache, @NotNull CVBufferRef sourceImage,
            @Nullable CFDictionaryRef textureAttributes, @NUInt long pixelFormat, @NUInt long width, @NUInt long height,
            @NUInt long planeIndex, @NotNull Ptr<CVBufferRef> textureOut);

    /**
     * [@function] CVMetalTextureCacheFlush
     * 
     * Performs internal housekeeping/recycling operations
     * 
     * This call must be made periodically to give the texture cache a chance to do internal housekeeping operations.
     * 
     * @param textureCache The texture cache object to flush
     * @param options      Currently unused, set to 0.
     * 
     *                     API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void CVMetalTextureCacheFlush(@NotNull CVMetalTextureCacheRef textureCache, long options);

    @Generated
    @CVariable()
    @ByValue
    public static native CVTime kCVZeroTime();

    @Generated
    @CVariable()
    @ByValue
    public static native CVTime kCVIndefiniteTime();

    /**
     * The following two keys are useful with the CoreVideo pool and texture cache APIs so that you can specify
     * an initial set of default buffer attachments to automatically be attached to the buffer when it is created.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVBufferPropagatedAttachmentsKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVBufferNonPropagatedAttachmentsKey();

    /**
     * Generally only available for frames emitted by QuickTime; CFDictionary containing these two keys:
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVBufferMovieTimeKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVBufferTimeValueKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVBufferTimeScaleKey();

    /**
     * CGColorSpaceRef
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCGColorSpaceKey();

    /**
     * CFDictionary containing the following four keys
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCleanApertureKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCleanApertureWidthKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCleanApertureHeightKey();

    /**
     * CFNumber, horizontal offset from center of image buffer
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCleanApertureHorizontalOffsetKey();

    /**
     * CFNumber, vertical offset from center of image buffer
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferCleanApertureVerticalOffsetKey();

    /**
     * CFDictionary containing same keys as kCVImageBufferCleanApertureKey
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferPreferredCleanApertureKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldCountKey();

    /**
     * CFString with one of the following four values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldDetailKey();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldDetailTemporalTopFirst();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldDetailTemporalBottomFirst();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldDetailSpatialFirstLineEarly();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferFieldDetailSpatialFirstLineLate();

    /**
     * CFDictionary with the following two keys
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferPixelAspectRatioKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferPixelAspectRatioHorizontalSpacingKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferPixelAspectRatioVerticalSpacingKey();

    /**
     * CFDictionary with the following two keys
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferDisplayDimensionsKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferDisplayWidthKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferDisplayHeightKey();

    /**
     * CFNumber describing the gamma level, used in absence of (or ignorance of) kCVImageBufferTransferFunctionKey
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferGammaLevelKey();

    /**
     * CFData representation of the ICC profile
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferICCProfileKey();

    /**
     * CFString describing the color matrix for YCbCr->RGB. This key can be one of the following values:
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrixKey();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_709_2();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_601_4();

    /**
     * CFString
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_SMPTE_240M_1995();

    /**
     * CFString
     * 
     * API-Since: 9.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: kCVImageBufferYCbCrMatrix_DCI_P3 no longer supported.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_DCI_P3();

    /**
     * CFString
     * 
     * API-Since: 9.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: kCVImageBufferYCbCrMatrix_P3_D65 no longer supported.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_P3_D65();

    /**
     * CFString
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferYCbCrMatrix_ITU_R_2020();

    /**
     * CFString describing the color primaries. This key can be one of the following values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimariesKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_ITU_R_709_2();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_EBU_3213();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_SMPTE_C();

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_P22();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_DCI_P3();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_P3_D65();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferColorPrimaries_ITU_R_2020();

    /**
     * CFString describing the transfer function. This key can be one of the following values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunctionKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_ITU_R_709_2();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_SMPTE_240M_1995();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_UseGamma();

    /**
     * note: kCVImageBufferTransferFunction_ITU_R_709_2 is equivalent, and preferred
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_ITU_R_2020();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_SMPTE_ST_428_1();

    /**
     * CFString with one of the following CFString values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocationTopFieldKey();

    /**
     * CFString with one of the following CFString values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocationBottomFieldKey();

    /**
     * Chroma sample is horizontally co-sited with the left column of luma samples, but centered vertically.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_Left();

    /**
     * Chroma sample is fully centered
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_Center();

    /**
     * Chroma sample is co-sited with the top-left luma sample.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_TopLeft();

    /**
     * Chroma sample is horizontally centered, but co-sited with the top row of luma samples.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_Top();

    /**
     * Chroma sample is co-sited with the bottom-left luma sample.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_BottomLeft();

    /**
     * Chroma sample is horizontally centered, but co-sited with the bottom row of luma samples.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_Bottom();

    /**
     * Cr and Cb samples are alternately co-sited with the left luma samples of the same field.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaLocation_DV420();

    /**
     * CFString/CFNumber with one of the following values
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaSubsamplingKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaSubsampling_420();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaSubsampling_422();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferChromaSubsampling_411();

    /**
     * Can be set to kCFBooleanTrue as a hint that the alpha channel is fully opaque. Not used if the pixel format type
     * has no alpha channel.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferAlphaChannelIsOpaque();

    /**
     * A single CFNumber or a CFArray of CFNumbers (OSTypes)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPixelFormatTypeKey();

    /**
     * CFAllocatorRef
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferMemoryAllocatorKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferWidthKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferHeightKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferExtendedPixelsLeftKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferExtendedPixelsTopKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferExtendedPixelsRightKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferExtendedPixelsBottomKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferBytesPerRowAlignmentKey();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferCGBitmapContextCompatibilityKey();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferCGImageCompatibilityKey();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferOpenGLCompatibilityKey();

    /**
     * CFNumber
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPlaneAlignmentKey();

    /**
     * CFDictionary; presence requests buffer allocation via IOSurface
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferIOSurfacePropertiesKey();

    /**
     * CFBoolean
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferOpenGLESCompatibilityKey();

    /**
     * CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferMetalCompatibilityKey();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferOpenGLESTextureCacheCompatibilityKey();

    /**
     * By default, buffers will age out after one second. If required, setting an age of zero will disable
     * the age-out mechanism completely.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPoolMinimumBufferCountKey();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPoolMaximumBufferAgeKey();

    /**
     * CFNumberRef -- for use only in auxAttributes
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPoolAllocationThresholdKey();

    /**
     * kCVPixelBufferPoolFreeBufferNotification is posted if a buffer becomes available after
     * CVPixelBufferPoolCreatePixelBufferWithAuxAttributes has failed due to kCVPixelBufferPoolAllocationThresholdKey.
     * This notification will not be posted by the pool if kCVPixelBufferPoolAllocationThresholdKey
     * has never been passed to CVPixelBufferPoolCreatePixelBufferWithAuxAttributes.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferPoolFreeBufferNotification();

    /**
     * cacheAttributes
     * 
     * By default, textures will age out after one second. Setting a maximum
     * texture age of zero will disable the age-out mechanism completely.
     * CVOpenGLESTextureCacheFlush() can be used to force eviction in either case.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL/OpenGLES is no longer supported. Use Metal APIs instead. (Define
     * COREVIDEO_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCVOpenGLESTextureCacheMaximumTextureAgeKey();

    /**
     * The canonical name for the format. This should bethe same as the codec name you'd use in QT
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatName();

    /**
     * QuickTime/QuickDraw Pixel Format Type constant (OSType)
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatConstant();

    /**
     * This is the codec type constant, i.e. '2vuy' or k422YpCbCr8CodecType
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatCodecType();

    /**
     * This is the equivalent Microsoft FourCC code for this pixel format
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatFourCC();

    /**
     * kCFBooleanTrue indicates that the format contains alpha and some images may be considered transparent;
     * kCFBooleanFalse indicates that there is no alpha and images are always opaque.
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatContainsAlpha();

    /**
     * kCFBooleanTrue indicates that the format contains YCbCr data;
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatContainsYCbCr();

    /**
     * kCFBooleanTrue indicates that the format contains RGB data;
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatContainsRGB();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatComponentRange();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatComponentRange_VideoRange();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatComponentRange_FullRange();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatComponentRange_WideRange();

    /**
     * All buffers have one or more image planes. Each plane may contain a single or an interleaved set of components
     * For simplicity sake, pixel formats that are not planar may place the required format keys at the top
     * level dictionary.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatPlanes();

    /**
     * Used to assist with allocating memory for pixel formats that don't have an integer value for
     * bytes per pixel
     * Block width is essentially the width in pixels of the smallest "byte addressable" group of pixels
     * This works in close conjunction with BitsPerBlock
     * Examples:
     * 8-bit luminance only, BlockWidth would be 1, BitsPerBlock would be 8
     * 16-bit 1555 RGB, BlockWidth would be 1, BitsPerBlock would be 16
     * 32-bit 8888 ARGB, BlockWidth would be 1, BitsPerBlock would be 32
     * 2vuy (CbYCrY), BlockWidth would be 2, BitsPerBlock would be 32
     * 1-bit bitmap, BlockWidth would be 8, BitsPerBlock would be 8
     * v210, BlockWidth would be 6, BitsPerBlock would be 128
     * Values assumed to 1 be one if not present
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBlockWidth();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBlockHeight();

    /**
     * This value must be present. For simple pixel formats this will be equivalent to the traditional
     * bitsPerPixel value.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBitsPerBlock();

    /**
     * Used to state requirements on block multiples. v210 would be '8' here for the horizontal case,
     * to match the standard v210 row alignment value of 48.
     * These may be assumed as 1 if not present.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBlockHorizontalAlignment();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBlockVerticalAlignment();

    /**
     * CFData containing the bit pattern for a block of black pixels. If absent, black is assumed to be all zeros.
     * If present, this should be bitsPerPixel bits long -- if bitsPerPixel is less than a byte, repeat the bit pattern
     * for the full byte.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatBlackBlock();

    /**
     * Subsampling information for this plane. Assumed to be '1' if not present.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatHorizontalSubsampling();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatVerticalSubsampling();

    /**
     * If present, these two keys describe the OpenGL format and type enums you would use to describe this
     * image plane to OpenGL
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatOpenGLFormat();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatOpenGLType();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatOpenGLInternalFormat();

    /**
     * CGBitmapInfo value, if required
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatCGBitmapInfo();

    /**
     * Pixel format compatibility flags
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatQDCompatibility();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatCGBitmapContextCompatibility();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatCGImageCompatibility();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatOpenGLCompatibility();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatOpenGLESCompatibility();

    /**
     * The value for this key is a CFData containing a CVFillExtendedPixelsCallBackData struct
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatFillExtendedPixelsCallback();

    /**
     * cacheAttributes
     * 
     * By default, textures will age out after one second. Setting a maximum
     * texture age of zero will disable the age-out mechanism completely.
     * CVMetalTextureCacheFlush() can be used to force eviction in either case.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVMetalTextureCacheMaximumTextureAgeKey();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CVPixelBufferCreateWithBytes {
        @Generated
        void call_CVPixelBufferCreateWithBytes(@Nullable VoidPtr arg0, @Nullable ConstVoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CVPixelBufferCreateWithPlanarBytes {
        @Generated
        void call_CVPixelBufferCreateWithPlanarBytes(@Nullable VoidPtr arg0, @Nullable ConstVoidPtr arg1,
                @NUInt long arg2, @NUInt long arg3,
                @Nullable @ReferenceInfo(type = Void.class, depth = 2) Ptr<ConstVoidPtr> arg4);
    }

    /**
     * Returns the standard integer code point corresponding to a given CoreVideo YCbCrMatrix constant string (in the
     * kCVImageBufferYCbCrMatrix_... family). Returns 2 (the code point for "unknown") if the string is NULL or not
     * recognized.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CVYCbCrMatrixGetIntegerCodePointForString(@Nullable CFStringRef yCbCrMatrixString);

    /**
     * Returns the standard integer code point corresponding to a given CoreVideo ColorPrimaries constant string (in the
     * kCVImageBufferColorPrimaries_... family). Returns 2 (the code point for "unknown") if the string is NULL or not
     * recognized.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CVColorPrimariesGetIntegerCodePointForString(@Nullable CFStringRef colorPrimariesString);

    /**
     * Returns the standard integer code point corresponding to a given CoreVideo TransferFunction constant string (in
     * the kCVImageBufferTransferFunction_... family). Returns 2 (the code point for "unknown") if the string is NULL or
     * not recognized.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CVTransferFunctionGetIntegerCodePointForString(
            @Nullable CFStringRef transferFunctionString);

    /**
     * Returns the CoreVideo YCbCrMatrix constant string (in the kCVImageBufferYCbCrMatrix_... family) corresponding to
     * a given standard integer code point. Returns NULL if the code point is not recognized, or if it is 2 (the code
     * point for "unknown").
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CVYCbCrMatrixGetStringForIntegerCodePoint(int yCbCrMatrixCodePoint);

    /**
     * Returns the CoreVideo ColorPrimaries constant string (in the kCVImageBufferColorPrimaries_... family)
     * corresponding to a given standard integer code point. Returns NULL if the code point is not recognized, or if it
     * is 2 (the code point for "unknown").
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CVColorPrimariesGetStringForIntegerCodePoint(int colorPrimariesCodePoint);

    /**
     * Returns the CoreVideo TransferFunction constant string (in the kCVImageBufferTransferFunction_... family)
     * corresponding to a given standard integer code point. Returns NULL if the code point is not recognized, or if it
     * is 2 (the code point for "unknown").
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CVTransferFunctionGetStringForIntegerCodePoint(int transferFunctionCodePoint);

    /**
     * [@function] CVImageBufferCreateColorSpaceFromAttachments
     * 
     * Attempts to synthesize a CGColorSpace from an image buffer's attachments.
     * 
     * To generate a CGColorSpace, the attachments dictionary should include values for either:
     * 1. kCVImageBufferICCProfile
     * 2. kCVImageBufferColorPrimariesKey, kCVImageBufferTransferFunctionKey, and kCVImageBufferYCbCrMatrixKey (and
     * possibly kCVImageBufferGammaLevelKey)
     * The client is responsible for releasing the CGColorSpaceRef when it is done with it (CGColorSpaceRelease() or
     * CFRelease())
     * 
     * 
     * API-Since: 10.0
     * 
     * @param attachments A CFDictionary of attachments for an image buffer, obtained using CVBufferCopyAttachments().
     * @return A CGColorSpaceRef representing the color space of the buffer.
     *         Returns NULL if the attachments dictionary does not contain the information required to synthesize a
     *         CGColorSpace.
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CVImageBufferCreateColorSpaceFromAttachments(
            @NotNull CFDictionaryRef attachments);

    /**
     * [@function] CVPixelBufferGetIOSurface
     * 
     * Returns the IOSurface backing the pixel buffer, or NULL if it is not backed by an IOSurface.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * 
     *                    API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native IOSurfaceRef CVPixelBufferGetIOSurface(@Nullable CVBufferRef pixelBuffer);

    /**
     * [@function] CVPixelBufferCreateWithIOSurface
     * 
     * Call to create a single CVPixelBuffer for a passed-in IOSurface.
     * 
     * The CVPixelBuffer will retain the IOSurface.
     * IMPORTANT NOTE: If you are using IOSurface to share CVPixelBuffers between processes
     * and those CVPixelBuffers are allocated via a CVPixelBufferPool, it is important
     * that the CVPixelBufferPool does not reuse CVPixelBuffers whose IOSurfaces are still
     * in use in other processes.
     * CoreVideo and IOSurface will take care of this for if you use IOSurfaceCreateMachPort
     * and IOSurfaceLookupFromMachPort, but NOT if you pass IOSurfaceIDs.
     * 
     * @param surface               The IOSurface to wrap.
     * @param pixelBufferAttributes A dictionary with additional attributes for a a pixel buffer. This parameter is
     *                              optional. See PixelBufferAttributes for more details.
     * @param pixelBufferOut        The new pixel buffer will be returned here
     * @return returns kCVReturnSuccess on success.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CVPixelBufferCreateWithIOSurface(@Nullable CFAllocatorRef allocator,
            @NotNull IOSurfaceRef surface, @Nullable CFDictionaryRef pixelBufferAttributes,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * IEC 61966-2-1 sRGB or sYCC
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_sRGB();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_SMPTE_ST_2084_PQ();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_ITU_R_2100_HLG();

    /**
     * CFData (24 bytes) containing big-endian data matching payload of ISO/IEC 23008-2:2015(E), D.2.28 Mastering
     * display colour volume SEI message
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferMasteringDisplayColorVolumeKey();

    /**
     * CFData (4 bytes) containing big-endian data matching payload of Content Light Level Information SEI message
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferContentLightLevelInfoKey();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferIOSurfaceCoreAnimationCompatibilityKey();

    /**
     * CFBoolean
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferIOSurfaceOpenGLESTextureCompatibilityKey();

    /**
     * CFBoolean
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferIOSurfaceOpenGLESFBOCompatibilityKey();

    /**
     * kCVMetalTextureUsage is a property that can be placed on a CVMetalTextureCache to instruct the MTLTextureUsage of
     * the created MTLTexture. Values for this can can be read from MTLTexture.h
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVMetalTextureUsage();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferTransferFunction_Linear();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferAlphaChannelModeKey();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferAlphaChannelMode_StraightAlpha();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferAlphaChannelMode_PremultipliedAlpha();

    /**
     * kCFBooleanTrue indicates that the format contains Grayscale data;
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatContainsGrayscale();

    /**
     * kCVMetalTextureStorageMode is a property that can be placed on a CVMetalTextureCache to instruct the
     * MTLTextureStorageMode of the created MTLTexture. Values for this can can be read from MTLTexture.h
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVMetalTextureStorageMode();

    /**
     * [@const] kCVPixelBufferVersatileBayerKey_BayerPattern
     * 
     * Buffer attachment key for code indicating Bayer pattern (sensel arrangement).
     * 
     * Associated attachment is a CFNumber of type kCFNumberSInt32Type. The value follows the semantics of the ProRes
     * RAW bayer_pattern bitstream syntax element, namely 0, 1, 2, or 3, where 0 means the top-left sensel of the frame
     * is red-filtered ("RGGB"); 1 means the top-left sensel of the frame is green-filtered, with the top row
     * alternating between green- and red-filtered sensels ("GRBG"); 2 means the top-left sensel of the frame is green-
     * filtered, with the top row alternating between green- and blue-filtered sensels ("GBRG"); and 3 means the
     * top-left sensel of the frame is blue-filtered ("BGGR"). This attachment applies only to buffers with
     * VersatileBayer formats.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferVersatileBayerKey_BayerPattern();

    /**
     * [@const] kCVPixelBufferProResRAWKey_SenselSitingOffsets
     * 
     * Buffer attachment key for siting offsets, relative to pixel center, of individual sensels/components constituting
     * each pixel.
     * 
     * Associated attachment is CFData containing an array of 8 32-bit floats. The eight CFData array elements specify,
     * in order, the following sensel/component offsets from pixel center: red horizontal offset, red vertical offset,
     * green horizontal offset, green vertical offset, blue horizontal offset, blue vertical offset, alpha horizontal
     * offset, and alpha vertical offset. A positive offset value indicates that the sensel/component lies to the right
     * of or below the center of its pixel, while a negative value indicates that the sensel/component lies to the left
     * of or above the center of its pixel. Horizontal and vertical offset magnitudes are respectively in terms of the
     * spacing between horizontally- and vertically-adjacent pixel centers. This attachment applies only to buffers with
     * the bp64 format, and is optional for those buffers; if not present, all offsets are considered to be 0.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_SenselSitingOffsets();

    /**
     * [@const] kCVPixelBufferProResRAWKey_BlackLevel
     * 
     * Buffer attachment key for sensel black level.
     * 
     * Associated attachment is a CFNumber of type kCFNumberSInt32Type. The value is the sensel level corresponding to
     * no light exposure. This attachment is required for buffers with either the bp16 or bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_BlackLevel();

    /**
     * [@const] kCVPixelBufferProResRAWKey_WhiteLevel
     * 
     * Buffer attachment key for sensel white level.
     * 
     * Associated attachment is a CFNumber of type kCFNumberSInt32Type. The value is the sensel level corresponding to
     * sensor (or camera A-to-D converter) saturation. This attachment is required for buffers with either the bp16 or
     * bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_WhiteLevel();

    /**
     * [@const] kCVPixelBufferProResRAWKey_WhiteBalanceCCT
     * 
     * Buffer attachment key for illuminant correlated color temperature.
     * 
     * Associated attachment is a CFNumber of type kCFNumberSInt32Type. The value is the illuminant correlated color
     * temperature (CCT), in kelvins, selected at the time of capture. May be 0, indicating that the CCT is unknown or
     * unspecified. This attachment is optional for buffers with either the bp16 or bp64 format; if not present, the CCT
     * is considered unknown or unspecified.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_WhiteBalanceCCT();

    /**
     * [@const] kCVPixelBufferProResRAWKey_WhiteBalanceRedFactor
     * 
     * Buffer attachment key for white balance red factor.
     * 
     * Associated attachment is a CFNumber of type kCFNumberFloat32Type. The value is the white balance multiplication
     * factor for red-filtered sensels. This attachment is required for buffers with either the bp16 or bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_WhiteBalanceRedFactor();

    /**
     * [@const] kCVPixelBufferProResRAWKey_WhiteBalanceBlueFactor
     * 
     * Buffer attachment key for white balance blue factor.
     * 
     * Associated attachment is a CFNumber of type kCFNumberFloat32Type. The value is the white balance multiplication
     * factor for blue-filtered sensels. This attachment is required for buffers with either the bp16 or bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_WhiteBalanceBlueFactor();

    /**
     * [@const] kCVPixelBufferProResRAWKey_ColorMatrix
     * 
     * Buffer attachment key for color translation matrix.
     * 
     * Associated attachment is CFData containing an array of 9 32-bit floats. The value is a 3x3 matrix which
     * transforms linear RGB pixel values in the camera native color space to CIE 1931 XYZ values relative to the D65
     * illuminant, where the matrix entries are stored in the CFData in row-major order. This attachment is required for
     * buffers with either the bp16 or bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_ColorMatrix();

    /**
     * [@const] kCVPixelBufferProResRAWKey_GainFactor
     * 
     * Buffer attachment key for gain factor.
     * 
     * Associated attachment is a CFNumber of type kCFNumberFloat32Type. The value is the overall gain factor for raw
     * conversion. This attachment is required for buffers with either the bp16 or bp64 format.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_GainFactor();

    /**
     * [@const] kCVPixelBufferProResRAWKey_RecommendedCrop
     * 
     * Buffer attachment key for recommended number of pixels/rows to discard from the sides of the image after raw
     * conversion.
     * 
     * Associated attachment is CFData containing an array of 4 32-bit floats. The four CFData array elements specify,
     * in order, the recommended number of: pixels to discard from the start (left) of each row of the image; pixels to
     * discard from the end (right) of each row of the image; rows of pixels to discard from the top of the image; and
     * rows of pixels to discard from the bottom of the image. (Pixels/rows are discarded after raw conversion.) This
     * attachment is optional for buffers with either the bp16 or bp64 format; if not present, the recommended crop
     * values are considered to be 0. For buffers with the bp64 format, the values may be nonintegral due to
     * downscaling, in which case the handling of fractional parts is implementation-dependent.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_RecommendedCrop();

    /**
     * [@function] CVBufferCopyAttachments
     * 
     * Returns a copy of all attachments of a CVBuffer object. It is the caller’s responsibility to release the returned
     * dictionary.
     * 
     * CVBufferCopyAttachments is a convenience call that returns a copy of all attachments with their corresponding
     * keys in a CFDictionary.
     * 
     * @param buffer Target CVBuffer object.
     * @return A CFDictionary with all buffer attachments identified by their keys. If no attachment is present or
     *         invalid attachment mode, returns NULL
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CVBufferCopyAttachments(@NotNull CVBufferRef buffer, int attachmentMode);

    /**
     * [@function] CVBufferCopyAttachment
     * 
     * Returns a retained specific attachment of a CVBuffer object. It is the caller’s responsibility to release the
     * returned value.
     * 
     * You can attach any CF object to a CVBuffer object to store additional information. CVBufferCopyAttachment
     * retrieves a retained attachment identified by a key.
     * 
     * @param buffer          Target CVBuffer object.
     * @param key             Key in form of a CFString identifying the desired attachment.
     * @param attachmentMode. Returns the mode of the attachment, if desired. May be NULL.
     * @return If found the attachment object, return the value; otherwize, return NULL.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CVBufferCopyAttachment(@NotNull CVBufferRef buffer, @NotNull CFStringRef key,
            @Nullable IntPtr attachmentMode);

    /**
     * [@function] CVBufferHasAttachment
     * 
     * Returns true if an attachment with the passed key is present on a CVBuffer object.
     * 
     * @param buffer Target CVBuffer object.
     * @param key    Key in form of a CFString identifying the desired attachment.
     * @return True if an attachment with this key is present, otherwise false.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native byte CVBufferHasAttachment(@NotNull CVBufferRef buffer, @NotNull CFStringRef key);

    /**
     * [@function] CVPixelBufferCopyCreationAttributes
     * 
     * Returns a copy of pixelBufferAttributes dictionary used to create the PixelBuffer.
     * 
     * Can be used to create similar pixelbuffers.
     * 
     * @param pixelBuffer Target PixelBuffer.
     * 
     *                    API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFDictionaryRef CVPixelBufferCopyCreationAttributes(@NotNull CVBufferRef pixelBuffer);

    /**
     * [@function] CVIsCompressedPixelFormatAvailable
     * 
     * Checks if a compressed pixel format is supported on the current platform.
     * 
     * @param pixelFormatType compressed pixel format.
     * @return True if pixel format is supported on the current platform.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native byte CVIsCompressedPixelFormatAvailable(int pixelFormatType);

    /**
     * CFData (8 bytes) containing big-endian data matching payload of Ambient Viewing Environment SEI message
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferAmbientViewingEnvironmentKey();

    /**
     * [@constant] kCVImageBufferRegionOfInterestKey
     * 
     * Specifies region of interest that image statistics cover. This value should be a CGRect dictionary created by
     * CGRectCreateDictionaryRepresentation(). The origin in the CGRect represents the x,y coordinate within the
     * CVPixelBuffer where region of interest is located.
     * 
     * 
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVImageBufferRegionOfInterestKey();

    /**
     * [@const] kCVPixelBufferProResRAWKey_MetadataExtension
     * 
     * Buffer attachment key for metadata extension.
     * 
     * Associated attachment is CFData containing ProRes RAW metadata extension. This attachment is optional for buffers
     * with either bp16 or bp64. The CFData contains a big-endian uint32 representing the size of the item in bytes
     * followed by a 4-character code ('psim') followed by a variable-length pascal string identifying the metadata
     * (like a key string) followed by the metadata payload.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelBufferProResRAWKey_MetadataExtension();

    /**
     * kCFBooleanTrue indicates that the format contains sensel data, as in Bayer RAW buffers;
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCVPixelFormatContainsSenselArray();

    @Generated public static final double __COREVIDEO_CVRETURN_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVBASE_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVBUFFER_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVPIXELBUFFER_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVIMAGEBUFFER_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVPIXELBUFFERIOSURFACE_H__ = 1.0;
    @Generated public static final double COREVIDEO_INCLUDED_IOSURFACE_HEADER_FILE = 1.0;
    @Generated public static final double __COREVIDEO__CVPIXELBUFFERPOOL_H__ = 1.0;
    @Generated public static final double __COREVIDEO_CVOPENGLESTEXTURE_H__ = 1.0;
    @Generated public static final double __COREVIDEO__CVOPENGLESTEXTURECACHE_H__ = 1.0;
    @Generated public static final double COREVIDEO_USE_EAGLCONTEXT_CLASS_IN_API = 1.0;
    @Generated public static final double __COREVIDEO_CVMETALTEXTURE_H__ = 1.0;
    @Generated public static final double __COREVIDEO__CVMETALTEXTURECACHE_H__ = 1.0;
}

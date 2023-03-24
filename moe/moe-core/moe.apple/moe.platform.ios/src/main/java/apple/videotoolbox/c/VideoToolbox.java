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

package apple.videotoolbox.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.corevideo.opaque.CVBufferRef;
import apple.corevideo.opaque.CVPixelBufferPoolRef;
import apple.videotoolbox.opaque.VTCompressionSessionRef;
import apple.videotoolbox.opaque.VTDecompressionSessionRef;
import apple.videotoolbox.opaque.VTFrameSiloRef;
import apple.videotoolbox.opaque.VTMultiPassStorageRef;
import apple.videotoolbox.struct.VTDecompressionOutputCallbackRecord;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;
import apple.videotoolbox.opaque.VTPixelRotationSessionRef;
import apple.videotoolbox.opaque.VTPixelTransferSessionRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("VideoToolbox")
@Runtime(CRuntime.class)
public final class VideoToolbox {
    static {
        NatJ.register();
    }

    @Generated
    private VideoToolbox() {
    }

    /**
     * [@function] VTSessionCopySupportedPropertyDictionary
     * 
     * Returns a dictionary enumerating all the supported properties of a video toolbox session.
     * 
     * The keys of the returned dictionary are the supported property keys.
     * The values are themselves dictionaries, each containing the following optional fields:
     * <OL>
     * <LI> the type of value, (kVTPropertyTypeKey)
     * <LI> the read/write status of the property (kVTPropertyReadWriteStatusKey),
     * <LI> whether the property is suitable for serialization (kVTPropertyShouldBeSerializedKey),
     * <LI> a range or list of the supported values, if appropriate, and
     * <LI> developer-level documentation for the property (kVTPropertyDocumentationKey).
     * </OL>
     * The caller must release the returned dictionary.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTSessionCopySupportedPropertyDictionary(@NotNull ConstVoidPtr session,
            @NotNull Ptr<CFDictionaryRef> supportedPropertyDictionaryOut);

    /**
     * [@function] VTSessionSetProperty
     * 
     * Sets a property on a video toolbox session.
     * 
     * Setting a property value to NULL restores the default value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTSessionSetProperty(@NotNull ConstVoidPtr session, @NotNull CFStringRef propertyKey,
            @Nullable ConstVoidPtr propertyValue);

    /**
     * [@function] VTSessionCopyProperty
     * 
     * Retrieves a property on a video toolbox session.
     * 
     * The caller must release the retrieved property value.
     * <BR>
     * Note: for most types of property, the returned values should be considered immutable.
     * In particular, for CFPropertyList types, sharing of mutable property value
     * objects between the client, session and codec should be avoided.
     * However, some properties will be used for exchanging service objects that are inherently
     * mutable (eg, CVPixelBufferPool).
     * 
     * @param propertyKey
     *                         The key for the property to retrieve.
     * @param allocator
     *                         An allocator suitable for use when copying property values.
     * @param propertyValueOut
     *                         Points to a variable to receive the property value, which must be a CF-registered type --
     *                         the caller may call CFGetTypeID() on it to identify which specific type.
     *                         The caller must release the this property value.
     * @return
     *         noErr if successful; kVTPropertyNotSupportedErr for unrecognized or unsupported properties.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTSessionCopyProperty(@NotNull ConstVoidPtr session, @NotNull CFStringRef propertyKey,
            @Nullable CFAllocatorRef allocator, @Nullable VoidPtr propertyValueOut);

    /**
     * [@function] VTSessionSetProperties
     * 
     * Sets multiple properties at once.
     * 
     * Sets the properties specified by keys in propertyDictionary to the corresponding values.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTSessionSetProperties(@NotNull ConstVoidPtr session,
            @NotNull CFDictionaryRef propertyDictionary);

    /**
     * [@function] VTSessionCopySerializableProperties
     * 
     * Retrieves the set of serializable property keys and their current values.
     * 
     * The serializable properties are those which can be saved and applied to a different session.
     * The caller must release the returned dictionary.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTSessionCopySerializableProperties(@NotNull ConstVoidPtr session,
            @Nullable CFAllocatorRef allocator, @NotNull Ptr<CFDictionaryRef> dictionaryOut);

    /**
     * [@function] VTCompressionSessionCreate
     * 
     * Creates a session for compressing video frames.
     * 
     * Compressed frames will be emitted through calls to outputCallback.
     * 
     * @param allocator
     *                                    An allocator for the session. Pass NULL to use the default allocator.
     * @param width
     *                                    The width of frames, in pixels.
     *                                    If the video encoder cannot support the provided width and height it may
     *                                    change them.
     * @param height
     *                                    The height of frames in pixels.
     * @param codecType
     *                                    The codec type.
     * @param encoderSpecification
     *                                    Specifies a particular video encoder that must be used.
     *                                    Pass NULL to let the video toolbox choose a encoder.
     * @param sourceImageBufferAttributes
     *                                    Required attributes for source pixel buffers, used when creating a pixel
     *                                    buffer pool
     *                                    for source frames. If you do not want the Video Toolbox to create one for you,
     *                                    pass NULL.
     *                                    (Using pixel buffers not allocated by the Video Toolbox may increase the
     *                                    chance that
     *                                    it will be necessary to copy image data.)
     * @param compressedDataAllocator
     *                                    An allocator for the compressed data. Pass NULL to use the default allocator.
     *                                    Note: on MacOS 10.12 and later, using a compressedDataAllocator may trigger an
     *                                    extra buffer copy.
     * @param outputCallback
     *                                    The callback to be called with compressed frames.
     *                                    This function may be called asynchronously, on a different thread from the one
     *                                    that calls VTCompressionSessionEncodeFrame.
     *                                    Pass NULL if and only if you will be calling
     *                                    VTCompressionSessionEncodeFrameWithOutputHandler for encoding frames.
     * @param outputCallbackRefCon
     *                                    Client-defined reference value for the output callback.
     * @param compressionSessionOut
     *                                    Points to a variable to receive the new compression session.
     * 
     * 
     *                                    API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionCreate(@Nullable CFAllocatorRef allocator, int width, int height,
            int codecType, @Nullable CFDictionaryRef encoderSpecification,
            @Nullable CFDictionaryRef sourceImageBufferAttributes, @Nullable CFAllocatorRef compressedDataAllocator,
            @Nullable @FunctionPtr(name = "call_VTCompressionSessionCreate") Function_VTCompressionSessionCreate outputCallback,
            @Nullable VoidPtr outputCallbackRefCon, @NotNull Ptr<VTCompressionSessionRef> compressionSessionOut);

    /**
     * [@function] VTCompressionSessionInvalidate
     * 
     * Tears down a compression session.
     * 
     * When you are done with a compression session you created, call VTCompressionSessionInvalidate
     * to tear it down and then CFRelease to release your object reference.
     * When a compression session's retain count reaches zero, it is automatically invalidated, but
     * since sessions may be retained by multiple parties, it can be hard to predict when this will happen.
     * Calling VTCompressionSessionInvalidate ensures a deterministic, orderly teardown.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void VTCompressionSessionInvalidate(@NotNull VTCompressionSessionRef session);

    /**
     * [@function] VTCompressionSessionGetTypeID
     * 
     * Returns the CFTypeID for compression sessions.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTCompressionSessionGetTypeID();

    /**
     * [@function] VTCompressionSessionGetPixelBufferPool
     * 
     * Returns a pool that can provide ideal source pixel buffers for a compression session.
     * 
     * The compression session creates this pixel buffer pool based on
     * the compressor's pixel buffer attributes and any pixel buffer
     * attributes passed in to VTCompressionSessionCreate. If the
     * source pixel buffer attributes and the compressor pixel buffer
     * attributes cannot be reconciled, the pool is based on the source
     * pixel buffer attributes and the Video Toolbox converts each CVImageBuffer
     * internally.
     * <BR>
     * While clients can call VTCompressionSessionGetPixelBufferPool once
     * and retain the resulting pool, the call is cheap enough that it's OK
     * to call it once per frame. If a change of session properties causes
     * the compressor's pixel buffer attributes to change, it's possible that
     * VTCompressionSessionGetPixelBufferPool might return a different pool.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CVPixelBufferPoolRef VTCompressionSessionGetPixelBufferPool(
            @NotNull VTCompressionSessionRef session);

    /**
     * [@function] VTCompressionSessionPrepareToEncodeFrames
     * 
     * You can optionally call this function to provide the encoder with an opportunity to perform
     * any necessary resource allocation before it begins encoding frames.
     * 
     * This optional call can be used to provide the encoder an opportunity to allocate
     * any resources necessary before it begins encoding frames. If this isn't called, any
     * necessary resources will be allocated on the first VTCompressionSessionEncodeFrame call.
     * Extra calls to this function will have no effect.
     * 
     * @param session
     *                The compression session.
     * 
     *                API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionPrepareToEncodeFrames(@NotNull VTCompressionSessionRef session);

    /**
     * [@function] VTCompressionSessionEncodeFrame
     * 
     * Call this function to present frames to the compression session.
     * Encoded frames may or may not be output before the function returns.
     * 
     * The client should not modify the pixel data after making this call.
     * The session and/or encoder will retain the image buffer as long as necessary.
     * 
     * @param session
     *                              The compression session.
     * @param imageBuffer
     *                              A CVImageBuffer containing a video frame to be compressed.
     *                              Must have a nonzero reference count.
     * @param presentationTimeStamp
     *                              The presentation timestamp for this frame, to be attached to the sample buffer.
     *                              Each presentation timestamp passed to a session must be greater than the previous
     *                              one.
     * @param duration
     *                              The presentation duration for this frame, to be attached to the sample buffer.
     *                              If you do not have duration information, pass kCMTimeInvalid.
     * @param frameProperties
     *                              Contains key/value pairs specifying additional properties for encoding this frame.
     *                              Note that some session properties may also be changed between frames.
     *                              Such changes have effect on subsequently encoded frames.
     * @param sourceFrameRefcon
     *                              Your reference value for the frame, which will be passed to the output callback
     *                              function.
     * @param infoFlagsOut
     *                              Points to a VTEncodeInfoFlags to receive information about the encode operation.
     *                              The kVTEncodeInfo_Asynchronous bit may be set if the encode is (or was) running
     *                              asynchronously.
     *                              The kVTEncodeInfo_FrameDropped bit may be set if the frame was dropped
     *                              (synchronously).
     *                              Pass NULL if you do not want to receive this information.
     * 
     *                              API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionEncodeFrame(@NotNull VTCompressionSessionRef session,
            @NotNull CVBufferRef imageBuffer, @ByValue CMTime presentationTimeStamp, @ByValue CMTime duration,
            @Nullable CFDictionaryRef frameProperties, @Nullable VoidPtr sourceFrameRefcon,
            @Nullable IntPtr infoFlagsOut);

    /**
     * [@function] VTCompressionSessionEncodeFrameWithOutputHandler
     * 
     * Call this function to present frames to the compression session.
     * Encoded frames may or may not be output before the function returns.
     * 
     * The client should not modify the pixel data after making this call.
     * The session and/or encoder will retain the image buffer as long as necessary.
     * Cannot be called with a session created with a VTCompressionOutputCallback.
     * 
     * @param session
     *                              The compression session.
     * @param imageBuffer
     *                              A CVImageBuffer containing a video frame to be compressed.
     *                              Must have a nonzero reference count.
     * @param presentationTimeStamp
     *                              The presentation timestamp for this frame, to be attached to the sample buffer.
     *                              Each presentation timestamp passed to a session must be greater than the previous
     *                              one.
     * @param duration
     *                              The presentation duration for this frame, to be attached to the sample buffer.
     *                              If you do not have duration information, pass kCMTimeInvalid.
     * @param frameProperties
     *                              Contains key/value pairs specifying additional properties for encoding this frame.
     *                              Note that some session properties may also be changed between frames.
     *                              Such changes have effect on subsequently encoded frames.
     * @param infoFlagsOut
     *                              Points to a VTEncodeInfoFlags to receive information about the encode operation.
     *                              The kVTEncodeInfo_Asynchronous bit may be set if the encode is (or was) running
     *                              asynchronously.
     *                              The kVTEncodeInfo_FrameDropped bit may be set if the frame was dropped
     *                              (synchronously).
     *                              Pass NULL if you do not want to receive this information.
     * @param outputHandler
     *                              The block to be called when encoding the frame is completed.
     *                              This block may be called asynchronously, on a different thread from the one that
     *                              calls VTCompressionSessionEncodeFrameWithOutputHandler.
     * 
     *                              API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionEncodeFrameWithOutputHandler(@NotNull VTCompressionSessionRef session,
            @NotNull CVBufferRef imageBuffer, @ByValue CMTime presentationTimeStamp, @ByValue CMTime duration,
            @Nullable CFDictionaryRef frameProperties, @Nullable IntPtr infoFlagsOut,
            @NotNull @ObjCBlock(name = "call_VTCompressionSessionEncodeFrameWithOutputHandler") Block_VTCompressionSessionEncodeFrameWithOutputHandler outputHandler);

    /**
     * [@function] VTCompressionSessionCompleteFrames
     * 
     * Forces the compression session to complete encoding frames.
     * 
     * If completeUntilPresentationTimeStamp is numeric, frames with presentation timestamps
     * up to and including this timestamp will be emitted before the function returns.
     * If completeUntilPresentationTimeStamp is non-numeric, all pending frames
     * will be emitted before the function returns.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionCompleteFrames(@NotNull VTCompressionSessionRef session,
            @ByValue CMTime completeUntilPresentationTimeStamp);

    /**
     * [@function] VTCompressionSessionBeginPass
     * 
     * Call to announce the start of a specific compression pass.
     * 
     * During multi-pass encoding, this function must be called before VTCompressionSessionEncodeFrame.
     * It is an error to call this function when multi-pass encoding has not been enabled by setting
     * kVTCompressionPropertyKey_MultiPassStorage.
     * 
     * @param beginPassFlags
     *                       Pass kVTCompressionSessionBeginFinalPass to inform the encoder that the pass must be the
     *                       final pass.
     * 
     *                       API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionBeginPass(@NotNull VTCompressionSessionRef session, int beginPassFlags,
            @Nullable IntPtr reserved);

    /**
     * [@function] VTCompressionSessionEndPass
     * 
     * Call to announce the end of a pass.
     * 
     * VTCompressionSessionEndPass can take a long time, since the video encoder may perform significant processing
     * between passes.
     * VTCompressionSessionEndPass will indicate via the furtherPassesRequestedOut argument whether the video encoder
     * would like to perform another pass. There is no particular bound on the number of passes the video encoder may
     * request, but the client is free to disregard this request and use the last-emitted set of frames.
     * It is an error to call this function when multi-pass encoding has not been enabled by setting
     * kVTCompressionPropertyKey_MultiPassStorage.
     * 
     * @param furtherPassesRequestedOut
     *                                  Points to a Boolean that will be set to true if the video encoder would like to
     *                                  perform another pass, false otherwise.
     *                                  You may pass NULL to indicate that the client is certain to use this as the
     *                                  final pass, in which case the video encoder can skip that evaluation step.
     * 
     *                                  API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionEndPass(@NotNull VTCompressionSessionRef session,
            @Nullable BytePtr furtherPassesRequestedOut, @Nullable IntPtr reserved);

    /**
     * [@function] VTCompressionSessionGetTimeRangesForNextPass
     * 
     * Retrieves the time ranges for the next pass.
     * 
     * If VTCompressionSessionEndPass sets *furtherPassesRequestedOut to true, call
     * VTCompressionSessionGetTimeRangesForNextPass to find out the time ranges for the next pass. Source frames outside
     * these time ranges should be skipped.
     * Each time range is considered to include any frame at its start time and not to include any frame at its end
     * time.
     * It is an error to call this function when multi-pass encoding has not been enabled by setting
     * kVTCompressionPropertyKey_MultiPassStorage, or when VTCompressionSessionEndPass did not set
     * *furtherPassesRequestedOut to true.
     * 
     * @param timeRangeCountOut
     *                          Points to a CMItemCount to receive the number of CMTimeRanges.
     * @param timeRangeArrayOut
     *                          Points to a const CMTimeRange * to receive a pointer to a C array of CMTimeRanges.
     *                          The storage for this array belongs to the VTCompressionSession and should not be
     *                          modified.
     *                          The pointer will be valid until the next call to VTCompressionSessionEndPass, or until
     *                          the VTCompressionSession is invalidated or finalized.
     * 
     *                          API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCompressionSessionGetTimeRangesForNextPass(@NotNull VTCompressionSessionRef session,
            @NotNull NIntPtr timeRangeCountOut, @NotNull Ptr<ConstPtr<CMTimeRange>> timeRangeArrayOut);

    /**
     * [@function] VTDecompressionSessionCreate
     * 
     * Creates a session for decompressing video frames.
     * 
     * Decompressed frames will be emitted through calls to outputCallback.
     * 
     * @param allocator
     *                                         An allocator for the session. Pass NULL to use the default allocator.
     * @param videoFormatDescription
     *                                         Describes the source video frames.
     * @param videoDecoderSpecification
     *                                         Specifies a particular video decoder that must be used.
     *                                         Pass NULL to let the video toolbox choose a decoder.
     * @param destinationImageBufferAttributes
     *                                         Describes requirements for emitted pixel buffers.
     *                                         Pass NULL to set no requirements.
     * @param outputCallback
     *                                         The callback to be called with decompressed frames.
     *                                         Pass NULL if and only if you will be calling
     *                                         VTDecompressionSessionDecodeFrameWithOutputHandler for decoding frames.
     * @param decompressionSessionOut
     *                                         Points to a variable to receive the new decompression session.
     * 
     * 
     *                                         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionCreate(@Nullable CFAllocatorRef allocator,
            @NotNull CMFormatDescriptionRef videoFormatDescription, @Nullable CFDictionaryRef videoDecoderSpecification,
            @Nullable CFDictionaryRef destinationImageBufferAttributes,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") VTDecompressionOutputCallbackRecord outputCallback,
            @NotNull Ptr<VTDecompressionSessionRef> decompressionSessionOut);

    /**
     * [@function] VTDecompressionSessionInvalidate
     * 
     * Tears down a decompression session.
     * 
     * When you are done with a decompression session you created, call VTDecompressionSessionInvalidate
     * to tear it down and then CFRelease to release your object reference.
     * When a decompression session's retain count reaches zero, it is automatically invalidated, but
     * since sessions may be retained by multiple parties, it can be hard to predict when this will happen.
     * Calling VTDecompressionSessionInvalidate ensures a deterministic, orderly teardown.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void VTDecompressionSessionInvalidate(@NotNull VTDecompressionSessionRef session);

    /**
     * [@function] VTDecompressionSessionGetTypeID
     * 
     * Returns the CFTypeID for decompression sessions.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTDecompressionSessionGetTypeID();

    /**
     * [@function] VTDecompressionSessionDecodeFrame
     * 
     * Decompresses a video frame.
     * 
     * If an error is returned from this function, there will be no callback. Otherwise
     * the callback provided during VTDecompressionSessionCreate will be called.
     * 
     * @param session
     *                          The decompression session.
     * @param sampleBuffer
     *                          A CMSampleBuffer containing one or more video frames.
     * @param decodeFlags
     *                          A bitfield of directives to the decompression session and decoder.
     *                          The kVTDecodeFrame_EnableAsynchronousDecompression bit indicates whether the video
     *                          decoder
     *                          may decompress the frame asynchronously.
     *                          The kVTDecodeFrame_EnableTemporalProcessing bit indicates whether the decoder may delay
     *                          calls to the output callback
     *                          so as to enable processing in temporal (display) order.
     *                          If both flags are clear, the decompression shall complete and your output callback
     *                          function will be called
     *                          before VTDecompressionSessionDecodeFrame returns.
     *                          If either flag is set, VTDecompressionSessionDecodeFrame may return before the output
     *                          callback function is called.
     * @param sourceFrameRefCon
     *                          Your reference value for the frame.
     *                          Note that if sampleBuffer contains multiple frames, the output callback function will be
     *                          called
     *                          multiple times with this sourceFrameRefCon.
     * @param infoFlagsOut
     *                          Points to a VTDecodeInfoFlags to receive information about the decode operation.
     *                          The kVTDecodeInfo_Asynchronous bit may be set if the decode is (or was) running
     *                          asynchronously.
     *                          The kVTDecodeInfo_FrameDropped bit may be set if the frame was dropped (synchronously).
     *                          Pass NULL if you do not want to receive this information.
     * 
     *                          API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionDecodeFrame(@NotNull VTDecompressionSessionRef session,
            @NotNull CMSampleBufferRef sampleBuffer, int decodeFlags, @Nullable VoidPtr sourceFrameRefCon,
            @Nullable IntPtr infoFlagsOut);

    /**
     * [@function] VTDecompressionSessionDecodeFrameWithOutputHandler
     * 
     * Decompresses a video frame.
     * 
     * Cannot be called with a session created with a VTDecompressionOutputCallbackRecord.
     * If the VTDecompressionSessionDecodeFrameWithOutputHandler call returns an error, the block
     * will not be called.
     * 
     * @param session
     *                      The decompression session.
     * @param sampleBuffer
     *                      A CMSampleBuffer containing one or more video frames.
     * @param decodeFlags
     *                      A bitfield of directives to the decompression session and decoder.
     *                      The kVTDecodeFrame_EnableAsynchronousDecompression bit indicates whether the video decoder
     *                      may decompress the frame asynchronously.
     *                      The kVTDecodeFrame_EnableTemporalProcessing bit indicates whether the decoder may delay
     *                      calls to the output callback
     *                      so as to enable processing in temporal (display) order.
     *                      If both flags are clear, the decompression shall complete and your output callback function
     *                      will be called
     *                      before VTDecompressionSessionDecodeFrame returns.
     *                      If either flag is set, VTDecompressionSessionDecodeFrame may return before the output
     *                      callback function is called.
     * @param infoFlagsOut
     *                      Points to a VTDecodeInfoFlags to receive information about the decode operation.
     *                      The kVTDecodeInfo_Asynchronous bit may be set if the decode is (or was) running
     *                      asynchronously.
     *                      The kVTDecodeInfo_FrameDropped bit may be set if the frame was dropped (synchronously).
     *                      Pass NULL if you do not want to receive this information.
     * @param outputHandler
     *                      The block to be called when decoding the frame is completed. If the
     *                      VTDecompressionSessionDecodeFrameWithOutputHandler
     *                      call returns an error, the block will not be called.
     * 
     *                      API-Since: 9.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionDecodeFrameWithOutputHandler(
            @NotNull VTDecompressionSessionRef session, @NotNull CMSampleBufferRef sampleBuffer, int decodeFlags,
            @Nullable IntPtr infoFlagsOut,
            @NotNull @ObjCBlock(name = "call_VTDecompressionSessionDecodeFrameWithOutputHandler") Block_VTDecompressionSessionDecodeFrameWithOutputHandler outputHandler);

    /**
     * [@function] VTDecompressionSessionFinishDelayedFrames
     * 
     * Directs the decompression session to emit all delayed frames.
     * 
     * By default, the decompression session may not delay frames indefinitely;
     * frames may only be indefinitely delayed if the client opts in via
     * kVTDecodeFrame_EnableTemporalProcessing.
     * IMPORTANT NOTE: This function may return before all delayed frames are emitted.
     * To wait for them, call VTDecompressionSessionWaitForAsynchronousFrames instead.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionFinishDelayedFrames(@NotNull VTDecompressionSessionRef session);

    /**
     * [@function] VTDecompressionSessionCanAcceptFormatDescription
     * 
     * Indicates whether the session can decode frames with the given format description.
     * 
     * Some video decoders are able to accommodate minor changes in format without needing to be
     * completely reset in a new session. This function can be used to test whether a format change
     * is sufficiently minor.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte VTDecompressionSessionCanAcceptFormatDescription(
            @NotNull VTDecompressionSessionRef session, @NotNull CMFormatDescriptionRef newFormatDesc);

    /**
     * [@function] VTDecompressionSessionWaitForAsynchronousFrames
     * 
     * Waits for any and all outstanding asynchronous and delayed frames to complete, then returns.
     * 
     * This function automatically calls VTDecompressionSessionFinishDelayedFrames,
     * so clients don't have to call both.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionWaitForAsynchronousFrames(
            @NotNull VTDecompressionSessionRef session);

    /**
     * [@function] VTDecompressionSessionCopyBlackPixelBuffer
     * 
     * Copies a black pixel buffer from the decompression session.
     * 
     * The pixel buffer is in the same format that the session is decompressing to.
     * 
     * @param session
     *                       The decompression session.
     * @param pixelBufferOut
     *                       Points to a variable to receive the copied pixel buffer.
     * 
     * 
     *                       API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTDecompressionSessionCopyBlackPixelBuffer(@NotNull VTDecompressionSessionRef session,
            @NotNull Ptr<CVBufferRef> pixelBufferOut);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTFrameSiloGetTypeID();

    /**
     * [@function] VTFrameSiloCreate
     * 
     * Creates a VTFrameSilo object using a temporary file.
     * 
     * The returned VTFrameSilo object may be used to gather frames produced by multi-pass encoding.
     * 
     * @param fileURL
     *                     Specifies where to put the backing file for the VTFrameSilo object.
     *                     If you pass NULL for fileURL, the video toolbox will pick a unique temporary file name.
     * @param options
     *                     Reserved, pass NULL.
     * @param timeRange
     *                     The valid time range for the frame silo. Must be valid for progress reporting.
     * @param frameSiloOut
     *                     Points to a VTFrameSiloRef to receive the newly created object.
     *                     Call CFRelease to release your retain on the created VTFrameSilo object when you are done
     *                     with it.
     * 
     *                     API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloCreate(@Nullable CFAllocatorRef allocator, @Nullable CFURLRef fileURL,
            @ByValue CMTimeRange timeRange, @Nullable CFDictionaryRef options,
            @NotNull Ptr<VTFrameSiloRef> frameSiloOut);

    /**
     * [@function] VTFrameSiloAddSampleBuffer
     * 
     * Adds a sample buffer to a VTFrameSilo object.
     * 
     * Within each pass, sample buffers must have strictly increasing decode timestamps.
     * Passes after the first pass are begun with a call to VTFrameSiloSetTimeRangesForNextPass.
     * After a call to VTFrameSiloSetTimeRangesForNextPass, sample buffer decode timestamps must also be within
     * the stated time ranges.
     * Note that CMTimeRanges are considered to contain their start times but not their end times.
     * 
     * @return
     *         Returns kVTFrameSiloInvalidTimeStampErr if an attempt is made to add a sample buffer with an
     *         inappropriate decode timestamp.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloAddSampleBuffer(@NotNull VTFrameSiloRef silo,
            @NotNull CMSampleBufferRef sampleBuffer);

    /**
     * [@function] VTFrameSiloSetTimeRangesForNextPass
     * 
     * Begins a new pass of samples to be added to a VTFrameSilo object.
     * 
     * Previously-added sample buffers with decode timestamps within the time ranges will be deleted from the
     * VTFrameSilo.
     * It is not necessary to call VTFrameSiloSetTimeRangesForNextPass before adding the first pass' sample buffers.
     * 
     * @return
     *         Returns kVTFrameSiloInvalidTimeRangeErr if any time ranges are non-numeric, overlap or are not in
     *         ascending order.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloSetTimeRangesForNextPass(@NotNull VTFrameSiloRef silo,
            @NInt long timeRangeCount,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CMTimeRange timeRangeArray);

    /**
     * [@function] VTFrameSiloGetProgressOfCurrentPass
     * 
     * Gets the progress of the current pass.
     * 
     * Calculates the current progress based on the most recent sample buffer added and the current pass time ranges.
     * 
     * @return
     *         Returns kVTFrameSiloInvalidTimeRangeErr if any time ranges are non-numeric, overlap or are not in
     *         ascending order.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloGetProgressOfCurrentPass(@NotNull VTFrameSiloRef silo,
            @NotNull FloatPtr progressOut);

    /**
     * [@function] VTFrameSiloCallFunctionForEachSampleBuffer
     * 
     * Retrieves sample buffers from a VTFrameSilo object.
     * 
     * You call this function to retrieve sample buffers at the end of a multi-pass compression session.
     * 
     * @param timeRange
     *                  The decode time range of sample buffers to retrieve.
     *                  Pass kCMTimeRangeInvalid to retrieve all sample buffers from the VTFrameSilo.
     * @param callback
     *                  A function to be called, in decode order, with each sample buffer that was added.
     *                  To abort iteration early, return a nonzero status.
     *                  The VTFrameSilo may write sample buffers and data to the backing file between addition and
     *                  retrieval;
     *                  do not expect to get identical object pointers back.
     * @return
     *         Returns kVTFrameSiloInvalidTimeRangeErr if any time ranges are non-numeric, overlap or are not in
     *         ascending order.
     *         Returns any nonzero status returned by the callback function.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloCallFunctionForEachSampleBuffer(@NotNull VTFrameSiloRef silo,
            @ByValue CMTimeRange timeRange, @Nullable VoidPtr refcon,
            @NotNull @FunctionPtr(name = "call_VTFrameSiloCallFunctionForEachSampleBuffer") Function_VTFrameSiloCallFunctionForEachSampleBuffer callback);

    /**
     * [@function] VTFrameSiloCallBlockForEachSampleBuffer
     * 
     * Retrieves sample buffers from a VTFrameSilo object.
     * 
     * You call this function to retrieve sample buffers at the end of a multi-pass compression session.
     * 
     * @param timeRange
     *                  The decode time range of sample buffers to retrieve.
     *                  Pass kCMTimeRangeInvalid to retrieve all sample buffers from the VTFrameSilo.
     * @param handler
     *                  A block to be called, in decode order, with each sample buffer that was added.
     *                  To abort iteration early, return a nonzero status.
     *                  The VTFrameSilo may write sample buffers and data to the backing file between addition and
     *                  retrieval;
     *                  do not expect to get identical object pointers back.
     * @return
     *         Returns kVTFrameSiloInvalidTimeRangeErr if any time ranges are non-numeric, overlap or are not in
     *         ascending order.
     *         Returns any nonzero status returned by the handler block.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTFrameSiloCallBlockForEachSampleBuffer(@NotNull VTFrameSiloRef silo,
            @ByValue CMTimeRange timeRange,
            @NotNull @ObjCBlock(name = "call_VTFrameSiloCallBlockForEachSampleBuffer") Block_VTFrameSiloCallBlockForEachSampleBuffer handler);

    /**
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTMultiPassStorageGetTypeID();

    /**
     * [@function] VTMultiPassStorageCreate
     * 
     * Creates a VTMultiPassStorage object using a temporary file.
     * 
     * The returned VTMultiPassStorage object may be used to perform multi-pass encoding; see
     * kVTCompressionPropertyKey_MultiPassStorage.
     * Call CFRelease to release your retain on the created VTMultiPassStorage object when you are done with it.
     * 
     * @param fileURL
     *                  Specifies where to put the backing file for the VTMultiPassStorage object.
     *                  If you pass NULL for fileURL, the video toolbox will pick a unique temporary file name.
     * @param timeRange
     *                  Gives a hint to the multi pass storage about valid time stamps for data.
     * @param options
     *                  If the file did not exist when the storage was created, the file will be deleted when the
     *                  VTMultiPassStorage object is finalized, unless you set the
     *                  kVTMultiPassStorageCreationOption_DoNotDelete option to kCFBooleanTrue in the options
     *                  dictionary.
     * 
     *                  API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTMultiPassStorageCreate(@Nullable CFAllocatorRef allocator, @Nullable CFURLRef fileURL,
            @ByValue CMTimeRange timeRange, @Nullable CFDictionaryRef options,
            @NotNull Ptr<VTMultiPassStorageRef> multiPassStorageOut);

    /**
     * [@function] VTMultiPassStorageClose
     * 
     * Ensures that any pending data is written to the multipass storage file and closes the file.
     * 
     * After this function is called, all methods on the multipass storage object will fail.
     * It is still necessary to release the object by calling CFRelease.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTMultiPassStorageClose(@NotNull VTMultiPassStorageRef multiPassStorage);

    /**
     * [@function] VTCopyVideoEncoderList
     * 
     * Builds a list of available video encoders.
     * 
     * The caller must CFRelease the returned list.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native int VTCopyVideoEncoderList(@Nullable CFDictionaryRef options,
            @NotNull Ptr<CFArrayRef> listOfVideoEncodersOut);

    /**
     * [@function] VTCreateCGImageFromCVPixelBuffer
     * 
     * Creates a CGImage using the provided CVPixelBuffer
     * 
     * This routine creates a CGImage representation of the image data contained in
     * the provided CVPixelBuffer.
     * The source CVPixelBuffer may be retained for the lifetime of the CGImage. Changes
     * to the CVPixelBuffer after making this call (other than releasing it) will have
     * undefined results.
     * Not all CVPixelBuffer pixel formats will support conversion into a CGImage compatible
     * pixel format.
     * 
     * API-Since: 9.0
     * 
     * @param pixelBuffer
     *                    The pixelBuffer to be used as the image data source for the CGImage.
     * @param options
     *                    no options currently. pass NULL.
     * @param imageOut
     *                    pointer to an address to receive the newly created CGImage.
     */
    @Generated
    @CFunction
    public static native int VTCreateCGImageFromCVPixelBuffer(@NotNull CVBufferRef pixelBuffer,
            @Nullable CFDictionaryRef options, @NotNull Ptr<CGImageRef> imageOut);

    /**
     * Read-only, CFNumber<int>
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_NumberOfPendingFrames();

    /**
     * Read-only, CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelBufferPoolIsShared();

    /**
     * Read-only, CFDictionary
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_VideoEncoderPixelBufferAttributes();

    /**
     * Read/write, CFNumber<int>, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxKeyFrameInterval();

    /**
     * Read/write, CFNumber<seconds>, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxKeyFrameIntervalDuration();

    /**
     * Read/Write, CFBoolean, Optional, defaults to true
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AllowTemporalCompression();

    /**
     * Read/Write, CFBoolean, Optional, defaults to true
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AllowFrameReordering();

    /**
     * Read/write, CFNumber<SInt32>, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AverageBitRate();

    /**
     * Read/write, CFArray[CFNumber], [bytes, seconds, bytes, seconds...], Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_DataRateLimits();

    /**
     * Read/write, CFNumber<Float>, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_Quality();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MoreFramesBeforeStart();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MoreFramesAfterEnd();

    /**
     * Read/write, CFString (enumeration), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ProfileLevel();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_1_3();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_3_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_4_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_5_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Baseline_AutoLevel();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_3_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_4_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_5_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Main_AutoLevel();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Extended_5_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_Extended_AutoLevel();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_3_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_4_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_5_2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_High_AutoLevel();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Simple_L3();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L3();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_Main_L4();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L0();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L1();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L2();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L3();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_MP4V_AdvancedSimple_L4();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile0_Level10();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile0_Level45();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H263_Profile3_Level45();

    /**
     * Read/write, CFString, optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_H264EntropyMode();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTH264EntropyMode_CAVLC();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTH264EntropyMode_CABAC();

    /**
     * Read/write, CFNumber (CMPixelFormatType), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_Depth();

    /**
     * Read/write, CFNumber, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxFrameDelayCount();

    /**
     * Read/write, CFNumber<SInt32>, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxH264SliceBytes();

    /**
     * Read/write, CFBoolean or NULL, Optional, default NULL
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_RealTime();

    /**
     * Read/write, CFNumber, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_SourceFrameCount();

    /**
     * Read/write, CFNumber, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ExpectedFrameRate();

    /**
     * Read/write, CFNumber(seconds), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ExpectedDuration();

    /**
     * CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTEncodeFrameOptionKey_ForceKeyFrame();

    /**
     * Read/write, CFDictionary (see CMFormatDescription.h), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_CleanAperture();

    /**
     * Read/write, CFDictionary (see CMFormatDescription.h), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelAspectRatio();

    /**
     * Read/write, CFNumber (see kCMFormatDescriptionExtension_FieldCount), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_FieldCount();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_FieldDetail), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_FieldDetail();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AspectRatio16x9();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ProgressiveScan();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_ColorPrimaries), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ColorPrimaries();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_TransferFunction), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_TransferFunction();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_YCbCrMatrix), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_YCbCrMatrix();

    /**
     * Read/write, CFData (see kCMFormatDescriptionExtension_ICCProfile), Optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ICCProfile();

    /**
     * Read/Write, CFDictionary containing properties from VTPixelTransferProperties.h.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PixelTransferProperties();

    /**
     * VTMultiPassStorage, optional, default is NULL
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MultiPassStorage();

    /**
     * value is CFStringRef, one of the following:
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyTypeKey();

    /**
     * value is one of a list of CFStrings
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Enumeration();

    /**
     * value is a CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Boolean();

    /**
     * value is a CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyType_Number();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatusKey();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatus_ReadOnly();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyReadWriteStatus_ReadWrite();

    /**
     * CFBoolean, false by default
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyShouldBeSerializedKey();

    /**
     * CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueMinimumKey();

    /**
     * CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueMaximumKey();

    /**
     * CFArray of appropriate values
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertySupportedValueListKey();

    /**
     * a CFString for developer eyes only
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPropertyDocumentationKey();

    /**
     * CFString
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderSpecification_EncoderID();

    /**
     * Read-only, CVPixelBufferPool
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelBufferPool();

    /**
     * Read-only, CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelBufferPoolIsShared();

    /**
     * Read/Write, CFNumberRef
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_OutputPoolRequestedMinimumBufferCount();

    /**
     * Read-only, CFNumber.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_NumberOfFramesBeingDecoded();

    /**
     * Read-only, CMTime as CFDictionary.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_MinOutputPresentationTimeStampOfFramesBeingDecoded();

    /**
     * Read-only, CMTime as CFDictionary.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_MaxOutputPresentationTimeStampOfFramesBeingDecoded();

    /**
     * Read-only, CFBoolean
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ContentHasInterframeDependencies();

    /**
     * Read/write, CFBoolean or NULL, Optional, default is true
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_RealTime();

    /**
     * Read/write, CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ThreadCount();

    /**
     * Read/write, CFString, one of
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_FieldMode();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_BothFields();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_TopFieldOnly();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_BottomFieldOnly();

    /**
     * Most appropriate of either TopFieldOnly or BottomFieldOnly
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_SingleField();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_FieldMode_DeinterlaceFields();

    /**
     * Read/write, CFString; only applicable if kVTDecompressionPropertyKey_FieldMode is
     * kVTDecompressionProperty_FieldMode_DeinterlaceFields; supported values may include:
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_DeinterlaceMode();

    /**
     * apply 0.25-0.50-0.25 vertical filter to individual interlaced frames; default mode
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_DeinterlaceMode_VerticalFilter();

    /**
     * apply filter that makes use of a window of multiple frames to generate deinterlaced results, and provides a
     * better result at the expense of a pipeline delay; this mode is only used if
     * kVTDecodeFrame_EnableTemporalProcessing is set, otherwise a non-temporal mode (eg, VerticalFilter) will be used
     * instead
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_DeinterlaceMode_Temporal();

    /**
     * Read/write, CFDictionary containing width and height keys and CFNumber values:
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedResolutionDecode();

    /**
     * CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionResolutionKey_Width();

    /**
     * CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionResolutionKey_Height();

    /**
     * Read/write, CFNumber
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedCoefficientDecode();

    /**
     * Read/write, CFNumber in range [0.0,1.0].
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_ReducedFrameDelivery();

    /**
     * Read/write, CFString, supported values may include:
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_OnlyTheseFrames();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_AllFrames();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_NonDroppableFrames();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_IFrames();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_OnlyTheseFrames_KeyFrames();

    /**
     * Read-only, CFArray of CFDictionaries containing property key/value pairs
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SuggestedQualityOfServiceTiers();

    /**
     * Read-only, CFArray[CFNumber(CMPixelFormatType)] ordered best to worst, optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByQuality();

    /**
     * Read-only, CFArray[CFNumber(CMPixelFormatType)] ordered fast to slow, optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByPerformance();

    /**
     * Read-only, CFArray[CFNumber(CMPixelFormatType)], optional
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelFormatsWithReducedResolutionSupport();

    /**
     * Read/Write, CFDictionary containing properties from VTPixelTransferProperties.h.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PixelTransferProperties();

    /**
     * CFBoolean, false by default. Provided for use when debugging video encoders.
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTMultiPassStorageCreationOption_DoNotDelete();

    /**
     * CFNumber for four-char-code (eg, 'avc1')
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_CodecType();

    /**
     * CFString, reverse-DNS-style unique identifier for this encoder; may be passed as
     * kVTVideoEncoderSpecification_EncoderID
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_EncoderID();

    /**
     * CFString, for display to user (eg, "H.264")
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_CodecName();

    /**
     * CFString, for display to user (eg, "Apple H.264")
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_EncoderName();

    /**
     * CFString (same as CodecName if there is only one encoder for that format, otherwise same as EncoderName)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_DisplayName();

    /**
     * Read/write, CFStringRef, one of kVTScalingMode_*
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_ScalingMode();

    /**
     * Copy full width and height. Write adjusted clean aperture and pixel aspect ratios to compensate for any change in
     * dimensions.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTScalingMode_Normal();

    /**
     * Crop to remove edge processing region; scale remainder to destination clean aperture.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTScalingMode_CropSourceToCleanAperture();

    /**
     * Preserve aspect ratio of the source, and fill remaining areas with black in to fit destination dimensions
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTScalingMode_Letterbox();

    /**
     * Preserve aspect ratio of the source, and crop picture to fit destination dimensions
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTScalingMode_Trim();

    /**
     * Read/write, CFDictionary with same keys as used in kCVImageBufferCleanApertureKey dictionary. Used as applicable
     * to current kVTPixelTransferPropertyKey_ScalingMode value.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationCleanAperture();

    /**
     * Read/write, CFDictionary with same keys as used in kCVImageBufferPixelAspectRatioKey dictionary. Used as
     * applicable to current kVTPixelTransferPropertyKey_ScalingMode value.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationPixelAspectRatio();

    /**
     * Read/write, CFStringRef, one of:
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DownsamplingMode();

    /**
     * Default, decimate extra samples
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDownsamplingMode_Decimate();

    /**
     * Average missing samples (default center)
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDownsamplingMode_Average();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_ColorPrimaries), Optional
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationColorPrimaries();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_TransferFunction), Optional
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationTransferFunction();

    /**
     * Read/write, CFData (see kCMFormatDescriptionExtension_ICCProfile), Optional
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationICCProfile();

    /**
     * Read/write, CFString (see kCMFormatDescriptionExtension_YCbCrMatrix), Optional
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_DestinationYCbCrMatrix();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_VTCompressionSessionCreate {
        @Generated
        void call_VTCompressionSessionCreate(@Nullable VoidPtr arg0, @Nullable VoidPtr arg1, int arg2, int arg3,
                @Nullable CMSampleBufferRef arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTCompressionSessionEncodeFrameWithOutputHandler {
        @Generated
        void call_VTCompressionSessionEncodeFrameWithOutputHandler(int status, int infoFlags,
                @Nullable CMSampleBufferRef sampleBuffer);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTDecompressionSessionDecodeFrameWithOutputHandler {
        @Generated
        void call_VTDecompressionSessionDecodeFrameWithOutputHandler(int status, int infoFlags,
                @Nullable CVBufferRef imageBuffer, @ByValue CMTime presentationTimeStamp,
                @ByValue CMTime presentationDuration);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_VTFrameSiloCallFunctionForEachSampleBuffer {
        @Generated
        int call_VTFrameSiloCallFunctionForEachSampleBuffer(@Nullable VoidPtr arg0, @NotNull CMSampleBufferRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_VTFrameSiloCallBlockForEachSampleBuffer {
        @Generated
        int call_VTFrameSiloCallBlockForEachSampleBuffer(@NotNull CMSampleBufferRef arg0);
    }

    /**
     * [@function] VTIsHardwareDecodeSupported
     * 
     * Indicates whether the current system supports hardware decode for a given codec
     * 
     * This routine reports whether the current system supports hardware decode. Using
     * this information, clients can make informed decisions regarding remote assets to load,
     * favoring alternate encodings when hardware decode is not supported.
     * This call returning true does not guarantee that hardware decode resources will be
     * available at all times.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native byte VTIsHardwareDecodeSupported(int codecType);

    /**
     * [@function] VTCopySupportedPropertyDictionaryForEncoder
     * 
     * Builds a list of supported properties and encoder ID for an encoder
     * 
     * The caller must CFRelease the returned supported properties and encoder ID.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int VTCopySupportedPropertyDictionaryForEncoder(int width, int height, int codecType,
            @Nullable CFDictionaryRef encoderSpecification, @Nullable Ptr<CFStringRef> encoderIDOut,
            @Nullable Ptr<CFDictionaryRef> supportedPropertiesOut);

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_HEVC_Main_AutoLevel();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_HEVC_Main10_AutoLevel();

    /**
     * Read/write, CFNumber, Optional
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_BaseLayerFrameRate();

    /**
     * Read/write, CFData(24 bytes) (see kCMFormatDescriptionExtension_MasteringDisplayColorVolume), Optional
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MasteringDisplayColorVolume();

    /**
     * Read/write, CFData(4 bytes) (see kCMFormatDescriptionExtension_ContentLightLevelInfo), Optional
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ContentLightLevelInfo();

    /**
     * CFStringRef
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_EncoderID();

    /**
     * Read/write, CFNumber
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionProperty_TemporalLevelLimit();

    /**
     * Read/Write, CFBoolean, Optional
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AllowOpenGOP();

    /**
     * Read/write, CFNumber<Float>, Optional, NULL by default
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_TargetQualityForAlpha();

    /**
     * Read/write, CFBoolean or NULL, Optional, default is false
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaximizePowerEfficiency();

    /**
     * CFNumber, Optional
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderSpecification_RequiredEncoderGPURegistryID();

    /**
     * CFNumber, Optional
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderSpecification_PreferredEncoderGPURegistryID();

    /**
     * CFNumberRef, Read;
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_UsingGPURegistryID();

    /**
     * Read/write, CFNumber (see kCMFormatDescriptionExtension_GammaLevel), Optional
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_GammaLevel();

    /**
     * Read/write, Optional, CFString(kVTAlphaChannelMode_*); if property is not set, matches first source frame's
     * attachment; if that's also not set, defaults to premultiplied alpha
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_AlphaChannelMode();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTAlphaChannelMode_StraightAlpha();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTAlphaChannelMode_PremultipliedAlpha();

    /**
     * Read/write, CFBoolean or NULL, Optional, default is false
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_MaximizePowerEfficiency();

    /**
     * CFNumber, Optional
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoDecoderSpecification_RequiredDecoderGPURegistryID();

    /**
     * CFNumber, Optional
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoDecoderSpecification_PreferredDecoderGPURegistryID();

    /**
     * CFNumberRef, Read;
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_UsingGPURegistryID();

    /**
     * optional. CFNumberRef. If encoder is associated with a specific GPU, this corresponds to the GPU registryID as
     * reported by [MTLDevice registryID].
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_GPURegistryID();

    /**
     * optional. CFDictionary. If present, represents a subset of supported properties that may be useful during encoder
     * selection
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_SupportedSelectionProperties();

    /**
     * optional. CFNumber. If present, indicates a relative rating value for the encoder compared to other encoders of
     * the same format.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_PerformanceRating();

    /**
     * optional. CFNumber. If present, indicates a Quality Rating value for the encoder relative to other encoders of
     * the same format. This is a highly generalized value and different encoders may have strengths at different
     * resolutions and bitrates.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_QualityRating();

    /**
     * optional. CFBoolean. If present and set to kCFBooleanTrue, there is a global instance limit cap on this encoder.
     * Indicates that an encoder is a scarce resource which may potentially be unavailable.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_InstanceLimit();

    /**
     * optional. CFBoolean. If present and set to kCFBooleanTrue, indicates that the encoder is hardware accelerated.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_IsHardwareAccelerated();

    /**
     * Read/write, CFBoolean, default NULL
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelTransferPropertyKey_RealTime();

    /**
     * CFBoolean, Optional
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PrioritizeEncodingSpeedOverQuality();

    /**
     * Read/write, CFString, Optional, default is kVTHDRMetadataInsertionMode_Auto
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_HDRMetadataInsertionMode();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTHDRMetadataInsertionMode_None();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTHDRMetadataInsertionMode_Auto();

    /**
     * CFBoolean, Write, Optional
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PreserveDynamicHDRMetadata();

    /**
     * Read/write, CFBoolean, Optional, default is kCFBooleanTrue
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTDecompressionPropertyKey_PropagatePerFrameHDRDisplayMetadata();

    /**
     * optional. CFBoolean. By default, this is assumed to be true if not present. If present and set to
     * kCFBooleanFalse, indicates that the encoder will not use B frames.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderList_SupportsFrameReordering();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_ConstrainedBaseline_AutoLevel();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_H264_ConstrainedHigh_AutoLevel();

    /**
     * Read/write, CFNumber<Float>, Optional
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_BaseLayerFrameRateFraction();

    /**
     * Read/write, CFNumber<Float>, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_BaseLayerBitRateFraction();

    /**
     * Read only, CFBoolean, Optional, false by default
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_SupportsBaseFrameQP();

    /**
     * CFNumberRef, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTEncodeFrameOptionKey_BaseFrameQP();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderSpecification_EnableLowLatencyRateControl();

    /**
     * Read/write, CFNumberRef, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MaxAllowedFrameQP();

    /**
     * Read/write, CFBoolean, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_EnableLTR();

    /**
     * CFArray[CFNumberRef], Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTEncodeFrameOptionKey_AcknowledgedLTRTokens();

    /**
     * CFNumberRef, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTEncodeFrameOptionKey_ForceLTRRefresh();

    /**
     * CFNumberRef, Optional
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTSampleAttachmentKey_RequireLTRAcknowledgementToken();

    /**
     * optional. CFBoolean. By default, DV encoders will not be included in the list. If present and set to
     * kCFBooleanTrue, DV encoders will be included.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTVideoEncoderListOption_IncludeStandardDefinitionDVEncoders();

    /**
     * [@function] VTPixelTransferSessionCreate
     * 
     * Creates a session for transferring images between CVPixelBuffers.
     * 
     * The function creates a session for transferring images between CVPixelBuffers.
     * 
     * @param allocator
     *                                An allocator for the session. Pass NULL to use the default allocator.
     * @param pixelTransferSessionOut
     *                                Points to a variable to receive the new pixel transfer session.
     */
    @Generated
    @CFunction
    public static native int VTPixelTransferSessionCreate(@Nullable CFAllocatorRef allocator,
            @NotNull Ptr<VTPixelTransferSessionRef> pixelTransferSessionOut);

    /**
     * [@function] VTPixelTransferSessionInvalidate
     * 
     * Tears down a pixel transfer session.
     * 
     * When you are done with a pixel transfer session you created, call VTPixelTransferSessionInvalidate
     * to tear it down and then CFRelease to release your object reference.
     * When a pixel transfer session's retain count reaches zero, it is automatically invalidated, but
     * since sessions may be retained by multiple parties, it can be hard to predict when this will happen.
     * Calling VTPixelTransferSessionInvalidate ensures a deterministic, orderly teardown.
     */
    @Generated
    @CFunction
    public static native void VTPixelTransferSessionInvalidate(@NotNull VTPixelTransferSessionRef session);

    /**
     * [@function] VTPixelTransferSessionGetTypeID
     * 
     * Returns the CFTypeID for pixel transfer sessions.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTPixelTransferSessionGetTypeID();

    /**
     * [@function] VTPixelTransferSessionTransferImage
     * 
     * Copies and/or converts an image from one pixel buffer to another.
     * 
     * By default, the full width and height of sourceBuffer are scaled to the full
     * width and height of destinationBuffer.
     * By default, all existing attachments on destinationBuffer are removed and new attachments
     * are set describing the transferred image. Unrecognised attachments on sourceBuffer will
     * be propagated to destinationBuffer.
     * Some properties will modify this behaviour; see VTPixelTransferProperties.h for more details.
     * 
     * @param session
     *                          The pixel transfer session.
     * @param sourceBuffer
     *                          The source buffer.
     * @param destinationBuffer
     *                          The destination buffer.
     * @return
     *         If the transfer was successful, noErr; otherwise an error code, such as kVTPixelTransferNotSupportedErr.
     */
    @Generated
    @CFunction
    public static native int VTPixelTransferSessionTransferImage(@NotNull VTPixelTransferSessionRef session,
            @NotNull CVBufferRef sourceBuffer, @NotNull CVBufferRef destinationBuffer);

    /**
     * [@function] VTPixelRotationSessionCreate
     * 
     * Creates a session for rotating images between CVPixelBuffers.
     * 
     * @param allocator
     *                                An allocator for the session. Pass NULL to use the default allocator.
     * @param pixelRotationSessionOut
     *                                Points to a variable to receive the new pixel rotation session.
     * 
     *                                API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int VTPixelRotationSessionCreate(@Nullable CFAllocatorRef allocator,
            @NotNull Ptr<VTPixelRotationSessionRef> pixelRotationSessionOut);

    /**
     * [@function] VTPixelRotationSessionInvalidate
     * 
     * Tears down a pixel rotation session.
     * 
     * When you are done with an image rotation session you created, call VTPixelRotationSessionInvalidate
     * to tear it down and then VTPixelRotationSessionRelease to release your object reference.
     * When an pixel rotation session's retain count reaches zero, it is automatically invalidated, but
     * since sessions may be retained by multiple parties, it can be hard to predict when this will happen.
     * Calling VTPixelRotationSessionInvalidate ensures a deterministic, orderly teardown.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void VTPixelRotationSessionInvalidate(@NotNull VTPixelRotationSessionRef session);

    /**
     * [@function] VTPixelRotationSessionGetTypeID
     * 
     * Returns the CFTypeID for pixel rotation sessions.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VTPixelRotationSessionGetTypeID();

    /**
     * [@function] VTPixelRotationSessionRotateImage
     * 
     * Rotates a pixel buffer.
     * 
     * Rotates sourceBuffer and places the output in destinationBuffer.
     * For 90 and 270 degree rotations, the width and height of destinationBuffer must be the inverse
     * of sourceBuffer.
     * For 180 degree rotations, the width and height of destinationBuffer and sourceBuffer must match.
     * By default, all existing attachments on destinationBuffer are removed and new attachments
     * are set describing the transferred image. Unrecognised attachments on sourceBuffer will
     * be propagated to destinationBuffer.
     * Some properties may modify this behaviour; see VTPixelRotationProperties.h for more details.
     * 
     * @param session
     *                          The pixel rotation session.
     * @param sourceBuffer
     *                          The source buffer.
     * @param destinationBuffer
     *                          The destination buffer.
     * @return
     *         If the transfer was successful, noErr; otherwise an error code, such as kVTPixelRotationNotSupportedErr.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native int VTPixelRotationSessionRotateImage(@NotNull VTPixelRotationSessionRef session,
            @NotNull CVBufferRef sourceBuffer, @NotNull CVBufferRef destinationBuffer);

    /**
     * CFNumber bits per second, Optional
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ConstantBitRate();

    /**
     * Read Only, CFNumber (bytes per frame)
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_EstimatedAverageBytesPerFrame();

    /**
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTProfileLevel_HEVC_Main42210_AutoLevel();

    /**
     * Read/write, Optional, CFNumber, NULL by default
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_OutputBitDepth();

    /**
     * Read/write, CFBoolean, Optional, (effectively) kCFBooleanTrue by default
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_PreserveAlphaChannel();

    /**
     * CFNumber, Optional
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_ReferenceBufferCount();

    /**
     * Read/write, CFNumberRef, Optional
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTCompressionPropertyKey_MinAllowedFrameQP();

    /**
     * [@constant] kVTPixelRotationPropertyKey_Rotation
     * 
     * Specifies the amount of rotation in degrees.
     * 
     * Specifies the amount of rotation to apply when copying source to destination.
     * Valid values: kVTRotation_0, kVTRotation_CW90, kVTRotation_180, and kVTRotation_CCW90
     * default is kVTRotation_0.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelRotationPropertyKey_Rotation();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTRotation_0();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTRotation_CW90();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTRotation_180();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTRotation_CCW90();

    /**
     * [@constant] kVTPixelRotationPropertyKey_FlipHorizontalOrientation
     * 
     * Specifies the horizontal flip.
     * 
     * kVTPixelRotationPropertyKey_FlipHorizontalOrientation must pass a CFBoolean as value. true will apply a
     * horizontal flip after the rotation.
     * default is false;
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelRotationPropertyKey_FlipHorizontalOrientation();

    /**
     * [@constant] kVTPixelRotationPropertyKey_FlipVerticalOrientation
     * 
     * Specifies the vertical flip.
     * 
     * kVTPixelRotationPropertyKey_FlipVerticalOrientation must pass a CFBoolean as value. true will apply a vertical
     * flip after the rotation.
     * default is false;
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kVTPixelRotationPropertyKey_FlipVerticalOrientation();
}

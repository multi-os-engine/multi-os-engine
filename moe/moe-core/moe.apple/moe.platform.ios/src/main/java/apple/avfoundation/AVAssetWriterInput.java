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

package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetWriterInput
 * <p>
 * AVAssetWriterInput defines an interface for appending either new media samples or references to existing media samples packaged as CMSampleBuffer objects to a single track of the output file of an AVAssetWriter.
 * <p>
 * Clients that need to write multiple concurrent tracks of media data should use one AVAssetWriterInput instance per track. In order to write multiple concurrent tracks with ideal interleaving of media data, clients should observe the value returned by the readyForMoreMediaData property of each AVAssetWriterInput instance.
 * <p>
 * AVAssetWriterInput also supports writing per-track metadata collections to the output file.
 * <p>
 * As of OS X 10.10 and iOS 8.0 AVAssetWriterInput can also be used to create tracks that are not self-contained.  Such tracks reference sample data that is located in another file. This is currently supported only for instances of AVAssetWriterInput attached to an instance of AVAssetWriter that writes files of type AVFileTypeQuickTimeMovie.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetWriterInput allocWithZone(VoidPtr zone);

    /**
     * assetWriterInputWithMediaType:outputSettings:
     * <p>
     * Creates a new input of the specified media type to receive sample buffers for writing to the output file.
     * <p>
     * Each new input accepts data for a new track of the AVAssetWriter's output file.  Inputs are added to an asset writer using -[AVAssetWriter addInput:].
     * <p>
     * Passing nil for output settings instructs the input to pass through appended samples, doing no processing before they are written to the output file.  This is useful if, for example, you are appending buffers that are already in a desirable compressed format.  However, if not writing to a QuickTime Movie file (i.e. the AVAssetWriter was initialized with a file type other than AVFileTypeQuickTimeMovie), AVAssetWriter only supports passing through a restricted set of media types and subtypes.  In order to pass through media data to files other than AVFileTypeQuickTimeMovie, a non-NULL format hint must be provided using +assetWriterInputWithMediaType:outputSettings:sourceFormatHint: instead of this method.
     * <p>
     * For AVMediaTypeAudio the following keys are not currently supported in the outputSettings dictionary: AVSampleRateConverterAudioQualityKey.  When using this method to construct a new instance, an audio settings dictionary must be fully specified, meaning that it must contain AVFormatIDKey, AVSampleRateKey, and AVNumberOfChannelsKey.  If no other channel layout information is available, a value of 1 for AVNumberOfChannelsKey will result in mono output and a value of 2 will result in stereo output.  If AVNumberOfChannelsKey specifies a channel count greater than 2, the dictionary must also specify a value for AVChannelLayoutKey.  For kAudioFormatLinearPCM, all relevant AVLinearPCM*Key keys must be included, and for kAudioFormatAppleLossless, AVEncoderBitDepthHintKey keys must be included.  See +assetWriterInputWithMediaType:outputSettings:sourceFormatHint: for a way to avoid having to specify a value for each of those keys.
     * <p>
     * For AVMediaTypeVideo, any output settings dictionary must request a compressed video format.  This means that the value passed in for outputSettings must follow the rules for compressed video output, as laid out in AVVideoSettings.h.  When using this method to construct a new instance, a video settings dictionary must be fully specified, meaning that it must contain AVVideoCodecKey, AVVideoWidthKey, and AVVideoHeightKey.  See +assetWriterInputWithMediaType:outputSettings:sourceFormatHint: for a way to avoid having to specify a value for each of those keys.  On iOS, the only values currently supported for AVVideoCodecKey are AVVideoCodecTypeH264 and AVVideoCodecTypeJPEG.  AVVideoCodecTypeH264 is not supported on iPhone 3G.  For AVVideoScalingModeKey, the value AVVideoScalingModeFit is not supported.
     *
     * @param mediaType      The media type of samples that will be accepted by the input. Media types are defined in AVMediaFormat.h.
     * @param outputSettings The settings used for encoding the media appended to the output.  See AVAudioSettings.h for AVMediaTypeAudio or AVVideoSettings.h for AVMediaTypeVideo and for more information on how to construct an output settings dictionary.  If you only require simple preset-based output settings, see AVOutputSettingsAssistant.
     * @return An instance of AVAssetWriterInput.
     */
    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    /**
     * assetWriterInputWithMediaType:outputSettings:sourceFormatHint:
     * <p>
     * Creates a new input of the specified media type to receive sample buffers for writing to the output file.
     * <p>
     * A version of +assetWriterInputWithMediaType:outputSettings: that includes the ability to hint at the format of media data that will be appended to the new instance of AVAssetWriterInput.  When a source format hint is provided, the outputSettings dictionary is not required to be fully specified.  For AVMediaTypeAudio, this means that AVFormatIDKey is the only required key.  For AVMediaTypeVideo, this means that AVVideoCodecKey is the only required key.  Values for the remaining keys will be chosen by the asset writer input, with consideration given to the attributes of the source format.  To guarantee successful file writing, clients who specify a format hint should ensure that subsequently-appended buffers are of the specified format.
     * <p>
     * An NSInvalidArgumentException will be thrown if the media type of the format description does not match the media type string passed into this method.
     *
     * @param mediaType        The media type of samples that will be accepted by the input. Media types are defined in AVMediaFormat.h.
     * @param outputSettings   The settings used for encoding the media appended to the output.  See AVAudioSettings.h for AVMediaTypeAudio or AVVideoSettings.h for AVMediaTypeVideo and for more information on how to construct an output settings dictionary.  If you only require simple preset-based output settings, see AVOutputSettingsAssistant.
     * @param sourceFormatHint A hint about the format of media data that will be appended to the new input.
     * @return An instance of AVAssetWriterInput.
     */
    @Generated
    @Selector("assetWriterInputWithMediaType:outputSettings:sourceFormatHint:")
    public static native AVAssetWriterInput assetWriterInputWithMediaTypeOutputSettingsSourceFormatHint(
            String mediaType, NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

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
    public static native AVAssetWriterInput new_objc();

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
     * addTrackAssociationWithTrackOfInput:type:
     * <p>
     * Associates the track corresponding to the specified input with the track corresponding with the receiver.
     * <p>
     * If the type of association requires tracks of specific media types that don't match the media types of the inputs, or if the output file type does not support track associations, an NSInvalidArgumentException is raised.
     * <p>
     * Track associations cannot be added after writing on the receiver's AVAssetWriter has started.
     *
     * @param input                The instance of AVAssetWriterInput with a corresponding track to associate with track corresponding to the receiver.
     * @param trackAssociationType The type of track association to add. Common track association types, such as AVTrackAssociationTypeTimecode, are defined in AVAssetTrack.h.
     */
    @Generated
    @Selector("addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociationWithTrackOfInputType(AVAssetWriterInput input, String trackAssociationType);

    /**
     * appendSampleBuffer:
     * <p>
     * Appends samples to the receiver.
     * <p>
     * The timing information in the sample buffer, considered relative to the time passed to -[AVAssetWriter startSessionAtSourceTime:], will be used to determine the timing of those samples in the output file.
     * <p>
     * For track types other than audio tracks, to determine the duration of all samples in the output file other than the very last sample that's appended, the difference between the sample buffer's output DTS and the following sample buffer's output DTS will be used. The duration of the last sample is determined as follows:
     * 1. If a marker sample buffer with kCMSampleBufferAttachmentKey_EndsPreviousSampleDuration is appended following the last media-bearing sample, the difference between the output DTS of the marker sample buffer and the output DTS of the last media-bearing sample will be used.
     * 2. If the marker sample buffer is not provided and if the output duration of the last media-bearing sample is valid, it will be used.
     * 3. if the output duration of the last media-bearing sample is not valid, the duration of the second-to-last sample will be used.
     * <p>
     * For audio tracks, the properties of each appended sample buffer are used to determine corresponding output durations.
     * <p>
     * The receiver will retain the CMSampleBuffer until it is done with it, and then release it.  Do not modify a CMSampleBuffer or its contents after you have passed it to this method.
     * <p>
     * If the sample buffer contains audio data and the AVAssetWriterInput was intialized with an outputSettings dictionary then the format must be linear PCM. If the outputSettings dictionary was nil then audio data can be provided in a compressed format, and it will be passed through to the output without any re-compression. Note that advanced formats like AAC will have encoder delay present in their bitstreams. This data is inserted by the encoder and is necessary for proper decoding, but it is not meant to be played back. Clients who provide compressed audio bitstreams must use kCMSampleBufferAttachmentKey_TrimDurationAtStart to mark the encoder delay (generally restricted to the first sample buffer). Packetization can cause there to be extra audio frames in the last packet which are not meant to be played back. These remainder frames should be marked with kCMSampleBufferAttachmentKey_TrimDurationAtEnd. CMSampleBuffers obtained from AVAssetReader will already have the necessary trim attachments. Please see http://developer.apple.com/mac/library/technotes/tn2009/tn2258.html for more information about encoder delay. When attaching trims make sure that the output PTS of the sample buffer is what you expect. For example if you called -[AVAssetWriter startSessionAtSourceTime:kCMTimeZero] and you want your audio to start at time zero in the output file then make sure that the output PTS of the first non-fully trimmed audio sample buffer is kCMTimeZero.
     * <p>
     * If the sample buffer contains a CVPixelBuffer then the choice of pixel format will affect the performance and quality of the encode. For optimal performance the format of the pixel buffer should match one of the native formats supported by the selected video encoder. Below are some recommendations:
     * <p>
     * The H.264 and HEVC encoders natively support kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange and kCVPixelFormatType_420YpCbCr8BiPlanarFullRange, which should be used with 8-bit 4:2:0 video and full range input respectively; other related pixel formats in CoreVideo/CVPixelBuffer.h are ideal for 4:2:2 and 4:4:4 (and for HEVC, 10-bit). The JPEG encoder on iOS and Apple Silicon macOS natively supports kCVPixelFormatType_422YpCbCr8FullRange. If you need to work in the RGB domain then kCVPixelFormatType_32BGRA is recommended on iOS and macOS.
     * <p>
     * Pixel buffers not in a natively supported format will be converted internally prior to encoding when possible. Pixel format conversions within the same range (video or full) are generally faster than conversions between different ranges.
     * <p>
     * The ProRes encoders can preserve high bit depth sources, supporting up to 12bits/ch. ProRes 4444 can contain a mathematically lossless alpha channel and it doesn't do any chroma subsampling. This makes ProRes 4444 ideal for quality critical applications. If you are working with 8bit sources ProRes is also a good format to use due to its high image quality. Use either of the recommended pixel formats above. Note that RGB pixel formats by definition have 4:4:4 chroma sampling.
     * <p>
     * If you are working with high bit depth sources the following yuv pixel formats are recommended when encoding to ProRes: kCVPixelFormatType_4444AYpCbCr16, kCVPixelFormatType_422YpCbCr16, and kCVPixelFormatType_422YpCbCr10. When working in the RGB domain kCVPixelFormatType_64ARGB is recommended. Scaling and color matching are not currently supported when using AVAssetWriter with any of these high bit depth pixel formats. Please make sure that your track's output settings dictionary specifies the same width and height as the buffers you will be appending. Do not include AVVideoScalingModeKey or AVVideoColorPropertiesKey.
     * <p>
     * As of OS X 10.10 and iOS 8.0, this method can be used to add sample buffers that reference existing data in a file instead of containing media data to be appended to the file. This can be used to generate tracks that are not self-contained. In order to append such a sample reference to the track create a CMSampleBufferRef with a NULL dataBuffer and dataReady set to true and set the kCMSampleBufferAttachmentKey_SampleReferenceURL and kCMSampleBufferAttachmentKey_SampleReferenceByteOffset attachments on the sample buffer. Further documentation on how to create such a "sample reference" sample buffer can be found in the description of the kCMSampleBufferAttachmentKey_SampleReferenceURL and kCMSampleBufferAttachmentKey_SampleReferenceByteOffset attachment keys in the CMSampleBuffer documentation.
     * <p>
     * Before calling this method, you must ensure that the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.  It is an error to invoke this method before starting a session (via -[AVAssetWriter startSessionAtSourceTime:]) or after ending a session (via -[AVAssetWriter endSessionAtSourceTime:]).
     *
     * @param sampleBuffer The CMSampleBuffer to be appended.
     * @return A BOOL value indicating success of appending the sample buffer. If a result of NO is returned, clients can check the value of AVAssetWriter.status to determine whether the writing operation completed, failed, or was cancelled.  If the status is AVAssetWriterStatusFailed, AVAsset.error will contain an instance of NSError that describes the failure.
     */
    @Generated
    @Selector("appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBufferRef sampleBuffer);

    /**
     * canAddTrackAssociationWithTrackOfInput:type:
     * <p>
     * Tests whether an association between the tracks corresponding to a pair of inputs is valid.
     * <p>
     * If the type of association requires tracks of specific media types that don't match the media types of the inputs, or if the output file type does not support track associations, -canAddTrackAssociationWithTrackOfInput:type: will return NO.
     *
     * @param input                The instance of AVAssetWriterInput with a corresponding track to associate with track corresponding with the receiver.
     * @param trackAssociationType The type of track association to test. Common track association types, such as AVTrackAssociationTypeTimecode, are defined in AVAssetTrack.h.
     */
    @Generated
    @Selector("canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociationWithTrackOfInputType(AVAssetWriterInput input,
            String trackAssociationType);

    /**
     * [@property] canPerformMultiplePasses
     * <p>
     * Indicates whether the input might perform multiple passes over appended media data.
     * <p>
     * When the value for this property is YES, your source for media data should be configured for random access.  After appending all of the media data for the current pass (as specified by the currentPassDescription property), call -markCurrentPassAsFinished to start the process of determining whether additional passes are needed.  Note that it is still possible in this case for the input to perform only the initial pass, if it determines that there will be no benefit to performing multiple passes.
     * <p>
     * When the value for this property is NO, your source for media data only needs to support sequential access.  In this case, append all of the source media once and call -markAsFinished.
     * <p>
     * In the default configuration of AVAssetWriterInput, the value for this property will be NO.  Currently the only way for this property to become YES is when performsMultiPassEncodingIfSupported has been set to YES.  The final value will be available after -startWriting is called, when a specific encoder has been choosen.
     * <p>
     * This property is key-value observable.
     */
    @Generated
    @Selector("canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();

    /**
     * [@property] currentPassDescription
     * <p>
     * Provides an object that describes the requirements, such as source time ranges to append or re-append, for the current pass.
     * <p>
     * If the value of this property is nil, it means there is no request to be fulfilled and -markAsFinished should be called on the asset writer input.
     * <p>
     * During the first pass, the request will contain a single time range from zero to positive infinity, indicating that all media from the source should be appended.  This will also be true when canPerformMultiplePasses is NO, in which case only one pass will be performed.
     * <p>
     * The value of this property will be nil before -startWriting is called on the attached asset writer.  It will transition to an initial non-nil value during the call to -startWriting.  After that, the value of this property will change only after a call to -markCurrentPassAsFinished.  For an easy way to be notified at the beginning of each pass, see -respondToEachPassDescriptionOnQueue:usingBlock:.
     * <p>
     * This property is key-value observable.  Observers should not assume that they will be notified of changes on a specific thread.
     */
    @Generated
    @Selector("currentPassDescription")
    public native AVAssetWriterInputPassDescription currentPassDescription();

    /**
     * [@property] expectsMediaDataInRealTime
     * <p>
     * Indicates whether the input should tailor its processing of media data for real-time sources.
     * <p>
     * Clients appending media data to an input from a real-time source, such as an AVCaptureOutput, should set expectsMediaDataInRealTime to YES. This will ensure that readyForMoreMediaData is calculated appropriately for real-time usage.
     * <p>
     * For best results, do not set both this property and performsMultiPassEncodingIfSupported to YES.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();

    /**
     * [@property] extendedLanguageTag
     * <p>
     * Indicates the language tag to associate with the track corresponding to the receiver, as an IETF BCP 47 (RFC 4646) language identifier; can be nil.
     * <p>
     * Extended language tags are normally set only when an ISO 639-2/T language code by itself is ambiguous, as in cases in which media data should be distinguished not only by language but also by the regional dialect in use or the writing system employed.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("init")
    public native AVAssetWriterInput init();

    /**
     * initWithMediaType:outputSettings:
     * <p>
     * Creates a new input of the specified media type to receive sample buffers for writing to the output file.
     * <p>
     * Each new input accepts data for a new track of the AVAssetWriter's output file.  Inputs are added to an asset writer using -[AVAssetWriter addInput:].
     * <p>
     * Passing nil for output settings instructs the input to pass through appended samples, doing no processing before they are written to the output file.  This is useful if, for example, you are appending buffers that are already in a desirable compressed format.  However, if not writing to a QuickTime Movie file (i.e. the AVAssetWriter was initialized with a file type other than AVFileTypeQuickTimeMovie), AVAssetWriter only supports passing through a restricted set of media types and subtypes.  In order to pass through media data to files other than AVFileTypeQuickTimeMovie, a non-NULL format hint must be provided using -initWithMediaType:outputSettings:sourceFormatHint: instead of this method.
     * <p>
     * For AVMediaTypeAudio the following keys are not currently supported in the outputSettings dictionary: AVSampleRateConverterAudioQualityKey.  When using this initializer, an audio settings dictionary must be fully specified, meaning that it must contain AVFormatIDKey, AVSampleRateKey, and AVNumberOfChannelsKey.  If no other channel layout information is available, a value of 1 for AVNumberOfChannelsKey will result in mono output and a value of 2 will result in stereo output.  If AVNumberOfChannelsKey specifies a channel count greater than 2, the dictionary must also specify a value for AVChannelLayoutKey.  For kAudioFormatLinearPCM, all relevant AVLinearPCM*Key keys must be included, and for kAudioFormatAppleLossless, AVEncoderBitDepthHintKey keys must be included.  See -initWithMediaType:outputSettings:sourceFormatHint: for a way to avoid having to specify a value for each of those keys.
     * <p>
     * For AVMediaTypeVideo, any output settings dictionary must request a compressed video format.  This means that the value passed in for outputSettings must follow the rules for compressed video output, as laid out in AVVideoSettings.h.  When using this initializer, a video settings dictionary must be fully specified, meaning that it must contain AVVideoCodecKey, AVVideoWidthKey, and AVVideoHeightKey.  See -initWithMediaType:outputSettings:sourceFormatHint: for a way to avoid having to specify a value for each of those keys.  On iOS, the only values currently supported for AVVideoCodecKey are AVVideoCodecTypeH264 and AVVideoCodecTypeJPEG.  AVVideoCodecTypeH264 is not supported on iPhone 3G.  For AVVideoScalingModeKey, the value AVVideoScalingModeFit is not supported.
     *
     * @param mediaType      The media type of samples that will be accepted by the input. Media types are defined in AVMediaFormat.h.
     * @param outputSettings The settings used for encoding the media appended to the output.  See AVAudioSettings.h for AVMediaTypeAudio or AVVideoSettings.h for AVMediaTypeVideo and for more information on how to construct an output settings dictionary.  If you only require simple preset-based output settings, see AVOutputSettingsAssistant.
     * @return An instance of AVAssetWriterInput.
     */
    @Generated
    @Selector("initWithMediaType:outputSettings:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettings(String mediaType,
            NSDictionary<String, ?> outputSettings);

    /**
     * initWithMediaType:outputSettings:sourceFormatHint:
     * <p>
     * Creates a new input of the specified media type to receive sample buffers for writing to the output file.  This is the designated initializer of AVAssetWriterInput.
     * <p>
     * A version of -initWithMediaType:outputSettings: that includes the ability to hint at the format of media data that will be appended to the new instance of AVAssetWriterInput.  When a source format hint is provided, the outputSettings dictionary is not required to be fully specified.  For AVMediaTypeAudio, this means that AVFormatIDKey is the only required key.  For AVMediaTypeVideo, this means that AVVideoCodecKey is the only required key.  Values for the remaining keys will be chosen by the asset writer input, with consideration given to the attributes of the source format.  To guarantee successful file writing, clients who specify a format hint should ensure that subsequently-appended buffers are of the specified format.
     * <p>
     * An NSInvalidArgumentException will be thrown if the media type of the format description does not match the media type string passed into this method.
     *
     * @param mediaType        The media type of samples that will be accepted by the input. Media types are defined in AVMediaFormat.h.
     * @param outputSettings   The settings used for encoding the media appended to the output.  See AVAudioSettings.h for AVMediaTypeAudio or AVVideoSettings.h for AVMediaTypeVideo and for more information on how to construct an output settings dictionary.  If you only require simple preset-based output settings, see AVOutputSettingsAssistant.
     * @param sourceFormatHint A hint about the format of media data that will be appended to the new input.
     * @return An instance of AVAssetWriterInput.
     */
    @Generated
    @Selector("initWithMediaType:outputSettings:sourceFormatHint:")
    public native AVAssetWriterInput initWithMediaTypeOutputSettingsSourceFormatHint(String mediaType,
            NSDictionary<String, ?> outputSettings, CMFormatDescriptionRef sourceFormatHint);

    /**
     * [@property] readyForMoreMediaData
     * <p>
     * Indicates the readiness of the input to accept more media data.
     * <p>
     * When there are multiple inputs, AVAssetWriter tries to write media data in an ideal interleaving pattern for efficiency in storage and playback. Each of its inputs signals its readiness to receive media data for writing according to that pattern via the value of readyForMoreMediaData. You can append media data to an input only while its readyForMoreMediaData property is YES.
     * <p>
     * Clients writing media data from a non-real-time source, such as an instance of AVAssetReader, should hold off on generating or obtaining more media data to append to an input when the value of readyForMoreMediaData is NO. To help with control of the supply of non-real-time media data, such clients can use -requestMediaDataWhenReadyOnQueue:usingBlock in order to specify a block that the input should invoke whenever it's ready for input to be appended.
     * <p>
     * Clients writing media data from a real-time source, such as an instance of AVCaptureOutput, should set the input's expectsMediaDataInRealTime property to YES to ensure that the value of readyForMoreMediaData is calculated appropriately. When expectsMediaDataInRealTime is YES, readyForMoreMediaData will become NO only when the input cannot process media samples as quickly as they are being provided by the client. If readyForMoreMediaData becomes NO for a real-time source, the client may need to drop samples or consider reducing the data rate of appended samples.
     * <p>
     * When the value of canPerformMultiplePasses is YES for any input attached to this input's asset writer, the value for this property may start as NO and/or be NO for long periods of time.
     * <p>
     * The value of readyForMoreMediaData will often change from NO to YES asynchronously, as previously supplied media data is processed and written to the output.  It is possible for all of an AVAssetWriter's AVAssetWriterInputs temporarily to return NO for readyForMoreMediaData.
     * <p>
     * This property is key value observable. Observers should not assume that they will be notified of changes on a specific thread.
     */
    @Generated
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

    /**
     * [@property] languageCode
     * <p>
     * Indicates the language to associate with the track corresponding to the receiver, as an ISO 639-2/T language code; can be nil.
     * <p>
     * Also see extendedLanguageTag below.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    /**
     * markAsFinished
     * <p>
     * Indicates to the AVAssetWriter that no more buffers will be appended to this input.
     * <p>
     * Clients that are monitoring each input's readyForMoreMediaData value must call markAsFinished on an input when they are done appending buffers to it.  This is necessary to prevent other inputs from stalling, as they may otherwise wait forever for that input's media data, attempting to complete the ideal interleaving pattern.
     * <p>
     * After invoking this method from the serial queue passed to -requestMediaDataWhenReadyOnQueue:usingBlock:, the receiver is guaranteed to issue no more invocations of the block passed to that method.  The same is true of -respondToEachPassDescriptionOnQueue:usingBlock:.
     * <p>
     * Before calling this method, you must ensure that the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.
     */
    @Generated
    @Selector("markAsFinished")
    public native void markAsFinished();

    /**
     * markCurrentPassAsFinished
     * <p>
     * Instructs the receiver to analyze the media data that has been appended and determine whether the results could be improved by re-encoding certain segments.
     * <p>
     * When the value of canPerformMultiplePasses is YES, call this method after you have appended all of your media data.  After the receiver analyzes whether an additional pass is warranted, the value of currentPassDescription will change (usually asynchronously) to describe how to set up for the next pass.  Although it is possible to use key-value observing to determine when the value of currentPassDescription has changed, it is typically more convenient to invoke -respondToEachPassDescriptionOnQueue:usingBlock: in order to start the work for each pass.
     * <p>
     * After re-appending the media data for all of the time ranges of the new pass, call this method again to determine whether additional segments should be re-appended in another pass.
     * <p>
     * Calling this method effectively cancels any previous invocation of -requestMediaDataWhenReadyOnQueue:usingBlock:, meaning that -requestMediaDataWhenReadyOnQueue:usingBlock: can be invoked again for each new pass.  -respondToEachPassDescriptionOnQueue:usingBlock: provides a convenient way to consolidate these invocations in your code.
     * <p>
     * After each pass, you have the option of keeping the most recent results by calling -markAsFinished instead of this method.  If the value of currentPassDescription is nil at the beginning of a pass, call -markAsFinished to tell the receiver to not expect any further media data.
     * <p>
     * If the value of canPerformMultiplePasses is NO, the value of currentPassDescription will immediately become nil after calling this method.
     * <p>
     * Before calling this method, you must ensure that the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.
     */
    @Generated
    @Selector("markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();

    /**
     * [@property] marksOutputTrackAsEnabled
     * <p>
     * For file types that support enabled and disabled tracks, such as QuickTime Movie files, specifies whether the track corresponding to the receiver should be enabled by default for playback and processing. The default value is YES.
     * <p>
     * When an input group is added to an AVAssetWriter (see -[AVAssetWriter addInputGroup:]), the value of marksOutputTrackAsEnabled will automatically be set to YES for the default input and set to NO for all of the other inputs in the group.  In this case, if a new value is set on this property then an exception will be raised.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();

    /**
     * [@property] mediaTimeScale
     * <p>
     * For file types that support media time scales, such as QuickTime Movie files, specifies the media time scale to be used.
     * <p>
     * The default value is 0, which indicates that the receiver should choose a convenient value, if applicable.  It is an error to set a value other than 0 if the receiver has media type AVMediaTypeAudio.
     * <p>
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("mediaTimeScale")
    public native int mediaTimeScale();

    /**
     * [@property] mediaType
     * <p>
     * The media type of the samples that can be appended to the receiver.
     * <p>
     * The value of this property is one of the media type strings defined in AVMediaFormat.h.
     */
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * [@property] metadata
     * <p>
     * A collection of metadata to be written to the track corresponding to the receiver.
     * <p>
     * The value of this property is an array of AVMetadataItem objects representing the collection of track-level metadata to be written in the output file.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * [@property] naturalSize
     * <p>
     * The size specified in the output file as the natural dimensions of the visual media data for display purposes.
     * <p>
     * If the default value, CGSizeZero, is specified, the naturalSize of the track corresponding to the receiver is set according to dimensions indicated by the format descriptions that are ultimately written to the output track.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * [@property] outputSettings
     * <p>
     * The settings used for encoding the media appended to the output.
     * <p>
     * The value of this property is an NSDictionary that contains values for keys as specified by either AVAudioSettings.h for AVMediaTypeAudio or AVVideoSettings.h for AVMediaTypeVideo.  A value of nil indicates that the receiver will pass through appended samples, doing no processing before they are written to the output file.
     */
    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    /**
     * [@property] performsMultiPassEncodingIfSupported
     * <p>
     * Indicates whether the input should attempt to encode the source media data using multiple passes.
     * <p>
     * The input may be able to achieve higher quality and/or lower data rate by performing multiple passes over the source media.  It does this by analyzing the media data that has been appended and re-encoding certain segments with different parameters.  In order to do this re-encoding, the media data for these segments must be appended again.  See -markCurrentPassAsFinished and the property currentPassDescription for the mechanism by which the input nominates segments for re-appending.
     * <p>
     * When the value of this property is YES, the value of readyForMoreMediaData for other inputs attached to the same AVAssetWriter may be NO more often and/or for longer periods of time.  In particular, the value of readyForMoreMediaData for inputs that do not (or cannot) perform multiple passes may start out as NO after -[AVAssetWriter startWriting] has been called and may not change to YES until after all multi-pass inputs have completed their final pass.
     * <p>
     * When the value of this property is YES, the input may store data in one or more temporary files before writing compressed samples to the output file.  Use the AVAssetWriter property directoryForTemporaryFiles if you need to control the location of temporary file writing.
     * <p>
     * The default value is NO, meaning that no additional analysis will occur and no segments will be re-encoded.  Not all asset writer input configurations (for example, inputs configured with certain media types or to use certain encoders) can benefit from performing multiple passes over the source media.  To determine whether the selected encoder can perform multiple passes, query the value of canPerformMultiplePasses after calling -startWriting.
     * <p>
     * For best results, do not set both this property and expectsMediaDataInRealTime to YES.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();

    /**
     * [@property] preferredMediaChunkAlignment
     * <p>
     * For file types that support media chunk alignment, such as QuickTime Movie files, specifies the boundary for media chunk alignment in bytes (e.g. 512).
     * <p>
     * The default value is 0, which means that the receiver will choose an appropriate default value.  A value of 1 implies that no padding should be used to achieve a particular chunk alignment.  It is an error to set a negative value for chunk alignment.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("preferredMediaChunkAlignment")
    @NInt
    public native long preferredMediaChunkAlignment();

    /**
     * [@property] preferredMediaChunkDuration
     * <p>
     * For file types that support media chunk duration, such as QuickTime Movie files, specifies the duration to be used for each chunk of sample data in the output file.
     * <p>
     * Chunk duration can influence the granularity of the I/O performed when reading a media file, e.g. during playback.  A larger chunk duration can result in fewer reads from disk, at the potential expense of a higher memory footprint.
     * <p>
     * A "chunk" contains one or more samples.  The total duration of the samples in a chunk is no greater than this preferred chunk duration, or the duration of a single sample if the sample's duration is greater than this preferred chunk duration.
     * <p>
     * The default value is kCMTimeInvalid, which means that the receiver will choose an appropriate default value.  It is an error to set a chunk duration that is negative or non-numeric.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("preferredMediaChunkDuration")
    @ByValue
    public native CMTime preferredMediaChunkDuration();

    /**
     * [@property] preferredVolume
     * <p>
     * The preferred volume level to be stored in the output file.
     * <p>
     * The value for this property should typically be in the range of 0.0 to 1.0.  The default value is 1.0, which is equivalent to a "normal" volume level for audio media type. For all other media types the default value is 0.0.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * requestMediaDataWhenReadyOnQueue:usingBlock:
     * <p>
     * Instructs the receiver to invoke a client-supplied block repeatedly, at its convenience, in order to gather media data for writing to the output file.
     * <p>
     * The block should append media data to the input either until the input's readyForMoreMediaData property becomes NO or until there is no more media data to supply (at which point it may choose to mark the input as finished via -markAsFinished). The block should then exit. After the block exits, if the input has not been marked as finished, once the input has processed the media data it has received and becomes ready for more media data again, it will invoke the block again in order to obtain more.
     * <p>
     * A typical use of this method, with a block that supplies media data to an input while respecting the input's readyForMoreMediaData property, might look like this:
     * <p>
     * [myAVAssetWriterInput requestMediaDataWhenReadyOnQueue:myInputSerialQueue usingBlock:^{
     * while ([myAVAssetWriterInput isReadyForMoreMediaData])
     * {
     * CMSampleBufferRef nextSampleBuffer = [self copyNextSampleBufferToWrite];
     * if (nextSampleBuffer)
     * {
     * [myAVAssetWriterInput appendSampleBuffer:nextSampleBuffer];
     * CFRelease(nextSampleBuffer);
     * }
     * else
     * {
     * [myAVAssetWriterInput markAsFinished];
     * break;
     * }
     * }
     * }];
     * <p>
     * This method is not recommended for use with a push-style buffer source, such as AVCaptureAudioDataOutput or AVCaptureVideoDataOutput, because such a combination will likely require intermediate queueing of buffers.  Instead, this method is better suited to a pull-style buffer source such as AVAssetReaderOutput, as illustrated in the above example.
     * <p>
     * When using a push-style buffer source, it is generally better to immediately append each buffer to the AVAssetWriterInput, directly via -[AVAssetWriter appendSampleBuffer:], as it is received.  Using this strategy, it is often possible to avoid  having to queue up buffers in between the buffer source and the AVAssetWriterInput.  Note that many of these push-style buffer sources also produce buffers in real-time, in which case the client should set expectsMediaDataInRealTime to YES.
     * <p>
     * Before calling this method, you must ensure that the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.
     *
     * @param queue The queue on which the block should be invoked.
     * @param block The block the input should invoke to obtain media data.
     */
    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    /**
     * respondToEachPassDescriptionOnQueue:usingBlock:
     * <p>
     * Instructs the receiver to invoke a client-supplied block whenever a new pass has begun.
     * <p>
     * A typical block passed to this method will perform the following steps:
     * <p>
     * 1. Query the value of the receiver's currentPassDescription property and reconfigure the source of media data (e.g. AVAssetReader) accordingly
     * 2. Call -requestMediaDataWhenReadyOnQueue:usingBlock: to begin appending data for the current pass
     * 3. Exit
     * <p>
     * When all media data has been appended for the current request, call -markCurrentPassAsFinished to begin the process of determining whether an additional pass is warranted.  If an additional pass is warranted, the block passed to this method will be invoked to begin the next pass.  If no additional passes are needed, the block passed to this method will be invoked one final time so the client can invoke -markAsFinished in response to the value of currentPassDescription becoming nil.
     * <p>
     * Before calling this method, you must ensure that the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.
     *
     * @param queue The queue on which the block should be invoked.
     * @param block A block the receiver should invoke whenever a new pass has begun.
     */
    @Generated
    @Selector("respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueueUsingBlock(NSObject queue,
            @ObjCBlock(name = "call_respondToEachPassDescriptionOnQueueUsingBlock") Block_respondToEachPassDescriptionOnQueueUsingBlock block);

    /**
     * [@property] sampleReferenceBaseURL
     * <p>
     * For file types that support writing sample references, such as QuickTime Movie files, specifies the base URL sample references are relative to.
     * <p>
     * If the value of this property can be resolved as an absolute URL, the sample locations written to the file when appending sample references will be relative to this URL. The URL must point to a location that is in a directory that is a parent of the sample reference location.
     * <p>
     * Usage example:
     * <p>
     * Setting the sampleReferenceBaseURL property to "file:///User/johnappleseed/Movies/" and appending sample buffers with the kCMSampleBufferAttachmentKey_SampleReferenceURL attachment set to "file:///User/johnappleseed/Movies/data/movie1.mov" will cause the sample reference "data/movie1.mov" to be written to the movie.
     * <p>
     * If the value of the property cannot be resolved as an absolute URL or if it points to a location that is not in a parent directory of the sample reference location, the location referenced in the sample buffer will be written unmodified.
     * <p>
     * The default value is nil, which means that the location referenced in the sample buffer will be written unmodified.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("sampleReferenceBaseURL")
    public native NSURL sampleReferenceBaseURL();

    /**
     * [@property] expectsMediaDataInRealTime
     * <p>
     * Indicates whether the input should tailor its processing of media data for real-time sources.
     * <p>
     * Clients appending media data to an input from a real-time source, such as an AVCaptureOutput, should set expectsMediaDataInRealTime to YES. This will ensure that readyForMoreMediaData is calculated appropriately for real-time usage.
     * <p>
     * For best results, do not set both this property and performsMultiPassEncodingIfSupported to YES.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setExpectsMediaDataInRealTime:")
    public native void setExpectsMediaDataInRealTime(boolean value);

    /**
     * [@property] extendedLanguageTag
     * <p>
     * Indicates the language tag to associate with the track corresponding to the receiver, as an IETF BCP 47 (RFC 4646) language identifier; can be nil.
     * <p>
     * Extended language tags are normally set only when an ISO 639-2/T language code by itself is ambiguous, as in cases in which media data should be distinguished not only by language but also by the regional dialect in use or the writing system employed.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * [@property] languageCode
     * <p>
     * Indicates the language to associate with the track corresponding to the receiver, as an ISO 639-2/T language code; can be nil.
     * <p>
     * Also see extendedLanguageTag below.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    /**
     * [@property] marksOutputTrackAsEnabled
     * <p>
     * For file types that support enabled and disabled tracks, such as QuickTime Movie files, specifies whether the track corresponding to the receiver should be enabled by default for playback and processing. The default value is YES.
     * <p>
     * When an input group is added to an AVAssetWriter (see -[AVAssetWriter addInputGroup:]), the value of marksOutputTrackAsEnabled will automatically be set to YES for the default input and set to NO for all of the other inputs in the group.  In this case, if a new value is set on this property then an exception will be raised.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setMarksOutputTrackAsEnabled:")
    public native void setMarksOutputTrackAsEnabled(boolean value);

    /**
     * [@property] mediaTimeScale
     * <p>
     * For file types that support media time scales, such as QuickTime Movie files, specifies the media time scale to be used.
     * <p>
     * The default value is 0, which indicates that the receiver should choose a convenient value, if applicable.  It is an error to set a value other than 0 if the receiver has media type AVMediaTypeAudio.
     * <p>
     * This property cannot be set after writing has started.
     */
    @Generated
    @Selector("setMediaTimeScale:")
    public native void setMediaTimeScale(int value);

    /**
     * [@property] metadata
     * <p>
     * A collection of metadata to be written to the track corresponding to the receiver.
     * <p>
     * The value of this property is an array of AVMetadataItem objects representing the collection of track-level metadata to be written in the output file.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] naturalSize
     * <p>
     * The size specified in the output file as the natural dimensions of the visual media data for display purposes.
     * <p>
     * If the default value, CGSizeZero, is specified, the naturalSize of the track corresponding to the receiver is set according to dimensions indicated by the format descriptions that are ultimately written to the output track.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    /**
     * [@property] performsMultiPassEncodingIfSupported
     * <p>
     * Indicates whether the input should attempt to encode the source media data using multiple passes.
     * <p>
     * The input may be able to achieve higher quality and/or lower data rate by performing multiple passes over the source media.  It does this by analyzing the media data that has been appended and re-encoding certain segments with different parameters.  In order to do this re-encoding, the media data for these segments must be appended again.  See -markCurrentPassAsFinished and the property currentPassDescription for the mechanism by which the input nominates segments for re-appending.
     * <p>
     * When the value of this property is YES, the value of readyForMoreMediaData for other inputs attached to the same AVAssetWriter may be NO more often and/or for longer periods of time.  In particular, the value of readyForMoreMediaData for inputs that do not (or cannot) perform multiple passes may start out as NO after -[AVAssetWriter startWriting] has been called and may not change to YES until after all multi-pass inputs have completed their final pass.
     * <p>
     * When the value of this property is YES, the input may store data in one or more temporary files before writing compressed samples to the output file.  Use the AVAssetWriter property directoryForTemporaryFiles if you need to control the location of temporary file writing.
     * <p>
     * The default value is NO, meaning that no additional analysis will occur and no segments will be re-encoded.  Not all asset writer input configurations (for example, inputs configured with certain media types or to use certain encoders) can benefit from performing multiple passes over the source media.  To determine whether the selected encoder can perform multiple passes, query the value of canPerformMultiplePasses after calling -startWriting.
     * <p>
     * For best results, do not set both this property and expectsMediaDataInRealTime to YES.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setPerformsMultiPassEncodingIfSupported:")
    public native void setPerformsMultiPassEncodingIfSupported(boolean value);

    /**
     * [@property] preferredMediaChunkAlignment
     * <p>
     * For file types that support media chunk alignment, such as QuickTime Movie files, specifies the boundary for media chunk alignment in bytes (e.g. 512).
     * <p>
     * The default value is 0, which means that the receiver will choose an appropriate default value.  A value of 1 implies that no padding should be used to achieve a particular chunk alignment.  It is an error to set a negative value for chunk alignment.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@NInt long value);

    /**
     * [@property] preferredMediaChunkDuration
     * <p>
     * For file types that support media chunk duration, such as QuickTime Movie files, specifies the duration to be used for each chunk of sample data in the output file.
     * <p>
     * Chunk duration can influence the granularity of the I/O performed when reading a media file, e.g. during playback.  A larger chunk duration can result in fewer reads from disk, at the potential expense of a higher memory footprint.
     * <p>
     * A "chunk" contains one or more samples.  The total duration of the samples in a chunk is no greater than this preferred chunk duration, or the duration of a single sample if the sample's duration is greater than this preferred chunk duration.
     * <p>
     * The default value is kCMTimeInvalid, which means that the receiver will choose an appropriate default value.  It is an error to set a chunk duration that is negative or non-numeric.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByValue CMTime value);

    /**
     * [@property] preferredVolume
     * <p>
     * The preferred volume level to be stored in the output file.
     * <p>
     * The value for this property should typically be in the range of 0.0 to 1.0.  The default value is 1.0, which is equivalent to a "normal" volume level for audio media type. For all other media types the default value is 0.0.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    /**
     * [@property] sampleReferenceBaseURL
     * <p>
     * For file types that support writing sample references, such as QuickTime Movie files, specifies the base URL sample references are relative to.
     * <p>
     * If the value of this property can be resolved as an absolute URL, the sample locations written to the file when appending sample references will be relative to this URL. The URL must point to a location that is in a directory that is a parent of the sample reference location.
     * <p>
     * Usage example:
     * <p>
     * Setting the sampleReferenceBaseURL property to "file:///User/johnappleseed/Movies/" and appending sample buffers with the kCMSampleBufferAttachmentKey_SampleReferenceURL attachment set to "file:///User/johnappleseed/Movies/data/movie1.mov" will cause the sample reference "data/movie1.mov" to be written to the movie.
     * <p>
     * If the value of the property cannot be resolved as an absolute URL or if it points to a location that is not in a parent directory of the sample reference location, the location referenced in the sample buffer will be written unmodified.
     * <p>
     * The default value is nil, which means that the location referenced in the sample buffer will be written unmodified.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL value);

    /**
     * [@property] transform
     * <p>
     * The transform specified in the output file as the preferred transformation of the visual media data for display purposes.
     * <p>
     * If no value is specified, the identity transform is used.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    /**
     * [@property] sourceFormatHint
     * <p>
     * The hint given at initialization time about the format of incoming media data.
     * <p>
     * AVAssetWriterInput may be able to use this hint to fill in missing output settings or perform more upfront validation.  To guarantee successful file writing, clients who specify a format hint should ensure that subsequently-appended media data are of the specified format.
     */
    @Generated
    @Selector("sourceFormatHint")
    public native CMFormatDescriptionRef sourceFormatHint();

    /**
     * [@property] transform
     * <p>
     * The transform specified in the output file as the preferred transformation of the visual media data for display purposes.
     * <p>
     * If no value is specified, the identity transform is used.
     * <p>
     * This property cannot be set after writing on the receiver's AVAssetWriter has started.
     */
    @Generated
    @Selector("transform")
    @ByValue
    public native CGAffineTransform transform();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMediaDataWhenReadyOnQueueUsingBlock {
        @Generated
        void call_requestMediaDataWhenReadyOnQueueUsingBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_respondToEachPassDescriptionOnQueueUsingBlock {
        @Generated
        void call_respondToEachPassDescriptionOnQueueUsingBlock();
    }

    /**
     * [@property] mediaDataLocation
     * <p>
     * Specifies where the media data will be laid out and whether the media data will be interleaved as the main media data.
     * <p>
     * If this value is set to AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved, AVAssetWriter tries to write the media data for this track before all the media data for AVAssetWriterInputs with this property set to AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData.
     * <p>
     * Use of this property is recommended for optimizing tracks that contain a small amount of data that is needed all at once, independent of playback time, such as chapter name tracks and chapter image tracks.
     * Keep it set to AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData for tracks whose media data that's needed only as its presentation time is approaching and, when multiple inputs are present that supply media data that will be played concurrently, should be interleaved for optimal access.
     * <p>
     * For file types that support preloading media data such as QuickTime movie file, if this value is set to AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved, AVAssetWriter will write an indication such as 'load' atom that the whole media data should be preloaded.
     * <p>
     * The default value is AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData, which means that the receiver will not write the indication and that the media data will be interleaved.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("mediaDataLocation")
    public native String mediaDataLocation();

    /**
     * [@property] mediaDataLocation
     * <p>
     * Specifies where the media data will be laid out and whether the media data will be interleaved as the main media data.
     * <p>
     * If this value is set to AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved, AVAssetWriter tries to write the media data for this track before all the media data for AVAssetWriterInputs with this property set to AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData.
     * <p>
     * Use of this property is recommended for optimizing tracks that contain a small amount of data that is needed all at once, independent of playback time, such as chapter name tracks and chapter image tracks.
     * Keep it set to AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData for tracks whose media data that's needed only as its presentation time is approaching and, when multiple inputs are present that supply media data that will be played concurrently, should be interleaved for optimal access.
     * <p>
     * For file types that support preloading media data such as QuickTime movie file, if this value is set to AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved, AVAssetWriter will write an indication such as 'load' atom that the whole media data should be preloaded.
     * <p>
     * The default value is AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData, which means that the receiver will not write the indication and that the media data will be interleaved.
     * <p>
     * This property cannot be set after -startWriting has been called on the receiver.
     */
    @Generated
    @Selector("setMediaDataLocation:")
    public native void setMediaDataLocation(String value);
}

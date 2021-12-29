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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetReaderTrackOutput
 * <p>
 * AVAssetReaderTrackOutput is a concrete subclass of AVAssetReaderOutput that defines an interface for reading media data from a single AVAssetTrack of an AVAssetReader's AVAsset.
 * <p>
 * Clients can read the media data of an asset track by adding an instance of AVAssetReaderTrackOutput to an AVAssetReader using the -[AVAssetReader addOutput:] method. The track's media samples can either be read in the format in which they are stored in the asset, or they can be converted to a different format.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderTrackOutput extends AVAssetReaderOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderTrackOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderTrackOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetReaderTrackOutput allocWithZone(VoidPtr zone);

    /**
     * assetReaderTrackOutputWithTrack:outputSettings:
     * <p>
     * Returns an instance of AVAssetReaderTrackOutput for reading from the specified track and supplying media data according to the specified output settings.
     * <p>
     * The track must be one of the tracks contained by the target AVAssetReader's asset.
     * <p>
     * A value of nil for outputSettings configures the output to vend samples in their original format as stored by the specified track.  Initialization will fail if the output settings cannot be used with the specified track.
     * <p>
     * AVAssetReaderTrackOutput can only produce uncompressed output.  For audio output settings, this means that AVFormatIDKey must be kAudioFormatLinearPCM.  For video output settings, this means that the dictionary must follow the rules for uncompressed video output, as laid out in AVVideoSettings.h.  AVAssetReaderTrackOutput does not support the AVAudioSettings.h key AVSampleRateConverterAudioQualityKey or the following AVVideoSettings.h keys:
     * <p>
     * AVVideoCleanApertureKey
     * AVVideoPixelAspectRatioKey
     * AVVideoScalingModeKey
     * <p>
     * When constructing video output settings the choice of pixel format will affect the performance and quality of the decompression. For optimal performance when decompressing video the requested pixel format should be one that the decoder supports natively to avoid unnecessary conversions. Below are some recommendations:
     * <p>
     * For H.264 use kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange, or kCVPixelFormatType_420YpCbCr8BiPlanarFullRange if the video is known to be full range.  For JPEG on iOS, use kCVPixelFormatType_420YpCbCr8BiPlanarFullRange.
     * <p>
     * For other codecs on OSX, kCVPixelFormatType_422YpCbCr8 is the preferred pixel format for video and is generally the most performant when decoding. If you need to work in the RGB domain then kCVPixelFormatType_32BGRA is recommended on iOS and kCVPixelFormatType_32ARGB is recommended on OSX.
     * <p>
     * ProRes encoded media can contain up to 12bits/ch. If your source is ProRes encoded and you wish to preserve more than 8bits/ch during decompression then use one of the following pixel formats: kCVPixelFormatType_4444AYpCbCr16, kCVPixelFormatType_422YpCbCr16, kCVPixelFormatType_422YpCbCr10, or kCVPixelFormatType_64ARGB.  AVAssetReader does not support scaling with any of these high bit depth pixel formats. If you use them then do not specify kCVPixelBufferWidthKey or kCVPixelBufferHeightKey in your outputSettings dictionary. If you plan to append these sample buffers to an AVAssetWriterInput then note that only the ProRes encoders support these pixel formats.
     * <p>
     * ProRes 4444 encoded media can contain a mathematically lossless alpha channel. To preserve the alpha channel during decompression use a pixel format with an alpha component such as kCVPixelFormatType_4444AYpCbCr16 or kCVPixelFormatType_64ARGB. To test whether your source contains an alpha channel check that the track's format description has kCMFormatDescriptionExtension_Depth and that its value is 32.
     *
     * @param track          The AVAssetTrack from which the resulting AVAssetReaderTrackOutput should read sample buffers.
     * @param outputSettings An NSDictionary of output settings to be used for sample output.  See AVAudioSettings.h for available output settings for audio tracks or AVVideoSettings.h for available output settings for video tracks and also for more information about how to construct an output settings dictionary.
     * @return An instance of AVAssetReaderTrackOutput.
     */
    @Generated
    @Selector("assetReaderTrackOutputWithTrack:outputSettings:")
    public static native AVAssetReaderTrackOutput assetReaderTrackOutputWithTrackOutputSettings(AVAssetTrack track,
            NSDictionary<String, ?> outputSettings);

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
    public static native AVAssetReaderTrackOutput new_objc();

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
     * [@property] audioTimePitchAlgorithm
     * <p>
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * <p>
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h.  An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * <p>
     * The default value is AVAudioTimePitchAlgorithmSpectral.
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    @Generated
    @Selector("init")
    public native AVAssetReaderTrackOutput init();

    /**
     * initWithTrack:outputSettings:
     * <p>
     * Returns an instance of AVAssetReaderTrackOutput for reading from the specified track and supplying media data according to the specified output settings.
     * <p>
     * The track must be one of the tracks contained by the target AVAssetReader's asset.
     * <p>
     * A value of nil for outputSettings configures the output to vend samples in their original format as stored by the specified track.  Initialization will fail if the output settings cannot be used with the specified track.
     * <p>
     * AVAssetReaderTrackOutput can only produce uncompressed output.  For audio output settings, this means that AVFormatIDKey must be kAudioFormatLinearPCM.  For video output settings, this means that the dictionary must follow the rules for uncompressed video output, as laid out in AVVideoSettings.h.  AVAssetReaderTrackOutput does not support the AVAudioSettings.h key AVSampleRateConverterAudioQualityKey or the following AVVideoSettings.h keys:
     * <p>
     * AVVideoCleanApertureKey
     * AVVideoPixelAspectRatioKey
     * AVVideoScalingModeKey
     * <p>
     * When constructing video output settings the choice of pixel format will affect the performance and quality of the decompression. For optimal performance when decompressing video the requested pixel format should be one that the decoder supports natively to avoid unnecessary conversions. Below are some recommendations:
     * <p>
     * For H.264 use kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange, or kCVPixelFormatType_420YpCbCr8BiPlanarFullRange if the video is known to be full range.  For JPEG on iOS, use kCVPixelFormatType_420YpCbCr8BiPlanarFullRange.
     * <p>
     * For other codecs on OSX, kCVPixelFormatType_422YpCbCr8 is the preferred pixel format for video and is generally the most performant when decoding. If you need to work in the RGB domain then kCVPixelFormatType_32BGRA is recommended on iOS and kCVPixelFormatType_32ARGB is recommended on OSX.
     * <p>
     * ProRes encoded media can contain up to 12bits/ch. If your source is ProRes encoded and you wish to preserve more than 8bits/ch during decompression then use one of the following pixel formats: kCVPixelFormatType_4444AYpCbCr16, kCVPixelFormatType_422YpCbCr16, kCVPixelFormatType_422YpCbCr10, or kCVPixelFormatType_64ARGB.  AVAssetReader does not support scaling with any of these high bit depth pixel formats. If you use them then do not specify kCVPixelBufferWidthKey or kCVPixelBufferHeightKey in your outputSettings dictionary. If you plan to append these sample buffers to an AVAssetWriterInput then note that only the ProRes encoders support these pixel formats.
     * <p>
     * ProRes 4444 encoded media can contain a mathematically lossless alpha channel. To preserve the alpha channel during decompression use a pixel format with an alpha component such as kCVPixelFormatType_4444AYpCbCr16 or kCVPixelFormatType_64ARGB.  To test whether your source contains an alpha channel check that the track's format description has kCMFormatDescriptionExtension_Depth and that its value is 32.
     *
     * @param track          The AVAssetTrack from which the resulting AVAssetReaderTrackOutput should read sample buffers.
     * @param outputSettings An NSDictionary of output settings to be used for sample output.  See AVAudioSettings.h for available output settings for audio tracks or AVVideoSettings.h for available output settings for video tracks and also for more information about how to construct an output settings dictionary.
     * @return An instance of AVAssetReaderTrackOutput.
     */
    @Generated
    @Selector("initWithTrack:outputSettings:")
    public native AVAssetReaderTrackOutput initWithTrackOutputSettings(AVAssetTrack track,
            NSDictionary<String, ?> outputSettings);

    /**
     * [@property] outputSettings
     * <p>
     * The output settings used by the receiver.
     * <p>
     * The value of this property is an NSDictionary that contains values for keys as specified by either AVAudioSettings.h for audio tracks or AVVideoSettings.h for video tracks.  A value of nil indicates that the receiver will vend samples in their original format as stored in the target track.
     */
    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    /**
     * [@property] audioTimePitchAlgorithm
     * <p>
     * Indicates the processing algorithm used to manage audio pitch for scaled audio edits.
     * <p>
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchAlgorithmSpectral, are defined in AVAudioProcessingSettings.h.  An NSInvalidArgumentException will be raised if this property is set to a value other than the constants defined in that file.
     * <p>
     * The default value is AVAudioTimePitchAlgorithmSpectral.
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    /**
     * [@property] track
     * <p>
     * The track from which the receiver reads sample buffers.
     * <p>
     * The value of this property is an AVAssetTrack owned by the target AVAssetReader's asset.
     */
    @Generated
    @Selector("track")
    public native AVAssetTrack track();
}

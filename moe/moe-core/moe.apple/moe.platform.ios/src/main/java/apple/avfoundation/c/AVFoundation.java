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

package apple.avfoundation.c;

import apple.avfoundation.struct.AVAudio3DAngularOrientation;
import apple.avfoundation.struct.AVAudio3DPoint;
import apple.avfoundation.struct.AVAudio3DVectorOrientation;
import apple.avfoundation.struct.AVBeatRange;
import apple.avfoundation.struct.AVCaptureWhiteBalanceGains;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AVFoundation")
@Runtime(CRuntime.class)
public final class AVFoundation {
    static {
        NatJ.register();
    }

    @Generated
    private AVFoundation() {
    }

    /**
     * Creates and returns an AVAudio3DPoint object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DPoint AVAudioMake3DPoint(float x, float y, float z);

    /**
     * Creates and returns an AVAudio3DVector object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DPoint AVAudioMake3DVector(float x, float y, float z);

    /**
     * Creates and returns an AVAudio3DVectorOrientation object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DVectorOrientation AVAudioMake3DVectorOrientation(@ByValue AVAudio3DPoint forward,
            @ByValue AVAudio3DPoint up);

    /**
     * Creates and returns an AVAudio3DAngularOrientation object
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVAudio3DAngularOrientation AVAudioMake3DAngularOrientation(float yaw, float pitch,
            float roll);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native AVBeatRange AVMakeBeatRange(double startBeat, double lengthInBeats);

    /**
     * [@function]					AVMakeRectWithAspectRatioInsideRect
     * 
     * Returns a scaled CGRect that maintains the aspect ratio specified by a CGSize within a bounding CGRect.
     * 
     * This is useful when attempting to fit the presentationSize property of an AVPlayerItem within the bounds of another CALayer.
     * 						You would typically use the return value of this function as an AVPlayerLayer frame property value. For example:
     * 						myPlayerLayer.frame = AVMakeRectWithAspectRatioInsideRect(myPlayerItem.presentationSize, mySuperLayer.bounds);
     * 
     * @param aspectRatio			The width & height ratio, or aspect, you wish to maintain.
     * @param	boundingRect		The bounding CGRect you wish to fit into. 
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect AVMakeRectWithAspectRatioInsideRect(@ByValue CGSize aspectRatio,
            @ByValue CGRect boundingRect);

    /**
     * [@constant]					AVCoreAnimationBeginTimeAtZero
     * 
     * Use this constant to set the CoreAnimation's animation beginTime property to be time 0.
     * 						The constant is a small, non-zero, positive value which avoids CoreAnimation
     * 						from replacing 0.0 with CACurrentMediaTime().
     */
    @Generated
    @CVariable()
    public static native double AVCoreAnimationBeginTimeAtZero();

    /**
     * [@constant]		AVLayerVideoGravityResizeAspect
     * 
     * Preserve aspect ratio; fit within layer bounds.
     * 
     * AVLayerVideoGravityResizeAspect may be used when setting the videoGravity
     *                    property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResizeAspect();

    /**
     * [@constant]		AVLayerVideoGravityResizeAspectFill
     * 
     * Preserve aspect ratio; fill layer bounds.
     * 
     * AVLayerVideoGravityResizeAspectFill may be used when setting the videoGravity
     *                    property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResizeAspectFill();

    /**
     * [@constant]		AVLayerVideoGravityResize
     * 
     * Stretch to fill layer bounds.
     * 
     * AVLayerVideoGravityResize may be used when setting the videoGravity
     *                    property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResize();

    /**
     *  [@constant]		AVURLAssetPreferPreciseDurationAndTimingKey
     * 
     * Indicates whether the asset should be prepared to indicate a precise duration and provide precise random access by time.
     * The value for this key is a boolean NSNumber.
     * 
     * If nil is passed as the value of the options parameter to -[AVURLAsset initWithURL:options:], or if a dictionary that lacks a value for the key AVURLAssetPreferPreciseDurationAndTimingKey is passed instead, a default value of NO is assumed. If the asset is intended to be played only, because AVPlayer will support approximate random access by time when full precision isn't available, the default value of NO will suffice.
     * Pass YES if longer loading times are acceptable in cases in which precise timing is required. If the asset is intended to be inserted into an AVMutableComposition, precise random access is typically desirable and the value of YES is recommended.
     * Note that such precision may require additional parsing of the resource in advance of operations that make use of any portion of it, depending on the specifics of its container format. Many container formats provide sufficient summary information for precise timing and do not require additional parsing to prepare for it; QuickTime movie files and MPEG-4 files are examples of such formats. Other formats do not provide sufficient summary information, and precise random access for them is possible only after a preliminary examination of a file's contents.
     * If you pass YES for an asset that you intend to play via an instance of AVPlayerItem and you are prepared for playback to commence before the value of -[AVPlayerItem duration] becomes available, you can omit the key @"duration" from the array of AVAsset keys you pass to -[AVPlayerItem initWithAsset:automaticallyLoadedAssetKeys:] in order to prevent AVPlayerItem from automatically loading the value of duration while the item becomes ready to play.
     * If precise duration and timing is not possible for the timed media resource referenced by the asset's URL, AVAsset.providesPreciseDurationAndTiming will be NO even if precise timing is requested via the use of this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetPreferPreciseDurationAndTimingKey();

    /**
     *  [@constant]		AVURLAssetReferenceRestrictionsKey
     * 
     * Indicates the restrictions used by the asset when resolving references to external media data. The value of this key is an NSNumber wrapping an AVAssetReferenceRestrictions enum value or the logical combination of multiple such values.
     * 
     * Some assets can contain references to media data stored outside the asset's container file, for example in another file. This key can be used to specify a policy to use when these references are encountered. If an asset contains one or more references of a type that is forbidden by the reference restrictions, loading of asset properties will fail. In addition, such an asset cannot be used with other AVFoundation modules, such as AVPlayerItem or AVAssetExportSession.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetReferenceRestrictionsKey();

    /**
     * [@constant]		AVURLAssetHTTPCookiesKey
     * 
     * HTTP cookies that the AVURLAsset may send with HTTP requests
     * Standard cross-site policy still applies: cookies will only be sent to domains to which they apply.
     * 
     * By default, an AVURLAsset will only have access to cookies in the client's default cookie storage 
     * that apply to the AVURLAsset's URL.  You can supplement the cookies available to the asset
     * via use of this initialization option 
     * 
     * HTTP cookies do not apply to non-HTTP(S) URLS.
     * In HLS, many HTTP requests (e.g., media, crypt key, variant index) might be issued to different paths or hosts.
     * In both of these cases, HTTP requests will be missing any cookies that do not apply to the AVURLAsset's URL.  
     * This init option allows the AVURLAsset to use additional HTTP cookies for those HTTP(S) requests.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetHTTPCookiesKey();

    /**
     * [@constant]		AVURLAssetAllowsCellularAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the cellular interface.
     * 
     * 	Default is YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsCellularAccessKey();

    /**
     * [@constant]       AVAssetDurationDidChangeNotification
     * 
     * Posted when the duration of an AVFragmentedAsset changes while it's being minded by an AVFragmentedAssetMinder, but only for changes that occur after the status of the value of @"duration" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDurationDidChangeNotification();

    /**
     * [@constant]       AVAssetChapterMetadataGroupsDidChangeNotification
     * 
     * Posted when the collection of arrays of timed metadata groups representing chapters of an AVAsset change and when any of the contents of the timed metadata groups change, but only for changes that occur after the status of the value of @"availableChapterLocales" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetChapterMetadataGroupsDidChangeNotification();

    /**
     * [@constant]       AVAssetMediaSelectionGroupsDidChangeNotification
     * 
     * Posted when the collection of media selection groups provided by an AVAsset changes and when any of the contents of its media selection groups change, but only for changes that occur after the status of the value of @"availableMediaCharacteristicsWithMediaSelectionOptions" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetMediaSelectionGroupsDidChangeNotification();

    /**
     * These export options can be used to produce movie files with video size appropriate to the device.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * H.264 and the audio will be compressed using AAC.  
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetLowQuality();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetMediumQuality();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHighestQuality();

    /**
     * These export options can be used to produce movie files with the specified video size.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * H.264 and the audio will be compressed using AAC.  Some devices cannot support some sizes. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset640x480();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset960x540();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset1280x720();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset1920x1080();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset3840x2160();

    /**
     * This export option will produce an audio-only .m4a file with appropriate iTunes gapless playback data
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetAppleM4A();

    /**
     * This export option will cause the media of all tracks to be passed through to the output exactly as stored in the source asset, except for
     * tracks for which passthrough is not possible, usually because of constraints of the container format as indicated by the specified outputFileType.
     * This option is not included in the arrays returned by -allExportPresets and -exportPresetsCompatibleWithAsset. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetPassthrough();

    /**
     * [@constant]		AVAssetImageGeneratorApertureModeCleanAperture
     * 
     * Both pixel aspect ratio and clean aperture will be applied.
     * 
     * 	An image's clean aperture is a region of video free from transition artifacts caused by the encoding of the signal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeCleanAperture();

    /**
     * [@constant]		AVAssetImageGeneratorApertureModeProductionAperture
     * 
     * Only pixel aspect ratio will be applied.
     * 
     * 	The image is not cropped to the clean aperture region, but it is scaled according to the pixel aspect ratio. Use this option when you want to see all the pixels in your video, including the edges.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeProductionAperture();

    /**
     * [@constant]		AVAssetImageGeneratorApertureModeEncodedPixels
     * 
     * Neither pixel aspect ratio nor clean aperture will be applied.
     * 
     * 	The image is not cropped to the clean aperture region and is not scaled according to the pixel aspect ratio. The encoded dimensions of the image description are displayed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeEncodedPixels();

    /**
     *  Options keys for use with -[AVAssetResourceLoadingRequest streamingContentKeyRequestDataForApp:contentIdentifier:trackID:options:error:]
     * [@constant]		AVAssetResourceLoadingRequestStreamingContentKeyRequestRequiresPersistentKey
     * 
     * Specifies whether the content key request should require a persistable key to be returned from the key vendor. Value should be a NSNumber created with +[NSNumber numberWithBool:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetResourceLoadingRequestStreamingContentKeyRequestRequiresPersistentKey();

    /**
     * [@constant]		AVTrackAssociationTypeAudioFallback
     * 
     * Indicates an association between an audio track with another audio track that contains the same content but is typically encoded in a different format that's more widely supported, used to nominate a track that should be used in place of an unsupported track.
     * 
     * Associations of type AVTrackAssociationTypeAudioFallback are supported only between audio tracks.  This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a corresponding track that has content that's less widely supported, and the input parameter should be an instance of AVAssetWriterInput with a corresponding track that has content that's more widely supported.
     * 
     * Example: Using AVTrackAssociationTypeAudioFallback, a stereo audio track with media subtype kAudioFormatMPEG4AAC could be nominated as the "fallback" for an audio track encoding the same source material but with media subtype kAudioFormatAC3 and a 5.1 channel layout.  This would ensure that all clients are capable of playing back some form of the audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeAudioFallback();

    /**
     * [@constant]		AVTrackAssociationTypeChapterList
     * 
     * Indicates an association between a track with another track that contains chapter information.  The track containing chapter information may be a text track, a video track, or a timed metadata track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a corresponding track that has renderable content while the input parameter should be an instance of AVAssetWriterInput with a corresponding track that contains chapter metadata.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeChapterList();

    /**
     * [@constant]		AVTrackAssociationTypeForcedSubtitlesOnly
     * 
     * Indicates an association between a subtitle track typically containing both forced and non-forced subtitles with another subtitle track that contains only forced subtitles, for use when the user indicates that only essential subtitles should be displayed.  When such an association is established, the forced subtitles in both tracks are expected to present the same content in the same language but may have different timing.
     * 
     * Associations of type AVTrackAssociationTypeForcedSubtitlesOnly are supported only between subtitle tracks.  This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a corresponding subtitle track that contains non-forced subtitles, and the input parameter should be an instance of AVAssetWriterInput with a corresponding subtitle track that contains forced subtitles only.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeForcedSubtitlesOnly();

    /**
     * [@constant]		AVTrackAssociationTypeSelectionFollower
     * 
     * Indicates an association between a pair of tracks that specifies that, when the first of the pair is selected, the second of the pair should be considered an appropriate default for selection also.  Example: a subtitle track in the same language as an audio track may be associated with that audio track using AVTrackAssociationTypeSelectionFollower, to indicate that selection of the subtitle track, in the absence of a directive for subtitle selection from the user, can "follow" the selection of the audio track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the input parameter should be an instance of AVAssetWriterInput whose selection may depend on the selection of the receiver.  In the example above, the receiver would be the instance of AVAssetWriterInput corresponding with the audio track and the input parameter would be the instance of AVAssetWriterInput corresponding with the subtitle track.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeSelectionFollower();

    /**
     * [@constant]		AVTrackAssociationTypeTimecode
     * 
     * Indicates an association between a track with another track that contains timecode information.  The track containing timecode information should be a timecode track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a corresponding track that may be a video track or an audio track while the input parameter should be an instance of AVAssetWriterInput with a corresponding timecode track.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeTimecode();

    /**
     * [@constant]		AVTrackAssociationTypeMetadataReferent
     * 
     * Indicates an association between a metadata track and the track that's described or annotated via the contents of the metadata track.
     * 
     * 	This track association is optional for AVAssetTracks with the mediaType AVMediaTypeMetadata. When a metadata track lacks this track association, its contents are assumed to describe or annotate the asset as a whole.
     * 	This association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with mediaType AVMediaTypeMetadata while the input parameter should be an instance of AVAssetWriterInput that's used to create the track to which the contents of the receiver's corresponding metadata track refer.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeMetadataReferent();

    /**
     * [@constant]       AVAssetTrackTimeRangeDidChangeNotification
     * 
     * Posted when the timeRange of an AVFragmentedAssetTrack changes while the associated instance of AVFragmentedAsset is being minded by an AVFragmentedAssetMinder, but only for changes that occur after the status of the value of @"timeRange" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackTimeRangeDidChangeNotification();

    /**
     * [@constant]       AVAssetTrackSegmentsDidChangeNotification
     * 
     * Posted when the array of segments of an AVFragmentedAssetTrack changes while the associated instance of AVFragmentedAsset is being minded by an AVFragmentedAssetMinder, but only for changes that occur after the status of the value of @"segments" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackSegmentsDidChangeNotification();

    /**
     * [@constant]       AVAssetTrackTrackAssociationsDidChangeNotification
     * 
     * Posted when the collection of track associations of an AVAssetTrack changes, but only for changes that occur after the status of the value of @"availableTrackAssociationTypes" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackTrackAssociationsDidChangeNotification();

    /**
     * Values for time pitch algorithm
     * 
     * [@constant]      AVAudioTimePitchAlgorithmLowQualityZeroLatency
     * 			Low quality, very inexpensive. Suitable for brief fast-forward/rewind effects, low quality voice.
     *                Rate snapped to {0.5, 0.666667, 0.8, 1.0, 1.25, 1.5, 2.0}.
     * 
     * [@constant]      AVAudioTimePitchAlgorithmTimeDomain
     * 			Modest quality, less expensive. Suitable for voice.
     *                Variable rate from 1/32 to 32.
     * 
     * [@constant]      AVAudioTimePitchAlgorithmSpectral
     * 			Highest quality, most computationally expensive. Suitable for music.
     *                Variable rate from 1/32 to 32.
     * 
     * [@constant]      AVAudioTimePitchAlgorithmVarispeed
     * 			High quality, no pitch correction. Pitch varies with rate.
     *                Variable rate from 1/32 to 32.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmLowQualityZeroLatency();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmTimeDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmSpectral();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmVarispeed();

    /**
     * [@constant]		AVAssetDownloadTaskMinimumRequiredMediaBitrateKey
     * 
     * The lowest media bitrate greater than or equal to this value will be selected. Value should be a NSNumber in bps. If no suitable media bitrate is found, the highest media bitrate will be selected.
     * 			The value for this key should be a NSNumber.
     * 
     * By default, the highest media bitrate will be selected for download.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMinimumRequiredMediaBitrateKey();

    /**
     * [@constant]		AVAssetDownloadTaskMediaSelectionKey
     * 
     * The media selection for this download.
     * 			The value for this key should be an AVMediaSelection.
     * 
     * By default, media selections for AVAssetDownloadTask will be automatically selected.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMediaSelectionKey();

    /**
     * [@constant] AVCaptureDeviceWasConnectedNotification
     * 
     *    Posted when a device becomes available on the system.
     * 
     *    The notification object is an AVCaptureDevice instance representing the device that became available.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceWasConnectedNotification();

    /**
     * [@constant] AVCaptureDeviceWasDisconnectedNotification
     * 
     *    Posted when a device becomes unavailable on the system.
     * 
     *    The notification object is an AVCaptureDevice instance representing the device that became unavailable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceWasDisconnectedNotification();

    /**
     * [@constant] AVCaptureDeviceSubjectAreaDidChangeNotification
     * 
     *    Posted when the instance of AVCaptureDevice has detected a substantial change to the video subject area.
     * 
     *    Clients may observe the AVCaptureDeviceSubjectAreaDidChangeNotification to know when an instance of AVCaptureDevice has detected a substantial change to the video subject area. This notification is only sent if you first set subjectAreaChangeMonitoringEnabled to YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceSubjectAreaDidChangeNotification();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInMicrophone
     *    A built-in microphone.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInMicrophone();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInWideAngleCamera
     *    A built-in wide angle camera device. These devices are suitable for general purpose use.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInWideAngleCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTelephotoCamera
     *    A built-in camera device with a longer focal length than a wide angle camera. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTelephotoCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDualCamera
     *    A device that consists of two fixed focal length cameras, one wide and one telephoto. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice defaultDeviceWithDeviceType:mediaType:position:].
     * 
     *    A device of this device type supports the following features:
     *    - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     *    - Higher quality zoom for still captures by fusing images from both cameras.
     *    - Depth data delivery by measuring the disparity of matched features between the wide and telephoto cameras.
     *    - Delivery of photos from constituent devices (wide and telephoto cameras) via a single photo capture request.
     * 
     *    A device of this device type does not support the following features:
     *    - AVCaptureExposureModeCustom and manual exposure bracketing.
     *    - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     *    - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     *    Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the device switches from one camera to the other. The overall exposure, white balance, and focus position however should be consistent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDualCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDuoCamera
     *    A deprecated synonym for AVCaptureDeviceTypeBuiltInDualCamera. Please use AVCaptureDeviceTypeBuiltInDualCamera instead.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDuoCamera();

    /**
     * [@constant] AVCaptureMaxAvailableTorchLevel
     *    A special value that may be passed to -setTorchModeWithLevel:error: to set the torch to the maximum level currently available. Under thermal duress, the maximum available torch level may be less than 1.0.
     */
    @Generated
    @CVariable()
    public static native float AVCaptureMaxAvailableTorchLevel();

    /**
     * [@constant] AVCaptureLensPositionCurrent
     *    A special value that may be passed as the lensPosition parameter of setFocusModeLockedWithLensPosition:completionHandler: to indicate that the caller does not wish to specify a value for the lensPosition property, and that it should instead be set to its current value. Note that the device may be adjusting lensPosition at the time of the call, in which case the value at which lensPosition is locked may differ from the value obtained by querying the lensPosition property.
     */
    @Generated
    @CVariable()
    public static native float AVCaptureLensPositionCurrent();

    /**
     * [@constant] AVCaptureExposureDurationCurrent
     *    A special value that may be passed as the duration parameter of setExposureModeCustomWithDuration:ISO:completionHandler: to indicate that the caller does not wish to specify a value for the exposureDuration property, and that it should instead be set to its current value. Note that the device may be adjusting exposureDuration at the time of the call, in which case the value to which exposureDuration is set may differ from the value obtained by querying the exposureDuration property.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime AVCaptureExposureDurationCurrent();

    /**
     * [@constant] AVCaptureISOCurrent
     *    A special value that may be passed as the ISO parameter of setExposureModeCustomWithDuration:ISO:completionHandler: to indicate that the caller does not wish to specify a value for the ISO property, and that it should instead be set to its current value. Note that the device may be adjusting ISO at the time of the call, in which case the value to which ISO is set may differ from the value obtained by querying the ISO property.
     */
    @Generated
    @CVariable()
    public static native float AVCaptureISOCurrent();

    /**
     * [@constant] AVCaptureExposureTargetBiasCurrent
     *    A special value that may be passed as the bias parameter of setExposureTargetBias:completionHandler: to indicate that the caller does not wish to specify a value for the exposureTargetBias property, and that it should instead be set to its current value.
     */
    @Generated
    @CVariable()
    public static native float AVCaptureExposureTargetBiasCurrent();

    /**
     * [@constant] AVCaptureWhiteBalanceGainsCurrent
     *    A special value that may be passed as a parameter of setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler: to indicate that the caller does not wish to specify a value for deviceWhiteBalanceGains, and that gains should instead be locked at their value at the moment that white balance is locked.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native AVCaptureWhiteBalanceGains AVCaptureWhiteBalanceGainsCurrent();

    /**
     * [@constant] AVCaptureInputPortFormatDescriptionDidChangeNotification
     * 
     *    This notification is posted when the value of an AVCaptureInputPort instance's formatDescription property changes.
     * 
     *    The notification object is the AVCaptureInputPort instance whose format description changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureInputPortFormatDescriptionDidChangeNotification();

    /**
     * [@constant] AVCaptureSessionRuntimeErrorNotification
     * 
     *    Posted when an unexpected error occurs while an AVCaptureSession instance is running.
     * 
     *    The notification object is the AVCaptureSession instance that encountered a runtime error. The userInfo dictionary contains an NSError for the key AVCaptureSessionErrorKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionRuntimeErrorNotification();

    /**
     * [@constant] AVCaptureSessionErrorKey
     * 
     *    The key used to provide an NSError describing the failure condition in an AVCaptureSessionRuntimeErrorNotification.
     * 
     *    AVCaptureSessionErrorKey may be found in the userInfo dictionary provided with an AVCaptureSessionRuntimeErrorNotification. The NSError associated with the notification gives greater detail on the nature of the error, and in some cases recovery suggestions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionErrorKey();

    /**
     * [@constant] AVCaptureSessionDidStartRunningNotification
     * 
     *    Posted when an instance of AVCaptureSession successfully starts running.
     * 
     *    Clients may observe the AVCaptureSessionDidStartRunningNotification to know when an instance of AVCaptureSession starts running.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionDidStartRunningNotification();

    /**
     * [@constant] AVCaptureSessionDidStopRunningNotification
     * 
     *    Posted when an instance of AVCaptureSession stops running.
     * 
     *    Clients may observe the AVCaptureSessionDidStopRunningNotification to know when an instance of AVCaptureSession stops running. An AVCaptureSession instance may stop running automatically due to external system conditions, such as the device going to sleep, or being locked by a user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionDidStopRunningNotification();

    /**
     * [@constant] AVCaptureSessionWasInterruptedNotification
     * 
     *    Posted when an instance of AVCaptureSession becomes interrupted.
     * 
     *    Clients may observe the AVCaptureSessionWasInterruptedNotification to know when an instance of AVCaptureSession has been interrupted, for example, by an incoming phone call, or alarm, or another application taking control of needed hardware resources. When appropriate, the AVCaptureSession instance will stop running automatically in response to an interruption.
     * 
     *    Beginning in iOS 9.0, the AVCaptureSessionWasInterruptedNotification userInfo dictionary contains an AVCaptureSessionInterruptionReasonKey indicating the reason for the interruption.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionWasInterruptedNotification();

    /**
     * [@constant] AVCaptureSessionInterruptionReasonKey
     * 
     *    The key used to provide an NSNumber describing the interruption reason in an AVCaptureSessionWasInterruptedNotification.
     * 
     *    AVCaptureSessionInterruptionReasonKey may be found in the userInfo dictionary provided with an AVCaptureSessionWasInterruptedNotification. The NSNumber associated with the notification tells you why the interruption occurred.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionReasonKey();

    /**
     * [@constant] AVCaptureSessionInterruptionEndedNotification
     * 
     *    Posted when an instance of AVCaptureSession ceases to be interrupted.
     * 
     *    Clients may observe the AVCaptureSessionInterruptionEndedNotification to know when an instance of AVCaptureSession ceases to be interrupted, for example, when a phone call ends, and hardware resources needed to run the session are again available. When appropriate, the AVCaptureSession instance that was previously stopped in response to an interruption will automatically restart once the interruption ends.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionEndedNotification();

    /**
     * [@constant] AVCaptureSessionPresetPhoto
     * 
     *    An AVCaptureSession preset suitable for high resolution photo quality output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetPhoto for full resolution photo quality output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetPhoto();

    /**
     * [@constant] AVCaptureSessionPresetHigh
     * 
     *    An AVCaptureSession preset suitable for high quality video and audio output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetHigh to achieve high quality video and audio output. AVCaptureSessionPresetHigh is the default sessionPreset value.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetHigh();

    /**
     * [@constant] AVCaptureSessionPresetMedium
     * 
     *    An AVCaptureSession preset suitable for medium quality output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetMedium to achieve output video and audio bitrates suitable for sharing over WiFi.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetMedium();

    /**
     * [@constant] AVCaptureSessionPresetLow
     * 
     *    An AVCaptureSession preset suitable for low quality output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetLow to achieve output video and audio bitrates suitable for sharing over 3G.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetLow();

    /**
     * [@constant] AVCaptureSessionPreset352x288
     * 
     *    An AVCaptureSession preset suitable for 352x288 video output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset352x288 to achieve CIF quality (352x288) output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset352x288();

    /**
     * [@constant] AVCaptureSessionPreset640x480
     * 
     *    An AVCaptureSession preset suitable for 640x480 video output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset640x480 to achieve VGA quality (640x480) output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset640x480();

    /**
     * [@constant] AVCaptureSessionPreset1280x720
     * 
     *    An AVCaptureSession preset suitable for 1280x720 video output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset1280x720 to achieve 1280x720 output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset1280x720();

    /**
     * [@constant] AVCaptureSessionPreset1920x1080
     * 
     *    An AVCaptureSession preset suitable for 1920x1080 video output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset1920x1080 to achieve 1920x1080 output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset1920x1080();

    /**
     * [@constant] AVCaptureSessionPreset3840x2160
     * 
     *    An AVCaptureSession preset suitable for 3840x2160 (UHD 4K) video output.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset3840x2160 to achieve 3840x2160 output.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset3840x2160();

    /**
     * [@constant] AVCaptureSessionPresetiFrame960x540
     * 
     *    An AVCaptureSession preset producing 960x540 Apple iFrame video and audio content.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetiFrame960x540 to achieve 960x540 quality iFrame H.264 video at ~30 Mbits/sec with AAC audio. QuickTime movies captured in iFrame format are optimal for editing applications.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetiFrame960x540();

    /**
     * [@constant] AVCaptureSessionPresetiFrame1280x720
     * 
     *    An AVCaptureSession preset producing 1280x720 Apple iFrame video and audio content.
     * 
     *    Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetiFrame1280x720 to achieve 1280x720 quality iFrame H.264 video at ~40 Mbits/sec with AAC audio. QuickTime movies captured in iFrame format are optimal for editing applications.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetiFrame1280x720();

    /**
     * [@constant] AVCaptureSessionPresetInputPriority
     * 
     *    An AVCaptureSession preset indicating that the formats of the session's inputs are being given priority.
     * 
     *    By calling -setSessionPreset:, clients can easily configure an AVCaptureSession to produce a desired quality of service level. The session configures its inputs and outputs optimally to produce the QoS level indicated. Clients who need to ensure a particular input format is chosen can use AVCaptureDevice's -setActiveFormat: method. When a client sets the active format on a device, the associated session's -sessionPreset property automatically changes to AVCaptureSessionPresetInputPriority. This change indicates that the input format selected by the client now dictates the quality of service level provided at the outputs. When a client sets the session preset to anything other than AVCaptureSessionPresetInputPriority, the session resumes responsibility for configuring inputs and outputs, and is free to change its inputs' activeFormat as needed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetInputPriority();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFoundationErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorDeviceKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorTimeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorFileSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPIDKey();

    /**
     * an NSNumber carrying a BOOL indicating whether the recording is playable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorRecordingSuccessfullyFinishedKey();

    /**
     * an NSString, as defined in AVMediaFormat.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorMediaTypeKey();

    /**
     * an NSArray of NSNumbers carrying four character codes (4ccs) as defined in CoreAudioTypes.h for audio media and in CMFormatDescription.h for video media.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorMediaSubTypeKey();

    /**
     * an NSValue carrying a CMTime
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPresentationTimeStampKey();

    /**
     * an NSNumber carrying a CMPersistentTrackID
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPersistentTrackIDKey();

    /**
     * an NSString, as defined in AVMediaFormat.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorFileTypeKey();

    /**
     * [@constant] AVAudioEngineConfigurationChangeNotification
     * 
     * 	A notification generated on engine configuration changes when rendering to/from an audio
     * 	device.
     * 
     * Register for this notification on your engine instances, as follows:
     * 
     * ```
     * [[NSNotificationCenter defaultCenter] addObserver: myObject
     * 	 selector:    @selector(handleInterruption:)
     * 	 name:        AVAudioEngineConfigurationChangeNotification
     * 	 object:      engine];
     * ```
     * 
     * When the engine's I/O unit observes a change to the audio input or output hardware's
     * channel count or sample rate, the engine stops itself (see `AVAudioEngine(stop)`), and
     * issues this notification.
     * The nodes remain attached and connected with previously set formats. However, the app
     * must reestablish connections if the connection formats need to change (e.g. in an
     * input node chain, connections must follow the hardware sample rate, while in an output only
     * chain, the output node supports rate conversion).
     * 
     * Note that the engine must not be deallocated from within the client's notification handler
     * because the callback happens on an internal dispatch queue and can deadlock while trying to
     * synchronously teardown the engine.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioEngineConfigurationChangeNotification();

    /**
     * value is an integer (format ID) from CoreAudioTypes.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFormatIDKey();

    /**
     * value is floating point in Hertz
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateKey();

    /**
     * value is an integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVNumberOfChannelsKey();

    /**
     * value is an integer, one of: 8, 16, 24, 32
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMBitDepthKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsBigEndianKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsFloatKey();

    /**
     * value is a BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLinearPCMIsNonInterleaved();

    /**
     * value is an integer from enum AVAudioQuality
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderAudioQualityKey();

    /**
     * value is an integer from enum AVAudioQuality. only relevant for AVAudioBitRateStrategy_Variable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderAudioQualityForVBRKey();

    /**
     * value is an integer.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRateKey();

    /**
     * value is an integer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRatePerChannelKey();

    /**
     * value is an AVAudioBitRateStrategy constant. see below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitRateStrategyKey();

    /**
     * value is an integer from 8 to 32
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVEncoderBitDepthHintKey();

    /**
     * value is an AVSampleRateConverterAlgorithm constant. see below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithmKey();

    /**
     * value is an integer from enum AVAudioQuality
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAudioQualityKey();

    /**
     * value is an NSData containing an AudioChannelLayout
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVChannelLayoutKey();

    /**
     * values for AVEncoderBitRateStrategyKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_Constant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_LongTermAverage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_VariableConstrained();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioBitRateStrategy_Variable();

    /**
     * values for AVSampleRateConverterAlgorithmKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_Normal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_Mastering();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleRateConverterAlgorithm_MinimumPhase();

    /**
     * Notification sent to registered listeners when the system has interrupted the audio
     * 		session and when the interruption has ended.
     * 
     *    Check the notification's userInfo dictionary for the interruption type, which is either
     *    Begin or End. In the case of an end interruption notification, check the userInfo dictionary
     *    for AVAudioSessionInterruptionOptions that indicate whether audio playback should resume. In
     *    cases where the interruption is a consequence of the application being suspended, the info
     *    dictionary will contain AVAudioSessionInterruptionWasSuspendedKey, with the boolean value set
     *    to true.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionNotification();

    /**
     * Notification sent to registered listeners when an audio route change has occurred.
     * 
     * Check the notification's userInfo dictionary for the route change reason and for a description
     * of the previous audio route.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangeNotification();

    /**
     * Notification sent to registered listeners if the media server is killed.
     * 
     * In the event that the server is killed, take appropriate steps to handle requests that come in
     * before the server resets.  See Technical Q&A QA1749.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionMediaServicesWereLostNotification();

    /**
     * Notification sent to registered listeners when the media server restarts.
     * 
     * In the event that the server restarts, take appropriate steps to re-initialize any audio objects
     * used by your application.  See Technical Q&A QA1749.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionMediaServicesWereResetNotification();

    /**
     * Notification sent to registered listeners when they are in the foreground with an active
     * 	audio session and primary audio from other applications starts and stops.
     * 
     * Check the notification's userInfo dictionary for the notification type, which is either Begin or
     * End. Foreground applications may use this notification as a hint to enable or disable audio that
     * is secondary to the functionality of the application. For more information, see the related
     * property secondaryAudioShouldBeSilencedHint.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSilenceSecondaryAudioHintNotification();

    /**
     * keys for AVAudioSessionInterruptionNotification
     * Value is an NSNumber representing an AVAudioSessionInterruptionType
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionTypeKey();

    /**
     * Only present for end interruption events.  Value is of type AVAudioSessionInterruptionOptions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionOptionKey();

    /**
     * keys for AVAudioSessionRouteChangeNotification
     * value is an NSNumber representing an AVAudioSessionRouteChangeReason
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangeReasonKey();

    /**
     * value is AVAudioSessionRouteDescription *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionRouteChangePreviousRouteKey();

    /**
     * keys for AVAudioSessionSilenceSecondaryAudioHintNotification
     * value is an NSNumber representing an AVAudioSessionSilenceSecondaryAudioHintType
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionSilenceSecondaryAudioHintTypeKey();

    /**
     * Use this category for background sounds such as rain, car engine noise, etc.
     * Mixes with other music. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryAmbient();

    /**
     * Use this category for background sounds.  Other music will stop playing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategorySoloAmbient();

    /**
     * Use this category for music tracks.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryPlayback();

    /**
     * Use this category when recording audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryRecord();

    /**
     * Use this category when recording and playing back audio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryPlayAndRecord();

    /**
     * Use this category when using a hardware codec or signal processor while
     * not playing or recording audio. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryAudioProcessing();

    /**
     * Use this category to customize the usage of available audio accessories and built-in audio hardware.
     * For example, this category provides an application with the ability to use an available USB output
     * and headphone output simultaneously for separate, distinct streams of audio data. Use of
     * this category by an application requires a more detailed knowledge of, and interaction with,
     * the capabilities of the available audio routes.  May be used for input, output, or both.
     * Note that not all output types and output combinations are eligible for multi-route.  Input is limited
     * to the last-in input port. Eligible inputs consist of the following:
     * AVAudioSessionPortUSBAudio, AVAudioSessionPortHeadsetMic, and AVAudioSessionPortBuiltInMic.
     * Eligible outputs consist of the following:
     * AVAudioSessionPortUSBAudio, AVAudioSessionPortLineOut, AVAudioSessionPortHeadphones, AVAudioSessionPortHDMI,
     * and AVAudioSessionPortBuiltInSpeaker.
     * Note that AVAudioSessionPortBuiltInSpeaker is only allowed to be used when there are no other eligible
     * outputs connected.  
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionCategoryMultiRoute();

    /**
     * The default mode
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeDefault();

    /**
     * Only valid with AVAudioSessionCategoryPlayAndRecord.  Appropriate for Voice over IP
     * (VoIP) applications.  Reduces the number of allowable audio routes to be only those
     * that are appropriate for VoIP applications and may engage appropriate system-supplied
     * signal processing.  Has the side effect of setting AVAudioSessionCategoryOptionAllowBluetooth 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVoiceChat();

    /**
     * Set by Game Kit on behalf of an application that uses a GKVoiceChat object; valid
     * only with the AVAudioSessionCategoryPlayAndRecord category.
     * Do not set this mode directly. If you need similar behavior and are not using
     * a GKVoiceChat object, use AVAudioSessionModeVoiceChat instead. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeGameChat();

    /**
     * Only valid with AVAudioSessionCategoryPlayAndRecord or AVAudioSessionCategoryRecord.
     * Modifies the audio routing options and may engage appropriate system-supplied signal processing. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVideoRecording();

    /**
     * Appropriate for applications that wish to minimize the effect of system-supplied signal
     * processing for input and/or output audio signals. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeMeasurement();

    /**
     * Engages appropriate output signal processing for movie playback scenarios.  Currently
     * only applied during playback over built-in speaker. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeMoviePlayback();

    /**
     * Only valid with kAudioSessionCategory_PlayAndRecord. Reduces the number of allowable audio
     * routes to be only those that are appropriate for video chat applications. May engage appropriate
     * system-supplied signal processing.  Has the side effect of setting
     * AVAudioSessionCategoryOptionAllowBluetooth and AVAudioSessionCategoryOptionDefaultToSpeaker. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVideoChat();

    /**
     * Appropriate for applications which play spoken audio and wish to be paused (via audio session interruption) rather than ducked
     * if another app (such as a navigation app) plays a spoken audio prompt.  Examples of apps that would use this are podcast players and
     * audio books.  For more information, see the related category option AVAudioSessionCategoryOptionInterruptSpokenAudioAndMixWithOthers. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeSpokenAudio();

    /**
     * input port types
     *  Line level input on a dock connector
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortLineIn();

    /**
     * Built-in microphone on an iOS device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInMic();

    /**
     * Microphone on a wired headset.  Headset refers to an accessory that has headphone outputs paired with a
     * microphone.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHeadsetMic();

    /**
     * Line level output on a dock connector
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortLineOut();

    /**
     * Headphone or headset output
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHeadphones();

    /**
     * Output on a Bluetooth A2DP device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothA2DP();

    /**
     * The speaker you hold to your ear when on a phone call
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInReceiver();

    /**
     * Built-in speaker on an iOS device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBuiltInSpeaker();

    /**
     * Output via High-Definition Multimedia Interface
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortHDMI();

    /**
     * Output on a remote Air Play device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortAirPlay();

    /**
     * Output on a Bluetooth Low Energy device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothLE();

    /**
     * Input or output on a Bluetooth Hands-Free Profile device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortBluetoothHFP();

    /**
     * Input or output on a Universal Serial Bus device
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortUSBAudio();

    /**
     * Input or output via Car Audio
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortCarAudio();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionLocationUpper();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionLocationLower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationTop();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationBottom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationFront();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationBack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionOrientationRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternOmnidirectional();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternCardioid();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternSubcardioid();

    /**
     * Standard Audio Unit Types
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeOutput();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMusicDevice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMusicEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeFormatConverter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMixer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypePanner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeGenerator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeOfflineEffect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitTypeMIDIProcessor();

    /**
     * Standard Audio Unit Manufacturers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitManufacturerNameApple();

    /**
     * The notification object is an AVAudioUnitComponent object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitComponentTagsDidChangeNotification();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceMinimumSpeechRate();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceMaximumSpeechRate();

    @Generated
    @CVariable()
    public static native float AVSpeechUtteranceDefaultSpeechRate();

    /**
     * Use the Alex identifier with voiceWithIdentifier:. If the voice is present on the system,
     * an AVSpeechSynthesisVoice will be returned. Alex is en-US only.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSpeechSynthesisVoiceIdentifierAlex();

    /**
     * NSString, containing International Phonetic Alphabet (IPA) symbols. Controls pronunciation of a certain word or phrase, e.g. a proper name.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSpeechSynthesisIPANotationAttribute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeAudio();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeClosedCaption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeSubtitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeTimecode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeMetadata();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeMuxed();

    /**
     * [@constant] AVMediaTypeMetadataObject
     * 
     * mediaType of AVCaptureInputPorts that provide AVMetadataObjects.
     * 
     * Prior to iOS 9.0, camera AVCaptureDeviceInputs provide metadata (detected faces and barcodes) to an
     * AVCaptureMetadataOutput through an AVCaptureInputPort whose mediaType is AVMediaTypeMetadata.  The
     * AVCaptureMetadataOutput presents metadata to the client as an array of AVMetadataObjects, which are
     * defined by Apple and not externally subclassable.  Starting in iOS 9.0, clients may record arbitrary
     * metadata to a movie file using the AVCaptureMovieFileOutput.  The movie file output consumes metadata
     * in a different format than the AVCaptureMetadataOutput, namely it accepts CMSampleBuffers of type
     * 'meta'.  Starting in iOS 9.0, two types of AVCaptureInput can produce suitable metadata for the
     * movie file output.
     * 
     * <ul>
     * <li>The camera AVCaptureDeviceInput now presents an additional AVCaptureInputPort for recording detected
     * faces to a movie file. When linked on or after iOS 9, ports that deliver AVCaptureMetadataObjects have a
     * mediaType of AVMediaTypeMetadataObject rather than AVMediaTypeMetadata.  Input ports that deliver CMSampleBuffer
     * metadata have a mediaType of AVMediaTypeMetadata.</li>
     * 
     * <li>New to iOS 9 is the AVCaptureMetadataInput, which allows clients to record arbitrary metadata to a movie
     * file.  Clients package metadata as an AVTimedMetadataGroup, the AVCaptureMetadataInput presents a port of mediaType
     * AVMediaTypeMetadata, and when connected to a movie file output, transforms the timed metadata group's AVMetadataItems
     * into CMSampleBuffers which can be written to the movie file.</li>
     * </ul>
     * 
     * When linked on or after iOS 9, AVCaptureInputPorts with a mediaType of AVMediaTypeMetadata are handled
     * specially by the AVCaptureSession. When inputs and outputs are added to the session, the session does
     * not form connections implicitly between eligible AVCaptureOutputs and input ports of type AVMediaTypeMetadata.
     * If clients want to record a particular kind of metadata to a movie, they must manually form connections
     * between a AVMediaTypeMetadata port and the movie file output using AVCaptureSession's -addConnection API.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeMetadataObject();

    /**
     * [@constant] AVMediaCharacteristicVisual
     * 
     * A media characteristic that indicates that a track or media selection option includes visual content.
     * 
     * AVMediaTypeVideo, AVMediaTypeSubtitle, AVMediaTypeClosedCaption are examples of media types with the characteristic AVMediaCharacteristicVisual.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicVisual();

    /**
     * [@constant] AVMediaCharacteristicAudible
     * 
     * A media characteristic that indicates that a track or media selection option includes audible content.
     * 
     * AVMediaTypeAudio is a media type with the characteristic AVMediaCharacteristicAudible.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicAudible();

    /**
     * [@constant] AVMediaCharacteristicLegible
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content.
     * 
     * AVMediaTypeSubtitle and AVMediaTypeClosedCaption are examples of media types with the characteristic AVMediaCharacteristicLegible.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicLegible();

    /**
     * [@constant] AVMediaCharacteristicFrameBased
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's frame-based.
     * 
     * Frame-based content typically comprises discrete media samples that, once rendered, can remain current for indefinite periods of time without additional processing in support of "time-stretching". Further, any dependencies between samples are always explicitly signalled, so that the operations required to render any single sample can readily be performed on demand. AVMediaTypeVideo is the most common type of frame-based media. AVMediaTypeAudio is the most common counterexample. 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicFrameBased();

    /**
     * [@constant] AVMediaCharacteristicUsesWideGamutColorSpace
     * 
     * A media characteristic that indicates that a track uses a wide gamut color space and therefore may make use of colors that cannot be accurately represented otherwise.
     * 
     * A wide color space such as AVVideo*_P3_D65 contains additional dynamic range that may benefit from special treatment when compositing. Care should be taken to avoid clamping. Non-wide spaces include AVVideo*_ITU_R_709_2 and AVVideo*_SMPTE_C.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicUsesWideGamutColorSpace();

    /**
     * [@constant] AVMediaCharacteristicIsMainProgramContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by the content author as intrinsic to the presentation of the asset.
     * 
     * Example: an option that presents the main program audio for the presentation, regardless of locale, would typically have this characteristic.
     * The value of this characteristic is @"public.main-program-content".
     * Note for content authors: the presence of this characteristic for a media option is inferred; any option that does not have the characteristic AVMediaCharacteristicIsAuxiliaryContent is considered to have the characteristic AVMediaCharacteristicIsMainProgramContent.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicIsMainProgramContent();

    /**
     * [@constant] AVMediaCharacteristicIsAuxiliaryContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by the content author as auxiliary to the presentation of the asset.
     * 
     * The value of this characteristic is @"public.auxiliary-content".
     * Example: an option that presents audio media containing commentary on the presentation would typically have this characteristic.
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicIsAuxiliaryContent if it's explicitly tagged with that characteristic or if, as a member of an alternate track group, its associated track is excluded from autoselection.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicIsAuxiliaryContent();

    /**
     * [@constant] AVMediaCharacteristicContainsOnlyForcedSubtitles
     * 
     * A media characteristic that indicates that a track or media selection option presents only forced subtitles.
     * 
     * Media options with forced-only subtitles are typically selected when 1) the user has not selected a legible option with an accessibility characteristic or an auxiliary purpose and 2) its locale matches the locale of the selected audible media selection option.
     * The value of this characteristic is @"public.subtitles.forced-only".
     * Note for content authors: the presence of this characteristic for a legible media option may be inferred from the format description of the associated track that presents the subtitle media, if the format description carries sufficient information to indicate the presence or absence of forced and non-forced subtitles. If the format description does not carry this information, the legible media option can be explicitly tagged with the characteristic.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicContainsOnlyForcedSubtitles();

    /**
     * [@constant] AVMediaCharacteristicTranscribesSpokenDialogForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the language of its specified locale that:
     * 	- transcribes spoken dialog and
     * 	- identifies speakers whenever other visual cues are insufficient for a viewer to determine who is speaking.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as with AVMediaCharacteristicDescribesMusicAndSoundForAccessibility.
     * 
     * A legible track provided for accessibility purposes that's associated with an audio track that has no spoken dialog can be tagged with this characteristic, because it trivially meets these requirements.
     * 
     * The value of this characteristic is @"public.accessibility.transcribes-spoken-dialog".
     * 
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicTranscribesSpokenDialogForAccessibility only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicTranscribesSpokenDialogForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicDescribesMusicAndSoundForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the language of its specified locale that:
     * 	- describes music and
     * 	- describes sound other than spoken dialog, such as sound effects and significant silences, occurring in program audio.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as with AVMediaCharacteristicTranscribesSpokenDialogForAccessibility.
     * 
     * A legible track provided for accessibility purposes that's associated with an audio track without music and without sound other than spoken dialog -- lacking even significant silences -- can be tagged with this characteristic, because it trivially meets these requirements.
     * 
     * The value of this characteristic is @"public.accessibility.describes-music-and-sound".
     * 
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicDescribesMusicAndSoundForAccessibility only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDescribesMusicAndSoundForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicEasyToRead
     * 
     * A media characteristic that indicates that a track or media selection option provides legible content in the language of its specified locale that has been edited for ease of reading.
     * 
     * The value of this characteristic is @"public.easy-to-read".
     * 
     * Closed caption tracks that carry "easy reader" captions (per the CEA-608 specification) should be tagged with this characteristic. Subtitle tracks can also be tagged with this characteristic, where appropriate.
     * 
     * Note for content authors: for QuickTime movie and .m4v files a track is considered to have the characteristic AVMediaCharacteristicEasyToRead only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicEasyToRead();

    /**
     * [@constant] AVMediaCharacteristicDescribesVideoForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option provides descriptions of the visual portion of the presentation that are sufficient to comprehend essential information that it depicts, such as action and setting.
     * 
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.accessibility.describes-video".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicDescribesVideoForAccessibility only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDescribesVideoForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicLanguageTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language or dialect translation of originally or previously produced content, intended to be used as a substitute for that content by users who prefer its designated language.
     * 
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicLanguageTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicLanguageTranslation();

    /**
     * [@constant] AVMediaCharacteristicDubbedTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language or dialect translation of originally or previously produced content, created by substituting most or all of the dialog in a previous mix of audio content with dialog spoken in its designated language.
     * 
     * Tracks to which this characteristic is assigned should typically also be assigned the characteristic AVMediaCharacteristicLanguageTranslation.
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation.dubbed".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicDubbedTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDubbedTranslation();

    /**
     * [@constant] AVMediaCharacteristicVoiceOverTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language translation of originally or previously produced content, created by adding, in its designated language, a verbal interpretation of dialog and translations of other important information to a new mix of the audio content.
     * 
     * Tracks to which this characteristic is assigned should typically also be assigned the characteristic AVMediaCharacteristicLanguageTranslation.
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation.voice-over".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the characteristic AVMediaCharacteristicVoiceOverTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicVoiceOverTranslation();

    /**
     * [@constant] AVFileTypeQuickTimeMovie
     * 
     * A UTI for the QuickTime movie file format.
     * 
     * The value of this UTI is @"com.apple.quicktime-movie".
     * Files are identified with the .mov and .qt extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeQuickTimeMovie();

    /**
     * [@constant] AVFileTypeMPEG4
     * 
     * A UTI for the MPEG-4 file format.
     * 
     * The value of this UTI is @"public.mpeg-4".
     * Files are identified with the .mp4 extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeMPEG4();

    /**
     * [@constant] AVFileTypeAppleM4V
     * 
     * The value of this UTI is @"com.apple.m4v-video".
     * Files are identified with the .m4v extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAppleM4V();

    /**
     * [@constant] AVFileTypeAppleM4A
     * 
     * The value of this UTI is @"com.apple.m4a-audio".
     * Files are identified with the .m4a extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAppleM4A();

    /**
     * [@constant] AVFileType3GPP
     * 
     * A UTI for the 3GPP file format.
     * 
     * The value of this UTI is @"public.3gpp".
     * Files are identified with the .3gp, .3gpp, and .sdv extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileType3GPP();

    /**
     * [@constant] AVFileType3GPP2
     * 
     * A UTI for the 3GPP file format.
     * 
     * The value of this UTI is @"public.3gpp2".
     * Files are identified with the .3g2, .3gp2 extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileType3GPP2();

    /**
     * [@constant] AVFileTypeCoreAudioFormat
     * 
     * A UTI for the CoreAudio file format.
     * 
     * The value of this UTI is @"com.apple.coreaudio-format".
     * Files are identified with the .caf extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeCoreAudioFormat();

    /**
     * [@constant] AVFileTypeWAVE
     * 
     * A UTI for the WAVE audio file format.
     * 
     * The value of this UTI is @"com.microsoft.waveform-audio".
     * Files are identified with the .wav, .wave, and .bwf extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeWAVE();

    /**
     * [@constant] AVFileTypeAIFF
     * 
     * A UTI for the AIFF audio file format.
     * 
     * The value of this UTI is @"public.aiff-audio".
     * Files are identified with the .aif and .aiff extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAIFF();

    /**
     * [@constant] AVFileTypeAIFC
     * 
     * A UTI for the AIFC audio file format.
     * 
     * The value of this UTI is @"public.aifc-audio".
     * Files are identified with the .aifc and .cdda extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAIFC();

    /**
     * [@constant] AVFileTypeAMR
     * 
     * A UTI for the adaptive multi-rate audio file format.
     * 
     * The value of this UTI is @"org.3gpp.adaptive-multi-rate-audio".
     * Files are identified with the .amr extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAMR();

    /**
     * [@constant] AVFileTypeMPEGLayer3
     * 
     * A UTI for the MPEG layer 3 audio file format.
     * 
     * The value of this UTI is @"public.mp3".
     * Files are identified with the .mp3 extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeMPEGLayer3();

    /**
     * [@constant] AVFileTypeSunAU
     * 
     * A UTI for the Sun/NeXT audio file format.
     * 
     * The value of this UTI is @"public.au-audio".
     * Files are identified with the .au and .snd extensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeSunAU();

    /**
     * [@constant] AVFileTypeAC3
     * 
     * A UTI for the AC-3 audio file format.
     * 
     * The value of this UTI is @"public.ac3-audio".
     * Files are identified with the .ac3 extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAC3();

    /**
     * [@constant] AVFileTypeEnhancedAC3
     * 
     * A UTI for the enhanced AC-3 audio file format.
     * 
     * The value of this UTI is @"public.enhanced-ac3-audio".
     * Files are identified with the .eac3 extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeEnhancedAC3();

    /**
     * [@constant] AVStreamingKeyDeliveryContentKeyType
     * 
     * A UTI for streaming key delivery content keys
     * 
     * The value of this UTI is @"com.apple.streamingkeydelivery.contentkey".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVStreamingKeyDeliveryContentKeyType();

    /**
     * [@constant] AVStreamingKeyDeliveryPersistentContentKeyType
     * 
     * A UTI for persistent streaming key delivery content keys
     * 
     * The value of this UTI is @"com.apple.streamingkeydelivery.persistentcontentkey".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVStreamingKeyDeliveryPersistentContentKeyType();

    /**
     * CommonMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceCommon();

    /**
     * Metadata common keys
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCreator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySubject();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyContributor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLastModifiedDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySource();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLanguage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyRelation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCopyrights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAlbumName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyArtwork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySoftware();

    /**
     * QuickTimeUserData
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatQuickTimeUserData();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceQuickTimeUserData();

    /**
     * QuickTimeUserData keys
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyChapter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDisclaimer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyFullName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyHostComputer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyInformation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyKeywords();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalSource();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPerformers();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyProduct();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeySoftware();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeySpecialPlaybackRequirements();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTrack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyWarning();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyWriter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyURLLink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyLocationISO6709();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTrackName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTaggedCharacteristic();

    /**
     * ISO UserData
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatISOUserData();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceISOUserData();

    /**
     * ISO UserData keys (includes 3GPP keys)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyTaggedCharacteristic();

    /**
     * [@constant]		AVMetadataISOUserDataKeyDate
     * 
     * ISO User data key for the content creation date/time.
     * 
     * The value is date and time, formatted according to ISO 8601, when the content was created. For clips captured by recording devices, this is typically the date and time when the clip’s recording started. When stored in AV(Mutable)MetadataItem, the value type must be either NSDate or NSString. When NSString is used, the value uses one of ISO 8601 formats such as "2016-01-11T17:31:10Z".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyRecordingYear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyCollection();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyUserRating();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyThumbnail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyAlbumAndTrack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyKeywordList();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyMediaClassification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyMediaRating();

    /**
     * QuickTimeMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatQuickTimeMetadata();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceQuickTimeMetadata();

    /**
     * QuickTimeMetadata keys. For more information, see the QuickTime File Format Specification, available as part of the Mac OS X Reference Library at http://developer.apple.com/library/mac/navigation/
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDisplayName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyInformation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyKeywords();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArtwork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeySoftware();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyYear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyiXML();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationISO6709();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCameraIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCollectionUser();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyRatingUser();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationNote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationRole();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirectionFacing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirectionMotion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyContentIdentifier();

    /**
     * iTunesMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatiTunesMetadata();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceiTunes();

    /**
     * iTunesMetadata keys
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyUserComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCoverArt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyReleaseDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPredefinedGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyUserGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySongName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyTrackSubTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEncodingTool();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAlbumArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAccountKind();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAppleID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtistID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySongID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDiscCompilation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDiscNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyGenreID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyGrouping();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPlaylistID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyContentRating();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyBeatsPerMin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyTrackNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyLyrics();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAcknowledgement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyConductor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyLinerNotes();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyRecordCompany();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySoundEngineer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySoloist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyThanks();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyOnlineExtras();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyExecProducer();

    /**
     * ID3Metadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatID3Metadata();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceID3();

    /**
     * AENC Audio encryption
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAudioEncryption();

    /**
     * APIC Attached picture
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAttachedPicture();

    /**
     * ASPI Audio seek point index
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAudioSeekPointIndex();

    /**
     * COMM Comments
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyComments();

    /**
     * COMR Commercial frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommercial();

    /**
     * COMR Commercial frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommerical();

    /**
     * ENCR Encryption method registration
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncryption();

    /**
     * EQUA Equalization
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEqualization();

    /**
     * EQU2 Equalisation (2)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEqualization2();

    /**
     * ETCO Event timing codes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEventTimingCodes();

    /**
     * GEOB General encapsulated object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyGeneralEncapsulatedObject();

    /**
     * GRID Group identification registration
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyGroupIdentifier();

    /**
     * IPLS Involved people list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v23();

    /**
     * LINK Linked information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLink();

    /**
     * MCDI Music CD identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMusicCDIdentifier();

    /**
     * MLLT MPEG location lookup table
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMPEGLocationLookupTable();

    /**
     * OWNE Ownership frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOwnership();

    /**
     * PRIV Private frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPrivate();

    /**
     * PCNT Play counter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPlayCounter();

    /**
     * POPM Popularimeter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPopularimeter();

    /**
     * POSS Position synchronisation frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPositionSynchronization();

    /**
     * RBUF Recommended buffer size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecommendedBufferSize();

    /**
     * RVAD Relative volume adjustment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment();

    /**
     * RVA2 Relative volume adjustment (2)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment2();

    /**
     * RVRB Reverb
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyReverb();

    /**
     * SEEK Seek frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySeek();

    /**
     * SIGN Signature frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySignature();

    /**
     * SYLT Synchronized lyric/text
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySynchronizedLyric();

    /**
     * SYTC Synchronized tempo codes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySynchronizedTempoCodes();

    /**
     * TALB Album/Movie/Show title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAlbumTitle();

    /**
     * TBPM BPM (beats per minute)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyBeatsPerMinute();

    /**
     * TCOM Composer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyComposer();

    /**
     * TCON Content type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyContentType();

    /**
     * TCOP Copyright message
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCopyright();

    /**
     * TDAT Date
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyDate();

    /**
     * TDEN Encoding time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodingTime();

    /**
     * TDLY Playlist delay
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPlaylistDelay();

    /**
     * TDOR Original release time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalReleaseTime();

    /**
     * TDRC Recording time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecordingTime();

    /**
     * TDRL Release time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyReleaseTime();

    /**
     * TDTG Tagging time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTaggingTime();

    /**
     * TENC Encoded by
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodedBy();

    /**
     * TEXT Lyricist/Text writer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLyricist();

    /**
     * TFLT File type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyFileType();

    /**
     * TIME Time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTime();

    /**
     * TIPL Involved people list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v24();

    /**
     * TIT1 Content group description
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyContentGroupDescription();

    /**
     * TIT2 Title/songname/content description
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTitleDescription();

    /**
     * TIT3 Subtitle/Description refinement
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySubTitle();

    /**
     * TKEY Initial key
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInitialKey();

    /**
     * TLAN Language(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLanguage();

    /**
     * TLEN Length
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLength();

    /**
     * TMCL Musician credits list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMusicianCreditsList();

    /**
     * TMED Media type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMediaType();

    /**
     * TMOO Mood
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMood();

    /**
     * TOAL Original album/movie/show title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalAlbumTitle();

    /**
     * TOFN Original filename
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalFilename();

    /**
     * TOLY Original lyricist(s)/text writer(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalLyricist();

    /**
     * TOPE Original artist(s)/performer(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalArtist();

    /**
     * TORY Original release year
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalReleaseYear();

    /**
     * TOWN File owner/licensee
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyFileOwner();

    /**
     * TPE1 Lead performer(s)/Soloist(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLeadPerformer();

    /**
     * TPE2 Band/orchestra/accompaniment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyBand();

    /**
     * TPE3 Conductor/performer refinement
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyConductor();

    /**
     * TPE4 Interpreted, remixed, or otherwise modified by
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyModifiedBy();

    /**
     * TPOS Part of a set
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPartOfASet();

    /**
     * TPRO Produced notice
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyProducedNotice();

    /**
     * TPUB Publisher
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPublisher();

    /**
     * TRCK Track number/Position in set
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTrackNumber();

    /**
     * TRDA Recording dates
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecordingDates();

    /**
     * TRSN Internet radio station name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternetRadioStationName();

    /**
     * TRSO Internet radio station owner
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternetRadioStationOwner();

    /**
     * TSIZ Size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySize();

    /**
     * TSOA Album sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAlbumSortOrder();

    /**
     * TSOP Performer sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPerformerSortOrder();

    /**
     * TSOT Title sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTitleSortOrder();

    /**
     * TSRC ISRC (international standard recording code)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternationalStandardRecordingCode();

    /**
     * TSSE Software/Hardware and settings used for encoding
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodedWith();

    /**
     * TSST Set subtitle
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySetSubtitle();

    /**
     * TYER Year
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyYear();

    /**
     * TXXX User defined text information frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUserText();

    /**
     * UFID Unique file identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUniqueFileIdentifier();

    /**
     * USER Terms of use
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTermsOfUse();

    /**
     * USLT Unsynchronized lyric/text transcription
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUnsynchronizedLyric();

    /**
     * WCOM Commercial information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommercialInformation();

    /**
     * WCOP Copyright/Legal information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCopyrightInformation();

    /**
     * WOAF Official audio file webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialAudioFileWebpage();

    /**
     * WOAR Official artist/performer webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialArtistWebpage();

    /**
     * WOAS Official audio source webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialAudioSourceWebpage();

    /**
     * WORS Official Internet radio station homepage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage();

    /**
     * WPAY Payment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPayment();

    /**
     * WPUB Publishers official webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialPublisherWebpage();

    /**
     * WXXX User defined URL link frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUserURL();

    /**
     * Icecast/ShoutCAST streaming metadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceIcy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIcyMetadataKeyStreamTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIcyMetadataKeyStreamURL();

    /**
     * HTTP Live Streaming metadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatHLSMetadata();

    /**
     * HLS Metadata does not define its own keySpace or keys. Use of the keySpace AVMetadataKeySpaceQuickTimeMetadata and its keys is recommended.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceHLSDateRange();

    /**
     * [@constant]		AVMetadataExtraAttributeValueURIKey
     * 
     * When present in an item's extraAttributes dictionary, identifies the resource to be used as the item's value. Values for this key are of type NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeValueURIKey();

    /**
     * [@constant]		AVMetadataExtraAttributeBaseURIKey
     * 
     * When present in an item's extraAttributes dictionary, identifies the base URI against which other URIs related to the item are to be resolved, e.g. AVMetadataExtraAttributeValueURIKey. Values for this key are of type NSString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeBaseURIKey();

    /**
     * [@constant]		AVMetadataExtraAttributeInfoKey
     * 
     * More information about the item; specific to the
     * 				item keySpace & key.
     * 
     * For example, this key is used with the following ID3 tags:
     * 				TXXX, WXXX, APIC, GEOB: carries the Description
     * 				PRIV: carries the Owner Identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeInfoKey();

    /**
     * CommonMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCreator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSubject();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierContributor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLastModifiedDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAssetIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSource();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLanguage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierRelation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCopyrights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAlbumName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierArtwork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSoftware();

    /**
     * QuickTimeUserData
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataChapter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDisclaimer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataFullName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataHostComputer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataInformation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataKeywords();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalSource();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPerformers();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataProduct();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataSoftware();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTrack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataWarning();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataWriter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataURLLink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataLocationISO6709();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTrackName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic();

    /**
     * ISO UserData (includes 3GPP)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataTaggedCharacteristic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataRecordingYear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataCollection();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataUserRating();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataThumbnail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataAlbumAndTrack();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataKeywordList();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataMediaClassification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataMediaRating();

    /**
     * QuickTimeMetadata. For more information, see the QuickTime File Format Specification, available as part of the Mac OS X Reference Library at http://developer.apple.com/library/mac/navigation/
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDisplayName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataInformation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataKeywords();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArtwork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataSoftware();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataYear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataiXML();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationISO6709();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataMake();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCameraIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCollectionUser();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataRatingUser();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationNote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationRole();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirectionFacing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirectionMotion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedFace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataVideoOrientation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataContentIdentifier();

    /**
     * iTunesMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAlbum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataUserComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCoverArt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCopyright();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataReleaseDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEncodedBy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPredefinedGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataUserGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSongName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataTrackSubTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEncodingTool();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataComposer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAlbumArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAccountKind();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAppleID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtistID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSongID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDiscCompilation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDiscNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataGenreID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataGrouping();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPlaylistID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataContentRating();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataBeatsPerMin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataTrackNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArranger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAuthor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataLyrics();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAcknowledgement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataConductor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDirector();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataLinerNotes();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataRecordCompany();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataOriginalArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPhonogramRights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataProducer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPerformer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPublisher();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSoundEngineer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSoloist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCredits();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataThanks();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataOnlineExtras();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataExecProducer();

    /**
     * AENC Audio encryption
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAudioEncryption();

    /**
     * APIC Attached picture
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAttachedPicture();

    /**
     * ASPI Audio seek point index
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAudioSeekPointIndex();

    /**
     * COMM Comments
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataComments();

    /**
     * COMR Commercial frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommercial();

    /**
     * COMR Commercial frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommerical();

    /**
     * ENCR Encryption method registration
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncryption();

    /**
     * EQUA Equalization
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEqualization();

    /**
     * EQU2 Equalisation (2)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEqualization2();

    /**
     * ETCO Event timing codes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEventTimingCodes();

    /**
     * GEOB General encapsulated object
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject();

    /**
     * GRID Group identification registration
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataGroupIdentifier();

    /**
     * IPLS Involved people list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23();

    /**
     * LINK Linked information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLink();

    /**
     * MCDI Music CD identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMusicCDIdentifier();

    /**
     * MLLT MPEG location lookup table
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMPEGLocationLookupTable();

    /**
     * OWNE Ownership frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOwnership();

    /**
     * PRIV Private frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPrivate();

    /**
     * PCNT Play counter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPlayCounter();

    /**
     * POPM Popularimeter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPopularimeter();

    /**
     * POSS Position synchronisation frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPositionSynchronization();

    /**
     * RBUF Recommended buffer size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecommendedBufferSize();

    /**
     * RVAD Relative volume adjustment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment();

    /**
     * RVA2 Relative volume adjustment (2)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2();

    /**
     * RVRB Reverb
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataReverb();

    /**
     * SEEK Seek frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSeek();

    /**
     * SIGN Signature frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSignature();

    /**
     * SYLT Synchronized lyric/text
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSynchronizedLyric();

    /**
     * SYTC Synchronized tempo codes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSynchronizedTempoCodes();

    /**
     * TALB Album/Movie/Show title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAlbumTitle();

    /**
     * TBPM BPM (beats per minute)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataBeatsPerMinute();

    /**
     * TCOM Composer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataComposer();

    /**
     * TCON Content type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataContentType();

    /**
     * TCOP Copyright message
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCopyright();

    /**
     * TDAT Date
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataDate();

    /**
     * TDEN Encoding time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodingTime();

    /**
     * TDLY Playlist delay
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPlaylistDelay();

    /**
     * TDOR Original release time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalReleaseTime();

    /**
     * TDRC Recording time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecordingTime();

    /**
     * TDRL Release time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataReleaseTime();

    /**
     * TDTG Tagging time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTaggingTime();

    /**
     * TENC Encoded by
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodedBy();

    /**
     * TEXT Lyricist/Text writer
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLyricist();

    /**
     * TFLT File type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataFileType();

    /**
     * TIME Time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTime();

    /**
     * TIPL Involved people list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24();

    /**
     * TIT1 Content group description
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataContentGroupDescription();

    /**
     * TIT2 Title/songname/content description
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTitleDescription();

    /**
     * TIT3 Subtitle/Description refinement
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSubTitle();

    /**
     * TKEY Initial key
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInitialKey();

    /**
     * TLAN Language(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLanguage();

    /**
     * TLEN Length
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLength();

    /**
     * TMCL Musician credits list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMusicianCreditsList();

    /**
     * TMED Media type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMediaType();

    /**
     * TMOO Mood
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMood();

    /**
     * TOAL Original album/movie/show title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalAlbumTitle();

    /**
     * TOFN Original filename
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalFilename();

    /**
     * TOLY Original lyricist(s)/text writer(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalLyricist();

    /**
     * TOPE Original artist(s)/performer(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalArtist();

    /**
     * TORY Original release year
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalReleaseYear();

    /**
     * TOWN File owner/licensee
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataFileOwner();

    /**
     * TPE1 Lead performer(s)/Soloist(s)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLeadPerformer();

    /**
     * TPE2 Band/orchestra/accompaniment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataBand();

    /**
     * TPE3 Conductor/performer refinement
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataConductor();

    /**
     * TPE4 Interpreted, remixed, or otherwise modified by
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataModifiedBy();

    /**
     * TPOS Part of a set
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPartOfASet();

    /**
     * TPRO Produced notice
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataProducedNotice();

    /**
     * TPUB Publisher
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPublisher();

    /**
     * TRCK Track number/Position in set
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTrackNumber();

    /**
     * TRDA Recording dates
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecordingDates();

    /**
     * TRSN Internet radio station name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternetRadioStationName();

    /**
     * TRSO Internet radio station owner
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternetRadioStationOwner();

    /**
     * TSIZ Size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSize();

    /**
     * TSOA Album sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAlbumSortOrder();

    /**
     * TSOP Performer sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPerformerSortOrder();

    /**
     * TSOT Title sort order
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTitleSortOrder();

    /**
     * TSRC ISRC (international standard recording code)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode();

    /**
     * TSSE Software/Hardware and settings used for encoding
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodedWith();

    /**
     * TSST Set subtitle
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSetSubtitle();

    /**
     * TYER Year
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataYear();

    /**
     * TXXX User defined text information frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUserText();

    /**
     * UFID Unique file identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUniqueFileIdentifier();

    /**
     * USER Terms of use
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTermsOfUse();

    /**
     * USLT Unsynchronized lyric/text transcription
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUnsynchronizedLyric();

    /**
     * WCOM Commercial information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommercialInformation();

    /**
     * WCOP Copyright/Legal information
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCopyrightInformation();

    /**
     * WOAF Official audio file webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage();

    /**
     * WOAR Official artist/performer webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialArtistWebpage();

    /**
     * WOAS Official audio source webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage();

    /**
     * WORS Official Internet radio station homepage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage();

    /**
     * WPAY Payment
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPayment();

    /**
     * WPUB Publishers official webpage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialPublisherWebpage();

    /**
     * WXXX User defined URL link frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUserURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierIcyMetadataStreamTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierIcyMetadataStreamURL();

    /**
     * [@constant] AVMetadataObjectTypeFace
     * 
     *    An identifier for an instance of AVMetadataFaceObject.
     * 
     *    AVMetadataFaceObject objects return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeFace();

    /**
     * [@constant] AVMetadataObjectTypeUPCECode
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeUPCECode.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from UPC-E codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeUPCECode();

    /**
     * [@constant] AVMetadataObjectTypeCode39Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeCode39Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Code 39 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode39Code();

    /**
     * [@constant] AVMetadataObjectTypeCode39Mod43Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeCode39Mod43Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Code 39 mod 43 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode39Mod43Code();

    /**
     * [@constant] AVMetadataObjectTypeEAN13Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeEAN13Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from EAN-13 (including UPC-A) codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeEAN13Code();

    /**
     * [@constant] AVMetadataObjectTypeEAN8Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeEAN8Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from EAN-8 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeEAN8Code();

    /**
     * [@constant] AVMetadataObjectTypeCode93Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeCode93Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Code 93 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode93Code();

    /**
     * [@constant] AVMetadataObjectTypeCode128Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeCode128Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Code 128 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode128Code();

    /**
     * [@constant] AVMetadataObjectTypePDF417Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypePDF417Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from PDF417 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypePDF417Code();

    /**
     * [@constant] AVMetadataObjectTypeQRCode
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeQRCode.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from QR codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeQRCode();

    /**
     * [@constant] AVMetadataObjectTypeAztecCode
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeAztecCode.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Aztec codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeAztecCode();

    /**
     * [@constant] AVMetadataObjectTypeInterleaved2of5Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeInterleaved2of5Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from Interleaved 2 of 5 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeInterleaved2of5Code();

    /**
     * [@constant] AVMetadataObjectTypeITF14Code
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeITF14Code.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from ITF14 codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeITF14Code();

    /**
     * [@constant] AVMetadataObjectTypeDataMatrixCode
     * 
     *    An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeDataMatrixCode.
     * 
     *    AVMetadataMachineReadableCodeObject objects generated from DataMatrix codes return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeDataMatrixCode();

    /**
     * Use these identifiers with +[AVOutputSettingsAssistant outputSettingsAssistantWithPreset:].
     * 
     * When source format information is supplied with these presets, the resulting video settings will not scale up the video from a smaller size.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset640x480();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset960x540();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset1280x720();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset1920x1080();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset3840x2160();

    /**
     * [@constant] AVPlayerWaitingToMinimizeStallsReason
     * 
     * Indicates that the player is waiting for appropriate playback buffer conditions before starting playback
     * 
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and playback at the specified rate would likely cause the playback buffer to become empty before playback completes. Playback will resume when 1) playback at the specified rate will likely complete without a stall or 2) the playback buffer becomes full, meaning no forther buffering of media data is possible.
     * When the value of automaticallyWaitsToMinimizeStalling is NO, timeControlStatus cannot become AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate for this reason.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingToMinimizeStallsReason();

    /**
     * [@constant] AVPlayerWaitingWhileEvaluatingBufferingRateReason
     * 
     * Indicates that the player is monitoring the playback buffer fill rate to determine if playback is likely to complete without interruptions.
     * 
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and it has not yet determined if starting playback at the specified rate would likely cause the buffer to become empty. When the brief initial monitoring period is over, either playback will begin or the value of reasonForWaitingToPlayAtSpecifiedRate will switch to AVPlayerWaitingToMinimizeStallsReason.
     * Recommended practice is not to show UI indicating the waiting state to the user while the value of reasonForWaitingToPlayAtSpecifiedRate is AVPlayerWaitingWhileEvaluatingBufferingRateReason.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingWhileEvaluatingBufferingRateReason();

    /**
     * [@constant] AVPlayerWaitingWithNoItemToPlayReason
     * 
     * Indicates that the AVPlayer is waiting because its currentItem is nil
     * 
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and the value of currentItem is nil. When an item becomes available, either because of a call to -replaceCurrentItemWithPlayerItem: or  -insertItem: afterItem:, playback will begin or the value of reasonForWaitingToPlay will change.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingWithNoItemToPlayReason();

    /**
     * the item's current time has changed discontinuously
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemTimeJumpedNotification();

    /**
     * item has played to its end time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemDidPlayToEndTimeNotification();

    /**
     * item has failed to play to its end time
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemFailedToPlayToEndTimeNotification();

    /**
     * media did not arrive in time to continue playback
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemPlaybackStalledNotification();

    /**
     * a new access log entry has been added
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemNewAccessLogEntryNotification();

    /**
     * a new error log entry has been added
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemNewErrorLogEntryNotification();

    /**
     * NSError
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemFailedToPlayToEndTimeErrorKey();

    /**
     * [@constant]		AVPlayerItemLegibleOutputTextStylingResolutionDefault
     * 
     * Specify this level of text styling resolution to receive attributed strings from an AVPlayerItemLegibleOutput that include the same level of styling information that AVFoundation would use itself to render text within an AVPlayerLayer. The text styling will accommodate user-level Media Accessibility settings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemLegibleOutputTextStylingResolutionDefault();

    /**
     * [@constant]		AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly
     * 
     * Specify this level of text styling resolution to receive only the styling present in the source media and the styling provided via AVPlayerItem.textStyleRules.
     * 
     * This level of resolution excludes styling provided by the user-level Media Accessibility settings. You would typically use it if you wish to override the styling specified in source media. If you do this, you are strongly encouraged to allow your custom styling in turn to be overriden by user preferences for text styling that are available as Media Accessibility settings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly();

    /**
     * decode failed, see NSError in notification payload
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerFailedToDecodeNotification();

    /**
     * NSError
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerFailedToDecodeNotificationErrorKey();

    /**
     * NSString (CMVideoCodecType)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecKey();

    /**
     * @"avc1"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecH264();

    /**
     * @"jpeg"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecJPEG();

    /**
     * NSNumber (encoded pixels)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoWidthKey();

    /**
     * NSNumber (encoded pixels)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoHeightKey();

    /**
     * [@constant]	AVVideoPixelAspectRatioKey
     * 
     * The aspect ratio of the pixels in the video frame
     * 
     * The value for this key is an NSDictionary containing AVVideoPixelAspectRatio*Key keys.  If no value is specified for this key, the default value for the codec is used.  Usually this is 1:1, meaning square pixels.
     * 
     * Note that prior to OS X 10.9 and iOS 7.0, this key could only be specified as part of the dictionary given for AVVideoCompressionPropertiesKey.  As of OS X 10.9 and iOS 7.0, the top level of an AVVideoSettings dictionary is the preferred place to specify this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioHorizontalSpacingKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioVerticalSpacingKey();

    /**
     * [@constant]	AVVideoCleanApertureKey
     * 
     * Defines the region within the video dimensions that will be displayed during playback
     * 
     * The value for this key is an NSDictionary containing AVVideoCleanAperture*Key keys.  AVVideoCleanApertureWidthKey and AVVideoCleanApertureHeightKey define a clean rectangle which is centered on the video frame.  To offset this rectangle from center, use AVVideoCleanApertureHorizontalOffsetKey and AVVideoCleanApertureVerticalOffsetKey.  A positive value for AVVideoCleanApertureHorizontalOffsetKey moves the clean aperture region to the right, and a positive value for AVVideoCleanApertureVerticalOffsetKey moves the clean aperture region down.
     * 
     * If no clean aperture region is specified, the entire frame will be displayed during playback.
     * 
     * Note that prior to OS X 10.9 and iOS 7.0, this key could only be specified as part of the dictionary given for AVVideoCompressionPropertiesKey.  As of OS X 10.9 and iOS 7.0, the top level of an AVVideoSettings dictionary is the preferred place to specify this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureWidthKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureHeightKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureHorizontalOffsetKey();

    /**
     * NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureVerticalOffsetKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeKey();

    /**
     * AVVideoScalingModeFit - Crop to remove edge processing region; preserve aspect ratio of cropped source by reducing specified width or height if necessary.  Will not scale a small source up to larger dimensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeFit();

    /**
     * AVVideoScalingModeResize - Crop to remove edge processing region; scale remainder to destination area.  Does not preserve aspect ratio.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResize();

    /**
     * AVVideoScalingModeResizeAspect - Preserve aspect ratio of the source, and fill remaining areas with black to fit destination dimensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResizeAspect();

    /**
     * AVVideoScalingModeResizeAspectFill - Preserve aspect ratio of the source, and crop picture to fit destination dimensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResizeAspectFill();

    /**
     * NSDictionary, all 3 below keys required
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPropertiesKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimariesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_ITU_R_709_2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_SMPTE_C();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_P3_D65();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunctionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_ITU_R_709_2();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrixKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_709_2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_601_4();

    /**
     * NSNumber(BOOL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAllowWideColorKey();

    /**
     * NSDictionary
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCompressionPropertiesKey();

    /**
     * NSNumber (bits per second, H.264 only)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAverageBitRateKey();

    /**
     * NSNumber (0.0-1.0, JPEG and HEIC only. With HEIC, 1.0 indicates lossless compression)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoQualityKey();

    /**
     * NSNumber (frames, 1 means key frames only, H.264 only)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoMaxKeyFrameIntervalKey();

    /**
     * NSNumber (seconds, 0.0 means no limit, H.264 only)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoMaxKeyFrameIntervalDurationKey();

    /**
     * NSNumber (BOOL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAllowFrameReorderingKey();

    /**
     * NSString, profile/level constants are specific to a particular encoder. See VideoToolbox/VTCompressionProperties.h for additional profiles/levels that can used as the value of this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelKey();

    /**
     * Baseline Profile Level 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline30();

    /**
     * Baseline Profile Level 3.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline31();

    /**
     * Baseline Profile Level 4.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline41();

    /**
     * Baseline Profile Auto Level
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264BaselineAutoLevel();

    /**
     * Main Profile Level 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main30();

    /**
     * Main Profile Level 3.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main31();

    /**
     * Main Profile Level 3.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main32();

    /**
     * Main Profile Level 4.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main41();

    /**
     * Main Profile Auto Level
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264MainAutoLevel();

    /**
     * High Profile Level 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264High40();

    /**
     * High Profile Level 4.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264High41();

    /**
     * High Profile Auto Level
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264HighAutoLevel();

    /**
     * NSString, H.264 only, one of:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeKey();

    /**
     * Context-based Adaptive Variable Length Coding
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeCAVLC();

    /**
     * Context-based Adaptive Binary Arithmetic Coding
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeCABAC();

    /**
     * NSNumber (frames per second)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoExpectedSourceFrameRateKey();

    /**
     * NSNumber (frames per second)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAverageNonDroppableFrameRateKey();

    /**
     * [@constant]      AVContentKeySystemFairPlayStreaming
     * 
     * Used to specify FairPlay Streaming (FPS) as the method of key delivery.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemFairPlayStreaming();

    /**
     * [@constant]      AVContentKeySystemClearKey
     * 
     * Used to specify clear key as the method of key delivery.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemClearKey();

    /**
     * [@constant]      AVContentKeyRequestRetryReasonTimedOut
     * 
     * Indicates that the content key request should be retried because the key response was not set soon enough either due the initial request/response was taking too long, or a lease was expiring in the meantime.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonTimedOut();

    /**
     * [@constant]      AVContentKeyRequestRetryReasonReceivedResponseWithExpiredLease
     * 
     * Indicates that the content key request should be retried because a key response with expired lease was set on the previous content key request.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonReceivedResponseWithExpiredLease();

    /**
     * [@constant]      AVContentKeyRequestRetryReasonReceivedObsoleteContentKey
     * 
     * Indicates that the content key request should be retried because an obsolete key response was set on the previous content key request.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonReceivedObsoleteContentKey();

    /**
     * [@constant]      AVContentKeyRequestProtocolVersionsKey
     * 
     * Specifies the versions of the content protection protocol supported by the application as an NSArray of one or more NSNumber objects.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestProtocolVersionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeDepthData();

    /**
     * [@constant] AVFileTypeJPEG
     * 
     * A UTI for the JPEG (JFIF) format.
     * 
     * The value of this UTI is @"public.jpeg".
     * Files are identified with the .jpg or .jpeg extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeJPEG();

    /**
     * [@constant] AVFileTypeDNG
     * 
     * A UTI for the Adobe digital negative file format.
     * 
     * The value of this UTI is @"com.adobe.raw-image".
     * Files are identified with the .dng extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeDNG();

    /**
     * [@constant] AVFileTypeHEIC
     * 
     * A UTI for the high efficiency image file format containing HEVC compressed images.
     * 
     * The value of this UTI is @"public.heic".
     * Files are identified with the .heic extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeHEIC();

    /**
     * [@constant] AVFileTypeAVCI
     * 
     * A UTI for the high efficiency image file format containing H.264 compressed images.
     * 
     * The value of this UTI is @"public.avci".
     * Files are identified with the .avci extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeAVCI();

    /**
     * [@constant] AVFileTypeHEIF
     * 
     * A UTI for the high efficiency image file format containing images compressed with any codec.
     * 
     * The value of this UTI is @"public.heif".
     * Files are identified with the .heif extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeHEIF();

    /**
     * [@constant] AVFileTypeTIFF
     * 
     * A UTI for the tagged image file format.
     * 
     * The value of this UTI is @"public.tiff".
     * Files are identified with the .tiff or .tif extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeTIFF();

    /**
     * Keys for metadata provided by AudioToolbox's AudioFile interface. See <AudioToolbox/AudioFile.h>
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceAudioFile();

    /**
     * Metadata format for AVMetadataItems of unknown provenance. This can occur when metadata is provided generically by an intermediate interface, such as AudioToolbox's AudioFile interface.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatUnknown();

    /**
     * These export options can be used to produce movie files with video size appropriate to the device.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * HEVC and the audio will be compressed using AAC.  
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVCHighestQuality();

    /**
     * These export options can be used to produce movie files with the specified video size.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * HEVC and the audio will be compressed using AAC.  Some devices cannot support some sizes. 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC1920x1080();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC3840x2160();

    /**
     * [@constant] AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData
     * Indicates that the media data should be interleaved with all other media data with this constant.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData();

    /**
     * [@constant] AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved
     * Indicates that the media data should be laid out before all the media data with AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData and not be interleaved.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved();

    /**
     * [@enum]		AVAssetDownloadedAssetEvictionPriority
     * 
     * These constants represents the eviction priority of downloaded assets.
     * 
     * [@constant]	AVAssetDownloadedAssetEvictionPriorityImportant
     * 			Used to mark assets with the highest priority. They will be the last to be purged.
     * [@constant]	AVAssetDownloadedAssetEvictionPriorityDefault
     * 			Used to mark assets have the default priority. They will be the first to be purged.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadedAssetEvictionPriorityImportant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadedAssetEvictionPriorityDefault();

    /**
     * @"hvc1"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeHEVC();

    /**
     * @"avc1"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeH264();

    /**
     * @"jpeg"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeJPEG();

    /**
     * @"ap4h"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes4444();

    /**
     * @"apcn"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422();

    /**
     * @"hvc1"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecHEVC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_ITU_R_2020();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_SMPTE_ST_2084_PQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_ITU_R_2100_HLG();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_2020();

    /**
     * [@constant]	AVVideoApertureModeCleanAperture
     * 
     * Both pixel aspect ratio and clean aperture will be applied.
     * 
     * An image's clean aperture is a region of video free from transition artifacts caused by the encoding of the signal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeCleanAperture();

    /**
     * [@constant]	AVVideoApertureModeProductionAperture
     * 
     * Only pixel aspect ratio will be applied.
     * 
     * The image is not cropped to the clean aperture region, but it is scaled according to the pixel aspect ratio. Use this option when you want to see all the pixels in your video, including the edges.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeProductionAperture();

    /**
     * [@constant]	AVVideoApertureModeEncodedPixels
     * 
     * Neither pixel aspect ratio nor clean aperture will be applied.
     * 
     * The image is not cropped to the clean aperture region and is not scaled according to the pixel aspect ratio. The encoded dimensions of the image description are displayed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeEncodedPixels();

    /**
     * value is an integer (audio file type) from AudioFile.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioFileTypeKey();

    /**
     *    Only present in begin interruption events, where the interruption is a direct result of the
     *    application being suspended by the operating sytem. Value is a boolean NSNumber, where a true
     *    value indicates that the interruption is the result of the application being suspended, rather
     *    than being interrupted by another audio session.
     * 
     * Starting in iOS 10, the system will deactivate the audio session of most apps in response to the
     *    app process being suspended. When the app starts running again, it will receive the notification
     *    that its session has been deactivated by the system. Note that the notification is necessarily
     *    delayed in time, due to the fact that the application was suspended at the time the session was
     *    deactivated by the system and the notification can only be delivered once the app is running
     *    again.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionInterruptionWasSuspendedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC1920x1080();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC3840x2160();

    /**
     * [@constant]	AVRouteDetectorMultipleRoutesDetectedDidChangeNotification
     * 
     * Posted when the value of multipleRoutesDetected changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVRouteDetectorMultipleRoutesDetectedDidChangeNotification();

    /**
     * [@constant]		AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification
     * 
     * A notification that fires whenever the receiver's enqueued media data has been flushed for a reason other than a call to the -flush method.
     * 
     * 	The renderer may flush enqueued media data when the user routes playback to a new destination.  The renderer may also flush enqueued media data when the playback rate of the attached AVSampleBufferRenderSynchronizer is changed (e.g. 1.0 -> 2.0 or 1.0 -> 0.0 -> 2.0), however no flush will occur for normal pauses (non-zero -> 0.0) and resumes (0.0 -> same non-zero rate as before).
     * 
     * 	When an automatic flush occurs, the attached render synchronizer's timebase will remain running at its current rate.  It is typically best to respond to this notification by enqueueing media data with timestamps starting at the timebase's current time.  To the listener, this will sound similar to muting the audio for a short period of time.  If it is more desirable to ensure that all audio is played than to keep the timeline moving, you may also stop the synchronizer, set the synchronizer's current time to the value of AVSampleBufferAudioRendererFlushTimeKey, start reenqueueing sample buffers with timestamps starting at that time, and restart the synchronizer.  To the listener, this will sound similar to pausing the audio for a short period of time.
     * 
     * 	This notification is delivered on an arbitrary thread.  If sample buffers are being enqueued with the renderer concurrently with the receipt of this notification, it is possible that one or more sample buffers will remain enqueued in the renderer.  This is generally undesirable, because the sample buffers that remain will likely have timestamps far ahead of the timebase's current time and so won't be rendered for some time.  The best practice is to invoke the -flush method, in a manner that is serialized with enqueueing sample buffers, after receiving this notification and before resuming the enqueueing of sample buffers.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification();

    /**
     * [@constant]		AVSampleBufferAudioRendererFlushTimeKey
     * 
     * The presentation timestamp of the first enqueued sample that was flushed.
     * 
     * 	The value of this key is an NSValue wrapping a CMTime.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferAudioRendererFlushTimeKey();

    /**
     * [@constant]      AVContentKeySystemAuthorizationToken
     * 
     * Used to specify a token that could be used to authorize playback of associated content key recipients.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemAuthorizationToken();

    /**
     * [@constant]      AVContentKeySessionServerPlaybackContextOptionProtocolVersions
     * 
     * Specifies the versions of the content protection protocol supported by the application as an NSArray of one or more NSNumber objects. If not specified default protocol version of 1 is assumed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySessionServerPlaybackContextOptionProtocolVersions();

    /**
     * [@constant]      AVContentKeySessionServerPlaybackContextOptionServerChallenge
     * 
     * Specifies a nonce as a 8-byte NSData object to be included in the secure server playback context (SPC) in order to prevent replay attacks. If not specified default server challenge of 0 is assumed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySessionServerPlaybackContextOptionServerChallenge();

    /**
     * [@constant]      AVContentKeyRequestRequiresValidationDataInSecureTokenKey
     * 
     * Request secure token to have extended validation data. The value for the key should be previously created offline key using -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRequiresValidationDataInSecureTokenKey();

    /**
     * [@constant] AVMediaCharacteristicContainsAlphaChannel
     * 
     * A media characteristic that indicates that a track contains an alpha channel.
     * 
     * To determine whether alpha is straight or pre-multiplied, look for the format description extension with key kCMFormatDescriptionExtension_AlphaChannelMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicContainsAlphaChannel();

    /**
     * [@constant] AVMediaCharacteristicIsOriginalContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by the content author as original to the principal production of the media, as opposed to supplementary or derivative content created by means of language translation or by other means.
     * 
     * The value of this characteristic is @"public.original-content".
     * Example: an option that presents audio media with dialog in the principal language of the production may be tagged with this characteristic; audio media containing dialog dubbed in a language other than the principal language of the production typically would not be tagged with this characteristic.
     * Note for content authors: for QuickTime movie and .m4v files and for HTTP Live Streaming, a media option is considered to have the characteristic AVMediaCharacteristicIsOriginalContent only if it's explicitly tagged with the characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicIsOriginalContent();

    /**
     * [@constant]		AVURLAssetAllowsExpensiveNetworkAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the expensive interface (e.g. cellular, tethered, constrained).
     * 
     * 	Default is YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsExpensiveNetworkAccessKey();

    /**
     * [@constant]		AVURLAssetAllowsConstrainedNetworkAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the constrained interface (e.g. interfaces marked as being in data saver mode).
     * 
     * 	Default is YES.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsConstrainedNetworkAccessKey();

    /**
     * [@constant]       AVAssetContainsFragmentsDidChangeNotification
     * 
     * Posted after the value of @"containsFragments" has already been loaded and the AVFragmentedAsset is added to an AVFragmentedAssetMinder, either when 1) fragments are detected in the asset on disk after it had previously contained none or when 2) no fragments are detected in the asset on disk after it had previously contained one or more.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetContainsFragmentsDidChangeNotification();

    /**
     * [@constant]       AVAssetWasDefragmentedNotification
     * 
     * Posted when the asset on disk is defragmented while an AVFragmentedAsset is being minded by an AVFragmentedAssetMinder, but only if the defragmentation occurs after the status of the value of @"canContainFragments" has reached AVKeyValueStatusLoaded.
     * 
     * After this notification is posted, the value of the asset properties canContainFragments and containsFragments will both be NO.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWasDefragmentedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVCHighestQualityWithAlpha();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC1920x1080WithAlpha();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC3840x2160WithAlpha();

    /**
     * [@constant]		AVAssetDownloadTaskMediaSelectionPrefersMultichannelKey
     * 
     * Download the specified media selections with or without support for multichannel playback.
     * 				The value for this key should be an NSNumber representing a BOOL.
     * 
     * By default AVAssetDownloadTask will prefer multichannel by downloading the most capable multichannel rendition available in additon to stereo.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMediaSelectionPrefersMultichannelKey();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInUltraWideCamera
     *    A built-in camera device with a shorter focal length than a wide angle camera. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInUltraWideCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDualWideCamera
     *    A device that consists of two fixed focal length cameras, one ultra wide and one wide angle. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice defaultDeviceWithDeviceType:mediaType:position:].
     * 
     *    A device of this device type supports the following features:
     *    - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     *    - Depth data delivery by measuring the disparity of matched features between the ultra wide and wide cameras.
     *    - Delivery of photos from constituent devices (ultra wide and wide) via a single photo capture request.
     * 
     *    A device of this device type does not support the following features:
     *    - AVCaptureExposureModeCustom and manual exposure bracketing.
     *    - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     *    - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     *    Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the device switches from one camera to the other. The overall exposure, white balance, and focus position however should be consistent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDualWideCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTripleCamera
     *    A device that consists of three fixed focal length cameras, one ultra wide, one wide angle, and one telephoto. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice defaultDeviceWithDeviceType:mediaType:position:].
     * 
     *    A device of this device type supports the following features:
     *    - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     *    - Delivery of photos from constituent devices (ultra wide, wide and telephoto cameras) via a single photo capture request.
     * 
     *    A device of this device type does not support the following features:
     *    - AVCaptureExposureModeCustom and manual exposure bracketing.
     *    - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     *    - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     *    Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the device switches from one camera to the other. The overall exposure, white balance, and focus position however should be consistent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTripleCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTrueDepthCamera
     *    A device that consists of two cameras, one YUV and one Infrared. The infrared camera provides high quality depth information that is synchronized and perspective corrected to frames produced by the YUV camera. While the resolution of the depth data and YUV frames may differ, their field of view and aspect ratio always match. Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice defaultDeviceWithDeviceType:mediaType:position:].
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTrueDepthCamera();

    /**
     * [@constant] AVCaptureSessionInterruptionSystemPressureStateKey
     * 
     *    The key used to provide an AVCaptureSystemPressureState indicating the system pressure level and contributing factors that caused the interruption.
     * 
     *    This key is only present when the AVCaptureSessionInterruptionReasonKey equals AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableDueToSystemPressure.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionSystemPressureStateKey();

    /**
     * @"apch"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422HQ();

    /**
     * @"apcs"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422LT();

    /**
     * @"apco"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422Proxy();

    /**
     * @"muxa"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeHEVCWithAlpha();

    /**
     * [@constant] AVMetadataObjectTypeHumanBody
     * 
     *    An identifier for an instance of AVMetadataHumanBodyObject.
     * 
     *    AVMetadataHumanBodyObject objects return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeHumanBody();

    /**
     * [@constant] AVMetadataObjectTypeCatBody
     * 
     *    An identifier for an instance of AVMetadataCatBodyObject.
     * 
     *    AVMetadataCatBodyObject objects return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCatBody();

    /**
     * [@constant] AVMetadataObjectTypeDogBody
     * 
     *    An identifier for an instance of AVMetadataDogBodyObject.
     * 
     *    AVMetadataDogBodyObject objects return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeDogBody();

    /**
     * [@constant] AVMetadataObjectTypeSalientObject
     * 
     *    An identifier for an instance of AVMetadataSalientObject.
     * 
     *    AVMetadataSalientObject objects return this constant as their type.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeSalientObject();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeSkin
     *    A matting image segmenting all skin from all persons in the visible field-of-view of an image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeSkin();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeHair
     *    A matting image segmenting all hair from all persons in the visible field-of-view of an image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeHair();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeTeeth
     *    A matting image segmenting all teeth from all persons in the visible field-of-view of an image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeTeeth();

    /**
     * [@constant] AVCaptureSystemPressureLevelNominal
     *    System pressure level is normal (not pressured).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelNominal();

    /**
     * [@constant] AVCaptureSystemPressureLevelFair
     *    System pressure is slightly elevated.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelFair();

    /**
     * [@constant] AVCaptureSystemPressureLevelSerious
     *    System pressure is highly elevated. Capture performance may be impacted. Frame rate throttling is advised.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelSerious();

    /**
     * [@constant] AVCaptureSystemPressureLevelCritical
     *    System pressure is critically elevated. Capture quality and performance are significantly impacted. Frame rate throttling is highly advised.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelCritical();

    /**
     * [@constant] AVCaptureSystemPressureLevelShutdown
     *    System pressure is beyond critical. Capture must immediately stop.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelShutdown();

    /**
     * Appropriate for applications which play audio using text to speech. Setting this mode allows for different routing behaviors when
     * connected to certain audio devices such as CarPlay. An example of an app that would use this mode is a turn by turn navigation app that
     * plays short prompts to the user. Typically, these same types of applications would also configure their session to use
     * AVAudioSessionCategoryOptionDuckOthers and AVAudioSessionCategoryOptionInterruptSpokenAudioAndMixWithOthers 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionModeVoicePrompt();

    /**
     * [@constant] AVAudioUnitComponentManagerRegistrationsChangedNotification
     * 
     * 	A notification generated when AVAudioUnitComponentManager updates its list of components.
     * 
     * 	Register for this notification on the shared AVAudioUnitComponentManager instance,
     * 	as follows:
     * 
     * ```
     * [[NSNotificationCenter defaultCenter] addObserver: myObject
     * 	selector:    @selector(registrationsChanged:)
     * 	name:        AVAudioUnitComponentManagerRegistrationsChangedNotification
     * 	object:      [AVAudioUnitComponentManager sharedAudioUnitComponentManager]];
     * ```
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioUnitComponentManagerRegistrationsChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedHumanBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedCatBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedDogBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedSalientObject();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto
     * 
     * A value of type kCMMetadataBaseDataType_UInt8 indicating whether this Live Photo movie was captured in "Auto" mode.
     * 
     *   Clients capturing LivePhoto content may add this movie-level metadata to signify that the movie content should only be used (when swiping between photos, or force-touching a photo) if it's sufficiently dynamic. For instance, photos of static scenes or documents are to be excluded from the Live Photo experience.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScore
     * 
     * A value of type kCMMetadataBaseDataType_Float32.
     * 
     *    Live Photo movies may be algorithmically scored from 0. to 1. on their level of vitality. A Live Photo movie with a low vitality score offers little dynamism to the still photo it accompanies. The vitality score is normalized and independent of the vitality scoring version of the algorithm (see AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScoringVersion). If a Live Photo movie contains the AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto key and its value is non-zero, apps should read the AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScore value and only display the movie's content if the score is 0.5 or higher.
     *    If the capture session includes a metadata output configured to provide face, dog, or cat metadata objects, their presence will greatly increase the vitality score.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScore();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScoringVersion
     * 
     * A value of type kCMMetadataBaseDataType_UInt32.
     * 
     *    The version of the algorithm that scored the Live Photo movie for vitality.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScoringVersion();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScore
     * 
     * A value of type kCMMetadataBaseDataType_Float32.
     * 
     *    The video may be scored by a heuristic which considers factors such as exposure and focus.  The value ranges from 0-1, where a score below 0.5 indicates the asset has serious flaws.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScore();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScoringVersion
     * 
     * A value of type kCMMetadataBaseDataType_UInt32.
     * 
     *    The version of the algorithm that provided the spatial over capture quality score.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScoringVersion();

    /**
     * [@constant]       AVFragmentedMovieTrackTimeRangeDidChangeNotification
     * 
     * Posted when the timeRange of an AVFragmentedMovieTrack changes while the associated instance of AVFragmentedMovie is being minded by an AVFragmentedMovieMinder, but only for changes that occur after the status of the value of @"timeRange" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieTrackTimeRangeDidChangeNotification();

    /**
     * [@constant]       AVFragmentedMovieTrackSegmentsDidChangeNotification
     * 
     * Posted when the array of segments of an AVFragmentedMovieTrack changes while the associated instance of AVFragmentedMovie is being minded by an AVFragmentedMovieMinder, but only for changes that occur after the status of the value of @"segments" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieTrackSegmentsDidChangeNotification();

    /**
     *  [@constant]		AVMovieReferenceRestrictionsKey
     * 
     * Indicates the restrictions used by the movie when resolving references to external media data. The value of this key is an NSNumber wrapping an AVAssetReferenceRestrictions enum value or the logical combination of multiple such values. See AVAsset.h for the declaration of the AVAssetReferenceRestrictions enum.
     * 
     * Some movies can contain references to media data stored outside the movie's container, for example in another file. This key can be used to specify a policy to use when these references are encountered. If a movie contains one or more references of a type that is forbidden by the reference restrictions, loading of movie properties will fail. In addition, such a movie cannot be used with other AVFoundation modules, such as AVPlayerItem or AVAssetExportSession.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMovieReferenceRestrictionsKey();

    /**
     * [@constant]       AVFragmentedMovieContainsMovieFragmentsDidChangeNotification
     * 
     * Posted after the value of @"containsMovieFragments" has already been loaded and the AVFragmentedMovie is added to an AVFragmentedMovieMinder, either when 1) movie fragments are detected in the movie file on disk after it had previously contained none or when 2) no movie fragments are detected in the movie file on disk after it had previously contained one or more.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieContainsMovieFragmentsDidChangeNotification();

    /**
     * [@constant]       AVFragmentedMovieDurationDidChangeNotification
     * 
     * Posted when the duration of an AVFragmentedMovie changes while it's being minded by an AVFragmentedMovieMinder, but only for changes that occur after the status of the value of @"duration" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieDurationDidChangeNotification();

    /**
     * [@constant]       AVFragmentedMovieWasDefragmentedNotification
     * 
     * Posted when the movie file on disk is defragmented while an AVFragmentedMovie is being minded by an AVFragmentedMovieMinder, but only if the defragmentation occurs after the status of the value of @"canContainMovieFragments" has reached AVKeyValueStatusLoaded.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieWasDefragmentedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC1920x1080WithAlpha();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC3840x2160WithAlpha();

    /**
     * [@constant]		AVPlayerAvailableHDRModesDidChangeNotification
     * 
     * A notification that fires whenever availableHDRModes changes.
     * 
     *  This notification fires when a value is added or removed from the list of availableHDRModes.  This can be caused by display connection/disconnection or resource changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerAvailableHDRModesDidChangeNotification();

    /**
     * the value of recommendedTimeOffsetFromLive has changed
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemRecommendedTimeOffsetFromLiveDidChangeNotification();

    /**
     * a media selection group changed its selected option
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemMediaSelectionDidChangeNotification();

    /**
     * [@constant]		AVSampleBufferRenderSynchronizerRateDidChangeNotification
     * 
     * A notification that fires whenever the value of the "rate" property changes.
     * 
     * 	The rate can change as a result of setting the rate property, either by directly setting the property or calling -setRate:time:.  The rate can also change at any time, without any action by the client of the render synchronizer.  For example, on iOS if the app's playback is interrupted (e.g. by a phone call or another non-mixable app starting playback), the rate will automatically be set to zero.  This notification will be sent in all of those cases.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferRenderSynchronizerRateDidChangeNotification();

    /**
     * [@constant]		eligibleForHDRPlaybackDidChangeNotification
     * 
     * A notification that fires whenever eligibleForHDRPlayback changes.
     * 
     * This notification fires when eligibleForHDRPlayback changes.  This can be caused by display connection/disconnection or resource changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerEligibleForHDRPlaybackDidChangeNotification();

    /**
     * [@constant] AVMediaCharacteristicContainsHDRVideo
     * 
     * A media characteristic that indicates that a track contains HDR video.
     * 
     * HDR video contains extended dynamic range that requires explicit support when compositing.
     * The value of this characteristic is @“public.contains-hdr-video".
     * Note for content authors: the presence of this characteristic is strictly inferred from the format description of the associated track.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicContainsHDRVideo();

    /**
     * [@constant] AVFileTypeProfileMPEG4AppleHLS
     * 
     * Apple HTTP Live Streaming profile
     * 
     * The profile that is suitable for Apple HTTP Live Streaming.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeProfileMPEG4AppleHLS();

    /**
     * [@constant] AVFileTypeProfileMPEG4CMAFCompliant
     * 
     * CMAF compliant profile
     * 
     * The profile that is compliance with CMAF format.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeProfileMPEG4CMAFCompliant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAccessibilityDescription();

    /**
     * [@constant]		AVAssetDownloadTaskMinimumRequiredPresentationSizeKey
     * 
     * The lowest media presentation size greater than or equal to this value will be selected. If no suitable media presentation size is found, the highest media presentation size will be selected.
     * 			The value for this key should be a NSValue of CGSize.
     * 
     * By default, the highest media presentation size will be selected for download.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMinimumRequiredPresentationSizeKey();

    /**
     * [@constant]		AVAssetDownloadTaskPrefersHDRKey
     * 
     * Download the specified media selections with or without HDR content.
     * 				The value for this key should be an NSNumber representing a BOOL.
     * 
     * By default AVAssetDownloadTask will prefer HDR content.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskPrefersHDRKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataAccessibilityDescription();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAccessibilityDescription();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataLocationHorizontalAccuracyInMeters
     * 
     * A value of type kCMMetadataBaseDataType_Float32.
     * 
     *    The horizontal accuracy of the provided location data (usually specified by AVMetadataIdentifierQuickTimeMetadataLocationISO6709).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationHorizontalAccuracyInMeters();

    /**
     * see requiresFlushToResumeDecoding property
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerRequiresFlushToResumeDecodingDidChangeNotification();

    /**
     * Input or output that does not correspond to real audio hardware
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortVirtual();

    /**
     * Input or output connected via the PCI (Peripheral Component Interconnect) bus
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortPCI();

    /**
     * Input or output connected via FireWire
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortFireWire();

    /**
     * Input or output connected via DisplayPort
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortDisplayPort();

    /**
     * Input or output connected via AVB (Audio Video Bridging)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortAVB();

    /**
     * Input or output connected via Thunderbolt
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPortThunderbolt();

    /**
     * If you select a data source with AVAudioSessionPolarPatternStereo, then you must call setPreferredInputOrientation:error: on your Audio Session so that left and right are presented from the correct directions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioSessionPolarPatternStereo();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeGlasses
     * A matting image segmenting all glasses ( e.g. eyeglasses, sunglasses ) from all persons wearing glasses in the visible field-of-view of an image.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeGlasses();
}

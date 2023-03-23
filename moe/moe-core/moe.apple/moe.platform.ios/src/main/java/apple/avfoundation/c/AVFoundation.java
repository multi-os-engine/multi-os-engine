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

import apple.avfoundation.AVContentKey;
import apple.avfoundation.struct.AVCaptureWhiteBalanceGains;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSError;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.map.ObjCStringMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

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
     * [@function] AVMakeRectWithAspectRatioInsideRect
     * 
     * Returns a scaled CGRect that maintains the aspect ratio specified by a CGSize within a bounding CGRect.
     * 
     * This is useful when attempting to fit the presentationSize property of an AVPlayerItem within the bounds of
     * another CALayer.
     * You would typically use the return value of this function as an AVPlayerLayer frame property value. For example:
     * myPlayerLayer.frame = AVMakeRectWithAspectRatioInsideRect(myPlayerItem.presentationSize, mySuperLayer.bounds);
     * 
     * @param aspectRatio  The width & height ratio, or aspect, you wish to maintain.
     * @param boundingRect The bounding CGRect you wish to fit into.
     * 
     *                     API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect AVMakeRectWithAspectRatioInsideRect(@ByValue CGSize aspectRatio,
            @ByValue CGRect boundingRect);

    /**
     * [@constant] AVCoreAnimationBeginTimeAtZero
     * 
     * Use this constant to set the CoreAnimation's animation beginTime property to be time 0.
     * The constant is a small, non-zero, positive value which avoids CoreAnimation
     * from replacing 0.0 with CACurrentMediaTime().
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native double AVCoreAnimationBeginTimeAtZero();

    /**
     * [@constant] AVLayerVideoGravityResizeAspect
     * 
     * Preserve aspect ratio; fit within layer bounds.
     * 
     * AVLayerVideoGravityResizeAspect may be used when setting the videoGravity
     * property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResizeAspect();

    /**
     * [@constant] AVLayerVideoGravityResizeAspectFill
     * 
     * Preserve aspect ratio; fill layer bounds.
     * 
     * AVLayerVideoGravityResizeAspectFill may be used when setting the videoGravity
     * property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResizeAspectFill();

    /**
     * [@constant] AVLayerVideoGravityResize
     * 
     * Stretch to fill layer bounds.
     * 
     * AVLayerVideoGravityResize may be used when setting the videoGravity
     * property of an AVPlayerLayer or AVCaptureVideoPreviewLayer instance.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVLayerVideoGravityResize();

    /**
     * [@constant] AVURLAssetPreferPreciseDurationAndTimingKey
     * 
     * Indicates whether the asset should be prepared to indicate a precise duration and provide precise random access
     * by time.
     * The value for this key is a boolean NSNumber.
     * 
     * If nil is passed as the value of the options parameter to -[AVURLAsset initWithURL:options:], or if a dictionary
     * that lacks a value for the key AVURLAssetPreferPreciseDurationAndTimingKey is passed instead, a default value of
     * NO is assumed. If the asset is intended to be played only, because AVPlayer will support approximate random
     * access by time when full precision isn't available, the default value of NO will suffice.
     * Pass YES if longer loading times are acceptable in cases in which precise timing is required. If the asset is
     * intended to be inserted into an AVMutableComposition, precise random access is typically desirable and the value
     * of YES is recommended.
     * Note that such precision may require additional parsing of the resource in advance of operations that make use of
     * any portion of it, depending on the specifics of its container format. Many container formats provide sufficient
     * summary information for precise timing and do not require additional parsing to prepare for it; QuickTime movie
     * files and MPEG-4 files are examples of such formats. Other formats do not provide sufficient summary information,
     * and precise random access for them is possible only after a preliminary examination of a file's contents.
     * If you pass YES for an asset that you intend to play via an instance of AVPlayerItem and you are prepared for
     * playback to commence before the value of -[AVPlayerItem duration] becomes available, you can omit the
     * key @"duration" from the array of AVAsset keys you pass to -[AVPlayerItem
     * initWithAsset:automaticallyLoadedAssetKeys:] in order to prevent AVPlayerItem from automatically loading the
     * value of duration while the item becomes ready to play.
     * If precise duration and timing is not possible for the timed media resource referenced by the asset's URL,
     * AVAsset.providesPreciseDurationAndTiming will be NO even if precise timing is requested via the use of this key.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetPreferPreciseDurationAndTimingKey();

    /**
     * [@constant] AVURLAssetReferenceRestrictionsKey
     * 
     * Indicates the restrictions used by the asset when resolving references to external media data. The value of this
     * key is an NSNumber wrapping an AVAssetReferenceRestrictions enum value or the logical combination of multiple
     * such values.
     * 
     * Some assets can contain references to media data stored outside the asset's container file, for example in
     * another file. This key can be used to specify a policy to use when these references are encountered. If an asset
     * contains one or more references of a type that is forbidden by the reference restrictions, loading of asset
     * properties will fail. In addition, such an asset cannot be used with other AVFoundation modules, such as
     * AVPlayerItem or AVAssetExportSession.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetReferenceRestrictionsKey();

    /**
     * [@constant] AVURLAssetHTTPCookiesKey
     * 
     * HTTP cookies that the AVURLAsset may send with HTTP requests
     * Standard cross-site policy still applies: cookies will only be sent to domains to which they apply.
     * 
     * By default, an AVURLAsset will only have access to cookies in the client's default cookie storage
     * that apply to the AVURLAsset's URL. You can supplement the cookies available to the asset
     * via use of this initialization option
     * 
     * HTTP cookies do not apply to non-HTTP(S) URLS.
     * In HLS, many HTTP requests (e.g., media, crypt key, variant index) might be issued to different paths or hosts.
     * In both of these cases, HTTP requests will be missing any cookies that do not apply to the AVURLAsset's URL.
     * This init option allows the AVURLAsset to use additional HTTP cookies for those HTTP(S) requests.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetHTTPCookiesKey();

    /**
     * [@constant] AVURLAssetAllowsCellularAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the cellular interface.
     * 
     * Default is YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsCellularAccessKey();

    /**
     * [@constant] AVAssetDurationDidChangeNotification
     * 
     * Posted when the duration of an AVFragmentedAsset changes while it's being minded by an AVFragmentedAssetMinder,
     * but only for changes that occur after the status of the value of @"duration" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDurationDidChangeNotification();

    /**
     * [@constant] AVAssetChapterMetadataGroupsDidChangeNotification
     * 
     * Posted when the collection of arrays of timed metadata groups representing chapters of an AVAsset change and when
     * any of the contents of the timed metadata groups change, but only for changes that occur after the status of the
     * value of @"availableChapterLocales" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetChapterMetadataGroupsDidChangeNotification();

    /**
     * [@constant] AVAssetMediaSelectionGroupsDidChangeNotification
     * 
     * Posted when the collection of media selection groups provided by an AVAsset changes and when any of the contents
     * of its media selection groups change, but only for changes that occur after the status of the value
     * of @"availableMediaCharacteristicsWithMediaSelectionOptions" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetMediaSelectionGroupsDidChangeNotification();

    /**
     * These export options can be used to produce movie files with video size appropriate to the device.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * H.264 and the audio will be compressed using AAC.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetLowQuality();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetMediumQuality();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHighestQuality();

    /**
     * These export options can be used to produce movie files with the specified video size.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * H.264 and the audio will be compressed using AAC. Some devices cannot support some sizes.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset640x480();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset960x540();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset1280x720();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset1920x1080();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPreset3840x2160();

    /**
     * This export option will produce an audio-only .m4a file with appropriate iTunes gapless playback data
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetAppleM4A();

    /**
     * This export option will cause the media of all tracks to be passed through to the output exactly as stored in the
     * source asset, except for
     * tracks for which passthrough is not possible, usually because of constraints of the container format as indicated
     * by the specified outputFileType.
     * This option is not included in the arrays returned by -allExportPresets and -exportPresetsCompatibleWithAsset.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetPassthrough();

    /**
     * [@constant] AVAssetImageGeneratorApertureModeCleanAperture
     * 
     * Both pixel aspect ratio and clean aperture will be applied.
     * 
     * An image's clean aperture is a region of video free from transition artifacts caused by the encoding of the
     * signal.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeCleanAperture();

    /**
     * [@constant] AVAssetImageGeneratorApertureModeProductionAperture
     * 
     * Only pixel aspect ratio will be applied.
     * 
     * The image is not cropped to the clean aperture region, but it is scaled according to the pixel aspect ratio. Use
     * this option when you want to see all the pixels in your video, including the edges.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeProductionAperture();

    /**
     * [@constant] AVAssetImageGeneratorApertureModeEncodedPixels
     * 
     * Neither pixel aspect ratio nor clean aperture will be applied.
     * 
     * The image is not cropped to the clean aperture region and is not scaled according to the pixel aspect ratio. The
     * encoded dimensions of the image description are displayed.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetImageGeneratorApertureModeEncodedPixels();

    /**
     * Options keys for use with -[AVAssetResourceLoadingRequest
     * streamingContentKeyRequestDataForApp:contentIdentifier:trackID:options:error:]
     * [@constant] AVAssetResourceLoadingRequestStreamingContentKeyRequestRequiresPersistentKey
     * 
     * Specifies whether the content key request should require a persistable key to be returned from the key vendor.
     * Value should be a NSNumber created with +[NSNumber numberWithBool:].
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetResourceLoadingRequestStreamingContentKeyRequestRequiresPersistentKey();

    /**
     * [@constant] AVTrackAssociationTypeAudioFallback
     * 
     * Indicates an association between an audio track with another audio track that contains the same content but is
     * typically encoded in a different format that's more widely supported, used to nominate a track that should be
     * used in place of an unsupported track.
     * 
     * Associations of type AVTrackAssociationTypeAudioFallback are supported only between audio tracks. This
     * association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the
     * receiver should be an instance of AVAssetWriterInput with a corresponding track that has content that's less
     * widely supported, and the input parameter should be an instance of AVAssetWriterInput with a corresponding track
     * that has content that's more widely supported.
     * 
     * Example: Using AVTrackAssociationTypeAudioFallback, a stereo audio track with media subtype kAudioFormatMPEG4AAC
     * could be nominated as the "fallback" for an audio track encoding the same source material but with media subtype
     * kAudioFormatAC3 and a 5.1 channel layout. This would ensure that all clients are capable of playing back some
     * form of the audio.
     * 
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeAudioFallback();

    /**
     * [@constant] AVTrackAssociationTypeChapterList
     * 
     * Indicates an association between a track with another track that contains chapter information. The track
     * containing chapter information may be a text track, a video track, or a timed metadata track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput
     * addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a
     * corresponding track that has renderable content while the input parameter should be an instance of
     * AVAssetWriterInput with a corresponding track that contains chapter metadata.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeChapterList();

    /**
     * [@constant] AVTrackAssociationTypeForcedSubtitlesOnly
     * 
     * Indicates an association between a subtitle track typically containing both forced and non-forced subtitles with
     * another subtitle track that contains only forced subtitles, for use when the user indicates that only essential
     * subtitles should be displayed. When such an association is established, the forced subtitles in both tracks are
     * expected to present the same content in the same language but may have different timing.
     * 
     * Associations of type AVTrackAssociationTypeForcedSubtitlesOnly are supported only between subtitle tracks. This
     * association is not symmetric; when used with -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:], the
     * receiver should be an instance of AVAssetWriterInput with a corresponding subtitle track that contains non-forced
     * subtitles, and the input parameter should be an instance of AVAssetWriterInput with a corresponding subtitle
     * track that contains forced subtitles only.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeForcedSubtitlesOnly();

    /**
     * [@constant] AVTrackAssociationTypeSelectionFollower
     * 
     * Indicates an association between a pair of tracks that specifies that, when the first of the pair is selected,
     * the second of the pair should be considered an appropriate default for selection also. Example: a subtitle track
     * in the same language as an audio track may be associated with that audio track using
     * AVTrackAssociationTypeSelectionFollower, to indicate that selection of the subtitle track, in the absence of a
     * directive for subtitle selection from the user, can "follow" the selection of the audio track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput
     * addTrackAssociationWithTrackOfInput:type:], the input parameter should be an instance of AVAssetWriterInput whose
     * selection may depend on the selection of the receiver. In the example above, the receiver would be the instance
     * of AVAssetWriterInput corresponding with the audio track and the input parameter would be the instance of
     * AVAssetWriterInput corresponding with the subtitle track.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeSelectionFollower();

    /**
     * [@constant] AVTrackAssociationTypeTimecode
     * 
     * Indicates an association between a track with another track that contains timecode information. The track
     * containing timecode information should be a timecode track.
     * 
     * This association is not symmetric; when used with -[AVAssetWriterInput
     * addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with a
     * corresponding track that may be a video track or an audio track while the input parameter should be an instance
     * of AVAssetWriterInput with a corresponding timecode track.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeTimecode();

    /**
     * [@constant] AVTrackAssociationTypeMetadataReferent
     * 
     * Indicates an association between a metadata track and the track that's described or annotated via the contents of
     * the metadata track.
     * 
     * This track association is optional for AVAssetTracks with the mediaType AVMediaTypeMetadata. When a metadata
     * track lacks this track association, its contents are assumed to describe or annotate the asset as a whole.
     * This association is not symmetric; when used with -[AVAssetWriterInput
     * addTrackAssociationWithTrackOfInput:type:], the receiver should be an instance of AVAssetWriterInput with
     * mediaType AVMediaTypeMetadata while the input parameter should be an instance of AVAssetWriterInput that's used
     * to create the track to which the contents of the receiver's corresponding metadata track refer.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVTrackAssociationTypeMetadataReferent();

    /**
     * [@constant] AVAssetTrackTimeRangeDidChangeNotification
     * 
     * Posted when the timeRange of an AVFragmentedAssetTrack changes while the associated instance of AVFragmentedAsset
     * is being minded by an AVFragmentedAssetMinder, but only for changes that occur after the status of the value
     * of @"timeRange" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackTimeRangeDidChangeNotification();

    /**
     * [@constant] AVAssetTrackSegmentsDidChangeNotification
     * 
     * Posted when the array of segments of an AVFragmentedAssetTrack changes while the associated instance of
     * AVFragmentedAsset is being minded by an AVFragmentedAssetMinder, but only for changes that occur after the status
     * of the value of @"segments" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackSegmentsDidChangeNotification();

    /**
     * [@constant] AVAssetTrackTrackAssociationsDidChangeNotification
     * 
     * Posted when the collection of track associations of an AVAssetTrack changes, but only for changes that occur
     * after the status of the value of @"availableTrackAssociationTypes" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetTrackTrackAssociationsDidChangeNotification();

    /**
     * Values for time pitch algorithm
     * 
     * [@constant] AVAudioTimePitchAlgorithmLowQualityZeroLatency
     * Low quality, very inexpensive. Suitable for brief fast-forward/rewind effects, low quality voice.
     * Rate snapped to {0.5, 0.666667, 0.8, 1.0, 1.25, 1.5, 2.0}.
     * 
     * [@constant] AVAudioTimePitchAlgorithmTimeDomain
     * Modest quality, less expensive. Suitable for voice.
     * Variable rate from 1/32 to 32.
     * 
     * [@constant] AVAudioTimePitchAlgorithmSpectral
     * Highest quality, most computationally expensive. Suitable for music.
     * Variable rate from 1/32 to 32.
     * 
     * [@constant] AVAudioTimePitchAlgorithmVarispeed
     * High quality, no pitch correction. Pitch varies with rate.
     * Variable rate from 1/32 to 32.
     * 
     * 
     * API-Since: 7.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use AVAudioTimePitchAlgorithmTimeDomain instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmLowQualityZeroLatency();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmTimeDomain();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmSpectral();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAudioTimePitchAlgorithmVarispeed();

    /**
     * [@constant] AVAssetDownloadTaskMinimumRequiredMediaBitrateKey
     * 
     * The lowest media bitrate greater than or equal to this value will be selected. Value should be a NSNumber in bps.
     * If no suitable media bitrate is found, the highest media bitrate will be selected.
     * The value for this key should be a NSNumber.
     * 
     * By default, the highest media bitrate will be selected for download.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMinimumRequiredMediaBitrateKey();

    /**
     * [@constant] AVAssetDownloadTaskMediaSelectionKey
     * 
     * The media selection for this download.
     * The value for this key should be an AVMediaSelection.
     * 
     * By default, media selections for AVAssetDownloadTask will be automatically selected.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMediaSelectionKey();

    /**
     * [@constant] AVCaptureDeviceWasConnectedNotification
     * 
     * Posted when a device becomes available on the system.
     * 
     * The notification object is an AVCaptureDevice instance representing the device that became available.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceWasConnectedNotification();

    /**
     * [@constant] AVCaptureDeviceWasDisconnectedNotification
     * 
     * Posted when a device becomes unavailable on the system.
     * 
     * The notification object is an AVCaptureDevice instance representing the device that became unavailable.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceWasDisconnectedNotification();

    /**
     * [@constant] AVCaptureDeviceSubjectAreaDidChangeNotification
     * 
     * Posted when the instance of AVCaptureDevice has detected a substantial change to the video subject area.
     * 
     * Clients may observe the AVCaptureDeviceSubjectAreaDidChangeNotification to know when an instance of
     * AVCaptureDevice has detected a substantial change to the video subject area. This notification is only sent if
     * you first set subjectAreaChangeMonitoringEnabled to YES.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceSubjectAreaDidChangeNotification();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInMicrophone
     * A built-in microphone.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInMicrophone();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInWideAngleCamera
     * A built-in wide angle camera device. These devices are suitable for general purpose use.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInWideAngleCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTelephotoCamera
     * A built-in camera device with a longer focal length than a wide angle camera. Note that devices of this type may
     * only be discovered using an AVCaptureDeviceDiscoverySession.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTelephotoCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDualCamera
     * A device that consists of two fixed focal length cameras, one wide and one telephoto. Note that devices of this
     * type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice
     * defaultDeviceWithDeviceType:mediaType:position:].
     * 
     * A device of this device type supports the following features:
     * - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     * - Higher quality zoom for still captures by fusing images from both cameras.
     * - Depth data delivery by measuring the disparity of matched features between the wide and telephoto cameras.
     * - Delivery of photos from constituent devices (wide and telephoto cameras) via a single photo capture request.
     * 
     * A device of this device type does not support the following features:
     * - AVCaptureExposureModeCustom and manual exposure bracketing.
     * - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     * - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     * Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the
     * device switches from one camera to the other. The overall exposure, white balance, and focus position however
     * should be consistent.
     * 
     * API-Since: 10.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDualCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDuoCamera
     * A deprecated synonym for AVCaptureDeviceTypeBuiltInDualCamera. Please use AVCaptureDeviceTypeBuiltInDualCamera
     * instead.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.2
     * Deprecated-Message: Use AVCaptureDeviceTypeBuiltInDualCamera instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDuoCamera();

    /**
     * [@constant] AVCaptureMaxAvailableTorchLevel
     * A special value that may be passed to -setTorchModeWithLevel:error: to set the torch to the maximum level
     * currently available. Under thermal duress, the maximum available torch level may be less than 1.0.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native float AVCaptureMaxAvailableTorchLevel();

    /**
     * [@constant] AVCaptureLensPositionCurrent
     * A special value that may be passed as the lensPosition parameter of
     * setFocusModeLockedWithLensPosition:completionHandler: to indicate that the caller does not wish to specify a
     * value for the lensPosition property, and that it should instead be set to its current value. Note that the device
     * may be adjusting lensPosition at the time of the call, in which case the value at which lensPosition is locked
     * may differ from the value obtained by querying the lensPosition property.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native float AVCaptureLensPositionCurrent();

    /**
     * [@constant] AVCaptureExposureDurationCurrent
     * A special value that may be passed as the duration parameter of
     * setExposureModeCustomWithDuration:ISO:completionHandler: to indicate that the caller does not wish to specify a
     * value for the exposureDuration property, and that it should instead be set to its current value. Note that the
     * device may be adjusting exposureDuration at the time of the call, in which case the value to which
     * exposureDuration is set may differ from the value obtained by querying the exposureDuration property.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CMTime AVCaptureExposureDurationCurrent();

    /**
     * [@constant] AVCaptureISOCurrent
     * A special value that may be passed as the ISO parameter of
     * setExposureModeCustomWithDuration:ISO:completionHandler: to indicate that the caller does not wish to specify a
     * value for the ISO property, and that it should instead be set to its current value. Note that the device may be
     * adjusting ISO at the time of the call, in which case the value to which ISO is set may differ from the value
     * obtained by querying the ISO property.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native float AVCaptureISOCurrent();

    /**
     * [@constant] AVCaptureExposureTargetBiasCurrent
     * A special value that may be passed as the bias parameter of setExposureTargetBias:completionHandler: to indicate
     * that the caller does not wish to specify a value for the exposureTargetBias property, and that it should instead
     * be set to its current value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native float AVCaptureExposureTargetBiasCurrent();

    /**
     * [@constant] AVCaptureWhiteBalanceGainsCurrent
     * A special value that may be passed as a parameter of
     * setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler: to indicate that the caller does not wish
     * to specify a value for deviceWhiteBalanceGains, and that gains should instead be locked at their value at the
     * moment that white balance is locked.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native AVCaptureWhiteBalanceGains AVCaptureWhiteBalanceGainsCurrent();

    /**
     * [@constant] AVCaptureInputPortFormatDescriptionDidChangeNotification
     * 
     * This notification is posted when the value of an AVCaptureInputPort instance's formatDescription property
     * changes.
     * 
     * The notification object is the AVCaptureInputPort instance whose format description changed.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureInputPortFormatDescriptionDidChangeNotification();

    /**
     * [@constant] AVCaptureSessionRuntimeErrorNotification
     * 
     * Posted when an unexpected error occurs while an AVCaptureSession instance is running.
     * 
     * The notification object is the AVCaptureSession instance that encountered a runtime error. The userInfo
     * dictionary contains an NSError for the key AVCaptureSessionErrorKey.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionRuntimeErrorNotification();

    /**
     * [@constant] AVCaptureSessionErrorKey
     * 
     * The key used to provide an NSError describing the failure condition in an
     * AVCaptureSessionRuntimeErrorNotification.
     * 
     * AVCaptureSessionErrorKey may be found in the userInfo dictionary provided with an
     * AVCaptureSessionRuntimeErrorNotification. The NSError associated with the notification gives greater detail on
     * the nature of the error, and in some cases recovery suggestions.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionErrorKey();

    /**
     * [@constant] AVCaptureSessionDidStartRunningNotification
     * 
     * Posted when an instance of AVCaptureSession successfully starts running.
     * 
     * Clients may observe the AVCaptureSessionDidStartRunningNotification to know when an instance of AVCaptureSession
     * starts running.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionDidStartRunningNotification();

    /**
     * [@constant] AVCaptureSessionDidStopRunningNotification
     * 
     * Posted when an instance of AVCaptureSession stops running.
     * 
     * Clients may observe the AVCaptureSessionDidStopRunningNotification to know when an instance of AVCaptureSession
     * stops running. An AVCaptureSession instance may stop running automatically due to external system conditions,
     * such as the device going to sleep, or being locked by a user.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionDidStopRunningNotification();

    /**
     * [@constant] AVCaptureSessionWasInterruptedNotification
     * 
     * Posted when an instance of AVCaptureSession becomes interrupted.
     * 
     * Clients may observe the AVCaptureSessionWasInterruptedNotification to know when an instance of AVCaptureSession
     * has been interrupted, for example, by an incoming phone call, or alarm, or another application taking control of
     * needed hardware resources. When appropriate, the AVCaptureSession instance will stop running automatically in
     * response to an interruption.
     * 
     * Beginning in iOS 9.0, the AVCaptureSessionWasInterruptedNotification userInfo dictionary contains an
     * AVCaptureSessionInterruptionReasonKey indicating the reason for the interruption.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionWasInterruptedNotification();

    /**
     * [@constant] AVCaptureSessionInterruptionReasonKey
     * 
     * The key used to provide an NSNumber describing the interruption reason in an
     * AVCaptureSessionWasInterruptedNotification.
     * 
     * AVCaptureSessionInterruptionReasonKey may be found in the userInfo dictionary provided with an
     * AVCaptureSessionWasInterruptedNotification. The NSNumber associated with the notification tells you why the
     * interruption occurred.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionReasonKey();

    /**
     * [@constant] AVCaptureSessionInterruptionEndedNotification
     * 
     * Posted when an instance of AVCaptureSession ceases to be interrupted.
     * 
     * Clients may observe the AVCaptureSessionInterruptionEndedNotification to know when an instance of
     * AVCaptureSession ceases to be interrupted, for example, when a phone call ends, and hardware resources needed to
     * run the session are again available. When appropriate, the AVCaptureSession instance that was previously stopped
     * in response to an interruption will automatically restart once the interruption ends.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionEndedNotification();

    /**
     * [@constant] AVCaptureSessionPresetPhoto
     * 
     * An AVCaptureSession preset suitable for high resolution photo quality output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetPhoto for full resolution
     * photo quality output.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetPhoto();

    /**
     * [@constant] AVCaptureSessionPresetHigh
     * 
     * An AVCaptureSession preset suitable for high quality video and audio output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetHigh to achieve high
     * quality video and audio output. AVCaptureSessionPresetHigh is the default sessionPreset value.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetHigh();

    /**
     * [@constant] AVCaptureSessionPresetMedium
     * 
     * An AVCaptureSession preset suitable for medium quality output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetMedium to achieve output
     * video and audio bitrates suitable for sharing over WiFi.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetMedium();

    /**
     * [@constant] AVCaptureSessionPresetLow
     * 
     * An AVCaptureSession preset suitable for low quality output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetLow to achieve output video
     * and audio bitrates suitable for sharing over 3G.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetLow();

    /**
     * [@constant] AVCaptureSessionPreset352x288
     * 
     * An AVCaptureSession preset suitable for 352x288 video output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset352x288 to achieve CIF
     * quality (352x288) output.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset352x288();

    /**
     * [@constant] AVCaptureSessionPreset640x480
     * 
     * An AVCaptureSession preset suitable for 640x480 video output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset640x480 to achieve VGA
     * quality (640x480) output.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset640x480();

    /**
     * [@constant] AVCaptureSessionPreset1280x720
     * 
     * An AVCaptureSession preset suitable for 1280x720 video output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset1280x720 to achieve
     * 1280x720 output.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset1280x720();

    /**
     * [@constant] AVCaptureSessionPreset1920x1080
     * 
     * An AVCaptureSession preset suitable for 1920x1080 video output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset1920x1080 to achieve
     * 1920x1080 output.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset1920x1080();

    /**
     * [@constant] AVCaptureSessionPreset3840x2160
     * 
     * An AVCaptureSession preset suitable for 3840x2160 (UHD 4K) video output.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPreset3840x2160 to achieve
     * 3840x2160 output.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPreset3840x2160();

    /**
     * [@constant] AVCaptureSessionPresetiFrame960x540
     * 
     * An AVCaptureSession preset producing 960x540 Apple iFrame video and audio content.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetiFrame960x540 to achieve
     * 960x540 quality iFrame H.264 video at ~30 Mbits/sec with AAC audio. QuickTime movies captured in iFrame format
     * are optimal for editing applications.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetiFrame960x540();

    /**
     * [@constant] AVCaptureSessionPresetiFrame1280x720
     * 
     * An AVCaptureSession preset producing 1280x720 Apple iFrame video and audio content.
     * 
     * Clients may set an AVCaptureSession instance's sessionPreset to AVCaptureSessionPresetiFrame1280x720 to achieve
     * 1280x720 quality iFrame H.264 video at ~40 Mbits/sec with AAC audio. QuickTime movies captured in iFrame format
     * are optimal for editing applications.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetiFrame1280x720();

    /**
     * [@constant] AVCaptureSessionPresetInputPriority
     * 
     * An AVCaptureSession preset indicating that the formats of the session's inputs are being given priority.
     * 
     * By calling -setSessionPreset:, clients can easily configure an AVCaptureSession to produce a desired quality of
     * service level. The session configures its inputs and outputs optimally to produce the QoS level indicated.
     * Clients who need to ensure a particular input format is chosen can use AVCaptureDevice's -setActiveFormat:
     * method. When a client sets the active format on a device, the associated session's -sessionPreset property
     * automatically changes to AVCaptureSessionPresetInputPriority. This change indicates that the input format
     * selected by the client now dictates the quality of service level provided at the outputs. When a client sets the
     * session preset to anything other than AVCaptureSessionPresetInputPriority, the session resumes responsibility for
     * configuring inputs and outputs, and is free to change its inputs' activeFormat as needed.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionPresetInputPriority();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFoundationErrorDomain();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorDeviceKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorTimeKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorFileSizeKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPIDKey();

    /**
     * an NSNumber carrying a BOOL indicating whether the recording is playable
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorRecordingSuccessfullyFinishedKey();

    /**
     * an NSString, as defined in AVMediaFormat.h
     * 
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorMediaTypeKey();

    /**
     * an NSArray of NSNumbers carrying four character codes (4ccs) as defined in CoreAudioTypes.h for audio media and
     * in CMFormatDescription.h for video media.
     * 
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorMediaSubTypeKey();

    /**
     * an NSValue carrying a CMTime
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPresentationTimeStampKey();

    /**
     * an NSNumber carrying a CMPersistentTrackID
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorPersistentTrackIDKey();

    /**
     * an NSString, as defined in AVMediaFormat.h
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVErrorFileTypeKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeVideo();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeAudio();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeText();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeClosedCaption();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeSubtitle();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeTimecode();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaTypeMetadata();

    /**
     * API-Since: 4.0
     */
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
     * AVCaptureMetadataOutput through an AVCaptureInputPort whose mediaType is AVMediaTypeMetadata. The
     * AVCaptureMetadataOutput presents metadata to the client as an array of AVMetadataObjects, which are
     * defined by Apple and not externally subclassable. Starting in iOS 9.0, clients may record arbitrary
     * metadata to a movie file using the AVCaptureMovieFileOutput. The movie file output consumes metadata
     * in a different format than the AVCaptureMetadataOutput, namely it accepts CMSampleBuffers of type
     * 'meta'. Starting in iOS 9.0, two types of AVCaptureInput can produce suitable metadata for the
     * movie file output.
     * 
     * <ul>
     * <li>The camera AVCaptureDeviceInput now presents an additional AVCaptureInputPort for recording detected
     * faces to a movie file. When linked on or after iOS 9, ports that deliver AVCaptureMetadataObjects have a
     * mediaType of AVMediaTypeMetadataObject rather than AVMediaTypeMetadata. Input ports that deliver CMSampleBuffer
     * metadata have a mediaType of AVMediaTypeMetadata.</li>
     * 
     * <li>New to iOS 9 is the AVCaptureMetadataInput, which allows clients to record arbitrary metadata to a movie
     * file. Clients package metadata as an AVTimedMetadataGroup, the AVCaptureMetadataInput presents a port of
     * mediaType
     * AVMediaTypeMetadata, and when connected to a movie file output, transforms the timed metadata group's
     * AVMetadataItems
     * into CMSampleBuffers which can be written to the movie file.</li>
     * </ul>
     * 
     * When linked on or after iOS 9, AVCaptureInputPorts with a mediaType of AVMediaTypeMetadata are handled
     * specially by the AVCaptureSession. When inputs and outputs are added to the session, the session does
     * not form connections implicitly between eligible AVCaptureOutputs and input ports of type AVMediaTypeMetadata.
     * If clients want to record a particular kind of metadata to a movie, they must manually form connections
     * between a AVMediaTypeMetadata port and the movie file output using AVCaptureSession's -addConnection API.
     * 
     * API-Since: 9.0
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
     * AVMediaTypeVideo, AVMediaTypeSubtitle, AVMediaTypeClosedCaption are examples of media types with the
     * characteristic AVMediaCharacteristicVisual.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * AVMediaTypeSubtitle and AVMediaTypeClosedCaption are examples of media types with the characteristic
     * AVMediaCharacteristicLegible.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 4.0
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
     * Frame-based content typically comprises discrete media samples that, once rendered, can remain current for
     * indefinite periods of time without additional processing in support of "time-stretching". Further, any
     * dependencies between samples are always explicitly signalled, so that the operations required to render any
     * single sample can readily be performed on demand. AVMediaTypeVideo is the most common type of frame-based media.
     * AVMediaTypeAudio is the most common counterexample.
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicFrameBased();

    /**
     * [@constant] AVMediaCharacteristicUsesWideGamutColorSpace
     * 
     * A media characteristic that indicates that a track uses a wide gamut color space and therefore may make use of
     * colors that cannot be accurately represented otherwise.
     * 
     * A wide color space such as AVVideo*_P3_D65 contains additional dynamic range that may benefit from special
     * treatment when compositing. Care should be taken to avoid clamping. Non-wide spaces include AVVideo*_ITU_R_709_2
     * and AVVideo*_SMPTE_C.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicUsesWideGamutColorSpace();

    /**
     * [@constant] AVMediaCharacteristicIsMainProgramContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by
     * the content author as intrinsic to the presentation of the asset.
     * 
     * Example: an option that presents the main program audio for the presentation, regardless of locale, would
     * typically have this characteristic.
     * The value of this characteristic is @"public.main-program-content".
     * Note for content authors: the presence of this characteristic for a media option is inferred; any option that
     * does not have the characteristic AVMediaCharacteristicIsAuxiliaryContent is considered to have the characteristic
     * AVMediaCharacteristicIsMainProgramContent.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicIsMainProgramContent();

    /**
     * [@constant] AVMediaCharacteristicIsAuxiliaryContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by
     * the content author as auxiliary to the presentation of the asset.
     * 
     * The value of this characteristic is @"public.auxiliary-content".
     * Example: an option that presents audio media containing commentary on the presentation would typically have this
     * characteristic.
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicIsAuxiliaryContent if it's explicitly tagged with that characteristic or if,
     * as a member of an alternate track group, its associated track is excluded from autoselection.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
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
     * Media options with forced-only subtitles are typically selected when 1) the user has not selected a legible
     * option with an accessibility characteristic or an auxiliary purpose and 2) its locale matches the locale of the
     * selected audible media selection option.
     * The value of this characteristic is @"public.subtitles.forced-only".
     * Note for content authors: the presence of this characteristic for a legible media option may be inferred from the
     * format description of the associated track that presents the subtitle media, if the format description carries
     * sufficient information to indicate the presence or absence of forced and non-forced subtitles. If the format
     * description does not carry this information, the legible media option can be explicitly tagged with the
     * characteristic.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicContainsOnlyForcedSubtitles();

    /**
     * [@constant] AVMediaCharacteristicTranscribesSpokenDialogForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the
     * language of its specified locale that:
     * - transcribes spoken dialog and
     * - identifies speakers whenever other visual cues are insufficient for a viewer to determine who is speaking.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as
     * with AVMediaCharacteristicDescribesMusicAndSoundForAccessibility.
     * 
     * A legible track provided for accessibility purposes that's associated with an audio track that has no spoken
     * dialog can be tagged with this characteristic, because it trivially meets these requirements.
     * 
     * The value of this characteristic is @"public.accessibility.transcribes-spoken-dialog".
     * 
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicTranscribesSpokenDialogForAccessibility only if it's explicitly tagged with
     * that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicTranscribesSpokenDialogForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicDescribesMusicAndSoundForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the
     * language of its specified locale that:
     * - describes music and
     * - describes sound other than spoken dialog, such as sound effects and significant silences, occurring in program
     * audio.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as
     * with AVMediaCharacteristicTranscribesSpokenDialogForAccessibility.
     * 
     * A legible track provided for accessibility purposes that's associated with an audio track without music and
     * without sound other than spoken dialog -- lacking even significant silences -- can be tagged with this
     * characteristic, because it trivially meets these requirements.
     * 
     * The value of this characteristic is @"public.accessibility.describes-music-and-sound".
     * 
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicDescribesMusicAndSoundForAccessibility only if it's explicitly tagged with
     * that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDescribesMusicAndSoundForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicEasyToRead
     * 
     * A media characteristic that indicates that a track or media selection option provides legible content in the
     * language of its specified locale that has been edited for ease of reading.
     * 
     * The value of this characteristic is @"public.easy-to-read".
     * 
     * Closed caption tracks that carry "easy reader" captions (per the CEA-608 specification) should be tagged with
     * this characteristic. Subtitle tracks can also be tagged with this characteristic, where appropriate.
     * 
     * Note for content authors: for QuickTime movie and .m4v files a track is considered to have the characteristic
     * AVMediaCharacteristicEasyToRead only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicEasyToRead();

    /**
     * [@constant] AVMediaCharacteristicDescribesVideoForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option provides descriptions of the visual
     * portion of the presentation that are sufficient to comprehend essential information that it depicts, such as
     * action and setting.
     * 
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.accessibility.describes-video".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicDescribesVideoForAccessibility only if it's explicitly tagged with that
     * characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDescribesVideoForAccessibility();

    /**
     * [@constant] AVMediaCharacteristicLanguageTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language or dialect
     * translation of originally or previously produced content, intended to be used as a substitute for that content by
     * users who prefer its designated language.
     * 
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicLanguageTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicLanguageTranslation();

    /**
     * [@constant] AVMediaCharacteristicDubbedTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language or dialect
     * translation of originally or previously produced content, created by substituting most or all of the dialog in a
     * previous mix of audio content with dialog spoken in its designated language.
     * 
     * Tracks to which this characteristic is assigned should typically also be assigned the characteristic
     * AVMediaCharacteristicLanguageTranslation.
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation.dubbed".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicDubbedTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicDubbedTranslation();

    /**
     * [@constant] AVMediaCharacteristicVoiceOverTranslation
     * 
     * A media characteristic that indicates that a track or media selection option contains a language translation of
     * originally or previously produced content, created by adding, in its designated language, a verbal interpretation
     * of dialog and translations of other important information to a new mix of the audio content.
     * 
     * Tracks to which this characteristic is assigned should typically also be assigned the characteristic
     * AVMediaCharacteristicLanguageTranslation.
     * See -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * The value of this characteristic is @"public.translation.voice-over".
     * Note for content authors: for QuickTime movie and .m4v files a media option is considered to have the
     * characteristic AVMediaCharacteristicVoiceOverTranslation only if it's explicitly tagged with that characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * API-Since: 9.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 4.0
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
     * 
     * API-Since: 7.0
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
     * 
     * API-Since: 7.0
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
     * 
     * API-Since: 7.0
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
     * 
     * API-Since: 9.0
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
     * 
     * API-Since: 9.0
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
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVStreamingKeyDeliveryPersistentContentKeyType();

    /**
     * CommonMetadata
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceCommon();

    /**
     * Metadata common keys
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyTitle();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCreator();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySubject();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyDescription();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyPublisher();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyContributor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCreationDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLastModifiedDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyType();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyFormat();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyIdentifier();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySource();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLanguage();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyRelation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyLocation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyCopyrights();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAlbumName();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAuthor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyArtwork();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyMake();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyModel();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeySoftware();

    /**
     * QuickTimeUserData
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatQuickTimeUserData();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceQuickTimeUserData();

    /**
     * QuickTimeUserData keys
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAlbum();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyArranger();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAuthor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyChapter();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyComment();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyComposer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCopyright();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCreationDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDescription();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDirector();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyDisclaimer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyEncodedBy();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyFullName();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyGenre();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyHostComputer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyInformation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyKeywords();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyMake();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyModel();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalFormat();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyOriginalSource();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPerformers();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyProducer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPublisher();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyProduct();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeySoftware();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeySpecialPlaybackRequirements();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTrack();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyWarning();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyWriter();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyURLLink();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyLocationISO6709();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTrackName();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyCredits();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyPhonogramRights();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyTaggedCharacteristic();

    /**
     * ISO UserData
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatISOUserData();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceISOUserData();

    /**
     * ISO UserData keys (includes 3GPP keys)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyCopyright();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyTaggedCharacteristic();

    /**
     * [@constant] AVMetadataISOUserDataKeyDate
     * 
     * ISO User data key for the content creation date/time.
     * 
     * The value is date and time, formatted according to ISO 8601, when the content was created. For clips captured by
     * recording devices, this is typically the date and time when the clip’s recording started. When stored in
     * AV(Mutable)MetadataItem, the value type must be either NSDate or NSString. When NSString is used, the value uses
     * one of ISO 8601 formats such as "2016-01-11T17:31:10Z".
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyCopyright();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyAuthor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyPerformer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyGenre();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyRecordingYear();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyLocation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyTitle();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyDescription();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyCollection();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyUserRating();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyThumbnail();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyAlbumAndTrack();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyKeywordList();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyMediaClassification();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadata3GPUserDataKeyMediaRating();

    /**
     * QuickTimeMetadata
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatQuickTimeMetadata();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceQuickTimeMetadata();

    /**
     * QuickTimeMetadata keys. For more information, see the QuickTime File Format Specification, available as part of
     * the Mac OS X Reference Library at http://developer.apple.com/library/mac/navigation/
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAuthor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyComment();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCopyright();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCreationDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirector();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDisplayName();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyInformation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyKeywords();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyProducer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPublisher();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAlbum();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArtwork();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDescription();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeySoftware();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyYear();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyGenre();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyiXML();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationISO6709();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyMake();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyModel();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyArranger();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyEncodedBy();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyOriginalArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPerformer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyComposer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCredits();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyPhonogramRights();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCameraIdentifier();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyTitle();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyCollectionUser();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyRatingUser();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationName();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationBody();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationNote();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationRole();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyLocationDate();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirectionFacing();

    /**
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyDirectionMotion();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyContentIdentifier();

    /**
     * iTunesMetadata
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatiTunesMetadata();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceiTunes();

    /**
     * iTunesMetadata keys
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAlbum();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyUserComment();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCoverArt();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCopyright();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyReleaseDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEncodedBy();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPredefinedGenre();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyUserGenre();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySongName();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyTrackSubTitle();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEncodingTool();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyComposer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAlbumArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAccountKind();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAppleID();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtistID();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySongID();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDiscCompilation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDiscNumber();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyGenreID();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyGrouping();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPlaylistID();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyContentRating();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyBeatsPerMin();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyTrackNumber();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArtDirector();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyArranger();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAuthor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyLyrics();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyAcknowledgement();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyConductor();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDescription();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyDirector();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyEQ();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyLinerNotes();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyRecordCompany();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyOriginalArtist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPhonogramRights();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyProducer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPerformer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyPublisher();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySoundEngineer();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeySoloist();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyCredits();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyThanks();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyOnlineExtras();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataiTunesMetadataKeyExecProducer();

    /**
     * ID3Metadata
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatID3Metadata();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceID3();

    /**
     * AENC Audio encryption
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAudioEncryption();

    /**
     * APIC Attached picture
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAttachedPicture();

    /**
     * ASPI Audio seek point index
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAudioSeekPointIndex();

    /**
     * COMM Comments
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyComments();

    /**
     * COMR Commercial frame
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommercial();

    /**
     * COMR Commercial frame
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommerical();

    /**
     * ENCR Encryption method registration
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncryption();

    /**
     * EQUA Equalization
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEqualization();

    /**
     * EQU2 Equalisation (2)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEqualization2();

    /**
     * ETCO Event timing codes
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEventTimingCodes();

    /**
     * GEOB General encapsulated object
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyGeneralEncapsulatedObject();

    /**
     * GRID Group identification registration
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyGroupIdentifier();

    /**
     * IPLS Involved people list
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v23();

    /**
     * LINK Linked information
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLink();

    /**
     * MCDI Music CD identifier
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMusicCDIdentifier();

    /**
     * MLLT MPEG location lookup table
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMPEGLocationLookupTable();

    /**
     * OWNE Ownership frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOwnership();

    /**
     * PRIV Private frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPrivate();

    /**
     * PCNT Play counter
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPlayCounter();

    /**
     * POPM Popularimeter
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPopularimeter();

    /**
     * POSS Position synchronisation frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPositionSynchronization();

    /**
     * RBUF Recommended buffer size
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecommendedBufferSize();

    /**
     * RVAD Relative volume adjustment
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment();

    /**
     * RVA2 Relative volume adjustment (2)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRelativeVolumeAdjustment2();

    /**
     * RVRB Reverb
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyReverb();

    /**
     * SEEK Seek frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySeek();

    /**
     * SIGN Signature frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySignature();

    /**
     * SYLT Synchronized lyric/text
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySynchronizedLyric();

    /**
     * SYTC Synchronized tempo codes
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySynchronizedTempoCodes();

    /**
     * TALB Album/Movie/Show title
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAlbumTitle();

    /**
     * TBPM BPM (beats per minute)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyBeatsPerMinute();

    /**
     * TCOM Composer
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyComposer();

    /**
     * TCON Content type
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyContentType();

    /**
     * TCOP Copyright message
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCopyright();

    /**
     * TDAT Date
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyDate();

    /**
     * TDEN Encoding time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodingTime();

    /**
     * TDLY Playlist delay
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPlaylistDelay();

    /**
     * TDOR Original release time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalReleaseTime();

    /**
     * TDRC Recording time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecordingTime();

    /**
     * TDRL Release time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyReleaseTime();

    /**
     * TDTG Tagging time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTaggingTime();

    /**
     * TENC Encoded by
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodedBy();

    /**
     * TEXT Lyricist/Text writer
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLyricist();

    /**
     * TFLT File type
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyFileType();

    /**
     * TIME Time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTime();

    /**
     * TIPL Involved people list
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInvolvedPeopleList_v24();

    /**
     * TIT1 Content group description
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyContentGroupDescription();

    /**
     * TIT2 Title/songname/content description
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTitleDescription();

    /**
     * TIT3 Subtitle/Description refinement
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySubTitle();

    /**
     * TKEY Initial key
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInitialKey();

    /**
     * TLAN Language(s)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLanguage();

    /**
     * TLEN Length
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLength();

    /**
     * TMCL Musician credits list
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMusicianCreditsList();

    /**
     * TMED Media type
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMediaType();

    /**
     * TMOO Mood
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyMood();

    /**
     * TOAL Original album/movie/show title
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalAlbumTitle();

    /**
     * TOFN Original filename
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalFilename();

    /**
     * TOLY Original lyricist(s)/text writer(s)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalLyricist();

    /**
     * TOPE Original artist(s)/performer(s)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalArtist();

    /**
     * TORY Original release year
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOriginalReleaseYear();

    /**
     * TOWN File owner/licensee
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyFileOwner();

    /**
     * TPE1 Lead performer(s)/Soloist(s)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyLeadPerformer();

    /**
     * TPE2 Band/orchestra/accompaniment
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyBand();

    /**
     * TPE3 Conductor/performer refinement
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyConductor();

    /**
     * TPE4 Interpreted, remixed, or otherwise modified by
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyModifiedBy();

    /**
     * TPOS Part of a set
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPartOfASet();

    /**
     * TPRO Produced notice
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyProducedNotice();

    /**
     * TPUB Publisher
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPublisher();

    /**
     * TRCK Track number/Position in set
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTrackNumber();

    /**
     * TRDA Recording dates
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyRecordingDates();

    /**
     * TRSN Internet radio station name
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternetRadioStationName();

    /**
     * TRSO Internet radio station owner
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternetRadioStationOwner();

    /**
     * TSIZ Size
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySize();

    /**
     * TSOA Album sort order
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyAlbumSortOrder();

    /**
     * TSOP Performer sort order
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPerformerSortOrder();

    /**
     * TSOT Title sort order
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTitleSortOrder();

    /**
     * TSRC ISRC (international standard recording code)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyInternationalStandardRecordingCode();

    /**
     * TSSE Software/Hardware and settings used for encoding
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyEncodedWith();

    /**
     * TSST Set subtitle
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeySetSubtitle();

    /**
     * TYER Year
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyYear();

    /**
     * TXXX User defined text information frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUserText();

    /**
     * UFID Unique file identifier
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUniqueFileIdentifier();

    /**
     * USER Terms of use
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyTermsOfUse();

    /**
     * USLT Unsynchronized lyric/text transcription
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUnsynchronizedLyric();

    /**
     * WCOM Commercial information
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCommercialInformation();

    /**
     * WCOP Copyright/Legal information
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyCopyrightInformation();

    /**
     * WOAF Official audio file webpage
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialAudioFileWebpage();

    /**
     * WOAR Official artist/performer webpage
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialArtistWebpage();

    /**
     * WOAS Official audio source webpage
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialAudioSourceWebpage();

    /**
     * WORS Official Internet radio station homepage
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage();

    /**
     * WPAY Payment
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyPayment();

    /**
     * WPUB Publishers official webpage
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyOfficialPublisherWebpage();

    /**
     * WXXX User defined URL link frame
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataID3MetadataKeyUserURL();

    /**
     * Icecast/ShoutCAST streaming metadata
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceIcy();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIcyMetadataKeyStreamTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIcyMetadataKeyStreamURL();

    /**
     * HTTP Live Streaming metadata
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatHLSMetadata();

    /**
     * HLS Metadata does not define its own keySpace or keys. Use of the keySpace AVMetadataKeySpaceQuickTimeMetadata
     * and its keys is recommended.
     * 
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceHLSDateRange();

    /**
     * [@constant] AVMetadataExtraAttributeValueURIKey
     * 
     * When present in an item's extraAttributes dictionary, identifies the resource to be used as the item's value.
     * Values for this key are of type NSString.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeValueURIKey();

    /**
     * [@constant] AVMetadataExtraAttributeBaseURIKey
     * 
     * When present in an item's extraAttributes dictionary, identifies the base URI against which other URIs related to
     * the item are to be resolved, e.g. AVMetadataExtraAttributeValueURIKey. Values for this key are of type NSString.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeBaseURIKey();

    /**
     * [@constant] AVMetadataExtraAttributeInfoKey
     * 
     * More information about the item; specific to the
     * item keySpace & key.
     * 
     * For example, this key is used with the following ID3 tags:
     * TXXX, WXXX, APIC, GEOB: carries the Description
     * PRIV: carries the Owner Identifier
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataExtraAttributeInfoKey();

    /**
     * CommonMetadata
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCreator();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSubject();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierDescription();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierPublisher();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierContributor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCreationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLastModifiedDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierType();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierFormat();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAssetIdentifier();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSource();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLanguage();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierRelation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierLocation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierCopyrights();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAlbumName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAuthor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierArtwork();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierMake();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierModel();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierSoftware();

    /**
     * QuickTimeUserData
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAlbum();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataArranger();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAuthor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataChapter();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataComment();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataComposer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCopyright();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCreationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDescription();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDirector();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataDisclaimer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataEncodedBy();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataFullName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataGenre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataHostComputer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataInformation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataKeywords();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataMake();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataModel();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalFormat();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataOriginalSource();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPerformers();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataProducer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPublisher();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataProduct();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataSoftware();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTrack();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataWarning();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataWriter();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataURLLink();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataLocationISO6709();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTrackName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataCredits();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataPhonogramRights();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic();

    /**
     * ISO UserData (includes 3GPP)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataCopyright();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataTaggedCharacteristic();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataCopyright();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataAuthor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataPerformer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataGenre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataRecordingYear();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataLocation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataDescription();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataCollection();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataUserRating();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataThumbnail();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataAlbumAndTrack();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataKeywordList();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataMediaClassification();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifier3GPUserDataMediaRating();

    /**
     * QuickTimeMetadata. For more information, see the QuickTime File Format Specification, available as part of the
     * Mac OS X Reference Library at http://developer.apple.com/library/mac/navigation/
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAuthor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataComment();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCopyright();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCreationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirector();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDisplayName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataInformation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataKeywords();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataProducer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPublisher();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAlbum();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArtwork();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDescription();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataSoftware();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataYear();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataGenre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataiXML();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationISO6709();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataMake();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataModel();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataArranger();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataEncodedBy();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataOriginalArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPerformer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataComposer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCredits();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPhonogramRights();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCameraIdentifier();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataCollectionUser();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataRatingUser();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationBody();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationNote();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationRole();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirectionFacing();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDirectionMotion();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedFace();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataVideoOrientation();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataContentIdentifier();

    /**
     * iTunesMetadata
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAlbum();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataUserComment();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCoverArt();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCopyright();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataReleaseDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEncodedBy();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPredefinedGenre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataUserGenre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSongName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataTrackSubTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEncodingTool();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataComposer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAlbumArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAccountKind();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAppleID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtistID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSongID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDiscCompilation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDiscNumber();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataGenreID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataGrouping();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPlaylistID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataContentRating();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataBeatsPerMin();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataTrackNumber();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArtDirector();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataArranger();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAuthor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataLyrics();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataAcknowledgement();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataConductor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDescription();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataDirector();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataEQ();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataLinerNotes();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataRecordCompany();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataOriginalArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPhonogramRights();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataProducer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPerformer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataPublisher();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSoundEngineer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataSoloist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataCredits();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataThanks();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataOnlineExtras();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifieriTunesMetadataExecProducer();

    /**
     * AENC Audio encryption
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAudioEncryption();

    /**
     * APIC Attached picture
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAttachedPicture();

    /**
     * ASPI Audio seek point index
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAudioSeekPointIndex();

    /**
     * COMM Comments
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataComments();

    /**
     * COMR Commercial frame
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommercial();

    /**
     * COMR Commercial frame
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommerical();

    /**
     * ENCR Encryption method registration
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncryption();

    /**
     * EQUA Equalization
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEqualization();

    /**
     * EQU2 Equalisation (2)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEqualization2();

    /**
     * ETCO Event timing codes
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEventTimingCodes();

    /**
     * GEOB General encapsulated object
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject();

    /**
     * GRID Group identification registration
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataGroupIdentifier();

    /**
     * IPLS Involved people list
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23();

    /**
     * LINK Linked information
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLink();

    /**
     * MCDI Music CD identifier
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMusicCDIdentifier();

    /**
     * MLLT MPEG location lookup table
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMPEGLocationLookupTable();

    /**
     * OWNE Ownership frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOwnership();

    /**
     * PRIV Private frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPrivate();

    /**
     * PCNT Play counter
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPlayCounter();

    /**
     * POPM Popularimeter
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPopularimeter();

    /**
     * POSS Position synchronisation frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPositionSynchronization();

    /**
     * RBUF Recommended buffer size
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecommendedBufferSize();

    /**
     * RVAD Relative volume adjustment
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment();

    /**
     * RVA2 Relative volume adjustment (2)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2();

    /**
     * RVRB Reverb
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataReverb();

    /**
     * SEEK Seek frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSeek();

    /**
     * SIGN Signature frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSignature();

    /**
     * SYLT Synchronized lyric/text
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSynchronizedLyric();

    /**
     * SYTC Synchronized tempo codes
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSynchronizedTempoCodes();

    /**
     * TALB Album/Movie/Show title
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAlbumTitle();

    /**
     * TBPM BPM (beats per minute)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataBeatsPerMinute();

    /**
     * TCOM Composer
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataComposer();

    /**
     * TCON Content type
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataContentType();

    /**
     * TCOP Copyright message
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCopyright();

    /**
     * TDAT Date
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataDate();

    /**
     * TDEN Encoding time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodingTime();

    /**
     * TDLY Playlist delay
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPlaylistDelay();

    /**
     * TDOR Original release time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalReleaseTime();

    /**
     * TDRC Recording time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecordingTime();

    /**
     * TDRL Release time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataReleaseTime();

    /**
     * TDTG Tagging time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTaggingTime();

    /**
     * TENC Encoded by
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodedBy();

    /**
     * TEXT Lyricist/Text writer
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLyricist();

    /**
     * TFLT File type
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataFileType();

    /**
     * TIME Time
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTime();

    /**
     * TIPL Involved people list
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24();

    /**
     * TIT1 Content group description
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataContentGroupDescription();

    /**
     * TIT2 Title/songname/content description
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTitleDescription();

    /**
     * TIT3 Subtitle/Description refinement
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSubTitle();

    /**
     * TKEY Initial key
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInitialKey();

    /**
     * TLAN Language(s)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLanguage();

    /**
     * TLEN Length
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLength();

    /**
     * TMCL Musician credits list
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMusicianCreditsList();

    /**
     * TMED Media type
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMediaType();

    /**
     * TMOO Mood
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataMood();

    /**
     * TOAL Original album/movie/show title
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalAlbumTitle();

    /**
     * TOFN Original filename
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalFilename();

    /**
     * TOLY Original lyricist(s)/text writer(s)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalLyricist();

    /**
     * TOPE Original artist(s)/performer(s)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalArtist();

    /**
     * TORY Original release year
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOriginalReleaseYear();

    /**
     * TOWN File owner/licensee
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataFileOwner();

    /**
     * TPE1 Lead performer(s)/Soloist(s)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataLeadPerformer();

    /**
     * TPE2 Band/orchestra/accompaniment
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataBand();

    /**
     * TPE3 Conductor/performer refinement
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataConductor();

    /**
     * TPE4 Interpreted, remixed, or otherwise modified by
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataModifiedBy();

    /**
     * TPOS Part of a set
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPartOfASet();

    /**
     * TPRO Produced notice
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataProducedNotice();

    /**
     * TPUB Publisher
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPublisher();

    /**
     * TRCK Track number/Position in set
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTrackNumber();

    /**
     * TRDA Recording dates
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataRecordingDates();

    /**
     * TRSN Internet radio station name
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternetRadioStationName();

    /**
     * TRSO Internet radio station owner
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternetRadioStationOwner();

    /**
     * TSIZ Size
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSize();

    /**
     * TSOA Album sort order
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataAlbumSortOrder();

    /**
     * TSOP Performer sort order
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPerformerSortOrder();

    /**
     * TSOT Title sort order
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTitleSortOrder();

    /**
     * TSRC ISRC (international standard recording code)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode();

    /**
     * TSSE Software/Hardware and settings used for encoding
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataEncodedWith();

    /**
     * TSST Set subtitle
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataSetSubtitle();

    /**
     * TYER Year
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataYear();

    /**
     * TXXX User defined text information frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUserText();

    /**
     * UFID Unique file identifier
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUniqueFileIdentifier();

    /**
     * USER Terms of use
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataTermsOfUse();

    /**
     * USLT Unsynchronized lyric/text transcription
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUnsynchronizedLyric();

    /**
     * WCOM Commercial information
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCommercialInformation();

    /**
     * WCOP Copyright/Legal information
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataCopyrightInformation();

    /**
     * WOAF Official audio file webpage
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage();

    /**
     * WOAR Official artist/performer webpage
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialArtistWebpage();

    /**
     * WOAS Official audio source webpage
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage();

    /**
     * WORS Official Internet radio station homepage
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage();

    /**
     * WPAY Payment
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataPayment();

    /**
     * WPUB Publishers official webpage
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataOfficialPublisherWebpage();

    /**
     * WXXX User defined URL link frame
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierID3MetadataUserURL();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierIcyMetadataStreamTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierIcyMetadataStreamURL();

    /**
     * [@constant] AVMetadataObjectTypeFace
     * 
     * An identifier for an instance of AVMetadataFaceObject.
     * 
     * AVMetadataFaceObject objects return this constant as their type.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeFace();

    /**
     * [@constant] AVMetadataObjectTypeUPCECode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeUPCECode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from UPC-E codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeUPCECode();

    /**
     * [@constant] AVMetadataObjectTypeCode39Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeCode39Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Code 39 codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode39Code();

    /**
     * [@constant] AVMetadataObjectTypeCode39Mod43Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeCode39Mod43Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Code 39 mod 43 codes return this constant as their
     * type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode39Mod43Code();

    /**
     * [@constant] AVMetadataObjectTypeEAN13Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeEAN13Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from EAN-13 (including UPC-A) codes return this constant as
     * their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeEAN13Code();

    /**
     * [@constant] AVMetadataObjectTypeEAN8Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeEAN8Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from EAN-8 codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeEAN8Code();

    /**
     * [@constant] AVMetadataObjectTypeCode93Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeCode93Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Code 93 codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode93Code();

    /**
     * [@constant] AVMetadataObjectTypeCode128Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeCode128Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Code 128 codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCode128Code();

    /**
     * [@constant] AVMetadataObjectTypePDF417Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypePDF417Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from PDF417 codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypePDF417Code();

    /**
     * [@constant] AVMetadataObjectTypeQRCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeQRCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from QR codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeQRCode();

    /**
     * [@constant] AVMetadataObjectTypeAztecCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeAztecCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Aztec codes return this constant as their type.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeAztecCode();

    /**
     * [@constant] AVMetadataObjectTypeInterleaved2of5Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeInterleaved2of5Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Interleaved 2 of 5 codes return this constant as their
     * type.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeInterleaved2of5Code();

    /**
     * [@constant] AVMetadataObjectTypeITF14Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type AVMetadataObjectTypeITF14Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from ITF14 codes return this constant as their type.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeITF14Code();

    /**
     * [@constant] AVMetadataObjectTypeDataMatrixCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeDataMatrixCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from DataMatrix codes return this constant as their type.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeDataMatrixCode();

    /**
     * Use these identifiers with +[AVOutputSettingsAssistant outputSettingsAssistantWithPreset:].
     * 
     * When source format information is supplied with these presets, the resulting video settings will not scale up the
     * video from a smaller size.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset640x480();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset960x540();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset1280x720();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset1920x1080();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPreset3840x2160();

    /**
     * [@constant] AVPlayerWaitingToMinimizeStallsReason
     * 
     * Indicates that the player is waiting for appropriate playback buffer conditions before starting playback
     * 
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and playback at the
     * specified rate would likely cause the playback buffer to become empty before playback completes. Playback will
     * resume when 1) playback at the specified rate will likely complete without a stall or 2) the playback buffer
     * becomes full, meaning no forther buffering of media data is possible.
     * When the value of automaticallyWaitsToMinimizeStalling is NO, timeControlStatus cannot become
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate for this reason.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingToMinimizeStallsReason();

    /**
     * [@constant] AVPlayerWaitingWhileEvaluatingBufferingRateReason
     * 
     * Indicates that the player is monitoring the playback buffer fill rate to determine if playback is likely to
     * complete without interruptions.
     * 
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and it has not yet
     * determined if starting playback at the specified rate would likely cause the buffer to become empty. When the
     * brief initial monitoring period is over, either playback will begin or the value of
     * reasonForWaitingToPlayAtSpecifiedRate will switch to AVPlayerWaitingToMinimizeStallsReason.
     * Recommended practice is not to show UI indicating the waiting state to the user while the value of
     * reasonForWaitingToPlayAtSpecifiedRate is AVPlayerWaitingWhileEvaluatingBufferingRateReason.
     * 
     * API-Since: 10.0
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
     * The player is waiting for playback because automaticallyWaitToMinimizeStalling is YES and the value of
     * currentItem is nil. When an item becomes available, either because of a call to
     * -replaceCurrentItemWithPlayerItem: or -insertItem: afterItem:, playback will begin or the value of
     * reasonForWaitingToPlay will change.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingWithNoItemToPlayReason();

    /**
     * the item's current time has changed discontinuously
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemTimeJumpedNotification();

    /**
     * item has played to its end time
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemDidPlayToEndTimeNotification();

    /**
     * item has failed to play to its end time
     * 
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemFailedToPlayToEndTimeNotification();

    /**
     * media did not arrive in time to continue playback
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemPlaybackStalledNotification();

    /**
     * a new access log entry has been added
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemNewAccessLogEntryNotification();

    /**
     * a new error log entry has been added
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemNewErrorLogEntryNotification();

    /**
     * NSError
     * 
     * API-Since: 4.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemFailedToPlayToEndTimeErrorKey();

    /**
     * [@constant] AVPlayerItemLegibleOutputTextStylingResolutionDefault
     * 
     * Specify this level of text styling resolution to receive attributed strings from an AVPlayerItemLegibleOutput
     * that include the same level of styling information that AVFoundation would use itself to render text within an
     * AVPlayerLayer. The text styling will accommodate user-level Media Accessibility settings.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemLegibleOutputTextStylingResolutionDefault();

    /**
     * [@constant] AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly
     * 
     * Specify this level of text styling resolution to receive only the styling present in the source media and the
     * styling provided via AVPlayerItem.textStyleRules.
     * 
     * This level of resolution excludes styling provided by the user-level Media Accessibility settings. You would
     * typically use it if you wish to override the styling specified in source media. If you do this, you are strongly
     * encouraged to allow your custom styling in turn to be overriden by user preferences for text styling that are
     * available as Media Accessibility settings.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemLegibleOutputTextStylingResolutionSourceAndRulesOnly();

    /**
     * decode failed, see NSError in notification payload
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerFailedToDecodeNotification();

    /**
     * NSError
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerFailedToDecodeNotificationErrorKey();

    /**
     * NSString (CMVideoCodecType)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecKey();

    /**
     * @"avc1"
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecH264();

    /**
     * @"jpeg"
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecJPEG();

    /**
     * NSNumber (encoded pixels)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoWidthKey();

    /**
     * NSNumber (encoded pixels)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoHeightKey();

    /**
     * [@constant] AVVideoPixelAspectRatioKey
     * 
     * The aspect ratio of the pixels in the video frame
     * 
     * The value for this key is an NSDictionary containing AVVideoPixelAspectRatio*Key keys. If no value is specified
     * for this key, the default value for the codec is used. Usually this is 1:1, meaning square pixels.
     * 
     * Note that prior to OS X 10.9 and iOS 7.0, this key could only be specified as part of the dictionary given for
     * AVVideoCompressionPropertiesKey. As of OS X 10.9 and iOS 7.0, the top level of an AVVideoSettings dictionary is
     * the preferred place to specify this key.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioHorizontalSpacingKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoPixelAspectRatioVerticalSpacingKey();

    /**
     * [@constant] AVVideoCleanApertureKey
     * 
     * Defines the region within the video dimensions that will be displayed during playback
     * 
     * The value for this key is an NSDictionary containing AVVideoCleanAperture*Key keys. AVVideoCleanApertureWidthKey
     * and AVVideoCleanApertureHeightKey define a clean rectangle which is centered on the video frame. To offset this
     * rectangle from center, use AVVideoCleanApertureHorizontalOffsetKey and AVVideoCleanApertureVerticalOffsetKey. A
     * positive value for AVVideoCleanApertureHorizontalOffsetKey moves the clean aperture region to the right, and a
     * positive value for AVVideoCleanApertureVerticalOffsetKey moves the clean aperture region down.
     * 
     * If no clean aperture region is specified, the entire frame will be displayed during playback.
     * 
     * Note that prior to OS X 10.9 and iOS 7.0, this key could only be specified as part of the dictionary given for
     * AVVideoCompressionPropertiesKey. As of OS X 10.9 and iOS 7.0, the top level of an AVVideoSettings dictionary is
     * the preferred place to specify this key.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureWidthKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureHeightKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureHorizontalOffsetKey();

    /**
     * NSNumber
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCleanApertureVerticalOffsetKey();

    /**
     * NSString
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeKey();

    /**
     * AVVideoScalingModeFit - Crop to remove edge processing region; preserve aspect ratio of cropped source by
     * reducing specified width or height if necessary. Will not scale a small source up to larger dimensions.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeFit();

    /**
     * AVVideoScalingModeResize - Crop to remove edge processing region; scale remainder to destination area. Does not
     * preserve aspect ratio.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResize();

    /**
     * AVVideoScalingModeResizeAspect - Preserve aspect ratio of the source, and fill remaining areas with black to fit
     * destination dimensions.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResizeAspect();

    /**
     * AVVideoScalingModeResizeAspectFill - Preserve aspect ratio of the source, and crop picture to fit destination
     * dimensions.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoScalingModeResizeAspectFill();

    /**
     * NSDictionary, all 3 below keys required
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPropertiesKey();

    /**
     * NSString
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimariesKey();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_ITU_R_709_2();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_SMPTE_C();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_P3_D65();

    /**
     * NSString
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunctionKey();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_ITU_R_709_2();

    /**
     * NSString
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrixKey();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_709_2();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_601_4();

    /**
     * NSNumber(BOOL)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAllowWideColorKey();

    /**
     * NSDictionary
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCompressionPropertiesKey();

    /**
     * NSNumber (bits per second, H.264 only)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAverageBitRateKey();

    /**
     * NSNumber (0.0-1.0, JPEG, HEIC and Apple ProRAW only. With HEIC and Apple ProRAW, 1.0 indicates lossless
     * compression)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoQualityKey();

    /**
     * NSNumber (frames, 1 means key frames only, H.264 only)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoMaxKeyFrameIntervalKey();

    /**
     * NSNumber (seconds, 0.0 means no limit, H.264 only)
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoMaxKeyFrameIntervalDurationKey();

    /**
     * NSNumber (BOOL)
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAllowFrameReorderingKey();

    /**
     * NSString, profile/level constants are specific to a particular encoder. See
     * VideoToolbox/VTCompressionProperties.h for additional profiles/levels that can used as the value of this key.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelKey();

    /**
     * Baseline Profile Level 3.0
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline30();

    /**
     * Baseline Profile Level 3.1
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline31();

    /**
     * Baseline Profile Level 4.1
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Baseline41();

    /**
     * Baseline Profile Auto Level
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264BaselineAutoLevel();

    /**
     * Main Profile Level 3.0
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main30();

    /**
     * Main Profile Level 3.1
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main31();

    /**
     * Main Profile Level 3.2
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main32();

    /**
     * Main Profile Level 4.1
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264Main41();

    /**
     * Main Profile Auto Level
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264MainAutoLevel();

    /**
     * High Profile Level 4.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264High40();

    /**
     * High Profile Level 4.1
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264High41();

    /**
     * High Profile Auto Level
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoProfileLevelH264HighAutoLevel();

    /**
     * NSString, H.264 only, one of:
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeKey();

    /**
     * Context-based Adaptive Variable Length Coding
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeCAVLC();

    /**
     * Context-based Adaptive Binary Arithmetic Coding
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoH264EntropyModeCABAC();

    /**
     * NSNumber (frames per second)
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoExpectedSourceFrameRateKey();

    /**
     * NSNumber (frames per second)
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAverageNonDroppableFrameRateKey();

    /**
     * [@constant] AVContentKeySystemFairPlayStreaming
     * 
     * Used to specify FairPlay Streaming (FPS) as the method of key delivery.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemFairPlayStreaming();

    /**
     * [@constant] AVContentKeySystemClearKey
     * 
     * Used to specify clear key as the method of key delivery.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemClearKey();

    /**
     * [@constant] AVContentKeyRequestRetryReasonTimedOut
     * 
     * Indicates that the content key request should be retried because the key response was not set soon enough either
     * due the initial request/response was taking too long, or a lease was expiring in the meantime.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonTimedOut();

    /**
     * [@constant] AVContentKeyRequestRetryReasonReceivedResponseWithExpiredLease
     * 
     * Indicates that the content key request should be retried because a key response with expired lease was set on the
     * previous content key request.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonReceivedResponseWithExpiredLease();

    /**
     * [@constant] AVContentKeyRequestRetryReasonReceivedObsoleteContentKey
     * 
     * Indicates that the content key request should be retried because an obsolete key response was set on the previous
     * content key request.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestRetryReasonReceivedObsoleteContentKey();

    /**
     * [@constant] AVContentKeyRequestProtocolVersionsKey
     * 
     * Specifies the versions of the content protection protocol supported by the application as an NSArray of one or
     * more NSNumber objects.
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeyRequestProtocolVersionsKey();

    /**
     * API-Since: 11.0
     */
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
     * 
     * API-Since: 11.0
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
     * 
     * API-Since: 11.0
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
     * 
     * API-Since: 11.0
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
     * 
     * API-Since: 11.0
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
     * 
     * API-Since: 11.0
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
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeTIFF();

    /**
     * Keys for metadata provided by AudioToolbox's AudioFile interface. See <AudioToolbox/AudioFile.h>
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataKeySpaceAudioFile();

    /**
     * Metadata format for AVMetadataItems of unknown provenance. This can occur when metadata is provided generically
     * by an intermediate interface, such as AudioToolbox's AudioFile interface.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataFormatUnknown();

    /**
     * These export options can be used to produce movie files with video size appropriate to the device.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * HEVC and the audio will be compressed using AAC.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVCHighestQuality();

    /**
     * These export options can be used to produce movie files with the specified video size.
     * The export will not scale the video up from a smaller size. The video will be compressed using
     * HEVC and the audio will be compressed using AAC. Some devices cannot support some sizes.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC1920x1080();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC3840x2160();

    /**
     * [@constant] AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData
     * Indicates that the media data should be interleaved with all other media data with this constant.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData();

    /**
     * [@constant] AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved
     * Indicates that the media data should be laid out before all the media data with
     * AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData and not be interleaved.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved();

    /**
     * [@enum] AVAssetDownloadedAssetEvictionPriority
     * 
     * These constants represents the eviction priority of downloaded assets.
     * 
     * [@constant] AVAssetDownloadedAssetEvictionPriorityImportant
     * Used to mark assets with the highest priority. They will be the last to be purged.
     * [@constant] AVAssetDownloadedAssetEvictionPriorityDefault
     * Used to mark assets have the default priority. They will be the first to be purged.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadedAssetEvictionPriorityImportant();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadedAssetEvictionPriorityDefault();

    /**
     * @"hvc1"
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeHEVC();

    /**
     * @"avc1"
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeH264();

    /**
     * @"jpeg"
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeJPEG();

    /**
     * @"ap4h"
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes4444();

    /**
     * @"apcn"
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422();

    /**
     * @"hvc1"
     * 
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecHEVC();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoColorPrimaries_ITU_R_2020();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_SMPTE_ST_2084_PQ();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_ITU_R_2100_HLG();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoYCbCrMatrix_ITU_R_2020();

    /**
     * [@constant] AVVideoApertureModeCleanAperture
     * 
     * Both pixel aspect ratio and clean aperture will be applied.
     * 
     * An image's clean aperture is a region of video free from transition artifacts caused by the encoding of the
     * signal.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeCleanAperture();

    /**
     * [@constant] AVVideoApertureModeProductionAperture
     * 
     * Only pixel aspect ratio will be applied.
     * 
     * The image is not cropped to the clean aperture region, but it is scaled according to the pixel aspect ratio. Use
     * this option when you want to see all the pixels in your video, including the edges.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeProductionAperture();

    /**
     * [@constant] AVVideoApertureModeEncodedPixels
     * 
     * Neither pixel aspect ratio nor clean aperture will be applied.
     * 
     * The image is not cropped to the clean aperture region and is not scaled according to the pixel aspect ratio. The
     * encoded dimensions of the image description are displayed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoApertureModeEncodedPixels();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC1920x1080();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC3840x2160();

    /**
     * [@constant] AVRouteDetectorMultipleRoutesDetectedDidChangeNotification
     * 
     * Posted when the value of multipleRoutesDetected changes.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVRouteDetectorMultipleRoutesDetectedDidChangeNotification();

    /**
     * [@constant] AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification
     * 
     * A notification that fires whenever the receiver's enqueued media data has been flushed for a reason other than a
     * call to the -flush method.
     * 
     * The renderer may flush enqueued media data when the user routes playback to a new destination. The renderer may
     * also flush enqueued media data when the playback rate of the attached AVSampleBufferRenderSynchronizer is changed
     * (e.g. 1.0 -> 2.0 or 1.0 -> 0.0 -> 2.0), however no flush will occur for normal pauses (non-zero -> 0.0) and
     * resumes (0.0 -> same non-zero rate as before).
     * 
     * When an automatic flush occurs, the attached render synchronizer's timebase will remain running at its current
     * rate. It is typically best to respond to this notification by enqueueing media data with timestamps starting at
     * the timebase's current time. To the listener, this will sound similar to muting the audio for a short period of
     * time. If it is more desirable to ensure that all audio is played than to keep the timeline moving, you may also
     * stop the synchronizer, set the synchronizer's current time to the value of
     * AVSampleBufferAudioRendererFlushTimeKey, start reenqueueing sample buffers with timestamps starting at that time,
     * and restart the synchronizer. To the listener, this will sound similar to pausing the audio for a short period of
     * time.
     * 
     * This notification is delivered on an arbitrary thread. If sample buffers are being enqueued with the renderer
     * concurrently with the receipt of this notification, it is possible that one or more sample buffers will remain
     * enqueued in the renderer. This is generally undesirable, because the sample buffers that remain will likely have
     * timestamps far ahead of the timebase's current time and so won't be rendered for some time. The best practice is
     * to invoke the -flush method, in a manner that is serialized with enqueueing sample buffers, after receiving this
     * notification and before resuming the enqueueing of sample buffers.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification();

    /**
     * [@constant] AVSampleBufferAudioRendererFlushTimeKey
     * 
     * The presentation timestamp of the first enqueued sample that was flushed.
     * 
     * The value of this key is an NSValue wrapping a CMTime.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferAudioRendererFlushTimeKey();

    /**
     * [@constant] AVContentKeySystemAuthorizationToken
     * 
     * Used to specify a token that could be used to authorize playback of associated content key recipients.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySystemAuthorizationToken();

    /**
     * [@constant] AVContentKeySessionServerPlaybackContextOptionProtocolVersions
     * 
     * Specifies the versions of the content protection protocol supported by the application as an NSArray of one or
     * more NSNumber objects. If not specified default protocol version of 1 is assumed.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySessionServerPlaybackContextOptionProtocolVersions();

    /**
     * [@constant] AVContentKeySessionServerPlaybackContextOptionServerChallenge
     * 
     * Specifies a nonce as a 8-byte NSData object to be included in the secure server playback context (SPC) in order
     * to prevent replay attacks. If not specified default server challenge of 0 is assumed.
     * 
     * API-Since: 12.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVContentKeySessionServerPlaybackContextOptionServerChallenge();

    /**
     * [@constant] AVContentKeyRequestRequiresValidationDataInSecureTokenKey
     * 
     * Request secure token to have extended validation data. The value for the key should be previously created offline
     * key using -[AVContentKeyRequest persistableContentKeyFromKeyVendorResponse:options:error:].
     * 
     * API-Since: 13.0
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
     * To determine whether alpha is straight or pre-multiplied, look for the format description extension with key
     * kCMFormatDescriptionExtension_AlphaChannelMode.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicContainsAlphaChannel();

    /**
     * [@constant] AVMediaCharacteristicIsOriginalContent
     * 
     * A media characteristic that indicates that a track or media selection option includes content that's marked by
     * the content author as original to the principal production of the media, as opposed to supplementary or
     * derivative content created by means of language translation or by other means.
     * 
     * The value of this characteristic is @"public.original-content".
     * Example: an option that presents audio media with dialog in the principal language of the production may be
     * tagged with this characteristic; audio media containing dialog dubbed in a language other than the principal
     * language of the production typically would not be tagged with this characteristic.
     * Note for content authors: for QuickTime movie and .m4v files and for HTTP Live Streaming, a media option is
     * considered to have the characteristic AVMediaCharacteristicIsOriginalContent only if it's explicitly tagged with
     * the characteristic.
     * See the discussion of the tagging of tracks with media characteristics below.
     * 
     * Also see -[AVAssetTrack hasMediaCharacteristic:] and -[AVMediaSelectionOption hasMediaCharacteristic:].
     * 
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMediaCharacteristicIsOriginalContent();

    /**
     * [@constant] AVURLAssetAllowsExpensiveNetworkAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the expensive interface (e.g.
     * cellular, tethered, constrained).
     * 
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsExpensiveNetworkAccessKey();

    /**
     * [@constant] AVURLAssetAllowsConstrainedNetworkAccessKey
     * 
     * Indicates whether network requests on behalf of this asset are allowed to use the constrained interface (e.g.
     * interfaces marked as being in data saver mode).
     * 
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetAllowsConstrainedNetworkAccessKey();

    /**
     * [@constant] AVAssetContainsFragmentsDidChangeNotification
     * 
     * Posted after the value of @"containsFragments" has already been loaded and the AVFragmentedAsset is added to an
     * AVFragmentedAssetMinder, either when 1) fragments are detected in the asset on disk after it had previously
     * contained none or when 2) no fragments are detected in the asset on disk after it had previously contained one or
     * more.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetContainsFragmentsDidChangeNotification();

    /**
     * [@constant] AVAssetWasDefragmentedNotification
     * 
     * Posted when the asset on disk is defragmented while an AVFragmentedAsset is being minded by an
     * AVFragmentedAssetMinder, but only if the defragmentation occurs after the status of the value
     * of @"canContainFragments" has reached AVKeyValueStatusLoaded.
     * 
     * After this notification is posted, the value of the asset properties canContainFragments and containsFragments
     * will both be NO.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetWasDefragmentedNotification();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVCHighestQualityWithAlpha();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC1920x1080WithAlpha();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetHEVC3840x2160WithAlpha();

    /**
     * [@constant] AVAssetDownloadTaskMediaSelectionPrefersMultichannelKey
     * 
     * Download the specified media selections with or without support for multichannel playback.
     * The value for this key should be an NSNumber representing a BOOL.
     * 
     * By default AVAssetDownloadTask will prefer multichannel by downloading the most capable multichannel rendition
     * available in additon to stereo.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMediaSelectionPrefersMultichannelKey();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInUltraWideCamera
     * A built-in camera device with a shorter focal length than a wide angle camera. Note that devices of this type may
     * only be discovered using an AVCaptureDeviceDiscoverySession.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInUltraWideCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInDualWideCamera
     * A device that consists of two fixed focal length cameras, one ultra wide and one wide angle. Note that devices of
     * this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice
     * defaultDeviceWithDeviceType:mediaType:position:].
     * 
     * A device of this device type supports the following features:
     * - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     * - Depth data delivery by measuring the disparity of matched features between the ultra wide and wide cameras.
     * - Delivery of photos from constituent devices (ultra wide and wide) via a single photo capture request.
     * 
     * A device of this device type does not support the following features:
     * - AVCaptureExposureModeCustom and manual exposure bracketing.
     * - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     * - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     * Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the
     * device switches from one camera to the other. The overall exposure, white balance, and focus position however
     * should be consistent.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInDualWideCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTripleCamera
     * A device that consists of three fixed focal length cameras, one ultra wide, one wide angle, and one telephoto.
     * Note that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or
     * -[AVCaptureDevice defaultDeviceWithDeviceType:mediaType:position:].
     * 
     * A device of this device type supports the following features:
     * - Auto switching from one camera to the other when zoom factor, light level, and focus position allow this.
     * - Delivery of photos from constituent devices (ultra wide, wide and telephoto cameras) via a single photo capture
     * request.
     * 
     * A device of this device type does not support the following features:
     * - AVCaptureExposureModeCustom and manual exposure bracketing.
     * - Locking focus with a lens position other than AVCaptureLensPositionCurrent.
     * - Locking auto white balance with device white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     * Even when locked, exposure duration, ISO, aperture, white balance gains, or lens position may change when the
     * device switches from one camera to the other. The overall exposure, white balance, and focus position however
     * should be consistent.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTripleCamera();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInTrueDepthCamera
     * A device that consists of two cameras, one YUV and one Infrared. The infrared camera provides high quality depth
     * information that is synchronized and perspective corrected to frames produced by the YUV camera. While the
     * resolution of the depth data and YUV frames may differ, their field of view and aspect ratio always match. Note
     * that devices of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice
     * defaultDeviceWithDeviceType:mediaType:position:].
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInTrueDepthCamera();

    /**
     * [@constant] AVCaptureSessionInterruptionSystemPressureStateKey
     * 
     * The key used to provide an AVCaptureSystemPressureState indicating the system pressure level and contributing
     * factors that caused the interruption.
     * 
     * This key is only present when the AVCaptureSessionInterruptionReasonKey equals
     * AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableDueToSystemPressure.
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSessionInterruptionSystemPressureStateKey();

    /**
     * @"apch"
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422HQ();

    /**
     * @"apcs"
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422LT();

    /**
     * @"apco"
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeAppleProRes422Proxy();

    /**
     * @"muxa"
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoCodecTypeHEVCWithAlpha();

    /**
     * [@constant] AVMetadataObjectTypeHumanBody
     * 
     * An identifier for an instance of AVMetadataHumanBodyObject.
     * 
     * AVMetadataHumanBodyObject objects return this constant as their type.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeHumanBody();

    /**
     * [@constant] AVMetadataObjectTypeCatBody
     * 
     * An identifier for an instance of AVMetadataCatBodyObject.
     * 
     * AVMetadataCatBodyObject objects return this constant as their type.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCatBody();

    /**
     * [@constant] AVMetadataObjectTypeDogBody
     * 
     * An identifier for an instance of AVMetadataDogBodyObject.
     * 
     * AVMetadataDogBodyObject objects return this constant as their type.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeDogBody();

    /**
     * [@constant] AVMetadataObjectTypeSalientObject
     * 
     * An identifier for an instance of AVMetadataSalientObject.
     * 
     * AVMetadataSalientObject objects return this constant as their type.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeSalientObject();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeSkin
     * A matting image segmenting all skin from all persons in the visible field-of-view of an image.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeSkin();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeHair
     * A matting image segmenting all hair from all persons in the visible field-of-view of an image.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeHair();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeTeeth
     * A matting image segmenting all teeth from all persons in the visible field-of-view of an image.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeTeeth();

    /**
     * [@constant] AVCaptureSystemPressureLevelNominal
     * System pressure level is normal (not pressured).
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelNominal();

    /**
     * [@constant] AVCaptureSystemPressureLevelFair
     * System pressure is slightly elevated.
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelFair();

    /**
     * [@constant] AVCaptureSystemPressureLevelSerious
     * System pressure is highly elevated. Capture performance may be impacted. Frame rate throttling is advised.
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelSerious();

    /**
     * [@constant] AVCaptureSystemPressureLevelCritical
     * System pressure is critically elevated. Capture quality and performance are significantly impacted. Frame rate
     * throttling is highly advised.
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelCritical();

    /**
     * [@constant] AVCaptureSystemPressureLevelShutdown
     * System pressure is beyond critical. Capture must immediately stop.
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureSystemPressureLevelShutdown();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedHumanBody();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedCatBody();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedDogBody();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataDetectedSalientObject();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto
     * 
     * A value of type kCMMetadataBaseDataType_UInt8 indicating whether this Live Photo movie was captured in "Auto"
     * mode.
     * 
     * Clients capturing LivePhoto content may add this movie-level metadata to signify that the movie content should
     * only be used (when swiping between photos, or force-touching a photo) if it's sufficiently dynamic. For instance,
     * photos of static scenes or documents are to be excluded from the Live Photo experience.
     * 
     * API-Since: 13.0
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
     * Live Photo movies may be algorithmically scored from 0. to 1. on their level of vitality. A Live Photo movie with
     * a low vitality score offers little dynamism to the still photo it accompanies. The vitality score is normalized
     * and independent of the vitality scoring version of the algorithm (see
     * AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScoringVersion). If a Live Photo movie contains the
     * AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto key and its value is non-zero, apps should read the
     * AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScore value and only display the movie's content if the
     * score is 0.5 or higher.
     * If the capture session includes a metadata output configured to provide face, dog, or cat metadata objects, their
     * presence will greatly increase the vitality score.
     * 
     * API-Since: 13.0
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
     * The version of the algorithm that scored the Live Photo movie for vitality.
     * 
     * API-Since: 13.0
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
     * The video may be scored by a heuristic which considers factors such as exposure and focus. The value ranges from
     * 0-1, where a score below 0.5 indicates the asset has serious flaws.
     * 
     * API-Since: 13.0
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
     * The version of the algorithm that provided the spatial over capture quality score.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScoringVersion();

    /**
     * [@constant] AVFragmentedMovieTrackTimeRangeDidChangeNotification
     * 
     * Posted when the timeRange of an AVFragmentedMovieTrack changes while the associated instance of AVFragmentedMovie
     * is being minded by an AVFragmentedMovieMinder, but only for changes that occur after the status of the value
     * of @"timeRange" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieTrackTimeRangeDidChangeNotification();

    /**
     * [@constant] AVFragmentedMovieTrackSegmentsDidChangeNotification
     * 
     * Posted when the array of segments of an AVFragmentedMovieTrack changes while the associated instance of
     * AVFragmentedMovie is being minded by an AVFragmentedMovieMinder, but only for changes that occur after the status
     * of the value of @"segments" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieTrackSegmentsDidChangeNotification();

    /**
     * [@constant] AVMovieReferenceRestrictionsKey
     * 
     * Indicates the restrictions used by the movie when resolving references to external media data. The value of this
     * key is an NSNumber wrapping an AVAssetReferenceRestrictions enum value or the logical combination of multiple
     * such values. See AVAsset.h for the declaration of the AVAssetReferenceRestrictions enum.
     * 
     * Some movies can contain references to media data stored outside the movie's container, for example in another
     * file. This key can be used to specify a policy to use when these references are encountered. If a movie contains
     * one or more references of a type that is forbidden by the reference restrictions, loading of movie properties
     * will fail. In addition, such a movie cannot be used with other AVFoundation modules, such as AVPlayerItem or
     * AVAssetExportSession.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMovieReferenceRestrictionsKey();

    /**
     * [@constant] AVFragmentedMovieContainsMovieFragmentsDidChangeNotification
     * 
     * Posted after the value of @"containsMovieFragments" has already been loaded and the AVFragmentedMovie is added to
     * an AVFragmentedMovieMinder, either when 1) movie fragments are detected in the movie file on disk after it had
     * previously contained none or when 2) no movie fragments are detected in the movie file on disk after it had
     * previously contained one or more.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieContainsMovieFragmentsDidChangeNotification();

    /**
     * [@constant] AVFragmentedMovieDurationDidChangeNotification
     * 
     * Posted when the duration of an AVFragmentedMovie changes while it's being minded by an AVFragmentedMovieMinder,
     * but only for changes that occur after the status of the value of @"duration" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieDurationDidChangeNotification();

    /**
     * [@constant] AVFragmentedMovieWasDefragmentedNotification
     * 
     * Posted when the movie file on disk is defragmented while an AVFragmentedMovie is being minded by an
     * AVFragmentedMovieMinder, but only if the defragmentation occurs after the status of the value
     * of @"canContainMovieFragments" has reached AVKeyValueStatusLoaded.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFragmentedMovieWasDefragmentedNotification();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC1920x1080WithAlpha();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVOutputSettingsPresetHEVC3840x2160WithAlpha();

    /**
     * [@constant] AVPlayerAvailableHDRModesDidChangeNotification
     * 
     * A notification that fires whenever availableHDRModes changes.
     * 
     * This notification fires when a value is added or removed from the list of availableHDRModes. This can be caused
     * by display connection/disconnection or resource changes.
     * 
     * API-Since: 11.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerAvailableHDRModesDidChangeNotification();

    /**
     * the value of recommendedTimeOffsetFromLive has changed
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemRecommendedTimeOffsetFromLiveDidChangeNotification();

    /**
     * a media selection group changed its selected option
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemMediaSelectionDidChangeNotification();

    /**
     * [@constant] AVSampleBufferRenderSynchronizerRateDidChangeNotification
     * 
     * A notification that fires whenever the value of the "rate" property changes.
     * 
     * The rate can change as a result of setting the rate property, either by directly setting the property or calling
     * -setRate:time:. The rate can also change at any time, without any action by the client of the render
     * synchronizer. For example, on iOS if the app's playback is interrupted (e.g. by a phone call or another
     * non-mixable app starting playback), the rate will automatically be set to zero. This notification will be sent in
     * all of those cases.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferRenderSynchronizerRateDidChangeNotification();

    /**
     * [@constant] eligibleForHDRPlaybackDidChangeNotification
     * 
     * A notification that fires whenever eligibleForHDRPlayback changes.
     * 
     * This notification fires when eligibleForHDRPlayback changes. This can be caused by display
     * connection/disconnection or resource changes.
     * 
     * API-Since: 13.4
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
     * Note for content authors: the presence of this characteristic is strictly inferred from the format description of
     * the associated track.
     * 
     * API-Since: 14.0
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
     * 
     * API-Since: 14.0
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
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVFileTypeProfileMPEG4CMAFCompliant();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonKeyAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeUserDataKeyAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataISOUserDataKeyAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyAccessibilityDescription();

    /**
     * [@constant] AVAssetDownloadTaskMinimumRequiredPresentationSizeKey
     * 
     * The lowest media presentation size greater than or equal to this value will be selected. If no suitable media
     * presentation size is found, the highest media presentation size will be selected.
     * The value for this key should be a NSValue of CGSize.
     * 
     * By default, the highest media presentation size will be selected for download.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskMinimumRequiredPresentationSizeKey();

    /**
     * [@constant] AVAssetDownloadTaskPrefersHDRKey
     * 
     * Download the specified media selections with or without HDR content.
     * The value for this key should be an NSNumber representing a BOOL.
     * 
     * By default AVAssetDownloadTask will prefer HDR content.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskPrefersHDRKey();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataCommonIdentifierAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeUserDataAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierISOUserDataAccessibilityDescription();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataAccessibilityDescription();

    /**
     * [@constant] AVMetadataIdentifierQuickTimeMetadataLocationHorizontalAccuracyInMeters
     * 
     * A value of type kCMMetadataBaseDataType_Float32.
     * 
     * The horizontal accuracy of the provided location data (usually specified by
     * AVMetadataIdentifierQuickTimeMetadataLocationISO6709).
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataLocationHorizontalAccuracyInMeters();

    /**
     * see requiresFlushToResumeDecoding property
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerRequiresFlushToResumeDecodingDidChangeNotification();

    /**
     * [@constant] AVSemanticSegmentationMatteTypeGlasses
     * A matting image segmenting all glasses ( e.g. eyeglasses, sunglasses ) from all persons wearing glasses in the
     * visible field-of-view of an image.
     * 
     * API-Since: 14.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSemanticSegmentationMatteTypeGlasses();

    /**
     * [@function] AVSampleBufferAttachContentKey
     * 
     * Attaches an AVContentKey to a CMSampleBuffer for the purpose of content decryption.
     * 
     * The client is expected to attach AVContentKeys to CMSampleBuffers that have been created by the client for
     * enqueueing with AVSampleBufferDisplayLayer or AVSampleBufferAudioRenderer, for which the AVContentKeySpecifier
     * matches indications of suitability that are available to the client according to the content key system that's in
     * use.
     * 
     * API-Since: 14.5
     * 
     * @param sbuf
     *                   The sample buffer to which the content key is to be attached.
     * @param contentKey
     *                   The content key to be attached.
     * @param outError
     *                   If the result is NO and errorOut is non-NULL, the location referenced by errorOut receives an
     *                   instance of NSError that describes the reason for failure to attach the content key.
     */
    @Generated
    @CFunction
    public static native boolean AVSampleBufferAttachContentKey(CMSampleBufferRef sbuf, AVContentKey contentKey,
            Ptr<NSError> outError);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoRangeSDR();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoRangeHLG();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoRangePQ();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataQuickTimeMetadataKeyIsMontage();

    /**
     * NSNumber (8-16)
     * 
     * API-Since: 14.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoAppleProRAWBitDepthKey();

    /**
     * [@constant] AVURLAssetURLRequestAttributionKey
     * 
     * Specifies the attribution of the URLs requested by this asset.
     * 
     * Value is an NSNumber whose value is an NSURLRequestAttribution (see NSURLRequest.h).
     * Default value is NSURLRequestAttributionDeveloper.
     * All NSURLRequests issed on behalf of this AVURLAsset will be attributed with this value and follow the App
     * Privacy Policy accordingly.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetURLRequestAttributionKey();

    /**
     * This export option will produce a QuickTime movie with Apple ProRes 422 video and LPCM audio.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetAppleProRes422LPCM();

    /**
     * This export option will produce a QuickTime movie with Apple ProRes 4444 video and LPCM audio.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetExportPresetAppleProRes4444LPCM();

    /**
     * [@constant] AVAssetDownloadTaskPrefersLosslessAudioKey
     * 
     * Download the specified media selections in lossless audio representation.
     * The value for this key should be an NSNumber representing a BOOL.
     * 
     * By default AVAssetDownloadTask will prefer lossy audio representation.
     * 
     * API-Since: 14.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetDownloadTaskPrefersLosslessAudioKey();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataIdentifierQuickTimeMetadataIsMontage();

    /**
     * [@constant] AVMovieShouldSupportAliasDataReferencesKey
     * 
     * Indicates whether alias data references in the movie should be parsed and resolved.
     * 
     * Default is NO. Although the majority of QuickTime movie files contain all of the media data they require, some
     * contain references to media stored in other files. While AVFoundation and CoreMedia typically employ a URL
     * reference for this purpose, older implementations such as QuickTime 7 have commonly employed a Macintosh alias
     * instead, as documented in the QuickTime File Format specification. If your application must work with legacy
     * QuickTime movie files containing alias-based references to media data stored in other files, the use of this
     * AVMovie initialization option is appropriate. AVMovie and AVMutableMovie do not create movies using alias data
     * references to external media files.
     * 
     * If you provide a value for AVMovieReferenceRestrictionsKey, restrictions will be observed for resolved alias
     * references just as they are for URL references.
     * 
     * For more details about alias resolution, consult documentation of the bookmark-related interfaces of NSURL.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMovieShouldSupportAliasDataReferencesKey();

    /**
     * [@constant] AVPlayerRateDidChangeNotification
     * 
     * Indicates a player rate change.
     * 
     * Posted by the player when its rate changes. Similar to KVO of AVPlayer.rate, but providing additional information
     * about the rate change in the userInfo. See keys below.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeNotification();

    /**
     * [@constant] AVPlayerRateDidChangeReasonKey
     * 
     * Indicates a reason for the rate change notification.
     * 
     * The value corresponding to this key is of type AVPlayerRateDidChangeReason.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeReasonKey();

    /**
     * [@constant] AVPlayerRateDidChangeOriginatingParticipantKey
     * 
     * Indicates a rate change was caused by another participant connected through AVPlayerPlaybackCoordinator.
     * 
     * Informs the receiver of an AVPlayerRateDidChangeNotification about a rate change originated from another
     * AVCoordinatedPlaybackParticipant connected through AVPlayerPlaybackCoordinator. This can be used to inform UI
     * showing why the playback rate changed. The type of the value for this key is an AVCoordinatedPlaybackParticipant,
     * which is part of the AVPlayerPlaybackCoordinator.otherParticipants array.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeOriginatingParticipantKey();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeReasonSetRateCalled();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeReasonSetRateFailed();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeReasonAudioSessionInterrupted();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerRateDidChangeReasonAppBackgrounded();

    /**
     * [@constant] AVPlayerWaitingForCoordinatedPlaybackReason
     * 
     * Indicates that the player is waiting for another participant connected through its AVPlayerPlaybackCoordinator.
     * 
     * The player is waiting for playback because its connected AVPlayerPlaybackCoordinator requires information from
     * one of the other participants before playback can start.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingForCoordinatedPlaybackReason();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonAudioSessionInterrupted
     * 
     * The participant's audio session was interrupted.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonAudioSessionInterrupted();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonStallRecovery
     * 
     * The player is buffering data after a stall.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonStallRecovery();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonPlayingInterstitial
     * 
     * The participant is presented with interstitial content instead of the main player.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonPlayingInterstitial();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonCoordinatedPlaybackNotPossible
     * 
     * The participant cannot participate in coordinated playback.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonCoordinatedPlaybackNotPossible();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonUserActionRequired
     * 
     * The participant's playback object is in a state that requires manual intervention by the user to resume playback.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonUserActionRequired();

    /**
     * [@constant] AVCoordinatedPlaybackSuspensionReasonUserIsChangingCurrentTime
     * 
     * The participant is actively changing current time.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCoordinatedPlaybackSuspensionReasonUserIsChangingCurrentTime();

    /**
     * [@constant] AVPlaybackCoordinatorOtherParticipantsDidChangeNotification
     * 
     * Posted by the playback coordinator when its otherParticipants property changes.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlaybackCoordinatorOtherParticipantsDidChangeNotification();

    /**
     * [@constant] AVPlaybackCoordinatorSuspensionReasonsDidChangeNotification
     * 
     * Posted by the playback coordinator when its suspensionReasons property changes.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlaybackCoordinatorSuspensionReasonsDidChangeNotification();

    /**
     * [@constant] AVPlayerItemTimeJumpedOriginatingParticipantKey
     * 
     * Indicates a time jump was caused by another participant connected through AVPlayerPlaybackCoordinator.
     * 
     * Informs the receiver of an AVPlayerItemTimeJumpedNotification that a time jump originated from another
     * AVCoordinatedPlaybackParticipant connected through AVPlayerPlaybackCoordinator. This can be used to inform UI
     * showing why the current time changed. The type of the value for this key is an AVCoordinatedPlaybackParticipant,
     * which is part of the AVPlayerPlaybackCoordinator.otherParticipants array.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerItemTimeJumpedOriginatingParticipantKey();

    /**
     * [@constant] AVPlayerInterstitialEventMonitorEventsDidChangeNotification
     * 
     * A notification that's posted whenever the value of events of an AVPlayerInterstitialEventMonitor is changed.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerInterstitialEventMonitorEventsDidChangeNotification();

    /**
     * [@constant] AVPlayerInterstitialEventMonitorCurrentEventDidChangeNotification
     * 
     * A notification that's posted whenever the currentEvent of an AVPlayerInterstitialEventMonitor changes.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerInterstitialEventMonitorCurrentEventDidChangeNotification();

    /**
     * [@constant] AVPlayerWaitingDuringInterstitialEventReason
     * 
     * Indicates that the player is waiting for the completion of an interstitial event.
     * 
     * The player is waiting for playback because an interstitial event is currently in progress. Interstitial events
     * can be monitored via use of an AVPlayerInterstitialEventMonitor.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerWaitingDuringInterstitialEventReason();

    /**
     * [@constant] AVSampleBufferAudioRendererOutputConfigurationDidChangeNotification
     * 
     * A notification that indicates the hardware configuration does not match the enqueued data format.
     * 
     * The output configuration of the playback hardware might change during the playback session if other clients play
     * content with different format. In such cases, if the media content format does not match the hardware
     * configuration it would produce suboptimal rendering of the enqueued media data. When the framework detects such
     * mismatch it will issue this notification, so the client can flush the renderer and re-enqueue the sample buffers
     * from the current media playhead, which will configure the hardware based on the format of newly enqueued sample
     * buffers.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferAudioRendererOutputConfigurationDidChangeNotification();

    /**
     * see outputObscuredDueToInsufficientExternalProtection property
     * 
     * API-Since: 14.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVSampleBufferDisplayLayerOutputObscuredDueToInsufficientExternalProtectionDidChangeNotification();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVVideoTransferFunction_Linear();

    /**
     * [@constant] AVURLAssetHTTPUserAgentKey
     * 
     * Specifies the value of the User-Agent header to add to HTTP requests made by this asset.
     * 
     * Value is an NSString
     * Default value is the systems's default User-Agent.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetHTTPUserAgentKey();

    /**
     * [@constant] AVURLAssetPrimarySessionIdentifierKey
     * 
     * Specifies a UUID to append as the value of the query parameter "_HLS_primary_id" to selected HTTP requests issued
     * on behalf of the asset. Supported for HLS assets only.
     * 
     * Value is an NSUUID. Its UUID string value will be used as the query parameter.
     * If you create AVURLAssets for the templateItems of AVPlayerInterstitialEvents and you want the instances of
     * AVURLAsset that you create to be used during interstitial playback rather than equivalent AVURLAssets with the
     * same URL, you must provide a value for this key that's equal to the httpSessionIdentifier of the primary
     * AVPlayerItem's asset. See AVPlayerInterstitialEventController.h. This is especially useful if you require the use
     * of a custom AVAssetResourceLoader delegate for interstitial assets.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVURLAssetPrimarySessionIdentifierKey();

    /**
     * [@constant] AVAssetPlaybackConfigurationOptionStereoVideo
     * 
     * Indicates whether or not the asset can render stereo video.
     * 
     * Clients may use this property to determine whether to configure stereo video rendering.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetPlaybackConfigurationOptionStereoVideo();

    /**
     * [@constant] AVAssetPlaybackConfigurationOptionStereoMultiviewVideo
     * 
     * Indicates whether or not the asset can render stereo video and is also in a multiview compression format.
     * 
     * Clients may use this property to determine whether to configure stereo video rendering.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVAssetPlaybackConfigurationOptionStereoMultiviewVideo();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerInterstitialEventNoCue();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerInterstitialEventJoinCue();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVPlayerInterstitialEventLeaveCue();

    /**
     * [@constant] AVCaptureDeviceTypeBuiltInLiDARDepthCamera
     * A device that consists of two cameras, one YUV and one LiDAR. The LiDAR camera provides high quality, high
     * accuracy depth information by measuring the round trip of an artificial light signal emitted by a laser. The
     * depth is synchronized and perspective corrected to frames produced by the paired YUV camera. While the resolution
     * of the depth data and YUV frames may differ, their field of view and aspect ratio always match. Note that devices
     * of this type may only be discovered using an AVCaptureDeviceDiscoverySession or -[AVCaptureDevice
     * defaultDeviceWithDeviceType:mediaType:position:].
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVCaptureDeviceTypeBuiltInLiDARDepthCamera();

    /**
     * [@constant] AVMetadataObjectTypeCodabarCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeCodabarCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from Codabar codes return this constant as their type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeCodabarCode();

    /**
     * [@constant] AVMetadataObjectTypeGS1DataBarCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeGS1DataBarCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from GS1DataBar codes return this constant as their type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeGS1DataBarCode();

    /**
     * [@constant] AVMetadataObjectTypeGS1DataBarExpandedCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeGS1DataBarExpandedCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from GS1DataBarExpanded codes return this constant as their
     * type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeGS1DataBarExpandedCode();

    /**
     * [@constant] AVMetadataObjectTypeGS1DataBarLimitedCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeGS1DataBarLimitedCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from GS1DataBarLimited codes return this constant as their
     * type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeGS1DataBarLimitedCode();

    /**
     * [@constant] AVMetadataObjectTypeMicroQRCode
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeMicroQRCode.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from MicroQR codes return this constant as their type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeMicroQRCode();

    /**
     * [@constant] AVMetadataObjectTypeMicroPDF417Code
     * 
     * An identifier for an instance of AVMetadataMachineReadableCodeObject having a type
     * AVMetadataObjectTypeMicroPDF417Code.
     * 
     * AVMetadataMachineReadableCodeObject objects generated from MicroPDF417 codes return this constant as their type.
     * 
     * API-Since: 15.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AVMetadataObjectTypeMicroPDF417Code();
}

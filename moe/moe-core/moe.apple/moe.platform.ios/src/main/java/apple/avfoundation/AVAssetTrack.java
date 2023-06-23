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
import apple.avfoundation.protocol.AVAsynchronousKeyValueLoading;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetTrack extends NSObject implements NSCopying, AVAsynchronousKeyValueLoading {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetTrack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetTrack allocWithZone(VoidPtr zone);

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
    public static native AVAssetTrack new_objc();

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
     * provides a reference to the AVAsset of which the AVAssetTrack is a part
     */
    @Nullable
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * associatedTracksOfType:
     * 
     * Provides an NSArray of AVAssetTracks, one for each track associated with the receiver with the specified type of
     * track association.
     * 
     * Becomes callable without blocking when the key @"availableTrackAssociationTypes" has been loaded.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * 
     * @param trackAssociationType
     *                             The type of track association for which associated tracks are requested.
     * @return An NSArray containing AVAssetTracks; may be empty if there is no associated tracks of the specified type.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("associatedTracksOfType:")
    public native NSArray<? extends AVAssetTrack> associatedTracksOfType(@NotNull String trackAssociationType);

    /**
     * provides an NSArray of NSStrings, each representing a format of metadata that's available for the track (e.g.
     * QuickTime userdata, etc.)
     * Metadata formats are defined in AVMetadataItem.h.
     */
    @NotNull
    @Generated
    @Selector("availableMetadataFormats")
    public native NSArray<String> availableMetadataFormats();

    /**
     * Provides an NSArray of NSStrings, each representing a type of track association that the receiver has with one or
     * more of the other tracks of the asset (e.g. AVTrackAssociationTypeChapterList, AVTrackAssociationTypeTimecode,
     * etc.).
     * Track association types are defined immediately above.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("availableTrackAssociationTypes")
    public native NSArray<String> availableTrackAssociationTypes();

    /**
     * provides access to an array of AVMetadataItems for each common metadata key for which a value is available
     */
    @NotNull
    @Generated
    @Selector("commonMetadata")
    public native NSArray<? extends AVMetadataItem> commonMetadata();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * indicates the estimated data rate of the media data referenced by the track, in units of bits per second
     */
    @Generated
    @Selector("estimatedDataRate")
    public native float estimatedDataRate();

    /**
     * indicates the language tag associated with the track, as an IETF BCP 47 (RFC 4646) language identifier;
     * may be nil if no language tag is indicated
     */
    @Nullable
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * provides an array of CMFormatDescriptions
     * each of which indicates the format of media samples referenced by the track;
     * a track that presents uniform media, e.g. encoded according to the same encoding settings,
     * will provide an array with a count of 1
     */
    @NotNull
    @Generated
    @Selector("formatDescriptions")
    public native NSArray<?> formatDescriptions();

    /**
     * hasMediaCharacteristic:
     * 
     * Reports whether the track references media with the specified media characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic of interest, e.g. AVMediaCharacteristicVisual,
     *                            AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, etc.,
     *                            as defined above.
     * @return YES if the track references media with the specified characteristic, otherwise NO.
     */
    @Generated
    @Selector("hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(@NotNull String mediaCharacteristic);

    @Generated
    @Selector("init")
    public native AVAssetTrack init();

    /**
     * indicates whether the track is enabled according to state stored in its container or construct;
     * note that its presentation state can be changed from this default via AVPlayerItemTrack
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * Indicates whether the receiver is playable in the current environment; if YES, an AVPlayerItemTrack of an
     * AVPlayerItem initialized with the receiver's asset can be enabled for playback.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * indicates whether the track references sample data only within its storage container
     */
    @Generated
    @Selector("isSelfContained")
    public native boolean isSelfContained();

    /**
     * indicates the language associated with the track, as an ISO 639-2/T language code;
     * may be nil if no language is indicated
     */
    @Nullable
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(@NotNull NSArray<String> keys,
            @Nullable @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * indicates the media type for this track, e.g. AVMediaTypeVideo, AVMediaTypeAudio, etc., as defined in
     * AVMediaFormat.h.
     */
    @NotNull
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * Provides access to an array of AVMetadataItems for all metadata identifiers for which a value is available; items
     * can be filtered according to language via +[AVMetadataItem
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:] and according to identifier via
     * +[AVMetadataItem metadataItemsFromArray:filteredByIdentifier:].
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * metadataForFormat:
     * 
     * Provides an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format.
     * 
     * Becomes callable without blocking when the key @"availableMetadataFormats" has been loaded
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * 
     * @param format
     *               The metadata format for which items are requested.
     * @return An NSArray containing AVMetadataItems.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(@NotNull String format);

    /**
     * indicates the minimum duration of the track's frames; the value will be kCMTimeInvalid if the minimum frame
     * duration is not known or cannot be calculated
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("minFrameDuration")
    @ByValue
    public native CMTime minFrameDuration();

    /**
     * indicates the natural dimensions of the media data referenced by the track as a CGSize
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * indicates a timescale in which time values for the track can be operated upon without extraneous numerical
     * conversion
     */
    @Generated
    @Selector("naturalTimeScale")
    public native int naturalTimeScale();

    /**
     * [@property] nominalFrameRate
     * 
     * For tracks that carry a full frame per media sample, indicates the frame rate of the track in units of frames per
     * second.
     * 
     * For field-based video tracks that carry one field per media sample, the value of this property is the field rate,
     * not the frame rate.
     */
    @Generated
    @Selector("nominalFrameRate")
    public native float nominalFrameRate();

    /**
     * indicates the transform specified in the track's storage container as the preferred transformation of the visual
     * media data for display purposes;
     * its value is often but not always CGAffineTransformIdentity
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * indicates the volume specified in the track's storage container as the preferred volume of the audible media data
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * [@property] requiresFrameReordering
     * 
     * Indicates whether samples in the track may have different values for their presentation and decode timestamps.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("requiresFrameReordering")
    public native boolean requiresFrameReordering();

    /**
     * samplePresentationTimeForTrackTime:
     * 
     * Maps the specified trackTime through the appropriate time mapping and returns the resulting sample presentation
     * time.
     * 
     * @param trackTime
     *                  The trackTime for which a sample presentation time is requested.
     * @return A CMTime; will be invalid if the trackTime is out of range
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("samplePresentationTimeForTrackTime:")
    @ByValue
    public native CMTime samplePresentationTimeForTrackTime(@ByValue CMTime trackTime);

    /**
     * segmentForTrackTime:
     * 
     * Supplies the AVAssetTrackSegment from the segments array with a target timeRange that either contains the
     * specified track time or is the closest to it among the target timeRanges of the track's segments.
     * 
     * If the trackTime does not map to a sample presentation time (e.g. it's outside the track's timeRange), the
     * segment closest in time to the specified trackTime is returned.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * 
     * @param trackTime
     *                  The trackTime for which an AVAssetTrackSegment is requested.
     * @return An AVAssetTrackSegment.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("segmentForTrackTime:")
    public native AVAssetTrackSegment segmentForTrackTime(@ByValue CMTime trackTime);

    /**
     * Provides an array of AVAssetTrackSegments with time mappings from the timeline of the track's media samples to
     * the timeline of the track.
     * Empty edits, i.e. timeRanges for which no media data is available to be presented, have a value of
     * AVAssetTrackSegment.empty equal to YES.
     */
    @NotNull
    @Generated
    @Selector("segments")
    public native NSArray<? extends AVAssetTrackSegment> segments();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(@NotNull String key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Indicates the timeRange of the track within the overall timeline of the asset;
     * a track with CMTIME_COMPARE_INLINE(timeRange.start, >, kCMTimeZero) will initially present an empty interval.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    /**
     * indicates the total number of bytes of sample data required by the track
     */
    @Generated
    @Selector("totalSampleDataLength")
    public native long totalSampleDataLength();

    /**
     * indicates the persistent unique identifier for this track of the asset
     */
    @Generated
    @Selector("trackID")
    public native int trackID();

    /**
     * Indicates whether the receiver is decodable in the current environment; if YES, the track can be decoded even
     * though decoding may be too slow for real time playback.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isDecodable")
    public native boolean isDecodable();

    /**
     * indicates whether this audio track has dependencies (e.g. kAudioFormatMPEGD_USAC)
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hasAudioSampleDependencies")
    public native boolean hasAudioSampleDependencies();

    /**
     * loadAssociatedTracksOfType:completionHandler:
     * 
     * Provides an NSArray of AVAssetTracks, one for each track associated with the receiver with the specified type of
     * track association.
     * 
     * @param trackAssociationType
     *                             The type of track association for which associated tracks are requested.
     * @param completionHandler
     *                             A block that is invoked when loading is comlete, vending an array of tracks (which
     *                             may be empty if there is no associated tracks of the specified type) or an error.
     *                             `
     * 
     *                             API-Since: 15.0
     */
    @Generated
    @Selector("loadAssociatedTracksOfType:completionHandler:")
    public native void loadAssociatedTracksOfTypeCompletionHandler(@NotNull String trackAssociationType,
            @NotNull @ObjCBlock(name = "call_loadAssociatedTracksOfTypeCompletionHandler") Block_loadAssociatedTracksOfTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAssociatedTracksOfTypeCompletionHandler {
        @Generated
        void call_loadAssociatedTracksOfTypeCompletionHandler(@Nullable NSArray<? extends AVAssetTrack> arg0,
                @Nullable NSError arg1);
    }

    /**
     * loadMetadataForFormat:completionHandler:
     * 
     * Loads an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format.
     * 
     * @param format
     *                          The metadata format for which items are requested.
     * @param completionHandler
     *                          A block that is invoked when loading is complete, vending the array of metadata items
     *                          (which may be empty if there is no metadata of the specified format) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadMetadataForFormat:completionHandler:")
    public native void loadMetadataForFormatCompletionHandler(@NotNull String format,
            @NotNull @ObjCBlock(name = "call_loadMetadataForFormatCompletionHandler") Block_loadMetadataForFormatCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadMetadataForFormatCompletionHandler {
        @Generated
        void call_loadMetadataForFormatCompletionHandler(@Nullable NSArray<? extends AVMetadataItem> arg0,
                @Nullable NSError arg1);
    }

    /**
     * loadSamplePresentationTimeForTrackTime:completionHandler:
     * 
     * Maps the specified trackTime through the appropriate time mapping and loads the resulting sample presentation
     * time.
     * 
     * @param trackTime
     *                          The trackTime for which a sample presentation time is requested.
     * @param completionHandler
     *                          A block that is invoked when loading is complete, vending a CMTime (which will be
     *                          invalid if the trackTime is out of range) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadSamplePresentationTimeForTrackTime:completionHandler:")
    public native void loadSamplePresentationTimeForTrackTimeCompletionHandler(@ByValue CMTime trackTime,
            @NotNull @ObjCBlock(name = "call_loadSamplePresentationTimeForTrackTimeCompletionHandler") Block_loadSamplePresentationTimeForTrackTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSamplePresentationTimeForTrackTimeCompletionHandler {
        @Generated
        void call_loadSamplePresentationTimeForTrackTimeCompletionHandler(@ByValue CMTime arg0, @Nullable NSError arg1);
    }

    /**
     * loadSegmentForTrackTime:completionHandler:
     * 
     * Loads the AVAssetTrackSegment from the segments array with a target timeRange that either contains the specified
     * track time or is the closest to it among the target timeRanges of the track's segments.
     * 
     * If the trackTime does not map to a sample presentation time (e.g. it's outside the track's timeRange), the
     * segment closest in time to the specified trackTime is returned.
     * 
     * API-Since: 15.0
     * 
     * @param trackTime
     *                          The trackTime for which an AVAssetTrackSegment is requested.
     * @param completionHandler
     *                          A block that is invoked when loading is complete, vending an AVAssetTrackSegment or an
     *                          error.
     */
    @Generated
    @Selector("loadSegmentForTrackTime:completionHandler:")
    public native void loadSegmentForTrackTimeCompletionHandler(@ByValue CMTime trackTime,
            @NotNull @ObjCBlock(name = "call_loadSegmentForTrackTimeCompletionHandler") Block_loadSegmentForTrackTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadSegmentForTrackTimeCompletionHandler {
        @Generated
        void call_loadSegmentForTrackTimeCompletionHandler(@Nullable AVAssetTrackSegment arg0, @Nullable NSError arg1);
    }

    /**
     * Indicates whether the receiver can provide instances of AVSampleCursor for traversing its media samples and
     * discovering information about them.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("canProvideSampleCursors")
    public native boolean canProvideSampleCursors();

    /**
     * makeSampleCursorAtFirstSampleInDecodeOrder:
     * 
     * Creates an instance of AVSampleCursor and positions it at the receiver's first media sample in decode order.
     * 
     * This method will return nil if there are no samples in the track.
     * 
     * API-Since: 16.0
     * 
     * @return An instance of AVSampleCursor.
     */
    @Nullable
    @Generated
    @Selector("makeSampleCursorAtFirstSampleInDecodeOrder")
    public native AVSampleCursor makeSampleCursorAtFirstSampleInDecodeOrder();

    /**
     * makeSampleCursorAtLastSampleInDecodeOrder:
     * 
     * Creates an instance of AVSampleCursor and positions it at the receiver's last media sample in decode order.
     * 
     * This method will return nil if there are no samples in the track.
     * 
     * API-Since: 16.0
     * 
     * @return An instance of AVSampleCursor.
     */
    @Nullable
    @Generated
    @Selector("makeSampleCursorAtLastSampleInDecodeOrder")
    public native AVSampleCursor makeSampleCursorAtLastSampleInDecodeOrder();

    /**
     * makeSampleCursorWithPresentationTimeStamp:
     * 
     * Creates an instance of AVSampleCursor and positions it at or near the specified presentation timestamp.
     * 
     * If the receiver's asset has a value of YES for providesPreciseDurationAndTiming, the sample cursor will be
     * accurately positioned at the receiver's last media sample with presentation timestamp less than or equal to the
     * desired timestamp, or, if there are no such samples, the first sample in presentation order.
     * If the receiver's asset has a value of NO for providesPreciseDurationAndTiming, and it is prohibitively expensive
     * to locate the precise sample at the desired timestamp, the sample cursor may be approximately positioned.
     * This method will return nil if there are no samples in the track.
     * 
     * API-Since: 16.0
     * 
     * @param presentationTimeStamp
     *                              The desired initial presentation timestamp of the returned AVSampleCursor.
     * @return An instance of AVSampleCursor.
     */
    @Nullable
    @Generated
    @Selector("makeSampleCursorWithPresentationTimeStamp:")
    public native AVSampleCursor makeSampleCursorWithPresentationTimeStamp(@ByValue CMTime presentationTimeStamp);
}

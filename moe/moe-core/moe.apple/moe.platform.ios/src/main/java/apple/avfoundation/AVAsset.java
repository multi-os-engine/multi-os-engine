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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAsset extends NSObject implements NSCopying, AVAsynchronousKeyValueLoading {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAsset alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * assetWithURL:
     * 
     * Returns an instance of AVAsset for inspection of a media resource.
     * 
     * Returns a newly allocated instance of a subclass of AVAsset initialized with the specified URL.
     * 
     * @param		URL
     * 		An instance of NSURL that references a media resource.
     * @return		An instance of AVAsset.
     */
    @Generated
    @Selector("assetWithURL:")
    public static native AVAsset assetWithURL(NSURL URL);

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
     * array of NSLocale
     */
    @Generated
    @Selector("availableChapterLocales")
    public native NSArray<? extends NSLocale> availableChapterLocales();

    /**
     * Provides an NSArray of NSStrings, each NSString indicating a media characteristic for which a media selection option is available.
     */
    @Generated
    @Selector("availableMediaCharacteristicsWithMediaSelectionOptions")
    public native NSArray<String> availableMediaCharacteristicsWithMediaSelectionOptions();

    /**
     * Provides an NSArray of NSStrings, each representing a metadata format that's available to the asset (e.g. ID3, iTunes metadata, etc.). Metadata formats are defined in AVMetadataFormat.h.
     */
    @Generated
    @Selector("availableMetadataFormats")
    public native NSArray<String> availableMetadataFormats();

    /**
     * [@property]		canContainFragments
     * 
     * Indicates whether the asset is capable of being extended by fragments.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of canContainFragments is YES if an 'mvex' box is present in the 'moov' box. For those types, the 'mvex' box signals the possible presence of later 'moof' boxes.
     */
    @Generated
    @Selector("canContainFragments")
    public native boolean canContainFragments();

    /**
     * cancelLoading
     * 
     * Cancels the loading of all values for all observers.
     * 
     * Deallocation or finalization of an instance of AVAsset will implicitly cancel loading if any loading requests are still outstanding.
     */
    @Generated
    @Selector("cancelLoading")
    public native void cancelLoading();

    /**
     * chapterMetadataGroupsBestMatchingPreferredLanguages:
     * 
     * Tests, in order of preference, for a match between language identifiers in the specified array of preferred languages and the available chapter locales, and returns the array of chapters corresponding to the first match that's found.
     * 
     *  Safe to call without blocking when the AVAsset key availableChapterLocales has status AVKeyValueStatusLoaded.
     * 
     *  Returns an array of AVTimedMetadataGroup objects. Each object in the array always contains an AVMetadataItem representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal to the time range of the chapter title item.
     * 
     *  All of the available chapter metadata is included in the metadata groups, including items with the common key AVMetadataCommonKeyArtwork, if such items are present. Items not carrying chapter titles will be added to an existing AVTimedMetadataGroup object if the time range (timestamp and duration) of the metadata item and that of the metadata group overlaps. The locale of such items need not match the locale of the chapter titles.
     * 
     *  Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the metadata items according to locale can be accomplished using +[AVMetadataItem metadataItemsFromArray:withLocale:].
     * .
     * 
     *  @param			preferredLanguages
     *  An array of language identifiers in order of preference, each of which is an IETF BCP 47 (RFC 4646) language identifier. Use +[NSLocale preferredLanguages] to obtain the user's list of preferred languages.
     *  @return		An NSArray of AVTimedMetadataGroup.
     */
    @Generated
    @Selector("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsBestMatchingPreferredLanguages(
            NSArray<String> preferredLanguages);

    /**
     * chapterMetadataGroupsWithTitleLocale:containingMetadataItemsWithCommonKeys:
     * 
     * Provides an array of chapters.
     * 
     * This method returns an array of AVTimedMetadataGroup objects. Each object in the array always contains an AVMetadataItem representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal to the time range of the chapter title item.
     * 
     * An AVMetadataItem with the specified common key will be added to an existing AVTimedMetadataGroup object if the time range (timestamp and duration) of the metadata item and the metadata group overlaps. The locale of items not carrying chapter titles need not match the specified locale parameter.
     * 
     * Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the metadata items according to locale can be accomplished using +[AVMetadataItem metadataItemsFromArray:withLocale:].
     * 
     *  @param		locale
     * 			Locale of the metadata items carrying chapter titles to be returned (supports the IETF BCP 47 specification).
     *  @param		commonKeys
     * 			Array of common keys of AVMetadataItem to be included; can be nil. 
     * 			AVMetadataCommonKeyArtwork is the only supported key for now.
     *  @return		An NSArray of AVTimedMetadataGroup.
     */
    @Generated
    @Selector("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeys(
            NSLocale locale, NSArray<String> commonKeys);

    /**
     * Provides access to an array of AVMetadataItems for each common metadata key for which a value is available; items can be filtered according to language via +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:] and according to identifier via +[AVMetadataItem metadataItemsFromArray:filteredByIdentifier:].
     */
    @Generated
    @Selector("commonMetadata")
    public native NSArray<? extends AVMetadataItem> commonMetadata();

    /**
     * [@property]		containsFragments
     * 
     * Indicates whether the asset is extended by at least one fragment.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of this property is YES if canContainFragments is YES and at least one 'moof' box is present after the 'moov' box.
     */
    @Generated
    @Selector("containsFragments")
    public native boolean containsFragments();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Indicates the creation date of the asset as an AVMetadataItem. May be nil. If a creation date has been stored by the asset in a form that can be converted to an NSDate, the dateValue property of the AVMetadataItem will provide an instance of NSDate. Otherwise the creation date is available only as a string value, via -[AVMetadataItem stringValue].
     */
    @Generated
    @Selector("creationDate")
    public native AVMetadataItem creationDate();

    /**
     * Indicates the duration of the asset. If @"providesPreciseDurationAndTiming" is NO, a best-available estimate of the duration is returned. The degree of precision preferred for timing-related properties can be set at initialization time for assets initialized with URLs. See AVURLAssetPreferPreciseDurationAndTimingKey for AVURLAsset below.
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * [@property]		hasProtectedContent
     * 
     * Indicates whether or not the asset has protected content.
     * 
     * Assets containing protected content may not be playable without successful authorization, even if the value of the "playable" property is YES.  See the properties in the AVAssetUsability category for details on how such an asset may be used.  On OS X, clients can use the interfaces in AVPlayerItemProtectedContentAdditions.h to request authorization to play the asset.
     */
    @Generated
    @Selector("hasProtectedContent")
    public native boolean hasProtectedContent();

    @Generated
    @Selector("init")
    public native AVAsset init();

    /**
     * [@property]		compatibleWithAirPlayVideo
     * 
     * Indicates whether the asset is compatible with AirPlay Video.
     * 
     * YES if an AVPlayerItem initialized with the receiver can be played by an external device via AirPlay Video.
     */
    @Generated
    @Selector("isCompatibleWithAirPlayVideo")
    public native boolean isCompatibleWithAirPlayVideo();

    /**
     * indicates whether the receiver can be written to the saved photos album
     */
    @Generated
    @Selector("isCompatibleWithSavedPhotosAlbum")
    public native boolean isCompatibleWithSavedPhotosAlbum();

    /**
     * indicates whether the receiver can be used to build an AVMutableComposition
     */
    @Generated
    @Selector("isComposable")
    public native boolean isComposable();

    /**
     * indicates whether an AVAssetExportSession can be used with the receiver for export
     */
    @Generated
    @Selector("isExportable")
    public native boolean isExportable();

    /**
     * [@property]		playable
     * 
     * Indicates whether an AVPlayer can play the contents of the asset in a manner that meets user expectations.
     * 
     * A client can attempt playback when playable is NO, this however may lead to a substandard playback experience.
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * indicates whether an AVAssetReader can be used with the receiver for extracting media data
     */
    @Generated
    @Selector("isReadable")
    public native boolean isReadable();

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(NSArray<String> keys,
            @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * Provides access to the lyrics of the asset suitable for the current locale.
     */
    @Generated
    @Selector("lyrics")
    public native String lyrics();

    /**
     * mediaSelectionGroupForMediaCharacteristic:
     * 
     * Provides an instance of AVMediaSelectionGroup that contains one or more options with the specified media characteristic.
     * 
     * Becomes callable without blocking when the key @"availableMediaCharacteristicsWithMediaSelectionOptions" has been loaded.
     * 
     * If the asset has no AVMediaSelectionGroup containing options with the specified media characteristic, the return value will be nil.
     * 
     * Filtering of the options in the returned AVMediaSelectionGroup according to playability, locale, and additional media characteristics can be accomplished using the category AVMediaSelectionOptionFiltering defined on AVMediaSelectionGroup.
     * 
     *  @param		mediaCharacteristic
     * A media characteristic for which you wish to obtain the available media selection options. AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, and AVMediaCharacteristicVisual are currently supported.
     * 
     * Pass AVMediaCharacteristicAudible to obtain the group of available options for audio media in various languages and for various purposes, such as descriptive audio.
     * Pass AVMediaCharacteristicLegible to obtain the group of available options for subtitles in various languages and for various purposes.
     * Pass AVMediaCharacteristicVisual to obtain the group of available options for video media.
     *  @return		An instance of AVMediaSelectionGroup. May be nil.
     */
    @Generated
    @Selector("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup mediaSelectionGroupForMediaCharacteristic(String mediaCharacteristic);

    /**
     * Provides access to an array of AVMetadataItems for all metadata identifiers for which a value is available; items can be filtered according to language via +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:] and according to identifier via +[AVMetadataItem metadataItemsFromArray:filteredByIdentifier:].
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * metadataForFormat:
     * 
     * Provides an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format; can subsequently be filtered according to language via +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:], according to locale via +[AVMetadataItem metadataItemsFromArray:withLocale:], or according to key via +[AVMetadataItem metadataItemsFromArray:withKey:keySpace:].
     * 
     * Becomes callable without blocking when the key @"availableMetadataFormats" has been loaded
     * 
     * @param		format
     * 		The metadata format for which items are requested.
     * @return		An NSArray containing AVMetadataItems; may be empty if there is no metadata of the specified format.
     */
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(String format);

    /**
     * The following property is deprecated. Instead, use the naturalSize and preferredTransform, as appropriate, of the receiver's video tracks. See -tracksWithMediaType: below.
     */
    @Generated
    @Deprecated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * [@property]		overallDurationHint
     * 
     * Indicates the total duration of fragments that either exist now or may be appended in the future in order to extend the duration of the asset.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of this property is obtained from the 'mehd' box of the 'mvex' box, if present. If no total fragment duration hint is available, the value of this property is kCMTimeInvalid.
     */
    @Generated
    @Selector("overallDurationHint")
    @ByValue
    public native CMTime overallDurationHint();

    /**
     * [@property]		preferredMediaSelection
     * 
     * Provides an instance of AVMediaSelection with default selections for each of the receiver's media selection groups.
     */
    @Generated
    @Selector("preferredMediaSelection")
    public native AVMediaSelection preferredMediaSelection();

    /**
     * indicates the natural rate at which the asset is to be played; often but not always 1.0
     */
    @Generated
    @Selector("preferredRate")
    public native float preferredRate();

    /**
     * indicates the preferred transform to apply to the visual content of the asset for presentation or processing; the value is often but not always the identity transform
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * indicates the preferred volume at which the audible media of an asset is to be played; often but not always 1.0
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * Indicates that the asset provides precise timing. See @"duration" above and AVURLAssetPreferPreciseDurationAndTimingKey below.
     */
    @Generated
    @Selector("providesPreciseDurationAndTiming")
    public native boolean providesPreciseDurationAndTiming();

    /**
     *  [@property]		referenceRestrictions
     * 
     * Indicates the reference restrictions being used by the receiver.
     * 
     * For AVURLAsset, this property reflects the value passed in for AVURLAssetReferenceRestrictionsKey, if any. See AVURLAssetReferenceRestrictionsKey below for a full discussion of reference restrictions. The default value for this property is AVAssetReferenceRestrictionForbidLocalReferenceToRemote.
     */
    @Generated
    @Selector("referenceRestrictions")
    @NUInt
    public native long referenceRestrictions();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(String key, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] trackGroups
     * 
     * All track groups in the receiver.
     * 
     * The value of this property is an NSArray of AVAssetTrackGroups, each representing a different grouping of tracks in the receiver.
     */
    @Generated
    @Selector("trackGroups")
    public native NSArray<? extends AVAssetTrackGroup> trackGroups();

    /**
     * trackWithTrackID:
     * 
     * Provides an instance of AVAssetTrack that represents the track of the specified trackID.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param		trackID
     * 		The trackID of the requested AVAssetTrack.
     * @return		An instance of AVAssetTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVAssetTrack trackWithTrackID(int trackID);

    /**
     * [@property]		tracks
     * 
     * Provides the array of AVAssetTracks contained by the asset
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVAssetTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * 
     * Provides an array of AVAssetTracks of the asset that present media with the specified characteristic.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param		mediaCharacteristic
     * 		The media characteristic according to which AVAsset filters its AVAssetTracks. (Media characteristics are defined in AVMediaFormat.h.)
     * @return		An NSArray of AVAssetTracks; may be empty if no tracks with the specified characteristic are available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVAssetTracks of the asset that present media of the specified media type.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param		mediaType
     * 		The media type according to which AVAsset filters its AVAssetTracks. (Media types are defined in AVMediaFormat.h.)
     * @return		An NSArray of AVAssetTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaType(String mediaType);

    @Generated
    @Selector("unusedTrackID")
    public native int unusedTrackID();

    /**
     * [@property]		allMediaSelections
     * 
     * Provides an array of all permutations of AVMediaSelection for this asset.
     */
    @Generated
    @Selector("allMediaSelections")
    public native NSArray<? extends AVMediaSelection> allMediaSelections();

    /**
     * [@property]		minimumTimeOffsetFromLive
     * 
     * Indicates how close to the latest content in a live stream playback can be sustained.
     * 
     * For non-live assets this value is kCMTimeInvalid.
     */
    @Generated
    @Selector("minimumTimeOffsetFromLive")
    @ByValue
    public native CMTime minimumTimeOffsetFromLive();
}

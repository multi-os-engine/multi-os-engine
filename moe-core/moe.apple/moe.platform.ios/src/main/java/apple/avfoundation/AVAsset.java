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
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An AVAsset is an abstract class that defines AVFoundation's model for timed audiovisual media.
 * 
 * Each asset contains a collection of tracks that are intended to be presented or processed together, each of a uniform
 * media type, including but not limited to audio, video, text, closed captions, and subtitles.
 * 
 * AVAssets are often instantiated via its concrete subclass AVURLAsset with NSURLs that refer to audiovisual media
 * resources, such as streams (including HTTP live streams), QuickTime movie files, MP3 files, and files of other types.
 * 
 * They can also be instantiated using other concrete subclasses that extend the basic model for audiovisual media in
 * useful ways, as AVComposition does for temporal editing.
 * 
 * Properties of assets as a whole are defined by AVAsset. Additionally, references to instances of AVAssetTracks
 * representing tracks of the collection can be obtained, so that each of these can be examined independently.
 * 
 * Because of the nature of timed audiovisual media, upon successful initialization of an AVAsset some or all of the
 * values for its keys may not be immediately available. The value of any key can be requested at any time, and AVAsset
 * will always return its value synchronously, although it may have to block the calling thread in order to do so.
 * 
 * In order to avoid blocking, clients can register their interest in particular keys and to become notified when their
 * values become available. For further details, see AVAsynchronousKeyValueLoading.h. For clients who want to examine a
 * subset of the tracks, metadata, and other parts of the asset, asynchronous methods like
 * -loadTracksWithMediaType:completionHandler: can be used to load this information without blocking. When using these
 * asynchronous methods, it is not necessary to load the associated property beforehand. Swift clients can also use the
 * load(:) method to load properties in a type safe manner.
 * 
 * On platforms other than macOS, it is particularly important to avoid blocking. To preserve responsiveness, a
 * synchronous request that blocks for too long (eg, a property request on an asset on a slow HTTP server) may lead to
 * media services being reset.
 * 
 * To play an instance of AVAsset, initialize an instance of AVPlayerItem with it, use the AVPlayerItem to set up its
 * presentation state (such as whether only a limited timeRange of the asset should be played, etc.), and provide the
 * AVPlayerItem to an AVPlayer according to whether the items is to be played by itself or together with a collection of
 * other items. Full details available in AVPlayerItem.h and AVPlayer.h.
 * 
 * AVAssets can also be inserted into AVMutableCompositions in order to assemble audiovisual constructs from one or more
 * source assets.
 * 
 * API-Since: 4.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAsset allocWithZone(VoidPtr zone);

    /**
     * Returns an instance of AVAsset for inspection of a media resource.
     * 
     * Returns a newly allocated instance of a subclass of AVAsset initialized with the specified URL.
     * 
     * - Parameter URL: An instance of NSURL that references a media resource.
     * 
     * - Returns: An instance of AVAsset.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("assetWithURL:")
    public static native AVAsset assetWithURL(@NotNull NSURL URL);

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
    public static native AVAsset new_objc();

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
     * 
     * API-Since: 4.3
     */
    @NotNull
    @Generated
    @Selector("availableChapterLocales")
    public native NSArray<? extends NSLocale> availableChapterLocales();

    /**
     * Provides an NSArray of NSStrings, each NSString indicating a media characteristic for which a media selection
     * option is available.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("availableMediaCharacteristicsWithMediaSelectionOptions")
    public native NSArray<String> availableMediaCharacteristicsWithMediaSelectionOptions();

    /**
     * Provides an NSArray of NSStrings, each representing a metadata format that's available to the asset (e.g. ID3,
     * iTunes metadata, etc.). Metadata formats are defined in AVMetadataFormat.h.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("availableMetadataFormats")
    public native NSArray<String> availableMetadataFormats();

    /**
     * Indicates whether the asset is capable of being extended by fragments.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of canContainFragments is YES if an 'mvex' box is present
     * in the 'moov' box. For those types, the 'mvex' box signals the possible presence of later 'moof' boxes.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("canContainFragments")
    public native boolean canContainFragments();

    /**
     * Cancels the loading of all values for all observers.
     * 
     * Deallocation or finalization of an instance of AVAsset will implicitly cancel loading if any loading requests are
     * still outstanding.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("cancelLoading")
    public native void cancelLoading();

    /**
     * Tests, in order of preference, for a match between language identifiers in the specified array of preferred
     * languages and the available chapter locales, and returns the array of chapters corresponding to the first match
     * that's found.
     * 
     * Safe to call without blocking when the AVAsset key availableChapterLocales has status AVKeyValueStatusLoaded.
     * 
     * Returns an array of AVTimedMetadataGroup objects. Each object in the array always contains an AVMetadataItem
     * representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal to the time
     * range of the chapter title item.
     * 
     * All of the available chapter metadata is included in the metadata groups, including items with the common key
     * AVMetadataCommonKeyArtwork, if such items are present. Items not carrying chapter titles will be added to an
     * existing AVTimedMetadataGroup object if the time range (timestamp and duration) of the metadata item and that of
     * the metadata group overlaps. The locale of such items need not match the locale of the chapter titles.
     * 
     * Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using
     * +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the
     * metadata items according to locale can be accomplished using +[AVMetadataItem
     * metadataItemsFromArray:withLocale:].
     * 
     * - Parameter preferredLanguages: An array of language identifiers in order of preference, each of which is an IETF
     * BCP 47 (RFC 4646) language identifier. If your goal is to provide the best match for the end user's preferred
     * languages without consideration of your app's available localizations, pass [NSLocale preferredLanguages] as the
     * value of preferredLanguages. However, if you want to filter the available choices in order to obtain the best
     * match among the localizations that are available for your app, pass [NSBundle
     * preferredLocalizationsFromArray:[[NSBundle mainBundle] localizations] forPreferences:[NSLocale
     * preferredLanguages]] instead. The latter choice is normally more appropriate for strings intended for display as
     * part of the app's UI.
     * 
     * - Returns: An NSArray of AVTimedMetadataGroup.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadChapterMetadataGroupsBestMatchingPreferredLanguages:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsBestMatchingPreferredLanguages(
            @NotNull NSArray<String> preferredLanguages);

    /**
     * Provides an array of chapters.
     * 
     * This method returns an array of AVTimedMetadataGroup objects. Each object in the array always contains an
     * AVMetadataItem representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal
     * to the time range of the chapter title item.
     * 
     * An AVMetadataItem with the specified common key will be added to an existing AVTimedMetadataGroup object if the
     * time range (timestamp and duration) of the metadata item and the metadata group overlaps. The locale of items not
     * carrying chapter titles need not match the specified locale parameter.
     * 
     * Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using
     * +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the
     * metadata items according to locale can be accomplished using +[AVMetadataItem
     * metadataItemsFromArray:withLocale:].
     * 
     * - Parameter locale: Locale of the metadata items carrying chapter titles to be returned (supports the IETF BCP 47
     * specification).
     * - Parameter commonKeys: Array of common keys of AVMetadataItem to be included; can be nil.
     * AVMetadataCommonKeyArtwork is the only supported key for now.
     * 
     * - Returns: An NSArray of AVTimedMetadataGroup.
     * 
     * API-Since: 4.3
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadChapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:completionHandler:
     * instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeys(
            @NotNull NSLocale locale, @Nullable NSArray<String> commonKeys);

    /**
     * Provides access to an array of AVMetadataItems for each common metadata key for which a value is available; items
     * can be filtered according to language via +[AVMetadataItem
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:] and according to identifier via
     * +[AVMetadataItem metadataItemsFromArray:filteredByIdentifier:].
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("commonMetadata")
    public native NSArray<? extends AVMetadataItem> commonMetadata();

    /**
     * Indicates whether the asset is extended by at least one fragment.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of this property is YES if canContainFragments is YES and
     * at least one 'moof' box is present after the 'moov' box.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("containsFragments")
    public native boolean containsFragments();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Indicates the creation date of the asset as an AVMetadataItem. May be nil. If a creation date has been stored by
     * the asset in a form that can be converted to an NSDate, the dateValue property of the AVMetadataItem will provide
     * an instance of NSDate. Otherwise the creation date is available only as a string value, via -[AVMetadataItem
     * stringValue].
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("creationDate")
    public native AVMetadataItem creationDate();

    /**
     * Indicates the duration of the asset.
     * 
     * If @"providesPreciseDurationAndTiming" is NO, a best-available estimate of the duration is returned. The degree
     * of precision preferred for timing-related properties can be set at initialization time for assets initialized
     * with URLs
     * 
     * - Seealso: AVURLAssetPreferPreciseDurationAndTimingKey for AVURLAsset below.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * Indicates whether or not the asset has protected content.
     * 
     * Assets containing protected content may not be playable without successful authorization, even if the value of
     * the "playable" property is YES. See the properties in the AVAssetUsability category for details on how such an
     * asset may be used. On macOS, clients can use the interfaces in AVPlayerItemProtectedContentAdditions.h to request
     * authorization to play the asset.
     * 
     * API-Since: 4.2
     */
    @Generated
    @Selector("hasProtectedContent")
    public native boolean hasProtectedContent();

    @Generated
    @Selector("init")
    public native AVAsset init();

    /**
     * Indicates whether the asset is compatible with AirPlay Video.
     * 
     * YES if an AVPlayerItem initialized with the receiver can be played by an external device via AirPlay Video.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isCompatibleWithAirPlayVideo")
    public native boolean isCompatibleWithAirPlayVideo();

    /**
     * Indicates whether the receiver can be written to the saved photos album
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isCompatibleWithSavedPhotosAlbum")
    public native boolean isCompatibleWithSavedPhotosAlbum();

    /**
     * Indicates whether the receiver can be used to build an AVMutableComposition
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("isComposable")
    public native boolean isComposable();

    /**
     * Indicates whether an AVAssetExportSession can be used with the receiver for export
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("isExportable")
    public native boolean isExportable();

    /**
     * Indicates whether an AVPlayer can play the contents of the asset in a manner that meets user expectations.
     * 
     * A client can attempt playback when playable is NO, this however may lead to a substandard playback experience.
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * Indicates whether an AVAssetReader can be used with the receiver for extracting media data
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("isReadable")
    public native boolean isReadable();

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(@NotNull NSArray<String> keys,
            @Nullable @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * Provides access to the lyrics of the asset suitable for the current locale.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("lyrics")
    public native String lyrics();

    /**
     * Provides an instance of AVMediaSelectionGroup that contains one or more options with the specified media
     * characteristic.
     * 
     * Becomes callable without blocking when the key @"availableMediaCharacteristicsWithMediaSelectionOptions" has been
     * loaded.
     * 
     * If the asset has no AVMediaSelectionGroup containing options with the specified media characteristic, the return
     * value will be nil.
     * 
     * Filtering of the options in the returned AVMediaSelectionGroup according to playability, locale, and additional
     * media characteristics can be accomplished using the category AVMediaSelectionOptionFiltering defined on
     * AVMediaSelectionGroup.
     * 
     * - Parameter mediaCharacteristic: A media characteristic for which you wish to obtain the available media
     * selection options. AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, and AVMediaCharacteristicVisual
     * are currently supported.
     * Pass AVMediaCharacteristicAudible to obtain the group of available options for audio media in various languages
     * and for various purposes, such as descriptive audio.
     * Pass AVMediaCharacteristicLegible to obtain the group of available options for subtitles in various languages and
     * for various purposes.
     * Pass AVMediaCharacteristicVisual to obtain the group of available options for video media.
     * 
     * - Returns: An instance of AVMediaSelectionGroup. May be nil.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadMediaSelectionGroupForMediaCharacteristic:completionHandler: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup mediaSelectionGroupForMediaCharacteristic(@NotNull String mediaCharacteristic);

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
     * Provides an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format; can
     * subsequently be filtered according to language via +[AVMetadataItem
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:], according to locale via +[AVMetadataItem
     * metadataItemsFromArray:withLocale:], or according to key via +[AVMetadataItem
     * metadataItemsFromArray:withKey:keySpace:].
     * 
     * Becomes callable without blocking when the key @"availableMetadataFormats" has been loaded
     * 
     * - Parameter format: The metadata format for which items are requested.
     * 
     * - Returns: An NSArray containing AVMetadataItems; may be empty if there is no metadata of the specified format.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadMetadataForFormat:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(@NotNull String format);

    /**
     * The following property is deprecated. Instead, use the naturalSize and preferredTransform, as appropriate, of the
     * receiver's video tracks. See -tracksWithMediaType: below.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 5.0
     * Deprecated-Message: Use the naturalSize and preferredTransform, as appropriate, of the receiver's video tracks.
     * See -tracksWithMediaType:
     */
    @Generated
    @Deprecated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * Indicates the total duration of fragments that either exist now or may be appended in the future in order to
     * extend the duration of the asset.
     * 
     * For QuickTime movie files and MPEG-4 files, the value of this property is obtained from the 'mehd' box of the
     * 'mvex' box, if present. If no total fragment duration hint is available, the value of this property is
     * kCMTimeInvalid.
     * 
     * API-Since: 10.2
     */
    @Generated
    @Selector("overallDurationHint")
    @ByValue
    public native CMTime overallDurationHint();

    /**
     * Provides an instance of AVMediaSelection with default selections for each of the receiver's media selection
     * groups.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("preferredMediaSelection")
    public native AVMediaSelection preferredMediaSelection();

    /**
     * Indicates the natural rate at which the asset is to be played; often but not always 1.0
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("preferredRate")
    public native float preferredRate();

    /**
     * Indicates the preferred transform to apply to the visual content of the asset for presentation or processing; the
     * value is often but not always the identity transform
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * Indicates the preferred volume at which the audible media of an asset is to be played; often but not always 1.0
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * Indicates that the asset provides precise timing. See @"duration" above and
     * AVURLAssetPreferPreciseDurationAndTimingKey below.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("providesPreciseDurationAndTiming")
    public native boolean providesPreciseDurationAndTiming();

    /**
     * Indicates the reference restrictions being used by the receiver.
     * 
     * For AVURLAsset, this property reflects the value passed in for AVURLAssetReferenceRestrictionsKey, if any. See
     * AVURLAssetReferenceRestrictionsKey below for a full discussion of reference restrictions. The default value for
     * this property is AVAssetReferenceRestrictionForbidLocalReferenceToRemote.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("referenceRestrictions")
    @NUInt
    public native long referenceRestrictions();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(@NotNull String key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * All track groups in the receiver.
     * 
     * The value of this property is an NSArray of AVAssetTrackGroups, each representing a different grouping of tracks
     * in the receiver.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("trackGroups")
    public native NSArray<? extends AVAssetTrackGroup> trackGroups();

    /**
     * Provides an instance of AVAssetTrack that represents the track of the specified trackID.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * - Parameter trackID: The trackID of the requested AVAssetTrack.
     * 
     * - Returns: An instance of AVAssetTrack; may be nil if no track of the specified trackID is available.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadTrackWithTrackID:completionHandler: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("trackWithTrackID:")
    public native AVAssetTrack trackWithTrackID(int trackID);

    /**
     * Provides the array of AVAssetTracks contained by the asset
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVAssetTrack> tracks();

    /**
     * Provides an array of AVAssetTracks of the asset that present media with the specified characteristic.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * - Parameter mediaCharacteristic: The media characteristic according to which AVAsset filters its AVAssetTracks.
     * (Media characteristics are defined in AVMediaFormat.h.)
     * 
     * - Returns: An NSArray of AVAssetTracks; may be empty if no tracks with the specified characteristic are
     * available.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadTracksWithMediaCharacteristic:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaCharacteristic(@NotNull String mediaCharacteristic);

    /**
     * Provides an array of AVAssetTracks of the asset that present media of the specified media type.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * - Parameter mediaType: The media type according to which AVAsset filters its AVAssetTracks. (Media types are
     * defined in AVMediaFormat.h.)
     * 
     * - Returns: An NSArray of AVAssetTracks; may be empty if no tracks of the specified media type are available.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use loadTracksWithMediaType:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaType(@NotNull String mediaType);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use findUnusedTrackIDWithCompletionHandler: instead
     */
    @Deprecated
    @Generated
    @Selector("unusedTrackID")
    public native int unusedTrackID();

    /**
     * Provides an array of all permutations of AVMediaSelection for this asset.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("allMediaSelections")
    public native NSArray<? extends AVMediaSelection> allMediaSelections();

    /**
     * Indicates how close to the latest content in a live stream playback can be sustained.
     * 
     * For non-live assets this value is kCMTimeInvalid.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("minimumTimeOffsetFromLive")
    @ByValue
    public native CMTime minimumTimeOffsetFromLive();

    /**
     * Loads a track ID that will not collide with any existing track
     * 
     * - Parameter completionHandler: A block that is invoked when loading is complete, vending the track ID or an
     * error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("findUnusedTrackIDWithCompletionHandler:")
    public native void findUnusedTrackIDWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_findUnusedTrackIDWithCompletionHandler") Block_findUnusedTrackIDWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findUnusedTrackIDWithCompletionHandler {
        @Generated
        void call_findUnusedTrackIDWithCompletionHandler(int arg0, @Nullable NSError arg1);
    }

    /**
     * Tests, in order of preference, for a match between language identifiers in the specified array of preferred
     * languages and the available chapter locales, and loads the array of chapters corresponding to the first match
     * that's found.
     * 
     * Returns an array of AVTimedMetadataGroup objects. Each object in the array always contains an AVMetadataItem
     * representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal to the time
     * range of the chapter title item.
     * 
     * All of the available chapter metadata is included in the metadata groups, including items with the common key
     * AVMetadataCommonKeyArtwork, if such items are present. Items not carrying chapter titles will be added to an
     * existing AVTimedMetadataGroup object if the time range (timestamp and duration) of the metadata item and that of
     * the metadata group overlaps. The locale of such items need not match the locale of the chapter titles.
     * 
     * Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using
     * +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the
     * metadata items according to locale can be accomplished using +[AVMetadataItem
     * metadataItemsFromArray:withLocale:].
     * 
     * - Parameter preferredLanguages: An array of language identifiers in order of preference, each of which is an IETF
     * BCP 47 (RFC 4646) language identifier. If your goal is to provide the best match for the end user's preferred
     * languages without consideration of your app's available localizations, pass [NSLocale preferredLanguages] as the
     * value of preferredLanguages. However, if you want to filter the available choices in order to obtain the best
     * match among the localizations that are available for your app, pass [NSBundle
     * preferredLocalizationsFromArray:[[NSBundle mainBundle] localizations] forPreferences:[NSLocale
     * preferredLanguages]] instead. The latter choice is normally more appropriate for strings intended for display as
     * part of the app's UI.
     * - Parameter completionHandler: A block that is invoked when loading is complete, vending the array of timed
     * metadata groups or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadChapterMetadataGroupsBestMatchingPreferredLanguages:completionHandler:")
    public native void loadChapterMetadataGroupsBestMatchingPreferredLanguagesCompletionHandler(
            @NotNull NSArray<String> preferredLanguages,
            @NotNull @ObjCBlock(name = "call_loadChapterMetadataGroupsBestMatchingPreferredLanguagesCompletionHandler") Block_loadChapterMetadataGroupsBestMatchingPreferredLanguagesCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadChapterMetadataGroupsBestMatchingPreferredLanguagesCompletionHandler {
        @Generated
        void call_loadChapterMetadataGroupsBestMatchingPreferredLanguagesCompletionHandler(
                @Nullable NSArray<? extends AVTimedMetadataGroup> arg0, @Nullable NSError arg1);
    }

    /**
     * Loads an array of chapters.
     * 
     * This method vends an array of AVTimedMetadataGroup objects. Each object in the array always contains an
     * AVMetadataItem representing the chapter title; the timeRange property of the AVTimedMetadataGroup object is equal
     * to the time range of the chapter title item.
     * 
     * An AVMetadataItem with the specified common key will be added to an existing AVTimedMetadataGroup object if the
     * time range (timestamp and duration) of the metadata item and the metadata group overlaps. The locale of items not
     * carrying chapter titles need not match the specified locale parameter.
     * 
     * Further filtering of the metadata items in AVTimedMetadataGroups according to language can be accomplished using
     * +[AVMetadataItem metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:]; filtering of the
     * metadata items according to locale can be accomplished using +[AVMetadataItem
     * metadataItemsFromArray:withLocale:].
     * 
     * - Parameter locale: Locale of the metadata items carrying chapter titles to be returned (supports the IETF BCP 47
     * specification).
     * - Parameter commonKeys: Array of common keys of AVMetadataItem to be included; if no common keys are required,
     * send an empty list. AVMetadataCommonKeyArtwork is the only supported key for now.
     * - Parameter completionHandler: A block that is invoked when loading is complete, vending the array of timed
     * metadata groups or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadChapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:completionHandler:")
    public native void loadChapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeysCompletionHandler(
            @NotNull NSLocale locale, @NotNull NSArray<String> commonKeys,
            @NotNull @ObjCBlock(name = "call_loadChapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeysCompletionHandler") Block_loadChapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeysCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadChapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeysCompletionHandler {
        @Generated
        void call_loadChapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeysCompletionHandler(
                @Nullable NSArray<? extends AVTimedMetadataGroup> arg0, @Nullable NSError arg1);
    }

    /**
     * Loads an instance of AVMediaSelectionGroup that contains one or more options with the specified media
     * characteristic.
     * 
     * If the asset has no AVMediaSelectionGroup containing options with the specified media characteristic, the return
     * value will be nil.
     * 
     * Filtering of the options in the returned AVMediaSelectionGroup according to playability, locale, and additional
     * media characteristics can be accomplished using the category AVMediaSelectionOptionFiltering defined on
     * AVMediaSelectionGroup.
     * 
     * - Parameter mediaCharacteristic: A media characteristic for which you wish to obtain the available media
     * selection options. AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, and AVMediaCharacteristicVisual
     * are currently supported.
     * Pass AVMediaCharacteristicAudible to obtain the group of available options for audio media in various languages
     * and for various purposes, such as descriptive audio.
     * Pass AVMediaCharacteristicLegible to obtain the group of available options for subtitles in various languages and
     * for various purposes
     * Pass AVMediaCharacteristicVisual to obtain the group of available options for video media.
     * - Parameter completionHandler: A block that is invoked when loading is complete, vending an instance of
     * AVMediaSelectionGroup (which may be nil) or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadMediaSelectionGroupForMediaCharacteristic:completionHandler:")
    public native void loadMediaSelectionGroupForMediaCharacteristicCompletionHandler(
            @NotNull String mediaCharacteristic,
            @NotNull @ObjCBlock(name = "call_loadMediaSelectionGroupForMediaCharacteristicCompletionHandler") Block_loadMediaSelectionGroupForMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadMediaSelectionGroupForMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadMediaSelectionGroupForMediaCharacteristicCompletionHandler(@Nullable AVMediaSelectionGroup arg0,
                @Nullable NSError arg1);
    }

    /**
     * Loads an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format; can
     * subsequently be filtered according to language via +[AVMetadataItem
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:], according to locale via +[AVMetadataItem
     * metadataItemsFromArray:withLocale:], or according to key via +[AVMetadataItem
     * metadataItemsFromArray:withKey:keySpace:].
     * 
     * - Parameter format: The metadata format for which items are requested.
     * - Parameter completionHandler: A block that is invoked when loading is complete, vending the array of metadata
     * items (which may be empty if there is no metadata of the specified format) or an error.
     * 
     * API-Since: 15.0
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
     * Loads an instance of AVAssetTrack that represents the track of the specified trackID.
     * 
     * - Parameter trackID: The trackID of the requested AVAssetTrack.
     * - Parameter completionHandler: A block that is called when the loading is finished, with either the loaded track
     * (which may be nil if no track of the specified trackID is available) or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadTrackWithTrackID:completionHandler:")
    public native void loadTrackWithTrackIDCompletionHandler(int trackID,
            @NotNull @ObjCBlock(name = "call_loadTrackWithTrackIDCompletionHandler") Block_loadTrackWithTrackIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTrackWithTrackIDCompletionHandler {
        @Generated
        void call_loadTrackWithTrackIDCompletionHandler(@Nullable AVAssetTrack arg0, @Nullable NSError arg1);
    }

    /**
     * Loads an array of AVAssetTracks of the asset that present media with the specified characteristic.
     * 
     * - Parameter mediaCharacteristic: The media characteristic according to which AVAsset filters its AVAssetTracks.
     * (Media characteristics are defined in AVMediaFormat.h.)
     * - Parameter completionHandler: A block that is called when the loading is finished, with either the loaded tracks
     * (which may be empty if no tracks with the specified characteristic are available) or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristicCompletionHandler(@NotNull String mediaCharacteristic,
            @NotNull @ObjCBlock(name = "call_loadTracksWithMediaCharacteristicCompletionHandler") Block_loadTracksWithMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadTracksWithMediaCharacteristicCompletionHandler(@Nullable NSArray<? extends AVAssetTrack> arg0,
                @Nullable NSError arg1);
    }

    /**
     * Loads an array of AVAssetTracks of the asset that present media of the specified media type.
     * 
     * - Parameter mediaType: The media type according to which AVAsset filters its AVAssetTracks. (Media types are
     * defined in AVMediaFormat.h.)
     * - Parameter completionHandler: A block that is called when the loading is finished, with either the loaded tracks
     * (which may be empty if no tracks of the specified media type are available) or an error.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaTypeCompletionHandler(@NotNull String mediaType,
            @NotNull @ObjCBlock(name = "call_loadTracksWithMediaTypeCompletionHandler") Block_loadTracksWithMediaTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaTypeCompletionHandler {
        @Generated
        void call_loadTracksWithMediaTypeCompletionHandler(@Nullable NSArray<? extends AVAssetTrack> arg0,
                @Nullable NSError arg1);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

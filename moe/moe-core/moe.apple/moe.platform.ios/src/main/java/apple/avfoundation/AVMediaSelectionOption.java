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
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.mediaplayer.MPNowPlayingInfoLanguageOption;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 5.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMediaSelectionOption extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMediaSelectionOption(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMediaSelectionOption alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMediaSelectionOption allocWithZone(VoidPtr zone);

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
    public static native AVMediaSelectionOption new_objc();

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
     * associatedMediaSelectionOptionInMediaSelectionGroup
     * 
     * If a media selection option in another group is associated with the specified option, returns a reference to the
     * associated option.
     * 
     * Audible media selection options often have associated legible media selection options; in particular, audible
     * options are typically associated with forced-only subtitle options with the same locale. See
     * AVMediaCharacteristicContainsOnlyForcedSubtitles in AVMediaFormat.h for a discussion of forced-only subtitles.
     * 
     * @param mediaSelectionGroup
     *                            A media selection group in which an associated option is to be sought.
     * @return An instance of AVMediaSelectionOption.
     */
    @Nullable
    @Generated
    @Selector("associatedMediaSelectionOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption associatedMediaSelectionOptionInMediaSelectionGroup(
            @NotNull AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * [@property] availableMetadataFormats
     * 
     * Provides an NSArray of NSStrings, each representing a metadata format that contains metadata associated with the
     * option (e.g. ID3, iTunes metadata, etc.).
     * 
     * Metadata formats are defined in AVMetadataFormat.h.
     */
    @NotNull
    @Generated
    @Selector("availableMetadataFormats")
    public native NSArray<String> availableMetadataFormats();

    /**
     * [@property] commonMetadata
     * 
     * Provides an array of AVMetadataItems for each common metadata key for which a value is available.
     * 
     * The array of AVMetadataItems can be filtered according to language via +[AVMetadataItem
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:], according to locale via +[AVMetadataItem
     * metadataItemsFromArray:withLocale:],
     * or according to key via +[AVMetadataItem metadataItemsFromArray:withKey:keySpace:].
     * Example: to obtain the name (or title) of a media selection option in any of the user's preferred languages.
     * 
     * NSString *title = nil;
     * NSArray *titles = [AVMetadataItem metadataItemsFromArray:[mediaSelectionOption commonMetadata]
     * withKey:AVMetadataCommonKeyTitle keySpace:AVMetadataKeySpaceCommon];
     * if ([titles count] > 0)
     * {
     * // Try to get a title that matches one of the user's preferred languages.
     * NSArray *titlesForPreferredLanguages = [AVMetadataItem metadataItemsFromArray:titles
     * filteredAndSortedAccordingToPreferredLanguages:[NSLocale preferredLanguages]];
     * if ([titlesForPreferredLanguages count] > 0)
     * {
     * title = [[titlesForPreferredLanguages objectAtIndex:0] stringValue];
     * }
     * 
     * // No matches in any of the preferred languages. Just use the primary title metadata we find.
     * if (title == nil)
     * {
     * title = [[titles objectAtIndex:0] stringValue];
     * }
     * }
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
     * [@property] displayName
     * 
     * Provides an NSString suitable for display using the current system locale.
     * 
     * May use this option's common metadata, media characteristics and locale properties in addition to the current
     * system locale to formulate an NSString intended for display.
     * In the event that common metadata is not available in the specified locale, displayName will fall back to
     * considering locales with the multilingual ("mul") then undetermined ("und") locale identifiers.
     * For a display name strictly with the specified locale use displayNameWithLocale: instead.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * displayNameWithLocale
     * 
     * Provides an NSString suitable for display.
     * 
     * May use this option's common metadata, media characteristics and locale properties in addition to the provided
     * locale to formulate an NSString intended for display. Will only consider common metadata with the specified
     * locale.
     * 
     * API-Since: 7.0
     * 
     * @param locale
     *               Localize manufactured portions of the string using the specificed locale.
     */
    @NotNull
    @Generated
    @Selector("displayNameWithLocale:")
    public native String displayNameWithLocale(@NotNull NSLocale locale);

    /**
     * [@property] extendedLanguageTag
     * 
     * Indicates the RFC 4646 language tag associated with the option. May be nil.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * hasMediaCharacteristic:
     * 
     * Reports whether the media selection option includes media with the specified media characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic of interest, e.g. AVMediaCharacteristicVisual,
     *                            AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, etc.
     * @return YES if the media selection option includes media with the specified characteristic, otherwise NO.
     */
    @Generated
    @Selector("hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(@NotNull String mediaCharacteristic);

    @Generated
    @Selector("init")
    public native AVMediaSelectionOption init();

    /**
     * [@property] playable
     * 
     * Indicates whether a media selection option is playable.
     * 
     * If the media data associated with the option cannot be decoded or otherwise rendered, playable is NO.
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * [@property] locale
     * 
     * Indicates the locale for which the media option was authored.
     * 
     * Use -[NSLocale objectForKey:NSLocaleLanguageCode] to obtain the language code of the locale. See NSLocale.h for
     * additional information.
     */
    @Nullable
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * Will create a language option from the AVMediaSelectionOption
     * Returns nil if the AVMediaSelectionOption does not represent an Audible or Legible selection option.
     */
    @Nullable
    @Generated
    @Selector("makeNowPlayingInfoLanguageOption")
    public native MPNowPlayingInfoLanguageOption makeNowPlayingInfoLanguageOption();

    /**
     * [@property] mediaSubTypes
     * 
     * The mediaSubTypes of the media data associated with the option.
     * 
     * An NSArray of NSNumbers carrying four character codes (of type FourCharCode) as defined in CoreAudioTypes.h for
     * audio media and in CMFormatDescription.h for video media.
     * Also see CMFormatDescriptionGetMediaSubType in CMFormatDescription.h for more information about media subtypes.
     * 
     * Note that if no information is available about the encoding of the media presented when a media option is
     * selected, the value of mediaSubTypes will be an empty array. This can occur, for example, with streaming media.
     * In these cases the value of mediaSubTypes should simply not be used as a criteria for selection.
     */
    @NotNull
    @Generated
    @Selector("mediaSubTypes")
    public native NSArray<? extends NSNumber> mediaSubTypes();

    /**
     * [@property] mediaType
     * 
     * The media type of the media data, e.g. AVMediaTypeAudio, AVMediaTypeSubtitle, etc.
     */
    @NotNull
    @Generated
    @Selector("mediaType")
    public native String mediaType();

    /**
     * metadataForFormat:
     * 
     * Provides an NSArray of AVMetadataItems, one for each metadata item in the container of the specified format.
     * 
     * @param format
     *               The metadata format for which items are requested.
     * @return An NSArray containing AVMetadataItems.
     */
    @NotNull
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(@NotNull String format);

    /**
     * propertyList
     * 
     * Returns a serializable property list that can be used to obtain an instance of AVMediaSelectionOption
     * representing the same option as the receiver via -[AVMediaSelectionGroup mediaSelectionOptionWithPropertyList:].
     * 
     * @return A serializable property list that's sufficient to identify the option within its group. For serialization
     *         utilities, see NSPropertyList.h.
     */
    @NotNull
    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();
}

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

package apple.mediaaccessibility.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGColorRef;
import apple.coretext.opaque.CTFontDescriptorRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Library("MediaAccessibility")
@Runtime(CRuntime.class)
public final class MediaAccessibility {
    static {
        NatJ.register();
    }

    @Generated
    private MediaAccessibility() {
    }

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @group Language preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     *  @function MACaptionAppearanceAddSelectedLanguage
     *  @abstract Adds a user's selected caption language to stack of languages.
     *  @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link
     *  @param language Canonical language identifier (see @link CFLocale@/link) of the user's preferred caption language.
     *  @result <code>true</code> if addition was successful. Unsuccessful additions are most liketly the result of invalid language codes.
     *  @discussion After a language is added it will appear first in the array returned by MACaptionAppearanceCopySelectedLanguages. Applications should call this anytime a user selects a specific languages for captioning tracks.
     * 
     *  For example, an AVFoundation clients may execute the following code in response to a user selecting a captioning track:
     *  <code>
     *  // in response to a user selection (from a pop-up menu or any other UI affordance), make the selection effective
     *  -[AVPlayerItem selectMediaOption:legibleOption inMediaSelectionGroup:legibleGroup];
     * 
     *  // now update system-wide captioning preferences by registering the language of the option selected by the user
     *   MACaptionAppearanceAddSelectedLanguage(kMACaptionAppearanceDomainUser, (CFStringRef)[[legibleOption locale] localeIdentifier]);
     * </code> 
     */
    @Generated
    @CFunction
    public static native boolean MACaptionAppearanceAddSelectedLanguage(@NInt long domain, CFStringRef language);

    /**
     * @function MACaptionAppearanceCopySelectedLanguages
     * 
     * @abstract Copies the user's preferred caption languages.
     * 
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * 
     * @result Ordered array of preferred canonical language identifiers.
     * 
     * @discussion Languages added using MACaptionAppearanceAddSelectedLanguage are normalized, and thus the contents of this array may have slightly different strings than those passed into MACaptionAppearanceAddSelectedLanguage.
     */
    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopySelectedLanguages(@NInt long domain);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @group General preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @function MACaptionAppearanceGetDisplayType
     * @abstract User preference representing what type of captions should be displayed
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @result User preference representing what type of captions should be displayed. See @link MACaptionAppearanceDisplayType @/link.
     */
    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetDisplayType(@NInt long domain);

    /**
     * @function MACaptionAppearanceSetDisplayType
     * @abstract User preference representing what type of captions should be displayed
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param displayType Captions display type, see  @link MACaptionAppearanceDisplayType @/link.
     */
    @Generated
    @CFunction
    public static native void MACaptionAppearanceSetDisplayType(@NInt long domain, @NInt long displayType);

    /**
     * @function MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics
     * @abstract User preference for captioning media characteristic
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @result An array containing the preferred order of media characteristics for captions.
     */
    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics(@NInt long domain);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @group Color preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @function MACaptionAppearanceCopyForegroundColor
     * @abstract User preference for foreground/text color.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for foreground/text color.
     */
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyForegroundColor(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceCopyBackgroundColor
     * @abstract User preference for background color.
     * @discussion The background color is the color behind each caption glyph.
     * @param domain Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for background color.
     */
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyBackgroundColor(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceCopyWindowColor
     * @abstract User preference for window color.
     * @discussion The window color is the color of a box behind all of the caption glyphs.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for window color.
     */
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyWindowColor(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceGetForegroundOpacity
     * @abstract User preference for foreground opacity.
     * @param domain Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for foreground opacity.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetForegroundOpacity(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceGetBackgroundOpacity
     * @abstract User preference for background opacity.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for background opacity.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetBackgroundOpacity(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceGetWindowOpacity
     * @abstract User preference for window opacity.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for window opacity.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowOpacity(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceGetWindowRoundedCornerRadius
     * @abstract User preference for caption-window corner radius.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for caption-window corner radius.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowRoundedCornerRadius(@NInt long domain, NIntPtr behavior);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @group Text preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * @function MACaptionAppearanceCopyFontForStyle
     * @abstract User font preference for the specified style.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @param fontStyle Font style, see  @link MACaptionAppearanceFontStyle @/link.
     * @result User font preference for the specified style.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef MACaptionAppearanceCopyFontDescriptorForStyle(@NInt long domain,
            NIntPtr behavior, @NInt long fontStyle);

    /**
     * @function MACaptionAppearanceGetRelativeCharacterSize
     * @abstract User preference for font scaling.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User font scaling preference for the specified style.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetRelativeCharacterSize(@NInt long domain, NIntPtr behavior);

    /**
     * @function MACaptionAppearanceGetTextEdgeStyle
     * @abstract User preference for text edge style.
     * @param domain Preference domain, see  @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @result User preference for text edge style.
     */
    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetTextEdgeStyle(@NInt long domain, NIntPtr behavior);

    /**
     * @function MAAudibleMediaCopyPreferredCharacteristics
     * @abstract User preference for audible media characteristic
     * @result An array containing the preferred order of media characteristics for audible media.
     */
    @Generated
    @CFunction
    public static native CFArrayRef MAAudibleMediaCopyPreferredCharacteristics();

    /**
     * @const kMACaptionAppearanceSettingsChangedNotification
     * @abstract CFNotification sent when any user-defined captioning settings are changed.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMACaptionAppearanceSettingsChangedNotification();

    /**
     * @constant MAMediaCharacteristicDescribesMusicAndSoundForAccessibility
     * @abstract A media characteristic that indicates that a track or media selection option includes legible content in the language of its specified locale that:
     * - describes music and
     * - describes sound other than spoken dialog, such as sound effects and significant silences, occurring in program audio.
     * @discussion
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as with MAMediaCharacteristicTranscribesSpokenDialogForAccessibility.
     * A legible track provided for accessibility purposes that's associated with an audio track without music and without sound other than spoken dialog -- lacking even significant silences -- can be tagged with this characteristic, because it trivially meets these requirements.
     */
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesMusicAndSoundForAccessibility();

    /**
     * @constant MAMediaCharacteristicTranscribesSpokenDialogForAccessibility
     * @abstract A media characteristic that indicates that a track or media selection option includes legible content in the language of its specified locale that:
     * - transcribes spoken dialog and
     * - identifies speakers whenever other visual cues are insufficient for a viewer to determine who is speaking.
     * @discussion
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as with MAMediaCharacteristicDescribesMusicAndSoundForAccessibility.
     * A legible track provided for accessibility purposes that's associated with an audio track that has no spoken dialog can be tagged with this characteristic, because it trivially meets these requirements.
     */
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicTranscribesSpokenDialogForAccessibility();

    /**
     * @constant kMAAudibleMediaSettingsChangedNotification
     * @abstract CFNotification sent when any user-defined audible media settings are changed.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kMAAudibleMediaSettingsChangedNotification();

    /**
     * @constant MAMediaCharacteristicDescribesVideoForAccessibility
     * @abstract A media characteristic that indicates that a track or media selection option includes audible content that descries a video for accessibility.
     */
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesVideoForAccessibility();

    /**
     * @function MACaptionAppearanceDidDisplayCaptions
     * @abstract Called by clients to inform accessibility products that captions have been displayed onscreen.
     * @param strings An array of CFStringRef or CFAttributedStringRef objects that represent the text that is being displayed. An empty array is used to indicate that no captions are being displayed.
     */
    @Generated
    @CFunction
    public static native void MACaptionAppearanceDidDisplayCaptions(CFArrayRef strings);

    /**
     * @function MAImageCaptioningCopyCaption
     * @abstract Returns an accessibility caption from an image's metadata.
     * @param url The URL locating the image on disk.
     * @param error If an error occurs, a description will be provided.
     * @result A string with the image caption. Nil if there's no caption.
     * @discussion A convenience function for retrieving a caption from an image file that aims to describe the photo accurately.
     * This checks for XMP metadata field: Iptc4xmpExt:AOContentDescription.
     */
    @Generated
    @CFunction
    public static native CFStringRef MAImageCaptioningCopyCaption(CFURLRef url, Ptr<CFErrorRef> error);

    /**
     * @function MAImageCaptioningSetCaption
     * @abstract Sets the accessibility caption into an image's metadata.
     * @param url The URL locating the image on disk.
     * @param error If an error occurs, a description will be provided.
     * @param string The accessility caption.
     * @result A bool representing whether the operation was successful.
     * @discussion A convenience function for setting a caption to an image file that aims to describe the photo accurately.
     * This sets the XMP metadata field: Iptc4xmpExt:AOContentDescription.
     */
    @Generated
    @CFunction
    public static native boolean MAImageCaptioningSetCaption(CFURLRef url, CFStringRef string, Ptr<CFErrorRef> error);

    /**
     * @function MAImageCaptioningCopyMetadataTagPath
     * @abstract Returns the metadata tagpath for this key.
     * This tag path can be used to copy metadata directly using CGImageMetadataCopyTagWithPath from the CGImageMetadataRef, for example.
     * @result A string representing the tag path.
     * @discussion This returns the appropriate metadata tag path to be used.
     */
    @Generated
    @CFunction
    public static native CFStringRef MAImageCaptioningCopyMetadataTagPath();
}

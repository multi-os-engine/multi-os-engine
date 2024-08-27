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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * [@group] Language preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@function] MACaptionAppearanceAddSelectedLanguage
     * 
     * Adds a user's selected caption language to stack of languages.
     * 
     * After a language is added it will appear first in the array returned by MACaptionAppearanceCopySelectedLanguages.
     * Applications should call this anytime a user selects a specific languages for captioning tracks.
     * 
     * For example, an AVFoundation clients may execute the following code in response to a user selecting a captioning
     * track:
     * <code>
     * // in response to a user selection (from a pop-up menu or any other UI affordance), make the selection effective
     * -[AVPlayerItem selectMediaOption:legibleOption inMediaSelectionGroup:legibleGroup];
     * 
     * // now update system-wide captioning preferences by registering the language of the option selected by the user
     * MACaptionAppearanceAddSelectedLanguage(kMACaptionAppearanceDomainUser, (CFStringRef)[[legibleOption locale]
     * localeIdentifier]);
     * </code>
     * 
     * API-Since: 7.0
     * 
     * @param domain   Preference domain, see @link MACaptionAppearanceDomain @/link
     * @param language Canonical language identifier (see @link CFLocale@/link) of the user's preferred caption
     *                 language.
     * @return <code>true</code> if addition was successful. Unsuccessful additions are most liketly the result of
     *         invalid language codes.
     */
    @Generated
    @CFunction
    public static native boolean MACaptionAppearanceAddSelectedLanguage(@NInt long domain,
            @NotNull CFStringRef language);

    /**
     * [@function] MACaptionAppearanceCopySelectedLanguages
     * 
     * Copies the user's preferred caption languages.
     * 
     * Languages added using MACaptionAppearanceAddSelectedLanguage are normalized, and thus the contents of this array
     * may have slightly different strings than those passed into MACaptionAppearanceAddSelectedLanguage.
     * 
     * API-Since: 7.0
     * 
     * @param domain Preference domain, see @link MACaptionAppearanceDomain @/link.
     * 
     * @return Ordered array of preferred canonical language identifiers.
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopySelectedLanguages(@NInt long domain);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@group] General preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@function] MACaptionAppearanceGetDisplayType
     * 
     * User preference representing what type of captions should be displayed
     * 
     * @param domain Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @return User preference representing what type of captions should be displayed. See @link
     *         MACaptionAppearanceDisplayType @/link.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetDisplayType(@NInt long domain);

    /**
     * [@function] MACaptionAppearanceSetDisplayType
     * 
     * User preference representing what type of captions should be displayed
     * 
     * @param domain      Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param displayType Captions display type, see @link MACaptionAppearanceDisplayType @/link.
     * 
     *                    API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void MACaptionAppearanceSetDisplayType(@NInt long domain, @NInt long displayType);

    /**
     * [@function] MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics
     * 
     * User preference for captioning media characteristic
     * 
     * @param domain Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @return An array containing the preferred order of media characteristics for captions.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics(@NInt long domain);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@group] Color preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@function] MACaptionAppearanceCopyForegroundColor
     * 
     * User preference for foreground/text color.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for foreground/text color.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyForegroundColor(@NInt long domain,
            @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceCopyBackgroundColor
     * 
     * User preference for background color.
     * 
     * The background color is the color behind each caption glyph.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for background color.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyBackgroundColor(@NInt long domain,
            @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceCopyWindowColor
     * 
     * User preference for window color.
     * 
     * The window color is the color of a box behind all of the caption glyphs.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for window color.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyWindowColor(@NInt long domain, @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceGetForegroundOpacity
     * 
     * User preference for foreground opacity.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for foreground opacity.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetForegroundOpacity(@NInt long domain, @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceGetBackgroundOpacity
     * 
     * User preference for background opacity.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for background opacity.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetBackgroundOpacity(@NInt long domain, @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceGetWindowOpacity
     * 
     * User preference for window opacity.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for window opacity.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowOpacity(@NInt long domain, @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceGetWindowRoundedCornerRadius
     * 
     * User preference for caption-window corner radius.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for caption-window corner radius.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowRoundedCornerRadius(@NInt long domain,
            @Nullable NIntPtr behavior);

    /**
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@group] Text preferences
     * ——————————————————————————————————————————————————————————————————————————————————————
     * [@function] MACaptionAppearanceCopyFontForStyle
     * 
     * User font preference for the specified style.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @param fontStyle Font style, see @link MACaptionAppearanceFontStyle @/link.
     * @return User font preference for the specified style.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CTFontDescriptorRef MACaptionAppearanceCopyFontDescriptorForStyle(@NInt long domain,
            @Nullable NIntPtr behavior, @NInt long fontStyle);

    /**
     * [@function] MACaptionAppearanceGetRelativeCharacterSize
     * 
     * User preference for font scaling.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User font scaling preference for the specified style.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetRelativeCharacterSize(@NInt long domain,
            @Nullable NIntPtr behavior);

    /**
     * [@function] MACaptionAppearanceGetTextEdgeStyle
     * 
     * User preference for text edge style.
     * 
     * @param domain    Preference domain, see @link MACaptionAppearanceDomain @/link.
     * @param *behavior (see @link MACaptionAppearanceBehavior @/link)
     * @return User preference for text edge style.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetTextEdgeStyle(@NInt long domain, @Nullable NIntPtr behavior);

    /**
     * [@function] MAAudibleMediaCopyPreferredCharacteristics
     * 
     * User preference for audible media characteristic
     * 
     * @return An array containing the preferred order of media characteristics for audible media.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFArrayRef MAAudibleMediaCopyPreferredCharacteristics();

    /**
     * [@const] kMACaptionAppearanceSettingsChangedNotification
     * 
     * CFNotification sent when any user-defined captioning settings are changed.
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kMACaptionAppearanceSettingsChangedNotification();

    /**
     * [@constant] MAMediaCharacteristicDescribesMusicAndSoundForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the
     * language of its specified locale that:
     * - describes music and
     * - describes sound other than spoken dialog, such as sound effects and significant silences, occurring in program
     * audio.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as
     * with MAMediaCharacteristicTranscribesSpokenDialogForAccessibility.
     * A legible track provided for accessibility purposes that's associated with an audio track without music and
     * without sound other than spoken dialog -- lacking even significant silences -- can be tagged with this
     * characteristic, because it trivially meets these requirements.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesMusicAndSoundForAccessibility();

    /**
     * [@constant] MAMediaCharacteristicTranscribesSpokenDialogForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes legible content in the
     * language of its specified locale that:
     * - transcribes spoken dialog and
     * - identifies speakers whenever other visual cues are insufficient for a viewer to determine who is speaking.
     * 
     * Legible tracks provided for accessibility purposes are typically tagged both with this characteristic as well as
     * with MAMediaCharacteristicDescribesMusicAndSoundForAccessibility.
     * A legible track provided for accessibility purposes that's associated with an audio track that has no spoken
     * dialog can be tagged with this characteristic, because it trivially meets these requirements.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicTranscribesSpokenDialogForAccessibility();

    /**
     * [@constant] kMAAudibleMediaSettingsChangedNotification
     * 
     * CFNotification sent when any user-defined audible media settings are changed.
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kMAAudibleMediaSettingsChangedNotification();

    /**
     * [@constant] MAMediaCharacteristicDescribesVideoForAccessibility
     * 
     * A media characteristic that indicates that a track or media selection option includes audible content that
     * descries a video for accessibility.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesVideoForAccessibility();

    /**
     * [@function] MACaptionAppearanceDidDisplayCaptions
     * 
     * Called by clients to inform accessibility products that captions have been displayed onscreen.
     * 
     * @param strings An array of CFStringRef or CFAttributedStringRef objects that represent the text that is being
     *                displayed. An empty array is used to indicate that no captions are being displayed.
     */
    @Generated
    @CFunction
    public static native void MACaptionAppearanceDidDisplayCaptions(@NotNull CFArrayRef strings);

    /**
     * [@function] MAImageCaptioningCopyCaption
     * 
     * Returns an accessibility caption from an image's metadata.
     * 
     * A convenience function for retrieving a caption from an image file that aims to describe the photo accurately.
     * This checks for XMP metadata field: Iptc4xmpExt:AOContentDescription.
     * 
     * API-Since: 13.0
     * 
     * @param url   The URL locating the image on disk.
     * @param error If an error occurs, a description will be provided.
     * @return A string with the image caption. Nil if there's no caption.
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef MAImageCaptioningCopyCaption(@NotNull CFURLRef url,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * [@function] MAImageCaptioningSetCaption
     * 
     * Sets the accessibility caption into an image's metadata.
     * 
     * A convenience function for setting a caption to an image file that aims to describe the photo accurately.
     * This sets the XMP metadata field: Iptc4xmpExt:AOContentDescription.
     * 
     * API-Since: 13.0
     * 
     * @param url    The URL locating the image on disk.
     * @param error  If an error occurs, a description will be provided.
     * @param string The accessility caption.
     * @return A bool representing whether the operation was successful.
     */
    @Generated
    @CFunction
    public static native boolean MAImageCaptioningSetCaption(@NotNull CFURLRef url, @Nullable CFStringRef string,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * [@function] MAImageCaptioningCopyMetadataTagPath
     * 
     * Returns the metadata tagpath for this key.
     * This tag path can be used to copy metadata directly using CGImageMetadataCopyTagWithPath from the
     * CGImageMetadataRef, for example.
     * 
     * This returns the appropriate metadata tag path to be used.
     * 
     * API-Since: 13.0
     * 
     * @return A string representing the tag path.
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFStringRef MAImageCaptioningCopyMetadataTagPath();

    /**
     * [@function] MADimFlashingLightsEnabled
     * 
     * Returns whether the user has enabled the setting to reduce flashing or strobing lights in video content. This
     * setting can also be used to determine if UI in playback controls should be shown.
     * 
     * @return A boolean
     * 
     *         API-Since: 16.4
     */
    @Generated
    @CFunction
    public static native boolean MADimFlashingLightsEnabled();

    /**
     * [@constant] kMADimFlashingLightsChangedNotification
     * 
     * CFNotification sent to local notification center when mitigation for flashing or strobing lights settings are
     * changed.
     * 
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kMADimFlashingLightsChangedNotification();
}

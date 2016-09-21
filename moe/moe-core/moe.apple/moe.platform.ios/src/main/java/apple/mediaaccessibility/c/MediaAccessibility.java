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
import apple.corefoundation.opaque.CFStringRef;
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

    @Generated
    @CFunction
    public static native boolean MACaptionAppearanceAddSelectedLanguage(@NInt long domain, CFStringRef language);

    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopySelectedLanguages(@NInt long domain);

    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetDisplayType(@NInt long domain);

    @Generated
    @CFunction
    public static native void MACaptionAppearanceSetDisplayType(@NInt long domain, @NInt long displayType);

    @Generated
    @CFunction
    public static native CFArrayRef MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics(@NInt long domain);

    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyForegroundColor(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyBackgroundColor(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    public static native CGColorRef MACaptionAppearanceCopyWindowColor(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetForegroundOpacity(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetBackgroundOpacity(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowOpacity(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetWindowRoundedCornerRadius(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef MACaptionAppearanceCopyFontDescriptorForStyle(@NInt long domain,
            NIntPtr behavior, @NInt long fontStyle);

    @Generated
    @CFunction
    @NFloat
    public static native double MACaptionAppearanceGetRelativeCharacterSize(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    @NInt
    public static native long MACaptionAppearanceGetTextEdgeStyle(@NInt long domain, NIntPtr behavior);

    @Generated
    @CFunction
    public static native CFArrayRef MAAudibleMediaCopyPreferredCharacteristics();

    @Generated
    @CVariable()
    public static native CFStringRef kMACaptionAppearanceSettingsChangedNotification();

    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesMusicAndSoundForAccessibility();

    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicTranscribesSpokenDialogForAccessibility();

    @Generated
    @CVariable()
    public static native CFStringRef kMAAudibleMediaSettingsChangedNotification();

    @Generated
    @CVariable()
    public static native CFStringRef MAMediaCharacteristicDescribesVideoForAccessibility();
}

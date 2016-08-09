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

package ios.mediaaccessibility.c;


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

import ios.corefoundation.opaque.CFArrayRef;
import ios.corefoundation.opaque.CFStringRef;
import ios.coregraphics.opaque.CGColorRef;
import ios.coretext.opaque.CTFontDescriptorRef;

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
	 * MACaptionAppearanceAddSelectedLanguage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceAddSelectedLanguage">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean MACaptionAppearanceAddSelectedLanguage(
			@NInt long domain, CFStringRef language);

	/**
	 * MACaptionAppearanceCopySelectedLanguages</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopySelectedLanguages">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef MACaptionAppearanceCopySelectedLanguages(
			@NInt long domain);

	/**
	 * MACaptionAppearanceGetDisplayType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetDisplayType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long MACaptionAppearanceGetDisplayType(
			@NInt long domain);

	/**
	 * MACaptionAppearanceSetDisplayType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceSetDisplayType">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void MACaptionAppearanceSetDisplayType(
			@NInt long domain, @NInt long displayType);

	/**
	 * MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CFArrayRef MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics(
			@NInt long domain);

	/**
	 * MACaptionAppearanceCopyForegroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopyForegroundColor">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CGColorRef MACaptionAppearanceCopyForegroundColor(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceCopyBackgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopyBackgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CGColorRef MACaptionAppearanceCopyBackgroundColor(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceCopyWindowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopyWindowColor">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CGColorRef MACaptionAppearanceCopyWindowColor(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceGetForegroundOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetForegroundOpacity">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NFloat
	public static native double MACaptionAppearanceGetForegroundOpacity(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceGetBackgroundOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetBackgroundOpacity">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NFloat
	public static native double MACaptionAppearanceGetBackgroundOpacity(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceGetWindowOpacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetWindowOpacity">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NFloat
	public static native double MACaptionAppearanceGetWindowOpacity(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceGetWindowRoundedCornerRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetWindowRoundedCornerRadius">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NFloat
	public static native double MACaptionAppearanceGetWindowRoundedCornerRadius(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceCopyFontDescriptorForStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceCopyFontDescriptorForStyle">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CTFontDescriptorRef MACaptionAppearanceCopyFontDescriptorForStyle(
			@NInt long domain, NIntPtr behavior, @NInt long fontStyle);

	/**
	 * MACaptionAppearanceGetRelativeCharacterSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetRelativeCharacterSize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NFloat
	public static native double MACaptionAppearanceGetRelativeCharacterSize(
			@NInt long domain, NIntPtr behavior);

	/**
	 * MACaptionAppearanceGetTextEdgeStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaAccessibility/Reference/MediaAccessibilityFunctionReference/index.html#//apple_ref/c/func/MACaptionAppearanceGetTextEdgeStyle">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long MACaptionAppearanceGetTextEdgeStyle(
			@NInt long domain, NIntPtr behavior);

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

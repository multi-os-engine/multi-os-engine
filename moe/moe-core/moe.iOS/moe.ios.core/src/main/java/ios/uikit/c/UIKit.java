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

package ios.uikit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

import ios.coregraphics.opaque.CGContextRef;
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.coregraphics.struct.CGVector;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSMutableData;
import ios.foundation.NSURL;
import ios.uikit.UIBezierPath;
import ios.uikit.UIImage;
import ios.uikit.UIView;
import ios.uikit.struct.UIEdgeInsets;
import ios.uikit.struct.UIFloatRange;
import ios.uikit.struct.UIOffset;

@Generated
@Library("UIKit")
@Runtime(CRuntime.class)
public final class UIKit {
	static {
		NatJ.register();
	}

	@Generated
	private UIKit() {
	}

	/**
	 * UIDeviceOrientationIsPortrait</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIDeviceOrientationIsPortrait">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIDeviceOrientationIsPortrait(
			@NInt long orientation);

	/**
	 * UIDeviceOrientationIsLandscape</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIDeviceOrientationIsLandscape">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIDeviceOrientationIsLandscape(
			@NInt long orientation);

	/**
	 * UI_USER_INTERFACE_IDIOM</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UI_USER_INTERFACE_IDIOM">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@NInt
	public static native long UI_USER_INTERFACE_IDIOM();

	/**
	 * UIEdgeInsetsMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIEdgeInsetsMake">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native UIEdgeInsets UIEdgeInsetsMake(@NFloat double top,
			@NFloat double left, @NFloat double bottom, @NFloat double right);

	/**
	 * UIEdgeInsetsInsetRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIEdgeInsetsInsetRect">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGRect UIEdgeInsetsInsetRect(@ByValue CGRect rect,
			@ByValue UIEdgeInsets insets);

	/**
	 * UIOffsetMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIOffsetMake">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native UIOffset UIOffsetMake(@NFloat double horizontal,
			@NFloat double vertical);

	/**
	 * UIEdgeInsetsEqualToEdgeInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIEdgeInsetsEqualToEdgeInsets">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIEdgeInsetsEqualToEdgeInsets(
			@ByValue UIEdgeInsets insets1, @ByValue UIEdgeInsets insets2);

	/**
	 * UIOffsetEqualToOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIOffsetEqualToOffset">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIOffsetEqualToOffset(
			@ByValue UIOffset offset1, @ByValue UIOffset offset2);

	/**
	 * NSStringFromCGPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromCGPoint">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromCGPoint(@ByValue CGPoint point);

	/**
	 * NSStringFromCGVector</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromCGVector">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromCGVector(@ByValue CGVector vector);

	/**
	 * NSStringFromCGSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromCGSize">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromCGSize(@ByValue CGSize size);

	/**
	 * NSStringFromCGRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromCGRect">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromCGRect(@ByValue CGRect rect);

	/**
	 * NSStringFromCGAffineTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromCGAffineTransform">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromCGAffineTransform(
			@ByValue CGAffineTransform transform);

	/**
	 * NSStringFromUIEdgeInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromUIEdgeInsets">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromUIEdgeInsets(
			@ByValue UIEdgeInsets insets);

	/**
	 * NSStringFromUIOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSStringFromUIOffset">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromUIOffset(@ByValue UIOffset offset);

	/**
	 * CGPointFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/CGPointFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGPointFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * CGVectorFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/CGVectorFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGVector CGVectorFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * CGSizeFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/CGSizeFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGSizeFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * CGRectFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/CGRectFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * CGAffineTransformFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/CGAffineTransformFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * UIEdgeInsetsFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIEdgeInsetsFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native UIEdgeInsets UIEdgeInsetsFromString(
			@Mapped(ObjCStringMapper.class) String string);

	/**
	 * UIOffsetFromString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIOffsetFromString">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native UIOffset UIOffsetFromString(
			@Mapped(ObjCStringMapper.class) String string);

	@Generated
	@Variadic()
	@CFunction
	public static native NSDictionary<?, ?> _NSDictionaryOfVariableBindings(
			@Mapped(ObjCStringMapper.class) String commaSeparatedKeysString,
			@Mapped(ObjCObjectMapper.class) Object firstValue,
			Object... varargs);

	/**
	 * NSTextAlignmentToCTTextAlignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSTextAlignmentToCTTextAlignment">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native byte NSTextAlignmentToCTTextAlignment(
			@NInt long nsTextAlignment);

	/**
	 * NSTextAlignmentFromCTTextAlignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/NSTextAlignmentFromCTTextAlignment">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long NSTextAlignmentFromCTTextAlignment(
			byte ctTextAlignment);

	/**
	 * UIInterfaceOrientationIsPortrait</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIInterfaceOrientationIsPortrait">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIInterfaceOrientationIsPortrait(
			@NInt long orientation);

	/**
	 * UIInterfaceOrientationIsLandscape</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIInterfaceOrientationIsLandscape">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	public static native boolean UIInterfaceOrientationIsLandscape(
			@NInt long orientation);

	/**
	 * UIApplicationMain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIApplicationMain">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native int UIApplicationMain(int argc, Ptr<BytePtr> argv,
			@Mapped(ObjCStringMapper.class) String principalClassName,
			@Mapped(ObjCStringMapper.class) String delegateClassName);

	/**
	 * UIImagePNGRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIImagePNGRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native NSData UIImagePNGRepresentation(UIImage image);

	/**
	 * UIImageJPEGRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIImageJPEGRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native NSData UIImageJPEGRepresentation(UIImage image,
			@NFloat double compressionQuality);

	/**
	 * UIAccessibilityZoomFocusChanged</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityZoomFocusChanged">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIAccessibilityZoomFocusChanged(@NInt long type,
			@ByValue CGRect frame, UIView view);

	/**
	 * UIAccessibilityRegisterGestureConflictWithZoom</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityRegisterGestureConflictWithZoom">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIAccessibilityRegisterGestureConflictWithZoom();

	/**
	 * UIGuidedAccessRestrictionStateForIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGuidedAccessRestrictionStateForIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@NInt
	public static native long UIGuidedAccessRestrictionStateForIdentifier(
			@Mapped(ObjCStringMapper.class) String restrictionIdentifier);

	/**
	 * UIAccessibilityConvertFrameToScreenCoordinates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityConvertFrameToScreenCoordinates">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGRect UIAccessibilityConvertFrameToScreenCoordinates(
			@ByValue CGRect rect, UIView view);

	/**
	 * UIAccessibilityConvertPathToScreenCoordinates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityConvertPathToScreenCoordinates">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native UIBezierPath UIAccessibilityConvertPathToScreenCoordinates(
			UIBezierPath path, UIView view);

	/**
	 * UIAccessibilityPostNotification</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityPostNotification">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIAccessibilityPostNotification(int notification,
			@Mapped(ObjCObjectMapper.class) Object argument);

	/**
	 * UIAccessibilityIsVoiceOverRunning</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsVoiceOverRunning">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsVoiceOverRunning();

	/**
	 * UIAccessibilityIsMonoAudioEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsMonoAudioEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsMonoAudioEnabled();

	/**
	 * UIAccessibilityIsClosedCaptioningEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsClosedCaptioningEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsClosedCaptioningEnabled();

	/**
	 * UIAccessibilityIsInvertColorsEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsInvertColorsEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsInvertColorsEnabled();

	/**
	 * UIAccessibilityIsGuidedAccessEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsGuidedAccessEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsGuidedAccessEnabled();

	/**
	 * UIAccessibilityIsBoldTextEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsBoldTextEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsBoldTextEnabled();

	/**
	 * UIAccessibilityIsGrayscaleEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsGrayscaleEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsGrayscaleEnabled();

	/**
	 * UIAccessibilityIsReduceTransparencyEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsReduceTransparencyEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsReduceTransparencyEnabled();

	/**
	 * UIAccessibilityIsReduceMotionEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsReduceMotionEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsReduceMotionEnabled();

	/**
	 * UIAccessibilityDarkerSystemColorsEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityDarkerSystemColorsEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityDarkerSystemColorsEnabled();

	/**
	 * UIAccessibilityIsSwitchControlRunning</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsSwitchControlRunning">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsSwitchControlRunning();

	/**
	 * UIAccessibilityIsSpeakSelectionEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsSpeakSelectionEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsSpeakSelectionEnabled();

	/**
	 * UIAccessibilityIsSpeakScreenEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityIsSpeakScreenEnabled">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsSpeakScreenEnabled();

	/**
	 * UIAccessibilityRequestGuidedAccessSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIAccessibilityRequestGuidedAccessSession">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIAccessibilityRequestGuidedAccessSession(
			boolean enable,
			@ObjCBlock(name = "call_UIAccessibilityRequestGuidedAccessSession") Block_UIAccessibilityRequestGuidedAccessSession completionHandler);

	@Runtime(CRuntime.class)
	@Generated
	public interface Block_UIAccessibilityRequestGuidedAccessSession {
		@Generated
		void call_UIAccessibilityRequestGuidedAccessSession(boolean arg0);
	}

	/**
	 * UIGraphicsGetCurrentContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsGetCurrentContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native CGContextRef UIGraphicsGetCurrentContext();

	/**
	 * UIGraphicsPushContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsPushContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsPushContext(CGContextRef context);

	/**
	 * UIGraphicsPopContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsPopContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsPopContext();

	/**
	 * UIRectFillUsingBlendMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIRectFillUsingBlendMode">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIRectFillUsingBlendMode(@ByValue CGRect rect,
			int blendMode);

	/**
	 * UIRectFill</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIRectFill">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIRectFill(@ByValue CGRect rect);

	/**
	 * UIRectFrameUsingBlendMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIRectFrameUsingBlendMode">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIRectFrameUsingBlendMode(@ByValue CGRect rect,
			int blendMode);

	/**
	 * UIRectFrame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIRectFrame">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIRectFrame(@ByValue CGRect rect);

	/**
	 * UIRectClip</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIRectClip">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIRectClip(@ByValue CGRect rect);

	/**
	 * UIGraphicsBeginImageContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginImageContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsBeginImageContext(@ByValue CGSize size);

	/**
	 * UIGraphicsBeginImageContextWithOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginImageContextWithOptions">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsBeginImageContextWithOptions(
			@ByValue CGSize size, boolean opaque, @NFloat double scale);

	/**
	 * UIGraphicsGetImageFromCurrentImageContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsGetImageFromCurrentImageContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native UIImage UIGraphicsGetImageFromCurrentImageContext();

	/**
	 * UIGraphicsEndImageContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsEndImageContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsEndImageContext();

	/**
	 * UIGraphicsBeginPDFContextToFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginPDFContextToFile">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIGraphicsBeginPDFContextToFile(
			@Mapped(ObjCStringMapper.class) String path,
			@ByValue CGRect bounds, NSDictionary<?, ?> documentInfo);

	/**
	 * UIGraphicsBeginPDFContextToData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginPDFContextToData">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsBeginPDFContextToData(
			NSMutableData data, @ByValue CGRect bounds,
			NSDictionary<?, ?> documentInfo);

	/**
	 * UIGraphicsEndPDFContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsEndPDFContext">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsEndPDFContext();

	/**
	 * UIGraphicsBeginPDFPage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginPDFPage">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsBeginPDFPage();

	/**
	 * UIGraphicsBeginPDFPageWithInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsBeginPDFPageWithInfo">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsBeginPDFPageWithInfo(
			@ByValue CGRect bounds, NSDictionary<?, ?> pageInfo);

	/**
	 * UIGraphicsGetPDFContextBounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsGetPDFContextBounds">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	@ByValue
	public static native CGRect UIGraphicsGetPDFContextBounds();

	/**
	 * UIGraphicsSetPDFContextURLForRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsSetPDFContextURLForRect">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsSetPDFContextURLForRect(NSURL url,
			@ByValue CGRect rect);

	/**
	 * UIGraphicsAddPDFContextDestinationAtPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsAddPDFContextDestinationAtPoint">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsAddPDFContextDestinationAtPoint(
			@Mapped(ObjCStringMapper.class) String name, @ByValue CGPoint point);

	/**
	 * UIGraphicsSetPDFContextDestinationForRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIGraphicsSetPDFContextDestinationForRect">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIGraphicsSetPDFContextDestinationForRect(
			@Mapped(ObjCStringMapper.class) String name, @ByValue CGRect rect);

	/**
	 * UIImageWriteToSavedPhotosAlbum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIImageWriteToSavedPhotosAlbum">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UIImageWriteToSavedPhotosAlbum(UIImage image,
			@Mapped(ObjCObjectMapper.class) Object completionTarget,
			SEL completionSelector, VoidPtr contextInfo);

	/**
	 * UIVideoAtPathIsCompatibleWithSavedPhotosAlbum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIVideoAtPathIsCompatibleWithSavedPhotosAlbum">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIVideoAtPathIsCompatibleWithSavedPhotosAlbum(
			@Mapped(ObjCStringMapper.class) String videoPath);

	/**
	 * UISaveVideoAtPathToSavedPhotosAlbum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UISaveVideoAtPathToSavedPhotosAlbum">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native void UISaveVideoAtPathToSavedPhotosAlbum(
			@Mapped(ObjCStringMapper.class) String videoPath,
			@Mapped(ObjCObjectMapper.class) Object completionTarget,
			SEL completionSelector, VoidPtr contextInfo);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyInputUpArrow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyInputDownArrow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyInputLeftArrow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyInputRightArrow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyInputEscape();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorFamilyAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorNameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorFaceAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorSizeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorVisibleNameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorMatrixAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorCharacterSetAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorCascadeListAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorTraitsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorFixedAdvanceAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorFeatureSettingsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontDescriptorTextStyleAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontSymbolicTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontWeightTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontWidthTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontSlantTrait();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightUltraLight();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightThin();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightLight();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightRegular();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightMedium();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightSemibold();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightBold();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightHeavy();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIFontWeightBlack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontFeatureTypeIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontFeatureSelectorIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleHeadline();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleBody();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleSubheadline();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleFootnote();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleCaption1();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleCaption2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIDeviceOrientationDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIDeviceBatteryStateDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIDeviceBatteryLevelDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIDeviceProximityStateDidChangeNotification();

	@Generated
	@CVariable()
	@ByValue
	public static native UIEdgeInsets UIEdgeInsetsZero();

	@Generated
	@CVariable()
	@ByValue
	public static native UIOffset UIOffsetZero();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIViewNoIntrinsicMetric();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize UILayoutFittingCompressedSize();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize UILayoutFittingExpandedSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTabColumnTerminatorsAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextAttributeFont();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextAttributeTextColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextAttributeTextShadowColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextAttributeTextShadowOffset();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextInputTextBackgroundColorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextInputTextColorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextInputTextFontKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextInputCurrentInputModeDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextFieldTextDidBeginEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextFieldTextDidEndEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextFieldTextDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationInvalidInterfaceOrientationException();

	@Generated
	@CVariable()
	@NUInt
	public static native long UIBackgroundTaskInvalid();

	@Generated
	@CVariable()
	public static native double UIMinimumKeepAliveTimeout();

	@Generated
	@CVariable()
	public static native double UIApplicationBackgroundFetchIntervalMinimum();

	@Generated
	@CVariable()
	public static native double UIApplicationBackgroundFetchIntervalNever();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITrackingRunLoopMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidEnterBackgroundNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationWillEnterForegroundNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidFinishLaunchingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidBecomeActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationWillResignActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidReceiveMemoryWarningNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationWillTerminateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationSignificantTimeChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationWillChangeStatusBarOrientationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidChangeStatusBarOrientationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStatusBarOrientationUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationWillChangeStatusBarFrameNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationDidChangeStatusBarFrameNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStatusBarFrameUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationBackgroundRefreshStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsSourceApplicationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsRemoteNotificationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsLocalNotificationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsAnnotationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationProtectedDataWillBecomeUnavailable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationProtectedDataDidBecomeAvailable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsLocationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsNewsstandDownloadsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsBluetoothCentralsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsBluetoothPeripheralsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsUserActivityDictionaryKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsUserActivityTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationOpenSettingsURLString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryExtraSmall();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategorySmall();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryMedium();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryExtraExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryExtraExtraExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryAccessibilityMedium();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryAccessibilityLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryAccessibilityExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryAccessibilityExtraExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryAccessibilityExtraExtraExtraLarge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIContentSizeCategoryNewValueKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationUserDidTakeScreenshotNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationKeyboardExtensionPointIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIStateRestorationViewControllerStoryboardKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStateRestorationBundleVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStateRestorationUserInterfaceIdiomKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStateRestorationTimestampKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationStateRestorationSystemVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIViewControllerShowDetailTargetDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIViewControllerHierarchyInconsistencyException();

	@Generated
	@CVariable()
	@NFloat
	public static native double UINavigationControllerHideShowBarDuration();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIScrollViewDecelerationRateNormal();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIScrollViewDecelerationRateFast();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITableViewIndexSearch();

	@Generated
	@CVariable()
	@NFloat
	public static native double UITableViewAutomaticDimension();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITableViewSelectionDidChangeNotification();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitNone();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitButton();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitLink();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitHeader();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitSearchField();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitImage();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitSelected();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitPlaysSound();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitKeyboardKey();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitStaticText();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitSummaryElement();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitNotEnabled();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitUpdatesFrequently();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitStartsMediaSession();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitAdjustable();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitAllowsDirectInteraction();

	@Generated
	@CVariable()
	public static native long UIAccessibilityTraitCausesPageTurn();

	@Generated
	@CVariable()
	public static native int UIAccessibilityScreenChangedNotification();

	@Generated
	@CVariable()
	public static native int UIAccessibilityLayoutChangedNotification();

	@Generated
	@CVariable()
	public static native int UIAccessibilityAnnouncementNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityAnnouncementDidFinishNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityAnnouncementKeyStringValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityAnnouncementKeyWasSuccessful();

	@Generated
	@CVariable()
	public static native int UIAccessibilityPageScrolledNotification();

	@Generated
	@CVariable()
	public static native int UIAccessibilityPauseAssistiveTechnologyNotification();

	@Generated
	@CVariable()
	public static native int UIAccessibilityResumeAssistiveTechnologyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityNotificationSwitchControlIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySpeechAttributePunctuation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySpeechAttributeLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySpeechAttributePitch();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityVoiceOverStatusChanged();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityMonoAudioStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityClosedCaptioningStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityInvertColorsStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityGuidedAccessStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityBoldTextStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityGrayscaleStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityReduceTransparencyStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityReduceMotionStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityDarkerSystemColorsStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySwitchControlStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySpeakSelectionStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilitySpeakScreenStatusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToFacebook();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToTwitter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToWeibo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeMessage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeMail();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePrint();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeCopyToPasteboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeAssignToContact();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeSaveToCameraRoll();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeAddToReadingList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToFlickr();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToVimeo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypePostToTencentWeibo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeAirDrop();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UICollectionElementKindSectionHeader();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UICollectionElementKindSectionFooter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIDocumentStateChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUserActivityDocumentURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerMediaType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerOriginalImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerEditedImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerCropRect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerMediaURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerReferenceURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerMediaMetadata();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UILocalNotificationDefaultSoundName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIMenuControllerWillShowMenuNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIMenuControllerDidShowMenuNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIMenuControllerWillHideMenuNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIMenuControllerDidHideMenuNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIMenuControllerMenuFrameDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UINibExternalObjects();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UINibProxiedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPageViewControllerOptionSpineLocationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPageViewControllerOptionInterPageSpacingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardNameGeneral();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardNameFind();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardChangedTypesAddedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardChangedTypesRemovedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPasteboardRemovedNotification();

	@Generated
	@CVariable()
	public static native NSArray<String> UIPasteboardTypeListString();

	@Generated
	@CVariable()
	public static native NSArray<String> UIPasteboardTypeListURL();

	@Generated
	@CVariable()
	public static native NSArray<String> UIPasteboardTypeListImage();

	@Generated
	@CVariable()
	public static native NSArray<String> UIPasteboardTypeListColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIPrintErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIScreenDidConnectNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIScreenDidDisconnectNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIScreenModeDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIScreenBrightnessDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITransitionContextFromViewControllerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITransitionContextToViewControllerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITransitionContextFromViewKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITransitionContextToViewKey();

	@Generated
	@CVariable()
	@NFloat
	public static native double UISplitViewControllerAutomaticDimension();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextViewTextDidBeginEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextViewTextDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UITextViewTextDidEndEditingNotification();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIWindowLevelNormal();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIWindowLevelAlert();

	@Generated
	@CVariable()
	@NFloat
	public static native double UIWindowLevelStatusBar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIWindowDidBecomeVisibleNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIWindowDidBecomeHiddenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIWindowDidBecomeKeyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIWindowDidResignKeyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardWillShowNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardDidShowNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardWillHideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardDidHideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardFrameBeginUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardFrameEndUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardAnimationDurationUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardAnimationCurveUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardWillChangeFrameNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardDidChangeFrameNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardCenterBeginUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardCenterEndUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardBoundsUserInfoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSParagraphStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSForegroundColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackgroundColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLigatureAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKernAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrikethroughStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnderlineStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrokeColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrokeWidthAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShadowAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextEffectAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAttachmentAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinkAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBaselineOffsetAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnderlineColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrikethroughColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObliquenessAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSExpansionAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWritingDirectionAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVerticalGlyphFormAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextEffectLetterpressStyle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPlainTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFDTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTMLTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionOrientation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionRange();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDocumentTypeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCharacterEncodingDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefaultAttributesDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPaperSizeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPaperMarginDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewSizeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewZoomDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewModeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSReadOnlyDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackgroundColorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHyphenationFactorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefaultTabIntervalDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextStorageWillProcessEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextStorageDidProcessEditingNotification();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object UIAccessibilityFocusedElement(
			@Mapped(ObjCStringMapper.class) String assistiveTechnologyIdentifier);

	@Generated
	@CFunction
	public static native boolean UIAccessibilityIsShakeToUndoEnabled();

	/**
	 * UIFloatRangeIsInfinite</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIFloatRangeIsInfinite">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIFloatRangeIsInfinite(@ByValue UIFloatRange range);

	/**
	 * UIFloatRangeIsEqualToRange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIFloatRangeIsEqualToRange">iOS Dev Center</a>
	 */
	@Generated
	@CFunction
	public static native boolean UIFloatRangeIsEqualToRange(@ByValue UIFloatRange range,
			@ByValue UIFloatRange otherRange);

	/**
	 * UIFloatRangeMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKitFunctionReference/index.html#//apple_ref/c/func/UIFloatRangeMake">iOS Dev Center</a>
	 */
	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native UIFloatRange UIFloatRangeMake(@NFloat double minimum, @NFloat double maximum);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleTitle1();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleTitle2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleTitle3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIFontTextStyleCallout();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationOpenURLOptionsSourceApplicationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationOpenURLOptionsAnnotationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationOpenURLOptionsOpenInPlaceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityElementFocusedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityFocusedElementKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityUnfocusedElementKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityAssistiveTechnologyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityNotificationVoiceOverIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIAccessibilityShakeToUndoDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIActivityTypeOpenInIBooks();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIUserNotificationTextInputActionButtonTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIUserNotificationActionResponseTypedTextKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIKeyboardIsLocalUserInfoKey();

	@Generated
	@CVariable()
	@ByValue
	public static native UIFloatRange UIFloatRangeZero();

	@Generated
	@CVariable()
	@ByValue
	public static native UIFloatRange UIFloatRangeInfinite();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIApplicationLaunchOptionsShortcutItemKey();

	@Generated
	public static final float UILayoutPriorityRequired = (float) 0x447A0000;
	@Generated
	public static final float UILayoutPriorityDefaultHigh = (float) 0x443B8000;
	@Generated
	public static final float UILayoutPriorityDefaultLow = (float) 0x437A0000;
	@Generated
	public static final float UILayoutPriorityFittingSizeLevel = (float) 0x42480000;
	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String UIImagePickerControllerLivePhoto();
}

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

package apple.uikit.c;

import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMutableData;
import apple.foundation.NSURL;
import apple.uikit.UIBezierPath;
import apple.uikit.UICellAccessory;
import apple.uikit.UIImage;
import apple.uikit.UIView;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import apple.uikit.struct.UIEdgeInsets;
import apple.uikit.struct.UIFloatRange;
import apple.uikit.struct.UIOffset;
import apple.uikit.struct.UIPointerAccessoryPosition;
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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("UIKit")
@Runtime(CRuntime.class)
public final class UIKit {
    /**
     * A required constraint.  Do not exceed this.
     */
    @Generated public static final float UILayoutPriorityRequired = (float)1000.0;
    /**
     * This is the priority level with which a button resists compressing its content.
     */
    @Generated public static final float UILayoutPriorityDefaultHigh = (float)750.0;
    /**
     * This is the priority level at which a button hugs its contents horizontally.
     */
    @Generated public static final float UILayoutPriorityDefaultLow = (float)250.0;
    /**
     * When you send -[UIView systemLayoutSizeFittingSize:], the size fitting most closely to the target size (the argument) is computed.  UILayoutPriorityFittingSizeLevel is the priority level with which the view wants to conform to the target size in that computation.  It's quite low.  It is generally not appropriate to make a constraint at exactly this priority.  You want to be higher or lower.
     */
    @Generated public static final float UILayoutPriorityFittingSizeLevel = (float)50.0;

    static {
        NatJ.register();
    }

    @Generated
    private UIKit() {
    }

    @Generated
    @Inline
    @CFunction
    public static native boolean UIDeviceOrientationIsPortrait(@NInt long orientation);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIDeviceOrientationIsLandscape(@NInt long orientation);

    /**
     * The UI_USER_INTERFACE_IDIOM() function is provided for use when deploying to a version of the iOS less than 3.2. If the earliest version of iPhone/iOS that you will be deploying for is 3.2 or greater, you may use -[UIDevice userInterfaceIdiom] directly.
     */
    @Generated
    @Inline
    @CFunction
    @NInt
    public static native long UI_USER_INTERFACE_IDIOM();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native UIEdgeInsets UIEdgeInsetsMake(@NFloat double top, @NFloat double left, @NFloat double bottom,
            @NFloat double right);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGRect UIEdgeInsetsInsetRect(@ByValue CGRect rect, @ByValue UIEdgeInsets insets);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native UIOffset UIOffsetMake(@NFloat double horizontal, @NFloat double vertical);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIEdgeInsetsEqualToEdgeInsets(@ByValue UIEdgeInsets insets1,
            @ByValue UIEdgeInsets insets2);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIOffsetEqualToOffset(@ByValue UIOffset offset1, @ByValue UIOffset offset2);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromCGPoint(@ByValue CGPoint point);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromCGVector(@ByValue CGVector vector);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromCGSize(@ByValue CGSize size);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromCGRect(@ByValue CGRect rect);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromCGAffineTransform(@ByValue CGAffineTransform transform);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromUIEdgeInsets(@ByValue UIEdgeInsets insets);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromUIOffset(@ByValue UIOffset offset);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPointFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native CGVector CGVectorFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGSizeFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native UIEdgeInsets UIEdgeInsetsFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    @ByValue
    public static native UIOffset UIOffsetFromString(@Mapped(ObjCStringMapper.class) String string);

    @Generated
    @Variadic()
    @CFunction
    public static native NSDictionary<String, ?> _NSDictionaryOfVariableBindings(
            @Mapped(ObjCStringMapper.class) String commaSeparatedKeysString,
            @Mapped(ObjCObjectMapper.class) Object firstValue, Object... varargs);

    @Generated
    @CFunction
    public static native byte NSTextAlignmentToCTTextAlignment(@NInt long nsTextAlignment);

    @Generated
    @CFunction
    @NInt
    public static native long NSTextAlignmentFromCTTextAlignment(byte ctTextAlignment);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIInterfaceOrientationIsPortrait(@NInt long orientation);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIInterfaceOrientationIsLandscape(@NInt long orientation);

    /**
     * If nil is specified for principalClassName, the value for NSPrincipalClass from the Info.plist is used. If there is no
     * NSPrincipalClass key specified, the UIApplication class is used. The delegate class will be instantiated using init.
     */
    @Generated
    @CFunction
    public static native int UIApplicationMain(int argc, Ptr<BytePtr> argv,
            @Mapped(ObjCStringMapper.class) String principalClassName,
            @Mapped(ObjCStringMapper.class) String delegateClassName);

    @Generated
    @CFunction
    public static native NSData UIImagePNGRepresentation(UIImage image);

    @Generated
    @CFunction
    public static native NSData UIImageJPEGRepresentation(UIImage image, @NFloat double compressionQuality);

    @Generated
    @CFunction
    public static native void UIAccessibilityZoomFocusChanged(@NInt long type, @ByValue CGRect frame, UIView view);

    /**
     * If your app uses multi-finger gestures that conflict with system Zoom gestures (by using three fingers),
     * calling this method will warn users of the conflict.
     */
    @Generated
    @CFunction
    public static native void UIAccessibilityRegisterGestureConflictWithZoom();

    /**
     * Returns the state of the restriction associated with the identifier.
     */
    @Generated
    @CFunction
    @NInt
    public static native long UIGuidedAccessRestrictionStateForIdentifier(
            @Mapped(ObjCStringMapper.class) String restrictionIdentifier);

    /**
     * The accessibilityFrame is expected to be in screen coordinates.
     * To help convert the frame to screen coordinates, use the following method.
     * The rect should exist in the view space of the UIView argument.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect UIAccessibilityConvertFrameToScreenCoordinates(@ByValue CGRect rect, UIView view);

    /**
     * The accessibilityPath is expected to be in screen coordinates.
     * To help convert the path to screen coordinates, use the following method.
     * The path should exist in the view space of the UIView argument.
     */
    @Generated
    @CFunction
    public static native UIBezierPath UIAccessibilityConvertPathToScreenCoordinates(UIBezierPath path, UIView view);

    /**
     * Returns the element that is currently focused by an assistive technology.
     * default = nil.
     * Pass in a specific identifier (e.g. UIAccessibilityNotificationVoiceOverIdentifier) in order to choose the focused element for a specific product.
     * If no argument is used, the function will returned the element that was most recently focused.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object UIAccessibilityFocusedElement(
            @Mapped(ObjCStringMapper.class) String assistiveTechnologyIdentifier);

    /**
     * UIAccessibilityPostNotification
     * <p>
     * This function posts a notification to assistive applications.
     * Some notifications specify a required or optional argument.
     * Pass nil for the argument if the notification does not specify otherwise.
     * See UIAccessibilityConstants.h for a list of notifications.
     */
    @Generated
    @CFunction
    public static native void UIAccessibilityPostNotification(int notification,
            @Mapped(ObjCObjectMapper.class) Object argument);

    /**
     * Assistive Technology
     * <p>
     * Use UIAccessibilityIsVoiceOverRunning() to determine if VoiceOver is running.
     * Listen for UIAccessibilityVoiceOverStatusDidChangeNotification to know when VoiceOver starts or stops.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsVoiceOverRunning();

    /**
     * Returns whether system audio is mixed down from stereo to mono.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsMonoAudioEnabled();

    /**
     * Returns whether the system preference for closed captioning is enabled.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsClosedCaptioningEnabled();

    /**
     * Returns whether the system preference for invert colors is enabled.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsInvertColorsEnabled();

    /**
     * Returns whether the app is running under Guided Access mode.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsGuidedAccessEnabled();

    /**
     * Returns whether the system preference for bold text is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsBoldTextEnabled();

    /**
     * Returns whether the system preference for grayscale is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsGrayscaleEnabled();

    /**
     * Returns whether the system preference for reduce transparency is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsReduceTransparencyEnabled();

    /**
     * Returns whether the system preference for reduce motion is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsReduceMotionEnabled();

    /**
     * Returns whether the system preference for darker colors is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityDarkerSystemColorsEnabled();

    /**
     * Use UIAccessibilityIsSwitchControlRunning() to determine if Switch Control is running.
     * Listen for UIAccessibilitySwitchControlStatusDidChangeNotification to know when Switch Control starts or stops.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSwitchControlRunning();

    /**
     * Returns whether the system preference for Speak Selection is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSpeakSelectionEnabled();

    /**
     * Returns whether the system preference for Speak Screen is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSpeakScreenEnabled();

    /**
     * Returns whether the system preference for Shake to Undo is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsShakeToUndoEnabled();

    /**
     * Returns whether the system preference for AssistiveTouch is enabled.
     * This always returns false if Guided Access is not enabled.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsAssistiveTouchRunning();

    /**
     * Use UIAccessibilityRequestGuidedAccessSession() to request this app be locked into or released
     * from Single App mode. The request to lock this app into Single App mode will only succeed if the device is Supervised,
     * and the app's bundle identifier has been whitelisted using Mobile Device Management. If you successfully request Single
     * App mode, it is your responsibility to release the device by balancing this call.
     */
    @Generated
    @CFunction
    public static native void UIAccessibilityRequestGuidedAccessSession(boolean enable,
            @ObjCBlock(name = "call_UIAccessibilityRequestGuidedAccessSession") Block_UIAccessibilityRequestGuidedAccessSession completionHandler);

    /**
     * Returns the current pairing status of MFi hearing aids
     */
    @Generated
    @CFunction
    @NUInt
    public static native long UIAccessibilityHearingDevicePairedEar();

    @Generated
    @CFunction
    public static native CGContextRef UIGraphicsGetCurrentContext();

    @Generated
    @CFunction
    public static native void UIGraphicsPushContext(CGContextRef context);

    @Generated
    @CFunction
    public static native void UIGraphicsPopContext();

    @Generated
    @CFunction
    public static native void UIRectFillUsingBlendMode(@ByValue CGRect rect, int blendMode);

    @Generated
    @CFunction
    public static native void UIRectFill(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void UIRectFrameUsingBlendMode(@ByValue CGRect rect, int blendMode);

    @Generated
    @CFunction
    public static native void UIRectFrame(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void UIRectClip(@ByValue CGRect rect);

    /**
     * The following methods will only return a 8-bit per channel context in the DeviceRGB color space.
     * Any new bitmap drawing code is encouraged to use UIGraphicsImageRenderer in lieu of this API.
     */
    @Generated
    @CFunction
    public static native void UIGraphicsBeginImageContext(@ByValue CGSize size);

    @Generated
    @CFunction
    public static native void UIGraphicsBeginImageContextWithOptions(@ByValue CGSize size, boolean opaque,
            @NFloat double scale);

    @Generated
    @CFunction
    public static native UIImage UIGraphicsGetImageFromCurrentImageContext();

    @Generated
    @CFunction
    public static native void UIGraphicsEndImageContext();

    /**
     * PDF context
     */
    @Generated
    @CFunction
    public static native boolean UIGraphicsBeginPDFContextToFile(@Mapped(ObjCStringMapper.class) String path,
            @ByValue CGRect bounds, NSDictionary<?, ?> documentInfo);

    @Generated
    @CFunction
    public static native void UIGraphicsBeginPDFContextToData(NSMutableData data, @ByValue CGRect bounds,
            NSDictionary<?, ?> documentInfo);

    @Generated
    @CFunction
    public static native void UIGraphicsEndPDFContext();

    @Generated
    @CFunction
    public static native void UIGraphicsBeginPDFPage();

    @Generated
    @CFunction
    public static native void UIGraphicsBeginPDFPageWithInfo(@ByValue CGRect bounds, NSDictionary<?, ?> pageInfo);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect UIGraphicsGetPDFContextBounds();

    @Generated
    @CFunction
    public static native void UIGraphicsSetPDFContextURLForRect(NSURL url, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void UIGraphicsAddPDFContextDestinationAtPoint(@Mapped(ObjCStringMapper.class) String name,
            @ByValue CGPoint point);

    @Generated
    @CFunction
    public static native void UIGraphicsSetPDFContextDestinationForRect(@Mapped(ObjCStringMapper.class) String name,
            @ByValue CGRect rect);

    /**
     * Adds a photo to the saved photos album.  The optional completionSelector should have the form:
     * - (void)image:(UIImage *)image didFinishSavingWithError:(NSError *)error contextInfo:(void *)contextInfo;
     */
    @Generated
    @CFunction
    public static native void UIImageWriteToSavedPhotosAlbum(UIImage image,
            @Mapped(ObjCObjectMapper.class) Object completionTarget, SEL completionSelector, VoidPtr contextInfo);

    /**
     * Is a specific video eligible to be saved to the saved photos album?
     */
    @Generated
    @CFunction
    public static native boolean UIVideoAtPathIsCompatibleWithSavedPhotosAlbum(
            @Mapped(ObjCStringMapper.class) String videoPath);

    /**
     * Adds a video to the saved photos album. The optional completionSelector should have the form:
     * - (void)video:(NSString *)videoPath didFinishSavingWithError:(NSError *)error contextInfo:(void *)contextInfo;
     */
    @Generated
    @CFunction
    public static native void UISaveVideoAtPathToSavedPhotosAlbum(@Mapped(ObjCStringMapper.class) String videoPath,
            @Mapped(ObjCObjectMapper.class) Object completionTarget, SEL completionSelector, VoidPtr contextInfo);

    @Generated
    @CFunction
    public static native boolean UIFloatRangeIsInfinite(@ByValue UIFloatRange range);

    @Inline
    @Generated
    @CFunction
    public static native boolean UIFloatRangeIsEqualToRange(@ByValue UIFloatRange range,
            @ByValue UIFloatRange otherRange);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native UIFloatRange UIFloatRangeMake(@NFloat double minimum, @NFloat double maximum);

    /**
     * These are pre-defined constants for use with the input property of UIKeyCommand objects.
     */
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

    /**
     * Predefined font attributes not defined in NSAttributedString.h
     */
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

    /**
     * An NSValue containing a CGAffineTransform. (default: identity matrix)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorMatrixAttribute();

    /**
     * An NSCharacterSet instance representing a set of Unicode characters covered by the font. (default: supplied by font)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorCharacterSetAttribute();

    /**
     * An NSArray instance. Each member of the array is a sub-descriptor. (default: the system default cascading list for user's locale)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorCascadeListAttribute();

    /**
     * An NSDictionary instance fully describing font traits. (default: supplied by font)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorTraitsAttribute();

    /**
     * A float represented as an NSNumber. The value overrides glyph advancement specified by the font. (default: supplied by each glyph)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorFixedAdvanceAttribute();

    /**
     * An array of dictionaries representing non-default font feature settings. Each dictionary contains UIFontFeatureTypeIdentifierKey and UIFontFeatureSelectorIdentifierKey.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorFeatureSettingsAttribute();

    /**
     * An NSString containing the desired Text Style
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorTextStyleAttribute();

    /**
     * Font traits keys
     * This key is used with a trait dictionary to get the symbolic traits value as an NSNumber.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontSymbolicTrait();

    /**
     * This key is used with a trait dictionary to get the normalized weight value as an NSNumber. The valid value range is from -1.0 to 1.0. The value of 0.0 corresponds to the regular or medium font weight.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontWeightTrait();

    /**
     * This key is used with a trait dictionary to get the relative inter-glyph spacing value as an NSNumber. The valid value range is from -1.0 to 1.0. The value of 0.0 corresponds to the regular glyph spacing.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontWidthTrait();

    /**
     * This key is used with a trait dictionary to get the relative slant angle value as an NSNumber. The valid value range is from -1.0 to 1.0. The value or 0.0 corresponds to 0 degree clockwise rotation from the vertical and 1.0 corresponds to 30 degrees clockwise rotation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontSlantTrait();

    /**
     * Suggested values for use with UIFontWeightTrait, and UIFont's systemFontOfSize:weight:
     * Beware that most fonts will _not_ have variants available in all these weights!
     */
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

    /**
     * A number object specifying font feature type such as ligature, character shape, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontFeatureTypeIdentifierKey();

    /**
     * A number object specifying font feature selector such as common ligature off, traditional character shape, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontFeatureSelectorIdentifierKey();

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
    public static native String UIFontTextStyleHeadline();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontTextStyleSubheadline();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontTextStyleBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontTextStyleCallout();

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

    /**
     * Content size category constants
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIContentSizeCategoryUnspecified();

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

    /**
     * Accessibility sizes
     */
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

    /**
     * userInfo dictionary will contain new value for UIContentSizeCategoryNewValueKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIContentSizeCategoryDidChangeNotification();

    /**
     * NSString instance with new content size category in userInfo
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIContentSizeCategoryNewValueKey();

    /**
     * -1
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double UIViewNoIntrinsicMetric();

    /**
     * Size To Fit
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGSize UILayoutFittingCompressedSize();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize UILayoutFittingExpandedSize();

    /**
     * An attribute for NSTextTab options.  The value is NSCharacterSet.  The character set is used to determine the tab column terminating character.  The tab and newline characters are implied even if not included in the character set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTabColumnTerminatorsAttributeName();

    /**
     * Keys for text attributes dictionaries.
     * These keys are superseded by the corresponding attribute name keys (NSFontAttributeName, NSForegroundColorAttributeName, NSShadowAttributeName)
     * in NSAttributedString.h.
     * Key to the font in the text attributes dictionary. A UIFont instance is expected. Use a font with size 0.0 to get the default font size for the situation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextAttributeFont();

    /**
     * Key to the text color in the text attributes dictionary. A UIColor instance is expected.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextAttributeTextColor();

    /**
     * Key to the text shadow color in the text attributes dictionary.  A UIColor instance is expected.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextAttributeTextShadowColor();

    /**
     * Key to the offset used for the text shadow in the text attributes dictionary. An NSValue instance wrapping a UIOffset struct is expected.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextAttributeTextShadowOffset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeNamePrefix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeGivenName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeMiddleName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeFamilyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeNameSuffix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeNickname();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeJobTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeOrganizationName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeFullStreetAddress();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeStreetAddressLine1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeStreetAddressLine2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeAddressCity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeAddressState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeAddressCityAndState();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeSublocality();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeCountryName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypePostalCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeTelephoneNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeEmailAddress();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeCreditCardNumber();

    /**
     * Key to a UIColor
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextInputTextBackgroundColorKey();

    /**
     * Key to a UIColor
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextInputTextColorKey();

    /**
     * Key to a UIFont
     */
    @Deprecated
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
    public static native String UITextFieldDidEndEditingReasonKey();

    /**
     * This exception is raised if supportedInterfaceOrientations returns 0, or if preferredInterfaceOrientationForPresentation
     * returns an orientation that is not supported.
     */
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

    /**
     * These notifications are sent out after the equivalent delegate message is called
     */
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

    /**
     * userInfo contains NSNumber with new orientation
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationWillChangeStatusBarOrientationNotification();

    /**
     * userInfo contains NSNumber with old orientation
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationDidChangeStatusBarOrientationNotification();

    /**
     * userInfo dictionary key for status bar orientation
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationStatusBarOrientationUserInfoKey();

    /**
     * userInfo contains NSValue with new frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationWillChangeStatusBarFrameNotification();

    /**
     * userInfo contains NSValue with old frame
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationDidChangeStatusBarFrameNotification();

    /**
     * userInfo dictionary key for status bar frame
     */
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
    public static native String UIApplicationProtectedDataWillBecomeUnavailable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationProtectedDataDidBecomeAvailable();

    /**
     * userInfo contains NSURL with launch URL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsURLKey();

    /**
     * userInfo contains NSString with bundle ID of the originating application; non-nil if the originating application and this application share the same team identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsSourceApplicationKey();

    /**
     * userInfo contains NSDictionary with payload
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsRemoteNotificationKey();

    /**
     * userInfo contains a UILocalNotification
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsLocalNotificationKey();

    /**
     * userInfo contains object with annotation property list
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsAnnotationKey();

    /**
     * app was launched in response to a CoreLocation event.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsLocationKey();

    /**
     * userInfo contains an NSArray of NKAssetDownload identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsNewsstandDownloadsKey();

    /**
     * userInfo contains an NSArray of CBCentralManager restore identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsBluetoothCentralsKey();

    /**
     * userInfo contains an NSArray of CBPeripheralManager restore identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsBluetoothPeripheralsKey();

    /**
     * userInfo contains the UIApplicationShortcutItem used to launch the app.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsShortcutItemKey();

    /**
     * Sub-Dictionary present in launch options when user activity is present
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsUserActivityDictionaryKey();

    /**
     * Key in user activity dictionary for the activity type
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsUserActivityTypeKey();

    /**
     * The presence of this key indicates that the app was launched in order to handle a CloudKit sharing invitation. The value of this key is a CKShareMetadata object.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsCloudKitShareMetadataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenSettingsURLString();

    /**
     * value is an NSString containing the bundle ID of the originating application; non-nil if the originating application and this application share the same team identifier
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionsSourceApplicationKey();

    /**
     * value is a property-list typed object corresponding to what the originating application passed in UIDocumentInteractionController's annotation property
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionsAnnotationKey();

    /**
     * value is a bool NSNumber. Copy the file before use if this value is NO, or is not present.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionsOpenInPlaceKey();

    /**
     * This notification is posted after the user takes a screenshot (for example by pressing both the home and lock screen buttons)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationUserDidTakeScreenshotNotification();

    /**
     * Extension point identifier constants
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationKeyboardExtensionPointIdentifier();

    /**
     * Option for openURL:options:CompletionHandler: only open URL if it is a valid universal link with an application configured to open it
     * If there is no application configured, or the user disabled using it to open the link, completion handler called with NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionUniversalLinksOnly();

    /**
     * UIStoryBoard that originally created the ViewController that saved state, nil if no UIStoryboard
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIStateRestorationViewControllerStoryboardKey();

    /**
     * NSString with value of info.plist's Bundle Version (app version) when state was last saved for the app
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationStateRestorationBundleVersionKey();

    /**
     * NSNumber containing the UIUserInterfaceIdiom enum value of the app that saved state
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationStateRestorationUserInterfaceIdiomKey();

    /**
     * NSDate specifying the date/time the state restoration archive was saved. This is in UTC.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationStateRestorationTimestampKey();

    /**
     * NSString with value of the system version (iOS version) when state was last saved for the app
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationStateRestorationSystemVersionKey();

    /**
     * Sometimes view controllers that are using showViewController:sender and showDetailViewController:sender: will need to know when the split view controller environment above it has changed. This notification will be posted when that happens (for example, when a split view controller is collapsing or expanding). The NSNotification's object will be the view controller that caused the change.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIViewControllerShowDetailTargetDidChangeNotification();

    /**
     * This exception is raised when a child view controller's view is added into the view hierarchy and the first
     * superview of the child view controller's view that has a view controller is NOT the child view controller's
     * parent.
     */
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

    /**
     * Used when the element has no traits.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitNone();

    /**
     * Used when the element should be treated as a button.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitButton();

    /**
     * Used when the element should be treated as a link.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitLink();

    /**
     * Used when an element acts as a header for a content section (e.g. the title of a navigation bar).
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitHeader();

    /**
     * Used when the text field element should also be treated as a search field.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitSearchField();

    /**
     * Used when the element should be treated as an image. Can be combined with button or link, for example.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitImage();

    /**
     * Used when the element is selected.
     * For example, a selected row in a table or a selected button within a segmented control.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitSelected();

    /**
     * Used when the element plays its own sound when activated.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitPlaysSound();

    /**
     * Used when the element acts as a keyboard key.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitKeyboardKey();

    /**
     * Used when the element should be treated as static text that cannot change.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitStaticText();

    /**
     * Used when an element can be used to provide a quick summary of current
     * conditions in the app when the app first launches.  For example, when Weather
     * first launches, the element with today's weather conditions is marked with
     * this trait.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitSummaryElement();

    /**
     * Used when the control is not enabled and does not respond to user input.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitNotEnabled();

    /**
     * Used when the element frequently updates its label or value, but too often to send notifications.
     * Allows an accessibility client to poll for changes. A stopwatch would be an example.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitUpdatesFrequently();

    /**
     * Used when activating an element starts a media session (e.g. playing a movie, recording audio)
     * that should not be interrupted by output from an assistive technology, like VoiceOver.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitStartsMediaSession();

    /**
     * Used when an element can be "adjusted" (e.g. a slider). The element must also
     * implement accessibilityIncrement and accessibilityDecrement.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitAdjustable();

    /**
     * Used when an element allows direct touch interaction for VoiceOver users (for example, a view representing a piano keyboard).
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitAllowsDirectInteraction();

    /**
     * Informs VoiceOver that it should scroll to the next page when it finishes reading the contents of the
     * element. VoiceOver will scroll by calling accessibilityScroll: with UIAccessibilityScrollDirectionNext and will
     * stop scrolling when it detects the content has not changed.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitCausesPageTurn();

    /**
     * Used when a view or accessibility container represents an ordered list of tabs.
     * The object with this trait should return NO for isAccessibilityElement.
     */
    @Generated
    @CVariable()
    public static native long UIAccessibilityTraitTabBar();

    /**
     * Should be posted when a new view appears that encompasses a major portion of the screen.
     * Optionally, pass the element that VoiceOver should move to after processing the notification.
     */
    @Generated
    @CVariable()
    public static native int UIAccessibilityScreenChangedNotification();

    /**
     * Should be posted when the layout of a screen changes, for example when an individual
     * element appears or disappears.
     * Optionally, pass the element that VoiceOver should move to after processing the notification.
     */
    @Generated
    @CVariable()
    public static native int UIAccessibilityLayoutChangedNotification();

    /**
     * Should be posted when an announcement needs to be conveyed to VoiceOver.
     * VoiceOver will output the announcement string that is used as the argument.
     * The argument is a NSString.
     */
    @Generated
    @CVariable()
    public static native int UIAccessibilityAnnouncementNotification();

    /**
     * Listen for this notification to know when VoiceOver finishes outputting an announcement.
     * The userInfo dictionary contains UIAccessibilityAnnouncementKeyString and UIAccessibilityAnnouncementKeyWasSuccessful.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityAnnouncementDidFinishNotification();

    /**
     * The corresponding value is the string that was used for the announcement.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityAnnouncementKeyStringValue();

    /**
     * The corresponding value is an NSNumber representing whether VoiceOver successfully outputted the announcement.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityAnnouncementKeyWasSuccessful();

    /**
     * In order to know when an assistive technology has focused on an element listen to this notification
     * The newly focused element will be referenced by UIAccessibilityElementFocusedKeyElement in the userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityElementFocusedNotification();

    /**
     * The corresponding value is the element that is now focused by the assistive technology.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityFocusedElementKey();

    /**
     * The corresponding value is the element that had previously been focused by the assistive technology.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityUnfocusedElementKey();

    /**
     * The corresponding value is the identifier of the assistive technology
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityAssistiveTechnologyKey();

    /**
     * Should be posted after accessibilityScroll: is called and the scrolling action has completed.
     * A string representing the status of the new scroll position should be used as the argument
     * (e.g. "Page 2 of 5"). If the same status is used repeatedly, the assistive technology will
     * indicate a border has been reached.
     * The argument is a NSString.
     */
    @Generated
    @CVariable()
    public static native int UIAccessibilityPageScrolledNotification();

    /**
     * Should be posted to pause an assistive technology's operations temporarily.
     * For example, you may want to pause scanning in Switch Control while your app plays an animation.
     * An identifier representing the assistive technology should be used as the argument.
     * Currently, these notifications only apply to Switch Control.
     * The notifications must be balanced.  That is, every UIAccessibilityPauseAssistiveTechnologyNotification
     * should be followed by a matching UIAccessibilityResumeAssistiveTechnologyNotification with the same argument.
     * If the user performs an action that requires the assistive technology to resume operations,
     * it may do so before it receives the corresponding UIAccessibilityResumeAssistiveTechnologyNotification.
     * The argument is a NSString.
     */
    @Generated
    @CVariable()
    public static native int UIAccessibilityPauseAssistiveTechnologyNotification();

    @Generated
    @CVariable()
    public static native int UIAccessibilityResumeAssistiveTechnologyNotification();

    /**
     * The following identifier should be used as the argument when posting a UIAccessibilityPauseAssistiveTechnologyNotification
     * or a UIAccessibilityResumeAssistiveTechnologyNotification.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityNotificationSwitchControlIdentifier();

    /**
     * Used to identify VoiceOver as the assistive technology.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityNotificationVoiceOverIdentifier();

    /**
     * Use an NSNumber with a YES or NO value.
     * If YES, then all punctuation will be spoken (e.g. when displaying code).
     * If NO, then no punctuation will be spoken.
     * By default, if this attribute is not present, the user's settings will be used.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributePunctuation();

    /**
     * Use an NSString with a BCP-47 language code to identify the language of a segment of a string.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeLanguage();

    /**
     * Use an NSNumber with a value between [0-2] that specifies the pitch.
     * For example, you may want to lower the pitch when an object is deleted, or raise the pitch if an object is inserted.
     * Default value == 1.0f.
     */
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
    public static native String UIAccessibilityShakeToUndoDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityAssistiveTouchStatusDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityHearingDevicePairedEarDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityTypePostToFacebook();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityTypePostToTwitter();

    /**
     * SinaWeibo
     */
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
    public static native String UIActivityTypeOpenInIBooks();

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
    @ByValue
    public static native CGSize UICollectionViewFlowLayoutAutomaticSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIDocumentStateChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserActivityDocumentURLKey();

    /**
     * an NSString (UTI, i.e. kUTTypeImage)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerMediaType();

    /**
     * a UIImage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerOriginalImage();

    /**
     * a UIImage
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerEditedImage();

    /**
     * an NSValue (CGRect)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerCropRect();

    /**
     * an NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerMediaURL();

    /**
     * an NSURL that references an asset in the AssetsLibrary framework
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerReferenceURL();

    /**
     * an NSDictionary containing metadata from a captured photo
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerMediaMetadata();

    /**
     * a PHLivePhoto
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerLivePhoto();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UILocalNotificationDefaultSoundName();

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

    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UINibProxiedObjectsKey();

    /**
     * Key for specifying spine location in options dictionary argument to initWithTransitionStyle:navigationOrientation:options:.
     * Value should be a 'UIPageViewControllerSpineLocation' wrapped in an NSNumber.
     * Only valid for use with page view controllers with transition style 'UIPageViewControllerTransitionStylePageCurl'.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPageViewControllerOptionSpineLocationKey();

    /**
     * Key for specifying spacing between pages in options dictionary argument to initWithTransitionStyle:navigationOrientation:options:.
     * Value should be a CGFloat wrapped in an NSNumber. Default is '0'.
     * Only valid for use with page view controllers with transition style 'UIPageViewControllerTransitionStyleScroll'.
     */
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

    /**
     * Value: NSDate.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardOptionExpirationDate();

    /**
     * Value: NSNumber, boolean.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardOptionLocalOnly();

    /**
     * Notification
     */
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

    /**
     * Types
     */
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

    /**
     * Use the following type in setItems: or setItems:options: to automatically insert appropriate UTIs for supported types.
     * Supported types are: NSString, NSURL, UIImage, UIColor, NSAttributedString.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardTypeAutomatic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPrintErrorDomain();

    /**
     * Object is the UIScreen that represents the new screen. Connection notifications are not sent for screens present when the application is first launched
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenDidConnectNotification();

    /**
     * Object is the UIScreen that represented the disconnected screen.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenDidDisconnectNotification();

    /**
     * Object is the UIScreen which changed. [object currentMode] is the new UIScreenMode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenModeDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenBrightnessDidChangeNotification();

    /**
     * The following keys are understood by UIViewControllerContextTransitioning context objects
     * that are created by the system.
     */
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

    /**
     * Including this constant string in the array of strings returned by sectionIndexTitlesForTableView: will cause a magnifying glass icon to be displayed at that location in the index.
     * This should generally only be used as the first title in the index.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITableViewIndexSearch();

    /**
     * Returning this value from tableView:heightForHeaderInSection: or tableView:heightForFooterInSection: results in a height that fits the value returned from
     * tableView:titleForHeaderInSection: or tableView:titleForFooterInSection: if the title is not nil.
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double UITableViewAutomaticDimension();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITableViewSelectionDidChangeNotification();

    /**
     * This constant can be used with any sizing-related `UISplitViewController` properties to get the default system behavior.
     */
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

    /**
     * Posted when the window becomes visible with a nil userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowDidBecomeVisibleNotification();

    /**
     * Posted when the window becomes hidden with a nil userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowDidBecomeHiddenNotification();

    /**
     * Posted when the window becomes the key window with a nil userInfo dictionary. In apps built
     * against the iOS 15 or tvOS 15 SDK (or later), this notification will be posted when the window
     * becomes its scene's key window. For apps built against earlier SDKs, it will be posted when
     * the window becomes the application's key window.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowDidBecomeKeyNotification();

    /**
     * Posted when the window resigns key window status with a nil userInfo dictionary. In apps built
     * against the iOS 15 or tvOS 15 SDK (or later), this notification will be posted when the window
     * resigns key in its scene. For apps built against earlier SDKs, it will be posted when the window
     * resigns key in the application.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowDidResignKeyNotification();

    /**
     * Each notification includes a nil object and a userInfo dictionary containing the
     * beginning and ending keyboard frame in screen coordinates. Use the various UIView and
     * UIWindow convertRect facilities to get the frame in the desired coordinate system.
     * Animation key/value pairs are only available for the "will" family of notification.
     */
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

    /**
     * NSValue of CGRect
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardFrameBeginUserInfoKey();

    /**
     * NSValue of CGRect
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardFrameEndUserInfoKey();

    /**
     * NSNumber of double
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardAnimationDurationUserInfoKey();

    /**
     * NSNumber of NSUInteger (UIViewAnimationCurve)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardAnimationCurveUserInfoKey();

    /**
     * NSNumber of BOOL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardIsLocalUserInfoKey();

    /**
     * Like the standard keyboard notifications above, these additional notifications include
     * a nil object and begin/end frames of the keyboard in screen coordinates in the userInfo dictionary.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardWillChangeFrameNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardDidChangeFrameNotification();

    /**
     * These keys are superseded by UIKeyboardFrameBeginUserInfoKey and UIKeyboardFrameEndUserInfoKey.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardCenterBeginUserInfoKey();

    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardCenterEndUserInfoKey();

    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyboardBoundsUserInfoKey();

    /**
     * UIFont, default Helvetica(Neue) 12
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFontAttributeName();

    /**
     * NSParagraphStyle, default defaultParagraphStyle
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSParagraphStyleAttributeName();

    /**
     * UIColor, default blackColor
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSForegroundColorAttributeName();

    /**
     * UIColor, default nil: no background
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBackgroundColorAttributeName();

    /**
     * NSNumber containing integer, default 1: default ligatures, 0: no ligatures
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLigatureAttributeName();

    /**
     * NSNumber containing floating point value, in points; amount to modify default kerning. 0 means kerning is disabled.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKernAttributeName();

    /**
     * NSNumber containing integer, default 0: no strikethrough
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStrikethroughStyleAttributeName();

    /**
     * NSNumber containing integer, default 0: no underline
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnderlineStyleAttributeName();

    /**
     * UIColor, default nil: same as foreground color
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStrokeColorAttributeName();

    /**
     * NSNumber containing floating point value, in percent of font point size, default 0: no stroke; positive for stroke alone, negative for stroke and fill (a typical value for outlined text would be 3.0)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStrokeWidthAttributeName();

    /**
     * NSShadow, default nil: no shadow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSShadowAttributeName();

    /**
     * NSString, default nil: no text effect
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextEffectAttributeName();

    /**
     * NSTextAttachment, default nil
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAttachmentAttributeName();

    /**
     * NSURL (preferred) or NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinkAttributeName();

    /**
     * NSNumber containing floating point value, in points; offset from baseline, default 0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBaselineOffsetAttributeName();

    /**
     * UIColor, default nil: same as foreground color
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnderlineColorAttributeName();

    /**
     * UIColor, default nil: same as foreground color
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStrikethroughColorAttributeName();

    /**
     * NSNumber containing floating point value; skew to be applied to glyphs, default 0: no skew
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSObliquenessAttributeName();

    /**
     * NSNumber containing floating point value; log of expansion factor to be applied to glyphs, default 0: no expansion
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExpansionAttributeName();

    /**
     * NSArray of NSNumbers representing the nested levels of writing direction overrides as defined by Unicode LRE, RLE, LRO, and RLO characters.  The control characters can be obtained by masking NSWritingDirection and NSWritingDirectionFormatType values.  LRE: NSWritingDirectionLeftToRight|NSWritingDirectionEmbedding, RLE: NSWritingDirectionRightToLeft|NSWritingDirectionEmbedding, LRO: NSWritingDirectionLeftToRight|NSWritingDirectionOverride, RLO: NSWritingDirectionRightToLeft|NSWritingDirectionOverride,
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSWritingDirectionAttributeName();

    /**
     * An NSNumber containing an integer value.  0 means horizontal text.  1 indicates vertical text.  If not specified, it could follow higher-level vertical orientation settings.  Currently on iOS, it's always horizontal.  The behavior for any other value is undefined.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSVerticalGlyphFormAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextEffectLetterpressStyle();

    /**
     * Supported document types for the NSDocumentTypeDocumentAttribute key in the document attributes dictionary.
     */
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

    /**
     * NSNumber containing NSTextLayoutOrientation value. default: NSTextLayoutOrientationHorizontal
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextLayoutSectionOrientation();

    /**
     * NSValue containing NSRange representing a character range. default: a range covering the whole document
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextLayoutSectionRange();

    /**
     * @"DocumentType", one of the document types declared above.  For reader methods, this key in options can specify the document type for interpreting the contents.  Upon return, the document attributes can contain this key for indicating the actual format used to read the contents.  For write methods, this key specifies the format for generating the data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDocumentTypeDocumentAttribute();

    /**
     * @"CharacterEncoding", NSNumber containing integer specifying NSStringEncoding for the file; default for plain text is the default encoding.  This key in options can specify the string encoding for reading the data.  Upon return, the document attributes can contain the actual encoding used.  For writing methods, this value is used for generating the plain text data.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCharacterEncodingDocumentAttribute();

    /**
     * @"DefaultAttributes", NSDictionary containing attributes to be applied to plain files.  Used by reader methods.  This key in options can specify the default attributes applied to the entire document contents.  The document attributes can contain this key indicating the actual attributes used.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDefaultAttributesDocumentAttribute();

    /**
     * @"PaperSize", NSValue containing CGSize (in points)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPaperSizeDocumentAttribute();

    /**
     * @"PaperMargin", NSValue containing UIEdgeInsets
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPaperMarginDocumentAttribute();

    /**
     * @"ViewSize", NSValue containing CGSize (in points)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSViewSizeDocumentAttribute();

    /**
     * @"ViewZoom", NSNumber containing floating point value (100 == 100% zoom)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSViewZoomDocumentAttribute();

    /**
     * @"ViewMode", NSNumber containing integer; 0 = normal; 1 = page layout
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSViewModeDocumentAttribute();

    /**
     * @"ReadOnly", NSNumber containing integer; if missing, or 0 or negative, not readonly; 1 or more, readonly. Note that this has nothing to do with the file system protection on the file, but instead, on how the file should be displayed to the user
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSReadOnlyDocumentAttribute();

    /**
     * @"BackgroundColor", UIColor, representing the document-wide page background color
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBackgroundColorDocumentAttribute();

    /**
     * @"HyphenationFactor", NSNumber containing floating point value (0=off, 1=full hyphenation)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHyphenationFactorDocumentAttribute();

    /**
     * @"DefaultTabInterval", NSNumber containing floating point value, representing the document-wide default tab stop interval, in points
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDefaultTabIntervalDocumentAttribute();

    /**
     * NSArray of dictionaries.  Each dictionary describing a layout orientation section.  The dictionary can have two attributes: NSTextLayoutSectionOrientation and NSTextLayoutSectionRange.  When there is a gap between sections, it's assumed to have NSTextLayoutOrientationHorizontal.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextLayoutSectionsAttribute();

    /**
     * Notifications ***
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextStorageWillProcessEditingNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextStorageDidProcessEditingNotification();

    @Generated
    @CVariable()
    @ByValue
    public static native UIFloatRange UIFloatRangeZero();

    @Generated
    @CVariable()
    @ByValue
    public static native UIFloatRange UIFloatRangeInfinite();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_UIAccessibilityRequestGuidedAccessSession {
        @Generated
        void call_UIAccessibilityRequestGuidedAccessSession(boolean arg0);
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSDirectionalEdgeInsets NSDirectionalEdgeInsetsMake(@NFloat double top, @NFloat double leading,
            @NFloat double bottom, @NFloat double trailing);

    @Generated
    @Inline
    @CFunction
    public static native boolean NSDirectionalEdgeInsetsEqualToDirectionalEdgeInsets(
            @ByValue NSDirectionalEdgeInsets insets1, @ByValue NSDirectionalEdgeInsets insets2);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromDirectionalEdgeInsets(@ByValue NSDirectionalEdgeInsets insets);

    @Generated
    @CFunction
    @ByValue
    public static native NSDirectionalEdgeInsets NSDirectionalEdgeInsetsFromString(
            @Mapped(ObjCStringMapper.class) String string);

    @Generated
    @CFunction
    public static native boolean UIContentSizeCategoryIsAccessibilityCategory(
            @Mapped(ObjCStringMapper.class) String category);

    @Generated
    @CFunction
    @NInt
    public static native long UIContentSizeCategoryCompareToCategory(@Mapped(ObjCStringMapper.class) String lhs,
            @Mapped(ObjCStringMapper.class) String rhs);

    /**
     * Font text styles, semantic descriptions of the intended use for a font returned by +[UIFont preferredFontForTextStyle:]
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontTextStyleLargeTitle();

    @Generated
    @CVariable()
    @ByValue
    public static native NSDirectionalEdgeInsets NSDirectionalEdgeInsetsZero();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFocusDidUpdateNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFocusMovementDidFailNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFocusUpdateContextKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFocusUpdateAnimationCoordinatorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeUsername();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypePassword();

    /**
     * The corresponding value for this key should be a NSNumber with a YES or NO value.
     * If YES, then this announcement will be queued behind existing speech; if NO, then it will interrupt existing speech.
     * Default behavior is to interrupt existing speech.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeQueueAnnouncement();

    /**
     * Use an NSString, containing International Phonetic Alphabet (IPA) symbols.
     * Controls the pronunciation of a word or phrase, e.g. a proper name.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeIPANotation();

    /**
     * Use an NSNumber where the value is [0, 6]. Use 0 to indicate the absence of a specific heading level.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextAttributeHeadingLevel();

    /**
     * Use an NSArray of localized NSStrings to convey custom text attributes.
     * For example, a range of text may have multiple custom 'annotation styles, which can be described with this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextAttributeCustom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityVoiceOverStatusDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityTypeMarkupAsPDF();

    /**
     * a PHAsset
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerPHAsset();

    /**
     * an NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerImageURL();

    /**
     * Object is the UIScreen which changed. [object isCaptured] is the new value of captured property.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenCapturedDidChangeNotification();

    /**
     * @"DocumentType", NSString indicating a document type to be forced when loading the document, specified as one of the NSDocumentTypeDocumentAttribute constants listed above
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDocumentTypeDocumentOption();

    /**
     * @"DefaultAttributes", for plain text only; NSDictionary containing attributes to be applied to plain files
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDefaultAttributesDocumentOption();

    /**
     * @"CharacterEncoding", for plain text and HTML; NSNumber containing integer specifying NSStringEncoding to be used to interpret the file
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCharacterEncodingDocumentOption();

    /**
     * Used when setting custom spacing after an arranged subview to indicate reverting to
     * the value specified by the spacing property.
     * <p>
     * See -setCustomSpacing:afterView:, -customSpacingAfterView:
     */
    @Generated @NFloat public static final double UIStackViewSpacingUseDefault = org.moe.natj.general.NatJ.is64Bit() ?
            3.4028234663852886E38 :
            (float)3.4028235E38;
    /**
     * Used when setting custom spacing after an arranged subview to request the system
     * spacing to the neighboring view.
     * <p>
     * Also used as a token for the spacing property to request system spacing between
     * arranged subviews.
     * <p>
     * See spacing, -setCustomSpacing:afterView:, -customSpacingAfterView:
     */
    @Generated @NFloat public static final double UIStackViewSpacingUseSystem = org.moe.natj.general.NatJ.is64Bit() ?
            1.1754943508222875E-38 :
            (float)1.17549435E-38;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIDocumentBrowserErrorDomain();

    @Generated
    @Inline
    @CFunction
    public static native boolean UIDeviceOrientationIsFlat(@NInt long orientation);

    @Generated
    @Inline
    @CFunction
    public static native boolean UIDeviceOrientationIsValidInterfaceOrientation(@NInt long orientation);

    @Generated
    @CFunction
    public static native void UIGuidedAccessConfigureAccessibilityFeatures(@NUInt long features, boolean enabled,
            @ObjCBlock(name = "call_UIGuidedAccessConfigureAccessibilityFeatures") Block_UIGuidedAccessConfigureAccessibilityFeatures completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_UIGuidedAccessConfigureAccessibilityFeatures {
        @Generated
        void call_UIGuidedAccessConfigureAccessibilityFeatures(boolean arg0, NSError arg1);
    }

    /**
     * Returns whether the system preference for auto-play videos is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsVideoAutoplayEnabled();

    /**
     * Returns whether the system preference for Differentiate without Color is enabled.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityShouldDifferentiateWithoutColor();

    /**
     * Returns whether the system preference for On/Off labels is enabled.
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsOnOffSwitchLabelsEnabled();

    @Generated
    @CFunction
    @NFloat
    public static native double UIFontWeightForImageSymbolWeight(@NInt long symbolWeight);

    @Generated
    @CFunction
    @NInt
    public static native long UIImageSymbolWeightForFontWeight(@NFloat double fontWeight);

    /**
     * Application menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuApplication();

    /**
     * File menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFile();

    /**
     * Edit menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuEdit();

    /**
     * View menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuView();

    /**
     * Window menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuWindow();

    /**
     * Help menu top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuHelp();

    /**
     * About menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuAbout();

    /**
     * Preferences menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuPreferences();

    /**
     * Services menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuServices();

    /**
     * Hide, Hide Others, Show All menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuHide();

    /**
     * Quit menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuQuit();

    /**
     * New scene menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuNewScene();

    /**
     * Close menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuClose();

    /**
     * Print menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuPrint();

    /**
     * Undo, Redo menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuUndoRedo();

    /**
     * Cut, Copy, Paste, Delete, Select, Select All menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuStandardEdit();

    /**
     * Find menu; empty in the default menubar configuration. Applications should use this when adding their own Find-related menu items.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFind();

    /**
     * Replace..., Transliterate Chinese menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuReplace();

    /**
     * Share menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuShare();

    /**
     * Bold, Italics, Underline  menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextStyle();

    /**
     * Spelling menu contained within Edit menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpelling();

    /**
     * Show Spelling, Check Document Now menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpellingPanel();

    /**
     * Check Spelling While Typing and other spelling and grammar-checking options menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpellingOptions();

    /**
     * Substitutions menu contained within Edit menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutions();

    /**
     * Show Substitutions menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutionsPanel();

    /**
     * Smart Copy, Smart Paste, Smart Quotes, and other substitution options menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutionOptions();

    /**
     * Transformations menu contained within Edit menu (contains Make Uppercase, Make Lowercase, Capitalize)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTransformations();

    /**
     * Speech menu contained within Edit menu (contains Speak, Speak..., Pause)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpeech();

    /**
     * Lookup menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuLookup();

    /**
     * Learn menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuLearn();

    /**
     * Format top-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFormat();

    /**
     * Font menu contained within Format menu (contains UIMenuTextStyle)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFont();

    /**
     * Bigger and Smaller menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextSize();

    /**
     * Show Colors menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextColor();

    /**
     * Copy Style and Paste Style menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextStylePasteboard();

    /**
     * Text menu contained within Format menu (contains UIMenuAlignment and UIMenuWritingDirection)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuText();

    /**
     * Default, Right to Left, Left to Right menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuWritingDirection();

    /**
     * Align Left, Center, Justify, Align Right menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuAlignment();

    /**
     * Show/Hide and Customize Toolbar menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuToolbar();

    /**
     * Fullscreen menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFullscreen();

    /**
     * Minimize, Zoom menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuMinimizeAndZoom();

    /**
     * Bring All to Front, Arrange in Front menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuBringAllToFront();

    /**
     * Root-level menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuRoot();

    /**
     * UICommand.propertyList value to indicate that a command is a Sharing menu item. Such an item automatically receives a standard Share submenu.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UICommandTagShare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorSystemDesignDefault();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorSystemDesignRounded();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorSystemDesignSerif();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIFontDescriptorSystemDesignMonospaced();

    /**
     * This is the appropriate priority level for a drag that may end up resizing the window's scene.
     */
    @Generated public static final float UILayoutPriorityDragThatCanResizeScene = (float)510.0;
    /**
     * This is the priority level at which the window's scene prefers to stay the same size.  It's generally not appropriate to make a constraint at exactly this priority. You want to be higher or lower.
     */
    @Generated public static final float UILayoutPrioritySceneSizeStayPut = (float)500.0;
    /**
     * This is the priority level at which a split view divider, say, is dragged.  It won't resize the window's scene.
     */
    @Generated public static final float UILayoutPriorityDragThatCannotResizeScene = (float)490.0;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeNewPassword();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeOneTimeCode();

    @Generated @NInt public static final long UITextWritingDirectionNatural = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long UITextWritingDirectionLeftToRight = 0x0000000000000000L;
    @Generated @NInt public static final long UITextWritingDirectionRightToLeft = 0x0000000000000001L;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextWordProcessing();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextNarrative();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextMessaging();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextSpreadsheet();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextFileSystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextSourceCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextualContextConsole();

    /**
     * Use an NSNumber with a YES or NO value to specify whether each letter in the string should be spoken separately.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeSpellOut();

    /**
     * Use a UIAccessibilityTextualContext to specify how this text content should be interpreted by assistive technologies.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextAttributeContext();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIGuidedAccessErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityVideoAutoplayStatusDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityShouldDifferentiateWithoutColorDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityOnOffSwitchLabelsDidChangeNotification();

    /**
     * Posted when the large content viewer gets enabled or disabled on the device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UILargeContentViewerInteractionEnabledStatusDidChangeNotification();

    /**
     * NSString or NSAttributedString - title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationMetadataKeyTitle();

    /**
     * NSString or NSAttributedString - message body
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationMetadataKeyMessageBody();

    /**
     * Full size preview image
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationPreviewIntentFullSize();

    /**
     * Thumbnail preview image
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationPreviewIntentThumbnail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationInteractionShare();

    /**
     * @"TextScaling", one of the text scaling types declared above. Only affects RTF documents.  For reading methods, this indicates the type of text scaling used in the returned attributed string.  For write methods, this attribute can be used in two different ways: (1) Passing only this attribute will overwrite the text scaling metadata in the document, but will not perform any conversion on the font sizes in the document, or (2) Passing both this attribute and NSSourceTextScalingDocumentAttribute will convert the font sizes in the document from the source text scaling type to the text scaling type specified by this attribute.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextScalingDocumentAttribute();

    /**
     * @"SourceTextScaling", one of the text scaling types declared above. Only affects RTF documents.  For writing methods, this indicates the type of text scaling in the attributed string that will be used as the base type for conversion.  Use this in conjunction with NSTextScalingDocumentAttribute to convert font point sizes between text scalings when writing attributed strings to RTF.  This attribute is optional and does nothing unless NSTextScalingDocumentAttribute is also specified.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSourceTextScalingDocumentAttribute();

    /**
     * @"CocoaRTFVersion", NSNumber containing integer.  Stores the version of Cocoa the file was created with.  NSNumber containing float.  Absence of this value indicates file not labelled as being created by Cocoa or its predecessors.  Values less than 100 are pre-Mac OS X; 100 is Mac OS X 10.0 and 10.1; 102 is Mac OS X 10.2 and 10.3; values greater than 102 correspond to values of NSAppKitVersionNumber on 10.4-10.14 systems.  Beginning with iOS 13 and macOS 10.15, this version number does not have a one-to-one correspondence with any single system framework version, but is guaranteed to monotonically increase with each OS version.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCocoaVersionDocumentAttribute();

    /**
     * @"TargetTextScaling", one of the text scaling types declared above.  Only affects RTF documents.  For reading methods, you can pass this option to request that the returned attributed string uses the specified scaling.  The font point sizes in the document may be converted if necessary.  If this option is not provided, the system will deduce the target text scaling type based on application framework and platform.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTargetTextScalingDocumentOption();

    /**
     * @"SourceTextScaling", one of the text scaling types declared above.  Only affects RTF documents.  For reading methods, you can pass this option to indicate the source text scaling type of the RTF document being read.  Use this in conjunction with NSTargetTextScalingDocumentOption to control text scaling conversions on the font point sizes in the returned attributed string.  This option does nothing unless NSTargetTextScalingDocumentOption is also specified.  If this option is not provided, the system will deduce the source text scaling type based on the information in the document.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSourceTextScalingDocumentOption();

    /**
     * Deprecated ***********************
     * NSUnderlineByWord and the NSUnderlinePattern* values are soft deprecated starting with macOS 10.14/iOS 12 and will be officially deprecated in a future release.  Please use the NSUnderlineStyle* equivalents instead.
     * Underlines will be drawn with a solid pattern by default, so NSUnderlinePatternSolid does not need to be specified.
     */
    @Generated @NInt public static final long NSUnderlinePatternSolid = 0x0000000000000000L;
    @Generated @NInt public static final long NSUnderlinePatternDot = 0x0000000000000100L;
    @Generated @NInt public static final long NSUnderlinePatternDash = 0x0000000000000200L;
    @Generated @NInt public static final long NSUnderlinePatternDashDot = 0x0000000000000300L;
    @Generated @NInt public static final long NSUnderlinePatternDashDotDot = 0x0000000000000400L;
    @Generated @NInt public static final long NSUnderlineByWord = 0x0000000000008000L;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneWillConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneDidDisconnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneDidActivateNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneWillDeactivateNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneWillEnterForegroundNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISceneDidEnterBackgroundNotification();

    /**
     * A session role which defines a typical interactive application on a device's main display
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowSceneSessionRoleApplication();

    /**
     * A session role which defines an interface for a non-main external display
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowSceneSessionRoleExternalDisplay();

    /**
     * Convenience initializer for a button mask where `buttonNumber` is a one-based index of the button on the input device
     * .button(1) == .primary
     * .button(2) == .secondary
     */
    @Generated
    @CFunction
    @NInt
    public static native long UIEventButtonMaskForButtonNumber(@NInt long buttonNumber);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputPageUp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputPageDown();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputHome();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputEnd();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF10();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF11();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputF12();

    /**
     * Returns whether the system preference for button shapes is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityButtonShapesEnabled();

    /**
     * Returns whether the system preference for reduce motion: prefer cross-fade transitions is enabled
     */
    @Generated
    @CFunction
    public static native boolean UIAccessibilityPrefersCrossFadeTransitions();

    /**
     * Positions the accessory before the accessory matching the class specified, or at the beginning if not found.
     */
    @Generated
    @CFunction
    @ObjCBlock(name = "call_UICellAccessoryPositionBeforeAccessoryOfClass_ret")
    public static native Block_UICellAccessoryPositionBeforeAccessoryOfClass_ret UICellAccessoryPositionBeforeAccessoryOfClass(
            Class accessoryClass);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_UICellAccessoryPositionBeforeAccessoryOfClass_ret {
        @Generated
        @NUInt
        long call_UICellAccessoryPositionBeforeAccessoryOfClass_ret(NSArray<? extends UICellAccessory> accessories);
    }

    /**
     * Positions the accessory after the accessory matching the class specified, or at the end if not found.
     */
    @Generated
    @CFunction
    @ObjCBlock(name = "call_UICellAccessoryPositionAfterAccessoryOfClass_ret")
    public static native Block_UICellAccessoryPositionAfterAccessoryOfClass_ret UICellAccessoryPositionAfterAccessoryOfClass(
            Class accessoryClass);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_UICellAccessoryPositionAfterAccessoryOfClass_ret {
        @Generated
        @NUInt
        long call_UICellAccessoryPositionAfterAccessoryOfClass_ret(NSArray<? extends UICellAccessory> accessories);
    }

    /**
     * Open Recent menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuOpenRecent();

    /**
     * NSNumber containing floating point value, in points; amount to modify default tracking. 0 means tracking is disabled.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTrackingAttributeName();

    /**
     * A notification that is posted when UIPointerLockState.locked changes values for a scene.
     * It contains the related UIScene in the user info dictionary of the notification.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPointerLockStateDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPointerLockStateSceneUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityButtonShapesEnabledStatusDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityPrefersCrossFadeTransitionsStatusDidChangeNotification();

    /**
     * A special constant that can be set to the `reservedLayoutWidth` property. This requests the
     * system standard layout width.
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double UICellAccessoryStandardDimension();

    /**
     * A special constant that can be set to the `reservedLayoutSize` width or height. This
     * forces the system standard value that a symbol image would use for that dimension,
     * even when the image is not a symbol image.
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double UIListContentImageStandardDimension();

    /**
     * NSString value, suitable for implementing "Paste and Go"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternProbableWebURL();

    /**
     * NSString value, suitable for implementing "Paste and Search"
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternProbableWebSearch();

    /**
     * NSNumber value
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternNumber();

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionMake(@NFloat double offset,
            @NFloat double angle);

    /**
     * Sidebar menu
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSidebar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIKeyInputDelete();

    @Generated @NInt public static final long UIFocusGroupPriorityIgnored = 0x0000000000000000L;
    @Generated @NInt public static final long UIFocusGroupPriorityPreviouslyFocused = 0x00000000000003E8L;
    @Generated @NInt public static final long UIFocusGroupPriorityPrioritized = 0x00000000000007D0L;
    @Generated @NInt public static final long UIFocusGroupPriorityCurrentlyFocused = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;

    /**
     * Default action identifiers for paste variants
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActionPaste();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActionPasteAndMatchStyle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActionPasteAndGo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActionPasteAndSearch();

    /**
     * Parcel tracking numbers such as "FedEx 8602 9191 3550", "1Z50T0536891664106", and "729445720428778".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeShipmentTrackingNumber();

    /**
     * Airline flight numbers such as "CZ # 1234", "AA212", and "SW Flight 573".
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeFlightNumber();

    /**
     * Dates, times, or durations such as "7-3-2021" or "This Saturday", "12:30", and "10-11am", respectively.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UITextContentTypeDateTime();

    /**
     * userInfo contains a UIEventAttribution to go along with a URL open on launch
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationLaunchOptionsEventAttributionKey();

    /**
     * value is a UIEventAttribution to go along with the URL to open
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionsEventAttributionKey();

    /**
     * value is a UIEventAttribution
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenExternalURLOptionsEventAttributionKey();

    /**
     * The UICollectionViewLayout class is provided as an abstract class for subclassing to define custom collection layouts.
     * Defining a custom layout is an advanced operation intended for applications with complex needs.
     */
    @Generated
    @CVariable()
    @NFloat
    public static native double UICollectionViewLayoutAutomaticDimension();

    /**
     * Use the values from the edges in this constant to indicate to the consumer of a UIListSeparatorConfiguration that the value for that
     * edge should be replaced with an appropriate inset.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native NSDirectionalEdgeInsets UIListSeparatorAutomaticInsets();

    /**
     * Array of DDMatchLink values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternLink();

    /**
     * Array of DDMatchPhoneNumber values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternPhoneNumber();

    /**
     * Array of DDMatchEmailAddress values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternEmailAddress();

    /**
     * Array of DDMatchAddress values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternPostalAddress();

    /**
     * Array of DDMatchCalendarEvent values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternCalendarEvent();

    /**
     * Array of DDMatchShipmentTrackingNumber values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternShipmentTrackingNumber();

    /**
     * Array of DDMatchFlightNumber values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternFlightNumber();

    /**
     * Array of DDMatchMoneyAmount values
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardDetectionPatternMoneyAmount();

    /**
     * LPLinkMetadata
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationMetadataKeyLinkPresentationMetadata();

    /**
     * The identifier for the system medium detent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISheetPresentationControllerDetentIdentifierMedium();

    /**
     * The identifier for the system large detent.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UISheetPresentationControllerDetentIdentifierLarge();

    @Generated
    @CVariable()
    @NFloat
    public static native double UISheetPresentationControllerAutomaticDimension();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionTop();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionTopRight();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionRight();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionBottomRight();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionBottom();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionBottomLeft();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionLeft();

    @Generated
    @CVariable()
    @ByValue
    public static native UIPointerAccessoryPosition UIPointerAccessoryPositionTopLeft();

    /**
     * Posted by NSTextContentStorage when a text attribute unsupported by NSTextContentStorage is added to the underlying text storage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextContentStorageUnsupportedAttributeAddedNotification();
}

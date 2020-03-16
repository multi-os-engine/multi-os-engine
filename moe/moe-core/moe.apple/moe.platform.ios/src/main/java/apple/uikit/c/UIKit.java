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
import apple.uikit.UIImage;
import apple.uikit.UIView;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import apple.uikit.struct.UIEdgeInsets;
import apple.uikit.struct.UIFloatRange;
import apple.uikit.struct.UIOffset;
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

@Generated
@Library("UIKit")
@Runtime(CRuntime.class)
public final class UIKit {
    @Generated public static final float UILayoutPriorityRequired = (float)1000.0;
    @Generated public static final float UILayoutPriorityDefaultHigh = (float)750.0;
    @Generated public static final float UILayoutPriorityDefaultLow = (float)250.0;
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

    @Generated
    @CFunction
    public static native void UIAccessibilityRegisterGestureConflictWithZoom();

    @Generated
    @CFunction
    @NInt
    public static native long UIGuidedAccessRestrictionStateForIdentifier(
            @Mapped(ObjCStringMapper.class) String restrictionIdentifier);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect UIAccessibilityConvertFrameToScreenCoordinates(@ByValue CGRect rect, UIView view);

    @Generated
    @CFunction
    public static native UIBezierPath UIAccessibilityConvertPathToScreenCoordinates(UIBezierPath path, UIView view);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object UIAccessibilityFocusedElement(
            @Mapped(ObjCStringMapper.class) String assistiveTechnologyIdentifier);

    @Generated
    @CFunction
    public static native void UIAccessibilityPostNotification(int notification,
            @Mapped(ObjCObjectMapper.class) Object argument);

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsVoiceOverRunning();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsMonoAudioEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsClosedCaptioningEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsInvertColorsEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsGuidedAccessEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsBoldTextEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsGrayscaleEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsReduceTransparencyEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsReduceMotionEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityDarkerSystemColorsEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSwitchControlRunning();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSpeakSelectionEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsSpeakScreenEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsShakeToUndoEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsAssistiveTouchRunning();

    @Generated
    @CFunction
    public static native void UIAccessibilityRequestGuidedAccessSession(boolean enable,
            @ObjCBlock(name = "call_UIAccessibilityRequestGuidedAccessSession") Block_UIAccessibilityRequestGuidedAccessSession completionHandler);

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

    @Generated
    @CFunction
    public static native void UIImageWriteToSavedPhotosAlbum(UIImage image,
            @Mapped(ObjCObjectMapper.class) Object completionTarget, SEL completionSelector, VoidPtr contextInfo);

    @Generated
    @CFunction
    public static native boolean UIVideoAtPathIsCompatibleWithSavedPhotosAlbum(
            @Mapped(ObjCStringMapper.class) String videoPath);

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
    public static native String UITextFieldDidEndEditingReasonKey();

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
    public static native String UIApplicationProtectedDataWillBecomeUnavailable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationProtectedDataDidBecomeAvailable();

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
    public static native String UIApplicationLaunchOptionsShortcutItemKey();

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
    public static native String UIApplicationLaunchOptionsCloudKitShareMetadataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenSettingsURLString();

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
    public static native String UIApplicationUserDidTakeScreenshotNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationKeyboardExtensionPointIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIApplicationOpenURLOptionUniversalLinksOnly();

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
    public static native long UIAccessibilityTraitTabBar();

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
    public static native String UIAccessibilityNotificationVoiceOverIdentifier();

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
    public static native String UIPasteboardOptionExpirationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIPasteboardOptionLocalOnly();

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
    public static native String UIPasteboardTypeAutomatic();

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
    public static native String UIKeyboardIsLocalUserInfoKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeQueueAnnouncement();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeIPANotation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilityTextAttributeHeadingLevel();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerPHAsset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIImagePickerControllerImageURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIScreenCapturedDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDocumentTypeDocumentOption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDefaultAttributesDocumentOption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCharacterEncodingDocumentOption();

    @Generated @NFloat public static final double UIStackViewSpacingUseDefault = org.moe.natj.general.NatJ.is64Bit() ?
            3.4028234663852886E38 :
            (float)3.4028235E38;
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

    @Generated
    @CFunction
    public static native boolean UIAccessibilityIsVideoAutoplayEnabled();

    @Generated
    @CFunction
    public static native boolean UIAccessibilityShouldDifferentiateWithoutColor();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuApplication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuEdit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuView();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuWindow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuHelp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuAbout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuPreferences();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuServices();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuHide();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuQuit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuNewScene();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuClose();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuPrint();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuUndoRedo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuStandardEdit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFind();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuReplace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuShare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextStyle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpelling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpellingPanel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpellingOptions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutionsPanel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSubstitutionOptions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTransformations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuSpeech();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuLookup();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuLearn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFont();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuTextStylePasteboard();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuWritingDirection();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuAlignment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuToolbar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuFullscreen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuMinimizeAndZoom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuBringAllToFront();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIMenuRoot();

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

    @Generated public static final float UILayoutPriorityDragThatCanResizeScene = (float)510.0;
    @Generated public static final float UILayoutPrioritySceneSizeStayPut = (float)500.0;
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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIAccessibilitySpeechAttributeSpellOut();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UILargeContentViewerInteractionEnabledStatusDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationMetadataKeyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationMetadataKeyMessageBody();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationPreviewIntentFullSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationPreviewIntentThumbnail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIActivityItemsConfigurationInteractionShare();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextScalingDocumentAttribute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSourceTextScalingDocumentAttribute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCocoaVersionDocumentAttribute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTargetTextScalingDocumentOption();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSourceTextScalingDocumentOption();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowSceneSessionRoleApplication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UIWindowSceneSessionRoleExternalDisplay();
}

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

#import <CoreGraphics/CGBase.h>
#import <CoreGraphics/CGGeometry.h>
#import <UIKit/UIApplication.h>
#import <UIKit/UIAttachmentBehavior.h>
#import <UIKit/UIDevice.h>
#import <UIKit/UIGeometry.h>
#import <UIKit/UIPointerAccessory.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

EXPORT UIEdgeInsets __natj_inline_UIEdgeInsetsMake(CGFloat top, CGFloat left, CGFloat bottom, CGFloat right) {
	return UIEdgeInsetsMake(top, left, bottom, right);
}

EXPORT NSDirectionalEdgeInsets __natj_inline_NSDirectionalEdgeInsetsMake(CGFloat top, CGFloat leading, CGFloat bottom, CGFloat trailing) {
	return NSDirectionalEdgeInsetsMake(top, leading, bottom, trailing);
}

EXPORT CGRect __natj_inline_UIEdgeInsetsInsetRect(CGRect rect, UIEdgeInsets insets) {
	return UIEdgeInsetsInsetRect(rect, insets);
}

EXPORT UIOffset __natj_inline_UIOffsetMake(CGFloat horizontal, CGFloat vertical) {
	return UIOffsetMake(horizontal, vertical);
}

EXPORT BOOL __natj_inline_UIEdgeInsetsEqualToEdgeInsets(UIEdgeInsets insets1, UIEdgeInsets insets2) {
	return UIEdgeInsetsEqualToEdgeInsets(insets1, insets2);
}

EXPORT BOOL __natj_inline_NSDirectionalEdgeInsetsEqualToDirectionalEdgeInsets(NSDirectionalEdgeInsets insets1, NSDirectionalEdgeInsets insets2) {
	return NSDirectionalEdgeInsetsEqualToDirectionalEdgeInsets(insets1, insets2);
}

EXPORT BOOL __natj_inline_UIOffsetEqualToOffset(UIOffset offset1, UIOffset offset2) {
	return UIOffsetEqualToOffset(offset1, offset2);
}

EXPORT BOOL __natj_inline_UIDeviceOrientationIsPortrait(UIDeviceOrientation orientation) {
	return UIDeviceOrientationIsPortrait(orientation);
}

EXPORT BOOL __natj_inline_UIDeviceOrientationIsLandscape(UIDeviceOrientation orientation) {
	return UIDeviceOrientationIsLandscape(orientation);
}

EXPORT BOOL __natj_inline_UIDeviceOrientationIsFlat(UIDeviceOrientation orientation) {
	return UIDeviceOrientationIsFlat(orientation);
}

EXPORT BOOL __natj_inline_UIDeviceOrientationIsValidInterfaceOrientation(UIDeviceOrientation orientation) {
	return UIDeviceOrientationIsValidInterfaceOrientation(orientation);
}

EXPORT UIUserInterfaceIdiom __natj_inline_UI_USER_INTERFACE_IDIOM() {
	return UI_USER_INTERFACE_IDIOM();
}

EXPORT BOOL __natj_inline_UIInterfaceOrientationIsPortrait(UIInterfaceOrientation orientation) {
	return UIInterfaceOrientationIsPortrait(orientation);
}

EXPORT BOOL __natj_inline_UIInterfaceOrientationIsLandscape(UIInterfaceOrientation orientation) {
	return UIInterfaceOrientationIsLandscape(orientation);
}

EXPORT UIFloatRange __natj_inline_UIFloatRangeMake(CGFloat minimum, CGFloat maximum) {
	return UIFloatRangeMake(minimum, maximum);
}

EXPORT BOOL __natj_inline_UIFloatRangeIsEqualToRange(UIFloatRange range, UIFloatRange otherRange) {
	return UIFloatRangeIsEqualToRange(range, otherRange);
}

EXPORT UIPointerAccessoryPosition __natj_inline_UIPointerAccessoryPositionMake(CGFloat offset, CGFloat angle) {
	return UIPointerAccessoryPositionMake(offset, angle);
}



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

#import <CoreGraphics/CGAffineTransform.h>
#import <CoreGraphics/CGBase.h>
#import <CoreGraphics/CGGeometry.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT CGPoint __natj_inline_CGPointMake(CGFloat x, CGFloat y) {
	return CGPointMake(x, y);
}

EXPORT CGSize __natj_inline_CGSizeMake(CGFloat width, CGFloat height) {
	return CGSizeMake(width, height);
}

EXPORT CGVector __natj_inline_CGVectorMake(CGFloat dx, CGFloat dy) {
	return CGVectorMake(dx, dy);
}

EXPORT CGRect __natj_inline_CGRectMake(CGFloat x, CGFloat y, CGFloat width, CGFloat height) {
	return CGRectMake(x, y, width, height);
}

EXPORT _Bool __natj_inline___CGPointEqualToPoint(CGPoint point1, CGPoint point2) {
	return __CGPointEqualToPoint(point1, point2);
}

EXPORT _Bool __natj_inline___CGSizeEqualToSize(CGSize size1, CGSize size2) {
	return __CGSizeEqualToSize(size1, size2);
}

EXPORT CGAffineTransform __natj_inline___CGAffineTransformMake(CGFloat a, CGFloat b, CGFloat c, CGFloat d, CGFloat tx, CGFloat ty) {
	return __CGAffineTransformMake(a, b, c, d, tx, ty);
}

EXPORT CGPoint __natj_inline___CGPointApplyAffineTransform(CGPoint point, CGAffineTransform t) {
	return __CGPointApplyAffineTransform(point, t);
}

EXPORT CGSize __natj_inline___CGSizeApplyAffineTransform(CGSize size, CGAffineTransform t) {
	return __CGSizeApplyAffineTransform(size, t);
}



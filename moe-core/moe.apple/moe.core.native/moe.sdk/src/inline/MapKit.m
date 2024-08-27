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

#import <CoreLocation/CLLocation.h>
#import <MapKit/MKGeometry.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT MKCoordinateSpan __natj_inline_MKCoordinateSpanMake(CLLocationDegrees latitudeDelta, CLLocationDegrees longitudeDelta) {
	return MKCoordinateSpanMake(latitudeDelta, longitudeDelta);
}

EXPORT MKCoordinateRegion __natj_inline_MKCoordinateRegionMake(CLLocationCoordinate2D centerCoordinate, MKCoordinateSpan span) {
	return MKCoordinateRegionMake(centerCoordinate, span);
}

EXPORT MKMapPoint __natj_inline_MKMapPointMake(double x, double y) {
	return MKMapPointMake(x, y);
}

EXPORT MKMapSize __natj_inline_MKMapSizeMake(double width, double height) {
	return MKMapSizeMake(width, height);
}

EXPORT MKMapRect __natj_inline_MKMapRectMake(double x, double y, double width, double height) {
	return MKMapRectMake(x, y, width, height);
}

EXPORT double __natj_inline_MKMapRectGetMinX(MKMapRect rect) {
	return MKMapRectGetMinX(rect);
}

EXPORT double __natj_inline_MKMapRectGetMinY(MKMapRect rect) {
	return MKMapRectGetMinY(rect);
}

EXPORT double __natj_inline_MKMapRectGetMidX(MKMapRect rect) {
	return MKMapRectGetMidX(rect);
}

EXPORT double __natj_inline_MKMapRectGetMidY(MKMapRect rect) {
	return MKMapRectGetMidY(rect);
}

EXPORT double __natj_inline_MKMapRectGetMaxX(MKMapRect rect) {
	return MKMapRectGetMaxX(rect);
}

EXPORT double __natj_inline_MKMapRectGetMaxY(MKMapRect rect) {
	return MKMapRectGetMaxY(rect);
}

EXPORT double __natj_inline_MKMapRectGetWidth(MKMapRect rect) {
	return MKMapRectGetWidth(rect);
}

EXPORT double __natj_inline_MKMapRectGetHeight(MKMapRect rect) {
	return MKMapRectGetHeight(rect);
}

EXPORT BOOL __natj_inline_MKMapPointEqualToPoint(MKMapPoint point1, MKMapPoint point2) {
	return MKMapPointEqualToPoint(point1, point2);
}

EXPORT BOOL __natj_inline_MKMapSizeEqualToSize(MKMapSize size1, MKMapSize size2) {
	return MKMapSizeEqualToSize(size1, size2);
}

EXPORT BOOL __natj_inline_MKMapRectEqualToRect(MKMapRect rect1, MKMapRect rect2) {
	return MKMapRectEqualToRect(rect1, rect2);
}

EXPORT BOOL __natj_inline_MKMapRectIsNull(MKMapRect rect) {
	return MKMapRectIsNull(rect);
}

EXPORT BOOL __natj_inline_MKMapRectIsEmpty(MKMapRect rect) {
	return MKMapRectIsEmpty(rect);
}

EXPORT NSString * _Nonnull __natj_inline_MKStringFromMapPoint(MKMapPoint point) {
	return MKStringFromMapPoint(point);
}

EXPORT NSString * _Nonnull __natj_inline_MKStringFromMapSize(MKMapSize size) {
	return MKStringFromMapSize(size);
}

EXPORT NSString * _Nonnull __natj_inline_MKStringFromMapRect(MKMapRect rect) {
	return MKStringFromMapRect(rect);
}


